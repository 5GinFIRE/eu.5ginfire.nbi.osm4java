package ns.yang.nfvo.mano.types.rev170208.nfvi.metrics;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.NfviMetrics;
import ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.network.Incoming;
import ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.network.Outgoing;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container network {
 *   leaf label {
 *     type string;
 *     default "NETWORK TRAFFIC";
 *   }
 *   container incoming {
 *     leaf label {
 *       type string;
 *       default "INCOMING NETWORK TRAFFIC";
 *     }
 *     leaf bytes {
 *       type uint64;
 *     }
 *     leaf packets {
 *       type uint64;
 *     }
 *     leaf byte-rate {
 *       type decimal64 {
 *         fraction-digits 2;
 *       }
 *     }
 *     leaf packet-rate {
 *       type decimal64 {
 *         fraction-digits 2;
 *       }
 *     }
 *   }
 *   container outgoing {
 *     leaf label {
 *       type string;
 *       default "OUTGOING NETWORK TRAFFIC";
 *     }
 *     leaf bytes {
 *       type uint64;
 *     }
 *     leaf packets {
 *       type uint64;
 *     }
 *     leaf byte-rate {
 *       type decimal64 {
 *         fraction-digits 2;
 *       }
 *     }
 *     leaf packet-rate {
 *       type decimal64 {
 *         fraction-digits 2;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/nfvi-metrics/network</i>
 * 
 * <p>To create instances of this class use {@link NetworkBuilder}.
 * @see NetworkBuilder
 *
 */
public interface Network
    extends
    ChildOf<NfviMetrics>,
    Augmentable<Network>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("network");

    /**
     * Label to show in UI
     *
     *
     *
     * @return <code>java.lang.String</code> <code>label</code>, or <code>null</code> if not present
     */
    @Nullable
    String getLabel();
    
    /**
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.network.Incoming</code> <code>incoming</code>, or <code>null</code> if not present
     */
    @Nullable
    Incoming getIncoming();
    
    /**
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.network.Outgoing</code> <code>outgoing</code>, or <code>null</code> if not present
     */
    @Nullable
    Outgoing getOutgoing();

}

