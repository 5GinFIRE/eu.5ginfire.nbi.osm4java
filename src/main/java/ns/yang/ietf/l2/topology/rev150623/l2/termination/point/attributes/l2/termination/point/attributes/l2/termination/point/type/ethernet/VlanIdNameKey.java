package ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.ethernet;
import com.google.common.base.MoreObjects;

import ns.yang.ietf.l2.topology.rev150623.Vlan;

import java.lang.Override;
import java.lang.String;
import java.util.Objects;

import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class VlanIdNameKey
 implements Identifier<VlanIdName> {
    private static final long serialVersionUID = 1261052339139552490L;
    private final Vlan _vlanId;


    public VlanIdNameKey(Vlan _vlanId) {
    
    
        this._vlanId = _vlanId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VlanIdNameKey(VlanIdNameKey source) {
        this._vlanId = source._vlanId;
    }


    public Vlan getVlanId() {
        return _vlanId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_vlanId);
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
        VlanIdNameKey other = (VlanIdNameKey) obj;
        if (!Objects.equals(_vlanId, other._vlanId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(VlanIdNameKey.class);
        CodeHelpers.appendValue(helper, "_vlanId", _vlanId);
        return helper.toString();
    }
}

