package yang.base.nsd.descriptor.common.connection.point;
import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

import yang.base.$YangModuleInfoImpl;
import yang.base.nsd.descriptor.common.ConnectionPoint;

/**
 * Logical connection of the CP to a VLD or to a VNF CP
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * choice connection {
 *   case vld-ref {
 *     leaf vld-id-ref {
 *       type string;
 *     }
 *   }
 *   case vnfd-connection-point-ref {
 *     leaf member-vnf-index-ref {
 *       type string;
 *     }
 *     leaf vnfd-id-ref {
 *       type leafref {
 *         path "../../constituent-vnfd[member-vnf-index = current()/../member-vnf-index-ref]/vnfd-id-ref";
 *       }
 *     }
 *     leaf vnfd-connection-point-ref {
 *       type leafref {
 *         path "/vnfd:vnfd-catalog/vnfd:vnfd[vnfd:id = current()/../vnfd-id-ref]/vnfd:connection-point/vnfd:name";
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/connection-point/connection</i>
 *
 */
public interface Connection
    extends
    ChoiceIn<ConnectionPoint>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("connection");


}

