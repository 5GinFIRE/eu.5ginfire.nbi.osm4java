package ns.yang.ietf.network.topology.rev150608.network;
import java.lang.Override;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.ietf.network.topology.rev150608.$YangModuleInfoImpl;
import ns.yang.ietf.network.topology.rev150608.LinkId;
import ns.yang.ietf.network.topology.rev150608.Network1;
import ns.yang.ietf.network.topology.rev150608.network.link.Destination;
import ns.yang.ietf.network.topology.rev150608.network.link.Source;
import ns.yang.ietf.network.topology.rev150608.network.link.SupportingLink;

/**
 * A Network Link connects a by Local (Source) node anda Remote (Destination) 
 * Network Nodes via a set of thenodes' termination points.As it is possible to 
 * have several links between the samesource and destination nodes, and as a link 
 * couldpotentially be re-homed between termination points, toensure that we would 
 * always know to distinguish betweenlinks, every link is identified by a 
 * linkidentifier.Note that a link models a point-to-point link, not amultipoint 
 * link.Layering dependencies on links in underlay topologies arenot represented 
 * the layering information of nodes and oftermination points is sufficient.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network-topology</b>
 * <pre>
 * list link {
 *   key link-id;
 *   container source {
 *     leaf source-node {
 *       type leafref {
 *         path ../../../../nd:network/nd:node/nd:node-id;
 *       }
 *     }
 *     leaf source-tp {
 *       type leafref {
 *         path ../../../../nd:network/nd:node[nd:node-id=current()/../source-node]/termination-point/tp-id;
 *       }
 *     }
 *   }
 *   container destination {
 *     leaf dest-node {
 *       type leafref {
 *         path ../../../../nd:network/nd:node/nd:node-id;
 *       }
 *     }
 *     leaf dest-tp {
 *       type leafref {
 *         path ../../../../nd:network/nd:node[nd:node-id=current()/../dest-node]/termination-point/tp-id;
 *       }
 *     }
 *   }
 *   leaf link-id {
 *     type link-id;
 *   }
 *   list supporting-link {
 *     key "network-ref link-ref";
 *     leaf network-ref {
 *       type leafref {
 *         path ../../../../nd:network/nd:supporting-network/nd:network-ref;
 *       }
 *     }
 *     leaf link-ref {
 *       type leafref {
 *         path /nd:network[nd:network-id=current()/../network-ref]/link/link-id;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network-topology/network/(urn:ietf:params:xml:ns:yang:ietf-network-topology?revision=2015-06-08)link</i>
 * 
 * <p>To create instances of this class use {@link LinkBuilder}.
 * @see LinkBuilder
 * @see LinkKey
 *
 */
public interface Link
    extends
    ChildOf<Network1>,
    Augmentable<Link>,
    Identifiable<LinkKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("link");

    /**
     * This container holds the logical source of a particularlink.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.Source</code> <code>source</code>, or <code>null</code> if not present
     */
    @Nullable
    Source getSource();
    
    /**
     * This container holds the logical destination of aparticular link.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.network.topology.rev150608.network.link.Destination</code> <code>destination</code>, or <code>null</code> if not present
     */
    @Nullable
    Destination getDestination();
    
    /**
     * The identifier of a link in the topology.A link is specific to a topology to 
     * which it belongs.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.network.topology.rev150608.LinkId</code> <code>linkId</code>, or <code>null</code> if not present
     */
    @Nullable
    LinkId getLinkId();
    
    /**
     * Identifies the link, or links, that this linkis dependent on.
     *
     *
     *
     * @return <code>java.util.List</code> <code>supportingLink</code>, or <code>null</code> if not present
     */
    @Nullable
    List<SupportingLink> getSupportingLink();
    
    @Override
    LinkKey key();

}

