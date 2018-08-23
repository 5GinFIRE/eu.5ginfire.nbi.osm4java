package ns.topology.link.attributes;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ns.topology.$YangModuleInfoImpl;
import ns.topology.LinkAttributes;
import ns.topology.NodeId;
import ns.topology.TpId;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-network-topology</b>
 * <pre>
 * container destination {
 *   leaf dest-node {
 *     type node-ref;
 *   }
 *   leaf dest-tp {
 *     type tp-ref;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-network-topology/link-attributes/destination</i>
 * 
 * <p>To create instances of this class use {@link DestinationBuilder}.
 * @see DestinationBuilder
 *
 */
public interface Destination
    extends
    ChildOf<LinkAttributes>,
    Augmentable<Destination>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("destination");

    /**
     * Destination node identifier, must be in same topology.
     *
     *
     *
     * @return <code>model.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NodeId</code> <code>destNode</code>, or <code>null</code> if not present
     */
    @Nullable
    NodeId getDestNode();
    
    /**
     * Termination point within destination node that terminates the link.
     *
     *
     *
     * @return <code>model.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TpId</code> <code>destTp</code>, or <code>null</code> if not present
     */
    @Nullable
    TpId getDestTp();

}

