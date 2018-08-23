package ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.MonitoringParamAggregation;
import ns.yang.nfvo.vnfr.rev170228.$YangModuleInfoImpl;
import ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr;
import ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param.MonitoringType;

/**
 * List of monitoring parameters at the network service level
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * list monitoring-param {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   uses manotypes:monitoring-param-aggregation;
 *   choice monitoring-type {
 *     case vdu-monitoring-param {
 *       container vdu-monitoring-param {
 *         leaf vdu-ref {
 *           type leafref {
 *             path ../../../../../vdur/id;
 *           }
 *         }
 *         leaf vdu-monitoring-param-ref {
 *           type leafref {
 *             path "../../../vdur[id = current()/../vdu-ref]/monitoring-param/id";
 *           }
 *         }
 *       }
 *     }
 *     case vnf-metric {
 *       container vnf-metric {
 *         leaf vnf-metric-name-ref {
 *           type leafref {
 *             path ../../../../../vnf-configuration/metrics/name;
 *           }
 *         }
 *       }
 *     }
 *     case vdu-metric {
 *       container vdu-metric {
 *         leaf vdu-ref {
 *           type leafref {
 *             path ../../../../../vdur/id;
 *           }
 *         }
 *         leaf vdu-metric-name-ref {
 *           type leafref {
 *             path "../../../vdur[id = current()/../vdu-ref]/vdu-configuration/metrics/name";
 *           }
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/project/(urn:ietf:params:xml:ns:yang:nfvo:vnfr?revision=2017-02-28)vnfr-catalog/vnfr/monitoring-param</i>
 * 
 * <p>To create instances of this class use {@link MonitoringParamBuilder}.
 * @see MonitoringParamBuilder
 * @see MonitoringParamKey
 *
 */
public interface MonitoringParam
    extends
    ChildOf<Vnfr>,
    Augmentable<MonitoringParam>,
    MonitoringParamAggregation,
    Identifiable<MonitoringParamKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("monitoring-param");

    /**
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable
    String getId();
    
    /**
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * Defines the type of monitoring param to be used: * vdu-monitorin-param: 
     * VDU-related metric (from NFVI) * vnf-metric: VNF-related metric (from VCA) * 
     * vdu-metric: VDU-related metric (from VCA)
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param.MonitoringType</code> <code>monitoringType</code>, or <code>null</code> if not present
     */
    @Nullable
    MonitoringType getMonitoringType();
    
    @Override
    MonitoringParamKey key();

}

