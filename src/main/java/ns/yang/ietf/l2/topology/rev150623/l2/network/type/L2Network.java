package ns.yang.ietf.l2.topology.rev150623.l2.network.type;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.ietf.l2.topology.rev150623.$YangModuleInfoImpl;
import ns.yang.ietf.l2.topology.rev150623.L2NetworkType;

/**
 * The presence of the container node indicatesL2 Topology
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * container l2-network {
 *   presence "indicates L2 Network";
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/l2-network-type/l2-network</i>
 * 
 * <p>To create instances of this class use {@link L2NetworkBuilder}.
 * @see L2NetworkBuilder
 *
 */
public interface L2Network
    extends
    ChildOf<L2NetworkType>,
    Augmentable<L2Network>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("l2-network");


}

