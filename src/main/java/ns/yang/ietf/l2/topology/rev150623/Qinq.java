package ns.yang.ietf.l2.topology.rev150623;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * qinq encapsulation
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * identity qinq {
 *   base eth-encapsulation-type;
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/qinq</i>
 *
 */
public interface Qinq
    extends
    EthEncapsulationType
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("qinq");


}

