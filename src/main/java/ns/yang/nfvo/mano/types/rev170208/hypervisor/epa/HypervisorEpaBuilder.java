package ns.yang.nfvo.mano.types.rev170208.hypervisor.epa;
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
 * Class that builds {@link HypervisorEpa} instances.
 * 
 * @see HypervisorEpa
 *
 */
public class HypervisorEpaBuilder implements Builder<HypervisorEpa> {

    private HypervisorEpa.Type _type;
    private String _version;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("hypervisor-epa");

    Map<Class<? extends Augmentation<HypervisorEpa>>, Augmentation<HypervisorEpa>> augmentation = Collections.emptyMap();

    public HypervisorEpaBuilder() {
    }

    public HypervisorEpaBuilder(HypervisorEpa base) {
        this._type = base.getType();
        this._version = base.getVersion();
        if (base instanceof HypervisorEpaImpl) {
            HypervisorEpaImpl impl = (HypervisorEpaImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<HypervisorEpa> casted =(AugmentationHolder<HypervisorEpa>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public HypervisorEpa.Type getType() {
        return _type;
    }
    
    public String getVersion() {
        return _version;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<HypervisorEpa>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public HypervisorEpaBuilder setType(final HypervisorEpa.Type value) {
        this._type = value;
        return this;
    }
    
    public HypervisorEpaBuilder setVersion(final String value) {
        this._version = value;
        return this;
    }
    
    public HypervisorEpaBuilder addAugmentation(Class<? extends Augmentation<HypervisorEpa>> augmentationType, Augmentation<HypervisorEpa> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public HypervisorEpaBuilder removeAugmentation(Class<? extends Augmentation<HypervisorEpa>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public HypervisorEpa build() {
        return new HypervisorEpaImpl(this);
    }

    private static final class HypervisorEpaImpl implements HypervisorEpa {

        @Override
        public Class<HypervisorEpa> getImplementedInterface() {
            return HypervisorEpa.class;
        }

        private final HypervisorEpa.Type _type;
        private final String _version;

        private Map<Class<? extends Augmentation<HypervisorEpa>>, Augmentation<HypervisorEpa>> augmentation = Collections.emptyMap();

        private HypervisorEpaImpl(HypervisorEpaBuilder base) {
            this._type = base.getType();
            this._version = base.getVersion();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public HypervisorEpa.Type getType() {
            return _type;
        }
        
        @Override
        public String getVersion() {
            return _version;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<HypervisorEpa>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_type);
            result = prime * result + Objects.hashCode(_version);
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
            if (!HypervisorEpa.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            HypervisorEpa other = (HypervisorEpa)obj;
            if (!Objects.equals(_type, other.getType())) {
                return false;
            }
            if (!Objects.equals(_version, other.getVersion())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                HypervisorEpaImpl otherImpl = (HypervisorEpaImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<HypervisorEpa>>, Augmentation<HypervisorEpa>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("HypervisorEpa");
            CodeHelpers.appendValue(helper, "_type", _type);
            CodeHelpers.appendValue(helper, "_version", _version);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
