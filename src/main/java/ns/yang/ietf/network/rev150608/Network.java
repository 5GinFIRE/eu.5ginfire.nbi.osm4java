package ns.yang.ietf.network.rev150608;
import java.lang.Boolean;
import java.lang.Override;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.ietf.network.rev150608.network.NetworkTypes;
import ns.yang.ietf.network.rev150608.network.Node;
import ns.yang.ietf.network.rev150608.network.SupportingNetwork;

/**
 * Describes a network.A network typically contains an inventory of 
 * nodes,topological information (augmented throughnetwork-topology model), as 
 * as layeringinformation.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network</b>
 * <pre>
 * list network {
 *   config false;
 *   key network-id;
 *   container network-types {
 *   }
 *   leaf network-id {
 *     type network-id;
 *   }
 *   leaf server-provided {
 *     type boolean;
 *     config false;
 *   }
 *   list supporting-network {
 *     key network-ref;
 *     leaf network-ref {
 *       type leafref {
 *         path /network/network-id;
 *       }
 *     }
 *   }
 *   list node {
 *     key node-id;
 *     leaf node-id {
 *       type node-id;
 *     }
 *     list supporting-node {
 *       key "network-ref node-ref";
 *       leaf network-ref {
 *         type leafref {
 *           path ../../../supporting-network/network-ref;
 *         }
 *       }
 *       leaf node-ref {
 *         type leafref {
 *           path /network/node/node-id;
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network/network</i>
 * 
 * <p>To create instances of this class use {@link NetworkBuilder}.
 * @see NetworkBuilder
 * @see NetworkKey
 *
 */
public interface Network
    extends
    ChildOf<IetfNetworkData>,
    Augmentable<Network>,
    Identifiable<NetworkKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("network");

    /**
     * Serves as an augmentation target.The network type is indicated through 
     * correspondingpresence containers augmented into this container.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.network.rev150608.network.NetworkTypes</code> <code>networkTypes</code>, or <code>null</code> if not present
     */
    @Nullable
    NetworkTypes getNetworkTypes();
    
    /**
     * Identifies a network.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.network.rev150608.NetworkId</code> <code>networkId</code>, or <code>null</code> if not present
     */
    @Nullable
    NetworkId getNetworkId();
    
    /**
     * Indicates whether the information concerning thisparticular network is populated
     * by the server(server-provided true, the general case for networkinformation 
     * discovered from the server),or whether it is configured by a 
     * client(server-provided true, possible e.g. forservice overlays managed through a
     * controller).
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>serverProvided</code>, or <code>null</code> if not present
     */
    @Nullable
    Boolean isServerProvided();
    
    /**
     * An underlay network, used to represent layered networktopologies.
     *
     *
     *
     * @return <code>java.util.List</code> <code>supportingNetwork</code>, or <code>null</code> if not present
     */
    @Nullable
    List<SupportingNetwork> getSupportingNetwork();
    
    /**
     * The inventory of nodes of this network.
     *
     *
     *
     * @return <code>java.util.List</code> <code>node</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Node> getNode();
    
    @Override
    NetworkKey key();

}

