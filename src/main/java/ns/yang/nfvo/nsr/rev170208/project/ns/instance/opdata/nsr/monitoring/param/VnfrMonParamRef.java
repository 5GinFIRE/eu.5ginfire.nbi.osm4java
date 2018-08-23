package ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.monitoring.param;

import java.lang.Object;
import java.lang.Override;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.ietf.yang.types.rev130715.Uuid;
import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.MonitoringParam;

/**
 * A list of VNFR monitoring params associated with this monp
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module
 * <b>nsr</b>
 * 
 * <pre>
 * list vnfr-mon-param-ref {
 *   key "vnfr-id-ref vnfr-mon-param-ref";
 *   leaf vnfr-id-ref {
 *     type yang:uuid;
 *   }
 *   leaf vnfr-mon-param-ref {
 *     type leafref {
 *       path "../../../../../vnfr:vnfr-catalog/vnfr:vnfr[vnfr:id = current()/../vnfr-id-ref]/vnfr:monitoring-param/vnfr:id";
 *     }
 *   }
 * }
 * </pre>
 * 
 * The schema path to identify an instance is
 * <i>nsr/project/(urn:ietf:params:xml:ns:yang:nfvo:nsr?revision=2017-02-08)ns-instance-opdata/nsr/monitoring-param/vnfr-mon-param-ref</i>
 * 
 * <p>
 * To create instances of this class use {@link VnfrMonParamRefBuilder}.
 * 
 * @see VnfrMonParamRefBuilder
 * @see VnfrMonParamRefKey
 *
 */
public interface VnfrMonParamRef
		extends ChildOf<MonitoringParam>, Augmentable<VnfrMonParamRef>, Identifiable<VnfrMonParamRefKey> {

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnfr-mon-param-ref");

	/**
	 * A reference to a vnfr. This is aleafref to path:
	 * /vnfr:vnfr-catalog/vnfr:vnfr/vnfr:id
	 *
	 *
	 *
	 * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code>
	 *         <code>vnfrIdRef</code>, or <code>null</code> if not present
	 */
	@Nullable
	Uuid getVnfrIdRef();

	/**
	 * A reference to the VNFR monitoring param
	 *
	 *
	 *
	 * @return <code>java.lang.Object</code> <code>vnfrMonParamRef</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	Object getVnfrMonParamRef();

	@Override
	VnfrMonParamRefKey key();

}
