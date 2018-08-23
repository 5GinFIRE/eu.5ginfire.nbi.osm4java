package yang.vnfd.vnfd.descriptor.monitoring.param.monitoring.type.vdu.monitoring.param;
import java.lang.Object;
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
 * container vdu-monitoring-param {
 *   leaf vdu-ref {
 *     type leafref {
 *       path ../../../../../vdu/id;
 *     }
 *   }
 *   leaf vdu-monitoring-param-ref {
 *     type leafref {
 *       path "../../../../vdu[id = current()/../vdu-ref]/monitoring-param/id";
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/monitoring-param/monitoring-type/vdu-monitoring-param/vdu-monitoring-param</i>
 * 
 * <p>To create instances of this class use {@link VduMonitoringParamBuilder}.
 * @see VduMonitoringParamBuilder
 *
 */
public interface VduMonitoringParam
    extends
    ChildOf<MonitoringParam>,
    Augmentable<VduMonitoringParam>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vdu-monitoring-param");

    /**
     * @return <code>java.lang.String</code> <code>vduRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVduRef();
    
    /**
     * @return <code>java.lang.Object</code> <code>vduMonitoringParamRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getVduMonitoringParamRef();

}

