package ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.om.numa.type;

import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.OmNumaType;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module
 * <b>mano-types</b>
 * 
 * <pre>
 * case paired-threads {
 *   container paired-threads {
 *     leaf num-paired-threads {
 *       type uint8;
 *     }
 *     list paired-thread-ids {
 *       max-elements 16;
 *       key thread-a;
 *       leaf thread-a {
 *         type uint8;
 *       }
 *       leaf thread-b {
 *         type uint8;
 *       }
 *     }
 *   }
 * }
 * </pre>
 * 
 * The schema path to identify an instance is
 * <i>mano-types/guest-epa/guest-epa/numa-policy/numa-aware/numa-node-policy/node/om-numa-type/paired-threads</i>
 *
 */
public interface PairedThreads extends DataObject, Augmentable<PairedThreads>, OmNumaType {

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("paired-threads");

	/**
	 * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.om.numa.type.paired.threads.PairedThreads</code>
	 *         <code>pairedThreads</code>, or <code>null</code> if not present
	 */
	@Nullable
	ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.om.numa.type.paired.threads.PairedThreads getPairedThreads();

}
