package ns.yang.nfvo.nsr.rev170208;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ns.yang.nfvo.nsr.rev170208.project.NsInstanceOpdata;
import yang.rw.project.rev150910.Project;

public interface Project3
    extends
    DataObject,
    Augmentation<Project>
{




    /**
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceOpdata</code> <code>nsInstanceOpdata</code>, or <code>null</code> if not present
     */
    @Nullable
    NsInstanceOpdata getNsInstanceOpdata();

}

