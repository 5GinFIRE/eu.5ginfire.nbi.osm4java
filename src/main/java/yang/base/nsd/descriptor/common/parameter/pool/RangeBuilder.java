package yang.base.nsd.descriptor.common.parameter.pool;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import yang.base.$YangModuleInfoImpl;

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
 * Class that builds {@link Range} instances.
 * 
 * @see Range
 *
 */
public class RangeBuilder implements Builder<Range> {

    private Long _endValue;
    private Long _startValue;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("range");

    Map<Class<? extends Augmentation<Range>>, Augmentation<Range>> augmentation = Collections.emptyMap();

    public RangeBuilder() {
    }

    public RangeBuilder(Range base) {
        this._endValue = base.getEndValue();
        this._startValue = base.getStartValue();
        if (base instanceof RangeImpl) {
            RangeImpl impl = (RangeImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Range> casted =(AugmentationHolder<Range>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public Long getEndValue() {
        return _endValue;
    }
    
    public Long getStartValue() {
        return _startValue;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Range>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    private static void checkEndValueRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public RangeBuilder setEndValue(final Long value) {
    if (value != null) {
        checkEndValueRange(value);
        
    }
        this._endValue = value;
        return this;
    }
    private static void checkStartValueRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public RangeBuilder setStartValue(final Long value) {
    if (value != null) {
        checkStartValueRange(value);
        
    }
        this._startValue = value;
        return this;
    }
    
    public RangeBuilder addAugmentation(Class<? extends Augmentation<Range>> augmentationType, Augmentation<Range> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RangeBuilder removeAugmentation(Class<? extends Augmentation<Range>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Range build() {
        return new RangeImpl(this);
    }

    private static final class RangeImpl implements Range {

        @Override
        public Class<Range> getImplementedInterface() {
            return Range.class;
        }

        private final Long _endValue;
        private final Long _startValue;

        private Map<Class<? extends Augmentation<Range>>, Augmentation<Range>> augmentation = Collections.emptyMap();

        private RangeImpl(RangeBuilder base) {
            this._endValue = base.getEndValue();
            this._startValue = base.getStartValue();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public Long getEndValue() {
            return _endValue;
        }
        
        @Override
        public Long getStartValue() {
            return _startValue;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Range>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_endValue);
            result = prime * result + Objects.hashCode(_startValue);
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
            if (!Range.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Range other = (Range)obj;
            if (!Objects.equals(_endValue, other.getEndValue())) {
                return false;
            }
            if (!Objects.equals(_startValue, other.getStartValue())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RangeImpl otherImpl = (RangeImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Range>>, Augmentation<Range>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Range");
            CodeHelpers.appendValue(helper, "_endValue", _endValue);
            CodeHelpers.appendValue(helper, "_startValue", _startValue);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
