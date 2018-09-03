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

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
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
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import OSM4Util.OSM4ArchiveExtractor.OSM4VNFDExtractor;
import OSM4Util.OSM4VNFReq.OSM4VNFRequirements;
import ns.yang.nfvo.nsd.rev170228.nsd.catalog.Nsd;
import ns.yang.nfvo.vnfd.rev170228.vnfd.catalog.Vnfd;

public class OSM4Client {

	//private static final Logger log = LoggerFactory.getLogger(OSM4Client.class);
	private static final Logger logger = LogManager.getLogger(OSM4Client.class);
			
	private CloseableHttpClient httpClient;
	private String manoProjectId;
	private String manoUsername;
	private String manoPassword;
    private HttpComponentsClientHttpRequestFactory requestFactory;
	private String manoApiEndpoint = null;
	private String manoAuthorizationBasicHeader = null;

	public static void main(String args[]) {
		System.out.println("Make your calls here");
		File tmp=new File("C:/EP/");
		OSM4VNFDExtractor tmp1 = new OSM4VNFDExtractor(tmp);
		OSM4VNFRequirements tmp2 = new OSM4VNFRequirements();
	}
	
	public OSM4Client(String apiEndpoint, String username, String password, String project_id) {
		this.setMANOPassword(password);
		this.setMANOUsername(username);
		this.setMANOProjectId(project_id);
		this.setMANOApiEndpoint(apiEndpoint);
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
		ResponseEntity<String> entity = restTemplate.exchange(this.getMANOApiEndpoint() + reqURL,
				HttpMethod.GET, request, String.class);
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

	public String createVNFDInstance() {
		// Create an instance of VNFD Package to fill.
		// This is accomplished by posting to "/osm/vnfpkgm/v1/vnf_packages"
		// The API returns the ID of the instance.
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		HttpHeaders headers = new HttpHeaders();
		headers.add("content-type", "application/json");
		headers.add("accept", "application/json");
		headers.add("Authorization", "Bearer " + this.getMANOAuthorizationBasicHeader());
		HttpEntity<String> request = new HttpEntity<String>(headers);
		ResponseEntity<String> entity = restTemplate.exchange(
				this.getMANOApiEndpoint() + "/osm/vnfpkgm/v1/vnf_packages", HttpMethod.POST, request,
				String.class);
		JSONObject obj = new JSONObject(entity.getBody());
		String vnfd_id = obj.getString("id");
		System.out.println("The new VNFD Instance id is :" + vnfd_id);
		return vnfd_id;
	}

	public String createNSDInstance() {
		// Create an instance of VNFD Package to fill.
		// This is accomplished by posting to "/osm/vnfpkgm/v1/vnf_packages"
		// The API returns the ID of the instance.
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		HttpHeaders headers = new HttpHeaders();
		headers.add("content-type", "application/json");
		headers.add("accept", "application/json");
		headers.add("Authorization", "Bearer " + this.getMANOAuthorizationBasicHeader());
		HttpEntity<String> request = new HttpEntity<String>(headers);
		ResponseEntity<String> entity = restTemplate.exchange(
				this.getMANOApiEndpoint() + "/osm/nsd/v1/ns_descriptors", HttpMethod.POST, request,
				String.class);
		JSONObject obj = new JSONObject(entity.getBody());
		String nsd_id = obj.getString("id");
		System.out.println("The new VNFD Instance id is :" + nsd_id);
		return nsd_id;
	}
	
	public void uploadVNFDZip(String vnfd_id, String zip_path) {
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		HttpHeaders headers = new HttpHeaders();
		headers.add("content-type", "application/zip");
		headers.add("Authorization", "Bearer " + this.getMANOAuthorizationBasicHeader());
		File file = new File(zip_path);
		try (InputStream inputStream = new FileInputStream(zip_path);) {
			long fileSize = new File(zip_path).length();

			byte[] allBytes = new byte[(int) fileSize];

			inputStream.read(allBytes);
			System.out.println("Filesize: " + fileSize + " bytes.");
			HttpEntity<byte[]> send_zip_request = new HttpEntity<>(allBytes, headers);
			ResponseEntity<String> send_zip_entity = null;
			try {
				send_zip_entity = restTemplate.exchange(this.getMANOApiEndpoint()
						+ "/osm/vnfpkgm/v1/vnf_packages/" + vnfd_id + "/package_content", HttpMethod.PUT,
						send_zip_request, String.class);
			} catch (RuntimeException e) {
				if (send_zip_entity != null) {
					if (send_zip_entity.getStatusCode().series() == HttpStatus.Series.SERVER_ERROR) {
						// handle SERVER_ERROR
						System.out.println("Server ERROR:" + send_zip_entity.getStatusCode().toString());
					} else if (send_zip_entity.getStatusCode().series() == HttpStatus.Series.CLIENT_ERROR) {
						// handle CLIENT_ERROR
						System.out.println("Client ERROR:" + send_zip_entity.getStatusCode().toString());
						if (send_zip_entity.getStatusCode() == HttpStatus.NOT_FOUND) {
							System.out.println("Unknown Response Status");
						}
					}
					System.out.println("Error! " + send_zip_entity.getBody());
				}
				else
				{
					System.out.println("Error! No response.");
				}
				return;
			}

			if (send_zip_entity.getStatusCode() == HttpStatus.NO_CONTENT) {
				System.out.println("No Content Replied!");
			}
			if (send_zip_entity.getStatusCode() == HttpStatus.CREATED) {
				System.out.println("VFND Onboarding Succeded!");
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public void uploadNSDZip(String nsd_id, String zip_path) {
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		HttpHeaders headers = new HttpHeaders();
		headers.add("content-type", "application/zip");
		headers.add("Authorization", "Bearer " + this.getMANOAuthorizationBasicHeader());
		File file = new File(zip_path);
		try (InputStream inputStream = new FileInputStream(zip_path);) {
			long fileSize = new File(zip_path).length();

			byte[] allBytes = new byte[(int) fileSize];

			inputStream.read(allBytes);
			System.out.println("Filesize: "+fileSize +" bytes");
			HttpEntity<byte[]> send_zip_request = new HttpEntity<>(allBytes, headers);
			ResponseEntity<String> send_zip_entity = null;
			try {
				send_zip_entity = restTemplate.exchange(this.getMANOApiEndpoint()
						+ "/osm/nsd/v1/ns_descriptors/" + nsd_id + "/nsd_content", HttpMethod.PUT,
						send_zip_request, String.class);
			} catch (RuntimeException e) {
				if(send_zip_entity!=null)
				{
					if (send_zip_entity.getStatusCode().series() == HttpStatus.Series.SERVER_ERROR) {
						// handle SERVER_ERROR
						System.out.println("Server ERROR:" + send_zip_entity.getStatusCode().toString());
					} else if (send_zip_entity.getStatusCode().series() == HttpStatus.Series.CLIENT_ERROR) {
						// handle CLIENT_ERROR
						System.out.println("Client ERROR:" + send_zip_entity.getStatusCode().toString());
						if (send_zip_entity.getStatusCode() == HttpStatus.NOT_FOUND) {
							System.out.println("Unknown Response Status");
						}
					}
					System.out.println("Error! " + send_zip_entity.getBody());
				}
				else
				{
					System.out.println("Error! Null Response.");
				}
				return;
			}

			if (send_zip_entity.getStatusCode() == HttpStatus.NO_CONTENT) {
				System.out.println("No Content Replied!");
			}
			if (send_zip_entity.getStatusCode() == HttpStatus.CREATED) {
				System.out.println("VFND Onboarding Succeded!");
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public void onBoardVNFD() {
		String vnfd_id = this.createVNFDInstance();
		// TODO Handle failure acquiriing a vnfd_id
		String zip_path = "./src/test/resources/temp/cirros_vnf.tar.gz";
		this.uploadVNFDZip(vnfd_id, zip_path);
	}

	public void onBoardNSD() {
		String nsd_id = this.createNSDInstance();
		// TODO Handle failure acquiriing a vnfd_id
		String zip_path = "./src/test/resources/temp/cirros_ns.tar.gz";
		this.uploadNSDZip(nsd_id, zip_path);
	}
	
	public String createNSInstance(String vim_id,String nsd_id)
	{
//		{"notificationType": "NsIdentifierCreationNotification","nsName":"mynsi","vimAccountId":"8e0929c5-4cc2-4a78-887f-d3642336e18c","nsdId":"07191481-0213-4b24-a7dd-a2e98e76803c"}
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		HttpHeaders headers = new HttpHeaders();
		headers.add("content-type", "application/json");
		headers.add("accept", "application/json");
		headers.add("Authorization", "Bearer " + this.getMANOAuthorizationBasicHeader());
			String body="{\"notificationType\": \"NsIdentifierCreationNotification\",\"nsName\":\"mynsi\",\"vimAccountId\":\""+vim_id+"\",\"nsdId\":\""+nsd_id+"\"}";
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
			System.out.println("VS Instance Creation Succeded!");
		}
		System.out.println(create_ns_instance_entity.getBody());
		JSONObject obj = new JSONObject(create_ns_instance_entity.getBody());
		String ns_instance_id = obj.getString("id");
		System.out.println("The new NS Instance id is :" + ns_instance_id);
		return ns_instance_id;
	}
	
	public void InstantiateNSInstance(String ns_instance_id) {
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		HttpHeaders headers = new HttpHeaders();
		headers.add("content-type", "application/json");
		headers.add("accept", "application/json");
		headers.add("Authorization", "Bearer " + this.getMANOAuthorizationBasicHeader());
		HttpEntity<String> request = new HttpEntity<String>(headers);
		System.out.println("/osm/nslcm/v1/ns_instances/"+ns_instance_id+"/instantiate");
		ResponseEntity<String> entity = restTemplate.exchange(
				this.getMANOApiEndpoint() + "/osm/nslcm/v1/ns_instances/"+ns_instance_id+"/instantiate", HttpMethod.POST, request,
				String.class);
		JSONObject obj = new JSONObject(entity.getBody());
		System.out.println(obj.toString());
	}	

	public void deleteNSInstance(String ns_instance_id) {
		RestTemplate restTemplate = new RestTemplate(requestFactory);
		HttpHeaders headers = new HttpHeaders();
		headers.add("content-type", "application/json");
		headers.add("accept", "application/json");
		headers.add("Authorization", "Bearer " + this.getMANOAuthorizationBasicHeader());
		HttpEntity<String> request = new HttpEntity<String>(headers);
		ResponseEntity<String> entity = restTemplate.exchange(this.getMANOApiEndpoint() + "/osm/nslcm/v1/ns_instances/"+ns_instance_id, HttpMethod.DELETE, request,String.class);
		JSONObject obj = new JSONObject(entity.getBody());
		System.out.println(obj.toString());
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
		
	public void authenticateMANO()
    {
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
        ResponseEntity<String> entity = restTemplate.exchange(this.getMANOApiEndpoint()+"/osm/admin/v1/tokens/",HttpMethod.POST, request, String.class);
        System.out.printf(entity.getHeaders().toString());
        System.out.printf(entity.getBody());
        System.out.printf(entity.toString());
       
        JSONObject obj = new JSONObject(entity.getBody());
        this.setΜΑΝΟAuthorizationBasicHeader(obj.getString("id"));
        try {
			httpClient.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
}
