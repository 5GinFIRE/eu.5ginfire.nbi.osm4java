package yang.project.nsd.rev170228;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import yang.project.nsd.rev170228.nsr.nsd.vnf.dependency.VnfDependency;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * grouping nsr-nsd-vnf-dependency {
 *   list vnf-dependency {
 *     key vnf-source-ref;
 *     leaf vnf-source-ref {
 *       type string;
 *     }
 *     leaf vnf-depends-on-ref {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsr-nsd-vnf-dependency</i>
 *
 */
public interface NsrNsdVnfDependency
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("nsr-nsd-vnf-dependency");

    /**
     * List of VNF dependencies.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfDependency</code>, or <code>null</code> if not present
     */
    @Nullable
    List<VnfDependency> getVnfDependency();

}

