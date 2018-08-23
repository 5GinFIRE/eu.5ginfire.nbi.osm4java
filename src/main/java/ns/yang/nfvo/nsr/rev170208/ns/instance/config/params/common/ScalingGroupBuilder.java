package ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group.Instance;

import java.lang.Class;
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
 * Class that builds {@link ScalingGroup} instances.
 * 
 * @see ScalingGroup
 *
 */
public class ScalingGroupBuilder implements Builder<ScalingGroup> {

    private List<Instance> _instance;
    private String _scalingGroupNameRef;
    private ScalingGroupKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("scaling-group");

    Map<Class<? extends Augmentation<ScalingGroup>>, Augmentation<ScalingGroup>> augmentation = Collections.emptyMap();

    public ScalingGroupBuilder() {
    }

    public ScalingGroupBuilder(ScalingGroup base) {
        if (base.key() == null) {
            this.key = new ScalingGroupKey(
                base.getScalingGroupNameRef()
            );
            this._scalingGroupNameRef = base.getScalingGroupNameRef();
        } else {
            this.key = base.key();
            this._scalingGroupNameRef = key.getScalingGroupNameRef();
        }
        this._instance = base.getInstance();
        if (base instanceof ScalingGroupImpl) {
            ScalingGroupImpl impl = (ScalingGroupImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ScalingGroup> casted =(AugmentationHolder<ScalingGroup>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public ScalingGroupKey key() {
        return key;
    }
    
    public List<Instance> getInstance() {
        return _instance;
    }
    
    public String getScalingGroupNameRef() {
        return _scalingGroupNameRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ScalingGroup>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public ScalingGroupBuilder withKey(final ScalingGroupKey key) {
        this.key = key;
        return this;
    }
    public ScalingGroupBuilder setInstance(final List<Instance> values) {
        this._instance = values;
        return this;
    }
    
    
    public ScalingGroupBuilder setScalingGroupNameRef(final String value) {
        this._scalingGroupNameRef = value;
        return this;
    }
    
    public ScalingGroupBuilder addAugmentation(Class<? extends Augmentation<ScalingGroup>> augmentationType, Augmentation<ScalingGroup> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ScalingGroupBuilder removeAugmentation(Class<? extends Augmentation<ScalingGroup>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ScalingGroup build() {
        return new ScalingGroupImpl(this);
    }

    private static final class ScalingGroupImpl implements ScalingGroup {

        @Override
        public Class<ScalingGroup> getImplementedInterface() {
            return ScalingGroup.class;
        }

        private final List<Instance> _instance;
        private final String _scalingGroupNameRef;
        private final ScalingGroupKey key;

        private Map<Class<? extends Augmentation<ScalingGroup>>, Augmentation<ScalingGroup>> augmentation = Collections.emptyMap();

        private ScalingGroupImpl(ScalingGroupBuilder base) {
            if (base.key() == null) {
                this.key = new ScalingGroupKey(
                    base.getScalingGroupNameRef()
                );
                this._scalingGroupNameRef = base.getScalingGroupNameRef();
            } else {
                this.key = base.key();
                this._scalingGroupNameRef = key.getScalingGroupNameRef();
            }
            this._instance = base.getInstance();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public ScalingGroupKey key() {
            return key;
        }
        
        @Override
        public List<Instance> getInstance() {
            return _instance;
        }
        
        @Override
        public String getScalingGroupNameRef() {
            return _scalingGroupNameRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ScalingGroup>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_instance);
            result = prime * result + Objects.hashCode(_scalingGroupNameRef);
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
            if (!ScalingGroup.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ScalingGroup other = (ScalingGroup)obj;
            if (!Objects.equals(_instance, other.getInstance())) {
                return false;
            }
            if (!Objects.equals(_scalingGroupNameRef, other.getScalingGroupNameRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ScalingGroupImpl otherImpl = (ScalingGroupImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ScalingGroup>>, Augmentation<ScalingGroup>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ScalingGroup");
            CodeHelpers.appendValue(helper, "_instance", _instance);
            CodeHelpers.appendValue(helper, "_scalingGroupNameRef", _scalingGroupNameRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
