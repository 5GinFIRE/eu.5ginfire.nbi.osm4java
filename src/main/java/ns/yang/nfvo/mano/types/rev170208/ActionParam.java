package ns.yang.nfvo.mano.types.rev170208;
import java.util.List;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping action-param {
 *   list action-param {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     leaf name {
 *       type string;
 *     }
 *     leaf description {
 *       type string;
 *     }
 *     leaf group-tag {
 *       type string;
 *     }
 *     leaf url {
 *       type inet:uri;
 *     }
 *     leaf method {
 *       type manotypes:http-method;
 *       default POST;
 *     }
 *     leaf payload {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/action-param</i>
 *
 */
public interface ActionParam
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("action-param");

    /**
     * List of action parameters tocontrol VNF
     *
     *
     *
     * @return <code>java.util.List</code> <code>actionParam</code>, or <code>null</code> if not present
     */
    @Nullable
    List<ns.yang.nfvo.mano.types.rev170208.action.param.ActionParam> getActionParam();

}

