package yang.vnfd.vnfd.descriptor.vdu;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import yang.vnfd.$YangModuleInfoImpl;
import yang.vnfd.InterfaceType;
import yang.vnfd.virtual._interface.VirtualInterface;
import yang.vnfd.vnfd.descriptor.vdu._interface.ConnectionPointType;

import java.lang.Boolean;
import java.lang.Class;
import java.lang.Long;
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
 * Class that builds {@link Interface} instances.
 * 
 * @see Interface
 *
 */
public class InterfaceBuilder implements Builder<Interface> {

    private ConnectionPointType _connectionPointType;
    private String _macAddress;
    private String _name;
    private Long _position;
    private InterfaceType _type;
    private VirtualInterface _virtualInterface;
    private Boolean _mgmtInterface;
    private InterfaceKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("interface");

    Map<Class<? extends Augmentation<Interface>>, Augmentation<Interface>> augmentation = Collections.emptyMap();

    public InterfaceBuilder() {
    }
    public InterfaceBuilder(yang.vnfd.VirtualInterface arg) {
        this._virtualInterface = arg.getVirtualInterface();
    }

    public InterfaceBuilder(Interface base) {
        if (base.key() == null) {
            this.key = new InterfaceKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this.key = base.key();
            this._name = key.getName();
        }
        this._connectionPointType = base.getConnectionPointType();
        this._macAddress = base.getMacAddress();
        this._position = base.getPosition();
        this._type = base.getType();
        this._virtualInterface = base.getVirtualInterface();
        this._mgmtInterface = base.isMgmtInterface();
        if (base instanceof InterfaceImpl) {
            InterfaceImpl impl = (InterfaceImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Interface> casted =(AugmentationHolder<Interface>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>model.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.VirtualInterface</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof yang.vnfd.VirtualInterface) {
            this._virtualInterface = ((yang.vnfd.VirtualInterface)arg).getVirtualInterface();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[model.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.VirtualInterface]");
    }

    public InterfaceKey key() {
        return key;
    }
    
    public ConnectionPointType getConnectionPointType() {
        return _connectionPointType;
    }
    
    public String getMacAddress() {
        return _macAddress;
    }
    
    public String getName() {
        return _name;
    }
    
    public Long getPosition() {
        return _position;
    }
    
    public InterfaceType getType() {
        return _type;
    }
    
    public VirtualInterface getVirtualInterface() {
        return _virtualInterface;
    }
    
    public Boolean isMgmtInterface() {
        return _mgmtInterface;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Interface>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public InterfaceBuilder withKey(final InterfaceKey key) {
        this.key = key;
        return this;
    }
    
    public InterfaceBuilder setConnectionPointType(final ConnectionPointType value) {
        this._connectionPointType = value;
        return this;
    }
    
    public InterfaceBuilder setMacAddress(final String value) {
        this._macAddress = value;
        return this;
    }
    
    public InterfaceBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    private static void checkPositionRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public InterfaceBuilder setPosition(final Long value) {
    if (value != null) {
        checkPositionRange(value);
        
    }
        this._position = value;
        return this;
    }
    
    public InterfaceBuilder setType(final InterfaceType value) {
        this._type = value;
        return this;
    }
    
    public InterfaceBuilder setVirtualInterface(final VirtualInterface value) {
        this._virtualInterface = value;
        return this;
    }
    
    public InterfaceBuilder setMgmtInterface(final Boolean value) {
        this._mgmtInterface = value;
        return this;
    }
    
    public InterfaceBuilder addAugmentation(Class<? extends Augmentation<Interface>> augmentationType, Augmentation<Interface> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public InterfaceBuilder removeAugmentation(Class<? extends Augmentation<Interface>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Interface build() {
        return new InterfaceImpl(this);
    }

    public static final class InterfaceImpl implements Interface {

        @Override
        public Class<Interface> getImplementedInterface() {
            return Interface.class;
        }
        private final ConnectionPointType _connectionPointType;
        private final String _macAddress;
        @JsonProperty("name")        
        private final String _name;
        private final Long _position;
        @JsonProperty("type")        
        private final InterfaceType _type;
        @JsonProperty("virtual-interface")        
        private final VirtualInterface _virtualInterface;
        private final Boolean _mgmtInterface;
        @JsonProperty("key")
        private final InterfaceKey key;

        private Map<Class<? extends Augmentation<Interface>>, Augmentation<Interface>> augmentation = Collections.emptyMap();

        private InterfaceImpl(InterfaceBuilder base) {
            if (base.key() == null) {
                this.key = new InterfaceKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this.key = base.key();
                this._name = key.getName();
            }
            this._connectionPointType = base.getConnectionPointType();
            this._macAddress = base.getMacAddress();
            this._position = base.getPosition();
            this._type = base.getType();
            this._virtualInterface = base.getVirtualInterface();
            this._mgmtInterface = base.isMgmtInterface();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        public InterfaceImpl(){
        	this( new InterfaceBuilder() );
        }

        @Override
        public InterfaceKey key() {
            return key;
        }
        
        @Override
        public ConnectionPointType getConnectionPointType() {
            return _connectionPointType;
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
        public Long getPosition() {
            return _position;
        }
        
        @Override
        public InterfaceType getType() {
            return _type;
        }
        
        @Override
        public VirtualInterface getVirtualInterface() {
            return _virtualInterface;
        }
        
        @Override
        public Boolean isMgmtInterface() {
            return _mgmtInterface;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Interface>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_connectionPointType);
            result = prime * result + Objects.hashCode(_macAddress);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_position);
            result = prime * result + Objects.hashCode(_type);
            result = prime * result + Objects.hashCode(_virtualInterface);
            result = prime * result + Objects.hashCode(_mgmtInterface);
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
            if (!Interface.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Interface other = (Interface)obj;
            if (!Objects.equals(_connectionPointType, other.getConnectionPointType())) {
                return false;
            }
            if (!Objects.equals(_macAddress, other.getMacAddress())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_position, other.getPosition())) {
                return false;
            }
            if (!Objects.equals(_type, other.getType())) {
                return false;
            }
            if (!Objects.equals(_virtualInterface, other.getVirtualInterface())) {
                return false;
            }
            if (!Objects.equals(_mgmtInterface, other.isMgmtInterface())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InterfaceImpl otherImpl = (InterfaceImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Interface>>, Augmentation<Interface>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Interface");
            CodeHelpers.appendValue(helper, "_connectionPointType", _connectionPointType);
            CodeHelpers.appendValue(helper, "_macAddress", _macAddress);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_position", _position);
            CodeHelpers.appendValue(helper, "_type", _type);
            CodeHelpers.appendValue(helper, "_virtualInterface", _virtualInterface);
            CodeHelpers.appendValue(helper, "_mgmtInterface", _mgmtInterface);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
