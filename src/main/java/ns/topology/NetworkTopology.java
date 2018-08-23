package ns.topology;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ns.topology.network.topology.Topology;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-network-topology</b>
 * <pre>
 * container network-topology {
 *   list topology {
 *     key topology-id;
 *     leaf topology-id {
 *       type topology-id;
 *     }
 *     leaf server-provided {
 *       type boolean;
 *       config false;
 *     }
 *     container topology-types {
 *     }
 *     list underlay-topology {
 *       key topology-ref;
 *       leaf topology-ref {
 *         type topology-ref;
 *       }
 *     }
 *     list node {
 *       key node-id;
 *       uses node-attributes;
 *       must boolean(../underlay-topology[*]/node[./supporting-nodes/node-ref]);
 *       list termination-point {
 *         key tp-id;
 *         uses tp-attributes;
 *       }
 *     }
 *     list link {
 *       key link-id;
 *       uses link-attributes;
 *       must boolean(../underlay-topology/link[./supporting-link]);
 *       must boolean(../node[./source/source-node]);
 *       must boolean(../node[./destination/dest-node]);
 *       must boolean(../node/termination-point[./source/source-tp]);
 *       must boolean(../node/termination-point[./destination/dest-tp]);
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-network-topology/network-topology</i>
 * 
 * <p>To create instances of this class use {@link NetworkTopologyBuilder}.
 * @see NetworkTopologyBuilder
 *
 */
public interface NetworkTopology
    extends
    ChildOf<OdlNetworkTopologyData>,
    Augmentable<NetworkTopology>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("network-topology");

    /**
     * This is the model of an abstract topology.A topology contains nodes and 
     * links.Each topology MUST be identified byunique topology-id for reason that a 
     * network could contain manytopologies.
     *
     *
     *
     * @return <code>java.util.List</code> <code>topology</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Topology> getTopology();

}

