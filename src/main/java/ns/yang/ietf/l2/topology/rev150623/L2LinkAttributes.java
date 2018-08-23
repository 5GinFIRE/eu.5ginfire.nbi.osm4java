package ns.yang.ietf.l2.topology.rev150623;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * L2 link attributes
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * grouping l2-link-attributes {
 *   container l2-link-attributes {
 *     leaf name {
 *       type string;
 *     }
 *     leaf-list flag {
 *       type flag-type;
 *     }
 *     leaf rate {
 *       type decimal64 {
 *         fraction-digits 2;
 *       }
 *     }
 *     leaf delay {
 *       type uint32;
 *     }
 *     leaf-list srlg {
 *       type uint32;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/l2-link-attributes</i>
 *
 */
public interface L2LinkAttributes
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("l2-link-attributes");

    /**
     * Containing L2 link attributes
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.link.attributes.L2LinkAttributes</code> <code>l2LinkAttributes</code>, or <code>null</code> if not present
     */
    @Nullable
    ns.yang.ietf.l2.topology.rev150623.l2.link.attributes.L2LinkAttributes getL2LinkAttributes();

}

