package ns.yang.nfvo.mano.types.rev170208;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Enumeration;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping placement-group-info {
 *   leaf name {
 *     type string;
 *   }
 *   leaf requirement {
 *     type string;
 *   }
 *   leaf strategy {
 *     type enumeration {
 *       enum COLOCATION;
 *       enum ISOLATION;
 *     }
 *     default COLOCATION;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/placement-group-info</i>
 *
 */
public interface PlacementGroupInfo
    extends
    DataObject
{


    public enum Strategy implements Enumeration {
        COLOCATION(0, "COLOCATION"),
        
        ISOLATION(1, "ISOLATION")
        ;
    
        private static final Map<String, Strategy> NAME_MAP;
        private static final Map<Integer, Strategy> VALUE_MAP;
    
        static {
            final Builder<String, Strategy> nb = ImmutableMap.builder();
            final Builder<Integer, Strategy> vb = ImmutableMap.builder();
            for (Strategy enumItem : Strategy.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private Strategy(int value, String name) {
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
         * @return corresponding Strategy item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<Strategy> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding Strategy item, or null if no such item exists
         */
        public static Strategy forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("placement-group-info");

    /**
     * Place group construct to define the compute resource placement strategyin cloud 
     * environment
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * This is free text space used to describe the intent/rationalebehind this 
     * placement group. This is for human consumption only
     *
     *
     *
     * @return <code>java.lang.String</code> <code>requirement</code>, or <code>null</code> if not present
     */
    @Nullable
    String getRequirement();
    
    /**
     * Strategy associated with this placement group Following values are possible - 
     * COLOCATION: Colocation strategy imply intent to share the physical 
     * infrastructure (hypervisor/network) among all members of this group. - 
     * ISOLATION: Isolation strategy imply intent to not share the physical 
     * infrastructure (hypervisor/network) among the members of this group. 
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInfo.Strategy</code> <code>strategy</code>, or <code>null</code> if not present
     */
    @Nullable
    Strategy getStrategy();

}

