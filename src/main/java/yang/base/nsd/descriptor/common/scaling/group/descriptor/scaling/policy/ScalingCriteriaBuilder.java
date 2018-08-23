package yang.base.nsd.descriptor.common.scaling.group.descriptor.scaling.policy;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Range;

import ns.yang.nfvo.mano.types.rev170208.RelationalOperationType;
import yang.base.$YangModuleInfoImpl;

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
 * Class that builds {@link ScalingCriteria} instances.
 * 
 * @see ScalingCriteria
 *
 */
public class ScalingCriteriaBuilder implements Builder<ScalingCriteria> {

    private String _name;
    private String _nsMonitoringParamRef;
    private RelationalOperationType _scaleInRelationalOperation;
    private BigInteger _scaleInThreshold;
    private RelationalOperationType _scaleOutRelationalOperation;
    private BigInteger _scaleOutThreshold;
    private ScalingCriteriaKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("scaling-criteria");

    Map<Class<? extends Augmentation<ScalingCriteria>>, Augmentation<ScalingCriteria>> augmentation = Collections.emptyMap();

    public ScalingCriteriaBuilder() {
    }

    public ScalingCriteriaBuilder(ScalingCriteria base) {
        if (base.key() == null) {
            this.key = new ScalingCriteriaKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this.key = base.key();
            this._name = key.getName();
        }
        this._nsMonitoringParamRef = base.getNsMonitoringParamRef();
        this._scaleInRelationalOperation = base.getScaleInRelationalOperation();
        this._scaleInThreshold = base.getScaleInThreshold();
        this._scaleOutRelationalOperation = base.getScaleOutRelationalOperation();
        this._scaleOutThreshold = base.getScaleOutThreshold();
        if (base instanceof ScalingCriteriaImpl) {
            ScalingCriteriaImpl impl = (ScalingCriteriaImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ScalingCriteria> casted =(AugmentationHolder<ScalingCriteria>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public ScalingCriteriaKey key() {
        return key;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getNsMonitoringParamRef() {
        return _nsMonitoringParamRef;
    }
    
    public RelationalOperationType getScaleInRelationalOperation() {
        return _scaleInRelationalOperation;
    }
    
    public BigInteger getScaleInThreshold() {
        return _scaleInThreshold;
    }
    
    public RelationalOperationType getScaleOutRelationalOperation() {
        return _scaleOutRelationalOperation;
    }
    
    public BigInteger getScaleOutThreshold() {
        return _scaleOutThreshold;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ScalingCriteria>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public ScalingCriteriaBuilder withKey(final ScalingCriteriaKey key) {
        this.key = key;
        return this;
    }
    
    public ScalingCriteriaBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public ScalingCriteriaBuilder setNsMonitoringParamRef(final String value) {
        this._nsMonitoringParamRef = value;
        return this;
    }
    
    public ScalingCriteriaBuilder setScaleInRelationalOperation(final RelationalOperationType value) {
        this._scaleInRelationalOperation = value;
        return this;
    }
    private static final Range<java.math.BigInteger>[] CHECKSCALEINTHRESHOLDRANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
        CHECKSCALEINTHRESHOLDRANGE_RANGES = a;
    }
    private static void checkScaleInThresholdRange(final java.math.BigInteger value) {
        for (Range<java.math.BigInteger> r : CHECKSCALEINTHRESHOLDRANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKSCALEINTHRESHOLDRANGE_RANGES, value);
    }
    
    public ScalingCriteriaBuilder setScaleInThreshold(final BigInteger value) {
    if (value != null) {
        checkScaleInThresholdRange(value);
        
    }
        this._scaleInThreshold = value;
        return this;
    }
    
    public ScalingCriteriaBuilder setScaleOutRelationalOperation(final RelationalOperationType value) {
        this._scaleOutRelationalOperation = value;
        return this;
    }
    private static final Range<java.math.BigInteger>[] CHECKSCALEOUTTHRESHOLDRANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
        CHECKSCALEOUTTHRESHOLDRANGE_RANGES = a;
    }
    private static void checkScaleOutThresholdRange(final java.math.BigInteger value) {
        for (Range<java.math.BigInteger> r : CHECKSCALEOUTTHRESHOLDRANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKSCALEOUTTHRESHOLDRANGE_RANGES, value);
    }
    
    public ScalingCriteriaBuilder setScaleOutThreshold(final BigInteger value) {
    if (value != null) {
        checkScaleOutThresholdRange(value);
        
    }
        this._scaleOutThreshold = value;
        return this;
    }
    
    public ScalingCriteriaBuilder addAugmentation(Class<? extends Augmentation<ScalingCriteria>> augmentationType, Augmentation<ScalingCriteria> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ScalingCriteriaBuilder removeAugmentation(Class<? extends Augmentation<ScalingCriteria>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ScalingCriteria build() {
        return new ScalingCriteriaImpl(this);
    }

    private static final class ScalingCriteriaImpl implements ScalingCriteria {

        @Override
        public Class<ScalingCriteria> getImplementedInterface() {
            return ScalingCriteria.class;
        }

        private final String _name;
        private final String _nsMonitoringParamRef;
        private final RelationalOperationType _scaleInRelationalOperation;
        private final BigInteger _scaleInThreshold;
        private final RelationalOperationType _scaleOutRelationalOperation;
        private final BigInteger _scaleOutThreshold;
        private final ScalingCriteriaKey key;

        private Map<Class<? extends Augmentation<ScalingCriteria>>, Augmentation<ScalingCriteria>> augmentation = Collections.emptyMap();

        private ScalingCriteriaImpl(ScalingCriteriaBuilder base) {
            if (base.key() == null) {
                this.key = new ScalingCriteriaKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this.key = base.key();
                this._name = key.getName();
            }
            this._nsMonitoringParamRef = base.getNsMonitoringParamRef();
            this._scaleInRelationalOperation = base.getScaleInRelationalOperation();
            this._scaleInThreshold = base.getScaleInThreshold();
            this._scaleOutRelationalOperation = base.getScaleOutRelationalOperation();
            this._scaleOutThreshold = base.getScaleOutThreshold();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public ScalingCriteriaKey key() {
            return key;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public String getNsMonitoringParamRef() {
            return _nsMonitoringParamRef;
        }
        
        @Override
        public RelationalOperationType getScaleInRelationalOperation() {
            return _scaleInRelationalOperation;
        }
        
        @Override
        public BigInteger getScaleInThreshold() {
            return _scaleInThreshold;
        }
        
        @Override
        public RelationalOperationType getScaleOutRelationalOperation() {
            return _scaleOutRelationalOperation;
        }
        
        @Override
        public BigInteger getScaleOutThreshold() {
            return _scaleOutThreshold;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ScalingCriteria>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_nsMonitoringParamRef);
            result = prime * result + Objects.hashCode(_scaleInRelationalOperation);
            result = prime * result + Objects.hashCode(_scaleInThreshold);
            result = prime * result + Objects.hashCode(_scaleOutRelationalOperation);
            result = prime * result + Objects.hashCode(_scaleOutThreshold);
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
            if (!ScalingCriteria.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ScalingCriteria other = (ScalingCriteria)obj;
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_nsMonitoringParamRef, other.getNsMonitoringParamRef())) {
                return false;
            }
            if (!Objects.equals(_scaleInRelationalOperation, other.getScaleInRelationalOperation())) {
                return false;
            }
            if (!Objects.equals(_scaleInThreshold, other.getScaleInThreshold())) {
                return false;
            }
            if (!Objects.equals(_scaleOutRelationalOperation, other.getScaleOutRelationalOperation())) {
                return false;
            }
            if (!Objects.equals(_scaleOutThreshold, other.getScaleOutThreshold())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ScalingCriteriaImpl otherImpl = (ScalingCriteriaImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ScalingCriteria>>, Augmentation<ScalingCriteria>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ScalingCriteria");
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_nsMonitoringParamRef", _nsMonitoringParamRef);
            CodeHelpers.appendValue(helper, "_scaleInRelationalOperation", _scaleInRelationalOperation);
            CodeHelpers.appendValue(helper, "_scaleInThreshold", _scaleInThreshold);
            CodeHelpers.appendValue(helper, "_scaleOutRelationalOperation", _scaleOutRelationalOperation);
            CodeHelpers.appendValue(helper, "_scaleOutThreshold", _scaleOutThreshold);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
