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
 * Class that builds {@link ExternalPorts} instances.
 * 
 * @see ExternalPorts
 *
 */
public class ExternalPortsBuilder implements Builder<ExternalPorts> {

    private String _label;
    private BigInteger _total;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("external-ports");

    Map<Class<? extends Augmentation<ExternalPorts>>, Augmentation<ExternalPorts>> augmentation = Collections.emptyMap();

    public ExternalPortsBuilder() {
    }

    public ExternalPortsBuilder(ExternalPorts base) {
        this._label = base.getLabel();
        this._total = base.getTotal();
        if (base instanceof ExternalPortsImpl) {
            ExternalPortsImpl impl = (ExternalPortsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ExternalPorts> casted =(AugmentationHolder<ExternalPorts>) base;
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
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ExternalPorts>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public ExternalPortsBuilder setLabel(final String value) {
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
    
    public ExternalPortsBuilder setTotal(final BigInteger value) {
    if (value != null) {
        checkTotalRange(value);
        
    }
        this._total = value;
        return this;
    }
    
    public ExternalPortsBuilder addAugmentation(Class<? extends Augmentation<ExternalPorts>> augmentationType, Augmentation<ExternalPorts> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ExternalPortsBuilder removeAugmentation(Class<? extends Augmentation<ExternalPorts>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ExternalPorts build() {
        return new ExternalPortsImpl(this);
    }

    private static final class ExternalPortsImpl implements ExternalPorts {

        @Override
        public Class<ExternalPorts> getImplementedInterface() {
            return ExternalPorts.class;
        }

        private final String _label;
        private final BigInteger _total;

        private Map<Class<? extends Augmentation<ExternalPorts>>, Augmentation<ExternalPorts>> augmentation = Collections.emptyMap();

        private ExternalPortsImpl(ExternalPortsBuilder base) {
            this._label = base.getLabel();
            this._total = base.getTotal();
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
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ExternalPorts>> E augmentation(Class<E> augmentationType) {
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
            if (!ExternalPorts.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ExternalPorts other = (ExternalPorts)obj;
            if (!Objects.equals(_label, other.getLabel())) {
                return false;
            }
            if (!Objects.equals(_total, other.getTotal())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ExternalPortsImpl otherImpl = (ExternalPortsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ExternalPorts>>, Augmentation<ExternalPorts>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ExternalPorts");
            CodeHelpers.appendValue(helper, "_label", _label);
            CodeHelpers.appendValue(helper, "_total", _total);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
