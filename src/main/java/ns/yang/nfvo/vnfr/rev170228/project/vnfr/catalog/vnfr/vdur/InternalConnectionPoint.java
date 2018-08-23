package ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.ietf.inet.types.rev100924.IpAddress;
import ns.yang.nfvo.vnfr.rev170228.$YangModuleInfoImpl;
import ns.yang.nfvo.vnfr.rev170228.AssociatedVirtualCps;
import ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur;
import yang.vnfd.CommonConnectionPoint;

/**
 * List for internal connection points. Each VNFChas zero or more internal 
 * connection points.Internal connection points are used for connectingthe VNF 
 * components internal to the VNF. If a VNFhas only one VNFC, it may not have any 
 * internalconnection points.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * list internal-connection-point {
 *   key id;
 *   uses vnfd-base:common-connection-point;
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
 * <i>vnfr/project/(urn:ietf:params:xml:ns:yang:nfvo:vnfr?revision=2017-02-28)vnfr-catalog/vnfr/vdur/internal-connection-point</i>
 * 
 * <p>To create instances of this class use {@link InternalConnectionPointBuilder}.
 * @see InternalConnectionPointBuilder
 * @see InternalConnectionPointKey
 *
 */
public interface InternalConnectionPoint
    extends
    ChildOf<Vdur>,
    Augmentable<InternalConnectionPoint>,
    CommonConnectionPoint,
    AssociatedVirtualCps,
    Identifiable<InternalConnectionPointKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("internal-connection-point");

    /**
     * IP address assigned to the internal connection point
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.IpAddress</code> <code>ipAddress</code>, or <code>null</code> if not present
     */
    @Nullable
    IpAddress getIpAddress();
    
    /**
     * MAC address assigned to the internal connection point
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
    InternalConnectionPointKey key();

}

