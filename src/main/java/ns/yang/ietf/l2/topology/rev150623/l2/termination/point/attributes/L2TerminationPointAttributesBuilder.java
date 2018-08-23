package ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.l2.topology.rev150623.$YangModuleInfoImpl;
import ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.L2TerminationPointType;

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
 * Class that builds {@link L2TerminationPointAttributes} instances.
 * 
 * @see L2TerminationPointAttributes
 *
 */
public class L2TerminationPointAttributesBuilder implements Builder<L2TerminationPointAttributes> {

    private String _description;
    private L2TerminationPointType _l2TerminationPointType;
    private Long _maximumFrameSize;
    private L2TerminationPointAttributes.TpState _tpState;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("l2-termination-point-attributes");

    Map<Class<? extends Augmentation<L2TerminationPointAttributes>>, Augmentation<L2TerminationPointAttributes>> augmentation = Collections.emptyMap();

    public L2TerminationPointAttributesBuilder() {
    }

    public L2TerminationPointAttributesBuilder(L2TerminationPointAttributes base) {
        this._description = base.getDescription();
        this._l2TerminationPointType = base.getL2TerminationPointType();
        this._maximumFrameSize = base.getMaximumFrameSize();
        this._tpState = base.getTpState();
        if (base instanceof L2TerminationPointAttributesImpl) {
            L2TerminationPointAttributesImpl impl = (L2TerminationPointAttributesImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<L2TerminationPointAttributes> casted =(AugmentationHolder<L2TerminationPointAttributes>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public String getDescription() {
        return _description;
    }
    
    public L2TerminationPointType getL2TerminationPointType() {
        return _l2TerminationPointType;
    }
    
    public Long getMaximumFrameSize() {
        return _maximumFrameSize;
    }
    
    public L2TerminationPointAttributes.TpState getTpState() {
        return _tpState;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<L2TerminationPointAttributes>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public L2TerminationPointAttributesBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public L2TerminationPointAttributesBuilder setL2TerminationPointType(final L2TerminationPointType value) {
        this._l2TerminationPointType = value;
        return this;
    }
    private static void checkMaximumFrameSizeRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public L2TerminationPointAttributesBuilder setMaximumFrameSize(final Long value) {
    if (value != null) {
        checkMaximumFrameSizeRange(value);
        
    }
        this._maximumFrameSize = value;
        return this;
    }
    
    public L2TerminationPointAttributesBuilder setTpState(final L2TerminationPointAttributes.TpState value) {
        this._tpState = value;
        return this;
    }
    
    public L2TerminationPointAttributesBuilder addAugmentation(Class<? extends Augmentation<L2TerminationPointAttributes>> augmentationType, Augmentation<L2TerminationPointAttributes> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public L2TerminationPointAttributesBuilder removeAugmentation(Class<? extends Augmentation<L2TerminationPointAttributes>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public L2TerminationPointAttributes build() {
        return new L2TerminationPointAttributesImpl(this);
    }

    private static final class L2TerminationPointAttributesImpl implements L2TerminationPointAttributes {

        @Override
        public Class<L2TerminationPointAttributes> getImplementedInterface() {
            return L2TerminationPointAttributes.class;
        }

        private final String _description;
        private final L2TerminationPointType _l2TerminationPointType;
        private final Long _maximumFrameSize;
        private final L2TerminationPointAttributes.TpState _tpState;

        private Map<Class<? extends Augmentation<L2TerminationPointAttributes>>, Augmentation<L2TerminationPointAttributes>> augmentation = Collections.emptyMap();

        private L2TerminationPointAttributesImpl(L2TerminationPointAttributesBuilder base) {
            this._description = base.getDescription();
            this._l2TerminationPointType = base.getL2TerminationPointType();
            this._maximumFrameSize = base.getMaximumFrameSize();
            this._tpState = base.getTpState();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public String getDescription() {
            return _description;
        }
        
        @Override
        public L2TerminationPointType getL2TerminationPointType() {
            return _l2TerminationPointType;
        }
        
        @Override
        public Long getMaximumFrameSize() {
            return _maximumFrameSize;
        }
        
        @Override
        public L2TerminationPointAttributes.TpState getTpState() {
            return _tpState;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<L2TerminationPointAttributes>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_l2TerminationPointType);
            result = prime * result + Objects.hashCode(_maximumFrameSize);
            result = prime * result + Objects.hashCode(_tpState);
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
            if (!L2TerminationPointAttributes.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            L2TerminationPointAttributes other = (L2TerminationPointAttributes)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_l2TerminationPointType, other.getL2TerminationPointType())) {
                return false;
            }
            if (!Objects.equals(_maximumFrameSize, other.getMaximumFrameSize())) {
                return false;
            }
            if (!Objects.equals(_tpState, other.getTpState())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                L2TerminationPointAttributesImpl otherImpl = (L2TerminationPointAttributesImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<L2TerminationPointAttributes>>, Augmentation<L2TerminationPointAttributes>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("L2TerminationPointAttributes");
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_l2TerminationPointType", _l2TerminationPointType);
            CodeHelpers.appendValue(helper, "_maximumFrameSize", _maximumFrameSize);
            CodeHelpers.appendValue(helper, "_tpState", _tpState);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
