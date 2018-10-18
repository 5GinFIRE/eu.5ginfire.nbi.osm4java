package ns.yang.nfvo.nsd.rev170228.nsd.vld.vld;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import ns.yang.ietf.inet.types.rev100924.IpAddress;
import ns.yang.nfvo.nsd.rev170228.$YangModuleInfoImpl;
import ns.yang.nfvo.nsd.rev170228.nsd.vld.Vld;
import ns.yang.nfvo.nsd.rev170228.nsd.vld.vld.VnfdConnectionPointRefBuilder.VnfdConnectionPointRefImpl;

/**
 * A list of references to connection points.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * list vnfd-connection-point-ref {
 *   key "member-vnf-index-ref vnfd-connection-point-ref";
 *   leaf member-vnf-index-ref {
 *     type string;
 *   }
 *   leaf vnfd-connection-point-ref {
 *     type leafref {
 *       path "/vnfd:vnfd-catalog/vnfd:vnfd[vnfd:id = current()/../vnfd-id-ref]/vnfd:connection-point/vnfd:name";
 *     }
 *   }
 *   leaf vnfd-id-ref {
 *     type leafref {
 *       path "../../../constituent-vnfd[member-vnf-index = current()/../member-vnf-index-ref]/vnfd-id-ref";
 *     }
 *   }
 *   leaf ip-address {
 *     type inet:ip-address;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd/nsd-vld/vld/vnfd-connection-point-ref</i>
 * 
 * <p>To create instances of this class use {@link VnfdConnectionPointRefBuilder}.
 * @see VnfdConnectionPointRefBuilder
 * @see VnfdConnectionPointRefKey
 *
 */
@JsonDeserialize(as = VnfdConnectionPointRefImpl.class)
@JsonIgnoreProperties(ignoreUnknown = true)

public interface VnfdConnectionPointRef
    extends
    ChildOf<Vld>,
    Augmentable<VnfdConnectionPointRef>,
    Identifiable<VnfdConnectionPointRefKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnfd-connection-point-ref");

    /**
     * Reference to member-vnf within constituent-vnfds
     *
     *
     *
     * @return <code>java.lang.String</code> <code>memberVnfIndexRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getMemberVnfIndexRef();
    
    /**
     * A reference to a connection point name
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getVnfdConnectionPointRef();
    
    /**
     * A reference to a VNFD
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdIdRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getVnfdIdRef();
    
    /**
     * IP address of the connection point
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.IpAddress</code> <code>ipAddress</code>, or <code>null</code> if not present
     */
    @Nullable
    IpAddress getIpAddress();
    
    @Override
    VnfdConnectionPointRefKey key();

}

