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

public enum WidgetType implements Enumeration {
    COUNTER(0, "COUNTER"),
    
    GAUGE(1, "GAUGE"),
    
    TEXTBOX(2, "TEXTBOX"),
    
    SLIDER(3, "SLIDER"),
    
    HISTOGRAM(4, "HISTOGRAM"),
    
    BAR(5, "BAR")
    ;

    private static final Map<String, WidgetType> NAME_MAP;
    private static final Map<Integer, WidgetType> VALUE_MAP;

    static {
        final Builder<String, WidgetType> nb = ImmutableMap.builder();
        final Builder<Integer, WidgetType> vb = ImmutableMap.builder();
        for (WidgetType enumItem : WidgetType.values()) {
            vb.put(enumItem.value, enumItem);
            nb.put(enumItem.name, enumItem);
        }

        NAME_MAP = nb.build();
        VALUE_MAP = vb.build();
    }

    private final String name;
    private final int value;

    private WidgetType(int value, String name) {
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
     * @return corresponding WidgetType item, if present
     * @throws NullPointerException if name is null
     */
    public static Optional<WidgetType> forName(String name) {
        return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
    }

    /**
     * Return the enumeration member whose {@link #getIntValue()} matches specified value.
     *
     * @param intValue integer value
     * @return corresponding WidgetType item, or null if no such item exists
     */
    public static WidgetType forValue(int intValue) {
        return VALUE_MAP.get(intValue);
    }
}
