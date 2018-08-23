package ns.yang.ietf.l2.topology.rev150623;

import org.opendaylight.yangtools.yang.common.QName;

/**
 * HDLC encapsulation
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module
 * <b>ietf-l2-topology</b>
 * 
 * <pre>
 * identity hdlc {
 *   base encapsulation-type;
 * }
 * </pre>
 * 
 * The schema path to identify an instance is <i>ietf-l2-topology/hdlc</i>
 *
 */
public interface Hdlc extends EncapsulationType {

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("hdlc");

}
