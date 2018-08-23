package ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.ethernet;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.ietf.l2.topology.rev150623.$YangModuleInfoImpl;
import ns.yang.ietf.l2.topology.rev150623.Vlan;
import ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes;

/**
 * Interface configured VLANs
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * list vlan-id-name {
 *   if-feature VLAN;
 *   key vlan-id;
 *   leaf vlan-id {
 *     type vlan;
 *   }
 *   leaf vlan-name {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/l2-termination-point-attributes/l2-termination-point-attributes/l2-termination-point-type/ethernet/vlan-id-name</i>
 * 
 * <p>To create instances of this class use {@link VlanIdNameBuilder}.
 * @see VlanIdNameBuilder
 * @see VlanIdNameKey
 *
 */
public interface VlanIdName
    extends
    ChildOf<L2TerminationPointAttributes>,
    Augmentable<VlanIdName>,
    Identifiable<VlanIdNameKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vlan-id-name");

    /**
     * VLAN ID
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.Vlan</code> <code>vlanId</code>, or <code>null</code> if not present
     */
    @Nullable
    Vlan getVlanId();
    
    /**
     * VLAN Name
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vlanName</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVlanName();
    
    @Override
    VlanIdNameKey key();

}

