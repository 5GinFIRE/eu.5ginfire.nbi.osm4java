package ns.yang.nfvo.mano.types.rev170208.nfvi.metrics;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Range;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.reflect.Array;
import java.math.BigDecimal;
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
 * Class that builds {@link Storage} instances.
 * 
 * @see Storage
 *
 */
public class StorageBuilder implements Builder<Storage> {

    private String _label;
    private BigInteger _total;
    private BigInteger _used;
    private BigDecimal _utilization;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("storage");

    Map<Class<? extends Augmentation<Storage>>, Augmentation<Storage>> augmentation = Collections.emptyMap();

    public StorageBuilder() {
    }

    public StorageBuilder(Storage base) {
        this._label = base.getLabel();
        this._total = base.getTotal();
        this._used = base.getUsed();
        this._utilization = base.getUtilization();
        if (base instanceof StorageImpl) {
            StorageImpl impl = (StorageImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Storage> casted =(AugmentationHolder<Storage>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public String getLabel() {
        return _label;
    }
    
    public BigInteger getTotal() {
        return _total;
    }
    
    public BigInteger getUsed() {
        return _used;
    }
    
    public BigDecimal getUtilization() {
        return _utilization;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Storage>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public StorageBuilder setLabel(final String value) {
        this._label = value;
        return this;
    }
    private static final Range<java.math.BigInteger>[] CHECKTOTALRANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
        CHECKTOTALRANGE_RANGES = a;
    }
    private static void checkTotalRange(final java.math.BigInteger value) {
        for (Range<java.math.BigInteger> r : CHECKTOTALRANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKTOTALRANGE_RANGES, value);
    }
    
    public StorageBuilder setTotal(final BigInteger value) {
    if (value != null) {
        checkTotalRange(value);
        
    }
        this._total = value;
        return this;
    }
    private static final Range<java.math.BigInteger>[] CHECKUSEDRANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
        CHECKUSEDRANGE_RANGES = a;
    }
    private static void checkUsedRange(final java.math.BigInteger value) {
        for (Range<java.math.BigInteger> r : CHECKUSEDRANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKUSEDRANGE_RANGES, value);
    }
    
    public StorageBuilder setUsed(final BigInteger value) {
    if (value != null) {
        checkUsedRange(value);
        
    }
        this._used = value;
        return this;
    }
    private static final Range<java.math.BigDecimal>[] CHECKUTILIZATIONRANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigDecimal>[] a = (Range<java.math.BigDecimal>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigDecimal.ZERO, new java.math.BigDecimal("100"));
        CHECKUTILIZATIONRANGE_RANGES = a;
    }
    private static void checkUtilizationRange(final java.math.BigDecimal value) {
        for (Range<java.math.BigDecimal> r : CHECKUTILIZATIONRANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKUTILIZATIONRANGE_RANGES, value);
    }
    
    public StorageBuilder setUtilization(final BigDecimal value) {
    if (value != null) {
        checkUtilizationRange(value);
        
    }
        this._utilization = value;
        return this;
    }
    
    public StorageBuilder addAugmentation(Class<? extends Augmentation<Storage>> augmentationType, Augmentation<Storage> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public StorageBuilder removeAugmentation(Class<? extends Augmentation<Storage>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Storage build() {
        return new StorageImpl(this);
    }

    private static final class StorageImpl implements Storage {

        @Override
        public Class<Storage> getImplementedInterface() {
            return Storage.class;
        }

        private final String _label;
        private final BigInteger _total;
        private final BigInteger _used;
        private final BigDecimal _utilization;

        private Map<Class<? extends Augmentation<Storage>>, Augmentation<Storage>> augmentation = Collections.emptyMap();

        private StorageImpl(StorageBuilder base) {
            this._label = base.getLabel();
            this._total = base.getTotal();
            this._used = base.getUsed();
            this._utilization = base.getUtilization();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public String getLabel() {
            return _label;
        }
        
        @Override
        public BigInteger getTotal() {
            return _total;
        }
        
        @Override
        public BigInteger getUsed() {
            return _used;
        }
        
        @Override
        public BigDecimal getUtilization() {
            return _utilization;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Storage>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_label);
            result = prime * result + Objects.hashCode(_total);
            result = prime * result + Objects.hashCode(_used);
            result = prime * result + Objects.hashCode(_utilization);
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
            if (!Storage.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Storage other = (Storage)obj;
            if (!Objects.equals(_label, other.getLabel())) {
                return false;
            }
            if (!Objects.equals(_total, other.getTotal())) {
                return false;
            }
            if (!Objects.equals(_used, other.getUsed())) {
                return false;
            }
            if (!Objects.equals(_utilization, other.getUtilization())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                StorageImpl otherImpl = (StorageImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Storage>>, Augmentation<Storage>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Storage");
            CodeHelpers.appendValue(helper, "_label", _label);
            CodeHelpers.appendValue(helper, "_total", _total);
            CodeHelpers.appendValue(helper, "_used", _used);
            CodeHelpers.appendValue(helper, "_utilization", _utilization);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
