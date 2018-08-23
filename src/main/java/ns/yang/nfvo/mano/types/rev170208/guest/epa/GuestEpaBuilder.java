package ns.yang.nfvo.mano.types.rev170208.guest.epa;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.NumaPolicy;
import ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.PcieDevice;

import java.lang.Boolean;
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
 * Class that builds {@link GuestEpa} instances.
 * 
 * @see GuestEpa
 *
 */
public class GuestEpaBuilder implements Builder<GuestEpa> {

    private GuestEpa.CpuPinningPolicy _cpuPinningPolicy;
    private GuestEpa.CpuThreadPinningPolicy _cpuThreadPinningPolicy;
    private GuestEpa.MempageSize _mempageSize;
    private NumaPolicy _numaPolicy;
    private List<PcieDevice> _pcieDevice;
    private Boolean _trustedExecution;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("guest-epa");

    Map<Class<? extends Augmentation<GuestEpa>>, Augmentation<GuestEpa>> augmentation = Collections.emptyMap();

    public GuestEpaBuilder() {
    }

    public GuestEpaBuilder(GuestEpa base) {
        this._cpuPinningPolicy = base.getCpuPinningPolicy();
        this._cpuThreadPinningPolicy = base.getCpuThreadPinningPolicy();
        this._mempageSize = base.getMempageSize();
        this._numaPolicy = base.getNumaPolicy();
        this._pcieDevice = base.getPcieDevice();
        this._trustedExecution = base.isTrustedExecution();
        if (base instanceof GuestEpaImpl) {
            GuestEpaImpl impl = (GuestEpaImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<GuestEpa> casted =(AugmentationHolder<GuestEpa>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public GuestEpa.CpuPinningPolicy getCpuPinningPolicy() {
        return _cpuPinningPolicy;
    }
    
    public GuestEpa.CpuThreadPinningPolicy getCpuThreadPinningPolicy() {
        return _cpuThreadPinningPolicy;
    }
    
    public GuestEpa.MempageSize getMempageSize() {
        return _mempageSize;
    }
    
    public NumaPolicy getNumaPolicy() {
        return _numaPolicy;
    }
    
    public List<PcieDevice> getPcieDevice() {
        return _pcieDevice;
    }
    
    public Boolean isTrustedExecution() {
        return _trustedExecution;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<GuestEpa>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public GuestEpaBuilder setCpuPinningPolicy(final GuestEpa.CpuPinningPolicy value) {
        this._cpuPinningPolicy = value;
        return this;
    }
    
    public GuestEpaBuilder setCpuThreadPinningPolicy(final GuestEpa.CpuThreadPinningPolicy value) {
        this._cpuThreadPinningPolicy = value;
        return this;
    }
    
    public GuestEpaBuilder setMempageSize(final GuestEpa.MempageSize value) {
        this._mempageSize = value;
        return this;
    }
    
    public GuestEpaBuilder setNumaPolicy(final NumaPolicy value) {
        this._numaPolicy = value;
        return this;
    }
    public GuestEpaBuilder setPcieDevice(final List<PcieDevice> values) {
        this._pcieDevice = values;
        return this;
    }
    
    
    public GuestEpaBuilder setTrustedExecution(final Boolean value) {
        this._trustedExecution = value;
        return this;
    }
    
    public GuestEpaBuilder addAugmentation(Class<? extends Augmentation<GuestEpa>> augmentationType, Augmentation<GuestEpa> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public GuestEpaBuilder removeAugmentation(Class<? extends Augmentation<GuestEpa>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public GuestEpa build() {
        return new GuestEpaImpl(this);
    }

    private static final class GuestEpaImpl implements GuestEpa {

        @Override
        public Class<GuestEpa> getImplementedInterface() {
            return GuestEpa.class;
        }

        private final GuestEpa.CpuPinningPolicy _cpuPinningPolicy;
        private final GuestEpa.CpuThreadPinningPolicy _cpuThreadPinningPolicy;
        private final GuestEpa.MempageSize _mempageSize;
        private final NumaPolicy _numaPolicy;
        private final List<PcieDevice> _pcieDevice;
        private final Boolean _trustedExecution;

        private Map<Class<? extends Augmentation<GuestEpa>>, Augmentation<GuestEpa>> augmentation = Collections.emptyMap();

        private GuestEpaImpl(GuestEpaBuilder base) {
            this._cpuPinningPolicy = base.getCpuPinningPolicy();
            this._cpuThreadPinningPolicy = base.getCpuThreadPinningPolicy();
            this._mempageSize = base.getMempageSize();
            this._numaPolicy = base.getNumaPolicy();
            this._pcieDevice = base.getPcieDevice();
            this._trustedExecution = base.isTrustedExecution();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public GuestEpa.CpuPinningPolicy getCpuPinningPolicy() {
            return _cpuPinningPolicy;
        }
        
        @Override
        public GuestEpa.CpuThreadPinningPolicy getCpuThreadPinningPolicy() {
            return _cpuThreadPinningPolicy;
        }
        
        @Override
        public GuestEpa.MempageSize getMempageSize() {
            return _mempageSize;
        }
        
        @Override
        public NumaPolicy getNumaPolicy() {
            return _numaPolicy;
        }
        
        @Override
        public List<PcieDevice> getPcieDevice() {
            return _pcieDevice;
        }
        
        @Override
        public Boolean isTrustedExecution() {
            return _trustedExecution;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<GuestEpa>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cpuPinningPolicy);
            result = prime * result + Objects.hashCode(_cpuThreadPinningPolicy);
            result = prime * result + Objects.hashCode(_mempageSize);
            result = prime * result + Objects.hashCode(_numaPolicy);
            result = prime * result + Objects.hashCode(_pcieDevice);
            result = prime * result + Objects.hashCode(_trustedExecution);
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
            if (!GuestEpa.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            GuestEpa other = (GuestEpa)obj;
            if (!Objects.equals(_cpuPinningPolicy, other.getCpuPinningPolicy())) {
                return false;
            }
            if (!Objects.equals(_cpuThreadPinningPolicy, other.getCpuThreadPinningPolicy())) {
                return false;
            }
            if (!Objects.equals(_mempageSize, other.getMempageSize())) {
                return false;
            }
            if (!Objects.equals(_numaPolicy, other.getNumaPolicy())) {
                return false;
            }
            if (!Objects.equals(_pcieDevice, other.getPcieDevice())) {
                return false;
            }
            if (!Objects.equals(_trustedExecution, other.isTrustedExecution())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                GuestEpaImpl otherImpl = (GuestEpaImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<GuestEpa>>, Augmentation<GuestEpa>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("GuestEpa");
            CodeHelpers.appendValue(helper, "_cpuPinningPolicy", _cpuPinningPolicy);
            CodeHelpers.appendValue(helper, "_cpuThreadPinningPolicy", _cpuThreadPinningPolicy);
            CodeHelpers.appendValue(helper, "_mempageSize", _mempageSize);
            CodeHelpers.appendValue(helper, "_numaPolicy", _numaPolicy);
            CodeHelpers.appendValue(helper, "_pcieDevice", _pcieDevice);
            CodeHelpers.appendValue(helper, "_trustedExecution", _trustedExecution);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
