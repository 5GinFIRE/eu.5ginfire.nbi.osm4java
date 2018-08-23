package ns.yang.ietf.l2.topology.rev150623;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Notification;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Notification event for L2 link
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * notification l2-link-event {
 *   leaf event-type {
 *     type l2-network-event-type;
 *   }
 *   uses link-ref;
 *   uses l2-network-type;
 *   uses l2-link-attributes;
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/l2-link-event</i>
 * 
 * <p>To create instances of this class use {@link L2LinkEventBuilder}.
 * @see L2LinkEventBuilder
 *
 */
public interface L2LinkEvent
    extends
    DataObject,
    Augmentable<L2LinkEvent>,
    L2LinkAttributes,
    L2NetworkType,
    LinkRef,
    Notification
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("l2-link-event");

    /**
     * Event type
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NetworkEventType</code> <code>eventType</code>, or <code>null</code> if not present
     */
    @Nullable
    L2NetworkEventType getEventType();

}

