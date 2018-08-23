package ns.yang.nfvo.nsr.rev170208;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Range;
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
 * Class that builds {@link ExecScaleInOutput} instances.
 * 
 * @see ExecScaleInOutput
 *
 */
public class ExecScaleInOutputBuilder implements Builder<ExecScaleInOutput> {

    private BigInteger _instanceId;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("output");

    Map<Class<? extends Augmentation<ExecScaleInOutput>>, Augmentation<ExecScaleInOutput>> augmentation = Collections.emptyMap();

    public ExecScaleInOutputBuilder() {
    }

    public ExecScaleInOutputBuilder(ExecScaleInOutput base) {
        this._instanceId = base.getInstanceId();
        if (base instanceof ExecScaleInOutputImpl) {
            ExecScaleInOutputImpl impl = (ExecScaleInOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ExecScaleInOutput> casted =(AugmentationHolder<ExecScaleInOutput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public BigInteger getInstanceId() {
        return _instanceId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ExecScaleInOutput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    private static final Range<java.math.BigInteger>[] CHECKINSTANCEIDRANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
        CHECKINSTANCEIDRANGE_RANGES = a;
    }
    private static void checkInstanceIdRange(final java.math.BigInteger value) {
        for (Range<java.math.BigInteger> r : CHECKINSTANCEIDRANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKINSTANCEIDRANGE_RANGES, value);
    }
    
    public ExecScaleInOutputBuilder setInstanceId(final BigInteger value) {
    if (value != null) {
        checkInstanceIdRange(value);
        
    }
        this._instanceId = value;
        return this;
    }
    
    public ExecScaleInOutputBuilder addAugmentation(Class<? extends Augmentation<ExecScaleInOutput>> augmentationType, Augmentation<ExecScaleInOutput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ExecScaleInOutputBuilder removeAugmentation(Class<? extends Augmentation<ExecScaleInOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ExecScaleInOutput build() {
        return new ExecScaleInOutputImpl(this);
    }

    private static final class ExecScaleInOutputImpl implements ExecScaleInOutput {

        @Override
        public Class<ExecScaleInOutput> getImplementedInterface() {
            return ExecScaleInOutput.class;
        }

        private final BigInteger _instanceId;

        private Map<Class<? extends Augmentation<ExecScaleInOutput>>, Augmentation<ExecScaleInOutput>> augmentation = Collections.emptyMap();

        private ExecScaleInOutputImpl(ExecScaleInOutputBuilder base) {
            this._instanceId = base.getInstanceId();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public BigInteger getInstanceId() {
            return _instanceId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ExecScaleInOutput>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_instanceId);
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
            if (!ExecScaleInOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ExecScaleInOutput other = (ExecScaleInOutput)obj;
            if (!Objects.equals(_instanceId, other.getInstanceId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ExecScaleInOutputImpl otherImpl = (ExecScaleInOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ExecScaleInOutput>>, Augmentation<ExecScaleInOutput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ExecScaleInOutput");
            CodeHelpers.appendValue(helper, "_instanceId", _instanceId);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
