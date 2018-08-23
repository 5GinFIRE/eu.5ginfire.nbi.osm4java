package ns.yang.ietf.network.topology.rev150608;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ns.yang.ietf.network.rev150608.Network;
import ns.yang.ietf.network.topology.rev150608.network.Link;

public interface Network1
    extends
    DataObject,
    Augmentation<Network>
{




    /**
     * A Network Link connects a by Local (Source) node anda Remote (Destination) 
     * Network Nodes via a set of thenodes' termination points.As it is possible to 
     * have several links between the samesource and destination nodes, and as a link 
     * couldpotentially be re-homed between termination points, toensure that we would 
     * always know to distinguish betweenlinks, every link is identified by a dedicated
     * linkidentifier.Note that a link models a point-to-point link, not amultipoint 
     * link.Layering dependencies on links in underlay topologies arenot represented as
     * the layering information of nodes and oftermination points is sufficient.
     *
     *
     *
     * @return <code>java.util.List</code> <code>link</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Link> getLink();

}

