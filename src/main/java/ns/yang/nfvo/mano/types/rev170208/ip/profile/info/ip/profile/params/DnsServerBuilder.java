package ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.inet.types.rev100924.IpAddress;
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
 * Class that builds {@link DnsServer} instances.
 * 
 * @see DnsServer
 *
 */
public class DnsServerBuilder implements Builder<DnsServer> {

    private IpAddress _address;
    private DnsServerKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("dns-server");

    Map<Class<? extends Augmentation<DnsServer>>, Augmentation<DnsServer>> augmentation = Collections.emptyMap();

    public DnsServerBuilder() {
    }

    public DnsServerBuilder(DnsServer base) {
        if (base.key() == null) {
            this.key = new DnsServerKey(
                base.getAddress()
            );
            this._address = base.getAddress();
        } else {
            this.key = base.key();
            this._address = key.getAddress();
        }
        if (base instanceof DnsServerImpl) {
            DnsServerImpl impl = (DnsServerImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<DnsServer> casted =(AugmentationHolder<DnsServer>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public DnsServerKey key() {
        return key;
    }
    
    public IpAddress getAddress() {
        return _address;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<DnsServer>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public DnsServerBuilder withKey(final DnsServerKey key) {
        this.key = key;
        return this;
    }
    
    public DnsServerBuilder setAddress(final IpAddress value) {
        this._address = value;
        return this;
    }
    
    public DnsServerBuilder addAugmentation(Class<? extends Augmentation<DnsServer>> augmentationType, Augmentation<DnsServer> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public DnsServerBuilder removeAugmentation(Class<? extends Augmentation<DnsServer>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public DnsServer build() {
        return new DnsServerImpl(this);
    }

    private static final class DnsServerImpl implements DnsServer {

        @Override
        public Class<DnsServer> getImplementedInterface() {
            return DnsServer.class;
        }

        private final IpAddress _address;
        private final DnsServerKey key;

        private Map<Class<? extends Augmentation<DnsServer>>, Augmentation<DnsServer>> augmentation = Collections.emptyMap();

        private DnsServerImpl(DnsServerBuilder base) {
            if (base.key() == null) {
                this.key = new DnsServerKey(
                    base.getAddress()
                );
                this._address = base.getAddress();
            } else {
                this.key = base.key();
                this._address = key.getAddress();
            }
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public DnsServerKey key() {
            return key;
        }
        
        @Override
        public IpAddress getAddress() {
            return _address;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<DnsServer>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_address);
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
            if (!DnsServer.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            DnsServer other = (DnsServer)obj;
            if (!Objects.equals(_address, other.getAddress())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                DnsServerImpl otherImpl = (DnsServerImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<DnsServer>>, Augmentation<DnsServer>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("DnsServer");
            CodeHelpers.appendValue(helper, "_address", _address);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
