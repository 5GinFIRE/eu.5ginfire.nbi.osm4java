package ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job.vnfr;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;

import ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue;
import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job.Vnfr;

import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
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
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module
 * <b>nsr</b>
 * 
 * <pre>
 * list primitive {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   uses manotypes:primitive-parameter-value;
 *   leaf execution-id {
 *     type string;
 *   }
 *   leaf execution-status {
 *     type enumeration {
 *       enum pending;
 *       enum success;
 *       enum failure;
 *     }
 *   }
 *   leaf execution-error-details {
 *     type string;
 *   }
 * }
 * </pre>
 * 
 * The schema path to identify an instance is
 * <i>nsr/project/(urn:ietf:params:xml:ns:yang:nfvo:nsr?revision=2017-02-08)ns-instance-opdata/nsr/config-agent-job/vnfr/primitive</i>
 * 
 * <p>
 * To create instances of this class use {@link PrimitiveBuilder}.
 * 
 * @see PrimitiveBuilder
 * @see PrimitiveKey
 *
 */
public interface Primitive
		extends ChildOf<Vnfr>, Augmentable<Primitive>, PrimitiveParameterValue, Identifiable<PrimitiveKey> {

	public enum ExecutionStatus implements Enumeration {
		Pending(0, "pending"),

		Success(1, "success"),

		Failure(2, "failure");

		private static final Map<String, ExecutionStatus> NAME_MAP;
		private static final Map<Integer, ExecutionStatus> VALUE_MAP;

		static {
			final Builder<String, ExecutionStatus> nb = ImmutableMap.builder();
			final Builder<Integer, ExecutionStatus> vb = ImmutableMap.builder();
			for (ExecutionStatus enumItem : ExecutionStatus.values()) {
				vb.put(enumItem.value, enumItem);
				nb.put(enumItem.name, enumItem);
			}

			NAME_MAP = nb.build();
			VALUE_MAP = vb.build();
		}

		private final String name;
		private final int value;

		private ExecutionStatus(int value, String name) {
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
		 * @return corresponding ExecutionStatus item, if present
		 * @throws NullPointerException if name is null
		 */
		public static Optional<ExecutionStatus> forName(String name) {
			return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
		}

		/**
		 * Return the enumeration member whose {@link #getIntValue()} matches specified
		 * value.
		 *
		 * @param intValue integer value
		 * @return corresponding ExecutionStatus item, or null if no such item exists
		 */
		public static ExecutionStatus forValue(int intValue) {
			return VALUE_MAP.get(intValue);
		}
	}

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("primitive");

	/**
	 * the name of the primitive
	 *
	 *
	 *
	 * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code>
	 *         if not present
	 */
	@Nullable
	String getName();

	/**
	 * Execution id of the primitive
	 *
	 *
	 *
	 * @return <code>java.lang.String</code> <code>executionId</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	String getExecutionId();

	/**
	 * status of the Execution
	 *
	 *
	 *
	 * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job.vnfr.Primitive.ExecutionStatus</code>
	 *         <code>executionStatus</code>, or <code>null</code> if not present
	 */
	@Nullable
	ExecutionStatus getExecutionStatus();

	/**
	 * Error details if execution-status is failure
	 *
	 *
	 *
	 * @return <code>java.lang.String</code> <code>executionErrorDetails</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	String getExecutionErrorDetails();

	@Override
	PrimitiveKey key();

}
