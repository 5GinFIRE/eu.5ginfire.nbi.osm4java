package yang.project.nsd.rev170228.nsr.nsd.vnf.dependency;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import yang.project.nsd.rev170228.$YangModuleInfoImpl;
import yang.project.nsd.rev170228.NsrNsdVnfDependency;

/**
 * List of VNF dependencies.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module
 * <b>project-nsd</b>
 * 
 * <pre>
 * list vnf-dependency {
 *   key vnf-source-ref;
 *   leaf vnf-source-ref {
 *     type string;
 *   }
 *   leaf vnf-depends-on-ref {
 *     type string;
 *   }
 * }
 * </pre>
 * 
 * The schema path to identify an instance is
 * <i>project-nsd/nsr-nsd-vnf-dependency/vnf-dependency</i>
 * 
 * <p>
 * To create instances of this class use {@link VnfDependencyBuilder}.
 * 
 * @see VnfDependencyBuilder
 * @see VnfDependencyKey
 *
 */
public interface VnfDependency
		extends ChildOf<NsrNsdVnfDependency>, Augmentable<VnfDependency>, Identifiable<VnfDependencyKey> {

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnf-dependency");

	/**
	 * @return <code>java.lang.String</code> <code>vnfSourceRef</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	String getVnfSourceRef();

	/**
	 * Reference to VNF that sorce VNF depends.
	 *
	 *
	 *
	 * @return <code>java.lang.String</code> <code>vnfDependsOnRef</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	String getVnfDependsOnRef();

	@Override
	VnfDependencyKey key();

}
