package ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr;
import com.google.common.base.MoreObjects;

import ns.yang.ietf.yang.types.rev130715.Uuid;

import java.lang.Override;
import java.lang.String;
import java.util.Objects;

import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class VlrKey
 implements Identifier<Vlr> {
    private static final long serialVersionUID = -2500942180813186283L;
    private final Uuid _vlrRef;


    public VlrKey(Uuid _vlrRef) {
    
    
        this._vlrRef = _vlrRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VlrKey(VlrKey source) {
        this._vlrRef = source._vlrRef;
    }


    public Uuid getVlrRef() {
        return _vlrRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_vlrRef);
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
        VlrKey other = (VlrKey) obj;
        if (!Objects.equals(_vlrRef, other._vlrRef)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(VlrKey.class);
        CodeHelpers.appendValue(helper, "_vlrRef", _vlrRef);
        return helper.toString();
    }
}

