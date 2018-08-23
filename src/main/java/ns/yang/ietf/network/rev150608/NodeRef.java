package ns.yang.ietf.network.rev150608;

import java.lang.Object;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Contains the information necessary to reference a node.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module
 * <b>ietf-network</b>
 * 
 * <pre>
 * grouping node-ref {
 *   leaf node-ref {
 *     type leafref {
 *       path /network[network-id=current()/../network-ref]/node/node-id;
 *     }
 *   }
 *   uses network-ref;
 * }
 * </pre>
 * 
 * The schema path to identify an instance is <i>ietf-network/node-ref</i>
 *
 */
public interface NodeRef extends DataObject, NetworkRef {

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("node-ref");

	/**
	 * Used to reference a node.Nodes are identified relative to the network they
	 * arecontained in.
	 *
	 *
	 *
	 * @return <code>java.lang.Object</code> <code>nodeRef</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	Object getNodeRef();

}
