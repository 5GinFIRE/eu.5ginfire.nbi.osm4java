package ns.yang.nfvo.nsd.rev170228.nsd.vld;
import java.lang.Override;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import ns.yang.nfvo.nsd.rev170228.$YangModuleInfoImpl;
import ns.yang.nfvo.nsd.rev170228.NsdVld;
import ns.yang.nfvo.nsd.rev170228.nsd.vld.VldBuilder.VldImpl;
import ns.yang.nfvo.nsd.rev170228.nsd.vld.vld.VnfdConnectionPointRef;
import yang.base.NsdVldCommon;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * list vld {
 *   key id;
 *   uses nsd-base:nsd-vld-common;
 *   list vnfd-connection-point-ref {
 *     key "member-vnf-index-ref vnfd-connection-point-ref";
 *     leaf member-vnf-index-ref {
 *       type string;
 *     }
 *     leaf vnfd-connection-point-ref {
 *       type leafref {
 *         path "/vnfd:vnfd-catalog/vnfd:vnfd[vnfd:id = current()/../vnfd-id-ref]/vnfd:connection-point/vnfd:name";
 *       }
 *     }
 *     leaf vnfd-id-ref {
 *       type leafref {
 *         path "../../../constituent-vnfd[member-vnf-index = current()/../member-vnf-index-ref]/vnfd-id-ref";
 *       }
 *     }
 *     leaf ip-address {
 *       type inet:ip-address;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd/nsd-vld/vld</i>
 * 
 * <p>To create instances of this class use {@link VldBuilder}.
 * @see VldBuilder
 * @see VldKey
 *
 */
@JsonDeserialize(as = VldImpl.class)
//@JsonIgnoreProperties( {"vim-network-name", "ip-profile-ref"} )
@JsonIgnoreProperties(ignoreUnknown = true)
public interface Vld
    extends
    ChildOf<NsdVld>,
    Augmentable<Vld>,
    NsdVldCommon,
    Identifiable<VldKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vld");

    /**
     * A list of references to connection points.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfdConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable
    List<VnfdConnectionPointRef> getVnfdConnectionPointRef();
    
    @Override
    VldKey key();

}

