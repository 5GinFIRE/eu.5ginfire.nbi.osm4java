package yang.project.nsd.rev170228.project;

import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import yang.project.nsd.rev170228.$YangModuleInfoImpl;
import yang.project.nsd.rev170228.Project1;
import yang.project.nsd.rev170228.project.nsd.catalog.Nsd;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module
 * <b>project-nsd</b>
 * 
 * <pre>
 * container nsd-catalog {
 *   list nsd {
 *     key id;
 *     uses nsd-descriptor;
 *   }
 * }
 * </pre>
 * 
 * The schema path to identify an instance is
 * <i>project-nsd/project/(http://riftio.com/ns/riftware-1.0/project-nsd?revision=2017-02-28)nsd-catalog</i>
 * 
 * <p>
 * To create instances of this class use {@link NsdCatalogBuilder}.
 * 
 * @see NsdCatalogBuilder
 *
 */
public interface NsdCatalog extends ChildOf<Project1>, Augmentable<NsdCatalog> {

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("nsd-catalog");

	/**
	 * @return <code>java.util.List</code> <code>nsd</code>, or <code>null</code> if
	 *         not present
	 */
	@Nullable
	List<Nsd> getNsd();

}
