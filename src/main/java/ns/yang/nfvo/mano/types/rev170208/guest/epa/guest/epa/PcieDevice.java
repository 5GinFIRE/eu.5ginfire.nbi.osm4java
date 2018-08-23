package ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa;
import java.lang.Override;
import java.lang.String;
import java.math.BigInteger;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa;

/**
 * List of pcie passthrough devices.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list pcie-device {
 *   key device-id;
 *   leaf device-id {
 *     type string;
 *   }
 *   leaf count {
 *     type uint64;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/guest-epa/guest-epa/pcie-device</i>
 * 
 * <p>To create instances of this class use {@link PcieDeviceBuilder}.
 * @see PcieDeviceBuilder
 * @see PcieDeviceKey
 *
 */
public interface PcieDevice
    extends
    ChildOf<GuestEpa>,
    Augmentable<PcieDevice>,
    Identifiable<PcieDeviceKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("pcie-device");

    /**
     * Device identifier.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>deviceId</code>, or <code>null</code> if not present
     */
    @Nullable
    String getDeviceId();
    
    /**
     * Number of devices to attach to the VM.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>count</code>, or <code>null</code> if not present
     */
    @Nullable
    BigInteger getCount();
    
    @Override
    PcieDeviceKey key();

}

