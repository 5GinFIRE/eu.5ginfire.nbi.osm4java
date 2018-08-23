package yang.vnfd.vnfd.descriptor.vdu._interface;
import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

import yang.vnfd.$YangModuleInfoImpl;
import yang.vnfd.vnfd.descriptor.vdu.Interface;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * choice connection-point-type {
 *   case internal {
 *     leaf internal-connection-point-ref {
 *       type leafref {
 *         path ../../../../internal-connection-point/id;
 *       }
 *     }
 *   }
 *   case external {
 *     leaf external-connection-point-ref {
 *       type leafref {
 *         path ../../../../../connection-point/name;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/vdu/interface/connection-point-type</i>
 *
 */
public interface ConnectionPointType
    extends
    ChoiceIn<Interface>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("connection-point-type");


}

