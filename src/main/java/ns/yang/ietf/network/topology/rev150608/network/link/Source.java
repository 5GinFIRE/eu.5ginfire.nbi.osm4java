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
 * This container holds the logical source of a particularlink.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network-topology</b>
 * <pre>
 * container source {
 *   leaf source-node {
 *     type leafref {
 *       path ../../../../nd:network/nd:node/nd:node-id;
 *     }
 *   }
 *   leaf source-tp {
 *     type leafref {
 *       path ../../../../nd:network/nd:node[nd:node-id=current()/../source-node]/termination-point/tp-id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-network-topology/network/(urn:ietf:params:xml:ns:yang:ietf-network-topology?revision=2015-06-08)link/source</i>
 * 
 * <p>To create instances of this class use {@link SourceBuilder}.
 * @see SourceBuilder
 *
 */
public interface Source
    extends
    ChildOf<Link>,
    Augmentable<Source>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("source");

    /**
     * Source node identifier, must be in same topology.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.network.rev150608.NodeId</code> <code>sourceNode</code>, or <code>null</code> if not present
     */
    @Nullable
    NodeId getSourceNode();
    
    /**
     * Termination point within source node that terminatesthe link.
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>sourceTp</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getSourceTp();

}

