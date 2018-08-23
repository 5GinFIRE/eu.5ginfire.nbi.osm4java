package ns.topology.node.attributes;
import com.google.common.base.MoreObjects;

import ns.topology.NodeId;
import ns.topology.TopologyId;

import java.lang.Override;
import java.lang.String;
import java.util.Objects;

import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class SupportingNodeKey
 implements Identifier<SupportingNode> {
    private static final long serialVersionUID = -6473540922995959908L;
    private final TopologyId _topologyRef;
    private final NodeId _nodeRef;


    public SupportingNodeKey(NodeId _nodeRef, TopologyId _topologyRef) {
    
    
        this._topologyRef = _topologyRef;
        this._nodeRef = _nodeRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public SupportingNodeKey(SupportingNodeKey source) {
        this._topologyRef = source._topologyRef;
        this._nodeRef = source._nodeRef;
    }


    public TopologyId getTopologyRef() {
        return _topologyRef;
    }
    
    public NodeId getNodeRef() {
        return _nodeRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_topologyRef);
        result = prime * result + Objects.hashCode(_nodeRef);
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        SupportingNodeKey other = (SupportingNodeKey) obj;
        if (!Objects.equals(_topologyRef, other._topologyRef)) {
            return false;
        }
        if (!Objects.equals(_nodeRef, other._nodeRef)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(SupportingNodeKey.class);
        CodeHelpers.appendValue(helper, "_topologyRef", _topologyRef);
        CodeHelpers.appendValue(helper, "_nodeRef", _nodeRef);
        return helper.toString();
    }
}

