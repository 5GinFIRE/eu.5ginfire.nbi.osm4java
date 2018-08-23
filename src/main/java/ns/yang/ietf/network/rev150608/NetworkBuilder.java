package ns.yang.ietf.network.rev150608;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.network.rev150608.network.NetworkTypes;
import ns.yang.ietf.network.rev150608.network.Node;
import ns.yang.ietf.network.rev150608.network.SupportingNetwork;

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
 * Class that builds {@link Network} instances.
 * 
 * @see Network
 *
 */
public class NetworkBuilder implements Builder<Network> {

    private NetworkId _networkId;
    private NetworkTypes _networkTypes;
    private List<Node> _node;
    private List<SupportingNetwork> _supportingNetwork;
    private Boolean _serverProvided;
    private NetworkKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("network");

    Map<Class<? extends Augmentation<Network>>, Augmentation<Network>> augmentation = Collections.emptyMap();

    public NetworkBuilder() {
    }

    public NetworkBuilder(Network base) {
        if (base.key() == null) {
            this.key = new NetworkKey(
                base.getNetworkId()
            );
            this._networkId = base.getNetworkId();
        } else {
            this.key = base.key();
            this._networkId = key.getNetworkId();
        }
        this._networkTypes = base.getNetworkTypes();
        this._node = base.getNode();
        this._supportingNetwork = base.getSupportingNetwork();
        this._serverProvided = base.isServerProvided();
        if (base instanceof NetworkImpl) {
            NetworkImpl impl = (NetworkImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Network> casted =(AugmentationHolder<Network>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public NetworkKey key() {
        return key;
    }
    
    public NetworkId getNetworkId() {
        return _networkId;
    }
    
    public NetworkTypes getNetworkTypes() {
        return _networkTypes;
    }
    
    public List<Node> getNode() {
        return _node;
    }
    
    public List<SupportingNetwork> getSupportingNetwork() {
        return _supportingNetwork;
    }
    
    public Boolean isServerProvided() {
        return _serverProvided;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Network>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public NetworkBuilder withKey(final NetworkKey key) {
        this.key = key;
        return this;
    }
    
    public NetworkBuilder setNetworkId(final NetworkId value) {
        this._networkId = value;
        return this;
    }
    
    public NetworkBuilder setNetworkTypes(final NetworkTypes value) {
        this._networkTypes = value;
        return this;
    }
    public NetworkBuilder setNode(final List<Node> values) {
        this._node = values;
        return this;
    }
    
    public NetworkBuilder setSupportingNetwork(final List<SupportingNetwork> values) {
        this._supportingNetwork = values;
        return this;
    }
    
    
    public NetworkBuilder setServerProvided(final Boolean value) {
        this._serverProvided = value;
        return this;
    }
    
    public NetworkBuilder addAugmentation(Class<? extends Augmentation<Network>> augmentationType, Augmentation<Network> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NetworkBuilder removeAugmentation(Class<? extends Augmentation<Network>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Network build() {
        return new NetworkImpl(this);
    }

    private static final class NetworkImpl implements Network {

        @Override
        public Class<Network> getImplementedInterface() {
            return Network.class;
        }

        private final NetworkId _networkId;
        private final NetworkTypes _networkTypes;
        private final List<Node> _node;
        private final List<SupportingNetwork> _supportingNetwork;
        private final Boolean _serverProvided;
        private final NetworkKey key;

        private Map<Class<? extends Augmentation<Network>>, Augmentation<Network>> augmentation = Collections.emptyMap();

        private NetworkImpl(NetworkBuilder base) {
            if (base.key() == null) {
                this.key = new NetworkKey(
                    base.getNetworkId()
                );
                this._networkId = base.getNetworkId();
            } else {
                this.key = base.key();
                this._networkId = key.getNetworkId();
            }
            this._networkTypes = base.getNetworkTypes();
            this._node = base.getNode();
            this._supportingNetwork = base.getSupportingNetwork();
            this._serverProvided = base.isServerProvided();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public NetworkKey key() {
            return key;
        }
        
        @Override
        public NetworkId getNetworkId() {
            return _networkId;
        }
        
        @Override
        public NetworkTypes getNetworkTypes() {
            return _networkTypes;
        }
        
        @Override
        public List<Node> getNode() {
            return _node;
        }
        
        @Override
        public List<SupportingNetwork> getSupportingNetwork() {
            return _supportingNetwork;
        }
        
        @Override
        public Boolean isServerProvided() {
            return _serverProvided;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Network>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_networkId);
            result = prime * result + Objects.hashCode(_networkTypes);
            result = prime * result + Objects.hashCode(_node);
            result = prime * result + Objects.hashCode(_supportingNetwork);
            result = prime * result + Objects.hashCode(_serverProvided);
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
            if (!Network.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Network other = (Network)obj;
            if (!Objects.equals(_networkId, other.getNetworkId())) {
                return false;
            }
            if (!Objects.equals(_networkTypes, other.getNetworkTypes())) {
                return false;
            }
            if (!Objects.equals(_node, other.getNode())) {
                return false;
            }
            if (!Objects.equals(_supportingNetwork, other.getSupportingNetwork())) {
                return false;
            }
            if (!Objects.equals(_serverProvided, other.isServerProvided())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NetworkImpl otherImpl = (NetworkImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Network>>, Augmentation<Network>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Network");
            CodeHelpers.appendValue(helper, "_networkId", _networkId);
            CodeHelpers.appendValue(helper, "_networkTypes", _networkTypes);
            CodeHelpers.appendValue(helper, "_node", _node);
            CodeHelpers.appendValue(helper, "_supportingNetwork", _supportingNetwork);
            CodeHelpers.appendValue(helper, "_serverProvided", _serverProvided);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
