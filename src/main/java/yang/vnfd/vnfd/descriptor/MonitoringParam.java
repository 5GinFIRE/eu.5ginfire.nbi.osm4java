package yang.vnfd.vnfd.descriptor;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.JsonQueryMethod;
import ns.yang.nfvo.mano.types.rev170208.MonitoringParamAggregation;
import ns.yang.nfvo.mano.types.rev170208.MonitoringParamUiData;
import ns.yang.nfvo.mano.types.rev170208.MonitoringParamValue;
import yang.vnfd.$YangModuleInfoImpl;
import yang.vnfd.VnfdDescriptor;
import yang.vnfd.vnfd.descriptor.monitoring.param.JsonQueryParams;
import yang.vnfd.vnfd.descriptor.monitoring.param.MonitoringType;

/**
 * List of monitoring parameters at the network service level
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
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
 *             path ../../../../../vdu/id;
 *           }
 *         }
 *         leaf vdu-monitoring-param-ref {
 *           type leafref {
 *             path "../../../../vdu[id = current()/../vdu-ref]/monitoring-param/id";
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
 *             path ../../../../../vdu/id;
 *           }
 *         }
 *         leaf vdu-metric-name-ref {
 *           type leafref {
 *             path "../../../../../vdu[id = current()/../vdu-ref]/vdu-configuration/metrics/name";
 *           }
 *         }
 *       }
 *     }
 *   }
 *   leaf http-endpoint-ref {
 *     type leafref {
 *       path ../../http-endpoint/path;
 *     }
 *   }
 *   leaf json-query-method {
 *     type manotypes:json-query-method;
 *     default NAMEKEY;
 *   }
 *   container json-query-params {
 *     leaf json-path {
 *       type string;
 *     }
 *     leaf object-path {
 *       type string;
 *     }
 *   }
 *   uses manotypes:monitoring-param-ui-data;
 *   uses manotypes:monitoring-param-value;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/monitoring-param</i>
 * 
 * <p>To create instances of this class use {@link MonitoringParamBuilder}.
 * @see MonitoringParamBuilder
 * @see MonitoringParamKey
 *
 */
public interface MonitoringParam
    extends
    ChildOf<VnfdDescriptor>,
    Augmentable<MonitoringParam>,
    MonitoringParamUiData,
    MonitoringParamAggregation,
    MonitoringParamValue,
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
     * @return <code>model.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.monitoring.param.MonitoringType</code> <code>monitoringType</code>, or <code>null</code> if not present
     */
    @Nullable
    MonitoringType getMonitoringType();
    
    /**
     * @return <code>java.lang.String</code> <code>httpEndpointRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getHttpEndpointRef();
    
    /**
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.JsonQueryMethod</code> <code>jsonQueryMethod</code>, or <code>null</code> if not present
     */
    @Nullable
    JsonQueryMethod getJsonQueryMethod();
    
    /**
     * @return <code>model.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.monitoring.param.JsonQueryParams</code> <code>jsonQueryParams</code>, or <code>null</code> if not present
     */
    @Nullable
    JsonQueryParams getJsonQueryParams();
    
    @Override
    MonitoringParamKey key();

}

