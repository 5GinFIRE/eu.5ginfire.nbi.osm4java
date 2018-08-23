package ns.yang.nfvo.mano.types.rev170208;
import java.lang.String;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping rpc-project-name {
 *   leaf project-name {
 *     default default;
 *     type leafref {
 *       path /rw-project:project/rw-project:name;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/rpc-project-name</i>
 *
 */
public interface RpcProjectName
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("rpc-project-name");

    /**
     * Project to which this belongs
     *
     *
     *
     * @return <code>java.lang.String</code> <code>projectName</code>, or <code>null</code> if not present
     */
    @Nullable
    String getProjectName();

}

