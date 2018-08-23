package ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.om.numa.type.paired.threads.paired.threads;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.Short;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class PairedThreadIdsKey
 implements Identifier<PairedThreadIds> {
    private static final long serialVersionUID = 5657393331481948923L;
    private final Short _threadA;


    public PairedThreadIdsKey(Short _threadA) {
    
    
        this._threadA = _threadA;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public PairedThreadIdsKey(PairedThreadIdsKey source) {
        this._threadA = source._threadA;
    }


    public Short getThreadA() {
        return _threadA;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_threadA);
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
        PairedThreadIdsKey other = (PairedThreadIdsKey) obj;
        if (!Objects.equals(_threadA, other._threadA)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(PairedThreadIdsKey.class);
        CodeHelpers.appendValue(helper, "_threadA", _threadA);
        return helper.toString();
    }
}

