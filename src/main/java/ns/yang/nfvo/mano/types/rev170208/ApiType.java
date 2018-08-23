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

public enum ApiType implements Enumeration {
    HTTP(0, "HTTP"),
    
    NETCONF(1, "NETCONF"),
    
    SOAP(2, "SOAP")
    ;

    private static final Map<String, ApiType> NAME_MAP;
    private static final Map<Integer, ApiType> VALUE_MAP;

    static {
        final Builder<String, ApiType> nb = ImmutableMap.builder();
        final Builder<Integer, ApiType> vb = ImmutableMap.builder();
        for (ApiType enumItem : ApiType.values()) {
            vb.put(enumItem.value, enumItem);
            nb.put(enumItem.name, enumItem);
        }

        NAME_MAP = nb.build();
        VALUE_MAP = vb.build();
    }

    private final String name;
    private final int value;

    private ApiType(int value, String name) {
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
     * @return corresponding ApiType item, if present
     * @throws NullPointerException if name is null
     */
    public static Optional<ApiType> forName(String name) {
        return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
    }

    /**
     * Return the enumeration member whose {@link #getIntValue()} matches specified value.
     *
     * @param intValue integer value
     * @return corresponding ApiType item, or null if no such item exists
     */
    public static ApiType forValue(int intValue) {
        return VALUE_MAP.get(intValue);
    }
}
