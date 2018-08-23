package ns.yang.ietf.l2.topology.rev150623;
import java.lang.Object;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Grouping for an absolute reference to a node instance.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * grouping node-ref {
 *   uses network-ref;
 *   leaf node-ref {
 *     type leafref {
 *       path "/nw:network[nw:network-id = current()/../network-ref]/nw:node/nw:node-id";
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/node-ref</i>
 *
 */
public interface NodeRef
    extends
    DataObject,
    NetworkRef
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("node-ref");

    /**
     * An absolute reference to a node instance.
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>nodeRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getNodeRef();

}

