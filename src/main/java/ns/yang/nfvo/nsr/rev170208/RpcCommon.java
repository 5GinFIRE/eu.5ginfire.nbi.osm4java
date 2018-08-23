package ns.yang.nfvo.nsr.rev170208;
import java.lang.Object;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.RpcProjectName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * grouping rpc-common {
 *   uses manotypes:rpc-project-name;
 *   leaf nsr_id_ref {
 *     type leafref {
 *       path /rw-project:project[rw-project:name=current()/../nsr:project-name]/nsr:ns-instance-config/nsr:nsr/nsr:id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/rpc-common</i>
 *
 */
public interface RpcCommon
    extends
    DataObject,
    RpcProjectName
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("rpc-common");

    /**
     * Reference to NSR ID ref
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>nsrIdRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getNsrIdRef();

}

