package ns.yang.ietf.l2.topology.rev150623.l2.network.attributes;

import java.lang.Class;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.ietf.l2.topology.rev150623.$YangModuleInfoImpl;
import ns.yang.ietf.l2.topology.rev150623.FlagIdentity;

/**
 * Containing L2 network attributes
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module
 * <b>ietf-l2-topology</b>
 * 
 * <pre>
 * container l2-network-attributes {
 *   leaf name {
 *     type string;
 *   }
 *   leaf-list flag {
 *     type flag-type;
 *   }
 * }
 * </pre>
 * 
 * The schema path to identify an instance is
 * <i>ietf-l2-topology/l2-network-attributes/l2-network-attributes</i>
 * 
 * <p>
 * To create instances of this class use {@link L2NetworkAttributesBuilder}.
 * 
 * @see L2NetworkAttributesBuilder
 *
 */
public interface L2NetworkAttributes extends
		ChildOf<ns.yang.ietf.l2.topology.rev150623.L2NetworkAttributes>,
		Augmentable<L2NetworkAttributes> {

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("l2-network-attributes");

	/**
	 * Name of the L2 network
	 *
	 *
	 *
	 * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code>
	 *         if not present
	 */
	@Nullable
	String getName();

	/**
	 * L2 network flags
	 *
	 *
	 *
	 * @return <code>java.util.List</code> <code>flag</code>, or <code>null</code>
	 *         if not present
	 */
	@Nullable
	List<Class<? extends FlagIdentity>> getFlag();

}
