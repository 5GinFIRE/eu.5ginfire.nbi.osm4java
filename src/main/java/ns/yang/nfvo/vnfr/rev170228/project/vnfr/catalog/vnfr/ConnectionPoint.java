package ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.ietf.inet.types.rev100924.IpAddress;
import ns.yang.ietf.yang.types.rev130715.Uuid;
import ns.yang.nfvo.vnfr.rev170228.$YangModuleInfoImpl;
import ns.yang.nfvo.vnfr.rev170228.AssociatedVirtualCps;
import ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr;
import yang.vnfd.CommonConnectionPoint;

/**
 * List for external connection points. Each VNF has oneor more external 
 * points. As the nameimplies that external connection points are used 
 * forconnecting the VNF to other VNFs or to external networks.Each VNF exposes 
 * these connection points to theorchestrator. The orchestrator can construct 
 * networkservices by connecting the connection points betweendifferent VNFs. The 
 * NFVO will use VLDs and VNFFGs atthe network service level to construct network 
 * services.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * list connection-point {
 *   key name;
 *   uses vnfd-base:common-connection-point;
 *   leaf vlr-ref {
 *     type leafref {
 *       path ../../../../vlr:vlr-catalog/vlr:vlr/vlr:id;
 *     }
 *   }
 *   leaf ip-address {
 *     type inet:ip-address;
 *   }
 *   leaf mac-address {
 *     type string;
 *   }
 *   leaf connection-point-id {
 *     type string;
 *   }
 *   uses associated-virtual-cps;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/project/(urn:ietf:params:xml:ns:yang:nfvo:vnfr?revision=2017-02-28)vnfr-catalog/vnfr/connection-point</i>
 * 
 * <p>To create instances of this class use {@link ConnectionPointBuilder}.
 * @see ConnectionPointBuilder
 * @see ConnectionPointKey
 *
 */
public interface ConnectionPoint
    extends
    ChildOf<Vnfr>,
    Augmentable<ConnectionPoint>,
    CommonConnectionPoint,
    AssociatedVirtualCps,
    Identifiable<ConnectionPointKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("connection-point");

    /**
     * Reference to the VLR associated with this connection point
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>vlrRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Uuid getVlrRef();
    
    /**
     * IP address assigned to the external connection point
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.IpAddress</code> <code>ipAddress</code>, or <code>null</code> if not present
     */
    @Nullable
    IpAddress getIpAddress();
    
    /**
     * MAC address assigned to the external connection point
     *
     *
     *
     * @return <code>java.lang.String</code> <code>macAddress</code>, or <code>null</code> if not present
     */
    @Nullable
    String getMacAddress();
    
    /**
     * @return <code>java.lang.String</code> <code>connectionPointId</code>, or <code>null</code> if not present
     */
    @Nullable
    String getConnectionPointId();
    
    @Override
    ConnectionPointKey key();

}

