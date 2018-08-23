package ns.topology.network.topology.topology;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.topology.$YangModuleInfoImpl;
import ns.topology.NodeId;
import ns.topology.network.topology.topology.node.TerminationPoint;
import ns.topology.node.attributes.SupportingNode;

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
 * Class that builds {@link Node} instances.
 * 
 * @see Node
 *
 */
public class NodeBuilder implements Builder<Node> {

    private NodeId _nodeId;
    private List<SupportingNode> _supportingNode;
    private List<TerminationPoint> _terminationPoint;
    private NodeKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("node");

    Map<Class<? extends Augmentation<Node>>, Augmentation<Node>> augmentation = Collections.emptyMap();

    public NodeBuilder() {
    }
    public NodeBuilder(ns.topology.NodeAttributes arg) {
        this._nodeId = arg.getNodeId();
        this._supportingNode = arg.getSupportingNode();
    }

    public NodeBuilder(Node base) {
        if (base.key() == null) {
            this.key = new NodeKey(
                base.getNodeId()
            );
            this._nodeId = base.getNodeId();
        } else {
            this.key = base.key();
            this._nodeId = key.getNodeId();
        }
        this._supportingNode = base.getSupportingNode();
        this._terminationPoint = base.getTerminationPoint();
        if (base instanceof NodeImpl) {
            NodeImpl impl = (NodeImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Node> casted =(AugmentationHolder<Node>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>model.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NodeAttributes</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ns.topology.NodeAttributes) {
            this._nodeId = ((ns.topology.NodeAttributes)arg).getNodeId();
            this._supportingNode = ((ns.topology.NodeAttributes)arg).getSupportingNode();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[model.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NodeAttributes]");
    }

    public NodeKey key() {
        return key;
    }
    
    public NodeId getNodeId() {
        return _nodeId;
    }
    
    public List<SupportingNode> getSupportingNode() {
        return _supportingNode;
    }
    
    public List<TerminationPoint> getTerminationPoint() {
        return _terminationPoint;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Node>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public NodeBuilder withKey(final NodeKey key) {
        this.key = key;
        return this;
    }
    
    public NodeBuilder setNodeId(final NodeId value) {
        this._nodeId = value;
        return this;
    }
    public NodeBuilder setSupportingNode(final List<SupportingNode> values) {
        this._supportingNode = values;
        return this;
    }
    
    public NodeBuilder setTerminationPoint(final List<TerminationPoint> values) {
        this._terminationPoint = values;
        return this;
    }
    
    
    public NodeBuilder addAugmentation(Class<? extends Augmentation<Node>> augmentationType, Augmentation<Node> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NodeBuilder removeAugmentation(Class<? extends Augmentation<Node>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Node build() {
        return new NodeImpl(this);
    }

    private static final class NodeImpl implements Node {

        @Override
        public Class<Node> getImplementedInterface() {
            return Node.class;
        }

        private final NodeId _nodeId;
        private final List<SupportingNode> _supportingNode;
        private final List<TerminationPoint> _terminationPoint;
        private final NodeKey key;

        private Map<Class<? extends Augmentation<Node>>, Augmentation<Node>> augmentation = Collections.emptyMap();

        private NodeImpl(NodeBuilder base) {
            if (base.key() == null) {
                this.key = new NodeKey(
                    base.getNodeId()
                );
                this._nodeId = base.getNodeId();
            } else {
                this.key = base.key();
                this._nodeId = key.getNodeId();
            }
            this._supportingNode = base.getSupportingNode();
            this._terminationPoint = base.getTerminationPoint();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public NodeKey key() {
            return key;
        }
        
        @Override
        public NodeId getNodeId() {
            return _nodeId;
        }
        
        @Override
        public List<SupportingNode> getSupportingNode() {
            return _supportingNode;
        }
        
        @Override
        public List<TerminationPoint> getTerminationPoint() {
            return _terminationPoint;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Node>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_nodeId);
            result = prime * result + Objects.hashCode(_supportingNode);
            result = prime * result + Objects.hashCode(_terminationPoint);
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
            if (!Node.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Node other = (Node)obj;
            if (!Objects.equals(_nodeId, other.getNodeId())) {
                return false;
            }
            if (!Objects.equals(_supportingNode, other.getSupportingNode())) {
                return false;
            }
            if (!Objects.equals(_terminationPoint, other.getTerminationPoint())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NodeImpl otherImpl = (NodeImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Node>>, Augmentation<Node>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Node");
            CodeHelpers.appendValue(helper, "_nodeId", _nodeId);
            CodeHelpers.appendValue(helper, "_supportingNode", _supportingNode);
            CodeHelpers.appendValue(helper, "_terminationPoint", _terminationPoint);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
