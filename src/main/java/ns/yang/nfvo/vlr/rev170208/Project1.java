package ns.yang.nfvo.vlr.rev170208;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ns.yang.nfvo.vlr.rev170208.project.VlrCatalog;
import yang.rw.project.rev150910.Project;

public interface Project1
    extends
    DataObject,
    Augmentation<Project>
{




    /**
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.vlr.rev170208.project.VlrCatalog</code> <code>vlrCatalog</code>, or <code>null</code> if not present
     */
    @Nullable
    VlrCatalog getVlrCatalog();

}

