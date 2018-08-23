package ns.yang.nfvo.mano.types.rev170208;

import java.util.List;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module
 * <b>mano-types</b>
 * 
 * <pre>
 * grouping host-aggregate {
 *   list host-aggregate {
 *     key metadata-key;
 *     leaf metadata-key {
 *       type string;
 *     }
 *     leaf metadata-value {
 *       type string;
 *     }
 *   }
 * }
 * </pre>
 * 
 * The schema path to identify an instance is <i>mano-types/host-aggregate</i>
 *
 */
public interface HostAggregate extends DataObject {

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("host-aggregate");

	/**
	 * Name of the Host Aggregate
	 *
	 *
	 *
	 * @return <code>java.util.List</code> <code>hostAggregate</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	List<ns.yang.nfvo.mano.types.rev170208.host.aggregate.HostAggregate> getHostAggregate();

}
