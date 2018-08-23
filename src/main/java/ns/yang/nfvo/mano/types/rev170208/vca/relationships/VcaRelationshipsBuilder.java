package ns.yang.nfvo.mano.types.rev170208.vca.relationships;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships.Relation;

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
 * Class that builds {@link VcaRelationships} instances.
 * 
 * @see VcaRelationships
 *
 */
public class VcaRelationshipsBuilder implements Builder<VcaRelationships> {

    private List<Relation> _relation;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vca-relationships");

    Map<Class<? extends Augmentation<VcaRelationships>>, Augmentation<VcaRelationships>> augmentation = Collections.emptyMap();

    public VcaRelationshipsBuilder() {
    }

    public VcaRelationshipsBuilder(VcaRelationships base) {
        this._relation = base.getRelation();
        if (base instanceof VcaRelationshipsImpl) {
            VcaRelationshipsImpl impl = (VcaRelationshipsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<VcaRelationships> casted =(AugmentationHolder<VcaRelationships>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<Relation> getRelation() {
        return _relation;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<VcaRelationships>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public VcaRelationshipsBuilder setRelation(final List<Relation> values) {
        this._relation = values;
        return this;
    }
    
    
    public VcaRelationshipsBuilder addAugmentation(Class<? extends Augmentation<VcaRelationships>> augmentationType, Augmentation<VcaRelationships> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VcaRelationshipsBuilder removeAugmentation(Class<? extends Augmentation<VcaRelationships>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VcaRelationships build() {
        return new VcaRelationshipsImpl(this);
    }

    private static final class VcaRelationshipsImpl implements VcaRelationships {

        @Override
        public Class<VcaRelationships> getImplementedInterface() {
            return VcaRelationships.class;
        }

        private final List<Relation> _relation;

        private Map<Class<? extends Augmentation<VcaRelationships>>, Augmentation<VcaRelationships>> augmentation = Collections.emptyMap();

        private VcaRelationshipsImpl(VcaRelationshipsBuilder base) {
            this._relation = base.getRelation();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public List<Relation> getRelation() {
            return _relation;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<VcaRelationships>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_relation);
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
            if (!VcaRelationships.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            VcaRelationships other = (VcaRelationships)obj;
            if (!Objects.equals(_relation, other.getRelation())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VcaRelationshipsImpl otherImpl = (VcaRelationshipsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VcaRelationships>>, Augmentation<VcaRelationships>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VcaRelationships");
            CodeHelpers.appendValue(helper, "_relation", _relation);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
