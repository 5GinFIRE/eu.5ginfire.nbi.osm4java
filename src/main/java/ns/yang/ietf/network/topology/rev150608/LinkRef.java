package ns.yang.ietf.network.topology.rev150608;
import java.lang.Object;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.ietf.network.rev150608.NetworkRef;

/**
 * References a link in a specific network.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network-topology</b>
 * <pre>
 * grouping link-ref {
 *   leaf link-ref {
 *     type leafref {
 *       path /nd:network[nd:network-id=current()/../nd:network-ref]/link/link-id;
 *     }
 *   }
 *   uses nd:network-ref;
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network-topology/link-ref</i>
 *
 */
public interface LinkRef
    extends
    DataObject,
    NetworkRef
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("link-ref");

    /**
     * A type for an absolute reference a link instance.(This type should not be used 
     * for relative references.In such a case, a relative path should be used instead.)
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>linkRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getLinkRef();

}

