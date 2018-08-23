package ns.topology.network.topology.topology.node;
import java.lang.Override;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.topology.$YangModuleInfoImpl;
import ns.topology.TpAttributes;
import ns.topology.network.topology.topology.Node;

/**
 * A termination point can terminate a link.Depending on the type of topology, a 
 * termination point could,for example, refer to a port or an interface.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-network-topology</b>
 * <pre>
 * list termination-point {
 *   key tp-id;
 *   uses tp-attributes;
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-network-topology/network-topology/topology/node/termination-point</i>
 * 
 * <p>To create instances of this class use {@link TerminationPointBuilder}.
 * @see TerminationPointBuilder
 * @see TerminationPointKey
 *
 */
public interface TerminationPoint
    extends
    ChildOf<Node>,
    Augmentable<TerminationPoint>,
    TpAttributes,
    Identifiable<TerminationPointKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("termination-point");

    @Override
    TerminationPointKey key();

}

