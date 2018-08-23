package ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record.Instance;

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
 * Class that builds {@link ScalingGroupRecord} instances.
 * 
 * @see ScalingGroupRecord
 *
 */
public class ScalingGroupRecordBuilder implements Builder<ScalingGroupRecord> {

    private List<Instance> _instance;
    private Object _scalingGroupNameRef;
    private ScalingGroupRecordKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("scaling-group-record");

    Map<Class<? extends Augmentation<ScalingGroupRecord>>, Augmentation<ScalingGroupRecord>> augmentation = Collections.emptyMap();

    public ScalingGroupRecordBuilder() {
    }

    public ScalingGroupRecordBuilder(ScalingGroupRecord base) {
        if (base.key() == null) {
            this.key = new ScalingGroupRecordKey(
                base.getScalingGroupNameRef()
            );
            this._scalingGroupNameRef = base.getScalingGroupNameRef();
        } else {
            this.key = base.key();
            this._scalingGroupNameRef = key.getScalingGroupNameRef();
        }
        this._instance = base.getInstance();
        if (base instanceof ScalingGroupRecordImpl) {
            ScalingGroupRecordImpl impl = (ScalingGroupRecordImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ScalingGroupRecord> casted =(AugmentationHolder<ScalingGroupRecord>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public ScalingGroupRecordKey key() {
        return key;
    }
    
    public List<Instance> getInstance() {
        return _instance;
    }
    
    public Object getScalingGroupNameRef() {
        return _scalingGroupNameRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ScalingGroupRecord>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public ScalingGroupRecordBuilder withKey(final ScalingGroupRecordKey key) {
        this.key = key;
        return this;
    }
    public ScalingGroupRecordBuilder setInstance(final List<Instance> values) {
        this._instance = values;
        return this;
    }
    
    
    public ScalingGroupRecordBuilder setScalingGroupNameRef(final Object value) {
        this._scalingGroupNameRef = value;
        return this;
    }
    
    public ScalingGroupRecordBuilder addAugmentation(Class<? extends Augmentation<ScalingGroupRecord>> augmentationType, Augmentation<ScalingGroupRecord> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ScalingGroupRecordBuilder removeAugmentation(Class<? extends Augmentation<ScalingGroupRecord>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ScalingGroupRecord build() {
        return new ScalingGroupRecordImpl(this);
    }

    private static final class ScalingGroupRecordImpl implements ScalingGroupRecord {

        @Override
        public Class<ScalingGroupRecord> getImplementedInterface() {
            return ScalingGroupRecord.class;
        }

        private final List<Instance> _instance;
        private final Object _scalingGroupNameRef;
        private final ScalingGroupRecordKey key;

        private Map<Class<? extends Augmentation<ScalingGroupRecord>>, Augmentation<ScalingGroupRecord>> augmentation = Collections.emptyMap();

        private ScalingGroupRecordImpl(ScalingGroupRecordBuilder base) {
            if (base.key() == null) {
                this.key = new ScalingGroupRecordKey(
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
        public ScalingGroupRecordKey key() {
            return key;
        }
        
        @Override
        public List<Instance> getInstance() {
            return _instance;
        }
        
        @Override
        public Object getScalingGroupNameRef() {
            return _scalingGroupNameRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ScalingGroupRecord>> E augmentation(Class<E> augmentationType) {
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
            if (!ScalingGroupRecord.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ScalingGroupRecord other = (ScalingGroupRecord)obj;
            if (!Objects.equals(_instance, other.getInstance())) {
                return false;
            }
            if (!Objects.equals(_scalingGroupNameRef, other.getScalingGroupNameRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ScalingGroupRecordImpl otherImpl = (ScalingGroupRecordImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ScalingGroupRecord>>, Augmentation<ScalingGroupRecord>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ScalingGroupRecord");
            CodeHelpers.appendValue(helper, "_instance", _instance);
            CodeHelpers.appendValue(helper, "_scalingGroupNameRef", _scalingGroupNameRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
