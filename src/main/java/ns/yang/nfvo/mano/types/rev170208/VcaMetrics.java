package ns.yang.nfvo.mano.types.rev170208;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.vca.metrics.Metrics;

/**
 * Information about the VNF or VDU metrics
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping vca-metrics {
 *   list metrics {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vca-metrics</i>
 *
 */
public interface VcaMetrics
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vca-metrics");

    /**
     * List of VCA related metrics
     *
     *
     *
     * @return <code>java.util.List</code> <code>metrics</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Metrics> getMetrics();

}

