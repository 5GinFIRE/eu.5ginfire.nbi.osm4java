package ns.yang.nfvo.mano.types.rev170208.vswitch.epa;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;

import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Enumeration;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container vswitch-epa {
 *   leaf ovs-acceleration {
 *     type enumeration {
 *       enum MANDATORY;
 *       enum PREFERRED;
 *       enum DISABLED;
 *     }
 *   }
 *   leaf ovs-offload {
 *     type enumeration {
 *       enum MANDATORY;
 *       enum PREFERRED;
 *       enum DISABLED;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vswitch-epa/vswitch-epa</i>
 * 
 * <p>To create instances of this class use {@link VswitchEpaBuilder}.
 * @see VswitchEpaBuilder
 *
 */
public interface VswitchEpa
    extends
    ChildOf<ns.yang.nfvo.mano.types.rev170208.VswitchEpa>,
    Augmentable<VswitchEpa>
{


    public enum OvsAcceleration implements Enumeration {
        MANDATORY(0, "MANDATORY"),
        
        PREFERRED(1, "PREFERRED"),
        
        DISABLED(2, "DISABLED")
        ;
    
        private static final Map<String, OvsAcceleration> NAME_MAP;
        private static final Map<Integer, OvsAcceleration> VALUE_MAP;
    
        static {
            final Builder<String, OvsAcceleration> nb = ImmutableMap.builder();
            final Builder<Integer, OvsAcceleration> vb = ImmutableMap.builder();
            for (OvsAcceleration enumItem : OvsAcceleration.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private OvsAcceleration(int value, String name) {
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
         * @return corresponding OvsAcceleration item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<OvsAcceleration> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding OvsAcceleration item, or null if no such item exists
         */
        public static OvsAcceleration forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }
    
    public enum OvsOffload implements Enumeration {
        MANDATORY(0, "MANDATORY"),
        
        PREFERRED(1, "PREFERRED"),
        
        DISABLED(2, "DISABLED")
        ;
    
        private static final Map<String, OvsOffload> NAME_MAP;
        private static final Map<Integer, OvsOffload> VALUE_MAP;
    
        static {
            final Builder<String, OvsOffload> nb = ImmutableMap.builder();
            final Builder<Integer, OvsOffload> vb = ImmutableMap.builder();
            for (OvsOffload enumItem : OvsOffload.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private OvsOffload(int value, String name) {
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
         * @return corresponding OvsOffload item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<OvsOffload> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding OvsOffload item, or null if no such item exists
         */
        public static OvsOffload forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vswitch-epa");

    /**
     * Specifies Open vSwitch acceleration mode.MANDATORY: OVS acceleration is 
     * requiredPREFERRED: OVS acceleration is preferred
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa.OvsAcceleration</code> <code>ovsAcceleration</code>, or <code>null</code> if not present
     */
    @Nullable
    OvsAcceleration getOvsAcceleration();
    
    /**
     * Specifies Open vSwitch hardware offload mode.MANDATORY: OVS offload is 
     * requiredPREFERRED: OVS offload is preferred
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa.OvsOffload</code> <code>ovsOffload</code>, or <code>null</code> if not present
     */
    @Nullable
    OvsOffload getOvsOffload();

}

