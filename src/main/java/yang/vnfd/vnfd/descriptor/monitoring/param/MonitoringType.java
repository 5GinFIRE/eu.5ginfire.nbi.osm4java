package yang.vnfd.vnfd.descriptor.monitoring.param;
import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

import yang.vnfd.$YangModuleInfoImpl;
import yang.vnfd.vnfd.descriptor.MonitoringParam;

/**
 * Defines the type of monitoring param to be used: * vdu-monitorin-param: 
 * VDU-related metric (from NFVI) * vnf-metric: VNF-related metric (from VCA) * 
 * vdu-metric: VDU-related metric (from VCA)
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * choice monitoring-type {
 *   case vdu-monitoring-param {
 *     container vdu-monitoring-param {
 *       leaf vdu-ref {
 *         type leafref {
 *           path ../../../../../vdu/id;
 *         }
 *       }
 *       leaf vdu-monitoring-param-ref {
 *         type leafref {
 *           path "../../../../vdu[id = current()/../vdu-ref]/monitoring-param/id";
 *         }
 *       }
 *     }
 *   }
 *   case vnf-metric {
 *     container vnf-metric {
 *       leaf vnf-metric-name-ref {
 *         type leafref {
 *           path ../../../../../vnf-configuration/metrics/name;
 *         }
 *       }
 *     }
 *   }
 *   case vdu-metric {
 *     container vdu-metric {
 *       leaf vdu-ref {
 *         type leafref {
 *           path ../../../../../vdu/id;
 *         }
 *       }
 *       leaf vdu-metric-name-ref {
 *         type leafref {
 *           path "../../../../../vdu[id = current()/../vdu-ref]/vdu-configuration/metrics/name";
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/monitoring-param/monitoring-type</i>
 *
 */
public interface MonitoringType
    extends
    ChoiceIn<MonitoringParam>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("monitoring-type");


}

