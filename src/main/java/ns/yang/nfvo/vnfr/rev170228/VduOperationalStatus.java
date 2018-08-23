package ns.yang.nfvo.vnfr.rev170228;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.opendaylight.yangtools.yang.binding.Enumeration;

public enum VduOperationalStatus implements Enumeration {
    Init(0, "init"),
    
    VmInitPhase(1, "vm-init-phase"),
    
    VmAllocPending(2, "vm-alloc-pending"),
    
    Running(3, "running"),
    
    Upgrading(4, "upgrading"),
    
    Terminate(5, "terminate"),
    
    VlTerminatePhase(6, "vl-terminate-phase"),
    
    Terminated(7, "terminated"),
    
    Failed(8, "failed")
    ;

    private static final Map<String, VduOperationalStatus> NAME_MAP;
    private static final Map<Integer, VduOperationalStatus> VALUE_MAP;

    static {
        final Builder<String, VduOperationalStatus> nb = ImmutableMap.builder();
        final Builder<Integer, VduOperationalStatus> vb = ImmutableMap.builder();
        for (VduOperationalStatus enumItem : VduOperationalStatus.values()) {
            vb.put(enumItem.value, enumItem);
            nb.put(enumItem.name, enumItem);
        }

        NAME_MAP = nb.build();
        VALUE_MAP = vb.build();
    }

    private final String name;
    private final int value;

    private VduOperationalStatus(int value, String name) {
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
     * @return corresponding VduOperationalStatus item, if present
     * @throws NullPointerException if name is null
     */
    public static Optional<VduOperationalStatus> forName(String name) {
        return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
    }

    /**
     * Return the enumeration member whose {@link #getIntValue()} matches specified value.
     *
     * @param intValue integer value
     * @return corresponding VduOperationalStatus item, or null if no such item exists
     */
    public static VduOperationalStatus forValue(int intValue) {
        return VALUE_MAP.get(intValue);
    }
}
