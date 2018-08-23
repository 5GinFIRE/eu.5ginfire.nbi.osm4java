package ns.yang.nfvo.mano.types.rev170208;
import java.util.List;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of input parameters that can be specified when instantiating a network 
 * service.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping input-parameter {
 *   list input-parameter {
 *     key xpath;
 *     leaf xpath {
 *       type string;
 *     }
 *     leaf value {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/input-parameter</i>
 *
 */
public interface InputParameter
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("input-parameter");

    /**
     * List of input parameters
     *
     *
     *
     * @return <code>java.util.List</code> <code>inputParameter</code>, or <code>null</code> if not present
     */
    @Nullable
    List<ns.yang.nfvo.mano.types.rev170208.input.parameter.InputParameter> getInputParameter();

}

