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

public enum AlarmMetricType implements Enumeration {
    CPUUTILIZATION(0, "CPU_UTILIZATION"),
    
    MEMORYUTILIZATION(1, "MEMORY_UTILIZATION"),
    
    STORAGEUTILIZATION(2, "STORAGE_UTILIZATION")
    ;

    private static final Map<String, AlarmMetricType> NAME_MAP;
    private static final Map<Integer, AlarmMetricType> VALUE_MAP;

    static {
        final Builder<String, AlarmMetricType> nb = ImmutableMap.builder();
        final Builder<Integer, AlarmMetricType> vb = ImmutableMap.builder();
        for (AlarmMetricType enumItem : AlarmMetricType.values()) {
            vb.put(enumItem.value, enumItem);
            nb.put(enumItem.name, enumItem);
        }

        NAME_MAP = nb.build();
        VALUE_MAP = vb.build();
    }

    private final String name;
    private final int value;

    private AlarmMetricType(int value, String name) {
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
     * @return corresponding AlarmMetricType item, if present
     * @throws NullPointerException if name is null
     */
    public static Optional<AlarmMetricType> forName(String name) {
        return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
    }

    /**
     * Return the enumeration member whose {@link #getIntValue()} matches specified value.
     *
     * @param intValue integer value
     * @return corresponding AlarmMetricType item, or null if no such item exists
     */
    public static AlarmMetricType forValue(int intValue) {
        return VALUE_MAP.get(intValue);
    }
}
