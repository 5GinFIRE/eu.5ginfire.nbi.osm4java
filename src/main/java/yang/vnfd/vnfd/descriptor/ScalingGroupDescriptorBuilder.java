package yang.vnfd.vnfd.descriptor;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import yang.vnfd.$YangModuleInfoImpl;
import yang.vnfd.vnfd.descriptor.scaling.group.descriptor.ScalingConfigAction;
import yang.vnfd.vnfd.descriptor.scaling.group.descriptor.ScalingPolicy;
import yang.vnfd.vnfd.descriptor.scaling.group.descriptor.Vdu;

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
 * Class that builds {@link ScalingGroupDescriptor} instances.
 * 
 * @see ScalingGroupDescriptor
 *
 */
public class ScalingGroupDescriptorBuilder implements Builder<ScalingGroupDescriptor> {

    private Long _maxInstanceCount;
    private Long _minInstanceCount;
    private String _name;
    private List<ScalingConfigAction> _scalingConfigAction;
    private List<ScalingPolicy> _scalingPolicy;
    private List<Vdu> _vdu;
    private ScalingGroupDescriptorKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("scaling-group-descriptor");

    Map<Class<? extends Augmentation<ScalingGroupDescriptor>>, Augmentation<ScalingGroupDescriptor>> augmentation = Collections.emptyMap();

    public ScalingGroupDescriptorBuilder() {
    }

    public ScalingGroupDescriptorBuilder(ScalingGroupDescriptor base) {
        if (base.key() == null) {
            this.key = new ScalingGroupDescriptorKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this.key = base.key();
            this._name = key.getName();
        }
        this._maxInstanceCount = base.getMaxInstanceCount();
        this._minInstanceCount = base.getMinInstanceCount();
        this._scalingConfigAction = base.getScalingConfigAction();
        this._scalingPolicy = base.getScalingPolicy();
        this._vdu = base.getVdu();
        if (base instanceof ScalingGroupDescriptorImpl) {
            ScalingGroupDescriptorImpl impl = (ScalingGroupDescriptorImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ScalingGroupDescriptor> casted =(AugmentationHolder<ScalingGroupDescriptor>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public ScalingGroupDescriptorKey key() {
        return key;
    }
    
    public Long getMaxInstanceCount() {
        return _maxInstanceCount;
    }
    
    public Long getMinInstanceCount() {
        return _minInstanceCount;
    }
    
    public String getName() {
        return _name;
    }
    
    public List<ScalingConfigAction> getScalingConfigAction() {
        return _scalingConfigAction;
    }
    
    public List<ScalingPolicy> getScalingPolicy() {
        return _scalingPolicy;
    }
    
    public List<Vdu> getVdu() {
        return _vdu;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ScalingGroupDescriptor>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public ScalingGroupDescriptorBuilder withKey(final ScalingGroupDescriptorKey key) {
        this.key = key;
        return this;
    }
    private static void checkMaxInstanceCountRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public ScalingGroupDescriptorBuilder setMaxInstanceCount(final Long value) {
    if (value != null) {
        checkMaxInstanceCountRange(value);
        
    }
        this._maxInstanceCount = value;
        return this;
    }
    private static void checkMinInstanceCountRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public ScalingGroupDescriptorBuilder setMinInstanceCount(final Long value) {
    if (value != null) {
        checkMinInstanceCountRange(value);
        
    }
        this._minInstanceCount = value;
        return this;
    }
    
    public ScalingGroupDescriptorBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    public ScalingGroupDescriptorBuilder setScalingConfigAction(final List<ScalingConfigAction> values) {
        this._scalingConfigAction = values;
        return this;
    }
    
    public ScalingGroupDescriptorBuilder setScalingPolicy(final List<ScalingPolicy> values) {
        this._scalingPolicy = values;
        return this;
    }
    
    public ScalingGroupDescriptorBuilder setVdu(final List<Vdu> values) {
        this._vdu = values;
        return this;
    }
    
    
    public ScalingGroupDescriptorBuilder addAugmentation(Class<? extends Augmentation<ScalingGroupDescriptor>> augmentationType, Augmentation<ScalingGroupDescriptor> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ScalingGroupDescriptorBuilder removeAugmentation(Class<? extends Augmentation<ScalingGroupDescriptor>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ScalingGroupDescriptor build() {
        return new ScalingGroupDescriptorImpl(this);
    }

    private static final class ScalingGroupDescriptorImpl implements ScalingGroupDescriptor {

        @Override
        public Class<ScalingGroupDescriptor> getImplementedInterface() {
            return ScalingGroupDescriptor.class;
        }

        private final Long _maxInstanceCount;
        private final Long _minInstanceCount;
        private final String _name;
        private final List<ScalingConfigAction> _scalingConfigAction;
        private final List<ScalingPolicy> _scalingPolicy;
        private final List<Vdu> _vdu;
        private final ScalingGroupDescriptorKey key;

        private Map<Class<? extends Augmentation<ScalingGroupDescriptor>>, Augmentation<ScalingGroupDescriptor>> augmentation = Collections.emptyMap();

        private ScalingGroupDescriptorImpl(ScalingGroupDescriptorBuilder base) {
            if (base.key() == null) {
                this.key = new ScalingGroupDescriptorKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this.key = base.key();
                this._name = key.getName();
            }
            this._maxInstanceCount = base.getMaxInstanceCount();
            this._minInstanceCount = base.getMinInstanceCount();
            this._scalingConfigAction = base.getScalingConfigAction();
            this._scalingPolicy = base.getScalingPolicy();
            this._vdu = base.getVdu();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public ScalingGroupDescriptorKey key() {
            return key;
        }
        
        @Override
        public Long getMaxInstanceCount() {
            return _maxInstanceCount;
        }
        
        @Override
        public Long getMinInstanceCount() {
            return _minInstanceCount;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public List<ScalingConfigAction> getScalingConfigAction() {
            return _scalingConfigAction;
        }
        
        @Override
        public List<ScalingPolicy> getScalingPolicy() {
            return _scalingPolicy;
        }
        
        @Override
        public List<Vdu> getVdu() {
            return _vdu;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ScalingGroupDescriptor>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_maxInstanceCount);
            result = prime * result + Objects.hashCode(_minInstanceCount);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_scalingConfigAction);
            result = prime * result + Objects.hashCode(_scalingPolicy);
            result = prime * result + Objects.hashCode(_vdu);
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
            if (!ScalingGroupDescriptor.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ScalingGroupDescriptor other = (ScalingGroupDescriptor)obj;
            if (!Objects.equals(_maxInstanceCount, other.getMaxInstanceCount())) {
                return false;
            }
            if (!Objects.equals(_minInstanceCount, other.getMinInstanceCount())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_scalingConfigAction, other.getScalingConfigAction())) {
                return false;
            }
            if (!Objects.equals(_scalingPolicy, other.getScalingPolicy())) {
                return false;
            }
            if (!Objects.equals(_vdu, other.getVdu())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ScalingGroupDescriptorImpl otherImpl = (ScalingGroupDescriptorImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ScalingGroupDescriptor>>, Augmentation<ScalingGroupDescriptor>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ScalingGroupDescriptor");
            CodeHelpers.appendValue(helper, "_maxInstanceCount", _maxInstanceCount);
            CodeHelpers.appendValue(helper, "_minInstanceCount", _minInstanceCount);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_scalingConfigAction", _scalingConfigAction);
            CodeHelpers.appendValue(helper, "_scalingPolicy", _scalingPolicy);
            CodeHelpers.appendValue(helper, "_vdu", _vdu);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
