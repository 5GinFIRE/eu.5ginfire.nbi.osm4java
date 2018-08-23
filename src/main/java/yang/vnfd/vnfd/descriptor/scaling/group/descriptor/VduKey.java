package yang.vnfd.vnfd.descriptor.scaling.group.descriptor;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class VduKey
 implements Identifier<Vdu> {
    private static final long serialVersionUID = 2226673315494524689L;
    private final String _vduIdRef;


    public VduKey(String _vduIdRef) {
    
    
        this._vduIdRef = _vduIdRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VduKey(VduKey source) {
        this._vduIdRef = source._vduIdRef;
    }


    public String getVduIdRef() {
        return _vduIdRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_vduIdRef);
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
        VduKey other = (VduKey) obj;
        if (!Objects.equals(_vduIdRef, other._vduIdRef)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(VduKey.class);
        CodeHelpers.appendValue(helper, "_vduIdRef", _vduIdRef);
        return helper.toString();
    }
}

