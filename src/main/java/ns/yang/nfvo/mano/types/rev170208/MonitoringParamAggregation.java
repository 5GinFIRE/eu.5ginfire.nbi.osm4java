package ns.yang.nfvo.mano.types.rev170208;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
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
 * This class represents the following YANG schema fragment defined in module
 * <b>mano-types</b>
 * 
 * <pre>
 * grouping monitoring-param-aggregation {
 *   typedef aggregation-type {
 *     type enumeration {
 *       enum AVERAGE;
 *       enum MINIMUM;
 *       enum MAXIMUM;
 *       enum COUNT;
 *       enum SUM;
 *     }
 *   }
 *   leaf aggregation-type {
 *     type aggregation-type;
 *   }
 * }
 * </pre>
 * 
 * The schema path to identify an instance is
 * <i>mano-types/monitoring-param-aggregation</i>
 *
 */
public interface MonitoringParamAggregation extends DataObject {

	public enum AggregationType implements Enumeration {
		AVERAGE(0, "AVERAGE"),

		MINIMUM(1, "MINIMUM"),

		MAXIMUM(2, "MAXIMUM"),

		COUNT(3, "COUNT"),

		SUM(4, "SUM");

		private static final Map<String, AggregationType> NAME_MAP;
		private static final Map<Integer, AggregationType> VALUE_MAP;

		static {
			final Builder<String, AggregationType> nb = ImmutableMap.builder();
			final Builder<Integer, AggregationType> vb = ImmutableMap.builder();
			for (AggregationType enumItem : AggregationType.values()) {
				vb.put(enumItem.value, enumItem);
				nb.put(enumItem.name, enumItem);
			}

			NAME_MAP = nb.build();
			VALUE_MAP = vb.build();
		}

		private final String name;
		private final int value;

		private AggregationType(int value, String name) {
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
		 * @return corresponding AggregationType item, if present
		 * @throws NullPointerException if name is null
		 */
		public static Optional<AggregationType> forName(String name) {
			return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
		}

		/**
		 * Return the enumeration member whose {@link #getIntValue()} matches specified
		 * value.
		 *
		 * @param intValue integer value
		 * @return corresponding AggregationType item, or null if no such item exists
		 */
		public static AggregationType forValue(int intValue) {
			return VALUE_MAP.get(intValue);
		}
	}

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("monitoring-param-aggregation");

	/**
	 * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.MonitoringParamAggregation.AggregationType</code>
	 *         <code>aggregationType</code>, or <code>null</code> if not present
	 */
	@Nullable
	AggregationType getAggregationType();

}
