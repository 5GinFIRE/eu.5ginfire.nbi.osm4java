package ns.yang.ietf.network.topology.rev150608.network.node;
import com.google.common.base.MoreObjects;

import ns.yang.ietf.network.topology.rev150608.TpId;

import java.lang.Override;
import java.lang.String;
import java.util.Objects;

import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class TerminationPointKey
 implements Identifier<TerminationPoint> {
    private static final long serialVersionUID = -6070562666740578L;
    private final TpId _tpId;


    public TerminationPointKey(TpId _tpId) {
    
    
        this._tpId = _tpId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public TerminationPointKey(TerminationPointKey source) {
        this._tpId = source._tpId;
    }


    public TpId getTpId() {
        return _tpId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_tpId);
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
        TerminationPointKey other = (TerminationPointKey) obj;
        if (!Objects.equals(_tpId, other._tpId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(TerminationPointKey.class);
        CodeHelpers.appendValue(helper, "_tpId", _tpId);
        return helper.toString();
    }
}

