package ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa;
import ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.Node;

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
 * This policy defines NUMA topology of theguest. Specifically identifies if the 
 * guestshould be run on a host with one NUMAnode or multiple NUMA nodes. As an 
 * examplea guest might need 8 VCPUs and 4 GB ofmemory. However, it might need the 
 * VCPUsand memory distributed across multipleNUMA nodes. In this scenario, NUMA 
 * node1 could run with 6 VCPUs and 3GB, andNUMA node 2 could run with 2 VCPUs 
 * and1GB.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container numa-node-policy {
 *   leaf node-cnt {
 *     type uint16;
 *   }
 *   leaf mem-policy {
 *     type enumeration {
 *       enum STRICT;
 *       enum PREFERRED;
 *     }
 *   }
 *   list node {
 *     key id;
 *     leaf id {
 *       type uint64;
 *     }
 *     list vcpu {
 *       key id;
 *       leaf id {
 *         type uint64;
 *       }
 *     }
 *     leaf memory-mb {
 *       type uint64;
 *     }
 *     choice om-numa-type {
 *       case cores {
 *         leaf num-cores {
 *           type uint8;
 *         }
 *       }
 *       case paired-threads {
 *         container paired-threads {
 *           leaf num-paired-threads {
 *             type uint8;
 *           }
 *           list paired-thread-ids {
 *             max-elements 16;
 *             key thread-a;
 *             leaf thread-a {
 *               type uint8;
 *             }
 *             leaf thread-b {
 *               type uint8;
 *             }
 *           }
 *         }
 *       }
 *       case threads {
 *         leaf num-threads {
 *           type uint8;
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/guest-epa/guest-epa/numa-policy/numa-aware/numa-node-policy</i>
 * 
 * <p>To create instances of this class use {@link NumaNodePolicyBuilder}.
 * @see NumaNodePolicyBuilder
 *
 */
public interface NumaNodePolicy
    extends
    ChildOf<GuestEpa>,
    Augmentable<NumaNodePolicy>
{


    public enum MemPolicy implements Enumeration {
        STRICT(0, "STRICT"),
        
        PREFERRED(1, "PREFERRED")
        ;
    
        private static final Map<String, MemPolicy> NAME_MAP;
        private static final Map<Integer, MemPolicy> VALUE_MAP;
    
        static {
            final Builder<String, MemPolicy> nb = ImmutableMap.builder();
            final Builder<Integer, MemPolicy> vb = ImmutableMap.builder();
            for (MemPolicy enumItem : MemPolicy.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private MemPolicy(int value, String name) {
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
         * @return corresponding MemPolicy item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<MemPolicy> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding MemPolicy item, or null if no such item exists
         */
        public static MemPolicy forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("numa-node-policy");

    /**
     * The number of NUMA nodes to expose to the VM.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>nodeCnt</code>, or <code>null</code> if not present
     */
    @Nullable
    Integer getNodeCnt();
    
    /**
     * This policy specifies how the memory shouldbe allocated in a multi-node 
     * scenario.STRICT : The memory must be allocated strictly from the memory attached
     * to the NUMA node.PREFERRED : The memory should be allocated preferentially from 
     * the memory attached to the NUMA node
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.NumaNodePolicy.MemPolicy</code> <code>memPolicy</code>, or <code>null</code> if not present
     */
    @Nullable
    MemPolicy getMemPolicy();
    
    /**
     * @return <code>java.util.List</code> <code>node</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Node> getNode();

}

