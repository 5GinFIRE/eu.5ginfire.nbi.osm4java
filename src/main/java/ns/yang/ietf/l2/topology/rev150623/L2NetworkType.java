package ns.yang.ietf.l2.topology.rev150623;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.ietf.l2.topology.rev150623.l2.network.type.L2Network;

/**
 * Identify the topology type to be L2.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * grouping l2-network-type {
 *   container l2-network {
 *     presence "indicates L2 Network";
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/l2-network-type</i>
 *
 */
public interface L2NetworkType
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("l2-network-type");

    /**
     * The presence of the container node indicatesL2 Topology
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.network.type.L2Network</code> <code>l2Network</code>, or <code>null</code> if not present
     */
    @Nullable
    L2Network getL2Network();

}

