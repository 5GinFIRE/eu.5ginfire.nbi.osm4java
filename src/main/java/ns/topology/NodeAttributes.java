package ns.topology;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ns.topology.node.attributes.SupportingNode;

/**
 * The data objects needed to define a node.The objects are provided in a grouping 
 * so that in addition tothe datastore, the data can also be included in 
 * notificationsas needed.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-network-topology</b>
 * <pre>
 * grouping node-attributes {
 *   leaf node-id {
 *     type node-id;
 *   }
 *   list supporting-node {
 *     key "topology-ref node-ref";
 *     leaf topology-ref {
 *       type topology-ref;
 *     }
 *     leaf node-ref {
 *       type node-ref;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-network-topology/node-attributes</i>
 *
 */
public interface NodeAttributes
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("node-attributes");

    /**
     * The identifier of a node in the topology.A node is specific to a topology to 
     * which it belongs.
     *
     *
     *
     * @return <code>model.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NodeId</code> <code>nodeId</code>, or <code>null</code> if not present
     */
    @Nullable
    NodeId getNodeId();
    
    /**
     * This list defines vertical layering information for nodes.It allows to capture 
     * for any given node, which node (or nodes)in the corresponding underlay topology 
     * it maps onto.A node can map to zero, one, or more nodes below it;accordingly 
     * there can be zero, one, or more elements in the list.If there are specific 
     * layering requirements, for examplespecific to a particular type of topology that
     * only allowsfor certain layering relationships, the choicebelow can be augmented 
     * with additional cases.A list has been chosen rather than a leaf-list in orderto 
     * provide room for augmentations, e.g. forstatistics or priorization information 
     * associated withsupporting nodes.
     *
     *
     *
     * @return <code>java.util.List</code> <code>supportingNode</code>, or <code>null</code> if not present
     */
    @Nullable
    List<SupportingNode> getSupportingNode();

}

