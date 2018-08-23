package ns.yang.ietf.network.topology.rev150608.network.link;
import java.lang.Object;
import java.lang.Override;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.ietf.network.rev150608.NetworkId;
import ns.yang.ietf.network.topology.rev150608.$YangModuleInfoImpl;
import ns.yang.ietf.network.topology.rev150608.network.Link;

/**
 * Identifies the link, or links, that this linkis dependent on.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network-topology</b>
 * <pre>
 * list supporting-link {
 *   key "network-ref link-ref";
 *   leaf network-ref {
 *     type leafref {
 *       path ../../../../nd:network/nd:supporting-network/nd:network-ref;
 *     }
 *   }
 *   leaf link-ref {
 *     type leafref {
 *       path /nd:network[nd:network-id=current()/../network-ref]/link/link-id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network-topology/network/(urn:ietf:params:xml:ns:yang:ietf-network-topology?revision=2015-06-08)link/supporting-link</i>
 * 
 * <p>To create instances of this class use {@link SupportingLinkBuilder}.
 * @see SupportingLinkBuilder
 * @see SupportingLinkKey
 *
 */
public interface SupportingLink
    extends
    ChildOf<Link>,
    Augmentable<SupportingLink>,
    Identifiable<SupportingLinkKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("supporting-link");

    /**
     * This leaf identifies in which underlay topologysupporting link is present.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.network.rev150608.NetworkId</code> <code>networkRef</code>, or <code>null</code> if not present
     */
    @Nullable
    NetworkId getNetworkRef();
    
    /**
     * This leaf identifies a link which is a partof this link's underlay. Reference 
     * loops, in whicha link identifies itself as its underlay, eitherdirectly or 
     * transitively, are not allowed.
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>linkRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getLinkRef();
    
    @Override
    SupportingLinkKey key();

}

