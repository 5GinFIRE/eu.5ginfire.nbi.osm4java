package yang.vnfd.vnfd.descriptor.mgmt._interface;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.ietf.inet.types.rev100924.PortNumber;
import yang.vnfd.$YangModuleInfoImpl;
import yang.vnfd.vnfd.descriptor.MgmtInterface;

/**
 * Parameters for the VNF dashboard
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * container dashboard-params {
 *   leaf path {
 *     type string;
 *   }
 *   leaf https {
 *     type boolean;
 *   }
 *   leaf port {
 *     type inet:port-number;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/mgmt-interface/dashboard-params</i>
 * 
 * <p>To create instances of this class use {@link DashboardParamsBuilder}.
 * @see DashboardParamsBuilder
 *
 */
public interface DashboardParams
    extends
    ChildOf<MgmtInterface>,
    Augmentable<DashboardParams>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("dashboard-params");

    /**
     * The HTTP path for the dashboard
     *
     *
     *
     * @return <code>java.lang.String</code> <code>path</code>, or <code>null</code> if not present
     */
    @Nullable
    String getPath();
    
    /**
     * Pick HTTPS instead of HTTP , Default is false
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>https</code>, or <code>null</code> if not present
     */
    @Nullable
    Boolean isHttps();
    
    /**
     * The HTTP port for the dashboard
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.PortNumber</code> <code>port</code>, or <code>null</code> if not present
     */
    @Nullable
    PortNumber getPort();

}

