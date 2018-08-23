package ns.yang.nfvo.vnfr.rev170228.project;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.vnfr.rev170228.$YangModuleInfoImpl;
import ns.yang.nfvo.vnfr.rev170228.Project1;
import ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * container vnfr-catalog {
 *   leaf schema-version {
 *     type string;
 *     default v3.0;
 *   }
 *   config false;
 *   list vnfr {
 *     key id;
 *     unique name;
 *     leaf id {
 *       type yang:uuid;
 *     }
 *     leaf nsr-id-ref {
 *       type yang:uuid;
 *     }
 *     leaf member-vnf-index-ref {
 *       type leafref {
 *         path ../../../project-nsd:nsd-catalog/project-nsd:nsd/project-nsd:constituent-vnfd/project-nsd:member-vnf-index;
 *       }
 *     }
 *     leaf dashboard-url {
 *       type inet:uri;
 *     }
 *     leaf name {
 *       type string;
 *     }
 *     leaf short-name {
 *       type string;
 *     }
 *     leaf vendor {
 *       type string;
 *     }
 *     leaf description {
 *       type string;
 *     }
 *     leaf version {
 *       type string;
 *     }
 *     leaf create-time {
 *       type uint32;
 *     }
 *     leaf uptime {
 *       type uint32;
 *     }
 *     container vnfd {
 *       uses vnfd-base:vnfd-descriptor;
 *     }
 *     leaf vnfd-ref {
 *       type leafref {
 *         path ../../../project-vnfd:vnfd-catalog/project-vnfd:vnfd/project-vnfd:id;
 *       }
 *     }
 *     container vnf-configuration {
 *       uses manotypes:vca-configuration;
 *     }
 *     container mgmt-interface {
 *       leaf ip-address {
 *         type inet:ip-address;
 *       }
 *       leaf port {
 *         type inet:port-number;
 *       }
 *       container ssh-key {
 *         leaf public-key {
 *           type string;
 *         }
 *         leaf private-key-file {
 *           type string;
 *         }
 *       }
 *     }
 *     list internal-vlr {
 *       key vlr-ref;
 *       leaf vlr-ref {
 *         type leafref {
 *           path ../../../../vlr:vlr-catalog/vlr:vlr/vlr:id;
 *         }
 *       }
 *       leaf-list internal-connection-point-ref {
 *         type leafref {
 *           path ../../vdur/internal-connection-point/id;
 *         }
 *       }
 *     }
 *     list connection-point {
 *       key name;
 *       uses vnfd-base:common-connection-point;
 *       leaf vlr-ref {
 *         type leafref {
 *           path ../../../../vlr:vlr-catalog/vlr:vlr/vlr:id;
 *         }
 *       }
 *       leaf ip-address {
 *         type inet:ip-address;
 *       }
 *       leaf mac-address {
 *         type string;
 *       }
 *       leaf connection-point-id {
 *         type string;
 *       }
 *       uses associated-virtual-cps;
 *     }
 *     list vdur {
 *       key id;
 *       unique name;
 *       leaf id {
 *         type yang:uuid;
 *       }
 *       leaf name {
 *         type string;
 *       }
 *       leaf unique-short-name {
 *         type string;
 *       }
 *       leaf vdu-id-ref {
 *         type leafref {
 *           path ../../vnfd/vdu/id;
 *         }
 *       }
 *       leaf vim-id {
 *         type string;
 *       }
 *       leaf flavor-id {
 *         type string;
 *       }
 *       leaf image-id {
 *         type string;
 *       }
 *       leaf management-ip {
 *         type inet:ip-address;
 *       }
 *       leaf vm-management-ip {
 *         type inet:ip-address;
 *       }
 *       leaf console-url {
 *         type inet:uri;
 *       }
 *       uses manotypes:vm-flavor;
 *       uses manotypes:guest-epa;
 *       uses manotypes:vswitch-epa;
 *       uses manotypes:hypervisor-epa;
 *       uses manotypes:host-epa;
 *       uses manotypes:supplemental-boot-data;
 *       container vdu-configuration {
 *         uses manotypes:vca-configuration;
 *       }
 *       list monitoring-param {
 *         key id;
 *         leaf id {
 *           type string;
 *         }
 *         leaf nfvi-metric {
 *           type manotypes:nfvi-metric-type;
 *         }
 *         leaf interface-name-ref {
 *           type leafref {
 *             path ../../interface/name;
 *           }
 *         }
 *       }
 *       list volumes {
 *         key name;
 *         leaf name {
 *           type string;
 *         }
 *         leaf volume-id {
 *           type string;
 *         }
 *         uses manotypes:volume-info;
 *       }
 *       list internal-connection-point {
 *         key id;
 *         uses vnfd-base:common-connection-point;
 *         leaf ip-address {
 *           type inet:ip-address;
 *         }
 *         leaf mac-address {
 *           type string;
 *         }
 *         leaf connection-point-id {
 *           type string;
 *         }
 *         uses associated-virtual-cps;
 *       }
 *       list interface {
 *         key name;
 *         leaf name {
 *           type string;
 *         }
 *         leaf position {
 *           type uint32;
 *         }
 *         leaf type {
 *           type vnfd-base:interface-type;
 *           default EXTERNAL;
 *         }
 *         choice connection-point-type {
 *           case internal {
 *             leaf internal-connection-point-ref {
 *               type leafref {
 *                 path ../../../../internal-connection-point/id;
 *               }
 *             }
 *           }
 *           case external {
 *             leaf external-connection-point-ref {
 *               type leafref {
 *                 path ../../../../../connection-point/name;
 *               }
 *             }
 *           }
 *         }
 *         uses virtual-interface;
 *       }
 *       leaf operational-status {
 *         type vdu-operational-status;
 *       }
 *       uses placement-group-info;
 *     }
 *     list monitoring-param {
 *       key id;
 *       leaf id {
 *         type string;
 *       }
 *       leaf name {
 *         type string;
 *       }
 *       uses manotypes:monitoring-param-aggregation;
 *       choice monitoring-type {
 *         case vdu-monitoring-param {
 *           container vdu-monitoring-param {
 *             leaf vdu-ref {
 *               type leafref {
 *                 path ../../../../../vdur/id;
 *               }
 *             }
 *             leaf vdu-monitoring-param-ref {
 *               type leafref {
 *                 path "../../../vdur[id = current()/../vdu-ref]/monitoring-param/id";
 *               }
 *             }
 *           }
 *         }
 *         case vnf-metric {
 *           container vnf-metric {
 *             leaf vnf-metric-name-ref {
 *               type leafref {
 *                 path ../../../../../vnf-configuration/metrics/name;
 *               }
 *             }
 *           }
 *         }
 *         case vdu-metric {
 *           container vdu-metric {
 *             leaf vdu-ref {
 *               type leafref {
 *                 path ../../../../../vdur/id;
 *               }
 *             }
 *             leaf vdu-metric-name-ref {
 *               type leafref {
 *                 path "../../../vdur[id = current()/../vdu-ref]/vdu-configuration/metrics/name";
 *               }
 *             }
 *           }
 *         }
 *       }
 *     }
 *     leaf operational-status {
 *       type vnf-operational-status;
 *     }
 *     leaf config-status {
 *       type enumeration {
 *         enum configuring {
 *           value 1;
 *         }
 *         enum configured {
 *           value 2;
 *         }
 *         enum failed {
 *           value 3;
 *         }
 *         enum config-not-needed {
 *           value 4;
 *         }
 *       }
 *     }
 *     uses placement-group-info;
 *     container cloud-config {
 *       uses manotypes:cloud-config;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/project/(urn:ietf:params:xml:ns:yang:nfvo:vnfr?revision=2017-02-28)vnfr-catalog</i>
 * 
 * <p>To create instances of this class use {@link VnfrCatalogBuilder}.
 * @see VnfrCatalogBuilder
 *
 */
public interface VnfrCatalog
    extends
    ChildOf<Project1>,
    Augmentable<VnfrCatalog>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnfr-catalog");

    /**
     * Schema version for the VNFR. If unspecified, it assumes v3.0
     *
     *
     *
     * @return <code>java.lang.String</code> <code>schemaVersion</code>, or <code>null</code> if not present
     */
    @Nullable
    String getSchemaVersion();
    
    /**
     * Virtual Network Function Record (VNFR).
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfr</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Vnfr> getVnfr();

}

