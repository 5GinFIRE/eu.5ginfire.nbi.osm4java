package ns.yang.nfvo.mano.types.rev170208.nfvi.metrics;

import java.lang.String;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.NfviMetrics;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module
 * <b>mano-types</b>
 * 
 * <pre>
 * container vcpu {
 *   leaf label {
 *     type string;
 *     default VCPU;
 *   }
 *   leaf total {
 *     type uint64;
 *   }
 *   leaf utilization {
 *     type decimal64 {
 *       fraction-digits 2;
 *       range "0 .. 100";
 *     }
 *   }
 * }
 * </pre>
 * 
 * The schema path to identify an instance is
 * <i>mano-types/nfvi-metrics/vcpu</i>
 * 
 * <p>
 * To create instances of this class use {@link VcpuBuilder}.
 * 
 * @see VcpuBuilder
 *
 */
public interface Vcpu extends ChildOf<NfviMetrics>, Augmentable<Vcpu> {

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vcpu");

	/**
	 * Label to show in UI
	 *
	 *
	 *
	 * @return <code>java.lang.String</code> <code>label</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	String getLabel();

	/**
	 * The total number of VCPUs available.
	 *
	 *
	 *
	 * @return <code>java.math.BigInteger</code> <code>total</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	BigInteger getTotal();

	/**
	 * The VCPU utilization (percentage).
	 *
	 *
	 *
	 * @return <code>java.math.BigDecimal</code> <code>utilization</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	BigDecimal getUtilization();

}
