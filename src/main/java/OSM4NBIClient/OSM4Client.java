/**
 * Copyright 2018 University of Patras
 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License.
 * You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and limitations under the License.
 */

/**
 * @author Ioannis Chatzis
 * 
 * Describes a MANO provider that can be accessed via an API
 *
 */

package OSM4NBIClient;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;

import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContextBuilder;
import org.json.JSONObject;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import ns.yang.nfvo.nsd.rev170228.nsd.catalog.Nsd;
import ns.yang.nfvo.vnfd.rev170228.vnfd.catalog.Vnfd;

public class OSM4Client {

	private static final Logger logger = LogManager.getLogger(OSM4Client.class);
			
	private CloseableHttpClient httpClient;
	private String manoProjectId;
	private String manoUsername;
	private String manoPassword;
    private HttpComponentsClientHttpRequestFactory requestFactory;
	private String manoApiEndpoint = null;
	private String manoAuthorizationBasicHeader = null;
	private static Double manoAuthorizationTokenTimeout = 1.0;
	private static String manoAuthorizationTokenID = null;

	public static void main(String args[]) {
		System.out.println("Make your calls here");	
	}
	
	public OSM4Client(String apiEndpoint, String username, String password, String project_id) throws HttpStatusCodeException 
	{
		this.setMANOPassword(password);
		this.setMANOUsername(username);
		this.setMANOProjectId(project_id);
		this.setMANOApiEndpoint(apiEndpoint);
		OSM4ClientInit();
	}
	
	public void closeConn()
	{
		try {
			this.requestFactory.destroy();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			this.httpClient.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void OSM4ClientInit() throws HttpStatusCodeException
	{
		this.authenticateMANO();

		// use the TrustSelfSignedStrategy to allow Self Signed Certificates
		SSLContext sslContext;
		try {
			sslContext = SSLContextBuilder.create().loadTrustMaterial(new TrustSelfSignedStrategy()).build();
			// we can optionally disable hostname verification.
			// if you don't want to further weaken the security, you don't have to include
			// this.
			HostnameVerifier allowAllHosts = new NoopHostnameVerifier();

			// create an SSL Socket Factory to use the SSLContext with the trust self signed
			// certificate strategy
			// and allow all hosts verifier.
			SSLConnectionSocketFactory connectionFactory = new SSLConnectionSocketFactory(sslContext, allowAllHosts);

			httpClient = HttpClients.custom().setSSLSocketFactory(connectionFactory)
					.setDefaultRequestConfig(RequestConfig.custom().setCookieSpec(CookieSpecs.STANDARD).build())
					.build();
			requestFactory = new HttpComponentsClientHttpRequestFactory();
			requestFactory.setHttpClient(httpClient);

		} catch (KeyManagementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (KeyStoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	public void getUsers() {
		// Make an authenticated request for users
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		HttpHeaders headers = new HttpHeaders();
		headers.add("content-type", "application/json");
		headers.add("accept", "application/json");
		headers.add("Authorization", "Bearer " + this.getMANOAuthorizationBasicHeader());
		HttpEntity<String> request = new HttpEntity<String>(headers);
		System.out.println(request.toString());
		ResponseEntity<String> entity = restTemplate.exchange(
				this.getMANOApiEndpoint() + "/osm/admin/v1/users/", HttpMethod.GET, request, String.class);
		System.out.println(entity.getHeaders().toString());
		System.out.println(entity.getBody());
		System.out.println(entity.toString());
	}

	public ResponseEntity<String> getOSMResponse(String reqURL) {
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		HttpHeaders headers = new HttpHeaders();
		headers.add("content-type", "application/json");
		headers.add("accept", "application/json");
		headers.add("Authorization", "Bearer " + this.getMANOAuthorizationBasicHeader());
		HttpEntity<String> request = new HttpEntity<String>(headers);
		ResponseEntity<String> entity = null; 
		try
		{
			entity = restTemplate.exchange(this.getMANOApiEndpoint() + reqURL,
					HttpMethod.GET, request, String.class);
	    }
    	catch (final HttpClientErrorException e) {    		
    		entity = ResponseEntity.status(e.getStatusCode()).body(e.getResponseBodyAsString());
	        System.out.println(e.getStatusCode());
	        System.out.println(e.getResponseBodyAsString());
	    }		
		return entity;
	}

	public ResponseEntity<String> getOSMDeleteResponse(String reqURL) {
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		HttpHeaders headers = new HttpHeaders();
		headers.add("content-type", "application/json");
		headers.add("accept", "application/json");
		headers.add("Authorization", "Bearer " + this.getMANOAuthorizationBasicHeader());
		HttpEntity<String> request = new HttpEntity<String>(headers);
		ResponseEntity<String> entity = restTemplate.exchange(this.getMANOApiEndpoint() + reqURL,
				HttpMethod.DELETE, request, String.class);
		return entity;
	}
	
	public void getVNFPackages() {
		ResponseEntity<String> response = this.getOSMResponse("/osm/vnfpkgm/v1/vnf_packages/");
		System.out.printf(response.getHeaders().toString());
		System.out.printf(response.getBody());
	}

	public Vnfd[] getVNFDs() {
		ResponseEntity<String> response = this.getOSMResponse("/osm/vnfpkgm/v1/vnf_packages/");
		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
		
		try {
			Vnfd[] vnfd_array = mapper.readValue(new YAMLFactory().createParser(response.getBody()), Vnfd[].class);
			return vnfd_array;
		} catch (IllegalStateException | IOException e) {
			System.out.println(response.getBody());
			logger.error(e.getMessage() );
			e.printStackTrace();
		}
		return null;
	}

	public void getNSDescriptors() {
		ResponseEntity<String> response = this.getOSMResponse("/osm/nsd/v1/ns_descriptors/");
		System.out.printf(response.getHeaders().toString());
		System.out.printf(response.getBody());
	}

	public Nsd[] getNSDs() {
		ResponseEntity<String> response = this.getOSMResponse("/osm/nsd/v1/ns_descriptors");
		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
		try {
			Nsd[] nsd_array = mapper.readValue(new YAMLFactory().createParser(response.getBody()), Nsd[].class);
			return nsd_array;

		} catch (IllegalStateException | IOException e) {
			logger.error(e.getMessage() );
			e.printStackTrace();
		}
		return null;
	}

	public ResponseEntity<String> createVNFDPackage() {
		// Create an instance of VNFD Package to fill.
		// This is accomplished by posting to "/osm/vnfpkgm/v1/vnf_packages"
		// The API returns the ID of the instance.
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		HttpHeaders headers = new HttpHeaders();
		headers.add("content-type", "application/json");
		headers.add("accept", "application/json");
		headers.add("Authorization", "Bearer " + this.getMANOAuthorizationBasicHeader());
		HttpEntity<String> request = new HttpEntity<String>(headers);
		try
		{
			return restTemplate.exchange(this.getMANOApiEndpoint() + "/osm/vnfpkgm/v1/vnf_packages", HttpMethod.POST, request, String.class);

		}
	    catch(HttpStatusCodeException e) 
		{
	        return ResponseEntity.status(e.getRawStatusCode()).headers(e.getResponseHeaders())
	                .body(e.getResponseBodyAsString());
		}		
	}

	public ResponseEntity<String> createNSDPackage() {
		// Create an instance of VNFD Package to fill.
		// This is accomplished by posting to "/osm/vnfpkgm/v1/vnf_packages"
		// The API returns the ID of the instance.
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		HttpHeaders headers = new HttpHeaders();
		headers.add("content-type", "application/json");
		headers.add("accept", "application/json");
		headers.add("Authorization", "Bearer " + this.getMANOAuthorizationBasicHeader());
		HttpEntity<String> request = new HttpEntity<String>(headers);
		try
		{
			return restTemplate.exchange(
				this.getMANOApiEndpoint() + "/osm/nsd/v1/ns_descriptors", HttpMethod.POST, request,
				String.class);
		}
	    catch(HttpStatusCodeException e) 
		{
	        return ResponseEntity.status(e.getRawStatusCode()).headers(e.getResponseHeaders())
	                .body(e.getResponseBodyAsString());
		}		
	}
	
	public ResponseEntity<String> uploadVNFDPackageContent(String vnfd_id, String package_path) throws IOException{
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		HttpHeaders headers = new HttpHeaders();
		headers.add("content-type", "application/zip");
		headers.add("Authorization", "Bearer " + this.getMANOAuthorizationBasicHeader());
		byte[] allBytes;
		try
		{		
			if(package_path.contains("http")||package_path.contains("localhost"))
			{
				URL url = new URL(package_path);
				URLConnection conn = url.openConnection();	
				int contentLength = conn.getContentLength();			
				InputStream inputStream = url.openStream();			
	
				ByteArrayOutputStream tmpOut;
			    if (contentLength != -1) {
			        tmpOut = new ByteArrayOutputStream(contentLength);
			    } else {
			        tmpOut = new ByteArrayOutputStream(16384); // Pick some appropriate size
			    }
	
			    byte[] buf = new byte[512];
			    while (true) {
			        int len = inputStream.read(buf);
			        if (len == -1) {
			            break;
			        }
			        tmpOut.write(buf, 0, len);
			    }
			    tmpOut.close(); // No effect, but good to do anyway to keep the metaphor alive
			    allBytes = tmpOut.toByteArray();			
				System.out.println("allBytes size = "+allBytes.length);		
				
				System.out.println("Filesize: " + contentLength + " bytes.");
				inputStream.close();
			}
			else
			{
				InputStream inputStream = new FileInputStream(package_path);
				long fileSize = new File(package_path).length();
				allBytes = new byte[(int) fileSize];
				inputStream.read(allBytes);
				System.out.println("Filesize: " + fileSize + " bytes.");
				inputStream.close();
			}
		}
		catch(Exception e)
		{
			logger.error(e.getMessage().toString());
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error during file loading! "+e.getMessage().toString());			
		}
		
		HttpEntity<byte[]> send_zip_request = new HttpEntity<>(allBytes, headers);
		try
		{
			return restTemplate.exchange(this.getMANOApiEndpoint()
					+ "/osm/vnfpkgm/v1/vnf_packages/" + vnfd_id + "/package_content", HttpMethod.PUT,
					send_zip_request, String.class);
		}
	    catch(HttpStatusCodeException e) 
		{
	        return ResponseEntity.status(e.getRawStatusCode()).headers(e.getResponseHeaders())
	                .body(e.getResponseBodyAsString());
		}				
	}

	public ResponseEntity<String> uploadNSDPackageContent(String nsd_id, String package_path) throws IOException{
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		HttpHeaders headers = new HttpHeaders();
		headers.add("content-type", "application/zip");
		headers.add("Authorization", "Bearer " + this.getMANOAuthorizationBasicHeader());
		byte[] allBytes;
		try
		{
			if(package_path.contains("http")||package_path.contains("localhost"))
			{
				System.out.println("This is the package path:"+package_path);
				URL url = new URL(package_path);
				URLConnection conn = url.openConnection();	
				int contentLength = conn.getContentLength();			
				InputStream inputStream = url.openStream();			
				
				ByteArrayOutputStream tmpOut;
			    if (contentLength != -1) {
			        tmpOut = new ByteArrayOutputStream(contentLength);
			    } else {
			        tmpOut = new ByteArrayOutputStream(16384); // Pick some appropriate size
			    }
	
			    byte[] buf = new byte[512];
			    while (true) {
			        int len = inputStream.read(buf);
			        if (len == -1) {
			            break;
			        }
			        tmpOut.write(buf, 0, len);
			    }
			    tmpOut.close(); // No effect, but good to do anyway to keep the metaphor alive
			    allBytes = tmpOut.toByteArray();			
				System.out.println("allBytes size = "+allBytes.length);		
				System.out.println("Filesize: " + contentLength + " bytes.");
				inputStream.close();
			}
			else
			{
				InputStream inputStream = new FileInputStream(package_path);
				long fileSize = new File(package_path).length();
				allBytes = new byte[(int) fileSize];
				inputStream.read(allBytes);
				System.out.println("Filesize: " + fileSize + " bytes.");
				inputStream.close();
			}
		}
		catch(Exception e)
		{
			logger.error(e.getMessage().toString());
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error during file loading! "+e.getMessage().toString());			
		}
		HttpEntity<byte[]> send_zip_request = new HttpEntity<>(allBytes, headers);
		try
		{
			return restTemplate.exchange(this.getMANOApiEndpoint()
					+ "/osm/nsd/v1/ns_descriptors/" + nsd_id + "/nsd_content", HttpMethod.PUT,
					send_zip_request, String.class);
		}
	    catch(HttpStatusCodeException e) 
		{
	        return ResponseEntity.status(e.getRawStatusCode()).headers(e.getResponseHeaders())
	                .body(e.getResponseBodyAsString());
		}				
	}
			
//	public void uploadNSDZip(String nsd_id, String zip`_path) {
//		RestTemplate restTemplate = new RestTemplate(requestFactory);
//		HttpHeaders headers = new HttpHeaders();
//		headers.add("content-type", "application/zip");
//		headers.add("Authorization", "Bearer " + this.getMANOAuthorizationBasicHeader());
//		//File file = new File(zip_path);
//		try (InputStream inputStream = new FileInputStream(zip_path);) {
//			long fileSize = new File(zip_path).length();
//
//			byte[] allBytes = new byte[(int) fileSize];
//
//			inputStream.read(allBytes);
//			System.out.println("Filesize: "+fileSize +" bytes");
//			HttpEntity<byte[]> send_zip_request = new HttpEntity<>(allBytes, headers);
//			ResponseEntity<String> send_zip_entity = null;
//			try {
//				send_zip_entity = restTemplate.exchange(this.getMANOApiEndpoint()
//						+ "/osm/nsd/v1/ns_descriptors/" + nsd_id + "/nsd_content", HttpMethod.PUT,
//						send_zip_request, String.class);
//			} catch (RuntimeException e) {
//				if(send_zip_entity!=null)
//				{
//					if (send_zip_entity.getStatusCode().series() == HttpStatus.Series.SERVER_ERROR) {
//						// handle SERVER_ERROR
//						System.out.println("Server ERROR:" + send_zip_entity.getStatusCode().toString());
//					} else if (send_zip_entity.getStatusCode().series() == HttpStatus.Series.CLIENT_ERROR) {
//						// handle CLIENT_ERROR
//						System.out.println("Client ERROR:" + send_zip_entity.getStatusCode().toString());
//						if (send_zip_entity.getStatusCode() == HttpStatus.NOT_FOUND) {
//							System.out.println("Unknown Response Status");
//						}
//					}
//					System.out.println("Error! " + send_zip_entity.getBody());
//				}
//				else
//				{
//					System.out.println("Error! Null Response.");
//				}
//				return;
//			}
//
//			if (send_zip_entity.getStatusCode() == HttpStatus.NO_CONTENT) {
//				System.out.println("No Content Replied!");
//			}
//			if (send_zip_entity.getStatusCode() == HttpStatus.CREATED) {
//				System.out.println("VFND Onboarding Succeded!");
//			}
//		} catch (IOException ex) {
//			ex.printStackTrace();
//		}
//	}

	// Creates an NS Instance based on vim_id and nsd_id.
	public String createNSInstance(String ns_name,String vim_id,String nsd_id)
	{
		// Response example
		//{"notificationType": "NsIdentifierCreationNotification","nsName":"mynsi","vimAccountId":"8e0929c5-4cc2-4a78-887f-d3642336e18c","nsdId":"07191481-0213-4b24-a7dd-a2e98e76803c"}
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		HttpHeaders headers = new HttpHeaders();
		headers.add("content-type", "application/json");
		headers.add("accept", "application/json");
		headers.add("Authorization", "Bearer " + this.getMANOAuthorizationBasicHeader());
			//String body="{\"notificationType\": \"NsIdentifierCreationNotification\",\"nsName\":\"mynsi\",\"vimAccountId\":\""+vim_id+"\",\"nsdId\":\""+nsd_id+"\"}";
			String body="{\"notificationType\": \"NsIdentifierCreationNotification\",\"nsName\":\""+ns_name+"\",\"vimAccountId\":\""+vim_id+"\",\"nsdId\":\""+nsd_id+"\"}";
			
			HttpEntity<String> create_ns_instance_request = new HttpEntity<>(body, headers);
			ResponseEntity<String> create_ns_instance_entity = null;
			System.out.println(create_ns_instance_request);
		try {
			create_ns_instance_entity = restTemplate.exchange(this.getMANOApiEndpoint()
					+ "/osm/nslcm/v1/ns_instances/", HttpMethod.POST,
					create_ns_instance_request, String.class);
		} catch (RuntimeException e) {
			if(create_ns_instance_entity!=null)
			{
				if (create_ns_instance_entity.getStatusCode().series() == HttpStatus.Series.SERVER_ERROR) {
					// handle SERVER_ERROR
					System.out.println("Server ERROR:" + create_ns_instance_entity.getStatusCode().toString());
				} else if (create_ns_instance_entity.getStatusCode().series() == HttpStatus.Series.CLIENT_ERROR) {
					// handle CLIENT_ERROR
					System.out.println("Client ERROR:" + create_ns_instance_entity.getStatusCode().toString());
					if (create_ns_instance_entity.getStatusCode() == HttpStatus.NOT_FOUND) {
						System.out.println("Unknown Response Status");
					}
				}
				System.out.println("Error! " + create_ns_instance_entity.getBody());
			}
			else
			{
				System.out.println("Error! Null Response");
			}
			return null;
		}

		if (create_ns_instance_entity.getStatusCode() == HttpStatus.NO_CONTENT) {
			System.out.println("No Content Replied!");
		}
		if (create_ns_instance_entity.getStatusCode() == HttpStatus.CREATED) {
			System.out.println("ΝS Instance Creation Succeded!");
		}
		System.out.println(create_ns_instance_entity.getBody());
		JSONObject obj = new JSONObject(create_ns_instance_entity.getBody());
		String ns_instance_id = obj.getString("id");
		System.out.println("The new NS Instance id is :" + ns_instance_id);
		return ns_instance_id;
	}
	
	public ResponseEntity<String>  createNSInstance2(String payload)
	{
		// Response example
		//{"notificationType": "NsIdentifierCreationNotification","nsName":"mynsi","vimAccountId":"8e0929c5-4cc2-4a78-887f-d3642336e18c","nsdId":"07191481-0213-4b24-a7dd-a2e98e76803c"}
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		HttpHeaders headers = new HttpHeaders();
		headers.add("content-type", "application/json");
		headers.add("accept", "application/json");
		headers.add("Authorization", "Bearer " + this.getMANOAuthorizationBasicHeader());
			//String body="{\"notificationType\": \"NsIdentifierCreationNotification\",\"nsName\":\"mynsi\",\"vimAccountId\":\""+vim_id+"\",\"nsdId\":\""+nsd_id+"\"}";
			String body = payload;
			
			HttpEntity<String> create_ns_instance_request = new HttpEntity<>(body, headers);
			ResponseEntity<String> create_ns_instance_entity = null;
			System.out.println(create_ns_instance_request);
		try {
			create_ns_instance_entity = restTemplate.exchange(this.getMANOApiEndpoint()
					+ "/osm/nslcm/v1/ns_instances/", HttpMethod.POST,
					create_ns_instance_request, String.class);
		} catch (RuntimeException e) {
			if(create_ns_instance_entity!=null)
			{
				if (create_ns_instance_entity.getStatusCode().series() == HttpStatus.Series.SERVER_ERROR) {
					// handle SERVER_ERROR
					System.out.println("Server ERROR:" + create_ns_instance_entity.getStatusCode().toString());
				} else if (create_ns_instance_entity.getStatusCode().series() == HttpStatus.Series.CLIENT_ERROR) {
					// handle CLIENT_ERROR
					System.out.println("Client ERROR:" + create_ns_instance_entity.getStatusCode().toString());
					if (create_ns_instance_entity.getStatusCode() == HttpStatus.NOT_FOUND) {
						System.out.println("Unknown Response Status");
					}
				}
				System.out.println("Error! " + create_ns_instance_entity.getBody());
			}
			else
			{
				System.out.println("Error! Null Response");
			}
		}

		return create_ns_instance_entity;		
	}
	
	public ResponseEntity<String> createNSInstance(String payload)
	{
		// Response example
		//{"notificationType": "NsIdentifierCreationNotification","nsName":"mynsi","vimAccountId":"8e0929c5-4cc2-4a78-887f-d3642336e18c","nsdId":"07191481-0213-4b24-a7dd-a2e98e76803c"}
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		HttpHeaders headers = new HttpHeaders();
		headers.add("content-type", "application/json");
		headers.add("accept", "application/json");
		headers.add("Authorization", "Bearer " + this.getMANOAuthorizationBasicHeader());
			//String body="{\"notificationType\": \"NsIdentifierCreationNotification\",\"nsName\":\"mynsi\",\"vimAccountId\":\""+vim_id+"\",\"nsdId\":\""+nsd_id+"\"}";
			String body = payload;
			
			HttpEntity<String> create_ns_instance_request = new HttpEntity<>(body, headers);
			System.out.println(create_ns_instance_request);
			try
			{
				return restTemplate.exchange(this.getMANOApiEndpoint()
						+ "/osm/nslcm/v1/ns_instances/", HttpMethod.POST,
						create_ns_instance_request, String.class);

			}
		    catch(HttpStatusCodeException e) 
			{
		        return ResponseEntity.status(e.getRawStatusCode()).headers(e.getResponseHeaders())
		                .body(e.getResponseBodyAsString());
			}					
	}	
	
	public JSONObject getNSInstanceInfo(String ns_instance_id)
	{
		ResponseEntity<String> ns_instance_id_info_response = this.getOSMResponse("/osm/nslcm/v1/ns_instances/"+ns_instance_id);
		logger.info("Status of Request: "+ns_instance_id_info_response.getStatusCode());
		if(!ns_instance_id_info_response.getStatusCode().is4xxClientError() && !ns_instance_id_info_response.getStatusCode().is5xxServerError() )
		{
			JSONObject ns_instance_info_obj = new JSONObject(ns_instance_id_info_response.getBody());
			return ns_instance_info_obj;		
		}
		else
			return null;
	}	

	public JSONObject getVNFInstanceInfo(String vnf_instance_id)
	{
		ResponseEntity<String> vnf_instance_id_info_response = this.getOSMResponse("/osm/nslcm/v1/vnf_instances/"+vnf_instance_id);		
		JSONObject vnf_instance_info_obj = new JSONObject(vnf_instance_id_info_response.getBody());
		return vnf_instance_info_obj;		
	}	
	
	public ResponseEntity<String> getVNFInstanceInfoNew(String vnf_instance_id)
	{
		ResponseEntity<String> vnf_instance_id_info_response = this.getOSMResponse("/osm/nslcm/v1/vnf_instances/"+vnf_instance_id);
		// We should check if we got an error response.
		// If we didn't we could do the JSON conversion in the application
		// If we did get an error response we should decide on the behavior
		try
		{
			return vnf_instance_id_info_response;
		}
	    catch(HttpStatusCodeException e) 
		{
	        return ResponseEntity.status(e.getRawStatusCode()).headers(e.getResponseHeaders())
	                .body(e.getResponseBodyAsString());
		}					
	}	
	
//	public String instantiateNSInstance(String ns_instance_id, String ns_name, String vim_id, String nsd_id) {
//		RestTemplate restTemplate = new RestTemplate(requestFactory);
//		HttpHeaders headers = new HttpHeaders();
//		headers.add("content-type", "application/json");
//		headers.add("accept", "application/json");
//		headers.add("Authorization", "Bearer " + this.getMANOAuthorizationBasicHeader());
//		HttpEntity<String> request = new HttpEntity<String>(headers);
//		System.out.println("/osm/nslcm/v1/ns_instances/"+ns_instance_id+"/instantiate");
//
//		String body="{\"nsName\":\""+ns_name+"\",\"vimAccountId\":\""+vim_id+"\",\"nsdId\":\""+nsd_id+"\"}";
//		HttpEntity<String> create_ns_instance_request = new HttpEntity<>(body, headers);
//		System.out.println(create_ns_instance_request);
//		
////		ResponseEntity<String> entity = restTemplate.exchange(
////				this.getMANOApiEndpoint() + "/osm/nslcm/v1/ns_instances/"+ns_instance_id+"/instantiate", HttpMethod.POST, request,
////				String.class);
////		JSONObject obj = new JSONObject(entity.getBody());
////		System.out.println(obj.toString());
//		
//		
//		ResponseEntity<String> instantiate_ns_instance_entity = null;
//		try {
//			instantiate_ns_instance_entity = restTemplate.exchange(
//					this.getMANOApiEndpoint() + "/osm/nslcm/v1/ns_instances/"+ns_instance_id+"/instantiate", HttpMethod.POST, create_ns_instance_request,
//					String.class);
//		} catch (RuntimeException e) {
//			if(instantiate_ns_instance_entity!=null)
//			{
//				if (instantiate_ns_instance_entity.getStatusCode().series() == HttpStatus.Series.SERVER_ERROR) {
//					// handle SERVER_ERROR
//					System.out.println("Server ERROR:" + instantiate_ns_instance_entity.getStatusCode().toString());
//				} else if (instantiate_ns_instance_entity.getStatusCode().series() == HttpStatus.Series.CLIENT_ERROR) {
//					// handle CLIENT_ERROR
//					System.out.println("Client ERROR:" + instantiate_ns_instance_entity.getStatusCode().toString());
//					if (instantiate_ns_instance_entity.getStatusCode() == HttpStatus.NOT_FOUND) {
//						System.out.println("Unknown Response Status");
//					}
//				}
//				System.out.println("Error! " + instantiate_ns_instance_entity.getBody());
//			}
//			else
//			{
//				System.out.println("Error! Null Response");
//			}
//			return null;
//		}
//
//		if (instantiate_ns_instance_entity.getStatusCode() == HttpStatus.NO_CONTENT) {
//			System.out.println("No Content Replied!");
//		}
//		if (instantiate_ns_instance_entity.getStatusCode() == HttpStatus.CREATED) {
//			System.out.println("ΝS Instanciation Succeded!");
//		}
//		System.out.println(instantiate_ns_instance_entity.getBody());
//		JSONObject obj = new JSONObject(instantiate_ns_instance_entity.getBody());
//		String nsr_id = obj.getString("id");
//		System.out.println("The NS instantiation id is :" + ns_instance_id);
//		return nsr_id;
//		
//	}	
	
	public ResponseEntity<String> instantiateNSInstance(String ns_instance_id, String payload) 
	{
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		HttpHeaders headers = new HttpHeaders();
		headers.add("content-type", "application/json");
		headers.add("accept", "application/json");
		headers.add("Authorization", "Bearer " + this.getMANOAuthorizationBasicHeader());
		System.out.println("/osm/nslcm/v1/ns_instances/"+ns_instance_id+"/instantiate");

		String body = payload;
		HttpEntity<String> create_ns_instance_request = new HttpEntity<>(body, headers);
		System.out.println(create_ns_instance_request);	
		try
		{
			return restTemplate.exchange(this.getMANOApiEndpoint() + "/osm/nslcm/v1/ns_instances/"+ns_instance_id+"/instantiate", HttpMethod.POST, create_ns_instance_request,String.class);
		}
	    catch(HttpStatusCodeException e) 
		{
	        return ResponseEntity.status(e.getRawStatusCode()).headers(e.getResponseHeaders())
	                .body(e.getResponseBodyAsString());
		}
	}
	
//	public String getNSInstanceOperationalStatus(String ns_instance_id) {
//		RestTemplate restTemplate = new RestTemplate(requestFactory);
//		HttpHeaders headers = new HttpHeaders();
//		headers.add("content-type", "application/json");
//		headers.add("accept", "application/json");
//		headers.add("Authorization", "Bearer " + this.getMANOAuthorizationBasicHeader());
//		HttpEntity<String> request = new HttpEntity<String>(headers);
//		System.out.println("/osm/nslcm/v1/ns_instances/"+ns_instance_id+"/instantiate");
//
//		ResponseEntity<String> instantiate_ns_instance_entity = null;
//		try {
//			instantiate_ns_instance_entity = restTemplate.exchange(
//					this.getMANOApiEndpoint() + "/osm/nslcm/v1/ns_instances/"+ns_instance_id, HttpMethod.GET, request,
//					String.class);
//		} catch (RuntimeException e) {
//			if(instantiate_ns_instance_entity!=null)
//			{
//				if (instantiate_ns_instance_entity.getStatusCode().series() == HttpStatus.Series.SERVER_ERROR) {
//					// handle SERVER_ERROR
//					System.out.println("Server ERROR:" + instantiate_ns_instance_entity.getStatusCode().toString());
//				} else if (instantiate_ns_instance_entity.getStatusCode().series() == HttpStatus.Series.CLIENT_ERROR) {
//					// handle CLIENT_ERROR
//					System.out.println("Client ERROR:" + instantiate_ns_instance_entity.getStatusCode().toString());
//					if (instantiate_ns_instance_entity.getStatusCode() == HttpStatus.NOT_FOUND) {
//						System.out.println("Unknown Response Status");
//					}
//				}
//				System.out.println("Error! " + instantiate_ns_instance_entity.getBody());
//			}
//			else
//			{
//				System.out.println("Error! Null Response");
//			}
//			return null;
//		}
//
//		if (instantiate_ns_instance_entity.getStatusCode() == HttpStatus.NO_CONTENT) {
//			System.out.println("No Content Replied!");
//		}
//		if (instantiate_ns_instance_entity.getStatusCode() == HttpStatus.CREATED) {
//			System.out.println("ΝS Instanciation Succeded!");
//		}
//		System.out.println(instantiate_ns_instance_entity.getBody());
//		JSONObject obj = new JSONObject(instantiate_ns_instance_entity.getBody());
//		String operational_status = obj.getString("operational-status");
//		System.out.println("The NS instantiation id is :" + ns_instance_id);
//		return operational_status;		
//	}	
	
	public String terminateNSInstance(String ns_instance_id) {
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		HttpHeaders headers = new HttpHeaders();
		headers.add("content-type", "application/json");
		headers.add("accept", "application/json");
		headers.add("Authorization", "Bearer " + this.getMANOAuthorizationBasicHeader());
		HttpEntity<String> request = new HttpEntity<String>(headers);
		System.out.println("/osm/nslcm/v1/ns_instances/"+ns_instance_id+"/terminate");
	
		ResponseEntity<String> terminate_ns_instance_entity = null;
		try {
			terminate_ns_instance_entity = restTemplate.exchange(
					this.getMANOApiEndpoint() + "/osm/nslcm/v1/ns_instances/"+ns_instance_id+"/terminate", HttpMethod.POST, request,
					String.class);
		} catch (RuntimeException e) {
			if(terminate_ns_instance_entity!=null)
			{
				if (terminate_ns_instance_entity.getStatusCode().series() == HttpStatus.Series.SERVER_ERROR) {
					// handle SERVER_ERROR
					System.out.println("Server ERROR:" + terminate_ns_instance_entity.getStatusCode().toString());
				} else if (terminate_ns_instance_entity.getStatusCode().series() == HttpStatus.Series.CLIENT_ERROR) {
					// handle CLIENT_ERROR
					System.out.println("Client ERROR:" + terminate_ns_instance_entity.getStatusCode().toString());
					if (terminate_ns_instance_entity.getStatusCode() == HttpStatus.NOT_FOUND) {
						System.out.println("Unknown Response Status");
					}
				}
				System.out.println("Error! " + terminate_ns_instance_entity.getBody());
			}
			else
			{
				System.out.println("Error! Null Response");
			}
			return null;
		}

		if (terminate_ns_instance_entity.getStatusCode() == HttpStatus.NO_CONTENT) {
			System.out.println("No Content Replied!");
		}
		if (terminate_ns_instance_entity.getStatusCode() == HttpStatus.CREATED) {
			System.out.println("ΝS Termination Succeded!");
		}
		System.out.println(terminate_ns_instance_entity.getBody());
		JSONObject obj = new JSONObject(terminate_ns_instance_entity.getBody());
		String ns_instanciation_id = obj.getString("id");
		System.out.println("The NS termination id is :" + ns_instanciation_id);
		return ns_instanciation_id;
		
	}	
	
	public ResponseEntity<String> terminateNSInstanceNew(String ns_instance_id) {
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		HttpHeaders headers = new HttpHeaders();
		headers.add("content-type", "application/json");
		headers.add("accept", "application/json");
		headers.add("Authorization", "Bearer " + this.getMANOAuthorizationBasicHeader());
		HttpEntity<String> request = new HttpEntity<String>(headers);
		System.out.println("/osm/nslcm/v1/ns_instances/"+ns_instance_id+"/terminate");	
		try {
			return restTemplate.exchange(this.getMANOApiEndpoint() + "/osm/nslcm/v1/ns_instances/"+ns_instance_id+"/terminate", HttpMethod.POST, request, String.class);
		}
		catch(HttpStatusCodeException e) 
		{
	        return ResponseEntity.status(e.getRawStatusCode()).headers(e.getResponseHeaders()).body(e.getResponseBodyAsString());
		}
	}
	
	public ResponseEntity<String> deleteNSInstance(String ns_instance_id) {
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		HttpHeaders headers = new HttpHeaders();
		headers.add("content-type", "application/json");
		headers.add("accept", "application/json");
		headers.add("Authorization", "Bearer " + this.getMANOAuthorizationBasicHeader());
		HttpEntity<String> request = new HttpEntity<String>(headers);	
		ResponseEntity<String> delete_ns_instance_entity = null;
		delete_ns_instance_entity = restTemplate.exchange(this.getMANOApiEndpoint() + "/osm/nslcm/v1/ns_instances/"+ns_instance_id, HttpMethod.DELETE, request, String.class);
		if(delete_ns_instance_entity != null)
		{
			if (delete_ns_instance_entity.getStatusCode().series() == HttpStatus.Series.SERVER_ERROR) {
				// handle SERVER_ERROR
				System.out.println("Server ERROR:" + delete_ns_instance_entity.getStatusCode().toString());
			} else if (delete_ns_instance_entity.getStatusCode().series() == HttpStatus.Series.CLIENT_ERROR) {
				// handle CLIENT_ERROR
				System.out.println("Client ERROR:" + delete_ns_instance_entity.getStatusCode().toString());
				if (delete_ns_instance_entity.getStatusCode() == HttpStatus.NOT_FOUND) {
					System.out.println("Unknown Response Status");
				}
			}
			System.out.println("Error! " + delete_ns_instance_entity.getBody());
		}
		else
		{
			System.out.println("Error! Null Response");
		}

		if (delete_ns_instance_entity.getStatusCode() == HttpStatus.NO_CONTENT) {
			System.out.println("No Content Replied!");
		}
		if (delete_ns_instance_entity.getStatusCode() == HttpStatus.CREATED) {
			System.out.println("ΝS Deletion Succeded!");
		}
		System.out.println("The NS instance deletion response is :"+delete_ns_instance_entity.getBody());
		return delete_ns_instance_entity;		
	}	

	public ResponseEntity<String> deleteNSInstanceNew(String ns_instance_id, boolean force) {
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		HttpHeaders headers = new HttpHeaders();
		headers.add("content-type", "application/json");
		headers.add("accept", "application/json");
		headers.add("Authorization", "Bearer " + this.getMANOAuthorizationBasicHeader());
		HttpEntity<String> request = new HttpEntity<String>(headers);	
		try {
			if(force)
			{
				return restTemplate.exchange(this.getMANOApiEndpoint() + "/osm/nslcm/v1/ns_instances/"+ns_instance_id+"?FORCE=TRUE", HttpMethod.DELETE, request, String.class);
			}
			else
			{
				return restTemplate.exchange(this.getMANOApiEndpoint() + "/osm/nslcm/v1/ns_instances/"+ns_instance_id, HttpMethod.DELETE, request, String.class);				
			}
		}
		catch(HttpStatusCodeException e) 
		{
	        return ResponseEntity.status(e.getRawStatusCode()).headers(e.getResponseHeaders()).body(e.getResponseBodyAsString());
		}
	}	
	
	public Vnfd getVNFDbyID(String aVNFDid)
	{
		System.out.println("/osm/vnfpkgm/v1/vnf_packages/"+aVNFDid);
		ResponseEntity<String> response = this.getOSMResponse("/osm/vnfpkgm/v1/vnf_packages/"+aVNFDid);
		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
		try {
			Vnfd vnfd = mapper.readValue(new YAMLFactory().createParser(response.getBody()), Vnfd.class);
			return vnfd;
		} catch (IllegalStateException | IOException e) {
//			logger.error(e.getMessage() );
			e.printStackTrace();
		}
		return null;	
	}
	
	public Nsd getNSDbyID(String aNSDid)
	{
		System.out.println("/osm/nsd/v1/ns_descriptors/"+aNSDid);
		ResponseEntity<String> response = this.getOSMResponse("/osm/nsd/v1/ns_descriptors/"+aNSDid);
		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
		try {
			Nsd nsd = mapper.readValue(new YAMLFactory().createParser(response.getBody()), Nsd.class);
			System.out.println(nsd.toString());
			return nsd;
		} catch (IllegalStateException | IOException e) {
			logger.error(e.getMessage() );
			e.printStackTrace();
		}
		return null;			
	}
	
	public void deleteVNFDbyID(String aVNFDid)
	{
		System.out.println("/osm/vnfpkgm/v1/vnf_packages/"+aVNFDid);
		ResponseEntity<String> response = this.getOSMDeleteResponse("/osm/vnfpkgm/v1/vnf_packages/"+aVNFDid);
		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
		try {
			Vnfd vnfd = mapper.readValue(new YAMLFactory().createParser(response.getBody()), Vnfd.class);
		} catch (IllegalStateException | IOException e) {
			logger.error(e.getMessage() );
			e.printStackTrace();
		}
	}

	public ResponseEntity<String> deleteVNFDPackage(String vnfd_id) throws HttpClientErrorException {
		// Create an instance of VNFD Package to fill.
		// This is accomplished by posting to "/osm/vnfpkgm/v1/vnf_packages"
		// The API returns the ID of the instance.
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		HttpHeaders headers = new HttpHeaders();
		headers.add("content-type", "application/json");
		headers.add("accept", "application/json");
		headers.add("Authorization", "Bearer " + this.getMANOAuthorizationBasicHeader());
		HttpEntity<String> request = new HttpEntity<String>(headers);
		ResponseEntity<String> entity = null;
		entity = restTemplate.exchange(
		this.getMANOApiEndpoint() + "/osm/vnfpkgm/v1/vnf_packages/"+vnfd_id, HttpMethod.DELETE, request,String.class);
		System.out.println("The delete VNFD Package with id "+vnfd_id+" returned code :" + entity.getStatusCodeValue());
		return entity;
	}
	
	public void deleteNSDbyID(String aNSDid)
	{
		System.out.println("/osm/nsd/v1/ns_descriptors/"+aNSDid);
		ResponseEntity<String> response = this.getOSMDeleteResponse("/osm/nsd/v1/ns_descriptors/"+aNSDid);
		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
		try {
			Nsd nsd = mapper.readValue(new YAMLFactory().createParser(response.getBody()), Nsd.class);
		} catch (IllegalStateException | IOException e) {
			logger.error(e.getMessage() );
			e.printStackTrace();
		}
	}

	public ResponseEntity<String> deleteNSDPackage(String nsd_id) {
		// Create an instance of NSD Package to fill.
		// This is accomplished by posting to "/osm/nsd/v1/ns_descriptors/"
		// The API returns the ID of the instance.
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		HttpHeaders headers = new HttpHeaders();
		headers.add("content-type", "application/json");
		headers.add("accept", "application/json");
		headers.add("Authorization", "Bearer " + this.getMANOAuthorizationBasicHeader());
		HttpEntity<String> request = new HttpEntity<String>(headers);
		ResponseEntity<String> entity = restTemplate.exchange(
				this.getMANOApiEndpoint() + "/osm/nsd/v1/ns_descriptors/"+nsd_id, HttpMethod.DELETE, request,
				String.class);
		System.out.println("The delete NSD Package with id "+nsd_id+" returned code :" + entity.getStatusCode().toString());
		return entity;
	}
	
	public void authenticateMANO() throws HttpStatusCodeException
    {
//		if(OSM4Client.getManoAuthorizationTokenTimeout()>Instant.now().getEpochSecond()+120)
//		{
//	        System.out.println(OSM4Client.getManoAuthorizationTokenTimeout()+">"+Instant.now().getEpochSecond()+"+120");
//	        this.setΜΑΝΟAuthorizationBasicHeader(OSM4Client.getManoAuthorizationTokenID());	
//	        System.out.println("Valid Key, skipping new authentication");
//	        return;
//		}
			
        // use the TrustSelfSignedStrategy to allow Self Signed Certificates
        SSLContext sslContext;
		try {
			sslContext = SSLContextBuilder
			        .create()
			        .loadTrustMaterial(new TrustSelfSignedStrategy())
			        .build();
	        // we can optionally disable hostname verification.
	        // if you don't want to further weaken the security, you don't have to include this.
	        HostnameVerifier allowAllHosts = new NoopHostnameVerifier();
	        
	        // create an SSL Socket Factory to use the SSLContext with the trust self signed certificate strategy
	        // and allow all hosts verifier.
	        SSLConnectionSocketFactory connectionFactory = new SSLConnectionSocketFactory(sslContext, allowAllHosts);
        
	        httpClient = HttpClients.custom().setSSLSocketFactory(connectionFactory).setDefaultRequestConfig(RequestConfig.custom().setCookieSpec(CookieSpecs.STANDARD).build()).build();
	        requestFactory = new HttpComponentsClientHttpRequestFactory();            
	        
	        // Get the token
	        requestFactory.setHttpClient(httpClient);
		} catch (KeyManagementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (KeyStoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}                    				
		
        RestTemplate restTemplate = new RestTemplate(requestFactory);        
        HttpHeaders headers = new HttpHeaders();
        headers.add("content-type", "application/json");
        headers.add("accept", "application/json");
        String body = "{\"password\": \"" + this.getMANOPassword() + "\", \"username\": \"" + this.getMANOUsername() + "\", \"project_id\": \"" + this.getMANOProjectId() + "\"}";
        HttpEntity<String> request = new HttpEntity<String>(body, headers);            
        System.out.println(request.toString());
        ResponseEntity<String> entity = null;
    	entity = restTemplate.exchange(this.getMANOApiEndpoint()+"/osm/admin/v1/tokens/",HttpMethod.POST, request, String.class);        
        System.out.printf(entity.getHeaders().toString());
        System.out.printf(entity.getBody());
        System.out.printf(entity.toString());
       
        JSONObject obj = new JSONObject(entity.getBody());
        this.setΜΑΝΟAuthorizationBasicHeader(obj.getString("id"));
        OSM4Client.setManoAuthorizationTokenTimeout(obj.getDouble("expires"));
        OSM4Client.setManoAuthorizationTokenID(obj.getString("id"));
        try {
			httpClient.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }


	private static String getManoAuthorizationTokenID() {
		// TODO Auto-generated method stub
		return OSM4Client.manoAuthorizationTokenID;
	}

	private static void setManoAuthorizationTokenID(String tokenID) {
		// TODO Auto-generated method stub
		OSM4Client.manoAuthorizationTokenID=tokenID;		
	}

	public String getMANOApiEndpoint() {
		return manoApiEndpoint;
	}


	public void setMANOApiEndpoint(String apiEndpoint) {
		this.manoApiEndpoint = apiEndpoint;
	}
	
	/**
	 * @return the project_id
	 */
	public String getMANOProjectId() {
		return manoProjectId;
	}


	/**
	 * @param project_id the project_id to set
	 */
	public void setMANOProjectId(String project_id) {
		this.manoProjectId = project_id;
	}


	/**
	 * @return the username
	 */
	private String getMANOUsername() {
		return manoUsername;
	}


	/**
	 * @param username the username to set
	 */
	public void setMANOUsername(String username) {
		this.manoUsername = username;
	}


	/**
	 * @return the password
	 */
	private String getMANOPassword() {
		return manoPassword;
	}


	/**
	 * @param password the password to set
	 */
	public void setMANOPassword(String password) {
		this.manoPassword = password;
	}
	
	public String getMANOAuthorizationBasicHeader() {
		return manoAuthorizationBasicHeader;
	}


	public void setΜΑΝΟAuthorizationBasicHeader(String authorizationBasicHeader) {
		this.manoAuthorizationBasicHeader = authorizationBasicHeader;
	}

	/**
	 * @return the manoAuthorizationTokenTimeout
	 */
	public static Double getManoAuthorizationTokenTimeout() {
		return manoAuthorizationTokenTimeout;
	}

	/**
	 * @param manoAuthorizationTokenTimeout the manoAuthorizationTokenTimeout to set
	 */
	public static void setManoAuthorizationTokenTimeout(double manoAuthorizationTokenTimeout) {
		OSM4Client.manoAuthorizationTokenTimeout = manoAuthorizationTokenTimeout;
	}	
}
