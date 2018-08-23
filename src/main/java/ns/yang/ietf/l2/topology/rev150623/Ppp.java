package ns.yang.ietf.l2.topology.rev150623;

import org.opendaylight.yangtools.yang.common.QName;

/**
 * PPP encapsulation
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module
 * <b>ietf-l2-topology</b>
 * 
 * <pre>
 * identity ppp {
 *   base encapsulation-type;
 * }
 * </pre>
 * 
 * The schema path to identify an instance is <i>ietf-l2-topology/ppp</i>
 *
 */
public interface Ppp extends EncapsulationType {

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ppp");

}
