package ns.topology.network.topology.topology;
import com.google.common.base.MoreObjects;

import ns.topology.TopologyId;

import java.lang.Override;
import java.lang.String;
import java.util.Objects;

import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class UnderlayTopologyKey
 implements Identifier<UnderlayTopology> {
    private static final long serialVersionUID = -3781551194081141167L;
    private final TopologyId _topologyRef;


    public UnderlayTopologyKey(TopologyId _topologyRef) {
    
    
        this._topologyRef = _topologyRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public UnderlayTopologyKey(UnderlayTopologyKey source) {
        this._topologyRef = source._topologyRef;
    }


    public TopologyId getTopologyRef() {
        return _topologyRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_topologyRef);
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
        UnderlayTopologyKey other = (UnderlayTopologyKey) obj;
        if (!Objects.equals(_topologyRef, other._topologyRef)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(UnderlayTopologyKey.class);
        CodeHelpers.appendValue(helper, "_topologyRef", _topologyRef);
        return helper.toString();
    }
}

