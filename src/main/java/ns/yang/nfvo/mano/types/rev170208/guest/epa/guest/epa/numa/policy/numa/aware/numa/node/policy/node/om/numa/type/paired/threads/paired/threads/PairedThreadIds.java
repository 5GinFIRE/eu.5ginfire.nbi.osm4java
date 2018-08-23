package ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.om.numa.type.paired.threads.paired.threads;
import java.lang.Override;
import java.lang.Short;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.om.numa.type.paired.threads.PairedThreads;

/**
 * List of thread pairs to use in case of paired-thread NUMA
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list paired-thread-ids {
 *   max-elements 16;
 *   key thread-a;
 *   leaf thread-a {
 *     type uint8;
 *   }
 *   leaf thread-b {
 *     type uint8;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/guest-epa/guest-epa/numa-policy/numa-aware/numa-node-policy/node/om-numa-type/paired-threads/paired-threads/paired-thread-ids</i>
 * 
 * <p>To create instances of this class use {@link PairedThreadIdsBuilder}.
 * @see PairedThreadIdsBuilder
 * @see PairedThreadIdsKey
 *
 */
public interface PairedThreadIds
    extends
    ChildOf<PairedThreads>,
    Augmentable<PairedThreadIds>,
    Identifiable<PairedThreadIdsKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("paired-thread-ids");

    /**
     * @return <code>java.lang.Short</code> <code>threadA</code>, or <code>null</code> if not present
     */
    @Nullable
    Short getThreadA();
    
    /**
     * @return <code>java.lang.Short</code> <code>threadB</code>, or <code>null</code> if not present
     */
    @Nullable
    Short getThreadB();
    
    @Override
    PairedThreadIdsKey key();

}

