package ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;

import java.lang.Boolean;
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
 * Class that builds {@link NumaUnaware} instances.
 * 
 * @see NumaUnaware
 *
 */
public class NumaUnawareBuilder implements Builder<NumaUnaware> {

    private Boolean _numaUnaware;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("numa-unaware");

    Map<Class<? extends Augmentation<NumaUnaware>>, Augmentation<NumaUnaware>> augmentation = Collections.emptyMap();

    public NumaUnawareBuilder() {
    }

    public NumaUnawareBuilder(NumaUnaware base) {
        this._numaUnaware = base.isNumaUnaware();
        if (base instanceof NumaUnawareImpl) {
            NumaUnawareImpl impl = (NumaUnawareImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<NumaUnaware> casted =(AugmentationHolder<NumaUnaware>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public Boolean isNumaUnaware() {
        return _numaUnaware;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<NumaUnaware>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public NumaUnawareBuilder setNumaUnaware(final Boolean value) {
        this._numaUnaware = value;
        return this;
    }
    
    public NumaUnawareBuilder addAugmentation(Class<? extends Augmentation<NumaUnaware>> augmentationType, Augmentation<NumaUnaware> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NumaUnawareBuilder removeAugmentation(Class<? extends Augmentation<NumaUnaware>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NumaUnaware build() {
        return new NumaUnawareImpl(this);
    }

    private static final class NumaUnawareImpl implements NumaUnaware {

        @Override
        public Class<NumaUnaware> getImplementedInterface() {
            return NumaUnaware.class;
        }

        private final Boolean _numaUnaware;

        private Map<Class<? extends Augmentation<NumaUnaware>>, Augmentation<NumaUnaware>> augmentation = Collections.emptyMap();

        private NumaUnawareImpl(NumaUnawareBuilder base) {
            this._numaUnaware = base.isNumaUnaware();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public Boolean isNumaUnaware() {
            return _numaUnaware;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<NumaUnaware>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_numaUnaware);
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
            if (!NumaUnaware.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            NumaUnaware other = (NumaUnaware)obj;
            if (!Objects.equals(_numaUnaware, other.isNumaUnaware())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NumaUnawareImpl otherImpl = (NumaUnawareImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<NumaUnaware>>, Augmentation<NumaUnaware>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("NumaUnaware");
            CodeHelpers.appendValue(helper, "_numaUnaware", _numaUnaware);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
