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
 * container source {
 *   leaf source-node {
 *     type node-ref;
 *   }
 *   leaf source-tp {
 *     type tp-ref;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-network-topology/link-attributes/source</i>
 * 
 * <p>To create instances of this class use {@link SourceBuilder}.
 * @see SourceBuilder
 *
 */
public interface Source
    extends
    ChildOf<LinkAttributes>,
    Augmentable<Source>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("source");

    /**
     * Source node identifier, must be in same topology.
     *
     *
     *
     * @return <code>model.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NodeId</code> <code>sourceNode</code>, or <code>null</code> if not present
     */
    @Nullable
    NodeId getSourceNode();
    
    /**
     * Termination point within source node that terminates the link.
     *
     *
     *
     * @return <code>model.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TpId</code> <code>sourceTp</code>, or <code>null</code> if not present
     */
    @Nullable
    TpId getSourceTp();

}

