package ns.yang.ietf.l2.topology.rev150623;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * L2 termination point attributes
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * grouping l2-termination-point-attributes {
 *   container l2-termination-point-attributes {
 *     leaf description {
 *       type string;
 *     }
 *     leaf maximum-frame-size {
 *       type uint32;
 *     }
 *     choice l2-termination-point-type {
 *       case ethernet {
 *         leaf mac-address {
 *           type yang:mac-address;
 *         }
 *         leaf eth-encapsulation {
 *           type identityref {
 *             base eth-encapsulation-type;
 *           }
 *         }
 *         leaf port-vlan-id {
 *           if-feature VLAN;
 *           type vlan;
 *         }
 *         list vlan-id-name {
 *           if-feature VLAN;
 *           key vlan-id;
 *           leaf vlan-id {
 *             type vlan;
 *           }
 *           leaf vlan-name {
 *             type string;
 *           }
 *         }
 *       }
 *       case legacy {
 *         leaf encapsulation {
 *           type identityref {
 *             base encapsulation-type;
 *           }
 *         }
 *       }
 *     }
 *     leaf tp-state {
 *       type enumeration {
 *         enum in-use {
 *           value 0;
 *         }
 *         enum blocking {
 *           value 1;
 *         }
 *         enum down {
 *           value 2;
 *         }
 *         enum others {
 *           value 3;
 *         }
 *       }
 *       config false;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/l2-termination-point-attributes</i>
 *
 */
public interface L2TerminationPointAttributes
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("l2-termination-point-attributes");

    /**
     * Containing L2 TP attributes
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes</code> <code>l2TerminationPointAttributes</code>, or <code>null</code> if not present
     */
    @Nullable
    ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes getL2TerminationPointAttributes();

}

