package ns.yang.nfvo.vnfr.rev170228;

import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ns.yang.nfvo.vnfr.rev170228.project.VnfrCatalog;
import yang.rw.project.rev150910.Project;

public interface Project1 extends DataObject, Augmentation<Project> {

	/**
	 * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.project.VnfrCatalog</code>
	 *         <code>vnfrCatalog</code>, or <code>null</code> if not present
	 */
	@Nullable
	VnfrCatalog getVnfrCatalog();

}
