package yang.project.nsd.rev170228.nsr.nsd.monitoring.param;
import java.lang.Override;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import yang.base.MonitoringParamCommon;
import yang.project.nsd.rev170228.$YangModuleInfoImpl;
import yang.project.nsd.rev170228.NsrNsdMonitoringParam;
import yang.project.nsd.rev170228.nsr.nsd.monitoring.param.monitoring.param.VnfdMonitoringParam;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * list monitoring-param {
 *   key id;
 *   uses nsd-base:monitoring-param-common;
 *   list vnfd-monitoring-param {
 *     key "member-vnf-index-ref vnfd-monitoring-param-ref";
 *     leaf vnfd-id-ref {
 *       type string;
 *     }
 *     leaf vnfd-monitoring-param-ref {
 *       type leafref {
 *         path "../../../../../../project-vnfd:vnfd-catalog/project-vnfd:vnfd[project-vnfd:id = current()/../vnfd-id-ref]/project-vnfd:monitoring-param/project-vnfd:id";
 *       }
 *     }
 *     leaf member-vnf-index-ref {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsr-nsd-monitoring-param/monitoring-param</i>
 * 
 * <p>To create instances of this class use {@link MonitoringParamBuilder}.
 * @see MonitoringParamBuilder
 * @see MonitoringParamKey
 *
 */
public interface MonitoringParam
    extends
    ChildOf<NsrNsdMonitoringParam>,
    Augmentable<MonitoringParam>,
    MonitoringParamCommon,
    Identifiable<MonitoringParamKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("monitoring-param");

    /**
     * A list of VNFD monitoring params
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfdMonitoringParam</code>, or <code>null</code> if not present
     */
    @Nullable
    List<VnfdMonitoringParam> getVnfdMonitoringParam();
    
    @Override
    MonitoringParamKey key();

}

