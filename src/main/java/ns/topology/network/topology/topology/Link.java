package ns.topology.network.topology.topology;
import java.lang.Override;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.topology.$YangModuleInfoImpl;
import ns.topology.LinkAttributes;
import ns.topology.network.topology.Topology;

/**
 * A Network Link connects a by Local (Source) node anda Remote (Destination) 
 * Network Nodes via a set of thenodes' termination points.As it is possible to 
 * have several links between the samesource and destination nodes, and as a link 
 * could potentiallybe re-homed between termination points, to ensure that wewould 
 * always know to distinguish between links, every linkis identified by a 
 * link identifier.Note that a link models a point-to-point link, not a 
 * multipointlink.Layering dependencies on links in underlay topologies arenot 
 * represented as the layering information of nodes and oftermination points is 
 * sufficient.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-network-topology</b>
 * <pre>
 * list link {
 *   key link-id;
 *   uses link-attributes;
 *   must boolean(../underlay-topology/link[./supporting-link]);
 *   must boolean(../node[./source/source-node]);
 *   must boolean(../node[./destination/dest-node]);
 *   must boolean(../node/termination-point[./source/source-tp]);
 *   must boolean(../node/termination-point[./destination/dest-tp]);
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-network-topology/network-topology/topology/link</i>
 * 
 * <p>To create instances of this class use {@link LinkBuilder}.
 * @see LinkBuilder
 * @see LinkKey
 *
 */
public interface Link
    extends
    ChildOf<Topology>,
    Augmentable<Link>,
    LinkAttributes,
    Identifiable<LinkKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("link");

    @Override
    LinkKey key();

}

