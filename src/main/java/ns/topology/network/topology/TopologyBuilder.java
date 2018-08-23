package ns.topology.network.topology;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.topology.$YangModuleInfoImpl;
import ns.topology.TopologyId;
import ns.topology.network.topology.topology.Link;
import ns.topology.network.topology.topology.Node;
import ns.topology.network.topology.topology.TopologyTypes;
import ns.topology.network.topology.topology.UnderlayTopology;

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
 * Class that builds {@link Topology} instances.
 * 
 * @see Topology
 *
 */
public class TopologyBuilder implements Builder<Topology> {

    private List<Link> _link;
    private List<Node> _node;
    private TopologyId _topologyId;
    private TopologyTypes _topologyTypes;
    private List<UnderlayTopology> _underlayTopology;
    private Boolean _serverProvided;
    private TopologyKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("topology");

    Map<Class<? extends Augmentation<Topology>>, Augmentation<Topology>> augmentation = Collections.emptyMap();

    public TopologyBuilder() {
    }

    public TopologyBuilder(Topology base) {
        if (base.key() == null) {
            this.key = new TopologyKey(
                base.getTopologyId()
            );
            this._topologyId = base.getTopologyId();
        } else {
            this.key = base.key();
            this._topologyId = key.getTopologyId();
        }
        this._link = base.getLink();
        this._node = base.getNode();
        this._topologyTypes = base.getTopologyTypes();
        this._underlayTopology = base.getUnderlayTopology();
        this._serverProvided = base.isServerProvided();
        if (base instanceof TopologyImpl) {
            TopologyImpl impl = (TopologyImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Topology> casted =(AugmentationHolder<Topology>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public TopologyKey key() {
        return key;
    }
    
    public List<Link> getLink() {
        return _link;
    }
    
    public List<Node> getNode() {
        return _node;
    }
    
    public TopologyId getTopologyId() {
        return _topologyId;
    }
    
    public TopologyTypes getTopologyTypes() {
        return _topologyTypes;
    }
    
    public List<UnderlayTopology> getUnderlayTopology() {
        return _underlayTopology;
    }
    
    public Boolean isServerProvided() {
        return _serverProvided;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Topology>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public TopologyBuilder withKey(final TopologyKey key) {
        this.key = key;
        return this;
    }
    public TopologyBuilder setLink(final List<Link> values) {
        this._link = values;
        return this;
    }
    
    public TopologyBuilder setNode(final List<Node> values) {
        this._node = values;
        return this;
    }
    
    
    public TopologyBuilder setTopologyId(final TopologyId value) {
        this._topologyId = value;
        return this;
    }
    
    public TopologyBuilder setTopologyTypes(final TopologyTypes value) {
        this._topologyTypes = value;
        return this;
    }
    public TopologyBuilder setUnderlayTopology(final List<UnderlayTopology> values) {
        this._underlayTopology = values;
        return this;
    }
    
    
    public TopologyBuilder setServerProvided(final Boolean value) {
        this._serverProvided = value;
        return this;
    }
    
    public TopologyBuilder addAugmentation(Class<? extends Augmentation<Topology>> augmentationType, Augmentation<Topology> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public TopologyBuilder removeAugmentation(Class<? extends Augmentation<Topology>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Topology build() {
        return new TopologyImpl(this);
    }

    private static final class TopologyImpl implements Topology {

        @Override
        public Class<Topology> getImplementedInterface() {
            return Topology.class;
        }

        private final List<Link> _link;
        private final List<Node> _node;
        private final TopologyId _topologyId;
        private final TopologyTypes _topologyTypes;
        private final List<UnderlayTopology> _underlayTopology;
        private final Boolean _serverProvided;
        private final TopologyKey key;

        private Map<Class<? extends Augmentation<Topology>>, Augmentation<Topology>> augmentation = Collections.emptyMap();

        private TopologyImpl(TopologyBuilder base) {
            if (base.key() == null) {
                this.key = new TopologyKey(
                    base.getTopologyId()
                );
                this._topologyId = base.getTopologyId();
            } else {
                this.key = base.key();
                this._topologyId = key.getTopologyId();
            }
            this._link = base.getLink();
            this._node = base.getNode();
            this._topologyTypes = base.getTopologyTypes();
            this._underlayTopology = base.getUnderlayTopology();
            this._serverProvided = base.isServerProvided();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public TopologyKey key() {
            return key;
        }
        
        @Override
        public List<Link> getLink() {
            return _link;
        }
        
        @Override
        public List<Node> getNode() {
            return _node;
        }
        
        @Override
        public TopologyId getTopologyId() {
            return _topologyId;
        }
        
        @Override
        public TopologyTypes getTopologyTypes() {
            return _topologyTypes;
        }
        
        @Override
        public List<UnderlayTopology> getUnderlayTopology() {
            return _underlayTopology;
        }
        
        @Override
        public Boolean isServerProvided() {
            return _serverProvided;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Topology>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_link);
            result = prime * result + Objects.hashCode(_node);
            result = prime * result + Objects.hashCode(_topologyId);
            result = prime * result + Objects.hashCode(_topologyTypes);
            result = prime * result + Objects.hashCode(_underlayTopology);
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
            if (!Topology.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Topology other = (Topology)obj;
            if (!Objects.equals(_link, other.getLink())) {
                return false;
            }
            if (!Objects.equals(_node, other.getNode())) {
                return false;
            }
            if (!Objects.equals(_topologyId, other.getTopologyId())) {
                return false;
            }
            if (!Objects.equals(_topologyTypes, other.getTopologyTypes())) {
                return false;
            }
            if (!Objects.equals(_underlayTopology, other.getUnderlayTopology())) {
                return false;
            }
            if (!Objects.equals(_serverProvided, other.isServerProvided())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                TopologyImpl otherImpl = (TopologyImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Topology>>, Augmentation<Topology>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Topology");
            CodeHelpers.appendValue(helper, "_link", _link);
            CodeHelpers.appendValue(helper, "_node", _node);
            CodeHelpers.appendValue(helper, "_topologyId", _topologyId);
            CodeHelpers.appendValue(helper, "_topologyTypes", _topologyTypes);
            CodeHelpers.appendValue(helper, "_underlayTopology", _underlayTopology);
            CodeHelpers.appendValue(helper, "_serverProvided", _serverProvided);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
