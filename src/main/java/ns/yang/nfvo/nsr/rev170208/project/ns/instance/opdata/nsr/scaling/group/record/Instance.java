package ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;

import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.nsr.rev170208.ConfigStates;
import ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ScalingGroupRecord;

import java.lang.Boolean;
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
 * Reference to scaling group instance record
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module
 * <b>nsr</b>
 * 
 * <pre>
 * list instance {
 *   key instance-id;
 *   leaf instance-id {
 *     type uint16;
 *   }
 *   leaf is-default {
 *     type boolean;
 *   }
 *   leaf op-status {
 *     type enumeration {
 *       enum init;
 *       enum vnf-init-phase;
 *       enum running;
 *       enum terminate;
 *       enum vnf-terminate-phase;
 *       enum terminated;
 *       enum failed;
 *     }
 *   }
 *   leaf config-status {
 *     type config-states;
 *   }
 *   leaf error-msg {
 *     type string;
 *   }
 *   leaf create-time {
 *     type uint32;
 *   }
 *   leaf-list vnfrs {
 *     type leafref {
 *       path ../../../constituent-vnfr-ref/vnfr-id;
 *     }
 *   }
 * }
 * </pre>
 * 
 * The schema path to identify an instance is
 * <i>nsr/project/(urn:ietf:params:xml:ns:yang:nfvo:nsr?revision=2017-02-08)ns-instance-opdata/nsr/scaling-group-record/instance</i>
 * 
 * <p>
 * To create instances of this class use {@link InstanceBuilder}.
 * 
 * @see InstanceBuilder
 * @see InstanceKey
 *
 */
public interface Instance extends ChildOf<ScalingGroupRecord>, Augmentable<Instance>, Identifiable<InstanceKey> {

	public enum OpStatus implements Enumeration {
		Init(0, "init"),

		VnfInitPhase(1, "vnf-init-phase"),

		Running(2, "running"),

		Terminate(3, "terminate"),

		VnfTerminatePhase(4, "vnf-terminate-phase"),

		Terminated(5, "terminated"),

		Failed(6, "failed");

		private static final Map<String, OpStatus> NAME_MAP;
		private static final Map<Integer, OpStatus> VALUE_MAP;

		static {
			final Builder<String, OpStatus> nb = ImmutableMap.builder();
			final Builder<Integer, OpStatus> vb = ImmutableMap.builder();
			for (OpStatus enumItem : OpStatus.values()) {
				vb.put(enumItem.value, enumItem);
				nb.put(enumItem.name, enumItem);
			}

			NAME_MAP = nb.build();
			VALUE_MAP = vb.build();
		}

		private final String name;
		private final int value;

		private OpStatus(int value, String name) {
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
		 * Return the enumeration member whose {@link #getName()} matches specified
		 * value.
		 *
		 * @param name YANG assigned name
		 * @return corresponding OpStatus item, if present
		 * @throws NullPointerException if name is null
		 */
		public static Optional<OpStatus> forName(String name) {
			return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
		}

		/**
		 * Return the enumeration member whose {@link #getIntValue()} matches specified
		 * value.
		 *
		 * @param intValue integer value
		 * @return corresponding OpStatus item, or null if no such item exists
		 */
		public static OpStatus forValue(int intValue) {
			return VALUE_MAP.get(intValue);
		}
	}

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("instance");

	/**
	 * Scaling group instance id
	 *
	 *
	 *
	 * @return <code>java.lang.Integer</code> <code>instanceId</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	Integer getInstanceId();

	/**
	 * Flag indicating whether this instance was part ofdefault scaling group (and
	 * thus undeletable)
	 *
	 *
	 *
	 * @return <code>java.lang.Boolean</code> <code>isDefault</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	Boolean isIsDefault();

	/**
	 * The operational status of the NS instanceinit : The scaling group has just
	 * started.vnf-init-phase : The VNFs in the scaling group are being
	 * instantiated.running : The scaling group is in running state.terminate : The
	 * scaling group is being terminated.vnf-terminate-phase : The VNFs in the
	 * scaling group are being terminated.terminated : The scaling group is in the
	 * terminated state.failed : The scaling group instantiation failed.
	 *
	 *
	 *
	 * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record.Instance.OpStatus</code>
	 *         <code>opStatus</code>, or <code>null</code> if not present
	 */
	@Nullable
	OpStatus getOpStatus();

	/**
	 * The configuration status of the scaling group instanceconfiguring : At least
	 * one of the VNFs in this scaling group instance is in configuring
	 * stateconfigured : All the VNFs in this scaling group instance are configured
	 * or config-not-needed statefailed : Configuring this scaling group instance
	 * failed
	 *
	 *
	 *
	 * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.ConfigStates</code>
	 *         <code>configStatus</code>, or <code>null</code> if not present
	 */
	@Nullable
	ConfigStates getConfigStatus();

	/**
	 * Reason for failure in configuration of this scaling instance
	 *
	 *
	 *
	 * @return <code>java.lang.String</code> <code>errorMsg</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	String getErrorMsg();

	/**
	 * Creation timestamp of this scaling group record.The timestamp is expressed as
	 * secondssince unix epoch - 1970-01-01T00:00:00Z
	 *
	 *
	 *
	 * @return <code>java.lang.Long</code> <code>createTime</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	Long getCreateTime();

	/**
	 * Reference to VNFR within the scale instance
	 *
	 *
	 *
	 * @return <code>java.util.List</code> <code>vnfrs</code>, or <code>null</code>
	 *         if not present
	 */
	@Nullable
	List<String> getVnfrs();

	@Override
	InstanceKey key();

}
