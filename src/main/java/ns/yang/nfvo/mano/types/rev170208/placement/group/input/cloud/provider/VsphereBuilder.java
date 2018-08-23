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
 * Class that builds {@link Vsphere} instances.
 * 
 * @see Vsphere
 *
 */
public class VsphereBuilder implements Builder<Vsphere> {

    private Boolean _vsphereConstruct;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vsphere");

    Map<Class<? extends Augmentation<Vsphere>>, Augmentation<Vsphere>> augmentation = Collections.emptyMap();

    public VsphereBuilder() {
    }

    public VsphereBuilder(Vsphere base) {
        this._vsphereConstruct = base.isVsphereConstruct();
        if (base instanceof VsphereImpl) {
            VsphereImpl impl = (VsphereImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Vsphere> casted =(AugmentationHolder<Vsphere>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public Boolean isVsphereConstruct() {
        return _vsphereConstruct;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Vsphere>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public VsphereBuilder setVsphereConstruct(final Boolean value) {
        this._vsphereConstruct = value;
        return this;
    }
    
    public VsphereBuilder addAugmentation(Class<? extends Augmentation<Vsphere>> augmentationType, Augmentation<Vsphere> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VsphereBuilder removeAugmentation(Class<? extends Augmentation<Vsphere>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Vsphere build() {
        return new VsphereImpl(this);
    }

    private static final class VsphereImpl implements Vsphere {

        @Override
        public Class<Vsphere> getImplementedInterface() {
            return Vsphere.class;
        }

        private final Boolean _vsphereConstruct;

        private Map<Class<? extends Augmentation<Vsphere>>, Augmentation<Vsphere>> augmentation = Collections.emptyMap();

        private VsphereImpl(VsphereBuilder base) {
            this._vsphereConstruct = base.isVsphereConstruct();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public Boolean isVsphereConstruct() {
            return _vsphereConstruct;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Vsphere>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_vsphereConstruct);
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
            if (!Vsphere.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Vsphere other = (Vsphere)obj;
            if (!Objects.equals(_vsphereConstruct, other.isVsphereConstruct())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VsphereImpl otherImpl = (VsphereImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Vsphere>>, Augmentation<Vsphere>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Vsphere");
            CodeHelpers.appendValue(helper, "_vsphereConstruct", _vsphereConstruct);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
