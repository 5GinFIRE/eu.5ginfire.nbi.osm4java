package ns.yang.ietf.l2.topology.rev150623;
import java.lang.Object;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Grouping for an absolute reference to a termination point.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * grouping tp-ref {
 *   uses node-ref;
 *   leaf tp-ref {
 *     type leafref {
 *       path "/nw:network[nw:network-id = current()/../network-ref]/nw:node[nw:node-id = current()/../node-ref]/nt:termination-point/nt:tp-id";
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/tp-ref</i>
 *
 */
public interface TpRef
    extends
    DataObject,
    NodeRef
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("tp-ref");

    /**
     * Grouping for an absolute reference to a TP.
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>tpRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getTpRef();

}

