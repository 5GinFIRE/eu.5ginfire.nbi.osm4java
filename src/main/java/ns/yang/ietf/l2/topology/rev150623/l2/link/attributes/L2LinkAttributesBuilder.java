package ns.yang.ietf.l2.topology.rev150623.l2.link.attributes;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.l2.topology.rev150623.$YangModuleInfoImpl;
import ns.yang.ietf.l2.topology.rev150623.FlagIdentity;

import java.lang.Class;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.math.BigDecimal;
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
 * Class that builds {@link L2LinkAttributes} instances.
 * 
 * @see L2LinkAttributes
 *
 */
public class L2LinkAttributesBuilder implements Builder<L2LinkAttributes> {

    private Long _delay;
    private List<Class<? extends FlagIdentity>> _flag;
    private String _name;
    private BigDecimal _rate;
    private List<Long> _srlg;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("l2-link-attributes");

    Map<Class<? extends Augmentation<L2LinkAttributes>>, Augmentation<L2LinkAttributes>> augmentation = Collections.emptyMap();

    public L2LinkAttributesBuilder() {
    }

    public L2LinkAttributesBuilder(L2LinkAttributes base) {
        this._delay = base.getDelay();
        this._flag = base.getFlag();
        this._name = base.getName();
        this._rate = base.getRate();
        this._srlg = base.getSrlg();
        if (base instanceof L2LinkAttributesImpl) {
            L2LinkAttributesImpl impl = (L2LinkAttributesImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<L2LinkAttributes> casted =(AugmentationHolder<L2LinkAttributes>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public Long getDelay() {
        return _delay;
    }
    
    public List<Class<? extends FlagIdentity>> getFlag() {
        return _flag;
    }
    
    public String getName() {
        return _name;
    }
    
    public BigDecimal getRate() {
        return _rate;
    }
    
    public List<Long> getSrlg() {
        return _srlg;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<L2LinkAttributes>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    private static void checkDelayRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public L2LinkAttributesBuilder setDelay(final Long value) {
    if (value != null) {
        checkDelayRange(value);
        
    }
        this._delay = value;
        return this;
    }
    public L2LinkAttributesBuilder setFlag(final List<Class<? extends FlagIdentity>> values) {
        this._flag = values;
        return this;
    }
    
    
    public L2LinkAttributesBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public L2LinkAttributesBuilder setRate(final BigDecimal value) {
    if (value != null) {
        
    }
        this._rate = value;
        return this;
    }
    private static void checkSrlgRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    public L2LinkAttributesBuilder setSrlg(final List<Long> values) {
    if (values != null) {
       for (java.lang.Long value : values) {
           checkSrlgRange(value);
           
       }
    }
        this._srlg = values;
        return this;
    }
    
    
    public L2LinkAttributesBuilder addAugmentation(Class<? extends Augmentation<L2LinkAttributes>> augmentationType, Augmentation<L2LinkAttributes> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public L2LinkAttributesBuilder removeAugmentation(Class<? extends Augmentation<L2LinkAttributes>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public L2LinkAttributes build() {
        return new L2LinkAttributesImpl(this);
    }

    private static final class L2LinkAttributesImpl implements L2LinkAttributes {

        @Override
        public Class<L2LinkAttributes> getImplementedInterface() {
            return L2LinkAttributes.class;
        }

        private final Long _delay;
        private final List<Class<? extends FlagIdentity>> _flag;
        private final String _name;
        private final BigDecimal _rate;
        private final List<Long> _srlg;

        private Map<Class<? extends Augmentation<L2LinkAttributes>>, Augmentation<L2LinkAttributes>> augmentation = Collections.emptyMap();

        private L2LinkAttributesImpl(L2LinkAttributesBuilder base) {
            this._delay = base.getDelay();
            this._flag = base.getFlag();
            this._name = base.getName();
            this._rate = base.getRate();
            this._srlg = base.getSrlg();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public Long getDelay() {
            return _delay;
        }
        
        @Override
        public List<Class<? extends FlagIdentity>> getFlag() {
            return _flag;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public BigDecimal getRate() {
            return _rate;
        }
        
        @Override
        public List<Long> getSrlg() {
            return _srlg;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<L2LinkAttributes>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_delay);
            result = prime * result + Objects.hashCode(_flag);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_rate);
            result = prime * result + Objects.hashCode(_srlg);
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
            if (!L2LinkAttributes.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            L2LinkAttributes other = (L2LinkAttributes)obj;
            if (!Objects.equals(_delay, other.getDelay())) {
                return false;
            }
            if (!Objects.equals(_flag, other.getFlag())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_rate, other.getRate())) {
                return false;
            }
            if (!Objects.equals(_srlg, other.getSrlg())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                L2LinkAttributesImpl otherImpl = (L2LinkAttributesImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<L2LinkAttributes>>, Augmentation<L2LinkAttributes>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("L2LinkAttributes");
            CodeHelpers.appendValue(helper, "_delay", _delay);
            CodeHelpers.appendValue(helper, "_flag", _flag);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_rate", _rate);
            CodeHelpers.appendValue(helper, "_srlg", _srlg);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
