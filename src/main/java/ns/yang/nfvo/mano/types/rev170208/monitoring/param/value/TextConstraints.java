package ns.yang.nfvo.mano.types.rev170208.monitoring.param.value;

import java.lang.Short;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.MonitoringParamValue;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module
 * <b>mano-types</b>
 * 
 * <pre>
 * container text-constraints {
 *   leaf min-length {
 *     type uint8;
 *   }
 *   leaf max-length {
 *     type uint8;
 *   }
 * }
 * </pre>
 * 
 * The schema path to identify an instance is
 * <i>mano-types/monitoring-param-value/text-constraints</i>
 * 
 * <p>
 * To create instances of this class use {@link TextConstraintsBuilder}.
 * 
 * @see TextConstraintsBuilder
 *
 */
public interface TextConstraints extends ChildOf<MonitoringParamValue>, Augmentable<TextConstraints> {

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("text-constraints");

	/**
	 * Minimum string length for the parameter
	 *
	 *
	 *
	 * @return <code>java.lang.Short</code> <code>minLength</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	Short getMinLength();

	/**
	 * Maximum string length for the parameter
	 *
	 *
	 *
	 * @return <code>java.lang.Short</code> <code>maxLength</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	Short getMaxLength();

}
