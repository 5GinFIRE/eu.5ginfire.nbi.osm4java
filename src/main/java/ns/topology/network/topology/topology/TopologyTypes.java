package ns.topology.network.topology.topology;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ns.topology.$YangModuleInfoImpl;
import ns.topology.network.topology.Topology;

/**
 * This container is used to identify the type, or types(as a topology can
 * support several types simultaneously),of the topology.Topology types are the
 * subject of several integrity constraintsthat an implementing server can
 * validate in order tomaintain integrity of the datastore.Topology types are
 * indicated through separate data nodes;the set of topology types is expected
 * to increase over time.To add support for a new topology, an augmenting
 * moduleneeds to augment this container with a new empty optionalcontainer to
 * indicate the new topology type.The use of a container allows to indicate a
 * subcategorizationof topology types.The container SHALL NOT be augmented with
 * any data nodesthat serve a purpose other than identifying a
 * particulartopology type.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module
 * <b>odl-network-topology</b>
 * 
 * <pre>
 * container topology-types {
 * }
 * </pre>
 * 
 * The schema path to identify an instance is
 * <i>odl-network-topology/network-topology/topology/topology-types</i>
 * 
 * <p>
 * To create instances of this class use {@link TopologyTypesBuilder}.
 * 
 * @see TopologyTypesBuilder
 *
 */
public interface TopologyTypes extends ChildOf<Topology>, Augmentable<TopologyTypes> {

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("topology-types");

}
