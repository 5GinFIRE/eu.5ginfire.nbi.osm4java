package ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.inet.types.rev100924.IpAddress;
import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;

import java.lang.Boolean;
import java.lang.Class;
import java.lang.Long;
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
 * Class that builds {@link DhcpParams} instances.
 * 
 * @see DhcpParams
 *
 */
public class DhcpParamsBuilder implements Builder<DhcpParams> {

    private Long _count;
    private IpAddress _startAddress;
    private Boolean _enabled;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("dhcp-params");

    Map<Class<? extends Augmentation<DhcpParams>>, Augmentation<DhcpParams>> augmentation = Collections.emptyMap();

    public DhcpParamsBuilder() {
    }

    public DhcpParamsBuilder(DhcpParams base) {
        this._count = base.getCount();
        this._startAddress = base.getStartAddress();
        this._enabled = base.isEnabled();
        if (base instanceof DhcpParamsImpl) {
            DhcpParamsImpl impl = (DhcpParamsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<DhcpParams> casted =(AugmentationHolder<DhcpParams>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public Long getCount() {
        return _count;
    }
    
    public IpAddress getStartAddress() {
        return _startAddress;
    }
    
    public Boolean isEnabled() {
        return _enabled;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<DhcpParams>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    private static void checkCountRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public DhcpParamsBuilder setCount(final Long value) {
    if (value != null) {
        checkCountRange(value);
        
    }
        this._count = value;
        return this;
    }
    
    public DhcpParamsBuilder setStartAddress(final IpAddress value) {
        this._startAddress = value;
        return this;
    }
    
    public DhcpParamsBuilder setEnabled(final Boolean value) {
        this._enabled = value;
        return this;
    }
    
    public DhcpParamsBuilder addAugmentation(Class<? extends Augmentation<DhcpParams>> augmentationType, Augmentation<DhcpParams> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public DhcpParamsBuilder removeAugmentation(Class<? extends Augmentation<DhcpParams>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public DhcpParams build() {
        return new DhcpParamsImpl(this);
    }

    private static final class DhcpParamsImpl implements DhcpParams {

        @Override
        public Class<DhcpParams> getImplementedInterface() {
            return DhcpParams.class;
        }

        private final Long _count;
        private final IpAddress _startAddress;
        private final Boolean _enabled;

        private Map<Class<? extends Augmentation<DhcpParams>>, Augmentation<DhcpParams>> augmentation = Collections.emptyMap();

        private DhcpParamsImpl(DhcpParamsBuilder base) {
            this._count = base.getCount();
            this._startAddress = base.getStartAddress();
            this._enabled = base.isEnabled();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public Long getCount() {
            return _count;
        }
        
        @Override
        public IpAddress getStartAddress() {
            return _startAddress;
        }
        
        @Override
        public Boolean isEnabled() {
            return _enabled;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<DhcpParams>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_count);
            result = prime * result + Objects.hashCode(_startAddress);
            result = prime * result + Objects.hashCode(_enabled);
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
            if (!DhcpParams.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            DhcpParams other = (DhcpParams)obj;
            if (!Objects.equals(_count, other.getCount())) {
                return false;
            }
            if (!Objects.equals(_startAddress, other.getStartAddress())) {
                return false;
            }
            if (!Objects.equals(_enabled, other.isEnabled())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                DhcpParamsImpl otherImpl = (DhcpParamsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<DhcpParams>>, Augmentation<DhcpParams>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("DhcpParams");
            CodeHelpers.appendValue(helper, "_count", _count);
            CodeHelpers.appendValue(helper, "_startAddress", _startAddress);
            CodeHelpers.appendValue(helper, "_enabled", _enabled);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
