package ns.yang.nfvo.nsr.rev170208;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.opendaylight.yangtools.yang.binding.Enumeration;

public enum ConfigStates implements Enumeration {
    Init(0, "init"),
    
    Configuring(1, "configuring"),
    
    ConfigNotNeeded(2, "config_not_needed"),
    
    Configured(3, "configured"),
    
    Failed(4, "failed"),
    
    Terminate(5, "terminate")
    ;

    private static final Map<String, ConfigStates> NAME_MAP;
    private static final Map<Integer, ConfigStates> VALUE_MAP;

    static {
        final Builder<String, ConfigStates> nb = ImmutableMap.builder();
        final Builder<Integer, ConfigStates> vb = ImmutableMap.builder();
        for (ConfigStates enumItem : ConfigStates.values()) {
            vb.put(enumItem.value, enumItem);
            nb.put(enumItem.name, enumItem);
        }

        NAME_MAP = nb.build();
        VALUE_MAP = vb.build();
    }

    private final String name;
    private final int value;

    private ConfigStates(int value, String name) {
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
     * @return corresponding ConfigStates item, if present
     * @throws NullPointerException if name is null
     */
    public static Optional<ConfigStates> forName(String name) {
        return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
    }

    /**
     * Return the enumeration member whose {@link #getIntValue()} matches specified value.
     *
     * @param intValue integer value
     * @return corresponding ConfigStates item, or null if no such item exists
     */
    public static ConfigStates forValue(int intValue) {
        return VALUE_MAP.get(intValue);
    }
}
