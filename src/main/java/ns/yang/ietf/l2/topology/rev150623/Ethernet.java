package ns.yang.ietf.l2.topology.rev150623;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * native ethernet encapsulation
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * identity ethernet {
 *   base eth-encapsulation-type;
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/ethernet</i>
 *
 */
public interface Ethernet
    extends
    EthEncapsulationType
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ethernet");


}

