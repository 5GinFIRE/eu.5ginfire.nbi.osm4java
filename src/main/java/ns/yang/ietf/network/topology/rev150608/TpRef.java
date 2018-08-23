package ns.yang.ietf.network.topology.rev150608;

import java.lang.Object;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.ietf.network.rev150608.NodeRef;

/**
 * References a termination point in a specific node.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module
 * <b>ietf-network-topology</b>
 * 
 * <pre>
 * grouping tp-ref {
 *   leaf tp-ref {
 *     type leafref {
 *       path /nd:network[nd:network-id=current()/../nd:network-ref]/nd:node[nd:node-id=current()/../nd:node-ref]/termination-point/tp-id;
 *     }
 *   }
 *   uses nd:node-ref;
 * }
 * </pre>
 * 
 * The schema path to identify an instance is
 * <i>ietf-network-topology/tp-ref</i>
 *
 */
public interface TpRef extends DataObject, NodeRef {

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("tp-ref");

	/**
	 * A type for an absolute reference to a termination point.(This type should not
	 * be used for relative references.In such a case, a relative path should be
	 * used instead.)
	 *
	 *
	 *
	 * @return <code>java.lang.Object</code> <code>tpRef</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	Object getTpRef();

}
