package ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.network;
import java.lang.String;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.Network;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container incoming {
 *   leaf label {
 *     type string;
 *     default "INCOMING NETWORK TRAFFIC";
 *   }
 *   leaf bytes {
 *     type uint64;
 *   }
 *   leaf packets {
 *     type uint64;
 *   }
 *   leaf byte-rate {
 *     type decimal64 {
 *       fraction-digits 2;
 *     }
 *   }
 *   leaf packet-rate {
 *     type decimal64 {
 *       fraction-digits 2;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/nfvi-metrics/network/incoming</i>
 * 
 * <p>To create instances of this class use {@link IncomingBuilder}.
 * @see IncomingBuilder
 *
 */
public interface Incoming
    extends
    ChildOf<Network>,
    Augmentable<Incoming>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("incoming");

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
     * The cumulative number of incoming bytes.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>bytes</code>, or <code>null</code> if not present
     */
    @Nullable
    BigInteger getBytes();
    
    /**
     * The cumulative number of incoming packets.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>packets</code>, or <code>null</code> if not present
     */
    @Nullable
    BigInteger getPackets();
    
    /**
     * The current incoming byte-rate (bytes per second).
     *
     *
     *
     * @return <code>java.math.BigDecimal</code> <code>byteRate</code>, or <code>null</code> if not present
     */
    @Nullable
    BigDecimal getByteRate();
    
    /**
     * The current incoming packet (packets per second).
     *
     *
     *
     * @return <code>java.math.BigDecimal</code> <code>packetRate</code>, or <code>null</code> if not present
     */
    @Nullable
    BigDecimal getPacketRate();

}

