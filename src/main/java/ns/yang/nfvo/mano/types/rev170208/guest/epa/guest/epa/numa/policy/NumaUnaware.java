package ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy;
import java.lang.Boolean;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.NumaPolicy;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * case numa-unaware {
 *   leaf numa-unaware {
 *     type empty;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/guest-epa/guest-epa/numa-policy/numa-unaware</i>
 *
 */
public interface NumaUnaware
    extends
    DataObject,
    Augmentable<NumaUnaware>,
    NumaPolicy
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("numa-unaware");

    /**
     * @return <code>java.lang.Boolean</code> <code>numaUnaware</code>, or <code>null</code> if not present
     */
    @Nullable
    Boolean isNumaUnaware();

}

