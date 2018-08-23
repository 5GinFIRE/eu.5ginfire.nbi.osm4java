package ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.om.numa.type;
import java.lang.Short;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.OmNumaType;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * case threads {
 *   leaf num-threads {
 *     type uint8;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/guest-epa/guest-epa/numa-policy/numa-aware/numa-node-policy/node/om-numa-type/threads</i>
 *
 */
public interface Threads
    extends
    DataObject,
    Augmentable<Threads>,
    OmNumaType
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("threads");

    /**
     * @return <code>java.lang.Short</code> <code>numThreads</code>, or <code>null</code> if not present
     */
    @Nullable
    Short getNumThreads();

}

