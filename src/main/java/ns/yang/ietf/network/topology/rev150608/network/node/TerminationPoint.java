package ns.yang.ietf.network.topology.rev150608.network.node;

import java.lang.Override;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.ietf.network.topology.rev150608.$YangModuleInfoImpl;
import ns.yang.ietf.network.topology.rev150608.Node1;
import ns.yang.ietf.network.topology.rev150608.TpId;
import ns.yang.ietf.network.topology.rev150608.network.node.termination.point.SupportingTerminationPoint;

/**
 * A termination point can terminate a link.Depending on the type of topology, a
 * termination pointcould, for example, refer to a port or an interface.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module
 * <b>ietf-network-topology</b>
 * 
 * <pre>
 * list termination-point {
 *   key tp-id;
 *   leaf tp-id {
 *     type tp-id;
 *   }
 *   list supporting-termination-point {
 *     key "network-ref node-ref tp-ref";
 *     leaf network-ref {
 *       type leafref {
 *         path /nd:network/nd:node/nd:supporting-node/nd:network-ref;
 *       }
 *     }
 *     leaf node-ref {
 *       type leafref {
 *         path /nd:network/nd:node/nd:supporting-node/nd:node-ref;
 *       }
 *     }
 *     leaf tp-ref {
 *       type leafref {
 *         path /nd:network[nd:network-id=current()/../network-ref]/nd:node[nd:node-id=current()/../node-ref]/termination-point/tp-id;
 *       }
 *     }
 *   }
 * }
 * </pre>
 * 
 * The schema path to identify an instance is
 * <i>ietf-network-topology/network/node/(urn:ietf:params:xml:ns:yang:ietf-network-topology?revision=2015-06-08)termination-point</i>
 * 
 * <p>
 * To create instances of this class use {@link TerminationPointBuilder}.
 * 
 * @see TerminationPointBuilder
 * @see TerminationPointKey
 *
 */
public interface TerminationPoint
		extends ChildOf<Node1>, Augmentable<TerminationPoint>, Identifiable<TerminationPointKey> {

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("termination-point");

	/**
	 * Termination point identifier.
	 *
	 *
	 *
	 * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.network.topology.rev150608.TpId</code>
	 *         <code>tpId</code>, or <code>null</code> if not present
	 */
	@Nullable
	TpId getTpId();

	/**
	 * The leaf list identifies any termination points thatthe termination point is
	 * dependent on, or maps onto.Those termination points will themselves be
	 * containedin a supporting node.This dependency information can be inferred
	 * fromthe dependencies between links. For this reason,this item is not
	 * separately configurable. Hence nocorresponding constraint needs to be
	 * articulated.The corresponding information is simply provided by
	 * theimplementing system.
	 *
	 *
	 *
	 * @return <code>java.util.List</code> <code>supportingTerminationPoint</code>,
	 *         or <code>null</code> if not present
	 */
	@Nullable
	List<SupportingTerminationPoint> getSupportingTerminationPoint();

	@Override
	TerminationPointKey key();

}
