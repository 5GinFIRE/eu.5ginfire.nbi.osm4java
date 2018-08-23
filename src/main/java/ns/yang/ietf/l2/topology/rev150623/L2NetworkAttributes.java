package ns.yang.ietf.l2.topology.rev150623;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * L2 Topology scope attributes
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * grouping l2-network-attributes {
 *   container l2-network-attributes {
 *     leaf name {
 *       type string;
 *     }
 *     leaf-list flag {
 *       type flag-type;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/l2-network-attributes</i>
 *
 */
public interface L2NetworkAttributes
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("l2-network-attributes");

    /**
     * Containing L2 network attributes
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.network.attributes.L2NetworkAttributes</code> <code>l2NetworkAttributes</code>, or <code>null</code> if not present
     */
    @Nullable
    ns.yang.ietf.l2.topology.rev150623.l2.network.attributes.L2NetworkAttributes getL2NetworkAttributes();

}

