package ns.yang.nfvo.vnfr.rev170228.project;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.vnfr.rev170228.$YangModuleInfoImpl;
import ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr;

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
 * Class that builds {@link VnfrCatalog} instances.
 * 
 * @see VnfrCatalog
 *
 */
public class VnfrCatalogBuilder implements Builder<VnfrCatalog> {

    private String _schemaVersion;
    private List<Vnfr> _vnfr;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnfr-catalog");

    Map<Class<? extends Augmentation<VnfrCatalog>>, Augmentation<VnfrCatalog>> augmentation = Collections.emptyMap();

    public VnfrCatalogBuilder() {
    }

    public VnfrCatalogBuilder(VnfrCatalog base) {
        this._schemaVersion = base.getSchemaVersion();
        this._vnfr = base.getVnfr();
        if (base instanceof VnfrCatalogImpl) {
            VnfrCatalogImpl impl = (VnfrCatalogImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<VnfrCatalog> casted =(AugmentationHolder<VnfrCatalog>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public String getSchemaVersion() {
        return _schemaVersion;
    }
    
    public List<Vnfr> getVnfr() {
        return _vnfr;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<VnfrCatalog>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public VnfrCatalogBuilder setSchemaVersion(final String value) {
        this._schemaVersion = value;
        return this;
    }
    public VnfrCatalogBuilder setVnfr(final List<Vnfr> values) {
        this._vnfr = values;
        return this;
    }
    
    
    public VnfrCatalogBuilder addAugmentation(Class<? extends Augmentation<VnfrCatalog>> augmentationType, Augmentation<VnfrCatalog> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfrCatalogBuilder removeAugmentation(Class<? extends Augmentation<VnfrCatalog>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VnfrCatalog build() {
        return new VnfrCatalogImpl(this);
    }

    private static final class VnfrCatalogImpl implements VnfrCatalog {

        @Override
        public Class<VnfrCatalog> getImplementedInterface() {
            return VnfrCatalog.class;
        }

        private final String _schemaVersion;
        private final List<Vnfr> _vnfr;

        private Map<Class<? extends Augmentation<VnfrCatalog>>, Augmentation<VnfrCatalog>> augmentation = Collections.emptyMap();

        private VnfrCatalogImpl(VnfrCatalogBuilder base) {
            this._schemaVersion = base.getSchemaVersion();
            this._vnfr = base.getVnfr();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public String getSchemaVersion() {
            return _schemaVersion;
        }
        
        @Override
        public List<Vnfr> getVnfr() {
            return _vnfr;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<VnfrCatalog>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_schemaVersion);
            result = prime * result + Objects.hashCode(_vnfr);
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
            if (!VnfrCatalog.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            VnfrCatalog other = (VnfrCatalog)obj;
            if (!Objects.equals(_schemaVersion, other.getSchemaVersion())) {
                return false;
            }
            if (!Objects.equals(_vnfr, other.getVnfr())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfrCatalogImpl otherImpl = (VnfrCatalogImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VnfrCatalog>>, Augmentation<VnfrCatalog>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VnfrCatalog");
            CodeHelpers.appendValue(helper, "_schemaVersion", _schemaVersion);
            CodeHelpers.appendValue(helper, "_vnfr", _vnfr);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
