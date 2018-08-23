package ns.yang.ietf.l2.topology.rev150623;
import org.opendaylight.yangtools.yang.binding.NotificationListener;

/**
 * Interface for implementing the following YANG notifications defined in module <b>ietf-l2-topology</b>
 * <pre>
 * notification l2-node-event {
 *   leaf event-type {
 *     type l2-network-event-type;
 *   }
 *   uses node-ref;
 *   uses l2-network-type;
 *   uses l2-node-attributes;
 * }
 * notification l2-termination-point-event {
 *   leaf event-type {
 *     type l2-network-event-type;
 *   }
 *   uses tp-ref;
 *   uses l2-network-type;
 *   uses l2-termination-point-attributes;
 * }
 * notification l2-link-event {
 *   leaf event-type {
 *     type l2-network-event-type;
 *   }
 *   uses link-ref;
 *   uses l2-network-type;
 *   uses l2-link-attributes;
 * }
 * </pre>
 *
 */
public interface IetfL2TopologyListener
    extends
    NotificationListener
{




    /**
     * Notification event for L2 node
     *
     */
    void onL2NodeEvent(L2NodeEvent notification);
    
    /**
     * Notification event for L2 termination point
     *
     */
    void onL2TerminationPointEvent(L2TerminationPointEvent notification);
    
    /**
     * Notification event for L2 link
     *
     */
    void onL2LinkEvent(L2LinkEvent notification);

}

