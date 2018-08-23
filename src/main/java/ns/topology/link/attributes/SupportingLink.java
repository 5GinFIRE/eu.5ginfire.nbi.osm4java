package ns.topology.link.attributes;
import java.lang.Override;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.topology.$YangModuleInfoImpl;
import ns.topology.LinkAttributes;
import ns.topology.LinkId;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-network-topology</b>
 * <pre>
 * list supporting-link {
 *   key link-ref;
 *   leaf link-ref {
 *     type link-ref;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-network-topology/link-attributes/supporting-link</i>
 * 
 * <p>To create instances of this class use {@link SupportingLinkBuilder}.
 * @see SupportingLinkBuilder
 * @see SupportingLinkKey
 *
 */
public interface SupportingLink
    extends
    ChildOf<LinkAttributes>,
    Augmentable<SupportingLink>,
    Identifiable<SupportingLinkKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("supporting-link");

    /**
     * @return <code>model.urn.tbd.params.xml.ns.yang.network.topology.rev131021.LinkId</code> <code>linkRef</code>, or <code>null</code> if not present
     */
    @Nullable
    LinkId getLinkRef();
    
    @Override
    SupportingLinkKey key();

}

