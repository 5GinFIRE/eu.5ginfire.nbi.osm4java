package yang.vnfd.vnfd.descriptor.monitoring.param.monitoring.type.vnf.metric;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import yang.vnfd.$YangModuleInfoImpl;
import yang.vnfd.vnfd.descriptor.MonitoringParam;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * container vnf-metric {
 *   leaf vnf-metric-name-ref {
 *     type leafref {
 *       path ../../../../../vnf-configuration/metrics/name;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/monitoring-param/monitoring-type/vnf-metric/vnf-metric</i>
 * 
 * <p>To create instances of this class use {@link VnfMetricBuilder}.
 * @see VnfMetricBuilder
 *
 */
public interface VnfMetric
    extends
    ChildOf<MonitoringParam>,
    Augmentable<VnfMetric>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnf-metric");

    /**
     * @return <code>java.lang.String</code> <code>vnfMetricNameRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVnfMetricNameRef();

}

