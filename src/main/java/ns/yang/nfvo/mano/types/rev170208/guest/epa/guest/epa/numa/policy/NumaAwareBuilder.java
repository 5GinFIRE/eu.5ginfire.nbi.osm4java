package ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy;

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
 * Class that builds {@link NumaAware} instances.
 * 
 * @see NumaAware
 *
 */
public class NumaAwareBuilder implements Builder<NumaAware> {

    private NumaNodePolicy _numaNodePolicy;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("numa-aware");

    Map<Class<? extends Augmentation<NumaAware>>, Augmentation<NumaAware>> augmentation = Collections.emptyMap();

    public NumaAwareBuilder() {
    }

    public NumaAwareBuilder(NumaAware base) {
        this._numaNodePolicy = base.getNumaNodePolicy();
        if (base instanceof NumaAwareImpl) {
            NumaAwareImpl impl = (NumaAwareImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<NumaAware> casted =(AugmentationHolder<NumaAware>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public NumaNodePolicy getNumaNodePolicy() {
        return _numaNodePolicy;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<NumaAware>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public NumaAwareBuilder setNumaNodePolicy(final NumaNodePolicy value) {
        this._numaNodePolicy = value;
        return this;
    }
    
    public NumaAwareBuilder addAugmentation(Class<? extends Augmentation<NumaAware>> augmentationType, Augmentation<NumaAware> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NumaAwareBuilder removeAugmentation(Class<? extends Augmentation<NumaAware>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NumaAware build() {
        return new NumaAwareImpl(this);
    }

    private static final class NumaAwareImpl implements NumaAware {

        @Override
        public Class<NumaAware> getImplementedInterface() {
            return NumaAware.class;
        }

        private final NumaNodePolicy _numaNodePolicy;

        private Map<Class<? extends Augmentation<NumaAware>>, Augmentation<NumaAware>> augmentation = Collections.emptyMap();

        private NumaAwareImpl(NumaAwareBuilder base) {
            this._numaNodePolicy = base.getNumaNodePolicy();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public NumaNodePolicy getNumaNodePolicy() {
            return _numaNodePolicy;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<NumaAware>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_numaNodePolicy);
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
            if (!NumaAware.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            NumaAware other = (NumaAware)obj;
            if (!Objects.equals(_numaNodePolicy, other.getNumaNodePolicy())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NumaAwareImpl otherImpl = (NumaAwareImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<NumaAware>>, Augmentation<NumaAware>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("NumaAware");
            CodeHelpers.appendValue(helper, "_numaNodePolicy", _numaNodePolicy);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
