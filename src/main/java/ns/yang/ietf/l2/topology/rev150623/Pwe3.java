package ns.yang.ietf.l2.topology.rev150623;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Base identity from which specific pwencapsulation types are derived.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * identity pwe3 {
 *   base encapsulation-type;
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/pwe3</i>
 *
 */
public interface Pwe3
    extends
    EncapsulationType
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("pwe3");


}

