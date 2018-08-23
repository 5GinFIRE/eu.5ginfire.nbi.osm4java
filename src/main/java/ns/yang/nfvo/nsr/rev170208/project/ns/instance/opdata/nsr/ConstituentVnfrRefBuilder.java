package ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;

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
 * Class that builds {@link ConstituentVnfrRef} instances.
 * 
 * @see ConstituentVnfrRef
 *
 */
public class ConstituentVnfrRefBuilder implements Builder<ConstituentVnfrRef> {

    private String _vnfrId;
    private ConstituentVnfrRefKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("constituent-vnfr-ref");

    Map<Class<? extends Augmentation<ConstituentVnfrRef>>, Augmentation<ConstituentVnfrRef>> augmentation = Collections.emptyMap();

    public ConstituentVnfrRefBuilder() {
    }

    public ConstituentVnfrRefBuilder(ConstituentVnfrRef base) {
        if (base.key() == null) {
            this.key = new ConstituentVnfrRefKey(
                base.getVnfrId()
            );
            this._vnfrId = base.getVnfrId();
        } else {
            this.key = base.key();
            this._vnfrId = key.getVnfrId();
        }
        if (base instanceof ConstituentVnfrRefImpl) {
            ConstituentVnfrRefImpl impl = (ConstituentVnfrRefImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ConstituentVnfrRef> casted =(AugmentationHolder<ConstituentVnfrRef>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public ConstituentVnfrRefKey key() {
        return key;
    }
    
    public String getVnfrId() {
        return _vnfrId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ConstituentVnfrRef>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public ConstituentVnfrRefBuilder withKey(final ConstituentVnfrRefKey key) {
        this.key = key;
        return this;
    }
    
    public ConstituentVnfrRefBuilder setVnfrId(final String value) {
        this._vnfrId = value;
        return this;
    }
    
    public ConstituentVnfrRefBuilder addAugmentation(Class<? extends Augmentation<ConstituentVnfrRef>> augmentationType, Augmentation<ConstituentVnfrRef> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ConstituentVnfrRefBuilder removeAugmentation(Class<? extends Augmentation<ConstituentVnfrRef>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ConstituentVnfrRef build() {
        return new ConstituentVnfrRefImpl(this);
    }

    private static final class ConstituentVnfrRefImpl implements ConstituentVnfrRef {

        @Override
        public Class<ConstituentVnfrRef> getImplementedInterface() {
            return ConstituentVnfrRef.class;
        }

        private final String _vnfrId;
        private final ConstituentVnfrRefKey key;

        private Map<Class<? extends Augmentation<ConstituentVnfrRef>>, Augmentation<ConstituentVnfrRef>> augmentation = Collections.emptyMap();

        private ConstituentVnfrRefImpl(ConstituentVnfrRefBuilder base) {
            if (base.key() == null) {
                this.key = new ConstituentVnfrRefKey(
                    base.getVnfrId()
                );
                this._vnfrId = base.getVnfrId();
            } else {
                this.key = base.key();
                this._vnfrId = key.getVnfrId();
            }
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public ConstituentVnfrRefKey key() {
            return key;
        }
        
        @Override
        public String getVnfrId() {
            return _vnfrId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ConstituentVnfrRef>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_vnfrId);
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
            if (!ConstituentVnfrRef.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ConstituentVnfrRef other = (ConstituentVnfrRef)obj;
            if (!Objects.equals(_vnfrId, other.getVnfrId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ConstituentVnfrRefImpl otherImpl = (ConstituentVnfrRefImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ConstituentVnfrRef>>, Augmentation<ConstituentVnfrRef>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ConstituentVnfrRef");
            CodeHelpers.appendValue(helper, "_vnfrId", _vnfrId);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
