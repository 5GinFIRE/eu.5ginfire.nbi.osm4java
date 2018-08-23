package ns.topology.network.topology.topology;
import java.lang.Override;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.topology.$YangModuleInfoImpl;
import ns.topology.TopologyId;
import ns.topology.network.topology.Topology;

/**
 * Identifies the topology, or topologies, that this topologyis dependent on.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-network-topology</b>
 * <pre>
 * list underlay-topology {
 *   key topology-ref;
 *   leaf topology-ref {
 *     type topology-ref;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-network-topology/network-topology/topology/underlay-topology</i>
 * 
 * <p>To create instances of this class use {@link UnderlayTopologyBuilder}.
 * @see UnderlayTopologyBuilder
 * @see UnderlayTopologyKey
 *
 */
public interface UnderlayTopology
    extends
    ChildOf<Topology>,
    Augmentable<UnderlayTopology>,
    Identifiable<UnderlayTopologyKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("underlay-topology");

    /**
     * @return <code>model.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TopologyId</code> <code>topologyRef</code>, or <code>null</code> if not present
     */
    @Nullable
    TopologyId getTopologyRef();
    
    @Override
    UnderlayTopologyKey key();

}

