package yang.base.nsd.descriptor.common.vnffgd.classifier;
import java.lang.Override;
import java.lang.Short;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.ietf.inet.types.rev100924.IpAddress;
import ns.yang.ietf.inet.types.rev100924.PortNumber;
import yang.base.$YangModuleInfoImpl;
import yang.base.nsd.descriptor.common.vnffgd.Classifier;

/**
 * List of match attributes.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list match-attributes {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   leaf ip-proto {
 *     type uint8;
 *   }
 *   leaf source-ip-address {
 *     type inet:ip-address;
 *   }
 *   leaf destination-ip-address {
 *     type inet:ip-address;
 *   }
 *   leaf source-port {
 *     type inet:port-number;
 *   }
 *   leaf destination-port {
 *     type inet:port-number;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/vnffgd/classifier/match-attributes</i>
 * 
 * <p>To create instances of this class use {@link MatchAttributesBuilder}.
 * @see MatchAttributesBuilder
 * @see MatchAttributesKey
 *
 */
public interface MatchAttributes
    extends
    ChildOf<Classifier>,
    Augmentable<MatchAttributes>,
    Identifiable<MatchAttributesKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("match-attributes");

    /**
     * Identifier for the classifier match attribute rule.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable
    String getId();
    
    /**
     * IP Protocol.
     *
     *
     *
     * @return <code>java.lang.Short</code> <code>ipProto</code>, or <code>null</code> if not present
     */
    @Nullable
    Short getIpProto();
    
    /**
     * Source IP address.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.IpAddress</code> <code>sourceIpAddress</code>, or <code>null</code> if not present
     */
    @Nullable
    IpAddress getSourceIpAddress();
    
    /**
     * Destination IP address.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.IpAddress</code> <code>destinationIpAddress</code>, or <code>null</code> if not present
     */
    @Nullable
    IpAddress getDestinationIpAddress();
    
    /**
     * Source port number.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.PortNumber</code> <code>sourcePort</code>, or <code>null</code> if not present
     */
    @Nullable
    PortNumber getSourcePort();
    
    /**
     * Destination port number.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.PortNumber</code> <code>destinationPort</code>, or <code>null</code> if not present
     */
    @Nullable
    PortNumber getDestinationPort();
    
    @Override
    MatchAttributesKey key();

}

