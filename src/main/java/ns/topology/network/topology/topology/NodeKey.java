package ns.topology.network.topology.topology;
import com.google.common.base.MoreObjects;

import ns.topology.NodeId;

import java.lang.Override;
import java.lang.String;
import java.util.Objects;

import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class NodeKey
 implements Identifier<Node> {
    private static final long serialVersionUID = -981934742417623433L;
    private final NodeId _nodeId;


    public NodeKey(NodeId _nodeId) {
    
    
        this._nodeId = _nodeId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public NodeKey(NodeKey source) {
        this._nodeId = source._nodeId;
    }


    public NodeId getNodeId() {
        return _nodeId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_nodeId);
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
        NodeKey other = (NodeKey) obj;
        if (!Objects.equals(_nodeId, other._nodeId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(NodeKey.class);
        CodeHelpers.appendValue(helper, "_nodeId", _nodeId);
        return helper.toString();
    }
}

