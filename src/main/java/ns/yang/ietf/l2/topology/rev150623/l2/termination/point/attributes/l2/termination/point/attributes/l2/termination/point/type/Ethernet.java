package ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type;
import java.lang.Class;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.ietf.l2.topology.rev150623.$YangModuleInfoImpl;
import ns.yang.ietf.l2.topology.rev150623.EthEncapsulationType;
import ns.yang.ietf.l2.topology.rev150623.Vlan;
import ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.L2TerminationPointType;
import ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.ethernet.VlanIdName;
import ns.yang.ietf.yang.types.rev130715.MacAddress;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * case ethernet {
 *   leaf mac-address {
 *     type yang:mac-address;
 *   }
 *   leaf eth-encapsulation {
 *     type identityref {
 *       base eth-encapsulation-type;
 *     }
 *   }
 *   leaf port-vlan-id {
 *     if-feature VLAN;
 *     type vlan;
 *   }
 *   list vlan-id-name {
 *     if-feature VLAN;
 *     key vlan-id;
 *     leaf vlan-id {
 *       type vlan;
 *     }
 *     leaf vlan-name {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/l2-termination-point-attributes/l2-termination-point-attributes/l2-termination-point-type/ethernet</i>
 *
 */
public interface Ethernet
    extends
    DataObject,
    Augmentable<Ethernet>,
    L2TerminationPointType
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ethernet");

    /**
     * Interface MAC address
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.MacAddress</code> <code>macAddress</code>, or <code>null</code> if not present
     */
    @Nullable
    MacAddress getMacAddress();
    
    /**
     * Encapsulation type of thisternimation point.
     *
     *
     *
     * @return <code>java.lang.Class</code> <code>ethEncapsulation</code>, or <code>null</code> if not present
     */
    @Nullable
    Class<? extends EthEncapsulationType> getEthEncapsulation();
    
    /**
     * Port VLAN ID
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.Vlan</code> <code>portVlanId</code>, or <code>null</code> if not present
     */
    @Nullable
    Vlan getPortVlanId();
    
    /**
     * Interface configured VLANs
     *
     *
     *
     * @return <code>java.util.List</code> <code>vlanIdName</code>, or <code>null</code> if not present
     */
    @Nullable
    List<VlanIdName> getVlanIdName();

}

