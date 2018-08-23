package yang.vnfd.vnfd.descriptor;

import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import yang.vnfd.$YangModuleInfoImpl;
import yang.vnfd.VnfdDescriptor;
import yang.vnfd.vnfd.descriptor.scaling.group.descriptor.ScalingConfigAction;
import yang.vnfd.vnfd.descriptor.scaling.group.descriptor.ScalingPolicy;
import yang.vnfd.vnfd.descriptor.scaling.group.descriptor.Vdu;

/**
 * scaling group descriptor within the VNF.The scaling group defines a group of
 * VDUs,and the ratio of VDUs in the VNFthat is used as target for scaling
 * action
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module
 * <b>vnfd-base</b>
 * 
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
 *       leaf vnf-monitoring-param-ref {
 *         type leafref {
 *           path ../../../../monitoring-param/id;
 *         }
 *       }
 *     }
 *   }
 *   list vdu {
 *     key vdu-id-ref;
 *     leaf vdu-id-ref {
 *       type leafref {
 *         path ../../../vdu/id;
 *       }
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
 *     leaf vnf-config-primitive-name-ref {
 *       type leafref {
 *         path ../../../vnf-configuration/config-primitive/name;
 *       }
 *     }
 *   }
 * }
 * </pre>
 * 
 * The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/scaling-group-descriptor</i>
 * 
 * <p>
 * To create instances of this class use {@link ScalingGroupDescriptorBuilder}.
 * 
 * @see ScalingGroupDescriptorBuilder
 * @see ScalingGroupDescriptorKey
 *
 */
public interface ScalingGroupDescriptor
		extends ChildOf<VnfdDescriptor>, Augmentable<ScalingGroupDescriptor>, Identifiable<ScalingGroupDescriptorKey> {

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("scaling-group-descriptor");

	/**
	 * Name of this scaling group.
	 *
	 *
	 *
	 * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code>
	 *         if not present
	 */
	@Nullable
	String getName();

	/**
	 * @return <code>java.util.List</code> <code>scalingPolicy</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	List<ScalingPolicy> getScalingPolicy();

	/**
	 * List of VDUs in this scaling group
	 *
	 *
	 *
	 * @return <code>java.util.List</code> <code>vdu</code>, or <code>null</code> if
	 *         not present
	 */
	@Nullable
	List<Vdu> getVdu();

	/**
	 * Minimum instances of the scaling group which are allowed.These instances are
	 * created by default when the network serviceis instantiated.
	 *
	 *
	 *
	 * @return <code>java.lang.Long</code> <code>minInstanceCount</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	Long getMinInstanceCount();

	/**
	 * Maximum instances of this scaling group that are allowedin a single network
	 * service. The network service scalingwill fail, when the number of service
	 * group instancesexceed the max-instance-count specified.
	 *
	 *
	 *
	 * @return <code>java.lang.Long</code> <code>maxInstanceCount</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	Long getMaxInstanceCount();

	/**
	 * List of scaling config actions
	 *
	 *
	 *
	 * @return <code>java.util.List</code> <code>scalingConfigAction</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	List<ScalingConfigAction> getScalingConfigAction();

	@Override
	ScalingGroupDescriptorKey key();

}
