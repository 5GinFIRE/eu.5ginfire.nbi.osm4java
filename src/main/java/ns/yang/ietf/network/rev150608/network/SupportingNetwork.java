package ns.yang.ietf.network.rev150608.network;
import java.lang.Override;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.ietf.network.rev150608.$YangModuleInfoImpl;
import ns.yang.ietf.network.rev150608.Network;
import ns.yang.ietf.network.rev150608.NetworkId;

/**
 * An underlay network, used to represent layered networktopologies.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network</b>
 * <pre>
 * list supporting-network {
 *   key network-ref;
 *   leaf network-ref {
 *     type leafref {
 *       path /network/network-id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network/network/supporting-network</i>
 * 
 * <p>To create instances of this class use {@link SupportingNetworkBuilder}.
 * @see SupportingNetworkBuilder
 * @see SupportingNetworkKey
 *
 */
public interface SupportingNetwork
    extends
    ChildOf<Network>,
    Augmentable<SupportingNetwork>,
    Identifiable<SupportingNetworkKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("supporting-network");

    /**
     * References the underlay network.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.network.rev150608.NetworkId</code> <code>networkRef</code>, or <code>null</code> if not present
     */
    @Nullable
    NetworkId getNetworkRef();
    
    @Override
    SupportingNetworkKey key();

}

