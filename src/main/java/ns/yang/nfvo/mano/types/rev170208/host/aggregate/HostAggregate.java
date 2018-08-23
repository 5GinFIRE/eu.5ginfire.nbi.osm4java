package ns.yang.nfvo.mano.types.rev170208.host.aggregate;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;

/**
 * Name of the Host Aggregate
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list host-aggregate {
 *   key metadata-key;
 *   leaf metadata-key {
 *     type string;
 *   }
 *   leaf metadata-value {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/host-aggregate/host-aggregate</i>
 * 
 * <p>To create instances of this class use {@link HostAggregateBuilder}.
 * @see HostAggregateBuilder
 * @see HostAggregateKey
 *
 */
public interface HostAggregate
    extends
    ChildOf<ns.yang.nfvo.mano.types.rev170208.HostAggregate>,
    Augmentable<HostAggregate>,
    Identifiable<HostAggregateKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("host-aggregate");

    /**
     * Name of the additional information attached to the host-aggregate
     *
     *
     *
     * @return <code>java.lang.String</code> <code>metadataKey</code>, or <code>null</code> if not present
     */
    @Nullable
    String getMetadataKey();
    
    /**
     * Value of the corresponding metadata-key
     *
     *
     *
     * @return <code>java.lang.String</code> <code>metadataValue</code>, or <code>null</code> if not present
     */
    @Nullable
    String getMetadataValue();
    
    @Override
    HostAggregateKey key();

}

