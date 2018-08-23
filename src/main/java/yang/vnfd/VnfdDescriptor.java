package yang.vnfd;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;

import ns.yang.nfvo.mano.types.rev170208.HttpEndpoints;
import ns.yang.nfvo.mano.types.rev170208.IpProfileList;
import yang.vnfd.vnfd.descriptor.ConnectionPoint;
import yang.vnfd.vnfd.descriptor.InternalVld;
import yang.vnfd.vnfd.descriptor.MgmtInterface;
import yang.vnfd.vnfd.descriptor.MonitoringParam;
import yang.vnfd.vnfd.descriptor.PlacementGroups;
import yang.vnfd.vnfd.descriptor.ScalingGroupDescriptor;
import yang.vnfd.vnfd.descriptor.Vdu;
import yang.vnfd.vnfd.descriptor.VduDependency;
import yang.vnfd.vnfd.descriptor.VnfConfiguration;

import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Enumeration;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * grouping vnfd-descriptor {
 *   leaf id {
 *     type string {
 *       length 1..63;
 *     }
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
 *   leaf logo {
 *     type string;
 *   }
 *   leaf description {
 *     type string;
 *   }
 *   leaf version {
 *     type string;
 *   }
 *   container vnf-configuration {
 *     uses manotypes:vca-configuration;
 *   }
 *   leaf operational-status {
 *     type vnf-operational-status;
 *   }
 *   container mgmt-interface {
 *     choice endpoint-type {
 *       case ip {
 *         leaf ip-address {
 *           type inet:ip-address;
 *         }
 *       }
 *       case vdu-id {
 *         leaf vdu-id {
 *           type leafref {
 *             path ../../../../vdu/id;
 *           }
 *         }
 *       }
 *       case cp {
 *         leaf cp {
 *           type leafref {
 *             path ../../../../connection-point/name;
 *           }
 *         }
 *       }
 *     }
 *     leaf port {
 *       type inet:port-number;
 *     }
 *     container dashboard-params {
 *       leaf path {
 *         type string;
 *       }
 *       leaf https {
 *         type boolean;
 *       }
 *       leaf port {
 *         type inet:port-number;
 *       }
 *     }
 *   }
 *   list internal-vld {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     leaf name {
 *       type string;
 *     }
 *     leaf short-name {
 *       type string;
 *     }
 *     leaf description {
 *       type string;
 *     }
 *     leaf type {
 *       type manotypes:virtual-link-type;
 *     }
 *     leaf root-bandwidth {
 *       type uint64;
 *     }
 *     leaf leaf-bandwidth {
 *       type uint64;
 *     }
 *     list internal-connection-point {
 *       key id-ref;
 *       leaf id-ref {
 *         type leafref {
 *           path ../../../vdu/internal-connection-point/id;
 *         }
 *       }
 *       leaf ip-address {
 *         type inet:ip-address;
 *       }
 *     }
 *     uses manotypes:provider-network;
 *     choice init-params {
 *       case vim-network-ref {
 *         leaf vim-network-name {
 *           type string;
 *         }
 *       }
 *       case vim-network-profile {
 *         leaf ip-profile-ref {
 *           type string;
 *         }
 *       }
 *     }
 *   }
 *   uses manotypes:ip-profile-list;
 *   list connection-point {
 *     key name;
 *     uses common-connection-point;
 *     leaf internal-vld-ref {
 *       type leafref {
 *         path ../../internal-vld/id;
 *       }
 *     }
 *   }
 *   list vdu {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     leaf name {
 *       type string;
 *     }
 *     leaf description {
 *       type string;
 *     }
 *     leaf pdu-type {
 *       type string;
 *     }
 *     leaf count {
 *       type uint64;
 *     }
 *     leaf mgmt-vpci {
 *       type string;
 *     }
 *     uses manotypes:vm-flavor;
 *     uses manotypes:guest-epa;
 *     uses manotypes:vswitch-epa;
 *     uses manotypes:hypervisor-epa;
 *     uses manotypes:host-epa;
 *     list alarm {
 *       key alarm-id;
 *       uses manotypes:alarm;
 *     }
 *     uses manotypes:image-properties;
 *     list alternative-images {
 *       key vim-type;
 *       leaf vim-type {
 *         type string;
 *       }
 *       uses manotypes:image-properties;
 *     }
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
 *     choice cloud-init-input {
 *       case inline {
 *         leaf cloud-init {
 *           type string;
 *         }
 *       }
 *       case filename {
 *         leaf cloud-init-file {
 *           type string;
 *         }
 *       }
 *     }
 *     uses manotypes:supplemental-boot-data;
 *     list internal-connection-point {
 *       key id;
 *       uses common-connection-point;
 *       leaf internal-vld-ref {
 *         type leafref {
 *           path ../../../internal-vld/id;
 *         }
 *       }
 *     }
 *     list interface {
 *       key name;
 *       leaf name {
 *         type string;
 *       }
 *       leaf position {
 *         type uint32;
 *       }
 *       leaf mgmt-interface {
 *         type boolean;
 *         default false;
 *       }
 *       leaf type {
 *         type interface-type;
 *         default EXTERNAL;
 *       }
 *       leaf mac-address {
 *         type string;
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
 *     list volumes {
 *       key name;
 *       leaf name {
 *         type string;
 *       }
 *       uses manotypes:volume-info;
 *     }
 *   }
 *   list vdu-dependency {
 *     key vdu-source-ref;
 *     leaf vdu-source-ref {
 *       type leafref {
 *         path ../../vdu/id;
 *       }
 *     }
 *     leaf vdu-depends-on-ref {
 *       type leafref {
 *         path ../../vdu/id;
 *       }
 *     }
 *   }
 *   leaf service-function-chain {
 *     type enumeration {
 *       enum UNAWARE;
 *       enum CLASSIFIER;
 *       enum SF;
 *       enum SFF;
 *     }
 *     default UNAWARE;
 *   }
 *   leaf service-function-type {
 *     type string;
 *   }
 *   uses manotypes:http-endpoints;
 *   list scaling-group-descriptor {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     list scaling-policy {
 *       key name;
 *       leaf name {
 *         type string;
 *       }
 *       leaf scaling-type {
 *         type manotypes:scaling-policy-type;
 *       }
 *       leaf enabled {
 *         type boolean;
 *         default true;
 *       }
 *       leaf scale-in-operation-type {
 *         type manotypes:scaling-criteria-operation;
 *         default AND;
 *       }
 *       leaf scale-out-operation-type {
 *         type manotypes:scaling-criteria-operation;
 *         default OR;
 *       }
 *       leaf threshold-time {
 *         type uint32;
 *       }
 *       leaf cooldown-time {
 *         type uint32;
 *       }
 *       list scaling-criteria {
 *         key name;
 *         leaf name {
 *           type string;
 *         }
 *         leaf scale-in-threshold {
 *           type uint64;
 *         }
 *         leaf scale-in-relational-operation {
 *           type manotypes:relational-operation-type;
 *           default LE;
 *         }
 *         leaf scale-out-threshold {
 *           type uint64;
 *         }
 *         leaf scale-out-relational-operation {
 *           type manotypes:relational-operation-type;
 *           default GE;
 *         }
 *         leaf vnf-monitoring-param-ref {
 *           type leafref {
 *             path ../../../../monitoring-param/id;
 *           }
 *         }
 *       }
 *     }
 *     list vdu {
 *       key vdu-id-ref;
 *       leaf vdu-id-ref {
 *         type leafref {
 *           path ../../../vdu/id;
 *         }
 *       }
 *       leaf count {
 *         type uint32;
 *         default 1;
 *       }
 *     }
 *     leaf min-instance-count {
 *       type uint32;
 *       default 0;
 *     }
 *     leaf max-instance-count {
 *       type uint32;
 *       default 10;
 *     }
 *     list scaling-config-action {
 *       key trigger;
 *       leaf trigger {
 *         type manotypes:scaling-trigger;
 *       }
 *       leaf vnf-config-primitive-name-ref {
 *         type leafref {
 *           path ../../../vnf-configuration/config-primitive/name;
 *         }
 *       }
 *     }
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
 *               path ../../../../../vdu/id;
 *             }
 *           }
 *           leaf vdu-monitoring-param-ref {
 *             type leafref {
 *               path "../../../../vdu[id = current()/../vdu-ref]/monitoring-param/id";
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
 *               path ../../../../../vdu/id;
 *             }
 *           }
 *           leaf vdu-metric-name-ref {
 *             type leafref {
 *               path "../../../../../vdu[id = current()/../vdu-ref]/vdu-configuration/metrics/name";
 *             }
 *           }
 *         }
 *       }
 *     }
 *     leaf http-endpoint-ref {
 *       type leafref {
 *         path ../../http-endpoint/path;
 *       }
 *     }
 *     leaf json-query-method {
 *       type manotypes:json-query-method;
 *       default NAMEKEY;
 *     }
 *     container json-query-params {
 *       leaf json-path {
 *         type string;
 *       }
 *       leaf object-path {
 *         type string;
 *       }
 *     }
 *     uses manotypes:monitoring-param-ui-data;
 *     uses manotypes:monitoring-param-value;
 *   }
 *   list placement-groups {
 *     key name;
 *     uses manotypes:placement-group-info;
 *     list member-vdus {
 *       key member-vdu-ref;
 *       leaf member-vdu-ref {
 *         type leafref {
 *           path ../../../vdu/id;
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor</i>
 *
 */
public interface VnfdDescriptor
    extends
    DataObject,
    IpProfileList,
    HttpEndpoints
{


    public enum ServiceFunctionChain implements Enumeration {
        UNAWARE(0, "UNAWARE"),
        
        CLASSIFIER(1, "CLASSIFIER"),
        
        SF(2, "SF"),
        
        SFF(3, "SFF")
        ;
    
        private static final Map<String, ServiceFunctionChain> NAME_MAP;
        private static final Map<Integer, ServiceFunctionChain> VALUE_MAP;
    
        static {
            final Builder<String, ServiceFunctionChain> nb = ImmutableMap.builder();
            final Builder<Integer, ServiceFunctionChain> vb = ImmutableMap.builder();
            for (ServiceFunctionChain enumItem : ServiceFunctionChain.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private ServiceFunctionChain(int value, String name) {
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
         * @return corresponding ServiceFunctionChain item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<ServiceFunctionChain> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding ServiceFunctionChain item, or null if no such item exists
         */
        public static ServiceFunctionChain forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnfd-descriptor");

    /**
     * Identifier for the VNFD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable
    String getId();
    
    /**
     * VNFD name.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * Short name to appear as label in the UI
     *
     *
     *
     * @return <code>java.lang.String</code> <code>shortName</code>, or <code>null</code> if not present
     */
    @Nullable
    String getShortName();
    
    /**
     * Vendor of the VNFD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vendor</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVendor();
    
    /**
     * Vendor logo for the Virtual Network Function
     *
     *
     *
     * @return <code>java.lang.String</code> <code>logo</code>, or <code>null</code> if not present
     */
    @Nullable
    String getLogo();
    
    /**
     * Description of the VNFD.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    @Nullable
    String getDescription();
    
    /**
     * Version of the VNFD
     *
     *
     *
     * @return <code>java.lang.String</code> <code>version</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVersion();
    
    /**
     * @return <code>model.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.VnfConfiguration</code> <code>vnfConfiguration</code>, or <code>null</code> if not present
     */
    @Nullable
    VnfConfiguration getVnfConfiguration();
    
    /**
     * The operational status of the VNF init : The VNF has just started. running : The
     * VNF is active in VM upgrading : The VNF is being upgraded (EXPERIMENTAL) 
     * terminate : The VNF is being terminated terminated : The VNF is in the 
     * terminated state. failed : The VNF instantiation failed.
     *
     *
     *
     * @return <code>model.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.VnfOperationalStatus</code> <code>operationalStatus</code>, or <code>null</code> if not present
     */
    @Nullable
    VnfOperationalStatus getOperationalStatus();
    
    /**
     * Interface over which the VNF is managed.
     *
     *
     *
     * @return <code>model.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.MgmtInterface</code> <code>mgmtInterface</code>, or <code>null</code> if not present
     */
    @Nullable
    MgmtInterface getMgmtInterface();
    
    /**
     * List of Internal Virtual Link Descriptors (VLD).The internal VLD describes the 
     * basic topology ofthe connectivity such as E-LAN, E-Line, E-Tree.between internal
     * VNF components of the system.
     *
     *
     *
     * @return <code>java.util.List</code> <code>internalVld</code>, or <code>null</code> if not present
     */
    @Nullable
    List<InternalVld> getInternalVld();
    
    /**
     * List for external connection points. Each VNF has oneor more external connection
     * points that connect the VNFto other VNFs or to external networks. Each VNF 
     * exposesconnection points to the orchestrator, which can constructnetwork 
     * services by connecting the connection pointsbetween different VNFs. The NFVO 
     * will use VLDs and VNFFGsat the network service level to construct network 
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
     * @return <code>java.util.List</code> <code>vdu</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Vdu> getVdu();
    
    /**
     * List of VDU dependencies.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vduDependency</code>, or <code>null</code> if not present
     */
    @Nullable
    List<VduDependency> getVduDependency();
    
    /**
     * Type of node in Service Function Chaining Architecture
     *
     *
     *
     * @return <code>model.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.VnfdDescriptor.ServiceFunctionChain</code> <code>serviceFunctionChain</code>, or <code>null</code> if not present
     */
    @Nullable
    ServiceFunctionChain getServiceFunctionChain();
    
    /**
     * Type of Service Function.NOTE: This needs to map with Service Function Type in 
     * ODL tosupport VNFFG. Service Function Type is mandatory param in ODLSFC. This is
     * temporarily set to string for ease of use
     *
     *
     *
     * @return <code>java.lang.String</code> <code>serviceFunctionType</code>, or <code>null</code> if not present
     */
    @Nullable
    String getServiceFunctionType();
    
    /**
     * scaling group descriptor within the VNF.The scaling group defines a group of 
     * VDUs,and the ratio of VDUs in the VNFthat is used as target for scaling action
     *
     *
     *
     * @return <code>java.util.List</code> <code>scalingGroupDescriptor</code>, or <code>null</code> if not present
     */
    @Nullable
    List<ScalingGroupDescriptor> getScalingGroupDescriptor();
    
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
     * List of placement groups at VNF level
     *
     *
     *
     * @return <code>java.util.List</code> <code>placementGroups</code>, or <code>null</code> if not present
     */
    @Nullable
    List<PlacementGroups> getPlacementGroups();

}

