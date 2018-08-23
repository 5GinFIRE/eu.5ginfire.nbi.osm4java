package yang.project.vnfd.rev170228.project;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import yang.project.vnfd.rev170228.$YangModuleInfoImpl;
import yang.project.vnfd.rev170228.project.vnfd.catalog.Vnfd;

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
 * Class that builds {@link VnfdCatalog} instances.
 * 
 * @see VnfdCatalog
 *
 */
public class VnfdCatalogBuilder implements Builder<VnfdCatalog> {

    private List<Vnfd> _vnfd;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnfd-catalog");

    Map<Class<? extends Augmentation<VnfdCatalog>>, Augmentation<VnfdCatalog>> augmentation = Collections.emptyMap();

    public VnfdCatalogBuilder() {
    }

    public VnfdCatalogBuilder(VnfdCatalog base) {
        this._vnfd = base.getVnfd();
        if (base instanceof VnfdCatalogImpl) {
            VnfdCatalogImpl impl = (VnfdCatalogImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<VnfdCatalog> casted =(AugmentationHolder<VnfdCatalog>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<Vnfd> getVnfd() {
        return _vnfd;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<VnfdCatalog>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public VnfdCatalogBuilder setVnfd(final List<Vnfd> values) {
        this._vnfd = values;
        return this;
    }
    
    
    public VnfdCatalogBuilder addAugmentation(Class<? extends Augmentation<VnfdCatalog>> augmentationType, Augmentation<VnfdCatalog> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfdCatalogBuilder removeAugmentation(Class<? extends Augmentation<VnfdCatalog>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VnfdCatalog build() {
        return new VnfdCatalogImpl(this);
    }

    private static final class VnfdCatalogImpl implements VnfdCatalog {

        @Override
        public Class<VnfdCatalog> getImplementedInterface() {
            return VnfdCatalog.class;
        }

        private final List<Vnfd> _vnfd;

        private Map<Class<? extends Augmentation<VnfdCatalog>>, Augmentation<VnfdCatalog>> augmentation = Collections.emptyMap();

        private VnfdCatalogImpl(VnfdCatalogBuilder base) {
            this._vnfd = base.getVnfd();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public List<Vnfd> getVnfd() {
            return _vnfd;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<VnfdCatalog>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_vnfd);
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
            if (!VnfdCatalog.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            VnfdCatalog other = (VnfdCatalog)obj;
            if (!Objects.equals(_vnfd, other.getVnfd())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfdCatalogImpl otherImpl = (VnfdCatalogImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VnfdCatalog>>, Augmentation<VnfdCatalog>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VnfdCatalog");
            CodeHelpers.appendValue(helper, "_vnfd", _vnfd);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
