package ns.yang.nfvo.mano.types.rev170208.http.endpoints;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.inet.types.rev100924.PortNumber;
import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.HttpMethod;
import ns.yang.nfvo.mano.types.rev170208.http.endpoints.http.endpoint.Headers;

import java.lang.Boolean;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.Short;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Class that builds {@link HttpEndpoint} instances.
 * 
 * @see HttpEndpoint
 *
 */
public class HttpEndpointBuilder implements Builder<HttpEndpoint> {

    private List<Headers> _headers;
    private HttpMethod _method;
    private String _password;
    private String _path;
    private Short _pollingIntervalSecs;
    private PortNumber _port;
    private String _username;
    private Boolean _https;
    private HttpEndpointKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("http-endpoint");

    Map<Class<? extends Augmentation<HttpEndpoint>>, Augmentation<HttpEndpoint>> augmentation = Collections.emptyMap();

    public HttpEndpointBuilder() {
    }

    public HttpEndpointBuilder(HttpEndpoint base) {
        if (base.key() == null) {
            this.key = new HttpEndpointKey(
                base.getPath()
            );
            this._path = base.getPath();
        } else {
            this.key = base.key();
            this._path = key.getPath();
        }
        this._headers = base.getHeaders();
        this._method = base.getMethod();
        this._password = base.getPassword();
        this._pollingIntervalSecs = base.getPollingIntervalSecs();
        this._port = base.getPort();
        this._username = base.getUsername();
        this._https = base.isHttps();
        if (base instanceof HttpEndpointImpl) {
            HttpEndpointImpl impl = (HttpEndpointImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<HttpEndpoint> casted =(AugmentationHolder<HttpEndpoint>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public HttpEndpointKey key() {
        return key;
    }
    
    public List<Headers> getHeaders() {
        return _headers;
    }
    
    public HttpMethod getMethod() {
        return _method;
    }
    
    public String getPassword() {
        return _password;
    }
    
    public String getPath() {
        return _path;
    }
    
    public Short getPollingIntervalSecs() {
        return _pollingIntervalSecs;
    }
    
    public PortNumber getPort() {
        return _port;
    }
    
    public String getUsername() {
        return _username;
    }
    
    public Boolean isHttps() {
        return _https;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<HttpEndpoint>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public HttpEndpointBuilder withKey(final HttpEndpointKey key) {
        this.key = key;
        return this;
    }
    public HttpEndpointBuilder setHeaders(final List<Headers> values) {
        this._headers = values;
        return this;
    }
    
    
    public HttpEndpointBuilder setMethod(final HttpMethod value) {
        this._method = value;
        return this;
    }
    
    public HttpEndpointBuilder setPassword(final String value) {
        this._password = value;
        return this;
    }
    
    public HttpEndpointBuilder setPath(final String value) {
        this._path = value;
        return this;
    }
    private static void checkPollingIntervalSecsRange(final short value) {
        if (value >= (short)0 && value <= (short)255) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..255]]", value);
    }
    
    public HttpEndpointBuilder setPollingIntervalSecs(final Short value) {
    if (value != null) {
        checkPollingIntervalSecsRange(value);
        
    }
        this._pollingIntervalSecs = value;
        return this;
    }
    
    public HttpEndpointBuilder setPort(final PortNumber value) {
        this._port = value;
        return this;
    }
    
    public HttpEndpointBuilder setUsername(final String value) {
        this._username = value;
        return this;
    }
    
    public HttpEndpointBuilder setHttps(final Boolean value) {
        this._https = value;
        return this;
    }
    
    public HttpEndpointBuilder addAugmentation(Class<? extends Augmentation<HttpEndpoint>> augmentationType, Augmentation<HttpEndpoint> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public HttpEndpointBuilder removeAugmentation(Class<? extends Augmentation<HttpEndpoint>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public HttpEndpoint build() {
        return new HttpEndpointImpl(this);
    }

    private static final class HttpEndpointImpl implements HttpEndpoint {

        @Override
        public Class<HttpEndpoint> getImplementedInterface() {
            return HttpEndpoint.class;
        }

        private final List<Headers> _headers;
        private final HttpMethod _method;
        private final String _password;
        private final String _path;
        private final Short _pollingIntervalSecs;
        private final PortNumber _port;
        private final String _username;
        private final Boolean _https;
        private final HttpEndpointKey key;

        private Map<Class<? extends Augmentation<HttpEndpoint>>, Augmentation<HttpEndpoint>> augmentation = Collections.emptyMap();

        private HttpEndpointImpl(HttpEndpointBuilder base) {
            if (base.key() == null) {
                this.key = new HttpEndpointKey(
                    base.getPath()
                );
                this._path = base.getPath();
            } else {
                this.key = base.key();
                this._path = key.getPath();
            }
            this._headers = base.getHeaders();
            this._method = base.getMethod();
            this._password = base.getPassword();
            this._pollingIntervalSecs = base.getPollingIntervalSecs();
            this._port = base.getPort();
            this._username = base.getUsername();
            this._https = base.isHttps();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public HttpEndpointKey key() {
            return key;
        }
        
        @Override
        public List<Headers> getHeaders() {
            return _headers;
        }
        
        @Override
        public HttpMethod getMethod() {
            return _method;
        }
        
        @Override
        public String getPassword() {
            return _password;
        }
        
        @Override
        public String getPath() {
            return _path;
        }
        
        @Override
        public Short getPollingIntervalSecs() {
            return _pollingIntervalSecs;
        }
        
        @Override
        public PortNumber getPort() {
            return _port;
        }
        
        @Override
        public String getUsername() {
            return _username;
        }
        
        @Override
        public Boolean isHttps() {
            return _https;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<HttpEndpoint>> E augmentation(Class<E> augmentationType) {
            return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
        }

        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hashCode(_headers);
            result = prime * result + Objects.hashCode(_method);
            result = prime * result + Objects.hashCode(_password);
            result = prime * result + Objects.hashCode(_path);
            result = prime * result + Objects.hashCode(_pollingIntervalSecs);
            result = prime * result + Objects.hashCode(_port);
            result = prime * result + Objects.hashCode(_username);
            result = prime * result + Objects.hashCode(_https);
            result = prime * result + Objects.hashCode(augmentation);
        
            hash = result;
            hashValid = true;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!HttpEndpoint.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            HttpEndpoint other = (HttpEndpoint)obj;
            if (!Objects.equals(_headers, other.getHeaders())) {
                return false;
            }
            if (!Objects.equals(_method, other.getMethod())) {
                return false;
            }
            if (!Objects.equals(_password, other.getPassword())) {
                return false;
            }
            if (!Objects.equals(_path, other.getPath())) {
                return false;
            }
            if (!Objects.equals(_pollingIntervalSecs, other.getPollingIntervalSecs())) {
                return false;
            }
            if (!Objects.equals(_port, other.getPort())) {
                return false;
            }
            if (!Objects.equals(_username, other.getUsername())) {
                return false;
            }
            if (!Objects.equals(_https, other.isHttps())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                HttpEndpointImpl otherImpl = (HttpEndpointImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<HttpEndpoint>>, Augmentation<HttpEndpoint>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.augmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("HttpEndpoint");
            CodeHelpers.appendValue(helper, "_headers", _headers);
            CodeHelpers.appendValue(helper, "_method", _method);
            CodeHelpers.appendValue(helper, "_password", _password);
            CodeHelpers.appendValue(helper, "_path", _path);
            CodeHelpers.appendValue(helper, "_pollingIntervalSecs", _pollingIntervalSecs);
            CodeHelpers.appendValue(helper, "_port", _port);
            CodeHelpers.appendValue(helper, "_username", _username);
            CodeHelpers.appendValue(helper, "_https", _https);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
