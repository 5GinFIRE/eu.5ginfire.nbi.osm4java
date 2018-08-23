package ns.topology;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ns.topology.link.attributes.Destination;
import ns.topology.link.attributes.Source;
import ns.topology.link.attributes.SupportingLink;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-network-topology</b>
 * <pre>
 * grouping link-attributes {
 *   leaf link-id {
 *     type link-id;
 *   }
 *   container source {
 *     leaf source-node {
 *       type node-ref;
 *     }
 *     leaf source-tp {
 *       type tp-ref;
 *     }
 *   }
 *   container destination {
 *     leaf dest-node {
 *       type node-ref;
 *     }
 *     leaf dest-tp {
 *       type tp-ref;
 *     }
 *   }
 *   list supporting-link {
 *     key link-ref;
 *     leaf link-ref {
 *       type link-ref;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-network-topology/link-attributes</i>
 *
 */
public interface LinkAttributes
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("link-attributes");

    /**
     * The identifier of a link in the topology.A link is specific to a topology to 
     * which it belongs.
     *
     *
     *
     * @return <code>model.urn.tbd.params.xml.ns.yang.network.topology.rev131021.LinkId</code> <code>linkId</code>, or <code>null</code> if not present
     */
    @Nullable
    LinkId getLinkId();
    
    /**
     * @return <code>model.urn.tbd.params.xml.ns.yang.network.topology.rev131021.link.attributes.Source</code> <code>source</code>, or <code>null</code> if not present
     */
    @Nullable
    Source getSource();
    
    /**
     * @return <code>model.urn.tbd.params.xml.ns.yang.network.topology.rev131021.link.attributes.Destination</code> <code>destination</code>, or <code>null</code> if not present
     */
    @Nullable
    Destination getDestination();
    
    /**
     * @return <code>java.util.List</code> <code>supportingLink</code>, or <code>null</code> if not present
     */
    @Nullable
    List<SupportingLink> getSupportingLink();

}

