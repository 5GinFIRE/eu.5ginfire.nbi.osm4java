package ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params;
import java.lang.Override;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.ietf.inet.types.rev100924.IpAddress;
import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.ip.profile.info.IpProfileParams;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list dns-server {
 *   key address;
 *   leaf address {
 *     type inet:ip-address;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/ip-profile-info/ip-profile-params/dns-server</i>
 * 
 * <p>To create instances of this class use {@link DnsServerBuilder}.
 * @see DnsServerBuilder
 * @see DnsServerKey
 *
 */
public interface DnsServer
    extends
    ChildOf<IpProfileParams>,
    Augmentable<DnsServer>,
    Identifiable<DnsServerKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("dns-server");

    /**
     * List of DNS Servers associated with IP Profile
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.IpAddress</code> <code>address</code>, or <code>null</code> if not present
     */
    @Nullable
    IpAddress getAddress();
    
    @Override
    DnsServerKey key();

}

