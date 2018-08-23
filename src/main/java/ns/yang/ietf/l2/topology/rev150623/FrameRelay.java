package ns.yang.ietf.l2.topology.rev150623;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Frame Relay encapsulation
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * identity frame-relay {
 *   base encapsulation-type;
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/frame-relay</i>
 *
 */
public interface FrameRelay
    extends
    EncapsulationType
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("frame-relay");


}

