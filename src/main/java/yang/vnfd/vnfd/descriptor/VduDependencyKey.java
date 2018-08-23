package yang.vnfd.vnfd.descriptor;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class VduDependencyKey
 implements Identifier<VduDependency> {
    private static final long serialVersionUID = -9063807131586796668L;
    private final String _vduSourceRef;


    public VduDependencyKey(String _vduSourceRef) {
    
    
        this._vduSourceRef = _vduSourceRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VduDependencyKey(VduDependencyKey source) {
        this._vduSourceRef = source._vduSourceRef;
    }


    public String getVduSourceRef() {
        return _vduSourceRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_vduSourceRef);
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
        VduDependencyKey other = (VduDependencyKey) obj;
        if (!Objects.equals(_vduSourceRef, other._vduSourceRef)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(VduDependencyKey.class);
        CodeHelpers.appendValue(helper, "_vduSourceRef", _vduSourceRef);
        return helper.toString();
    }
}

