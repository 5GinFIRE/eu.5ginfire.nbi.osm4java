package ns.yang.nfvo.mano.types.rev170208;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.ServicePrimitive;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping ns-service-primitive {
 *   list service-primitive {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     list parameter {
 *       key name;
 *       uses manotypes:primitive-parameter;
 *     }
 *     list parameter-group {
 *       key name;
 *       leaf name {
 *         type string;
 *       }
 *       list parameter {
 *         key name;
 *         uses manotypes:primitive-parameter;
 *       }
 *       leaf mandatory {
 *         type boolean;
 *         default true;
 *       }
 *     }
 *     list vnf-primitive-group {
 *       key member-vnf-index-ref;
 *       leaf member-vnf-index-ref {
 *         type string;
 *       }
 *       leaf vnfd-id-ref {
 *         type string;
 *       }
 *       leaf vnfd-name {
 *         type string;
 *       }
 *       list primitive {
 *         key index;
 *         leaf index {
 *           type uint32;
 *         }
 *         leaf name {
 *           type string;
 *         }
 *       }
 *     }
 *     leaf user-defined-script {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/ns-service-primitive</i>
 *
 */
public interface NsServicePrimitive
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ns-service-primitive");

    /**
     * Network service level service primitives.
     *
     *
     *
     * @return <code>java.util.List</code> <code>servicePrimitive</code>, or <code>null</code> if not present
     */
    @Nullable
    List<ServicePrimitive> getServicePrimitive();

}

