package ns.yang.nfvo.nsd.rev170228.nsd.vld.vld;
import com.google.common.base.MoreObjects;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class VnfdConnectionPointRefKey
 implements Identifier<VnfdConnectionPointRef> {
    private static final long serialVersionUID = -4571246318647525705L;
    private final String _memberVnfIndexRef;
    private final Object _vnfdConnectionPointRef;


    public VnfdConnectionPointRefKey(String _memberVnfIndexRef, Object _vnfdConnectionPointRef) {
    
    
        this._memberVnfIndexRef = _memberVnfIndexRef;
        this._vnfdConnectionPointRef = _vnfdConnectionPointRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VnfdConnectionPointRefKey(VnfdConnectionPointRefKey source) {
        this._memberVnfIndexRef = source._memberVnfIndexRef;
        this._vnfdConnectionPointRef = source._vnfdConnectionPointRef;
    }


    public String getMemberVnfIndexRef() {
        return _memberVnfIndexRef;
    }
    
    public Object getVnfdConnectionPointRef() {
        return _vnfdConnectionPointRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_memberVnfIndexRef);
        result = prime * result + Objects.hashCode(_vnfdConnectionPointRef);
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
        VnfdConnectionPointRefKey other = (VnfdConnectionPointRefKey) obj;
        if (!Objects.equals(_memberVnfIndexRef, other._memberVnfIndexRef)) {
            return false;
        }
        if (!Objects.equals(_vnfdConnectionPointRef, other._vnfdConnectionPointRef)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(VnfdConnectionPointRefKey.class);
        CodeHelpers.appendValue(helper, "_memberVnfIndexRef", _memberVnfIndexRef);
        CodeHelpers.appendValue(helper, "_vnfdConnectionPointRef", _vnfdConnectionPointRef);
        return helper.toString();
    }
}

