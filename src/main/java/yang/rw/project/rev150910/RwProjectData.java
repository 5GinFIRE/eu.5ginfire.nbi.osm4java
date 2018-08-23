package yang.rw.project.rev150910;
import java.util.List;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataRoot;

/**
 * This yang module defines project-based tenancy for RIFT.ware.Authorization for 
 * project access is defined in terms of RIFT.ware'sRole-Based Access Control 
 * (RBAC) model.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>rw-project</b>
 * <pre>
 * module rw-project {
 *   namespace "http://riftio.com/ns/riftware-1.0/rw-project";
 *   prefix rw-project;
 *   revision 2015-09-10 {
 *   }
 *   list project {
 *     key name;
 *     leaf name {
 *       type string {
 *         length 1..255;
 *       }
 *     }
 *     leaf description {
 *       type string;
 *     }
 *   }
 * }
 * </pre>
 *
 */
public interface RwProjectData
    extends
    DataRoot
{




    /**
     * Configuration and state for individual projects. RIFT.wareapplications and 
     * projects are expected to augment this list inorder to add configuration for 
     * projects that is specific to theproduct or application. As such, this list 
     * contains minimaldata defined in this yang module.When augmenting this element, 
     * other yang modules should prefer todefine containers with the same name as the 
     * augmenting module.(Augmenting RIFT.ware modules should prefer to augment 
     * withoutthe rw prefix [for new features], or should prefer to augment 
     * theaugmented container of an existing augment, to ease futureadoption and/or 
     * standardization.)
     *
     *
     *
     * @return <code>java.util.List</code> <code>project</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Project> getProject();

}

