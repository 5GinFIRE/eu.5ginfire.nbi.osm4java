package ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param.monitoring.type.vdu.metric;
import java.lang.Object;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.ietf.yang.types.rev130715.Uuid;
import ns.yang.nfvo.vnfr.rev170228.$YangModuleInfoImpl;
import ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.MonitoringParam;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * container vdu-metric {
 *   leaf vdu-ref {
 *     type leafref {
 *       path ../../../../../vdur/id;
 *     }
 *   }
 *   leaf vdu-metric-name-ref {
 *     type leafref {
 *       path "../../../vdur[id = current()/../vdu-ref]/vdu-configuration/metrics/name";
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/project/(urn:ietf:params:xml:ns:yang:nfvo:vnfr?revision=2017-02-28)vnfr-catalog/vnfr/monitoring-param/monitoring-type/vdu-metric/vdu-metric</i>
 * 
 * <p>To create instances of this class use {@link VduMetricBuilder}.
 * @see VduMetricBuilder
 *
 */
public interface VduMetric
    extends
    ChildOf<MonitoringParam>,
    Augmentable<VduMetric>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vdu-metric");

    /**
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>vduRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Uuid getVduRef();
    
    /**
     * @return <code>java.lang.Object</code> <code>vduMetricNameRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getVduMetricNameRef();

}

