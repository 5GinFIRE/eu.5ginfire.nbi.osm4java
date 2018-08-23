package yang.base.nsd.descriptor.common;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import yang.base.$YangModuleInfoImpl;
import yang.base.nsd.descriptor.common.parameter.pool.Range;

import java.lang.Class;
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
 * Class that builds {@link ParameterPool} instances.
 * 
 * @see ParameterPool
 *
 */
public class ParameterPoolBuilder implements Builder<ParameterPool> {

    private String _name;
    private Range _range;
    private ParameterPoolKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("parameter-pool");

    Map<Class<? extends Augmentation<ParameterPool>>, Augmentation<ParameterPool>> augmentation = Collections.emptyMap();

    public ParameterPoolBuilder() {
    }

    public ParameterPoolBuilder(ParameterPool base) {
        if (base.key() == null) {
            this.key = new ParameterPoolKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this.key = base.key();
            this._name = key.getName();
        }
        this._range = base.getRange();
        if (base instanceof ParameterPoolImpl) {
            ParameterPoolImpl impl = (ParameterPoolImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ParameterPool> casted =(AugmentationHolder<ParameterPool>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public ParameterPoolKey key() {
        return key;
    }
    
    public String getName() {
        return _name;
    }
    
    public Range getRange() {
        return _range;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ParameterPool>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public ParameterPoolBuilder withKey(final ParameterPoolKey key) {
        this.key = key;
        return this;
    }
    
    public ParameterPoolBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public ParameterPoolBuilder setRange(final Range value) {
        this._range = value;
        return this;
    }
    
    public ParameterPoolBuilder addAugmentation(Class<? extends Augmentation<ParameterPool>> augmentationType, Augmentation<ParameterPool> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ParameterPoolBuilder removeAugmentation(Class<? extends Augmentation<ParameterPool>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ParameterPool build() {
        return new ParameterPoolImpl(this);
    }

    private static final class ParameterPoolImpl implements ParameterPool {

        @Override
        public Class<ParameterPool> getImplementedInterface() {
            return ParameterPool.class;
        }

        private final String _name;
        private final Range _range;
        private final ParameterPoolKey key;

        private Map<Class<? extends Augmentation<ParameterPool>>, Augmentation<ParameterPool>> augmentation = Collections.emptyMap();

        private ParameterPoolImpl(ParameterPoolBuilder base) {
            if (base.key() == null) {
                this.key = new ParameterPoolKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this.key = base.key();
                this._name = key.getName();
            }
            this._range = base.getRange();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public ParameterPoolKey key() {
            return key;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public Range getRange() {
            return _range;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ParameterPool>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_range);
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
            if (!ParameterPool.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ParameterPool other = (ParameterPool)obj;
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_range, other.getRange())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ParameterPoolImpl otherImpl = (ParameterPoolImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ParameterPool>>, Augmentation<ParameterPool>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ParameterPool");
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_range", _range);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
