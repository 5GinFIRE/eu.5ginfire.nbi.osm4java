package ns.yang.ietf.l2.topology.rev150623;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * L2 node attributes
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * grouping l2-node-attributes {
 *   container l2-node-attributes {
 *     leaf name {
 *       type string;
 *     }
 *     leaf description {
 *       type string;
 *     }
 *     leaf-list management-address {
 *       type inet:ip-address;
 *     }
 *     leaf management-vid {
 *       if-feature VLAN;
 *       type vlan;
 *     }
 *     leaf-list nick-name {
 *       if-feature TRILL;
 *       type trill-nickname;
 *     }
 *     leaf-list flag {
 *       type flag-type;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/l2-node-attributes</i>
 *
 */
public interface L2NodeAttributes
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("l2-node-attributes");

    /**
     * Containing L2 node attributes
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.node.attributes.L2NodeAttributes</code> <code>l2NodeAttributes</code>, or <code>null</code> if not present
     */
    @Nullable
    ns.yang.ietf.l2.topology.rev150623.l2.node.attributes.L2NodeAttributes getL2NodeAttributes();

}

