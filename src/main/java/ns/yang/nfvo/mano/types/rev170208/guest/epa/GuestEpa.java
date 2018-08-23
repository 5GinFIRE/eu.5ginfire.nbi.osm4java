package ns.yang.nfvo.mano.types.rev170208.guest.epa;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.NumaPolicy;
import ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.PcieDevice;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
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
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container guest-epa {
 *   leaf trusted-execution {
 *     type boolean;
 *   }
 *   leaf mempage-size {
 *     type enumeration {
 *       enum LARGE;
 *       enum SMALL;
 *       enum SIZE_2MB;
 *       enum SIZE_1GB;
 *       enum PREFER_LARGE;
 *     }
 *   }
 *   leaf cpu-pinning-policy {
 *     type enumeration {
 *       enum DEDICATED;
 *       enum SHARED;
 *       enum ANY;
 *     }
 *     default ANY;
 *   }
 *   leaf cpu-thread-pinning-policy {
 *     type enumeration {
 *       enum AVOID;
 *       enum SEPARATE;
 *       enum ISOLATE;
 *       enum PREFER;
 *     }
 *   }
 *   list pcie-device {
 *     key device-id;
 *     leaf device-id {
 *       type string;
 *     }
 *     leaf count {
 *       type uint64;
 *     }
 *   }
 *   choice numa-policy {
 *     case numa-unaware {
 *       leaf numa-unaware {
 *         type empty;
 *       }
 *     }
 *     case numa-aware {
 *       container numa-node-policy {
 *         leaf node-cnt {
 *           type uint16;
 *         }
 *         leaf mem-policy {
 *           type enumeration {
 *             enum STRICT;
 *             enum PREFERRED;
 *           }
 *         }
 *         list node {
 *           key id;
 *           leaf id {
 *             type uint64;
 *           }
 *           list vcpu {
 *             key id;
 *             leaf id {
 *               type uint64;
 *             }
 *           }
 *           leaf memory-mb {
 *             type uint64;
 *           }
 *           choice om-numa-type {
 *             case cores {
 *               leaf num-cores {
 *                 type uint8;
 *               }
 *             }
 *             case paired-threads {
 *               container paired-threads {
 *                 leaf num-paired-threads {
 *                   type uint8;
 *                 }
 *                 list paired-thread-ids {
 *                   max-elements 16;
 *                   key thread-a;
 *                   leaf thread-a {
 *                     type uint8;
 *                   }
 *                   leaf thread-b {
 *                     type uint8;
 *                   }
 *                 }
 *               }
 *             }
 *             case threads {
 *               leaf num-threads {
 *                 type uint8;
 *               }
 *             }
 *           }
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/guest-epa/guest-epa</i>
 * 
 * <p>To create instances of this class use {@link GuestEpaBuilder}.
 * @see GuestEpaBuilder
 *
 */
public interface GuestEpa
    extends
    ChildOf<ns.yang.nfvo.mano.types.rev170208.GuestEpa>,
    Augmentable<GuestEpa>
{


    public enum MempageSize implements Enumeration {
        LARGE(0, "LARGE"),
        
        SMALL(1, "SMALL"),
        
        SIZE2MB(2, "SIZE_2MB"),
        
        SIZE1GB(3, "SIZE_1GB"),
        
        PREFERLARGE(4, "PREFER_LARGE")
        ;
    
        private static final Map<String, MempageSize> NAME_MAP;
        private static final Map<Integer, MempageSize> VALUE_MAP;
    
        static {
            final Builder<String, MempageSize> nb = ImmutableMap.builder();
            final Builder<Integer, MempageSize> vb = ImmutableMap.builder();
            for (MempageSize enumItem : MempageSize.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private MempageSize(int value, String name) {
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
         * @return corresponding MempageSize item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<MempageSize> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding MempageSize item, or null if no such item exists
         */
        public static MempageSize forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }
    
    public enum CpuPinningPolicy implements Enumeration {
        DEDICATED(0, "DEDICATED"),
        
        SHARED(1, "SHARED"),
        
        ANY(2, "ANY")
        ;
    
        private static final Map<String, CpuPinningPolicy> NAME_MAP;
        private static final Map<Integer, CpuPinningPolicy> VALUE_MAP;
    
        static {
            final Builder<String, CpuPinningPolicy> nb = ImmutableMap.builder();
            final Builder<Integer, CpuPinningPolicy> vb = ImmutableMap.builder();
            for (CpuPinningPolicy enumItem : CpuPinningPolicy.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private CpuPinningPolicy(int value, String name) {
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
         * @return corresponding CpuPinningPolicy item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<CpuPinningPolicy> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding CpuPinningPolicy item, or null if no such item exists
         */
        public static CpuPinningPolicy forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }
    
    public enum CpuThreadPinningPolicy implements Enumeration {
        AVOID(0, "AVOID"),
        
        SEPARATE(1, "SEPARATE"),
        
        ISOLATE(2, "ISOLATE"),
        
        PREFER(3, "PREFER")
        ;
    
        private static final Map<String, CpuThreadPinningPolicy> NAME_MAP;
        private static final Map<Integer, CpuThreadPinningPolicy> VALUE_MAP;
    
        static {
            final Builder<String, CpuThreadPinningPolicy> nb = ImmutableMap.builder();
            final Builder<Integer, CpuThreadPinningPolicy> vb = ImmutableMap.builder();
            for (CpuThreadPinningPolicy enumItem : CpuThreadPinningPolicy.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private CpuThreadPinningPolicy(int value, String name) {
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
         * @return corresponding CpuThreadPinningPolicy item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<CpuThreadPinningPolicy> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding CpuThreadPinningPolicy item, or null if no such item exists
         */
        public static CpuThreadPinningPolicy forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("guest-epa");

    /**
     * This VM should be allocated from trusted pool
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>trustedExecution</code>, or <code>null</code> if not present
     */
    @Nullable
    Boolean isTrustedExecution();
    
    /**
     * Memory page allocation size. If a VM requireshugepages, it should choose LARGE 
     * or SIZE_2MBor SIZE_1GB. If the VM prefers hugepages itshould choose 
     * PREFER_LARGE.LARGE : Require hugepages (either 2MB or 1GB)SMALL : Doesn't 
     * require hugepagesSIZE_2MB : Requires 2MB hugepagesSIZE_1GB : Requires 1GB 
     * hugepagesPREFER_LARGE : Application prefers hugepages
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa.MempageSize</code> <code>mempageSize</code>, or <code>null</code> if not present
     */
    @Nullable
    MempageSize getMempageSize();
    
    /**
     * CPU pinning policy describes associationbetween virtual CPUs in guest and 
     * thephysical CPUs in the host.DEDICATED : Virtual CPUs are pinned to physical 
     * CPUsSHARED : Multiple VMs may share the same physical CPUs.ANY : Any policy is 
     * acceptable for the VM
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa.CpuPinningPolicy</code> <code>cpuPinningPolicy</code>, or <code>null</code> if not present
     */
    @Nullable
    CpuPinningPolicy getCpuPinningPolicy();
    
    /**
     * CPU thread pinning policy describes how toplace the guest CPUs when the host 
     * supportshyper threads:AVOID : Avoids placing a guest on a host with 
     * threads.SEPARATE: Places vCPUs on separate cores, and avoids placing two vCPUs 
     * on two threads of same core.ISOLATE : Places each vCPU on a different core, and 
     * places no vCPUs from a different guest on the same core.PREFER : Attempts to 
     * place vCPUs on threads of the same core.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa.CpuThreadPinningPolicy</code> <code>cpuThreadPinningPolicy</code>, or <code>null</code> if not present
     */
    @Nullable
    CpuThreadPinningPolicy getCpuThreadPinningPolicy();
    
    /**
     * List of pcie passthrough devices.
     *
     *
     *
     * @return <code>java.util.List</code> <code>pcieDevice</code>, or <code>null</code> if not present
     */
    @Nullable
    List<PcieDevice> getPcieDevice();
    
    /**
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.NumaPolicy</code> <code>numaPolicy</code>, or <code>null</code> if not present
     */
    @Nullable
    NumaPolicy getNumaPolicy();

}

