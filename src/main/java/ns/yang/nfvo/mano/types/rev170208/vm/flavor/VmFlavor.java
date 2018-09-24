package ns.yang.nfvo.mano.types.rev170208.vm.flavor;

import java.lang.Integer;
import java.math.BigInteger;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.vm.flavor.VmFlavorBuilder.VmFlavorImpl;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module
 * <b>mano-types</b>
 * 
 * <pre>
 * container vm-flavor {
 *   leaf vcpu-count {
 *     type uint16;
 *   }
 *   leaf memory-mb {
 *     type uint64;
 *   }
 *   leaf storage-gb {
 *     type uint64;
 *   }
 * }
 * </pre>
 * 
 * The schema path to identify an instance is
 * <i>mano-types/vm-flavor/vm-flavor</i>
 * 
 * <p>
 * To create instances of this class use {@link VmFlavorBuilder}.
 * 
 * @see VmFlavorBuilder
 *
 */
@JsonDeserialize(as =VmFlavorImpl.class)
//@JsonIgnoreProperties( {"vcpu-count"} )
public interface VmFlavor
		extends ChildOf<ns.yang.nfvo.mano.types.rev170208.VmFlavor>,
		Augmentable<VmFlavor> {

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vm-flavor");

	/**
	 * Number of VCPUs for the VM.
	 *
	 *
	 *
	 * @return <code>java.lang.Integer</code> <code>vcpuCount</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	Integer getVcpuCount();

	/**
	 * Amount of memory in MB.
	 *
	 *
	 *
	 * @return <code>java.math.BigInteger</code> <code>memoryMb</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	BigInteger getMemoryMb();

	/**
	 * Amount of disk space in GB.
	 *
	 *
	 *
	 * @return <code>java.math.BigInteger</code> <code>storageGb</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	BigInteger getStorageGb();

}
