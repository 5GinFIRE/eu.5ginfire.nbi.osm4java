package ns.yang.nfvo.mano.types.rev170208.monitoring.param.value;
import java.math.BigInteger;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.MonitoringParamValue;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container numeric-constraints {
 *   leaf min-value {
 *     type uint64;
 *   }
 *   leaf max-value {
 *     type uint64;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/monitoring-param-value/numeric-constraints</i>
 * 
 * <p>To create instances of this class use {@link NumericConstraintsBuilder}.
 * @see NumericConstraintsBuilder
 *
 */
public interface NumericConstraints
    extends
    ChildOf<MonitoringParamValue>,
    Augmentable<NumericConstraints>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("numeric-constraints");

    /**
     * Minimum value for the parameter
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>minValue</code>, or <code>null</code> if not present
     */
    @Nullable
    BigInteger getMinValue();
    
    /**
     * Maximum value for the parameter
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>maxValue</code>, or <code>null</code> if not present
     */
    @Nullable
    BigInteger getMaxValue();

}

