package ns.yang.ietf.network.topology.rev150608.network.link;
import com.google.common.base.MoreObjects;

import ns.yang.ietf.network.rev150608.NetworkId;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class SupportingLinkKey
 implements Identifier<SupportingLink> {
    private static final long serialVersionUID = 5267690691179264108L;
    private final NetworkId _networkRef;
    private final Object _linkRef;


    public SupportingLinkKey(Object _linkRef, NetworkId _networkRef) {
    
    
        this._networkRef = _networkRef;
        this._linkRef = _linkRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public SupportingLinkKey(SupportingLinkKey source) {
        this._networkRef = source._networkRef;
        this._linkRef = source._linkRef;
    }


    public NetworkId getNetworkRef() {
        return _networkRef;
    }
    
    public Object getLinkRef() {
        return _linkRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_networkRef);
        result = prime * result + Objects.hashCode(_linkRef);
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
        SupportingLinkKey other = (SupportingLinkKey) obj;
        if (!Objects.equals(_networkRef, other._networkRef)) {
            return false;
        }
        if (!Objects.equals(_linkRef, other._linkRef)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(SupportingLinkKey.class);
        CodeHelpers.appendValue(helper, "_networkRef", _networkRef);
        CodeHelpers.appendValue(helper, "_linkRef", _linkRef);
        return helper.toString();
    }
}

