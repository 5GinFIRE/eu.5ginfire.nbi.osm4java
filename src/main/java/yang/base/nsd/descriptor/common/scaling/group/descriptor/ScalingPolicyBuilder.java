package yang.base.nsd.descriptor.common.scaling.group.descriptor;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.ScalingCriteriaOperation;
import ns.yang.nfvo.mano.types.rev170208.ScalingPolicyType;
import yang.base.$YangModuleInfoImpl;
import yang.base.nsd.descriptor.common.scaling.group.descriptor.scaling.policy.ScalingCriteria;

import java.lang.Boolean;
import java.lang.Class;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
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
 * Class that builds {@link ScalingPolicy} instances.
 * 
 * @see ScalingPolicy
 *
 */
public class ScalingPolicyBuilder implements Builder<ScalingPolicy> {

    private Long _cooldownTime;
    private String _name;
    private ScalingCriteriaOperation _scaleInOperationType;
    private ScalingCriteriaOperation _scaleOutOperationType;
    private List<ScalingCriteria> _scalingCriteria;
    private ScalingPolicyType _scalingType;
    private Long _thresholdTime;
    private Boolean _enabled;
    private ScalingPolicyKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("scaling-policy");

    Map<Class<? extends Augmentation<ScalingPolicy>>, Augmentation<ScalingPolicy>> augmentation = Collections.emptyMap();

    public ScalingPolicyBuilder() {
    }

    public ScalingPolicyBuilder(ScalingPolicy base) {
        if (base.key() == null) {
            this.key = new ScalingPolicyKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this.key = base.key();
            this._name = key.getName();
        }
        this._cooldownTime = base.getCooldownTime();
        this._scaleInOperationType = base.getScaleInOperationType();
        this._scaleOutOperationType = base.getScaleOutOperationType();
        this._scalingCriteria = base.getScalingCriteria();
        this._scalingType = base.getScalingType();
        this._thresholdTime = base.getThresholdTime();
        this._enabled = base.isEnabled();
        if (base instanceof ScalingPolicyImpl) {
            ScalingPolicyImpl impl = (ScalingPolicyImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ScalingPolicy> casted =(AugmentationHolder<ScalingPolicy>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public ScalingPolicyKey key() {
        return key;
    }
    
    public Long getCooldownTime() {
        return _cooldownTime;
    }
    
    public String getName() {
        return _name;
    }
    
    public ScalingCriteriaOperation getScaleInOperationType() {
        return _scaleInOperationType;
    }
    
    public ScalingCriteriaOperation getScaleOutOperationType() {
        return _scaleOutOperationType;
    }
    
    public List<ScalingCriteria> getScalingCriteria() {
        return _scalingCriteria;
    }
    
    public ScalingPolicyType getScalingType() {
        return _scalingType;
    }
    
    public Long getThresholdTime() {
        return _thresholdTime;
    }
    
    public Boolean isEnabled() {
        return _enabled;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ScalingPolicy>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public ScalingPolicyBuilder withKey(final ScalingPolicyKey key) {
        this.key = key;
        return this;
    }
    private static void checkCooldownTimeRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public ScalingPolicyBuilder setCooldownTime(final Long value) {
    if (value != null) {
        checkCooldownTimeRange(value);
        
    }
        this._cooldownTime = value;
        return this;
    }
    
    public ScalingPolicyBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public ScalingPolicyBuilder setScaleInOperationType(final ScalingCriteriaOperation value) {
        this._scaleInOperationType = value;
        return this;
    }
    
    public ScalingPolicyBuilder setScaleOutOperationType(final ScalingCriteriaOperation value) {
        this._scaleOutOperationType = value;
        return this;
    }
    public ScalingPolicyBuilder setScalingCriteria(final List<ScalingCriteria> values) {
        this._scalingCriteria = values;
        return this;
    }
    
    
    public ScalingPolicyBuilder setScalingType(final ScalingPolicyType value) {
        this._scalingType = value;
        return this;
    }
    private static void checkThresholdTimeRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public ScalingPolicyBuilder setThresholdTime(final Long value) {
    if (value != null) {
        checkThresholdTimeRange(value);
        
    }
        this._thresholdTime = value;
        return this;
    }
    
    public ScalingPolicyBuilder setEnabled(final Boolean value) {
        this._enabled = value;
        return this;
    }
    
    public ScalingPolicyBuilder addAugmentation(Class<? extends Augmentation<ScalingPolicy>> augmentationType, Augmentation<ScalingPolicy> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ScalingPolicyBuilder removeAugmentation(Class<? extends Augmentation<ScalingPolicy>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ScalingPolicy build() {
        return new ScalingPolicyImpl(this);
    }

    public static final class ScalingPolicyImpl implements ScalingPolicy {

        @Override
        public Class<ScalingPolicy> getImplementedInterface() {
            return ScalingPolicy.class;
        }
        @JsonProperty("cooldown-time")
        private final Long _cooldownTime;
        @JsonProperty("name")
        private final String _name;
        private final ScalingCriteriaOperation _scaleInOperationType;
        private final ScalingCriteriaOperation _scaleOutOperationType;
        private final List<ScalingCriteria> _scalingCriteria;
        @JsonProperty("scaling-type")
        private final ScalingPolicyType _scalingType;
        @JsonProperty("threshold-time")
        private final Long _thresholdTime;
        private final Boolean _enabled;
        private final ScalingPolicyKey key;

        private Map<Class<? extends Augmentation<ScalingPolicy>>, Augmentation<ScalingPolicy>> augmentation = Collections.emptyMap();

        private ScalingPolicyImpl(ScalingPolicyBuilder base) {
            if (base.key() == null) {
                this.key = new ScalingPolicyKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this.key = base.key();
                this._name = key.getName();
            }
            this._cooldownTime = base.getCooldownTime();
            this._scaleInOperationType = base.getScaleInOperationType();
            this._scaleOutOperationType = base.getScaleOutOperationType();
            this._scalingCriteria = base.getScalingCriteria();
            this._scalingType = base.getScalingType();
            this._thresholdTime = base.getThresholdTime();
            this._enabled = base.isEnabled();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
        
        public ScalingPolicyImpl() 
    	{
        	this(new ScalingPolicyBuilder());
    	}
        

        @Override
        public ScalingPolicyKey key() {
            return key;
        }
        
        @Override
        public Long getCooldownTime() {
            return _cooldownTime;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public ScalingCriteriaOperation getScaleInOperationType() {
            return _scaleInOperationType;
        }
        
        @Override
        public ScalingCriteriaOperation getScaleOutOperationType() {
            return _scaleOutOperationType;
        }
        
        @Override
        public List<ScalingCriteria> getScalingCriteria() {
            return _scalingCriteria;
        }
        
        @Override
        public ScalingPolicyType getScalingType() {
            return _scalingType;
        }
        
        @Override
        public Long getThresholdTime() {
            return _thresholdTime;
        }
        
        @Override
        public Boolean isEnabled() {
            return _enabled;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ScalingPolicy>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cooldownTime);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_scaleInOperationType);
            result = prime * result + Objects.hashCode(_scaleOutOperationType);
            result = prime * result + Objects.hashCode(_scalingCriteria);
            result = prime * result + Objects.hashCode(_scalingType);
            result = prime * result + Objects.hashCode(_thresholdTime);
            result = prime * result + Objects.hashCode(_enabled);
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
            if (!ScalingPolicy.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ScalingPolicy other = (ScalingPolicy)obj;
            if (!Objects.equals(_cooldownTime, other.getCooldownTime())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_scaleInOperationType, other.getScaleInOperationType())) {
                return false;
            }
            if (!Objects.equals(_scaleOutOperationType, other.getScaleOutOperationType())) {
                return false;
            }
            if (!Objects.equals(_scalingCriteria, other.getScalingCriteria())) {
                return false;
            }
            if (!Objects.equals(_scalingType, other.getScalingType())) {
                return false;
            }
            if (!Objects.equals(_thresholdTime, other.getThresholdTime())) {
                return false;
            }
            if (!Objects.equals(_enabled, other.isEnabled())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ScalingPolicyImpl otherImpl = (ScalingPolicyImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ScalingPolicy>>, Augmentation<ScalingPolicy>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ScalingPolicy");
            CodeHelpers.appendValue(helper, "_cooldownTime", _cooldownTime);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_scaleInOperationType", _scaleInOperationType);
            CodeHelpers.appendValue(helper, "_scaleOutOperationType", _scaleOutOperationType);
            CodeHelpers.appendValue(helper, "_scalingCriteria", _scalingCriteria);
            CodeHelpers.appendValue(helper, "_scalingType", _scalingType);
            CodeHelpers.appendValue(helper, "_thresholdTime", _thresholdTime);
            CodeHelpers.appendValue(helper, "_enabled", _enabled);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
