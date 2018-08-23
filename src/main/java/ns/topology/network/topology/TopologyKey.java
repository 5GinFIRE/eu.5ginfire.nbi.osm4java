package ns.topology.network.topology;

import com.google.common.base.MoreObjects;

import ns.topology.TopologyId;

import java.lang.Override;
import java.lang.String;
import java.util.Objects;

import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class TopologyKey implements Identifier<Topology> {
	private static final long serialVersionUID = -8133105010422366945L;
	private final TopologyId _topologyId;

	public TopologyKey(TopologyId _topologyId) {

		this._topologyId = _topologyId;
	}

	/**
	 * Creates a copy from Source Object.
	 *
	 * @param source Source object
	 */
	public TopologyKey(TopologyKey source) {
		this._topologyId = source._topologyId;
	}

	public TopologyId getTopologyId() {
		return _topologyId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Objects.hashCode(_topologyId);
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
		TopologyKey other = (TopologyKey) obj;
		if (!Objects.equals(_topologyId, other._topologyId)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(TopologyKey.class);
		CodeHelpers.appendValue(helper, "_topologyId", _topologyId);
		return helper.toString();
	}
}
