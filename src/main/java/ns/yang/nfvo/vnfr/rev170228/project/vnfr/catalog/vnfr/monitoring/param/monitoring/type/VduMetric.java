package ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param.monitoring.type;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.vnfr.rev170228.$YangModuleInfoImpl;
import ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param.MonitoringType;

/**
 * VDU-related metric (from VCA)
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * case vdu-metric {
 *   container vdu-metric {
 *     leaf vdu-ref {
 *       type leafref {
 *         path ../../../../../vdur/id;
 *       }
 *     }
 *     leaf vdu-metric-name-ref {
 *       type leafref {
 *         path "../../../vdur[id = current()/../vdu-ref]/vdu-configuration/metrics/name";
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/project/(urn:ietf:params:xml:ns:yang:nfvo:vnfr?revision=2017-02-28)vnfr-catalog/vnfr/monitoring-param/monitoring-type/vdu-metric</i>
 *
 */
public interface VduMetric
    extends
    DataObject,
    Augmentable<VduMetric>,
    MonitoringType
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vdu-metric");

    /**
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param.monitoring.type.vdu.metric.VduMetric</code> <code>vduMetric</code>, or <code>null</code> if not present
     */
    @Nullable
    ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param.monitoring.type.vdu.metric.VduMetric getVduMetric();

}

