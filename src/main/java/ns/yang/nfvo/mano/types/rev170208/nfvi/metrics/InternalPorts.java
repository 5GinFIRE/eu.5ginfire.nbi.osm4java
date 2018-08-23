package ns.yang.nfvo.mano.types.rev170208.nfvi.metrics;
import java.lang.String;
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
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container internal-ports {
 *   leaf label {
 *     type string;
 *     default "INTERNAL PORTS";
 *   }
 *   leaf total {
 *     type uint64;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/nfvi-metrics/internal-ports</i>
 * 
 * <p>To create instances of this class use {@link InternalPortsBuilder}.
 * @see InternalPortsBuilder
 *
 */
public interface InternalPorts
    extends
    ChildOf<NfviMetrics>,
    Augmentable<InternalPorts>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("internal-ports");

    /**
     * Label to show in UI
     *
     *
     *
     * @return <code>java.lang.String</code> <code>label</code>, or <code>null</code> if not present
     */
    @Nullable
    String getLabel();
    
    /**
     * The total number of internal ports.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>total</code>, or <code>null</code> if not present
     */
    @Nullable
    BigInteger getTotal();

}

