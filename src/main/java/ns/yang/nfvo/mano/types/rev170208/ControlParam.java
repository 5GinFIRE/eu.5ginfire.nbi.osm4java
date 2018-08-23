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
 * grouping control-param {
 *   list control-param {
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
 *     leaf min-value {
 *       type uint64;
 *     }
 *     leaf max-value {
 *       type uint64;
 *     }
 *     leaf current-value {
 *       type uint64;
 *     }
 *     leaf step-value {
 *       type uint64;
 *     }
 *     leaf units {
 *       type string;
 *     }
 *     leaf widget-type {
 *       type manotypes:widget-type;
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
 * <i>mano-types/control-param</i>
 *
 */
public interface ControlParam
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("control-param");

    /**
     * List of control parameters to manage andupdate the running configuration of the 
     * VNF
     *
     *
     *
     * @return <code>java.util.List</code> <code>controlParam</code>, or <code>null</code> if not present
     */
    @Nullable
    List<ns.yang.nfvo.mano.types.rev170208.control.param.ControlParam> getControlParam();

}

