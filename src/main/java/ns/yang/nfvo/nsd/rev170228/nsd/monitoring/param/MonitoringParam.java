package ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param;

import java.lang.Override;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.nsd.rev170228.$YangModuleInfoImpl;
import ns.yang.nfvo.nsd.rev170228.NsdMonitoringParam;
import ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param.monitoring.param.VnfdMonitoringParam;
import yang.base.MonitoringParamCommon;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module
 * <b>nsd</b>
 * 
 * <pre>
 * list monitoring-param {
 *   key id;
 *   uses nsd-base:monitoring-param-common;
 *   list vnfd-monitoring-param {
 *     key "member-vnf-index-ref vnfd-monitoring-param-ref";
 *     leaf vnfd-id-ref {
 *       type leafref {
 *         path "../../../constituent-vnfd[member-vnf-index = current()/../member-vnf-index-ref]/vnfd-id-ref";
 *       }
 *     }
 *     leaf vnfd-monitoring-param-ref {
 *       type leafref {
 *         path "/vnfd:vnfd-catalog/vnfd:vnfd[vnfd:id = current()/../vnfd-id-ref]/vnfd:monitoring-param/vnfd:id";
 *       }
 *     }
 *     leaf member-vnf-index-ref {
 *       type string;
 *     }
 *   }
 * }
 * </pre>
 * 
 * The schema path to identify an instance is
 * <i>nsd/nsd-monitoring-param/monitoring-param</i>
 * 
 * <p>
 * To create instances of this class use {@link MonitoringParamBuilder}.
 * 
 * @see MonitoringParamBuilder
 * @see MonitoringParamKey
 *
 */
public interface MonitoringParam extends ChildOf<NsdMonitoringParam>, Augmentable<MonitoringParam>,
		MonitoringParamCommon, Identifiable<MonitoringParamKey> {

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("monitoring-param");

	/**
	 * A list of VNFD monitoring params
	 *
	 *
	 *
	 * @return <code>java.util.List</code> <code>vnfdMonitoringParam</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	List<VnfdMonitoringParam> getVnfdMonitoringParam();

	@Override
	MonitoringParamKey key();

}
