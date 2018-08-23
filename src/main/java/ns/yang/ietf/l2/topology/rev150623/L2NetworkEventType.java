package ns.yang.ietf.l2.topology.rev150623;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.opendaylight.yangtools.yang.binding.Enumeration;

public enum L2NetworkEventType implements Enumeration {
	/**
	 * An L2 node or link or termination-pointhas been added
	 *
	 */
	Add(0, "add"),

	/**
	 * An L2 node or link or termination-pointhas been removed
	 *
	 */
	Remove(1, "remove"),

	/**
	 * An L2 node or link or termination-pointhas been updated
	 *
	 */
	Update(2, "update");

	private static final Map<String, L2NetworkEventType> NAME_MAP;
	private static final Map<Integer, L2NetworkEventType> VALUE_MAP;

	static {
		final Builder<String, L2NetworkEventType> nb = ImmutableMap.builder();
		final Builder<Integer, L2NetworkEventType> vb = ImmutableMap.builder();
		for (L2NetworkEventType enumItem : L2NetworkEventType.values()) {
			vb.put(enumItem.value, enumItem);
			nb.put(enumItem.name, enumItem);
		}

		NAME_MAP = nb.build();
		VALUE_MAP = vb.build();
	}

	private final String name;
	private final int value;

	private L2NetworkEventType(int value, String name) {
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
	 * @return corresponding L2NetworkEventType item, if present
	 * @throws NullPointerException if name is null
	 */
	public static Optional<L2NetworkEventType> forName(String name) {
		return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
	}

	/**
	 * Return the enumeration member whose {@link #getIntValue()} matches specified
	 * value.
	 *
	 * @param intValue integer value
	 * @return corresponding L2NetworkEventType item, or null if no such item exists
	 */
	public static L2NetworkEventType forValue(int intValue) {
		return VALUE_MAP.get(intValue);
	}
}
