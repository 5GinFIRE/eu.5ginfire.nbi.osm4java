package ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider;
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
 * Class that builds {@link Openmano} instances.
 * 
 * @see Openmano
 *
 */
public class OpenmanoBuilder implements Builder<Openmano> {

    private Boolean _openmanoConstruct;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("openmano");

    Map<Class<? extends Augmentation<Openmano>>, Augmentation<Openmano>> augmentation = Collections.emptyMap();

    public OpenmanoBuilder() {
    }

    public OpenmanoBuilder(Openmano base) {
        this._openmanoConstruct = base.isOpenmanoConstruct();
        if (base instanceof OpenmanoImpl) {
            OpenmanoImpl impl = (OpenmanoImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Openmano> casted =(AugmentationHolder<Openmano>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public Boolean isOpenmanoConstruct() {
        return _openmanoConstruct;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Openmano>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public OpenmanoBuilder setOpenmanoConstruct(final Boolean value) {
        this._openmanoConstruct = value;
        return this;
    }
    
    public OpenmanoBuilder addAugmentation(Class<? extends Augmentation<Openmano>> augmentationType, Augmentation<Openmano> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public OpenmanoBuilder removeAugmentation(Class<? extends Augmentation<Openmano>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Openmano build() {
        return new OpenmanoImpl(this);
    }

    private static final class OpenmanoImpl implements Openmano {

        @Override
        public Class<Openmano> getImplementedInterface() {
            return Openmano.class;
        }

        private final Boolean _openmanoConstruct;

        private Map<Class<? extends Augmentation<Openmano>>, Augmentation<Openmano>> augmentation = Collections.emptyMap();

        private OpenmanoImpl(OpenmanoBuilder base) {
            this._openmanoConstruct = base.isOpenmanoConstruct();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public Boolean isOpenmanoConstruct() {
            return _openmanoConstruct;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Openmano>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_openmanoConstruct);
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
            if (!Openmano.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Openmano other = (Openmano)obj;
            if (!Objects.equals(_openmanoConstruct, other.isOpenmanoConstruct())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                OpenmanoImpl otherImpl = (OpenmanoImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Openmano>>, Augmentation<Openmano>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Openmano");
            CodeHelpers.appendValue(helper, "_openmanoConstruct", _openmanoConstruct);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
