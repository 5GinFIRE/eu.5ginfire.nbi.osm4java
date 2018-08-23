package yang.base.nsd.descriptor.common;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import yang.base.$YangModuleInfoImpl;
import yang.base.NsdDescriptorCommon;
import yang.base.nsd.descriptor.common.ScalingGroupDescriptorBuilder.ScalingGroupDescriptorImpl;
import yang.base.nsd.descriptor.common.scaling.group.descriptor.ScalingConfigAction;
import yang.base.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicy;
import yang.base.nsd.descriptor.common.scaling.group.descriptor.VnfdMember;

/**
 * scaling group descriptor within this network service.The scaling group defines 
 * group of VNFs,and the ratio of VNFs in the network servicethat is used as 
 * for scaling action
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list scaling-group-descriptor {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   list scaling-policy {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     leaf scaling-type {
 *       type manotypes:scaling-policy-type;
 *     }
 *     leaf enabled {
 *       type boolean;
 *       default true;
 *     }
 *     leaf scale-in-operation-type {
 *       type manotypes:scaling-criteria-operation;
 *       default AND;
 *     }
 *     leaf scale-out-operation-type {
 *       type manotypes:scaling-criteria-operation;
 *       default OR;
 *     }
 *     leaf threshold-time {
 *       type uint32;
 *     }
 *     leaf cooldown-time {
 *       type uint32;
 *     }
 *     list scaling-criteria {
 *       key name;
 *       leaf name {
 *         type string;
 *       }
 *       leaf scale-in-threshold {
 *         type uint64;
 *       }
 *       leaf scale-in-relational-operation {
 *         type manotypes:relational-operation-type;
 *         default LE;
 *       }
 *       leaf scale-out-threshold {
 *         type uint64;
 *       }
 *       leaf scale-out-relational-operation {
 *         type manotypes:relational-operation-type;
 *         default GE;
 *       }
 *       leaf ns-monitoring-param-ref {
 *         type string;
 *       }
 *     }
 *   }
 *   list vnfd-member {
 *     key member-vnf-index-ref;
 *     leaf member-vnf-index-ref {
 *       type string;
 *     }
 *     leaf count {
 *       type uint32;
 *       default 1;
 *     }
 *   }
 *   leaf min-instance-count {
 *     type uint32;
 *     default 0;
 *   }
 *   leaf max-instance-count {
 *     type uint32;
 *     default 10;
 *   }
 *   list scaling-config-action {
 *     key trigger;
 *     leaf trigger {
 *       type manotypes:scaling-trigger;
 *     }
 *     leaf ns-service-primitive-name-ref {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/scaling-group-descriptor</i>
 * 
 * <p>To create instances of this class use {@link ScalingGroupDescriptorBuilder}.
 * @see ScalingGroupDescriptorBuilder
 * @see ScalingGroupDescriptorKey
 *
 */
@JsonDeserialize(as = ScalingGroupDescriptorImpl.class)
//@JsonIgnoreProperties( {} )
public interface ScalingGroupDescriptor
    extends
    ChildOf<NsdDescriptorCommon>,
    Augmentable<ScalingGroupDescriptor>,
    Identifiable<ScalingGroupDescriptorKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("scaling-group-descriptor");

    /**
     * Name of this scaling group.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * @return <code>java.util.List</code> <code>scalingPolicy</code>, or <code>null</code> if not present
     */
    @Nullable
    List<ScalingPolicy> getScalingPolicy();
    
    /**
     * List of VNFs in this scaling group
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfdMember</code>, or <code>null</code> if not present
     */
    @Nullable
    List<VnfdMember> getVnfdMember();
    
    /**
     * Minimum instances of the scaling group which are allowed.These instances are 
     * created by default when the network serviceis instantiated.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>minInstanceCount</code>, or <code>null</code> if not present
     */
    @Nullable
    Long getMinInstanceCount();
    
    /**
     * Maximum instances of this scaling group that are allowedin a single network 
     * service. The network service scalingwill fail, when the number of service group 
     * instancesexceed the max-instance-count specified.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>maxInstanceCount</code>, or <code>null</code> if not present
     */
    @Nullable
    Long getMaxInstanceCount();
    
    /**
     * List of scaling config actions
     *
     *
     *
     * @return <code>java.util.List</code> <code>scalingConfigAction</code>, or <code>null</code> if not present
     */
    @Nullable
    List<ScalingConfigAction> getScalingConfigAction();
    
    @Override
    ScalingGroupDescriptorKey key();

}

