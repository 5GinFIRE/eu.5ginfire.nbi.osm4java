package ns.yang.nfvo.vlr.rev170208.project;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.vlr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.Vlr;

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
 * Class that builds {@link VlrCatalog} instances.
 * 
 * @see VlrCatalog
 *
 */
public class VlrCatalogBuilder implements Builder<VlrCatalog> {

    private String _schemaVersion;
    private List<Vlr> _vlr;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vlr-catalog");

    Map<Class<? extends Augmentation<VlrCatalog>>, Augmentation<VlrCatalog>> augmentation = Collections.emptyMap();

    public VlrCatalogBuilder() {
    }

    public VlrCatalogBuilder(VlrCatalog base) {
        this._schemaVersion = base.getSchemaVersion();
        this._vlr = base.getVlr();
        if (base instanceof VlrCatalogImpl) {
            VlrCatalogImpl impl = (VlrCatalogImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<VlrCatalog> casted =(AugmentationHolder<VlrCatalog>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public String getSchemaVersion() {
        return _schemaVersion;
    }
    
    public List<Vlr> getVlr() {
        return _vlr;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<VlrCatalog>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public VlrCatalogBuilder setSchemaVersion(final String value) {
        this._schemaVersion = value;
        return this;
    }
    public VlrCatalogBuilder setVlr(final List<Vlr> values) {
        this._vlr = values;
        return this;
    }
    
    
    public VlrCatalogBuilder addAugmentation(Class<? extends Augmentation<VlrCatalog>> augmentationType, Augmentation<VlrCatalog> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VlrCatalogBuilder removeAugmentation(Class<? extends Augmentation<VlrCatalog>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VlrCatalog build() {
        return new VlrCatalogImpl(this);
    }

    private static final class VlrCatalogImpl implements VlrCatalog {

        @Override
        public Class<VlrCatalog> getImplementedInterface() {
            return VlrCatalog.class;
        }

        private final String _schemaVersion;
        private final List<Vlr> _vlr;

        private Map<Class<? extends Augmentation<VlrCatalog>>, Augmentation<VlrCatalog>> augmentation = Collections.emptyMap();

        private VlrCatalogImpl(VlrCatalogBuilder base) {
            this._schemaVersion = base.getSchemaVersion();
            this._vlr = base.getVlr();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public String getSchemaVersion() {
            return _schemaVersion;
        }
        
        @Override
        public List<Vlr> getVlr() {
            return _vlr;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<VlrCatalog>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_vlr);
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
            if (!VlrCatalog.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            VlrCatalog other = (VlrCatalog)obj;
            if (!Objects.equals(_schemaVersion, other.getSchemaVersion())) {
                return false;
            }
            if (!Objects.equals(_vlr, other.getVlr())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VlrCatalogImpl otherImpl = (VlrCatalogImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VlrCatalog>>, Augmentation<VlrCatalog>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VlrCatalog");
            CodeHelpers.appendValue(helper, "_schemaVersion", _schemaVersion);
            CodeHelpers.appendValue(helper, "_vlr", _vlr);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
