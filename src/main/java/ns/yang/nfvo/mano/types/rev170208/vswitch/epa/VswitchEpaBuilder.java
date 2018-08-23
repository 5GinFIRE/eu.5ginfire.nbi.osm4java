package ns.yang.nfvo.mano.types.rev170208.vswitch.epa;
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
 * Class that builds {@link VswitchEpa} instances.
 * 
 * @see VswitchEpa
 *
 */
public class VswitchEpaBuilder implements Builder<VswitchEpa> {

    private VswitchEpa.OvsAcceleration _ovsAcceleration;
    private VswitchEpa.OvsOffload _ovsOffload;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vswitch-epa");

    Map<Class<? extends Augmentation<VswitchEpa>>, Augmentation<VswitchEpa>> augmentation = Collections.emptyMap();

    public VswitchEpaBuilder() {
    }

    public VswitchEpaBuilder(VswitchEpa base) {
        this._ovsAcceleration = base.getOvsAcceleration();
        this._ovsOffload = base.getOvsOffload();
        if (base instanceof VswitchEpaImpl) {
            VswitchEpaImpl impl = (VswitchEpaImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<VswitchEpa> casted =(AugmentationHolder<VswitchEpa>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public VswitchEpa.OvsAcceleration getOvsAcceleration() {
        return _ovsAcceleration;
    }
    
    public VswitchEpa.OvsOffload getOvsOffload() {
        return _ovsOffload;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<VswitchEpa>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public VswitchEpaBuilder setOvsAcceleration(final VswitchEpa.OvsAcceleration value) {
        this._ovsAcceleration = value;
        return this;
    }
    
    public VswitchEpaBuilder setOvsOffload(final VswitchEpa.OvsOffload value) {
        this._ovsOffload = value;
        return this;
    }
    
    public VswitchEpaBuilder addAugmentation(Class<? extends Augmentation<VswitchEpa>> augmentationType, Augmentation<VswitchEpa> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VswitchEpaBuilder removeAugmentation(Class<? extends Augmentation<VswitchEpa>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VswitchEpa build() {
        return new VswitchEpaImpl(this);
    }

    private static final class VswitchEpaImpl implements VswitchEpa {

        @Override
        public Class<VswitchEpa> getImplementedInterface() {
            return VswitchEpa.class;
        }

        private final VswitchEpa.OvsAcceleration _ovsAcceleration;
        private final VswitchEpa.OvsOffload _ovsOffload;

        private Map<Class<? extends Augmentation<VswitchEpa>>, Augmentation<VswitchEpa>> augmentation = Collections.emptyMap();

        private VswitchEpaImpl(VswitchEpaBuilder base) {
            this._ovsAcceleration = base.getOvsAcceleration();
            this._ovsOffload = base.getOvsOffload();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public VswitchEpa.OvsAcceleration getOvsAcceleration() {
            return _ovsAcceleration;
        }
        
        @Override
        public VswitchEpa.OvsOffload getOvsOffload() {
            return _ovsOffload;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<VswitchEpa>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_ovsAcceleration);
            result = prime * result + Objects.hashCode(_ovsOffload);
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
            if (!VswitchEpa.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            VswitchEpa other = (VswitchEpa)obj;
            if (!Objects.equals(_ovsAcceleration, other.getOvsAcceleration())) {
                return false;
            }
            if (!Objects.equals(_ovsOffload, other.getOvsOffload())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VswitchEpaImpl otherImpl = (VswitchEpaImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VswitchEpa>>, Augmentation<VswitchEpa>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VswitchEpa");
            CodeHelpers.appendValue(helper, "_ovsAcceleration", _ovsAcceleration);
            CodeHelpers.appendValue(helper, "_ovsOffload", _ovsOffload);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
