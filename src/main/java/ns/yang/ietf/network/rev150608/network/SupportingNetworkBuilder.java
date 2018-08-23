package ns.yang.ietf.network.rev150608.network;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.network.rev150608.$YangModuleInfoImpl;
import ns.yang.ietf.network.rev150608.NetworkId;

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
 * Class that builds {@link SupportingNetwork} instances.
 * 
 * @see SupportingNetwork
 *
 */
public class SupportingNetworkBuilder implements Builder<SupportingNetwork> {

    private NetworkId _networkRef;
    private SupportingNetworkKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("supporting-network");

    Map<Class<? extends Augmentation<SupportingNetwork>>, Augmentation<SupportingNetwork>> augmentation = Collections.emptyMap();

    public SupportingNetworkBuilder() {
    }

    public SupportingNetworkBuilder(SupportingNetwork base) {
        if (base.key() == null) {
            this.key = new SupportingNetworkKey(
                base.getNetworkRef()
            );
            this._networkRef = base.getNetworkRef();
        } else {
            this.key = base.key();
            this._networkRef = key.getNetworkRef();
        }
        if (base instanceof SupportingNetworkImpl) {
            SupportingNetworkImpl impl = (SupportingNetworkImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<SupportingNetwork> casted =(AugmentationHolder<SupportingNetwork>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public SupportingNetworkKey key() {
        return key;
    }
    
    public NetworkId getNetworkRef() {
        return _networkRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<SupportingNetwork>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public SupportingNetworkBuilder withKey(final SupportingNetworkKey key) {
        this.key = key;
        return this;
    }
    
    public SupportingNetworkBuilder setNetworkRef(final NetworkId value) {
        this._networkRef = value;
        return this;
    }
    
    public SupportingNetworkBuilder addAugmentation(Class<? extends Augmentation<SupportingNetwork>> augmentationType, Augmentation<SupportingNetwork> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public SupportingNetworkBuilder removeAugmentation(Class<? extends Augmentation<SupportingNetwork>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public SupportingNetwork build() {
        return new SupportingNetworkImpl(this);
    }

    private static final class SupportingNetworkImpl implements SupportingNetwork {

        @Override
        public Class<SupportingNetwork> getImplementedInterface() {
            return SupportingNetwork.class;
        }

        private final NetworkId _networkRef;
        private final SupportingNetworkKey key;

        private Map<Class<? extends Augmentation<SupportingNetwork>>, Augmentation<SupportingNetwork>> augmentation = Collections.emptyMap();

        private SupportingNetworkImpl(SupportingNetworkBuilder base) {
            if (base.key() == null) {
                this.key = new SupportingNetworkKey(
                    base.getNetworkRef()
                );
                this._networkRef = base.getNetworkRef();
            } else {
                this.key = base.key();
                this._networkRef = key.getNetworkRef();
            }
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public SupportingNetworkKey key() {
            return key;
        }
        
        @Override
        public NetworkId getNetworkRef() {
            return _networkRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<SupportingNetwork>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_networkRef);
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
            if (!SupportingNetwork.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            SupportingNetwork other = (SupportingNetwork)obj;
            if (!Objects.equals(_networkRef, other.getNetworkRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SupportingNetworkImpl otherImpl = (SupportingNetworkImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<SupportingNetwork>>, Augmentation<SupportingNetwork>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("SupportingNetwork");
            CodeHelpers.appendValue(helper, "_networkRef", _networkRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
