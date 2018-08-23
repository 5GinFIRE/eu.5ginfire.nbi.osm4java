package ns.yang.ietf.l2.topology.rev150623.l2.node.attributes;
import java.lang.Class;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.ietf.inet.types.rev100924.IpAddress;
import ns.yang.ietf.l2.topology.rev150623.$YangModuleInfoImpl;
import ns.yang.ietf.l2.topology.rev150623.FlagIdentity;
import ns.yang.ietf.l2.topology.rev150623.TrillNickname;
import ns.yang.ietf.l2.topology.rev150623.Vlan;

/**
 * Containing L2 node attributes
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * container l2-node-attributes {
 *   leaf name {
 *     type string;
 *   }
 *   leaf description {
 *     type string;
 *   }
 *   leaf-list management-address {
 *     type inet:ip-address;
 *   }
 *   leaf management-vid {
 *     if-feature VLAN;
 *     type vlan;
 *   }
 *   leaf-list nick-name {
 *     if-feature TRILL;
 *     type trill-nickname;
 *   }
 *   leaf-list flag {
 *     type flag-type;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/l2-node-attributes/l2-node-attributes</i>
 * 
 * <p>To create instances of this class use {@link L2NodeAttributesBuilder}.
 * @see L2NodeAttributesBuilder
 *
 */
public interface L2NodeAttributes
    extends
    ChildOf<ns.yang.ietf.l2.topology.rev150623.L2NodeAttributes>,
    Augmentable<L2NodeAttributes>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("l2-node-attributes");

    /**
     * Node name
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * Node description
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    @Nullable
    String getDescription();
    
    /**
     * System management address
     *
     *
     *
     * @return <code>java.util.List</code> <code>managementAddress</code>, or <code>null</code> if not present
     */
    @Nullable
    List<IpAddress> getManagementAddress();
    
    /**
     * System management VID
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.Vlan</code> <code>managementVid</code>, or <code>null</code> if not present
     */
    @Nullable
    Vlan getManagementVid();
    
    /**
     * Nickname of the RBridge
     *
     *
     *
     * @return <code>java.util.List</code> <code>nickName</code>, or <code>null</code> if not present
     */
    @Nullable
    List<TrillNickname> getNickName();
    
    /**
     * Node operational flags
     *
     *
     *
     * @return <code>java.util.List</code> <code>flag</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Class<? extends FlagIdentity>> getFlag();

}

