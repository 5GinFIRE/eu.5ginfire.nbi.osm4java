package ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes;

import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.ietf.l2.topology.rev150623.$YangModuleInfoImpl;
import ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes;

/**
 * Indicates termination-point typespecific attributes
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module
 * <b>ietf-l2-topology</b>
 * 
 * <pre>
 * choice l2-termination-point-type {
 *   case ethernet {
 *     leaf mac-address {
 *       type yang:mac-address;
 *     }
 *     leaf eth-encapsulation {
 *       type identityref {
 *         base eth-encapsulation-type;
 *       }
 *     }
 *     leaf port-vlan-id {
 *       if-feature VLAN;
 *       type vlan;
 *     }
 *     list vlan-id-name {
 *       if-feature VLAN;
 *       key vlan-id;
 *       leaf vlan-id {
 *         type vlan;
 *       }
 *       leaf vlan-name {
 *         type string;
 *       }
 *     }
 *   }
 *   case legacy {
 *     leaf encapsulation {
 *       type identityref {
 *         base encapsulation-type;
 *       }
 *     }
 *   }
 * }
 * </pre>
 * 
 * The schema path to identify an instance is
 * <i>ietf-l2-topology/l2-termination-point-attributes/l2-termination-point-attributes/l2-termination-point-type</i>
 *
 */
public interface L2TerminationPointType extends ChoiceIn<L2TerminationPointAttributes> {

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("l2-termination-point-type");

}
