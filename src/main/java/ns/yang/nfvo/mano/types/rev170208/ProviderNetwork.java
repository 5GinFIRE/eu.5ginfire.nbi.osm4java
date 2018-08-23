package ns.yang.nfvo.mano.types.rev170208;

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
 * grouping provider-network {
 *   container provider-network {
 *     leaf physical-network {
 *       type string;
 *     }
 *     leaf segmentation_id {
 *       type uint32;
 *     }
 *   }
 * }
 * </pre>
 * 
 * The schema path to identify an instance is <i>mano-types/provider-network</i>
 *
 */
public interface ProviderNetwork extends DataObject {

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("provider-network");

	/**
	 * Container for the provider network.
	 *
	 *
	 *
	 * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.provider.network.ProviderNetwork</code>
	 *         <code>providerNetwork</code>, or <code>null</code> if not present
	 */
	@Nullable
	ns.yang.nfvo.mano.types.rev170208.provider.network.ProviderNetwork getProviderNetwork();

}
