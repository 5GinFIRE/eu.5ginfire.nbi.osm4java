package yang.vnfd.vnfd.descriptor.monitoring.param.monitoring.type;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import yang.vnfd.$YangModuleInfoImpl;
import yang.vnfd.vnfd.descriptor.monitoring.param.MonitoringType;

/**
 * VDU-related metric from the infrastructure
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * case vdu-monitoring-param {
 *   container vdu-monitoring-param {
 *     leaf vdu-ref {
 *       type leafref {
 *         path ../../../../../vdu/id;
 *       }
 *     }
 *     leaf vdu-monitoring-param-ref {
 *       type leafref {
 *         path "../../../../vdu[id = current()/../vdu-ref]/monitoring-param/id";
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/monitoring-param/monitoring-type/vdu-monitoring-param</i>
 *
 */
public interface VduMonitoringParam
    extends
    DataObject,
    Augmentable<VduMonitoringParam>,
    MonitoringType
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vdu-monitoring-param");

    /**
     * @return <code>model.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.monitoring.param.monitoring.type.vdu.monitoring.param.VduMonitoringParam</code> <code>vduMonitoringParam</code>, or <code>null</code> if not present
     */
    @Nullable
    yang.vnfd.vnfd.descriptor.monitoring.param.monitoring.type.vdu.monitoring.param.VduMonitoringParam getVduMonitoringParam();

}

