package yang.base;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.MonitoringParamAggregation;
import ns.yang.nfvo.mano.types.rev170208.MonitoringParamUiData;
import ns.yang.nfvo.mano.types.rev170208.MonitoringParamValue;

/**
 * List of monitoring parameters from VNF's that should be propogated up into NSR
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * grouping monitoring-param-common {
 *   leaf id {
 *     type string;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   uses manotypes:monitoring-param-value;
 *   uses manotypes:monitoring-param-ui-data;
 *   uses manotypes:monitoring-param-aggregation;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/monitoring-param-common</i>
 *
 */
public interface MonitoringParamCommon
    extends
    DataObject,
    MonitoringParamUiData,
    MonitoringParamAggregation,
    MonitoringParamValue
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("monitoring-param-common");

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

}

