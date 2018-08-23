package ns.yang.nfvo.nsr.rev170208;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ns.yang.nfvo.nsr.rev170208.project.NsInstanceConfig;
import yang.rw.project.rev150910.Project;

public interface Project2
    extends
    DataObject,
    Augmentation<Project>
{




    /**
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.NsInstanceConfig</code> <code>nsInstanceConfig</code>, or <code>null</code> if not present
     */
    @Nullable
    NsInstanceConfig getNsInstanceConfig();

}

