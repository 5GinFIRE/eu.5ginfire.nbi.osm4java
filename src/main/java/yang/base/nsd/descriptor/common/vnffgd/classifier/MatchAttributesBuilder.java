package yang.base.nsd.descriptor.common.vnffgd.classifier;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.inet.types.rev100924.IpAddress;
import ns.yang.ietf.inet.types.rev100924.PortNumber;
import yang.base.$YangModuleInfoImpl;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.Short;
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
 * Class that builds {@link MatchAttributes} instances.
 * 
 * @see MatchAttributes
 *
 */
public class MatchAttributesBuilder implements Builder<MatchAttributes> {

    private IpAddress _destinationIpAddress;
    private PortNumber _destinationPort;
    private String _id;
    private Short _ipProto;
    private IpAddress _sourceIpAddress;
    private PortNumber _sourcePort;
    private MatchAttributesKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("match-attributes");

    Map<Class<? extends Augmentation<MatchAttributes>>, Augmentation<MatchAttributes>> augmentation = Collections.emptyMap();

    public MatchAttributesBuilder() {
    }

    public MatchAttributesBuilder(MatchAttributes base) {
        if (base.key() == null) {
            this.key = new MatchAttributesKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this.key = base.key();
            this._id = key.getId();
        }
        this._destinationIpAddress = base.getDestinationIpAddress();
        this._destinationPort = base.getDestinationPort();
        this._ipProto = base.getIpProto();
        this._sourceIpAddress = base.getSourceIpAddress();
        this._sourcePort = base.getSourcePort();
        if (base instanceof MatchAttributesImpl) {
            MatchAttributesImpl impl = (MatchAttributesImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<MatchAttributes> casted =(AugmentationHolder<MatchAttributes>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public MatchAttributesKey key() {
        return key;
    }
    
    public IpAddress getDestinationIpAddress() {
        return _destinationIpAddress;
    }
    
    public PortNumber getDestinationPort() {
        return _destinationPort;
    }
    
    public String getId() {
        return _id;
    }
    
    public Short getIpProto() {
        return _ipProto;
    }
    
    public IpAddress getSourceIpAddress() {
        return _sourceIpAddress;
    }
    
    public PortNumber getSourcePort() {
        return _sourcePort;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<MatchAttributes>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public MatchAttributesBuilder withKey(final MatchAttributesKey key) {
        this.key = key;
        return this;
    }
    
    public MatchAttributesBuilder setDestinationIpAddress(final IpAddress value) {
        this._destinationIpAddress = value;
        return this;
    }
    
    public MatchAttributesBuilder setDestinationPort(final PortNumber value) {
        this._destinationPort = value;
        return this;
    }
    
    public MatchAttributesBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    private static void checkIpProtoRange(final short value) {
        if (value >= (short)0 && value <= (short)255) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..255]]", value);
    }
    
    public MatchAttributesBuilder setIpProto(final Short value) {
    if (value != null) {
        checkIpProtoRange(value);
        
    }
        this._ipProto = value;
        return this;
    }
    
    public MatchAttributesBuilder setSourceIpAddress(final IpAddress value) {
        this._sourceIpAddress = value;
        return this;
    }
    
    public MatchAttributesBuilder setSourcePort(final PortNumber value) {
        this._sourcePort = value;
        return this;
    }
    
    public MatchAttributesBuilder addAugmentation(Class<? extends Augmentation<MatchAttributes>> augmentationType, Augmentation<MatchAttributes> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public MatchAttributesBuilder removeAugmentation(Class<? extends Augmentation<MatchAttributes>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public MatchAttributes build() {
        return new MatchAttributesImpl(this);
    }

    private static final class MatchAttributesImpl implements MatchAttributes {

        @Override
        public Class<MatchAttributes> getImplementedInterface() {
            return MatchAttributes.class;
        }

        private final IpAddress _destinationIpAddress;
        private final PortNumber _destinationPort;
        private final String _id;
        private final Short _ipProto;
        private final IpAddress _sourceIpAddress;
        private final PortNumber _sourcePort;
        private final MatchAttributesKey key;

        private Map<Class<? extends Augmentation<MatchAttributes>>, Augmentation<MatchAttributes>> augmentation = Collections.emptyMap();

        private MatchAttributesImpl(MatchAttributesBuilder base) {
            if (base.key() == null) {
                this.key = new MatchAttributesKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this.key = base.key();
                this._id = key.getId();
            }
            this._destinationIpAddress = base.getDestinationIpAddress();
            this._destinationPort = base.getDestinationPort();
            this._ipProto = base.getIpProto();
            this._sourceIpAddress = base.getSourceIpAddress();
            this._sourcePort = base.getSourcePort();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public MatchAttributesKey key() {
            return key;
        }
        
        @Override
        public IpAddress getDestinationIpAddress() {
            return _destinationIpAddress;
        }
        
        @Override
        public PortNumber getDestinationPort() {
            return _destinationPort;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public Short getIpProto() {
            return _ipProto;
        }
        
        @Override
        public IpAddress getSourceIpAddress() {
            return _sourceIpAddress;
        }
        
        @Override
        public PortNumber getSourcePort() {
            return _sourcePort;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<MatchAttributes>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_destinationIpAddress);
            result = prime * result + Objects.hashCode(_destinationPort);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_ipProto);
            result = prime * result + Objects.hashCode(_sourceIpAddress);
            result = prime * result + Objects.hashCode(_sourcePort);
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
            if (!MatchAttributes.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            MatchAttributes other = (MatchAttributes)obj;
            if (!Objects.equals(_destinationIpAddress, other.getDestinationIpAddress())) {
                return false;
            }
            if (!Objects.equals(_destinationPort, other.getDestinationPort())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_ipProto, other.getIpProto())) {
                return false;
            }
            if (!Objects.equals(_sourceIpAddress, other.getSourceIpAddress())) {
                return false;
            }
            if (!Objects.equals(_sourcePort, other.getSourcePort())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MatchAttributesImpl otherImpl = (MatchAttributesImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<MatchAttributes>>, Augmentation<MatchAttributes>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("MatchAttributes");
            CodeHelpers.appendValue(helper, "_destinationIpAddress", _destinationIpAddress);
            CodeHelpers.appendValue(helper, "_destinationPort", _destinationPort);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_ipProto", _ipProto);
            CodeHelpers.appendValue(helper, "_sourceIpAddress", _sourceIpAddress);
            CodeHelpers.appendValue(helper, "_sourcePort", _sourcePort);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
