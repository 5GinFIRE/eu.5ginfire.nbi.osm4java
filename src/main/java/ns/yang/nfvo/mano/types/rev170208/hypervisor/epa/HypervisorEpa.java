package ns.yang.nfvo.mano.types.rev170208.hypervisor.epa;
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
 * container hypervisor-epa {
 *   leaf type {
 *     type enumeration {
 *       enum PREFER_KVM;
 *       enum REQUIRE_KVM;
 *     }
 *   }
 *   leaf version {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/hypervisor-epa/hypervisor-epa</i>
 * 
 * <p>To create instances of this class use {@link HypervisorEpaBuilder}.
 * @see HypervisorEpaBuilder
 *
 */
public interface HypervisorEpa
    extends
    ChildOf<ns.yang.nfvo.mano.types.rev170208.HypervisorEpa>,
    Augmentable<HypervisorEpa>
{


    public enum Type implements Enumeration {
        PREFERKVM(0, "PREFER_KVM"),
        
        REQUIREKVM(1, "REQUIRE_KVM")
        ;
    
        private static final Map<String, Type> NAME_MAP;
        private static final Map<Integer, Type> VALUE_MAP;
    
        static {
            final Builder<String, Type> nb = ImmutableMap.builder();
            final Builder<Integer, Type> vb = ImmutableMap.builder();
            for (Type enumItem : Type.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private Type(int value, String name) {
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
         * @return corresponding Type item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<Type> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding Type item, or null if no such item exists
         */
        public static Type forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("hypervisor-epa");

    /**
     * Specifies the type of hypervisor.KVM: KVMXEN: XEN
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.hypervisor.epa.HypervisorEpa.Type</code> <code>type</code>, or <code>null</code> if not present
     */
    @Nullable
    Type getType();
    
    /**
     * @return <code>java.lang.String</code> <code>version</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVersion();

}

