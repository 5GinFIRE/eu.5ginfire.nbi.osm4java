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

public enum NsOperationalStatus implements Enumeration {
    Init(0, "init"),
    
    VlInitPhase(1, "vl-init-phase"),
    
    VnfInitPhase(2, "vnf-init-phase"),
    
    Running(3, "running"),
    
    Terminate(4, "terminate"),
    
    VnfTerminatePhase(5, "vnf-terminate-phase"),
    
    VlTerminatePhase(6, "vl-terminate-phase"),
    
    Terminated(7, "terminated"),
    
    Failed(8, "failed"),
    
    ScalingOut(9, "scaling-out"),
    
    ScalingIn(10, "scaling-in"),
    
    VlInstantiate(11, "vl-instantiate"),
    
    VlTerminate(12, "vl-terminate")
    ;

    private static final Map<String, NsOperationalStatus> NAME_MAP;
    private static final Map<Integer, NsOperationalStatus> VALUE_MAP;

    static {
        final Builder<String, NsOperationalStatus> nb = ImmutableMap.builder();
        final Builder<Integer, NsOperationalStatus> vb = ImmutableMap.builder();
        for (NsOperationalStatus enumItem : NsOperationalStatus.values()) {
            vb.put(enumItem.value, enumItem);
            nb.put(enumItem.name, enumItem);
        }

        NAME_MAP = nb.build();
        VALUE_MAP = vb.build();
    }

    private final String name;
    private final int value;

    private NsOperationalStatus(int value, String name) {
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
     * @return corresponding NsOperationalStatus item, if present
     * @throws NullPointerException if name is null
     */
    public static Optional<NsOperationalStatus> forName(String name) {
        return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
    }

    /**
     * Return the enumeration member whose {@link #getIntValue()} matches specified value.
     *
     * @param intValue integer value
     * @return corresponding NsOperationalStatus item, or null if no such item exists
     */
    public static NsOperationalStatus forValue(int intValue) {
        return VALUE_MAP.get(intValue);
    }
}
