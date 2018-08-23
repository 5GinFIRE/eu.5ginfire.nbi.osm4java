package ns.yang.nfvo.mano.types.rev170208.monitoring.param.value;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Range;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.reflect.Array;
import java.math.BigInteger;
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
 * Class that builds {@link NumericConstraints} instances.
 * 
 * @see NumericConstraints
 *
 */
public class NumericConstraintsBuilder implements Builder<NumericConstraints> {

    private BigInteger _maxValue;
    private BigInteger _minValue;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("numeric-constraints");

    Map<Class<? extends Augmentation<NumericConstraints>>, Augmentation<NumericConstraints>> augmentation = Collections.emptyMap();

    public NumericConstraintsBuilder() {
    }

    public NumericConstraintsBuilder(NumericConstraints base) {
        this._maxValue = base.getMaxValue();
        this._minValue = base.getMinValue();
        if (base instanceof NumericConstraintsImpl) {
            NumericConstraintsImpl impl = (NumericConstraintsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<NumericConstraints> casted =(AugmentationHolder<NumericConstraints>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public BigInteger getMaxValue() {
        return _maxValue;
    }
    
    public BigInteger getMinValue() {
        return _minValue;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<NumericConstraints>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    private static final Range<java.math.BigInteger>[] CHECKMAXVALUERANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
        CHECKMAXVALUERANGE_RANGES = a;
    }
    private static void checkMaxValueRange(final java.math.BigInteger value) {
        for (Range<java.math.BigInteger> r : CHECKMAXVALUERANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKMAXVALUERANGE_RANGES, value);
    }
    
    public NumericConstraintsBuilder setMaxValue(final BigInteger value) {
    if (value != null) {
        checkMaxValueRange(value);
        
    }
        this._maxValue = value;
        return this;
    }
    private static final Range<java.math.BigInteger>[] CHECKMINVALUERANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
        CHECKMINVALUERANGE_RANGES = a;
    }
    private static void checkMinValueRange(final java.math.BigInteger value) {
        for (Range<java.math.BigInteger> r : CHECKMINVALUERANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKMINVALUERANGE_RANGES, value);
    }
    
    public NumericConstraintsBuilder setMinValue(final BigInteger value) {
    if (value != null) {
        checkMinValueRange(value);
        
    }
        this._minValue = value;
        return this;
    }
    
    public NumericConstraintsBuilder addAugmentation(Class<? extends Augmentation<NumericConstraints>> augmentationType, Augmentation<NumericConstraints> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NumericConstraintsBuilder removeAugmentation(Class<? extends Augmentation<NumericConstraints>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NumericConstraints build() {
        return new NumericConstraintsImpl(this);
    }

    private static final class NumericConstraintsImpl implements NumericConstraints {

        @Override
        public Class<NumericConstraints> getImplementedInterface() {
            return NumericConstraints.class;
        }

        private final BigInteger _maxValue;
        private final BigInteger _minValue;

        private Map<Class<? extends Augmentation<NumericConstraints>>, Augmentation<NumericConstraints>> augmentation = Collections.emptyMap();

        private NumericConstraintsImpl(NumericConstraintsBuilder base) {
            this._maxValue = base.getMaxValue();
            this._minValue = base.getMinValue();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public BigInteger getMaxValue() {
            return _maxValue;
        }
        
        @Override
        public BigInteger getMinValue() {
            return _minValue;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<NumericConstraints>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_maxValue);
            result = prime * result + Objects.hashCode(_minValue);
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
            if (!NumericConstraints.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            NumericConstraints other = (NumericConstraints)obj;
            if (!Objects.equals(_maxValue, other.getMaxValue())) {
                return false;
            }
            if (!Objects.equals(_minValue, other.getMinValue())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NumericConstraintsImpl otherImpl = (NumericConstraintsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<NumericConstraints>>, Augmentation<NumericConstraints>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("NumericConstraints");
            CodeHelpers.appendValue(helper, "_maxValue", _maxValue);
            CodeHelpers.appendValue(helper, "_minValue", _minValue);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
