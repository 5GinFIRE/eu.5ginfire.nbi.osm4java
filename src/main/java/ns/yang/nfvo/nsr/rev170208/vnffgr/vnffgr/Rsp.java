package ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.ietf.yang.types.rev130715.Uuid;
import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.nsr.rev170208.vnffgr.Vnffgr;
import ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRef;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list rsp {
 *   key id;
 *   leaf id {
 *     type yang:uuid;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   leaf rsp-id {
 *     type yang:uuid;
 *   }
 *   leaf vnffgd-rsp-id-ref {
 *     type leafref {
 *       path ../../../../../ns-instance-config/nsr[id=current()/../../../ns-instance-config-ref]/nsd/vnffgd[id=current()/../../vnffgd-id-ref]/rsp/id;
 *     }
 *   }
 *   leaf vnffgd-rsp-name-ref {
 *     type leafref {
 *       path ../../../../../ns-instance-config/nsr[id=current()/../../../ns-instance-config-ref]/nsd/vnffgd[id=current()/../../vnffgd-id-ref]/rsp[id=current()/../vnffgd-rsp-id-ref]/name;
 *     }
 *   }
 *   leaf classifier-name {
 *     type string;
 *   }
 *   leaf path-id {
 *     type uint32;
 *   }
 *   list vnfr-connection-point-ref {
 *     key hop-number;
 *     leaf hop-number {
 *       type uint8;
 *     }
 *     leaf service-function-type {
 *       type string;
 *     }
 *     leaf member-vnf-index-ref {
 *       type string;
 *     }
 *     leaf vnfd-id-ref {
 *       type string;
 *     }
 *     leaf vnfr-id-ref {
 *       type string;
 *     }
 *     leaf vnfr-name-ref {
 *       type string;
 *     }
 *     leaf vnfr-connection-point-ref {
 *       type leafref {
 *         path "../../../../../../vnfr:vnfr-catalog/vnfr:vnfr[vnfr:id = current()/../vnfr-id-ref]/vnfr:connection-point/vnfr:name";
 *       }
 *     }
 *     leaf service-index {
 *       type uint8;
 *     }
 *     container connection-point-params {
 *       leaf mgmt-address {
 *         type inet:ip-address;
 *       }
 *       leaf name {
 *         type string;
 *       }
 *       leaf port-id {
 *         type string;
 *       }
 *       leaf vm-id {
 *         type string;
 *       }
 *       leaf address {
 *         type inet:ip-address;
 *       }
 *       leaf port {
 *         type inet:port-number;
 *       }
 *     }
 *     container service-function-forwarder {
 *       leaf name {
 *         type string;
 *       }
 *       leaf ip-address {
 *         type inet:ip-address;
 *       }
 *       leaf port {
 *         type inet:port-number;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/vnffgr/vnffgr/rsp</i>
 * 
 * <p>To create instances of this class use {@link RspBuilder}.
 * @see RspBuilder
 * @see RspKey
 *
 */
public interface Rsp
    extends
    ChildOf<Vnffgr>,
    Augmentable<Rsp>,
    Identifiable<RspKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("rsp");

    /**
     * Identifier for the RSP.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable
    Uuid getId();
    
    /**
     * Name for the RSP
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * Returned Identifier for the RSP.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>rspId</code>, or <code>null</code> if not present
     */
    @Nullable
    Uuid getRspId();
    
    /**
     * Identifier for the VNFFG Descriptor RSP reference
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnffgdRspIdRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getVnffgdRspIdRef();
    
    /**
     * Name for the VNFFG Descriptor RSP reference
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnffgdRspNameRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getVnffgdRspNameRef();
    
    /**
     * @return <code>java.lang.String</code> <code>classifierName</code>, or <code>null</code> if not present
     */
    @Nullable
    String getClassifierName();
    
    /**
     * Unique Identifier for the service path
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>pathId</code>, or <code>null</code> if not present
     */
    @Nullable
    Long getPathId();
    
    /**
     * @return <code>java.util.List</code> <code>vnfrConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable
    List<VnfrConnectionPointRef> getVnfrConnectionPointRef();
    
    @Override
    RspKey key();

}

