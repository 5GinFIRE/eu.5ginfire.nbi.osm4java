package ns.topology.network.topology.topology;
import java.lang.Override;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.topology.$YangModuleInfoImpl;
import ns.topology.NodeAttributes;
import ns.topology.network.topology.Topology;
import ns.topology.network.topology.topology.node.TerminationPoint;

/**
 * The list of network nodes defined for the topology.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-network-topology</b>
 * <pre>
 * list node {
 *   key node-id;
 *   uses node-attributes;
 *   must boolean(../underlay-topology[*]/node[./supporting-nodes/node-ref]);
 *   list termination-point {
 *     key tp-id;
 *     uses tp-attributes;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-network-topology/network-topology/topology/node</i>
 * 
 * <p>To create instances of this class use {@link NodeBuilder}.
 * @see NodeBuilder
 * @see NodeKey
 *
 */
public interface Node
    extends
    ChildOf<Topology>,
    Augmentable<Node>,
    NodeAttributes,
    Identifiable<NodeKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("node");

    /**
     * A termination point can terminate a link.Depending on the type of topology, a 
     * termination point could,for example, refer to a port or an interface.
     *
     *
     *
     * @return <code>java.util.List</code> <code>terminationPoint</code>, or <code>null</code> if not present
     */
    @Nullable
    List<TerminationPoint> getTerminationPoint();
    
    @Override
    NodeKey key();

}

