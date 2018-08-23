package ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.Short;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class VnfrConnectionPointRefKey
 implements Identifier<VnfrConnectionPointRef> {
    private static final long serialVersionUID = -1518245190494016078L;
    private final Short _hopNumber;


    public VnfrConnectionPointRefKey(Short _hopNumber) {
    
    
        this._hopNumber = _hopNumber;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VnfrConnectionPointRefKey(VnfrConnectionPointRefKey source) {
        this._hopNumber = source._hopNumber;
    }


    public Short getHopNumber() {
        return _hopNumber;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_hopNumber);
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
        VnfrConnectionPointRefKey other = (VnfrConnectionPointRefKey) obj;
        if (!Objects.equals(_hopNumber, other._hopNumber)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(VnfrConnectionPointRefKey.class);
        CodeHelpers.appendValue(helper, "_hopNumber", _hopNumber);
        return helper.toString();
    }
}

