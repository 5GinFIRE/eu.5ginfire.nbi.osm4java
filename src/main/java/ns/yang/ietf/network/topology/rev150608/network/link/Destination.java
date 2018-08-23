package ns.yang.ietf.network.topology.rev150608.network.link;
import java.lang.Object;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.ietf.network.rev150608.NodeId;
import ns.yang.ietf.network.topology.rev150608.$YangModuleInfoImpl;
import ns.yang.ietf.network.topology.rev150608.network.Link;

/**
 * This container holds the logical destination of aparticular link.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network-topology</b>
 * <pre>
 * container destination {
 *   leaf dest-node {
 *     type leafref {
 *       path ../../../../nd:network/nd:node/nd:node-id;
 *     }
 *   }
 *   leaf dest-tp {
 *     type leafref {
 *       path ../../../../nd:network/nd:node[nd:node-id=current()/../dest-node]/termination-point/tp-id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network-topology/network/(urn:ietf:params:xml:ns:yang:ietf-network-topology?revision=2015-06-08)link/destination</i>
 * 
 * <p>To create instances of this class use {@link DestinationBuilder}.
 * @see DestinationBuilder
 *
 */
public interface Destination
    extends
    ChildOf<Link>,
    Augmentable<Destination>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("destination");

    /**
     * Destination node identifier, must be in the samenetwork.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.network.rev150608.NodeId</code> <code>destNode</code>, or <code>null</code> if not present
     */
    @Nullable
    NodeId getDestNode();
    
    /**
     * Termination point within destination node thatterminates the link.
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>destTp</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getDestTp();

}

