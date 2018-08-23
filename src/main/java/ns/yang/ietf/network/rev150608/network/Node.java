package ns.yang.ietf.network.rev150608.network;
import java.lang.Override;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.ietf.network.rev150608.$YangModuleInfoImpl;
import ns.yang.ietf.network.rev150608.Network;
import ns.yang.ietf.network.rev150608.NodeId;
import ns.yang.ietf.network.rev150608.network.node.SupportingNode;

/**
 * The inventory of nodes of this network.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network</b>
 * <pre>
 * list node {
 *   key node-id;
 *   leaf node-id {
 *     type node-id;
 *   }
 *   list supporting-node {
 *     key "network-ref node-ref";
 *     leaf network-ref {
 *       type leafref {
 *         path ../../../supporting-network/network-ref;
 *       }
 *     }
 *     leaf node-ref {
 *       type leafref {
 *         path /network/node/node-id;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network/network/node</i>
 * 
 * <p>To create instances of this class use {@link NodeBuilder}.
 * @see NodeBuilder
 * @see NodeKey
 *
 */
public interface Node
    extends
    ChildOf<Network>,
    Augmentable<Node>,
    Identifiable<NodeKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("node");

    /**
     * Identifies a node uniquely within the containingnetwork.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.network.rev150608.NodeId</code> <code>nodeId</code>, or <code>null</code> if not present
     */
    @Nullable
    NodeId getNodeId();
    
    /**
     * Represents another node, in an underlay network, thatthis node is supported by. 
     * Used to represent layeringstructure.
     *
     *
     *
     * @return <code>java.util.List</code> <code>supportingNode</code>, or <code>null</code> if not present
     */
    @Nullable
    List<SupportingNode> getSupportingNode();
    
    @Override
    NodeKey key();

}

