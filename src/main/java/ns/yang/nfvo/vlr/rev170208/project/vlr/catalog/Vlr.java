package ns.yang.nfvo.vlr.rev170208.project.vlr.catalog;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;

import ns.yang.ietf.yang.types.rev130715.Uuid;
import ns.yang.nfvo.mano.types.rev170208.IpProfileInfo;
import ns.yang.nfvo.mano.types.rev170208.ProviderNetwork;
import ns.yang.nfvo.mano.types.rev170208.VirtualLinkType;
import ns.yang.nfvo.vlr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.vlr.rev170208.project.VlrCatalog;

import java.lang.Integer;
import java.lang.Long;
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
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vlr</b>
 * <pre>
 * list vlr {
 *   key id;
 *   unique name;
 *   leaf id {
 *     type yang:uuid;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   leaf nsr-id-ref {
 *     type yang:uuid;
 *   }
 *   leaf vld-ref {
 *     type string;
 *   }
 *   leaf res-id {
 *     type yang:uuid;
 *   }
 *   leaf short-name {
 *     type string;
 *   }
 *   leaf vendor {
 *     type string;
 *   }
 *   leaf description {
 *     type string;
 *   }
 *   leaf version {
 *     type string;
 *   }
 *   leaf type {
 *     type manotypes:virtual-link-type;
 *   }
 *   leaf root-bandwidth {
 *     type uint64;
 *   }
 *   leaf leaf-bandwidth {
 *     type uint64;
 *   }
 *   leaf create-time {
 *     type uint32;
 *   }
 *   leaf uptime {
 *     type uint32;
 *   }
 *   leaf network-id {
 *     type string;
 *   }
 *   leaf vim-network-name {
 *     type string;
 *   }
 *   uses manotypes:provider-network;
 *   uses manotypes:ip-profile-info;
 *   leaf status {
 *     type enumeration {
 *       enum LINK_UP;
 *       enum DEGRADED;
 *       enum LINK_DOWN;
 *     }
 *   }
 *   leaf operational-status {
 *     type enumeration {
 *       enum init;
 *       enum vl-alloc-pending;
 *       enum running;
 *       enum vl-terminate-pending;
 *       enum terminated;
 *       enum failed;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vlr/project/(urn:ietf:params:xml:ns:yang:nfvo:vlr?revision=2017-02-08)vlr-catalog/vlr</i>
 * 
 * <p>To create instances of this class use {@link VlrBuilder}.
 * @see VlrBuilder
 * @see VlrKey
 *
 */
public interface Vlr
    extends
    ChildOf<VlrCatalog>,
    Augmentable<Vlr>,
    IpProfileInfo,
    ProviderNetwork,
    Identifiable<VlrKey>
{


    public enum Status implements Enumeration {
        LINKUP(0, "LINK_UP"),
        
        DEGRADED(1, "DEGRADED"),
        
        LINKDOWN(2, "LINK_DOWN")
        ;
    
        private static final Map<String, Status> NAME_MAP;
        private static final Map<Integer, Status> VALUE_MAP;
    
        static {
            final Builder<String, Status> nb = ImmutableMap.builder();
            final Builder<Integer, Status> vb = ImmutableMap.builder();
            for (Status enumItem : Status.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private Status(int value, String name) {
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
         * @return corresponding Status item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<Status> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding Status item, or null if no such item exists
         */
        public static Status forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }
    
    public enum OperationalStatus implements Enumeration {
        Init(0, "init"),
        
        VlAllocPending(1, "vl-alloc-pending"),
        
        Running(2, "running"),
        
        VlTerminatePending(3, "vl-terminate-pending"),
        
        Terminated(4, "terminated"),
        
        Failed(5, "failed")
        ;
    
        private static final Map<String, OperationalStatus> NAME_MAP;
        private static final Map<Integer, OperationalStatus> VALUE_MAP;
    
        static {
            final Builder<String, OperationalStatus> nb = ImmutableMap.builder();
            final Builder<Integer, OperationalStatus> vb = ImmutableMap.builder();
            for (OperationalStatus enumItem : OperationalStatus.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private OperationalStatus(int value, String name) {
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
         * @return corresponding OperationalStatus item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<OperationalStatus> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding OperationalStatus item, or null if no such item exists
         */
        public static OperationalStatus forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vlr");

    /**
     * Identifier for the VLR.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable
    Uuid getId();
    
    /**
     * VLR name.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * NS instance identifier.This is a leafref 
     * /rw-project:project/nsr:ns-instance-config/nsr:nsr/nsr:id
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>nsrIdRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Uuid getNsrIdRef();
    
    /**
     * Reference to 
     * VLD/rw-project:project/nsr:ns-instance-config/nsr:nsr[nsr:id=../nsr-id-ref]/nsd/vld:vld/vld:id
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vldRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVldRef();
    
    /**
     * Identifier for resmgr id mapping
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>resId</code>, or <code>null</code> if not present
     */
    @Nullable
    Uuid getResId();
    
    /**
     * Short name to appear as label in the UI
     *
     *
     *
     * @return <code>java.lang.String</code> <code>shortName</code>, or <code>null</code> if not present
     */
    @Nullable
    String getShortName();
    
    /**
     * Provider of the VLR.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vendor</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVendor();
    
    /**
     * Description of the VLR.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    @Nullable
    String getDescription();
    
    /**
     * Version of the VLR
     *
     *
     *
     * @return <code>java.lang.String</code> <code>version</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVersion();
    
    /**
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VirtualLinkType</code> <code>type</code>, or <code>null</code> if not present
     */
    @Nullable
    VirtualLinkType getType();
    
    /**
     * For ELAN this is the aggregate bandwidth.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>rootBandwidth</code>, or <code>null</code> if not present
     */
    @Nullable
    BigInteger getRootBandwidth();
    
    /**
     * For ELAN this is the bandwidth of branches.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>leafBandwidth</code>, or <code>null</code> if not present
     */
    @Nullable
    BigInteger getLeafBandwidth();
    
    /**
     * Creation timestamp of this Virtual Link.The timestamp is expressed as 
     * secondssince unix epoch - 1970-01-01T00:00:00Z
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>createTime</code>, or <code>null</code> if not present
     */
    @Nullable
    Long getCreateTime();
    
    /**
     * Active period of this Virtual Link.Uptime is expressed in seconds
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>uptime</code>, or <code>null</code> if not present
     */
    @Nullable
    Long getUptime();
    
    /**
     * Identifier for the allocated network resource.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>networkId</code>, or <code>null</code> if not present
     */
    @Nullable
    String getNetworkId();
    
    /**
     * Name of network in VIM account. This is used to indicatepre-provisioned network 
     * name in cloud account.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vimNetworkName</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVimNetworkName();
    
    /**
     * Status of the virtual link record.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.Vlr.Status</code> <code>status</code>, or <code>null</code> if not present
     */
    @Nullable
    Status getStatus();
    
    /**
     * The operational status of the Virtual Linkinit : The VL is in init 
     * stat.vl-alloc-pending : The VL alloc is pending in VIMrunning : The VL is up and
     * running in VMvl-terminate-pending : The VL is being terminated in VIM.terminated
     * : The VL is terminated in the VM.failed : The VL instantiation failed in VIM.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.Vlr.OperationalStatus</code> <code>operationalStatus</code>, or <code>null</code> if not present
     */
    @Nullable
    OperationalStatus getOperationalStatus();
    
    @Override
    VlrKey key();

}

