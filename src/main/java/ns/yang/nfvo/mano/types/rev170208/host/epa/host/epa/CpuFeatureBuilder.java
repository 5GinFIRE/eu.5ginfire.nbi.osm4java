package ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.CpuFeatureType;

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
 * Class that builds {@link CpuFeature} instances.
 * 
 * @see CpuFeature
 *
 */
public class CpuFeatureBuilder implements Builder<CpuFeature> {

    private CpuFeatureType _feature;
    private CpuFeatureKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("cpu-feature");

    Map<Class<? extends Augmentation<CpuFeature>>, Augmentation<CpuFeature>> augmentation = Collections.emptyMap();

    public CpuFeatureBuilder() {
    }

    public CpuFeatureBuilder(CpuFeature base) {
        if (base.key() == null) {
            this.key = new CpuFeatureKey(
                base.getFeature()
            );
            this._feature = base.getFeature();
        } else {
            this.key = base.key();
            this._feature = key.getFeature();
        }
        if (base instanceof CpuFeatureImpl) {
            CpuFeatureImpl impl = (CpuFeatureImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<CpuFeature> casted =(AugmentationHolder<CpuFeature>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public CpuFeatureKey key() {
        return key;
    }
    
    public CpuFeatureType getFeature() {
        return _feature;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<CpuFeature>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public CpuFeatureBuilder withKey(final CpuFeatureKey key) {
        this.key = key;
        return this;
    }
    
    public CpuFeatureBuilder setFeature(final CpuFeatureType value) {
        this._feature = value;
        return this;
    }
    
    public CpuFeatureBuilder addAugmentation(Class<? extends Augmentation<CpuFeature>> augmentationType, Augmentation<CpuFeature> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public CpuFeatureBuilder removeAugmentation(Class<? extends Augmentation<CpuFeature>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public CpuFeature build() {
        return new CpuFeatureImpl(this);
    }

    private static final class CpuFeatureImpl implements CpuFeature {

        @Override
        public Class<CpuFeature> getImplementedInterface() {
            return CpuFeature.class;
        }

        private final CpuFeatureType _feature;
        private final CpuFeatureKey key;

        private Map<Class<? extends Augmentation<CpuFeature>>, Augmentation<CpuFeature>> augmentation = Collections.emptyMap();

        private CpuFeatureImpl(CpuFeatureBuilder base) {
            if (base.key() == null) {
                this.key = new CpuFeatureKey(
                    base.getFeature()
                );
                this._feature = base.getFeature();
            } else {
                this.key = base.key();
                this._feature = key.getFeature();
            }
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public CpuFeatureKey key() {
            return key;
        }
        
        @Override
        public CpuFeatureType getFeature() {
            return _feature;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<CpuFeature>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_feature);
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
            if (!CpuFeature.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            CpuFeature other = (CpuFeature)obj;
            if (!Objects.equals(_feature, other.getFeature())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CpuFeatureImpl otherImpl = (CpuFeatureImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<CpuFeature>>, Augmentation<CpuFeature>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("CpuFeature");
            CodeHelpers.appendValue(helper, "_feature", _feature);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
