package ns.yang.nfvo.mano.types.rev170208.host.epa;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa.CpuFeature;
import ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa.OmCpuFeature;

import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Enumeration;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Specifies the host level EPA attributes.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container host-epa {
 *   leaf cpu-model {
 *     type enumeration {
 *       enum PREFER_WESTMERE;
 *       enum REQUIRE_WESTMERE;
 *       enum PREFER_SANDYBRIDGE;
 *       enum REQUIRE_SANDYBRIDGE;
 *       enum PREFER_IVYBRIDGE;
 *       enum REQUIRE_IVYBRIDGE;
 *       enum PREFER_HASWELL;
 *       enum REQUIRE_HASWELL;
 *       enum PREFER_BROADWELL;
 *       enum REQUIRE_BROADWELL;
 *       enum PREFER_NEHALEM;
 *       enum REQUIRE_NEHALEM;
 *       enum PREFER_PENRYN;
 *       enum REQUIRE_PENRYN;
 *       enum PREFER_CONROE;
 *       enum REQUIRE_CONROE;
 *       enum PREFER_CORE2DUO;
 *       enum REQUIRE_CORE2DUO;
 *     }
 *   }
 *   leaf cpu-arch {
 *     type enumeration {
 *       enum PREFER_X86;
 *       enum REQUIRE_X86;
 *       enum PREFER_X86_64;
 *       enum REQUIRE_X86_64;
 *       enum PREFER_I686;
 *       enum REQUIRE_I686;
 *       enum PREFER_IA64;
 *       enum REQUIRE_IA64;
 *       enum PREFER_ARMV7;
 *       enum REQUIRE_ARMV7;
 *       enum PREFER_ARMV8;
 *       enum REQUIRE_ARMV8;
 *     }
 *   }
 *   leaf cpu-vendor {
 *     type enumeration {
 *       enum PREFER_INTEL;
 *       enum REQUIRE_INTEL;
 *       enum PREFER_AMD;
 *       enum REQUIRE_AMD;
 *     }
 *   }
 *   leaf cpu-socket-count {
 *     type uint64;
 *   }
 *   leaf cpu-core-count {
 *     type uint64;
 *   }
 *   leaf cpu-core-thread-count {
 *     type uint64;
 *   }
 *   list cpu-feature {
 *     key feature;
 *     leaf feature {
 *       type cpu-feature-type;
 *     }
 *   }
 *   leaf om-cpu-model-string {
 *     type string;
 *   }
 *   list om-cpu-feature {
 *     key feature;
 *     leaf feature {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/host-epa/host-epa</i>
 * 
 * <p>To create instances of this class use {@link HostEpaBuilder}.
 * @see HostEpaBuilder
 *
 */
public interface HostEpa
    extends
    ChildOf<ns.yang.nfvo.mano.types.rev170208.HostEpa>,
    Augmentable<HostEpa>
{


    public enum CpuModel implements Enumeration {
        PREFERWESTMERE(0, "PREFER_WESTMERE"),
        
        REQUIREWESTMERE(1, "REQUIRE_WESTMERE"),
        
        PREFERSANDYBRIDGE(2, "PREFER_SANDYBRIDGE"),
        
        REQUIRESANDYBRIDGE(3, "REQUIRE_SANDYBRIDGE"),
        
        PREFERIVYBRIDGE(4, "PREFER_IVYBRIDGE"),
        
        REQUIREIVYBRIDGE(5, "REQUIRE_IVYBRIDGE"),
        
        PREFERHASWELL(6, "PREFER_HASWELL"),
        
        REQUIREHASWELL(7, "REQUIRE_HASWELL"),
        
        PREFERBROADWELL(8, "PREFER_BROADWELL"),
        
        REQUIREBROADWELL(9, "REQUIRE_BROADWELL"),
        
        PREFERNEHALEM(10, "PREFER_NEHALEM"),
        
        REQUIRENEHALEM(11, "REQUIRE_NEHALEM"),
        
        PREFERPENRYN(12, "PREFER_PENRYN"),
        
        REQUIREPENRYN(13, "REQUIRE_PENRYN"),
        
        PREFERCONROE(14, "PREFER_CONROE"),
        
        REQUIRECONROE(15, "REQUIRE_CONROE"),
        
        PREFERCORE2DUO(16, "PREFER_CORE2DUO"),
        
        REQUIRECORE2DUO(17, "REQUIRE_CORE2DUO")
        ;
    
        private static final Map<String, CpuModel> NAME_MAP;
        private static final Map<Integer, CpuModel> VALUE_MAP;
    
        static {
            final Builder<String, CpuModel> nb = ImmutableMap.builder();
            final Builder<Integer, CpuModel> vb = ImmutableMap.builder();
            for (CpuModel enumItem : CpuModel.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private CpuModel(int value, String name) {
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
         * @return corresponding CpuModel item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<CpuModel> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding CpuModel item, or null if no such item exists
         */
        public static CpuModel forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }
    
    public enum CpuArch implements Enumeration {
        PREFERX86(0, "PREFER_X86"),
        
        REQUIREX86(1, "REQUIRE_X86"),
        
        PREFERX8664(2, "PREFER_X86_64"),
        
        REQUIREX8664(3, "REQUIRE_X86_64"),
        
        PREFERI686(4, "PREFER_I686"),
        
        REQUIREI686(5, "REQUIRE_I686"),
        
        PREFERIA64(6, "PREFER_IA64"),
        
        REQUIREIA64(7, "REQUIRE_IA64"),
        
        PREFERARMV7(8, "PREFER_ARMV7"),
        
        REQUIREARMV7(9, "REQUIRE_ARMV7"),
        
        PREFERARMV8(10, "PREFER_ARMV8"),
        
        REQUIREARMV8(11, "REQUIRE_ARMV8")
        ;
    
        private static final Map<String, CpuArch> NAME_MAP;
        private static final Map<Integer, CpuArch> VALUE_MAP;
    
        static {
            final Builder<String, CpuArch> nb = ImmutableMap.builder();
            final Builder<Integer, CpuArch> vb = ImmutableMap.builder();
            for (CpuArch enumItem : CpuArch.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private CpuArch(int value, String name) {
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
         * @return corresponding CpuArch item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<CpuArch> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding CpuArch item, or null if no such item exists
         */
        public static CpuArch forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }
    
    public enum CpuVendor implements Enumeration {
        PREFERINTEL(0, "PREFER_INTEL"),
        
        REQUIREINTEL(1, "REQUIRE_INTEL"),
        
        PREFERAMD(2, "PREFER_AMD"),
        
        REQUIREAMD(3, "REQUIRE_AMD")
        ;
    
        private static final Map<String, CpuVendor> NAME_MAP;
        private static final Map<Integer, CpuVendor> VALUE_MAP;
    
        static {
            final Builder<String, CpuVendor> nb = ImmutableMap.builder();
            final Builder<Integer, CpuVendor> vb = ImmutableMap.builder();
            for (CpuVendor enumItem : CpuVendor.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private CpuVendor(int value, String name) {
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
         * @return corresponding CpuVendor item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<CpuVendor> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding CpuVendor item, or null if no such item exists
         */
        public static CpuVendor forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("host-epa");

    /**
     * Host CPU model. Examples include: SandyBridge,IvyBridge
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa.CpuModel</code> <code>cpuModel</code>, or <code>null</code> if not present
     */
    @Nullable
    CpuModel getCpuModel();
    
    /**
     * Host CPU architecture.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa.CpuArch</code> <code>cpuArch</code>, or <code>null</code> if not present
     */
    @Nullable
    CpuArch getCpuArch();
    
    /**
     * Host CPU Vendor.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa.CpuVendor</code> <code>cpuVendor</code>, or <code>null</code> if not present
     */
    @Nullable
    CpuVendor getCpuVendor();
    
    /**
     * Number of sockets on the host.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>cpuSocketCount</code>, or <code>null</code> if not present
     */
    @Nullable
    BigInteger getCpuSocketCount();
    
    /**
     * Number of cores on the host.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>cpuCoreCount</code>, or <code>null</code> if not present
     */
    @Nullable
    BigInteger getCpuCoreCount();
    
    /**
     * Number of threads per cores on the host.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>cpuCoreThreadCount</code>, or <code>null</code> if not present
     */
    @Nullable
    BigInteger getCpuCoreThreadCount();
    
    /**
     * List of CPU features.
     *
     *
     *
     * @return <code>java.util.List</code> <code>cpuFeature</code>, or <code>null</code> if not present
     */
    @Nullable
    List<CpuFeature> getCpuFeature();
    
    /**
     * OpenMANO CPU model string
     *
     *
     *
     * @return <code>java.lang.String</code> <code>omCpuModelString</code>, or <code>null</code> if not present
     */
    @Nullable
    String getOmCpuModelString();
    
    /**
     * List of OpenMANO CPU features
     *
     *
     *
     * @return <code>java.util.List</code> <code>omCpuFeature</code>, or <code>null</code> if not present
     */
    @Nullable
    List<OmCpuFeature> getOmCpuFeature();

}

