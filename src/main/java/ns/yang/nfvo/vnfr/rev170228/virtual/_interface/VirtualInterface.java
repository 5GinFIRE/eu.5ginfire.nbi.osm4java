package ns.yang.nfvo.vnfr.rev170228.virtual._interface;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;

import ns.yang.nfvo.vnfr.rev170228.$YangModuleInfoImpl;

import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.math.BigInteger;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Enumeration;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Container for the virtual interface properties
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * container virtual-interface {
 *   leaf type {
 *     type enumeration {
 *       enum VIRTIO;
 *       enum PCI-PASSTHROUGH;
 *       enum SR-IOV;
 *     }
 *   }
 *   leaf bandwidth {
 *     type uint64;
 *   }
 *   leaf ovs-offload {
 *     type enumeration {
 *       enum MANDATORY;
 *       enum PREFERRED;
 *     }
 *   }
 *   leaf vendor-id {
 *     type string;
 *   }
 *   leaf datapath-library {
 *     type string;
 *   }
 *   leaf provider-network-name {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/virtual-interface/virtual-interface</i>
 * 
 * <p>To create instances of this class use {@link VirtualInterfaceBuilder}.
 * @see VirtualInterfaceBuilder
 *
 */
public interface VirtualInterface
    extends
    ChildOf<ns.yang.nfvo.vnfr.rev170228.VirtualInterface>,
    Augmentable<VirtualInterface>
{


    public enum Type implements Enumeration {
        VIRTIO(0, "VIRTIO"),
        
        PCIPASSTHROUGH(1, "PCI-PASSTHROUGH"),
        
        SRIOV(2, "SR-IOV")
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
    
    public enum OvsOffload implements Enumeration {
        MANDATORY(0, "MANDATORY"),
        
        PREFERRED(1, "PREFERRED")
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

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("virtual-interface");

    /**
     * Specifies the type of virtual interfacebetween VM and host.VIRTIO : Use the 
     * traditional VIRTIO interface.PCI-PASSTHROUGH : Use PCI-PASSTHROUGH 
     * interface.SR-IOV : Use SR-IOV interface.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.virtual._interface.VirtualInterface.Type</code> <code>type</code>, or <code>null</code> if not present
     */
    @Nullable
    Type getType();
    
    /**
     * Aggregate bandwidth of the NIC.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>bandwidth</code>, or <code>null</code> if not present
     */
    @Nullable
    BigInteger getBandwidth();
    
    /**
     * Defines if the NIC supports OVS offload.MANDATORY : OVS offload support in the 
     * NIC is mandatory.PREFERRED : OVS offload support in the NIC is preferred.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.virtual._interface.VirtualInterface.OvsOffload</code> <code>ovsOffload</code>, or <code>null</code> if not present
     */
    @Nullable
    OvsOffload getOvsOffload();
    
    /**
     * Specifies the vendor specific id forthe device. This is used when a NIC 
     * fromspecific HW vendor is required.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vendorId</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVendorId();
    
    /**
     * Specifies the name and version of the datapathlibrary the NIC is expected to 
     * support.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>datapathLibrary</code>, or <code>null</code> if not present
     */
    @Nullable
    String getDatapathLibrary();
    
    /**
     * Name of the provider network to which thisNIC is attached.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>providerNetworkName</code>, or <code>null</code> if not present
     */
    @Nullable
    String getProviderNetworkName();

}

