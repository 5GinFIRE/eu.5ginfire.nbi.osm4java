package ns.yang.nfvo.vnffgd.rev170208;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ns.yang.nfvo.vnffgd.rev170208.project.VnffgdCatalog;
import yang.rw.project.rev150910.Project;

public interface Project1
    extends
    DataObject,
    Augmentation<Project>
{




    /**
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.vnffgd.rev170208.project.VnffgdCatalog</code> <code>vnffgdCatalog</code>, or <code>null</code> if not present
     */
    @Nullable
    VnffgdCatalog getVnffgdCatalog();

}

