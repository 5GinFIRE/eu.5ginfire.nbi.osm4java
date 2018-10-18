package yang.vnfd.vnfd.descriptor;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import ns.yang.ietf.inet.types.rev100924.PortNumber;
import yang.vnfd.$YangModuleInfoImpl;
import yang.vnfd.VnfdDescriptor;
import yang.vnfd.vnfd.descriptor.MgmtInterfaceBuilder.MgmtInterfaceImpl;
import yang.vnfd.vnfd.descriptor.mgmt._interface.DashboardParams;
import yang.vnfd.vnfd.descriptor.mgmt._interface.EndpointType;

/**
 * Interface over which the VNF is managed.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * container mgmt-interface {
 *   choice endpoint-type {
 *     case ip {
 *       leaf ip-address {
 *         type inet:ip-address;
 *       }
 *     }
 *     case vdu-id {
 *       leaf vdu-id {
 *         type leafref {
 *           path ../../../../vdu/id;
 *         }
 *       }
 *     }
 *     case cp {
 *       leaf cp {
 *         type leafref {
 *           path ../../../../connection-point/name;
 *         }
 *       }
 *     }
 *   }
 *   leaf port {
 *     type inet:port-number;
 *   }
 *   container dashboard-params {
 *     leaf path {
 *       type string;
 *     }
 *     leaf https {
 *       type boolean;
 *     }
 *     leaf port {
 *       type inet:port-number;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/mgmt-interface</i>
 * 
 * <p>To create instances of this class use {@link MgmtInterfaceBuilder}.
 * @see MgmtInterfaceBuilder
 *
 */
@JsonDeserialize(as = MgmtInterfaceImpl.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface MgmtInterface
    extends
    ChildOf<VnfdDescriptor>,
    Augmentable<MgmtInterface>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("mgmt-interface");

    /**
     * Indicates the type of management endpoint.
     *
     *
     *
     * @return <code>model.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.EndpointType</code> <code>endpointType</code>, or <code>null</code> if not present
     */
    @Nullable
    EndpointType getEndpointType();
    
    /**
     * Port for the management interface.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.PortNumber</code> <code>port</code>, or <code>null</code> if not present
     */
    @Nullable
    PortNumber getPort();
    
    /**
     * Parameters for the VNF dashboard
     *
     *
     *
     * @return <code>model.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.mgmt._interface.DashboardParams</code> <code>dashboardParams</code>, or <code>null</code> if not present
     */
    @Nullable
    DashboardParams getDashboardParams();

}

