package yang.vnfd.vnfd.descriptor.monitoring.param.monitoring.type.vdu.metric;

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
 * This class represents the following YANG schema fragment defined in module
 * <b>vnfd-base</b>
 * 
 * <pre>
 * container vdu-metric {
 *   leaf vdu-ref {
 *     type leafref {
 *       path ../../../../../vdu/id;
 *     }
 *   }
 *   leaf vdu-metric-name-ref {
 *     type leafref {
 *       path "../../../../../vdu[id = current()/../vdu-ref]/vdu-configuration/metrics/name";
 *     }
 *   }
 * }
 * </pre>
 * 
 * The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/monitoring-param/monitoring-type/vdu-metric/vdu-metric</i>
 * 
 * <p>
 * To create instances of this class use {@link VduMetricBuilder}.
 * 
 * @see VduMetricBuilder
 *
 */
public interface VduMetric extends ChildOf<MonitoringParam>, Augmentable<VduMetric> {

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vdu-metric");

	/**
	 * @return <code>java.lang.String</code> <code>vduRef</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	String getVduRef();

	/**
	 * @return <code>java.lang.Object</code> <code>vduMetricNameRef</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	Object getVduMetricNameRef();

}
