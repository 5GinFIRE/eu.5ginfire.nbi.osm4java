package ns.yang.nfvo.nsr.rev170208.ns.instance.config.params;

import com.google.common.base.MoreObjects;

import ns.yang.ietf.yang.types.rev130715.Uuid;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class VnfdPlacementGroupMapsKey implements Identifier<VnfdPlacementGroupMaps> {
	private static final long serialVersionUID = 7931719382796888613L;
	private final Uuid _vnfdIdRef;
	private final Object _placementGroupRef;

	public VnfdPlacementGroupMapsKey(Object _placementGroupRef, Uuid _vnfdIdRef) {

		this._vnfdIdRef = _vnfdIdRef;
		this._placementGroupRef = _placementGroupRef;
	}

	/**
	 * Creates a copy from Source Object.
	 *
	 * @param source Source object
	 */
	public VnfdPlacementGroupMapsKey(VnfdPlacementGroupMapsKey source) {
		this._vnfdIdRef = source._vnfdIdRef;
		this._placementGroupRef = source._placementGroupRef;
	}

	public Uuid getVnfdIdRef() {
		return _vnfdIdRef;
	}

	public Object getPlacementGroupRef() {
		return _placementGroupRef;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Objects.hashCode(_vnfdIdRef);
		result = prime * result + Objects.hashCode(_placementGroupRef);
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
		VnfdPlacementGroupMapsKey other = (VnfdPlacementGroupMapsKey) obj;
		if (!Objects.equals(_vnfdIdRef, other._vnfdIdRef)) {
			return false;
		}
		if (!Objects.equals(_placementGroupRef, other._placementGroupRef)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(VnfdPlacementGroupMapsKey.class);
		CodeHelpers.appendValue(helper, "_vnfdIdRef", _vnfdIdRef);
		CodeHelpers.appendValue(helper, "_placementGroupRef", _placementGroupRef);
		return helper.toString();
	}
}
