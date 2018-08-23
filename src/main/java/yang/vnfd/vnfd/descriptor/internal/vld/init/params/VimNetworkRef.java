package yang.vnfd.vnfd.descriptor.internal.vld.init.params;

import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import yang.vnfd.$YangModuleInfoImpl;
import yang.vnfd.vnfd.descriptor.internal.vld.InitParams;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module
 * <b>vnfd-base</b>
 * 
 * <pre>
 * case vim-network-ref {
 *   leaf vim-network-name {
 *     type string;
 *   }
 * }
 * </pre>
 * 
 * The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/internal-vld/init-params/vim-network-ref</i>
 *
 */
public interface VimNetworkRef extends DataObject, Augmentable<VimNetworkRef>, InitParams {

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vim-network-ref");

	/**
	 * Name of network in VIM account. This is used to indicate pre-provisioned
	 * network name in cloud account.
	 *
	 *
	 *
	 * @return <code>java.lang.String</code> <code>vimNetworkName</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	String getVimNetworkName();

}
