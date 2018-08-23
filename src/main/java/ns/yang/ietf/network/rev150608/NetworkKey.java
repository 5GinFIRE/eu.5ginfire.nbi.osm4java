package ns.yang.ietf.network.rev150608;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class NetworkKey
 implements Identifier<Network> {
    private static final long serialVersionUID = -4973572221161724124L;
    private final NetworkId _networkId;


    public NetworkKey(NetworkId _networkId) {
    
    
        this._networkId = _networkId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public NetworkKey(NetworkKey source) {
        this._networkId = source._networkId;
    }


    public NetworkId getNetworkId() {
        return _networkId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_networkId);
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
        NetworkKey other = (NetworkKey) obj;
        if (!Objects.equals(_networkId, other._networkId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(NetworkKey.class);
        CodeHelpers.appendValue(helper, "_networkId", _networkId);
        return helper.toString();
    }
}

