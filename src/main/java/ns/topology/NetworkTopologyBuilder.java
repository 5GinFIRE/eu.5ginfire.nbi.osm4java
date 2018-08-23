package ns.topology;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.topology.network.topology.Topology;

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
 * Class that builds {@link NetworkTopology} instances.
 * 
 * @see NetworkTopology
 *
 */
public class NetworkTopologyBuilder implements Builder<NetworkTopology> {

    private List<Topology> _topology;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("network-topology");

    Map<Class<? extends Augmentation<NetworkTopology>>, Augmentation<NetworkTopology>> augmentation = Collections.emptyMap();

    public NetworkTopologyBuilder() {
    }

    public NetworkTopologyBuilder(NetworkTopology base) {
        this._topology = base.getTopology();
        if (base instanceof NetworkTopologyImpl) {
            NetworkTopologyImpl impl = (NetworkTopologyImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<NetworkTopology> casted =(AugmentationHolder<NetworkTopology>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<Topology> getTopology() {
        return _topology;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<NetworkTopology>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public NetworkTopologyBuilder setTopology(final List<Topology> values) {
        this._topology = values;
        return this;
    }
    
    
    public NetworkTopologyBuilder addAugmentation(Class<? extends Augmentation<NetworkTopology>> augmentationType, Augmentation<NetworkTopology> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NetworkTopologyBuilder removeAugmentation(Class<? extends Augmentation<NetworkTopology>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NetworkTopology build() {
        return new NetworkTopologyImpl(this);
    }

    private static final class NetworkTopologyImpl implements NetworkTopology {

        @Override
        public Class<NetworkTopology> getImplementedInterface() {
            return NetworkTopology.class;
        }

        private final List<Topology> _topology;

        private Map<Class<? extends Augmentation<NetworkTopology>>, Augmentation<NetworkTopology>> augmentation = Collections.emptyMap();

        private NetworkTopologyImpl(NetworkTopologyBuilder base) {
            this._topology = base.getTopology();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public List<Topology> getTopology() {
            return _topology;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<NetworkTopology>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_topology);
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
            if (!NetworkTopology.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            NetworkTopology other = (NetworkTopology)obj;
            if (!Objects.equals(_topology, other.getTopology())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NetworkTopologyImpl otherImpl = (NetworkTopologyImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<NetworkTopology>>, Augmentation<NetworkTopology>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("NetworkTopology");
            CodeHelpers.appendValue(helper, "_topology", _topology);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
