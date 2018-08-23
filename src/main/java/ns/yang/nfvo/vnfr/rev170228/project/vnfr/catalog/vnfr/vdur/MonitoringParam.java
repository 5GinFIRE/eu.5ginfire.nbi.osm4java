package ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.NfviMetricType;
import ns.yang.nfvo.vnfr.rev170228.$YangModuleInfoImpl;
import ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur;

/**
 * List of VDU-related monitoring parameters at NFVI level
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * list monitoring-param {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   leaf nfvi-metric {
 *     type manotypes:nfvi-metric-type;
 *   }
 *   leaf interface-name-ref {
 *     type leafref {
 *       path ../../interface/name;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/project/(urn:ietf:params:xml:ns:yang:nfvo:vnfr?revision=2017-02-28)vnfr-catalog/vnfr/vdur/monitoring-param</i>
 * 
 * <p>To create instances of this class use {@link MonitoringParamBuilder}.
 * @see MonitoringParamBuilder
 * @see MonitoringParamKey
 *
 */
public interface MonitoringParam
    extends
    ChildOf<Vdur>,
    Augmentable<MonitoringParam>,
    Identifiable<MonitoringParamKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("monitoring-param");

    /**
     * The unique id of the monitoring param at VDU level
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable
    String getId();
    
    /**
     * The associated NFVI metric to be monitored
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.NfviMetricType</code> <code>nfviMetric</code>, or <code>null</code> if not present
     */
    @Nullable
    NfviMetricType getNfviMetric();
    
    /**
     * Reference to a VDU interface name. Applicable only when the nfvi-metricrefers to
     * an interface and not to the VM
     *
     *
     *
     * @return <code>java.lang.String</code> <code>interfaceNameRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getInterfaceNameRef();
    
    @Override
    MonitoringParamKey key();

}

