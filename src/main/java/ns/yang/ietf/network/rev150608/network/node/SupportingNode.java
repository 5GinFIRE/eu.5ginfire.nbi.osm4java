package ns.yang.ietf.network.rev150608.network.node;
import java.lang.Override;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.ietf.network.rev150608.$YangModuleInfoImpl;
import ns.yang.ietf.network.rev150608.NetworkId;
import ns.yang.ietf.network.rev150608.NodeId;
import ns.yang.ietf.network.rev150608.network.Node;

/**
 * Represents another node, in an underlay network, thatthis node is supported by. 
 * Used to represent layeringstructure.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network</b>
 * <pre>
 * list supporting-node {
 *   key "network-ref node-ref";
 *   leaf network-ref {
 *     type leafref {
 *       path ../../../supporting-network/network-ref;
 *     }
 *   }
 *   leaf node-ref {
 *     type leafref {
 *       path /network/node/node-id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network/network/node/supporting-node</i>
 * 
 * <p>To create instances of this class use {@link SupportingNodeBuilder}.
 * @see SupportingNodeBuilder
 * @see SupportingNodeKey
 *
 */
public interface SupportingNode
    extends
    ChildOf<Node>,
    Augmentable<SupportingNode>,
    Identifiable<SupportingNodeKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("supporting-node");

    /**
     * References the underlay network that theunderlay node is part of.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.network.rev150608.NetworkId</code> <code>networkRef</code>, or <code>null</code> if not present
     */
    @Nullable
    NetworkId getNetworkRef();
    
    /**
     * References the underlay node itself.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.network.rev150608.NodeId</code> <code>nodeRef</code>, or <code>null</code> if not present
     */
    @Nullable
    NodeId getNodeRef();
    
    @Override
    SupportingNodeKey key();

}

