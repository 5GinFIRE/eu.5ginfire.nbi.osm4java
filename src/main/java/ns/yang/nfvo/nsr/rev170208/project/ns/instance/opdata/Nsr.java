package ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.ietf.yang.types.rev130715.Uuid;
import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.nsr.rev170208.ConfigStates;
import ns.yang.nfvo.nsr.rev170208.NsOperationalStatus;
import ns.yang.nfvo.nsr.rev170208.Vnffgr;
import ns.yang.nfvo.nsr.rev170208.project.NsInstanceOpdata;
import ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob;
import ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConnectionPoint;
import ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConstituentVnfrRef;
import ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.InitialServicePrimitive;
import ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.MonitoringParam;
import ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ScalingGroupRecord;
import ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ServicePrimitive;
import ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.TerminateServicePrimitive;
import ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.Vlr;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list nsr {
 *   key ns-instance-config-ref;
 *   leaf ns-instance-config-ref {
 *     type leafref {
 *       path ../../../ns-instance-config/nsr/id;
 *     }
 *   }
 *   leaf name-ref {
 *     type leafref {
 *       path ../../../ns-instance-config/nsr[id=current()/../ns-instance-config-ref]/name;
 *     }
 *   }
 *   leaf nsd-ref {
 *     type leafref {
 *       path ../../../ns-instance-config/nsr[id=current()/../ns-instance-config-ref]/nsd/id;
 *     }
 *   }
 *   leaf nsd-name-ref {
 *     type leafref {
 *       path ../../../ns-instance-config/nsr[id=current()/../ns-instance-config-ref]/nsd/name;
 *     }
 *   }
 *   leaf create-time {
 *     type uint32;
 *   }
 *   leaf uptime {
 *     type uint32;
 *   }
 *   list connection-point {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     leaf type {
 *       type manotypes:connection-point-type;
 *     }
 *   }
 *   list vlr {
 *     key vlr-ref;
 *     leaf vlr-ref {
 *       type leafref {
 *         path ../../../../vlr:vlr-catalog/vlr:vlr/vlr:id;
 *       }
 *     }
 *     list vnfr-connection-point-ref {
 *       key vnfr-id;
 *       leaf vnfr-id {
 *         type leafref {
 *           path ../../../../../vnfr:vnfr-catalog/vnfr:vnfr/vnfr:id;
 *         }
 *       }
 *       leaf connection-point {
 *         type leafref {
 *           path "../../../../../vnfr:vnfr-catalog/vnfr:vnfr[vnfr:id = current()/../vnfr-id]/vnfr:connection-point/vnfr:name";
 *         }
 *       }
 *     }
 *   }
 *   list constituent-vnfr-ref {
 *     key vnfr-id;
 *     leaf vnfr-id {
 *       type string;
 *     }
 *   }
 *   list scaling-group-record {
 *     key scaling-group-name-ref;
 *     leaf scaling-group-name-ref {
 *       type leafref {
 *         path ../../../../ns-instance-config/nsr[id=current()/../../ns-instance-config-ref]/nsd/scaling-group-descriptor/name;
 *       }
 *     }
 *     list instance {
 *       key instance-id;
 *       leaf instance-id {
 *         type uint16;
 *       }
 *       leaf is-default {
 *         type boolean;
 *       }
 *       leaf op-status {
 *         type enumeration {
 *           enum init;
 *           enum vnf-init-phase;
 *           enum running;
 *           enum terminate;
 *           enum vnf-terminate-phase;
 *           enum terminated;
 *           enum failed;
 *         }
 *       }
 *       leaf config-status {
 *         type config-states;
 *       }
 *       leaf error-msg {
 *         type string;
 *       }
 *       leaf create-time {
 *         type uint32;
 *       }
 *       leaf-list vnfrs {
 *         type leafref {
 *           path ../../../constituent-vnfr-ref/vnfr-id;
 *         }
 *       }
 *     }
 *   }
 *   uses vnffgr;
 *   leaf operational-status {
 *     type ns-operational-status;
 *   }
 *   leaf config-status {
 *     type config-states;
 *   }
 *   list service-primitive {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     list parameter {
 *       key name;
 *       uses manotypes:primitive-parameter;
 *     }
 *     uses manotypes:ui-primitive-group;
 *     list vnf-primitive-group {
 *       key member-vnf-index-ref;
 *       leaf member-vnf-index-ref {
 *         type string;
 *       }
 *       leaf vnfd-id-ref {
 *         type string;
 *       }
 *       leaf vnfd-name {
 *         type string;
 *       }
 *       list primitive {
 *         key index;
 *         leaf index {
 *           type uint32;
 *         }
 *         leaf name {
 *           type string;
 *         }
 *       }
 *     }
 *     leaf user-defined-script {
 *       type string;
 *     }
 *   }
 *   list initial-service-primitive {
 *     key seq;
 *     uses event-service-primitive;
 *   }
 *   list terminate-service-primitive {
 *     key seq;
 *     uses event-service-primitive;
 *   }
 *   list monitoring-param {
 *     key id;
 *     uses manotypes:monitoring-param-value;
 *     uses manotypes:monitoring-param-ui-data;
 *     uses manotypes:monitoring-param-aggregation;
 *     leaf id {
 *       type string;
 *     }
 *     leaf name {
 *       type string;
 *     }
 *     leaf nsd-mon-param-ref {
 *       type leafref {
 *         path "../../../../project-nsd:nsd-catalog/project-nsd:nsd[project-nsd:id = current()/../../nsd-ref]/project-nsd:monitoring-param/project-nsd:id";
 *       }
 *     }
 *     list vnfr-mon-param-ref {
 *       key "vnfr-id-ref vnfr-mon-param-ref";
 *       leaf vnfr-id-ref {
 *         type yang:uuid;
 *       }
 *       leaf vnfr-mon-param-ref {
 *         type leafref {
 *           path "../../../../../vnfr:vnfr-catalog/vnfr:vnfr[vnfr:id = current()/../vnfr-id-ref]/vnfr:monitoring-param/vnfr:id";
 *         }
 *       }
 *     }
 *   }
 *   list config-agent-job {
 *     key job-id;
 *     leaf job-id {
 *       type uint64;
 *     }
 *     leaf job-name {
 *       type string;
 *     }
 *     leaf job-status {
 *       type enumeration {
 *         enum pending;
 *         enum success;
 *         enum failure;
 *       }
 *     }
 *     leaf triggered-by {
 *       type trigger-type;
 *     }
 *     leaf create-time {
 *       type uint32;
 *     }
 *     leaf job-status-details {
 *       type string;
 *     }
 *     uses manotypes:primitive-parameter-value;
 *     list parameter-group {
 *       key name;
 *       leaf name {
 *         type string;
 *       }
 *       uses manotypes:primitive-parameter-value;
 *     }
 *     list vnfr {
 *       key id;
 *       leaf id {
 *         type yang:uuid;
 *       }
 *       leaf vnf-job-status {
 *         type enumeration {
 *           enum pending;
 *           enum success;
 *           enum failure;
 *         }
 *       }
 *       list primitive {
 *         key name;
 *         leaf name {
 *           type string;
 *         }
 *         uses manotypes:primitive-parameter-value;
 *         leaf execution-id {
 *           type string;
 *         }
 *         leaf execution-status {
 *           type enumeration {
 *             enum pending;
 *             enum success;
 *             enum failure;
 *           }
 *         }
 *         leaf execution-error-details {
 *           type string;
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:ietf:params:xml:ns:yang:nfvo:nsr?revision=2017-02-08)ns-instance-opdata/nsr</i>
 * 
 * <p>To create instances of this class use {@link NsrBuilder}.
 * @see NsrBuilder
 * @see NsrKey
 *
 */
public interface Nsr
    extends
    ChildOf<NsInstanceOpdata>,
    Augmentable<Nsr>,
    Vnffgr,
    Identifiable<NsrKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("nsr");

    /**
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>nsInstanceConfigRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Uuid getNsInstanceConfigRef();
    
    /**
     * Network service name reference
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>nameRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getNameRef();
    
    /**
     * Network service descriptor id reference
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>nsdRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getNsdRef();
    
    /**
     * Network service descriptor name reference
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>nsdNameRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getNsdNameRef();
    
    /**
     * Creation timestamp of this Network Service.The timestamp is expressed as 
     * secondssince unix epoch - 1970-01-01T00:00:00Z
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>createTime</code>, or <code>null</code> if not present
     */
    @Nullable
    Long getCreateTime();
    
    /**
     * Active period of this Network Service.Uptime is expressed in seconds
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>uptime</code>, or <code>null</code> if not present
     */
    @Nullable
    Long getUptime();
    
    /**
     * List for external connection points.Each NS has one or more external connection 
     * points.As the name implies that external connection pointsare used for 
     * connecting the NS to other NS or toexternal networks. Each NS exposes these 
     * connectionpoints to the orchestrator. The orchestrator canconstruct network 
     * service chains by connecting theconnection points between different NS.
     *
     *
     *
     * @return <code>java.util.List</code> <code>connectionPoint</code>, or <code>null</code> if not present
     */
    @Nullable
    List<ConnectionPoint> getConnectionPoint();
    
    /**
     * @return <code>java.util.List</code> <code>vlr</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Vlr> getVlr();
    
    /**
     * List of VNFRs that are part of thisnetwork service.
     *
     *
     *
     * @return <code>java.util.List</code> <code>constituentVnfrRef</code>, or <code>null</code> if not present
     */
    @Nullable
    List<ConstituentVnfrRef> getConstituentVnfrRef();
    
    /**
     * List of scaling group records
     *
     *
     *
     * @return <code>java.util.List</code> <code>scalingGroupRecord</code>, or <code>null</code> if not present
     */
    @Nullable
    List<ScalingGroupRecord> getScalingGroupRecord();
    
    /**
     * The operational status of the NS instanceinit : The network service has just 
     * started.vl-init-phase : The VLs in the NS are being instantiated.vnf-init-phase 
     * : The VNFs in the NS are being instantiated.running : The NS is in running 
     * state.terminate : The NS is being terminated.vnf-terminate-phase : The NS is 
     * terminating the VNFs in the NS.vl-terminate-phase : The NS is terminating the 
     * VLs in the NS.terminated : The NS is in the terminated state.failed : The NS 
     * instantiation failed.scaling-out : The NS is scaling outscaling-in : The NS is 
     * scaling invl-instantiate : The NS is initiating a new VLvl-terminate : The NS is
     * terminating a VL
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.NsOperationalStatus</code> <code>operationalStatus</code>, or <code>null</code> if not present
     */
    @Nullable
    NsOperationalStatus getOperationalStatus();
    
    /**
     * The configuration status of the NS instanceconfiguring: At least one of the VNFs
     * in this instance is in configuring stateconfigured: All the VNFs in this NS 
     * instance are configured or config-not-needed state
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ConfigStates</code> <code>configStatus</code>, or <code>null</code> if not present
     */
    @Nullable
    ConfigStates getConfigStatus();
    
    /**
     * Network service level service primitives.
     *
     *
     *
     * @return <code>java.util.List</code> <code>servicePrimitive</code>, or <code>null</code> if not present
     */
    @Nullable
    List<ServicePrimitive> getServicePrimitive();
    
    /**
     * Initial set of service primitives for NSD.
     *
     *
     *
     * @return <code>java.util.List</code> <code>initialServicePrimitive</code>, or <code>null</code> if not present
     */
    @Nullable
    List<InitialServicePrimitive> getInitialServicePrimitive();
    
    /**
     * Set of service primitives toexecute during termination of NSD.
     *
     *
     *
     * @return <code>java.util.List</code> <code>terminateServicePrimitive</code>, or <code>null</code> if not present
     */
    @Nullable
    List<TerminateServicePrimitive> getTerminateServicePrimitive();
    
    /**
     * List of NS level params.
     *
     *
     *
     * @return <code>java.util.List</code> <code>monitoringParam</code>, or <code>null</code> if not present
     */
    @Nullable
    List<MonitoringParam> getMonitoringParam();
    
    /**
     * @return <code>java.util.List</code> <code>configAgentJob</code>, or <code>null</code> if not present
     */
    @Nullable
    List<ConfigAgentJob> getConfigAgentJob();
    
    @Override
    NsrKey key();

}

