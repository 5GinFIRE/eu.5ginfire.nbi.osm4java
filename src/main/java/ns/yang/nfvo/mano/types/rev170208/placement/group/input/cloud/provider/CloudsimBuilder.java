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
 * Class that builds {@link Cloudsim} instances.
 * 
 * @see Cloudsim
 *
 */
public class CloudsimBuilder implements Builder<Cloudsim> {

    private Boolean _cloudsimConstruct;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("cloudsim");

    Map<Class<? extends Augmentation<Cloudsim>>, Augmentation<Cloudsim>> augmentation = Collections.emptyMap();

    public CloudsimBuilder() {
    }

    public CloudsimBuilder(Cloudsim base) {
        this._cloudsimConstruct = base.isCloudsimConstruct();
        if (base instanceof CloudsimImpl) {
            CloudsimImpl impl = (CloudsimImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Cloudsim> casted =(AugmentationHolder<Cloudsim>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public Boolean isCloudsimConstruct() {
        return _cloudsimConstruct;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Cloudsim>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public CloudsimBuilder setCloudsimConstruct(final Boolean value) {
        this._cloudsimConstruct = value;
        return this;
    }
    
    public CloudsimBuilder addAugmentation(Class<? extends Augmentation<Cloudsim>> augmentationType, Augmentation<Cloudsim> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public CloudsimBuilder removeAugmentation(Class<? extends Augmentation<Cloudsim>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cloudsim build() {
        return new CloudsimImpl(this);
    }

    private static final class CloudsimImpl implements Cloudsim {

        @Override
        public Class<Cloudsim> getImplementedInterface() {
            return Cloudsim.class;
        }

        private final Boolean _cloudsimConstruct;

        private Map<Class<? extends Augmentation<Cloudsim>>, Augmentation<Cloudsim>> augmentation = Collections.emptyMap();

        private CloudsimImpl(CloudsimBuilder base) {
            this._cloudsimConstruct = base.isCloudsimConstruct();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public Boolean isCloudsimConstruct() {
            return _cloudsimConstruct;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Cloudsim>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cloudsimConstruct);
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
            if (!Cloudsim.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Cloudsim other = (Cloudsim)obj;
            if (!Objects.equals(_cloudsimConstruct, other.isCloudsimConstruct())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CloudsimImpl otherImpl = (CloudsimImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Cloudsim>>, Augmentation<Cloudsim>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Cloudsim");
            CodeHelpers.appendValue(helper, "_cloudsimConstruct", _cloudsimConstruct);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
