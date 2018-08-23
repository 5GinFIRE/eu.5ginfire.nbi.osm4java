package ns.yang.ietf.l2.topology.rev150623;

import org.opendaylight.yangtools.yang.binding.BaseIdentity;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Base type for flags
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module
 * <b>ietf-l2-topology</b>
 * 
 * <pre>
 * identity flag-identity {
 * }
 * </pre>
 * 
 * The schema path to identify an instance is
 * <i>ietf-l2-topology/flag-identity</i>
 *
 */
public interface FlagIdentity extends BaseIdentity {

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("flag-identity");

}
