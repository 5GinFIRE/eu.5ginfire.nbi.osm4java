package ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;

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
 * Class that builds {@link Relation} instances.
 * 
 * @see Relation
 *
 */
public class RelationBuilder implements Builder<Relation> {

    private String _provides;
    private String _requires;
    private RelationKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("relation");

    Map<Class<? extends Augmentation<Relation>>, Augmentation<Relation>> augmentation = Collections.emptyMap();

    public RelationBuilder() {
    }

    public RelationBuilder(Relation base) {
        if (base.key() == null) {
            this.key = new RelationKey(
                base.getProvides(), 
                base.getRequires()
            );
            this._provides = base.getProvides();
            this._requires = base.getRequires();
        } else {
            this.key = base.key();
            this._provides = key.getProvides();
            this._requires = key.getRequires();
        }
        if (base instanceof RelationImpl) {
            RelationImpl impl = (RelationImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Relation> casted =(AugmentationHolder<Relation>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public RelationKey key() {
        return key;
    }
    
    public String getProvides() {
        return _provides;
    }
    
    public String getRequires() {
        return _requires;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Relation>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public RelationBuilder withKey(final RelationKey key) {
        this.key = key;
        return this;
    }
    
    public RelationBuilder setProvides(final String value) {
        this._provides = value;
        return this;
    }
    
    public RelationBuilder setRequires(final String value) {
        this._requires = value;
        return this;
    }
    
    public RelationBuilder addAugmentation(Class<? extends Augmentation<Relation>> augmentationType, Augmentation<Relation> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RelationBuilder removeAugmentation(Class<? extends Augmentation<Relation>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Relation build() {
        return new RelationImpl(this);
    }

    private static final class RelationImpl implements Relation {

        @Override
        public Class<Relation> getImplementedInterface() {
            return Relation.class;
        }

        private final String _provides;
        private final String _requires;
        private final RelationKey key;

        private Map<Class<? extends Augmentation<Relation>>, Augmentation<Relation>> augmentation = Collections.emptyMap();

        private RelationImpl(RelationBuilder base) {
            if (base.key() == null) {
                this.key = new RelationKey(
                    base.getProvides(), 
                    base.getRequires()
                );
                this._provides = base.getProvides();
                this._requires = base.getRequires();
            } else {
                this.key = base.key();
                this._provides = key.getProvides();
                this._requires = key.getRequires();
            }
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public RelationKey key() {
            return key;
        }
        
        @Override
        public String getProvides() {
            return _provides;
        }
        
        @Override
        public String getRequires() {
            return _requires;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Relation>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_provides);
            result = prime * result + Objects.hashCode(_requires);
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
            if (!Relation.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Relation other = (Relation)obj;
            if (!Objects.equals(_provides, other.getProvides())) {
                return false;
            }
            if (!Objects.equals(_requires, other.getRequires())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RelationImpl otherImpl = (RelationImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Relation>>, Augmentation<Relation>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Relation");
            CodeHelpers.appendValue(helper, "_provides", _provides);
            CodeHelpers.appendValue(helper, "_requires", _requires);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
