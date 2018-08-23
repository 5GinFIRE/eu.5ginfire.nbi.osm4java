package yang.project.nsd.rev170228.nsr.nsd.monitoring.param.monitoring.param;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import yang.project.nsd.rev170228.$YangModuleInfoImpl;
import yang.project.nsd.rev170228.nsr.nsd.monitoring.param.MonitoringParam;

/**
 * A list of VNFD monitoring params
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * list vnfd-monitoring-param {
 *   key "member-vnf-index-ref vnfd-monitoring-param-ref";
 *   leaf vnfd-id-ref {
 *     type string;
 *   }
 *   leaf vnfd-monitoring-param-ref {
 *     type leafref {
 *       path "../../../../../../project-vnfd:vnfd-catalog/project-vnfd:vnfd[project-vnfd:id = current()/../vnfd-id-ref]/project-vnfd:monitoring-param/project-vnfd:id";
 *     }
 *   }
 *   leaf member-vnf-index-ref {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsr-nsd-monitoring-param/monitoring-param/vnfd-monitoring-param</i>
 * 
 * <p>To create instances of this class use {@link VnfdMonitoringParamBuilder}.
 * @see VnfdMonitoringParamBuilder
 * @see VnfdMonitoringParamKey
 *
 */
public interface VnfdMonitoringParam
    extends
    ChildOf<MonitoringParam>,
    Augmentable<VnfdMonitoringParam>,
    Identifiable<VnfdMonitoringParamKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnfd-monitoring-param");

    /**
     * A reference to a vnfd. This is a leafref to path: 
     * ../../../../nsd:constituent-vnfd + [nsd:id = current()/../nsd:id-ref] + 
     * /nsd:vnfd-id-ref NOTE: An issue with confd is preventing the use of xpath. Seems
     * to be an issue with leafref to leafref, whose target is in a different module. 
     * Once that is resolved this will switched to use leafref
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfdIdRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVnfdIdRef();
    
    /**
     * A reference to the VNFD monitoring param
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdMonitoringParamRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getVnfdMonitoringParamRef();
    
    /**
     * Optional reference to member-vnf within constituent-vnfds
     *
     *
     *
     * @return <code>java.lang.String</code> <code>memberVnfIndexRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getMemberVnfIndexRef();
    
    @Override
    VnfdMonitoringParamKey key();

}

