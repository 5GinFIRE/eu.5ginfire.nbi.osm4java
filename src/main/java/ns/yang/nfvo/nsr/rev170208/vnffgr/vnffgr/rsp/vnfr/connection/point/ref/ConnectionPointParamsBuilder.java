package ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.inet.types.rev100924.IpAddress;
import ns.yang.ietf.inet.types.rev100924.PortNumber;
import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Class that builds {@link ConnectionPointParams} instances.
 * 
 * @see ConnectionPointParams
 *
 */
public class ConnectionPointParamsBuilder implements Builder<ConnectionPointParams> {

    private IpAddress _address;
    private IpAddress _mgmtAddress;
    private String _name;
    private PortNumber _port;
    private String _portId;
    private String _vmId;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("connection-point-params");

    Map<Class<? extends Augmentation<ConnectionPointParams>>, Augmentation<ConnectionPointParams>> augmentation = Collections.emptyMap();

    public ConnectionPointParamsBuilder() {
    }

    public ConnectionPointParamsBuilder(ConnectionPointParams base) {
        this._address = base.getAddress();
        this._mgmtAddress = base.getMgmtAddress();
        this._name = base.getName();
        this._port = base.getPort();
        this._portId = base.getPortId();
        this._vmId = base.getVmId();
        if (base instanceof ConnectionPointParamsImpl) {
            ConnectionPointParamsImpl impl = (ConnectionPointParamsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ConnectionPointParams> casted =(AugmentationHolder<ConnectionPointParams>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public IpAddress getAddress() {
        return _address;
    }
    
    public IpAddress getMgmtAddress() {
        return _mgmtAddress;
    }
    
    public String getName() {
        return _name;
    }
    
    public PortNumber getPort() {
        return _port;
    }
    
    public String getPortId() {
        return _portId;
    }
    
    public String getVmId() {
        return _vmId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ConnectionPointParams>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public ConnectionPointParamsBuilder setAddress(final IpAddress value) {
        this._address = value;
        return this;
    }
    
    public ConnectionPointParamsBuilder setMgmtAddress(final IpAddress value) {
        this._mgmtAddress = value;
        return this;
    }
    
    public ConnectionPointParamsBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public ConnectionPointParamsBuilder setPort(final PortNumber value) {
        this._port = value;
        return this;
    }
    
    public ConnectionPointParamsBuilder setPortId(final String value) {
        this._portId = value;
        return this;
    }
    
    public ConnectionPointParamsBuilder setVmId(final String value) {
        this._vmId = value;
        return this;
    }
    
    public ConnectionPointParamsBuilder addAugmentation(Class<? extends Augmentation<ConnectionPointParams>> augmentationType, Augmentation<ConnectionPointParams> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ConnectionPointParamsBuilder removeAugmentation(Class<? extends Augmentation<ConnectionPointParams>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ConnectionPointParams build() {
        return new ConnectionPointParamsImpl(this);
    }

    private static final class ConnectionPointParamsImpl implements ConnectionPointParams {

        @Override
        public Class<ConnectionPointParams> getImplementedInterface() {
            return ConnectionPointParams.class;
        }

        private final IpAddress _address;
        private final IpAddress _mgmtAddress;
        private final String _name;
        private final PortNumber _port;
        private final String _portId;
        private final String _vmId;

        private Map<Class<? extends Augmentation<ConnectionPointParams>>, Augmentation<ConnectionPointParams>> augmentation = Collections.emptyMap();

        private ConnectionPointParamsImpl(ConnectionPointParamsBuilder base) {
            this._address = base.getAddress();
            this._mgmtAddress = base.getMgmtAddress();
            this._name = base.getName();
            this._port = base.getPort();
            this._portId = base.getPortId();
            this._vmId = base.getVmId();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public IpAddress getAddress() {
            return _address;
        }
        
        @Override
        public IpAddress getMgmtAddress() {
            return _mgmtAddress;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public PortNumber getPort() {
            return _port;
        }
        
        @Override
        public String getPortId() {
            return _portId;
        }
        
        @Override
        public String getVmId() {
            return _vmId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ConnectionPointParams>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_address);
            result = prime * result + Objects.hashCode(_mgmtAddress);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_port);
            result = prime * result + Objects.hashCode(_portId);
            result = prime * result + Objects.hashCode(_vmId);
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
            if (!ConnectionPointParams.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ConnectionPointParams other = (ConnectionPointParams)obj;
            if (!Objects.equals(_address, other.getAddress())) {
                return false;
            }
            if (!Objects.equals(_mgmtAddress, other.getMgmtAddress())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_port, other.getPort())) {
                return false;
            }
            if (!Objects.equals(_portId, other.getPortId())) {
                return false;
            }
            if (!Objects.equals(_vmId, other.getVmId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ConnectionPointParamsImpl otherImpl = (ConnectionPointParamsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ConnectionPointParams>>, Augmentation<ConnectionPointParams>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ConnectionPointParams");
            CodeHelpers.appendValue(helper, "_address", _address);
            CodeHelpers.appendValue(helper, "_mgmtAddress", _mgmtAddress);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_port", _port);
            CodeHelpers.appendValue(helper, "_portId", _portId);
            CodeHelpers.appendValue(helper, "_vmId", _vmId);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
