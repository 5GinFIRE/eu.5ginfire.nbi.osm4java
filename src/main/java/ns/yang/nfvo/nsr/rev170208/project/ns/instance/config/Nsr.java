package ns.yang.nfvo.nsr.rev170208.project.ns.instance.config;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;

import ns.yang.ietf.yang.types.rev130715.Uuid;
import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParams;
import ns.yang.nfvo.nsr.rev170208.project.NsInstanceConfig;
import ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.nsr.Nsd;

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
 * list nsr {
 *   key id;
 *   unique name;
 *   leaf schema-version {
 *     type string;
 *     default v3.0;
 *   }
 *   leaf id {
 *     type yang:uuid;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   leaf short-name {
 *     type string;
 *   }
 *   leaf description {
 *     type string;
 *   }
 *   leaf admin-status {
 *     type enumeration {
 *       enum ENABLED;
 *       enum DISABLED;
 *     }
 *   }
 *   container nsd {
 *     uses nsd-base:nsd-descriptor-common;
 *     uses project-nsd:nsr-nsd-vld;
 *     uses project-nsd:nsr-nsd-constituent-vnfd;
 *     uses project-nsd:nsr-nsd-placement-groups;
 *     uses project-nsd:nsr-nsd-vnf-dependency;
 *     uses project-nsd:nsr-nsd-monitoring-param;
 *     uses project-nsd:nsr-nsd-service-primitive;
 *   }
 *   uses ns-instance-config-params;
 * }
 * </pre>
 * 
 * The schema path to identify an instance is
 * <i>nsr/project/(urn:ietf:params:xml:ns:yang:nfvo:nsr?revision=2017-02-08)ns-instance-config/nsr</i>
 * 
 * <p>
 * To create instances of this class use {@link NsrBuilder}.
 * 
 * @see NsrBuilder
 * @see NsrKey
 *
 */
public interface Nsr extends ChildOf<NsInstanceConfig>, Augmentable<Nsr>, NsInstanceConfigParams, Identifiable<NsrKey> {

	public enum AdminStatus implements Enumeration {
		ENABLED(0, "ENABLED"),

		DISABLED(1, "DISABLED");

		private static final Map<String, AdminStatus> NAME_MAP;
		private static final Map<Integer, AdminStatus> VALUE_MAP;

		static {
			final Builder<String, AdminStatus> nb = ImmutableMap.builder();
			final Builder<Integer, AdminStatus> vb = ImmutableMap.builder();
			for (AdminStatus enumItem : AdminStatus.values()) {
				vb.put(enumItem.value, enumItem);
				nb.put(enumItem.name, enumItem);
			}

			NAME_MAP = nb.build();
			VALUE_MAP = vb.build();
		}

		private final String name;
		private final int value;

		private AdminStatus(int value, String name) {
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
		 * @return corresponding AdminStatus item, if present
		 * @throws NullPointerException if name is null
		 */
		public static Optional<AdminStatus> forName(String name) {
			return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
		}

		/**
		 * Return the enumeration member whose {@link #getIntValue()} matches specified
		 * value.
		 *
		 * @param intValue integer value
		 * @return corresponding AdminStatus item, or null if no such item exists
		 */
		public static AdminStatus forValue(int intValue) {
			return VALUE_MAP.get(intValue);
		}
	}

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("nsr");

	/**
	 * Schema version for the NSR. If unspecified, it assumes v3.0
	 *
	 *
	 *
	 * @return <code>java.lang.String</code> <code>schemaVersion</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	String getSchemaVersion();

	/**
	 * Identifier for the NSR.
	 *
	 *
	 *
	 * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code>
	 *         <code>id</code>, or <code>null</code> if not present
	 */
	@Nullable
	Uuid getId();

	/**
	 * NSR name.
	 *
	 *
	 *
	 * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code>
	 *         if not present
	 */
	@Nullable
	String getName();

	/**
	 * NSR short name.
	 *
	 *
	 *
	 * @return <code>java.lang.String</code> <code>shortName</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	String getShortName();

	/**
	 * NSR description.
	 *
	 *
	 *
	 * @return <code>java.lang.String</code> <code>description</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	String getDescription();

	/**
	 * This is the administrative status of the NS instance
	 *
	 *
	 *
	 * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.Nsr.AdminStatus</code>
	 *         <code>adminStatus</code>, or <code>null</code> if not present
	 */
	@Nullable
	AdminStatus getAdminStatus();

	/**
	 * NS descriptor used to instantiate this NS
	 *
	 *
	 *
	 * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.nsr.Nsd</code>
	 *         <code>nsd</code>, or <code>null</code> if not present
	 */
	@Nullable
	Nsd getNsd();

	@Override
	NsrKey key();

}
