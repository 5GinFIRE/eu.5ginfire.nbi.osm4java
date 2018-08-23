package ns.yang.nfvo.mano.types.rev170208.vca.metrics;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.VcaMetrics;

/**
 * List of VCA related metrics
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list metrics {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vca-metrics/metrics</i>
 * 
 * <p>To create instances of this class use {@link MetricsBuilder}.
 * @see MetricsBuilder
 * @see MetricsKey
 *
 */
public interface Metrics
    extends
    ChildOf<VcaMetrics>,
    Augmentable<Metrics>,
    Identifiable<MetricsKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("metrics");

    /**
     * Name of the metric, as defined in the Juju charm.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    @Override
    MetricsKey key();

}

