package yang.base;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.opendaylight.yangtools.yang.binding.Enumeration;

public enum ScalingTrigger implements Enumeration {
    PreScaleIn(1, "pre-scale-in"),
    
    PostScaleIn(2, "post-scale-in"),
    
    PreScaleOut(3, "pre-scale-out"),
    
    PostScaleOut(4, "post-scale-out")
    ;

    private static final Map<String, ScalingTrigger> NAME_MAP;
    private static final Map<Integer, ScalingTrigger> VALUE_MAP;

    static {
        final Builder<String, ScalingTrigger> nb = ImmutableMap.builder();
        final Builder<Integer, ScalingTrigger> vb = ImmutableMap.builder();
        for (ScalingTrigger enumItem : ScalingTrigger.values()) {
            vb.put(enumItem.value, enumItem);
            nb.put(enumItem.name, enumItem);
        }

        NAME_MAP = nb.build();
        VALUE_MAP = vb.build();
    }

    private final String name;
    private final int value;

    private ScalingTrigger(int value, String name) {
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
     * @return corresponding ScalingTrigger item, if present
     * @throws NullPointerException if name is null
     */
    public static Optional<ScalingTrigger> forName(String name) {
        return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
    }

    /**
     * Return the enumeration member whose {@link #getIntValue()} matches specified value.
     *
     * @param intValue integer value
     * @return corresponding ScalingTrigger item, or null if no such item exists
     */
    public static ScalingTrigger forValue(int intValue) {
        return VALUE_MAP.get(intValue);
    }
}
