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

public enum JsonQueryMethod implements Enumeration {
    NAMEKEY(0, "NAMEKEY"),
    
    JSONPATH(1, "JSONPATH"),
    
    OBJECTPATH(2, "OBJECTPATH")
    ;

    private static final Map<String, JsonQueryMethod> NAME_MAP;
    private static final Map<Integer, JsonQueryMethod> VALUE_MAP;

    static {
        final Builder<String, JsonQueryMethod> nb = ImmutableMap.builder();
        final Builder<Integer, JsonQueryMethod> vb = ImmutableMap.builder();
        for (JsonQueryMethod enumItem : JsonQueryMethod.values()) {
            vb.put(enumItem.value, enumItem);
            nb.put(enumItem.name, enumItem);
        }

        NAME_MAP = nb.build();
        VALUE_MAP = vb.build();
    }

    private final String name;
    private final int value;

    private JsonQueryMethod(int value, String name) {
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
     * Return the enumeration member whose {@link #getName()} matches specified value.
     *
     * @param name YANG assigned name
     * @return corresponding JsonQueryMethod item, if present
     * @throws NullPointerException if name is null
     */
    public static Optional<JsonQueryMethod> forName(String name) {
        return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
    }

    /**
     * Return the enumeration member whose {@link #getIntValue()} matches specified value.
     *
     * @param intValue integer value
     * @return corresponding JsonQueryMethod item, or null if no such item exists
     */
    public static JsonQueryMethod forValue(int intValue) {
        return VALUE_MAP.get(intValue);
    }
}
