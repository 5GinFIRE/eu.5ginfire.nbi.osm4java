package yang.vnfd.vnfd.descriptor.mgmt._interface;
import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

import yang.vnfd.$YangModuleInfoImpl;
import yang.vnfd.vnfd.descriptor.MgmtInterface;

/**
 * Indicates the type of management endpoint.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * choice endpoint-type {
 *   case ip {
 *     leaf ip-address {
 *       type inet:ip-address;
 *     }
 *   }
 *   case vdu-id {
 *     leaf vdu-id {
 *       type leafref {
 *         path ../../../../vdu/id;
 *       }
 *     }
 *   }
 *   case cp {
 *     leaf cp {
 *       type leafref {
 *         path ../../../../connection-point/name;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/mgmt-interface/endpoint-type</i>
 *
 */
public interface EndpointType
    extends
    ChoiceIn<MgmtInterface>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("endpoint-type");


}

