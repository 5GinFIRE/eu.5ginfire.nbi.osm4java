package ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param.monitoring.type.vdu.monitoring.param;
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
 * container vdu-monitoring-param {
 *   leaf vdu-ref {
 *     type leafref {
 *       path ../../../../../vdur/id;
 *     }
 *   }
 *   leaf vdu-monitoring-param-ref {
 *     type leafref {
 *       path "../../../vdur[id = current()/../vdu-ref]/monitoring-param/id";
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/project/(urn:ietf:params:xml:ns:yang:nfvo:vnfr?revision=2017-02-28)vnfr-catalog/vnfr/monitoring-param/monitoring-type/vdu-monitoring-param/vdu-monitoring-param</i>
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
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>vduRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Uuid getVduRef();
    
    /**
     * @return <code>java.lang.Object</code> <code>vduMonitoringParamRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getVduMonitoringParamRef();

}

