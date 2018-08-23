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

public enum ParamValueType implements Enumeration {
    INT(0, "INT"),
    
    DECIMAL(1, "DECIMAL"),
    
    STRING(2, "STRING")
    ;

    private static final Map<String, ParamValueType> NAME_MAP;
    private static final Map<Integer, ParamValueType> VALUE_MAP;

    static {
        final Builder<String, ParamValueType> nb = ImmutableMap.builder();
        final Builder<Integer, ParamValueType> vb = ImmutableMap.builder();
        for (ParamValueType enumItem : ParamValueType.values()) {
            vb.put(enumItem.value, enumItem);
            nb.put(enumItem.name, enumItem);
        }

        NAME_MAP = nb.build();
        VALUE_MAP = vb.build();
    }

    private final String name;
    private final int value;

    private ParamValueType(int value, String name) {
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
     * @return corresponding ParamValueType item, if present
     * @throws NullPointerException if name is null
     */
    public static Optional<ParamValueType> forName(String name) {
        return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
    }

    /**
     * Return the enumeration member whose {@link #getIntValue()} matches specified value.
     *
     * @param intValue integer value
     * @return corresponding ParamValueType item, or null if no such item exists
     */
    public static ParamValueType forValue(int intValue) {
        return VALUE_MAP.get(intValue);
    }
}
