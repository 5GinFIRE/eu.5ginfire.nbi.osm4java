package ns.topology.network.topology;
import java.lang.Boolean;
import java.lang.Override;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.topology.$YangModuleInfoImpl;
import ns.topology.NetworkTopology;
import ns.topology.TopologyId;
import ns.topology.network.topology.topology.Link;
import ns.topology.network.topology.topology.Node;
import ns.topology.network.topology.topology.TopologyTypes;
import ns.topology.network.topology.topology.UnderlayTopology;

/**
 * This is the model of an abstract topology.A topology contains nodes and 
 * links.Each topology MUST be identified byunique topology-id for reason that a 
 * network could contain manytopologies.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-network-topology</b>
 * <pre>
 * list topology {
 *   key topology-id;
 *   leaf topology-id {
 *     type topology-id;
 *   }
 *   leaf server-provided {
 *     type boolean;
 *     config false;
 *   }
 *   container topology-types {
 *   }
 *   list underlay-topology {
 *     key topology-ref;
 *     leaf topology-ref {
 *       type topology-ref;
 *     }
 *   }
 *   list node {
 *     key node-id;
 *     uses node-attributes;
 *     must boolean(../underlay-topology[*]/node[./supporting-nodes/node-ref]);
 *     list termination-point {
 *       key tp-id;
 *       uses tp-attributes;
 *     }
 *   }
 *   list link {
 *     key link-id;
 *     uses link-attributes;
 *     must boolean(../underlay-topology/link[./supporting-link]);
 *     must boolean(../node[./source/source-node]);
 *     must boolean(../node[./destination/dest-node]);
 *     must boolean(../node/termination-point[./source/source-tp]);
 *     must boolean(../node/termination-point[./destination/dest-tp]);
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-network-topology/network-topology/topology</i>
 * 
 * <p>To create instances of this class use {@link TopologyBuilder}.
 * @see TopologyBuilder
 * @see TopologyKey
 *
 */
public interface Topology
    extends
    ChildOf<NetworkTopology>,
    Augmentable<Topology>,
    Identifiable<TopologyKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("topology");

    /**
     * It is presumed that a datastore will contain many topologies. Todistinguish 
     * between topologies it is vital to have UNIQUEtopology identifiers.
     *
     *
     *
     * @return <code>model.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TopologyId</code> <code>topologyId</code>, or <code>null</code> if not present
     */
    @Nullable
    TopologyId getTopologyId();
    
    /**
     * Indicates whether the topology is configurable by clients,or whether it is 
     * provided by the server. This leaf ispopulated by the server implementing the 
     * model.It is set to false for topologies that are created by a client;it is set 
     * to true otherwise. If it is set to true, anyattempt to edit the topology MUST be
     * rejected.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>serverProvided</code>, or <code>null</code> if not present
     */
    @Nullable
    Boolean isServerProvided();
    
    /**
     * This container is used to identify the type, or types(as a topology can support 
     * several types simultaneously),of the topology.Topology types are the subject of 
     * several integrity constraintsthat an implementing server can validate in order 
     * tomaintain integrity of the datastore.Topology types are indicated through 
     * separate data nodes;the set of topology types is expected to increase over 
     * time.To add support for a new topology, an augmenting moduleneeds to augment 
     * this container with a new empty optionalcontainer to indicate the new topology 
     * type.The use of a container allows to indicate a subcategorizationof topology 
     * types.The container SHALL NOT be augmented with any data nodesthat serve a 
     * purpose other than identifying a particulartopology type.
     *
     *
     *
     * @return <code>model.urn.tbd.params.xml.ns.yang.network.topology.rev131021.network.topology.topology.TopologyTypes</code> <code>topologyTypes</code>, or <code>null</code> if not present
     */
    @Nullable
    TopologyTypes getTopologyTypes();
    
    /**
     * Identifies the topology, or topologies, that this topologyis dependent on.
     *
     *
     *
     * @return <code>java.util.List</code> <code>underlayTopology</code>, or <code>null</code> if not present
     */
    @Nullable
    List<UnderlayTopology> getUnderlayTopology();
    
    /**
     * The list of network nodes defined for the topology.
     *
     *
     *
     * @return <code>java.util.List</code> <code>node</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Node> getNode();
    
    /**
     * A Network Link connects a by Local (Source) node anda Remote (Destination) 
     * Network Nodes via a set of thenodes' termination points.As it is possible to 
     * have several links between the samesource and destination nodes, and as a link 
     * could potentiallybe re-homed between termination points, to ensure that wewould 
     * always know to distinguish between links, every linkis identified by a dedicated
     * link identifier.Note that a link models a point-to-point link, not a 
     * multipointlink.Layering dependencies on links in underlay topologies arenot 
     * represented as the layering information of nodes and oftermination points is 
     * sufficient.
     *
     *
     *
     * @return <code>java.util.List</code> <code>link</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Link> getLink();
    
    @Override
    TopologyKey key();

}

