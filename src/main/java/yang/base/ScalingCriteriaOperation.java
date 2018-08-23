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

public enum ScalingCriteriaOperation implements Enumeration {
    AND(1, "AND"),
    
    OR(2, "OR")
    ;

    private static final Map<String, ScalingCriteriaOperation> NAME_MAP;
    private static final Map<Integer, ScalingCriteriaOperation> VALUE_MAP;

    static {
        final Builder<String, ScalingCriteriaOperation> nb = ImmutableMap.builder();
        final Builder<Integer, ScalingCriteriaOperation> vb = ImmutableMap.builder();
        for (ScalingCriteriaOperation enumItem : ScalingCriteriaOperation.values()) {
            vb.put(enumItem.value, enumItem);
            nb.put(enumItem.name, enumItem);
        }

        NAME_MAP = nb.build();
        VALUE_MAP = vb.build();
    }

    private final String name;
    private final int value;

    private ScalingCriteriaOperation(int value, String name) {
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
     * @return corresponding ScalingCriteriaOperation item, if present
     * @throws NullPointerException if name is null
     */
    public static Optional<ScalingCriteriaOperation> forName(String name) {
        return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
    }

    /**
     * Return the enumeration member whose {@link #getIntValue()} matches specified value.
     *
     * @param intValue integer value
     * @return corresponding ScalingCriteriaOperation item, or null if no such item exists
     */
    public static ScalingCriteriaOperation forValue(int intValue) {
        return VALUE_MAP.get(intValue);
    }
}
