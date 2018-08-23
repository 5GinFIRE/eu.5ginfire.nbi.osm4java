package ns.yang.nfvo.mano.types.rev170208;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.http.endpoints.HttpEndpoint;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping http-endpoints {
 *   list http-endpoint {
 *     key path;
 *     leaf path {
 *       type string;
 *     }
 *     leaf https {
 *       type boolean;
 *       default false;
 *     }
 *     leaf port {
 *       type inet:port-number;
 *     }
 *     leaf username {
 *       type string;
 *     }
 *     leaf password {
 *       type string;
 *     }
 *     leaf polling-interval-secs {
 *       type uint8;
 *       default 2;
 *     }
 *     leaf method {
 *       type manotypes:http-method;
 *       default GET;
 *     }
 *     list headers {
 *       key key;
 *       leaf key {
 *         type string;
 *       }
 *       leaf value {
 *         type string;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/http-endpoints</i>
 *
 */
public interface HttpEndpoints
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("http-endpoints");

    /**
     * List of http endpoints to be used by monitoring params
     *
     *
     *
     * @return <code>java.util.List</code> <code>httpEndpoint</code>, or <code>null</code> if not present
     */
    @Nullable
    List<HttpEndpoint> getHttpEndpoint();

}

