package ns.yang.nfvo.nsr.rev170208;
import java.util.List;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * grouping vnffgr {
 *   list vnffgr {
 *     key id;
 *     leaf id {
 *       type yang:uuid;
 *     }
 *     leaf vnffgd-id-ref {
 *       type leafref {
 *         path ../../../../ns-instance-config/nsr[id=current()/../../ns-instance-config-ref]/nsd/vnffgd/id;
 *       }
 *     }
 *     leaf vnffgd-name-ref {
 *       type leafref {
 *         path ../../../../ns-instance-config/nsr[id=current()/../../ns-instance-config-ref]/nsd/vnffgd[id=current()/../vnffgd-id-ref]/name;
 *       }
 *     }
 *     leaf sdn-account {
 *       type string;
 *     }
 *     leaf cloud-account {
 *       type string;
 *     }
 *     leaf operational-status {
 *       type vnffgr-operational-status;
 *     }
 *     list rsp {
 *       key id;
 *       leaf id {
 *         type yang:uuid;
 *       }
 *       leaf name {
 *         type string;
 *       }
 *       leaf rsp-id {
 *         type yang:uuid;
 *       }
 *       leaf vnffgd-rsp-id-ref {
 *         type leafref {
 *           path ../../../../../ns-instance-config/nsr[id=current()/../../../ns-instance-config-ref]/nsd/vnffgd[id=current()/../../vnffgd-id-ref]/rsp/id;
 *         }
 *       }
 *       leaf vnffgd-rsp-name-ref {
 *         type leafref {
 *           path ../../../../../ns-instance-config/nsr[id=current()/../../../ns-instance-config-ref]/nsd/vnffgd[id=current()/../../vnffgd-id-ref]/rsp[id=current()/../vnffgd-rsp-id-ref]/name;
 *         }
 *       }
 *       leaf classifier-name {
 *         type string;
 *       }
 *       leaf path-id {
 *         type uint32;
 *       }
 *       list vnfr-connection-point-ref {
 *         key hop-number;
 *         leaf hop-number {
 *           type uint8;
 *         }
 *         leaf service-function-type {
 *           type string;
 *         }
 *         leaf member-vnf-index-ref {
 *           type string;
 *         }
 *         leaf vnfd-id-ref {
 *           type string;
 *         }
 *         leaf vnfr-id-ref {
 *           type string;
 *         }
 *         leaf vnfr-name-ref {
 *           type string;
 *         }
 *         leaf vnfr-connection-point-ref {
 *           type leafref {
 *             path "../../../../../../vnfr:vnfr-catalog/vnfr:vnfr[vnfr:id = current()/../vnfr-id-ref]/vnfr:connection-point/vnfr:name";
 *           }
 *         }
 *         leaf service-index {
 *           type uint8;
 *         }
 *         container connection-point-params {
 *           leaf mgmt-address {
 *             type inet:ip-address;
 *           }
 *           leaf name {
 *             type string;
 *           }
 *           leaf port-id {
 *             type string;
 *           }
 *           leaf vm-id {
 *             type string;
 *           }
 *           leaf address {
 *             type inet:ip-address;
 *           }
 *           leaf port {
 *             type inet:port-number;
 *           }
 *         }
 *         container service-function-forwarder {
 *           leaf name {
 *             type string;
 *           }
 *           leaf ip-address {
 *             type inet:ip-address;
 *           }
 *           leaf port {
 *             type inet:port-number;
 *           }
 *         }
 *       }
 *     }
 *     list classifier {
 *       key id;
 *       leaf id {
 *         type yang:uuid;
 *       }
 *       leaf name {
 *         type string;
 *       }
 *       leaf-list classifier-id {
 *         type yang:uuid;
 *       }
 *       leaf rsp-id-ref {
 *         type leafref {
 *           path ../../rsp/id;
 *         }
 *       }
 *       leaf rsp-name {
 *         type string;
 *       }
 *       leaf vnfr-id-ref {
 *         type string;
 *       }
 *       leaf vnfr-name-ref {
 *         type string;
 *       }
 *       leaf vnfr-connection-point-ref {
 *         type leafref {
 *           path "../../../../../vnfr:vnfr-catalog/vnfr:vnfr[vnfr:id = current()/../vnfr-id-ref]/vnfr:connection-point/vnfr:name";
 *         }
 *       }
 *       leaf port-id {
 *         type string;
 *       }
 *       leaf vm-id {
 *         type string;
 *       }
 *       leaf ip-address {
 *         type string;
 *       }
 *       leaf sff-name {
 *         type string;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/vnffgr</i>
 *
 */
public interface Vnffgr
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnffgr");

    /**
     * @return <code>java.util.List</code> <code>vnffgr</code>, or <code>null</code> if not present
     */
    @Nullable
    List<ns.yang.nfvo.nsr.rev170208.vnffgr.Vnffgr> getVnffgr();

}

