package yang.vnfd.vnfd.descriptor.monitoring.param.monitoring.type;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import yang.vnfd.$YangModuleInfoImpl;
import yang.vnfd.vnfd.descriptor.monitoring.param.MonitoringType;

/**
 * VNF-related metric (from VCA)
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * case vnf-metric {
 *   container vnf-metric {
 *     leaf vnf-metric-name-ref {
 *       type leafref {
 *         path ../../../../../vnf-configuration/metrics/name;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/monitoring-param/monitoring-type/vnf-metric</i>
 *
 */
public interface VnfMetric
    extends
    DataObject,
    Augmentable<VnfMetric>,
    MonitoringType
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnf-metric");

    /**
     * @return <code>model.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.monitoring.param.monitoring.type.vnf.metric.VnfMetric</code> <code>vnfMetric</code>, or <code>null</code> if not present
     */
    @Nullable
    yang.vnfd.vnfd.descriptor.monitoring.param.monitoring.type.vnf.metric.VnfMetric getVnfMetric();

}

