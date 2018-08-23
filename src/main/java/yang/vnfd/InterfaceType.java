package yang.vnfd;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.opendaylight.yangtools.yang.binding.Enumeration;

public enum InterfaceType implements Enumeration {
	INTERNAL(0, "INTERNAL"),

	EXTERNAL(1, "EXTERNAL");

	private static final Map<String, InterfaceType> NAME_MAP;
	private static final Map<Integer, InterfaceType> VALUE_MAP;

	static {
		final Builder<String, InterfaceType> nb = ImmutableMap.builder();
		final Builder<Integer, InterfaceType> vb = ImmutableMap.builder();
		for (InterfaceType enumItem : InterfaceType.values()) {
			vb.put(enumItem.value, enumItem);
			nb.put(enumItem.name, enumItem);
		}

		NAME_MAP = nb.build();
		VALUE_MAP = vb.build();
	}

	private final String name;
	private final int value;

	private InterfaceType(int value, String name) {
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
	 * @return corresponding InterfaceType item, if present
	 * @throws NullPointerException if name is null
	 */
	public static Optional<InterfaceType> forName(String name) {
		return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
	}

	/**
	 * Return the enumeration member whose {@link #getIntValue()} matches specified
	 * value.
	 *
	 * @param intValue integer value
	 * @return corresponding InterfaceType item, or null if no such item exists
	 */
	public static InterfaceType forValue(int intValue) {
		return VALUE_MAP.get(intValue);
	}
}
