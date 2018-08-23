package ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.inet.types.rev100924.IpAddress;
import ns.yang.ietf.yang.types.rev130715.Uuid;
import ns.yang.nfvo.mano.types.rev170208.ConnectionPointType;
import ns.yang.nfvo.vnfr.rev170228.$YangModuleInfoImpl;
import ns.yang.nfvo.vnfr.rev170228.associated.virtual.cps.VirtualCps;

import java.lang.Boolean;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
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
 * Class that builds {@link ConnectionPoint} instances.
 * 
 * @see ConnectionPoint
 *
 */
public class ConnectionPointBuilder implements Builder<ConnectionPoint> {

    private String _connectionPointId;
    private String _id;
    private IpAddress _ipAddress;
    private String _macAddress;
    private String _name;
    private String _shortName;
    private ConnectionPointType _type;
    private List<VirtualCps> _virtualCps;
    private Uuid _vlrRef;
    private Boolean _portSecurityEnabled;
    private ConnectionPointKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("connection-point");

    Map<Class<? extends Augmentation<ConnectionPoint>>, Augmentation<ConnectionPoint>> augmentation = Collections.emptyMap();

    public ConnectionPointBuilder() {
    }
    public ConnectionPointBuilder(yang.vnfd.CommonConnectionPoint arg) {
        this._name = arg.getName();
        this._id = arg.getId();
        this._shortName = arg.getShortName();
        this._type = arg.getType();
        this._portSecurityEnabled = arg.isPortSecurityEnabled();
    }
    public ConnectionPointBuilder(ns.yang.nfvo.vnfr.rev170228.AssociatedVirtualCps arg) {
        this._virtualCps = arg.getVirtualCps();
    }

    public ConnectionPointBuilder(ConnectionPoint base) {
        if (base.key() == null) {
            this.key = new ConnectionPointKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this.key = base.key();
            this._name = key.getName();
        }
        this._connectionPointId = base.getConnectionPointId();
        this._id = base.getId();
        this._ipAddress = base.getIpAddress();
        this._macAddress = base.getMacAddress();
        this._shortName = base.getShortName();
        this._type = base.getType();
        this._virtualCps = base.getVirtualCps();
        this._vlrRef = base.getVlrRef();
        this._portSecurityEnabled = base.isPortSecurityEnabled();
        if (base instanceof ConnectionPointImpl) {
            ConnectionPointImpl impl = (ConnectionPointImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ConnectionPoint> casted =(AugmentationHolder<ConnectionPoint>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.AssociatedVirtualCps</li>
     * <li>model.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.CommonConnectionPoint</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ns.yang.nfvo.vnfr.rev170228.AssociatedVirtualCps) {
            this._virtualCps = ((ns.yang.nfvo.vnfr.rev170228.AssociatedVirtualCps)arg).getVirtualCps();
            isValidArg = true;
        }
        if (arg instanceof yang.vnfd.CommonConnectionPoint) {
            this._name = ((yang.vnfd.CommonConnectionPoint)arg).getName();
            this._id = ((yang.vnfd.CommonConnectionPoint)arg).getId();
            this._shortName = ((yang.vnfd.CommonConnectionPoint)arg).getShortName();
            this._type = ((yang.vnfd.CommonConnectionPoint)arg).getType();
            this._portSecurityEnabled = ((yang.vnfd.CommonConnectionPoint)arg).isPortSecurityEnabled();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[model.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.AssociatedVirtualCps, model.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.CommonConnectionPoint]");
    }

    public ConnectionPointKey key() {
        return key;
    }
    
    public String getConnectionPointId() {
        return _connectionPointId;
    }
    
    public String getId() {
        return _id;
    }
    
    public IpAddress getIpAddress() {
        return _ipAddress;
    }
    
    public String getMacAddress() {
        return _macAddress;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getShortName() {
        return _shortName;
    }
    
    public ConnectionPointType getType() {
        return _type;
    }
    
    public List<VirtualCps> getVirtualCps() {
        return _virtualCps;
    }
    
    public Uuid getVlrRef() {
        return _vlrRef;
    }
    
    public Boolean isPortSecurityEnabled() {
        return _portSecurityEnabled;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ConnectionPoint>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public ConnectionPointBuilder withKey(final ConnectionPointKey key) {
        this.key = key;
        return this;
    }
    
    public ConnectionPointBuilder setConnectionPointId(final String value) {
        this._connectionPointId = value;
        return this;
    }
    
    public ConnectionPointBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public ConnectionPointBuilder setIpAddress(final IpAddress value) {
        this._ipAddress = value;
        return this;
    }
    
    public ConnectionPointBuilder setMacAddress(final String value) {
        this._macAddress = value;
        return this;
    }
    
    public ConnectionPointBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public ConnectionPointBuilder setShortName(final String value) {
        this._shortName = value;
        return this;
    }
    
    public ConnectionPointBuilder setType(final ConnectionPointType value) {
        this._type = value;
        return this;
    }
    public ConnectionPointBuilder setVirtualCps(final List<VirtualCps> values) {
        this._virtualCps = values;
        return this;
    }
    
    
    public ConnectionPointBuilder setVlrRef(final Uuid value) {
        this._vlrRef = value;
        return this;
    }
    
    public ConnectionPointBuilder setPortSecurityEnabled(final Boolean value) {
        this._portSecurityEnabled = value;
        return this;
    }
    
    public ConnectionPointBuilder addAugmentation(Class<? extends Augmentation<ConnectionPoint>> augmentationType, Augmentation<ConnectionPoint> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ConnectionPointBuilder removeAugmentation(Class<? extends Augmentation<ConnectionPoint>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ConnectionPoint build() {
        return new ConnectionPointImpl(this);
    }

    private static final class ConnectionPointImpl implements ConnectionPoint {

        @Override
        public Class<ConnectionPoint> getImplementedInterface() {
            return ConnectionPoint.class;
        }

        private final String _connectionPointId;
        private final String _id;
        private final IpAddress _ipAddress;
        private final String _macAddress;
        private final String _name;
        private final String _shortName;
        private final ConnectionPointType _type;
        private final List<VirtualCps> _virtualCps;
        private final Uuid _vlrRef;
        private final Boolean _portSecurityEnabled;
        private final ConnectionPointKey key;

        private Map<Class<? extends Augmentation<ConnectionPoint>>, Augmentation<ConnectionPoint>> augmentation = Collections.emptyMap();

        private ConnectionPointImpl(ConnectionPointBuilder base) {
            if (base.key() == null) {
                this.key = new ConnectionPointKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this.key = base.key();
                this._name = key.getName();
            }
            this._connectionPointId = base.getConnectionPointId();
            this._id = base.getId();
            this._ipAddress = base.getIpAddress();
            this._macAddress = base.getMacAddress();
            this._shortName = base.getShortName();
            this._type = base.getType();
            this._virtualCps = base.getVirtualCps();
            this._vlrRef = base.getVlrRef();
            this._portSecurityEnabled = base.isPortSecurityEnabled();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public ConnectionPointKey key() {
            return key;
        }
        
        @Override
        public String getConnectionPointId() {
            return _connectionPointId;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public IpAddress getIpAddress() {
            return _ipAddress;
        }
        
        @Override
        public String getMacAddress() {
            return _macAddress;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public String getShortName() {
            return _shortName;
        }
        
        @Override
        public ConnectionPointType getType() {
            return _type;
        }
        
        @Override
        public List<VirtualCps> getVirtualCps() {
            return _virtualCps;
        }
        
        @Override
        public Uuid getVlrRef() {
            return _vlrRef;
        }
        
        @Override
        public Boolean isPortSecurityEnabled() {
            return _portSecurityEnabled;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ConnectionPoint>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_connectionPointId);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_ipAddress);
            result = prime * result + Objects.hashCode(_macAddress);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_shortName);
            result = prime * result + Objects.hashCode(_type);
            result = prime * result + Objects.hashCode(_virtualCps);
            result = prime * result + Objects.hashCode(_vlrRef);
            result = prime * result + Objects.hashCode(_portSecurityEnabled);
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
            if (!ConnectionPoint.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ConnectionPoint other = (ConnectionPoint)obj;
            if (!Objects.equals(_connectionPointId, other.getConnectionPointId())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_ipAddress, other.getIpAddress())) {
                return false;
            }
            if (!Objects.equals(_macAddress, other.getMacAddress())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_shortName, other.getShortName())) {
                return false;
            }
            if (!Objects.equals(_type, other.getType())) {
                return false;
            }
            if (!Objects.equals(_virtualCps, other.getVirtualCps())) {
                return false;
            }
            if (!Objects.equals(_vlrRef, other.getVlrRef())) {
                return false;
            }
            if (!Objects.equals(_portSecurityEnabled, other.isPortSecurityEnabled())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ConnectionPointImpl otherImpl = (ConnectionPointImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ConnectionPoint>>, Augmentation<ConnectionPoint>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ConnectionPoint");
            CodeHelpers.appendValue(helper, "_connectionPointId", _connectionPointId);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_ipAddress", _ipAddress);
            CodeHelpers.appendValue(helper, "_macAddress", _macAddress);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_shortName", _shortName);
            CodeHelpers.appendValue(helper, "_type", _type);
            CodeHelpers.appendValue(helper, "_virtualCps", _virtualCps);
            CodeHelpers.appendValue(helper, "_vlrRef", _vlrRef);
            CodeHelpers.appendValue(helper, "_portSecurityEnabled", _portSecurityEnabled);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
