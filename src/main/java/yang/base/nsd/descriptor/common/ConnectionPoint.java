package yang.base.nsd.descriptor.common;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.ConnectionPointType;
import yang.base.$YangModuleInfoImpl;
import yang.base.NsdDescriptorCommon;
import yang.base.nsd.descriptor.common.connection.point.Connection;

/**
 * List for external connection points.Each NS has one or more external 
 * connectionpoints. As the name implies that externalconnection points are used 
 * for connectingthe NS to other NS or to external networks.Each NS exposes these 
 * connection points tothe orchestrator. The orchestrator canconstruct network 
 * service chains byconnecting the connection points betweendifferent NS.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list connection-point {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   leaf type {
 *     type manotypes:connection-point-type;
 *   }
 *   leaf floating-ip-required {
 *     type boolean;
 *   }
 *   choice connection {
 *     case vld-ref {
 *       leaf vld-id-ref {
 *         type string;
 *       }
 *     }
 *     case vnfd-connection-point-ref {
 *       leaf member-vnf-index-ref {
 *         type string;
 *       }
 *       leaf vnfd-id-ref {
 *         type leafref {
 *           path "../../constituent-vnfd[member-vnf-index = current()/../member-vnf-index-ref]/vnfd-id-ref";
 *         }
 *       }
 *       leaf vnfd-connection-point-ref {
 *         type leafref {
 *           path "/vnfd:vnfd-catalog/vnfd:vnfd[vnfd:id = current()/../vnfd-id-ref]/vnfd:connection-point/vnfd:name";
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/connection-point</i>
 * 
 * <p>To create instances of this class use {@link ConnectionPointBuilder}.
 * @see ConnectionPointBuilder
 * @see ConnectionPointKey
 *
 */
public interface ConnectionPoint
    extends
    ChildOf<NsdDescriptorCommon>,
    Augmentable<ConnectionPoint>,
    Identifiable<ConnectionPointKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("connection-point");

    /**
     * Name of the NS connection point.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * Type of the connection point.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ConnectionPointType</code> <code>type</code>, or <code>null</code> if not present
     */
    @Nullable
    ConnectionPointType getType();
    
    /**
     * Boolean parameter to indicate whether the CP must be exposed.A public IP address
     * will be allocated to this CP if exposed is true.The default is false meaning a 
     * floating IP address is not required.It must be explicitly asked for a floating 
     * IP address to be allocated.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>floatingIpRequired</code>, or <code>null</code> if not present
     */
    @Nullable
    Boolean isFloatingIpRequired();
    
    /**
     * Logical connection of the CP to a VLD or to a VNF CP
     *
     *
     *
     * @return <code>model.http.riftio.com.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.connection.point.Connection</code> <code>connection</code>, or <code>null</code> if not present
     */
    @Nullable
    Connection getConnection();
    
    @Override
    ConnectionPointKey key();

}

