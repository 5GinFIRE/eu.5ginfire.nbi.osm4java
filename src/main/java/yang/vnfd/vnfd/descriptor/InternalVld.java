package yang.vnfd.vnfd.descriptor;
import java.lang.Override;
import java.lang.String;
import java.math.BigInteger;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.ProviderNetwork;
import ns.yang.nfvo.mano.types.rev170208.VirtualLinkType;
import yang.vnfd.$YangModuleInfoImpl;
import yang.vnfd.VnfdDescriptor;
import yang.vnfd.vnfd.descriptor.internal.vld.InitParams;
import yang.vnfd.vnfd.descriptor.internal.vld.InternalConnectionPoint;

/**
 * List of Internal Virtual Link Descriptors (VLD).The internal VLD describes the 
 * basic topology ofthe connectivity such as E-LAN, E-Line, E-Tree.between 
 * VNF components of the system.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list internal-vld {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   leaf short-name {
 *     type string;
 *   }
 *   leaf description {
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
 *   list internal-connection-point {
 *     key id-ref;
 *     leaf id-ref {
 *       type leafref {
 *         path ../../../vdu/internal-connection-point/id;
 *       }
 *     }
 *     leaf ip-address {
 *       type inet:ip-address;
 *     }
 *   }
 *   uses manotypes:provider-network;
 *   choice init-params {
 *     case vim-network-ref {
 *       leaf vim-network-name {
 *         type string;
 *       }
 *     }
 *     case vim-network-profile {
 *       leaf ip-profile-ref {
 *         type string;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/internal-vld</i>
 * 
 * <p>To create instances of this class use {@link InternalVldBuilder}.
 * @see InternalVldBuilder
 * @see InternalVldKey
 *
 */
public interface InternalVld
    extends
    ChildOf<VnfdDescriptor>,
    Augmentable<InternalVld>,
    ProviderNetwork,
    Identifiable<InternalVldKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("internal-vld");

    /**
     * Identifier for the VLD
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable
    String getId();
    
    /**
     * Name of the internal VLD
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
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
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    @Nullable
    String getDescription();
    
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
     * List of internal connection points in this VLD
     *
     *
     *
     * @return <code>java.util.List</code> <code>internalConnectionPoint</code>, or <code>null</code> if not present
     */
    @Nullable
    List<InternalConnectionPoint> getInternalConnectionPoint();
    
    /**
     * Extra parameters for VLD instantiation
     *
     *
     *
     * @return <code>model.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.internal.vld.InitParams</code> <code>initParams</code>, or <code>null</code> if not present
     */
    @Nullable
    InitParams getInitParams();
    
    @Override
    InternalVldKey key();

}

