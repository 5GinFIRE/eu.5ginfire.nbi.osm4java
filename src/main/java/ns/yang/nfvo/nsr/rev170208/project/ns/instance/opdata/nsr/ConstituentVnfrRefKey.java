package ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class ConstituentVnfrRefKey
 implements Identifier<ConstituentVnfrRef> {
    private static final long serialVersionUID = 2476453428846674934L;
    private final String _vnfrId;


    public ConstituentVnfrRefKey(String _vnfrId) {
    
    
        this._vnfrId = _vnfrId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ConstituentVnfrRefKey(ConstituentVnfrRefKey source) {
        this._vnfrId = source._vnfrId;
    }


    public String getVnfrId() {
        return _vnfrId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_vnfrId);
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
        ConstituentVnfrRefKey other = (ConstituentVnfrRefKey) obj;
        if (!Objects.equals(_vnfrId, other._vnfrId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(ConstituentVnfrRefKey.class);
        CodeHelpers.appendValue(helper, "_vnfrId", _vnfrId);
        return helper.toString();
    }
}

