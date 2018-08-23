package ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;

import ns.yang.ietf.inet.types.rev100924.Uri;
import ns.yang.ietf.yang.types.rev130715.Uuid;
import ns.yang.nfvo.vnfr.rev170228.$YangModuleInfoImpl;
import ns.yang.nfvo.vnfr.rev170228.PlacementGroupInfo;
import ns.yang.nfvo.vnfr.rev170228.VnfOperationalStatus;
import ns.yang.nfvo.vnfr.rev170228.project.VnfrCatalog;
import ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.CloudConfig;
import ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.ConnectionPoint;
import ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.InternalVlr;
import ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.MgmtInterface;
import ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.MonitoringParam;
import ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur;
import ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.VnfConfiguration;
import ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vnfd;

import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Enumeration;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Virtual Network Function Record (VNFR).
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * list vnfr {
 *   key id;
 *   unique name;
 *   leaf id {
 *     type yang:uuid;
 *   }
 *   leaf nsr-id-ref {
 *     type yang:uuid;
 *   }
 *   leaf member-vnf-index-ref {
 *     type leafref {
 *       path ../../../project-nsd:nsd-catalog/project-nsd:nsd/project-nsd:constituent-vnfd/project-nsd:member-vnf-index;
 *     }
 *   }
 *   leaf dashboard-url {
 *     type inet:uri;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   leaf short-name {
 *     type string;
 *   }
 *   leaf vendor {
 *     type string;
 *   }
 *   leaf description {
 *     type string;
 *   }
 *   leaf version {
 *     type string;
 *   }
 *   leaf create-time {
 *     type uint32;
 *   }
 *   leaf uptime {
 *     type uint32;
 *   }
 *   container vnfd {
 *     uses vnfd-base:vnfd-descriptor;
 *   }
 *   leaf vnfd-ref {
 *     type leafref {
 *       path ../../../project-vnfd:vnfd-catalog/project-vnfd:vnfd/project-vnfd:id;
 *     }
 *   }
 *   container vnf-configuration {
 *     uses manotypes:vca-configuration;
 *   }
 *   container mgmt-interface {
 *     leaf ip-address {
 *       type inet:ip-address;
 *     }
 *     leaf port {
 *       type inet:port-number;
 *     }
 *     container ssh-key {
 *       leaf public-key {
 *         type string;
 *       }
 *       leaf private-key-file {
 *         type string;
 *       }
 *     }
 *   }
 *   list internal-vlr {
 *     key vlr-ref;
 *     leaf vlr-ref {
 *       type leafref {
 *         path ../../../../vlr:vlr-catalog/vlr:vlr/vlr:id;
 *       }
 *     }
 *     leaf-list internal-connection-point-ref {
 *       type leafref {
 *         path ../../vdur/internal-connection-point/id;
 *       }
 *     }
 *   }
 *   list connection-point {
 *     key name;
 *     uses vnfd-base:common-connection-point;
 *     leaf vlr-ref {
 *       type leafref {
 *         path ../../../../vlr:vlr-catalog/vlr:vlr/vlr:id;
 *       }
 *     }
 *     leaf ip-address {
 *       type inet:ip-address;
 *     }
 *     leaf mac-address {
 *       type string;
 *     }
 *     leaf connection-point-id {
 *       type string;
 *     }
 *     uses associated-virtual-cps;
 *   }
 *   list vdur {
 *     key id;
 *     unique name;
 *     leaf id {
 *       type yang:uuid;
 *     }
 *     leaf name {
 *       type string;
 *     }
 *     leaf unique-short-name {
 *       type string;
 *     }
 *     leaf vdu-id-ref {
 *       type leafref {
 *         path ../../vnfd/vdu/id;
 *       }
 *     }
 *     leaf vim-id {
 *       type string;
 *     }
 *     leaf flavor-id {
 *       type string;
 *     }
 *     leaf image-id {
 *       type string;
 *     }
 *     leaf management-ip {
 *       type inet:ip-address;
 *     }
 *     leaf vm-management-ip {
 *       type inet:ip-address;
 *     }
 *     leaf console-url {
 *       type inet:uri;
 *     }
 *     uses manotypes:vm-flavor;
 *     uses manotypes:guest-epa;
 *     uses manotypes:vswitch-epa;
 *     uses manotypes:hypervisor-epa;
 *     uses manotypes:host-epa;
 *     uses manotypes:supplemental-boot-data;
 *     container vdu-configuration {
 *       uses manotypes:vca-configuration;
 *     }
 *     list monitoring-param {
 *       key id;
 *       leaf id {
 *         type string;
 *       }
 *       leaf nfvi-metric {
 *         type manotypes:nfvi-metric-type;
 *       }
 *       leaf interface-name-ref {
 *         type leafref {
 *           path ../../interface/name;
 *         }
 *       }
 *     }
 *     list volumes {
 *       key name;
 *       leaf name {
 *         type string;
 *       }
 *       leaf volume-id {
 *         type string;
 *       }
 *       uses manotypes:volume-info;
 *     }
 *     list internal-connection-point {
 *       key id;
 *       uses vnfd-base:common-connection-point;
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
 *     list interface {
 *       key name;
 *       leaf name {
 *         type string;
 *       }
 *       leaf position {
 *         type uint32;
 *       }
 *       leaf type {
 *         type vnfd-base:interface-type;
 *         default EXTERNAL;
 *       }
 *       choice connection-point-type {
 *         case internal {
 *           leaf internal-connection-point-ref {
 *             type leafref {
 *               path ../../../../internal-connection-point/id;
 *             }
 *           }
 *         }
 *         case external {
 *           leaf external-connection-point-ref {
 *             type leafref {
 *               path ../../../../../connection-point/name;
 *             }
 *           }
 *         }
 *       }
 *       uses virtual-interface;
 *     }
 *     leaf operational-status {
 *       type vdu-operational-status;
 *     }
 *     uses placement-group-info;
 *   }
 *   list monitoring-param {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     leaf name {
 *       type string;
 *     }
 *     uses manotypes:monitoring-param-aggregation;
 *     choice monitoring-type {
 *       case vdu-monitoring-param {
 *         container vdu-monitoring-param {
 *           leaf vdu-ref {
 *             type leafref {
 *               path ../../../../../vdur/id;
 *             }
 *           }
 *           leaf vdu-monitoring-param-ref {
 *             type leafref {
 *               path "../../../vdur[id = current()/../vdu-ref]/monitoring-param/id";
 *             }
 *           }
 *         }
 *       }
 *       case vnf-metric {
 *         container vnf-metric {
 *           leaf vnf-metric-name-ref {
 *             type leafref {
 *               path ../../../../../vnf-configuration/metrics/name;
 *             }
 *           }
 *         }
 *       }
 *       case vdu-metric {
 *         container vdu-metric {
 *           leaf vdu-ref {
 *             type leafref {
 *               path ../../../../../vdur/id;
 *             }
 *           }
 *           leaf vdu-metric-name-ref {
 *             type leafref {
 *               path "../../../vdur[id = current()/../vdu-ref]/vdu-configuration/metrics/name";
 *             }
 *           }
 *         }
 *       }
 *     }
 *   }
 *   leaf operational-status {
 *     type vnf-operational-status;
 *   }
 *   leaf config-status {
 *     type enumeration {
 *       enum configuring {
 *         value 1;
 *       }
 *       enum configured {
 *         value 2;
 *       }
 *       enum failed {
 *         value 3;
 *       }
 *       enum config-not-needed {
 *         value 4;
 *       }
 *     }
 *   }
 *   uses placement-group-info;
 *   container cloud-config {
 *     uses manotypes:cloud-config;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/project/(urn:ietf:params:xml:ns:yang:nfvo:vnfr?revision=2017-02-28)vnfr-catalog/vnfr</i>
 * 
 * <p>To create instances of this class use {@link VnfrBuilder}.
 * @see VnfrBuilder
 * @see VnfrKey
 *
 */
public interface Vnfr
    extends
    ChildOf<VnfrCatalog>,
    Augmentable<Vnfr>,
    PlacementGroupInfo,
    Identifiable<VnfrKey>
{


    public enum ConfigStatus implements Enumeration {
        Configuring(1, "configuring"),
        
        Configured(2, "configured"),
        
        Failed(3, "failed"),
        
        ConfigNotNeeded(4, "config-not-needed")
        ;
    
        private static final Map<String, ConfigStatus> NAME_MAP;
        private static final Map<Integer, ConfigStatus> VALUE_MAP;
    
        static {
            final Builder<String, ConfigStatus> nb = ImmutableMap.builder();
            final Builder<Integer, ConfigStatus> vb = ImmutableMap.builder();
            for (ConfigStatus enumItem : ConfigStatus.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private ConfigStatus(int value, String name) {
            this.value = value;
            this.name = name;
        }
    
        @Override
        public String getName() {
            return name;
        }
    
        @Override
        public int getIntValue() {
            return value;
        }
    
        /**
         * Return the enumeration member whose {@link #getName()} matches specified value.
         *
         * @param name YANG assigned name
         * @return corresponding ConfigStatus item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<ConfigStatus> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding ConfigStatus item, or null if no such item exists
         */
        public static ConfigStatus forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnfr");

    /**
     * Identifier for the VNFR.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable
    Uuid getId();
    
    /**
     * NS instance identifier.This is a leafref /nsr:ns-instance-config/nsr:nsr/nsr:id
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>nsrIdRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Uuid getNsrIdRef();
    
    /**
     * Reference to member VNF index in Network service.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>memberVnfIndexRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getMemberVnfIndexRef();
    
    /**
     * Dashboard URL
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Uri</code> <code>dashboardUrl</code>, or <code>null</code> if not present
     */
    @Nullable
    Uri getDashboardUrl();
    
    /**
     * VNFR name.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * VNFR short name.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>shortName</code>, or <code>null</code> if not present
     */
    @Nullable
    String getShortName();
    
    /**
     * Vendor of the VNFR.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vendor</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVendor();
    
    /**
     * Description of the VNFR.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    @Nullable
    String getDescription();
    
    /**
     * Version of the VNFR
     *
     *
     *
     * @return <code>java.lang.String</code> <code>version</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVersion();
    
    /**
     * Creation timestamp of this Virtual NetworkFunction. The timestamp is expressed 
     * asseconds since unix epoch - 1970-01-01T00:00:00Z
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>createTime</code>, or <code>null</code> if not present
     */
    @Nullable
    Long getCreateTime();
    
    /**
     * Active period of this Virtual Network Function.Uptime is expressed in seconds
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>uptime</code>, or <code>null</code> if not present
     */
    @Nullable
    Long getUptime();
    
    /**
     * VNF descriptor used to instantiate this VNF
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vnfd</code> <code>vnfd</code>, or <code>null</code> if not present
     */
    @Nullable
    Vnfd getVnfd();
    
    /**
     * Reference to VNFD
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfdRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVnfdRef();
    
    /**
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.VnfConfiguration</code> <code>vnfConfiguration</code>, or <code>null</code> if not present
     */
    @Nullable
    VnfConfiguration getVnfConfiguration();
    
    /**
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.MgmtInterface</code> <code>mgmtInterface</code>, or <code>null</code> if not present
     */
    @Nullable
    MgmtInterface getMgmtInterface();
    
    /**
     * @return <code>java.util.List</code> <code>internalVlr</code>, or <code>null</code> if not present
     */
    @Nullable
    List<InternalVlr> getInternalVlr();
    
    /**
     * List for external connection points. Each VNF has oneor more external connection
     * points. As the nameimplies that external connection points are used 
     * forconnecting the VNF to other VNFs or to external networks.Each VNF exposes 
     * these connection points to theorchestrator. The orchestrator can construct 
     * networkservices by connecting the connection points betweendifferent VNFs. The 
     * NFVO will use VLDs and VNFFGs atthe network service level to construct network 
     * services.
     *
     *
     *
     * @return <code>java.util.List</code> <code>connectionPoint</code>, or <code>null</code> if not present
     */
    @Nullable
    List<ConnectionPoint> getConnectionPoint();
    
    /**
     * List of Virtual Deployment Units
     *
     *
     *
     * @return <code>java.util.List</code> <code>vdur</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Vdur> getVdur();
    
    /**
     * List of monitoring parameters at the network service level
     *
     *
     *
     * @return <code>java.util.List</code> <code>monitoringParam</code>, or <code>null</code> if not present
     */
    @Nullable
    List<MonitoringParam> getMonitoringParam();
    
    /**
     * The operational status of the VNFR instance pre-init : The VNF before Input 
     * Param Substitution. init : The VNF has just started. vl-init-phase : The 
     * internal VLs in the VNF are being instantiated. vm-init-phase : The VMs for VDUs
     * in the VNF are being instantiated. running : The VNF is in running state. 
     * terminate : The VNF is being terminated. vm-terminate-phase : The VMs in the VNF
     * are being terminated. vl-terminate-phase : The internal VLs in the VNF are being
     * terminated. terminated : The VNF is in the terminated state. failed : The VNF 
     * instantiation failed
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.VnfOperationalStatus</code> <code>operationalStatus</code>, or <code>null</code> if not present
     */
    @Nullable
    VnfOperationalStatus getOperationalStatus();
    
    /**
     * The configuration status of the NS instanceconfiguring: At least one of the VNFs
     * in this instance is in configuring stateconfigured: All the VNFs in this NS 
     * instance are configured or config-not-needed state
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr.ConfigStatus</code> <code>configStatus</code>, or <code>null</code> if not present
     */
    @Nullable
    ConfigStatus getConfigStatus();
    
    /**
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.CloudConfig</code> <code>cloudConfig</code>, or <code>null</code> if not present
     */
    @Nullable
    CloudConfig getCloudConfig();
    
    @Override
    VnfrKey key();

}

