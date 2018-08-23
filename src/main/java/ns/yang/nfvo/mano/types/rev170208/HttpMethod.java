package ns.yang.nfvo.mano.types.rev170208;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.opendaylight.yangtools.yang.binding.Enumeration;

public enum HttpMethod implements Enumeration {
	POST(0, "POST"),

	PUT(1, "PUT"),

	GET(2, "GET"),

	DELETE(3, "DELETE"),

	OPTIONS(4, "OPTIONS"),

	PATCH(5, "PATCH");

	private static final Map<String, HttpMethod> NAME_MAP;
	private static final Map<Integer, HttpMethod> VALUE_MAP;

	static {
		final Builder<String, HttpMethod> nb = ImmutableMap.builder();
		final Builder<Integer, HttpMethod> vb = ImmutableMap.builder();
		for (HttpMethod enumItem : HttpMethod.values()) {
			vb.put(enumItem.value, enumItem);
			nb.put(enumItem.name, enumItem);
		}

		NAME_MAP = nb.build();
		VALUE_MAP = vb.build();
	}

	private final String name;
	private final int value;

	private HttpMethod(int value, String name) {
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
	 * @return corresponding HttpMethod item, if present
	 * @throws NullPointerException if name is null
	 */
	public static Optional<HttpMethod> forName(String name) {
		return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
	}

	/**
	 * Return the enumeration member whose {@link #getIntValue()} matches specified
	 * value.
	 *
	 * @param intValue integer value
	 * @return corresponding HttpMethod item, or null if no such item exists
	 */
	public static HttpMethod forValue(int intValue) {
		return VALUE_MAP.get(intValue);
	}
}
