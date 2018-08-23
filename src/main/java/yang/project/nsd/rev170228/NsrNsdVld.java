package yang.project.nsd.rev170228;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import yang.project.nsd.rev170228.nsr.nsd.vld.Vld;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * grouping nsr-nsd-vld {
 *   list vld {
 *     key id;
 *     uses nsd-base:nsd-vld-common;
 *     list vnfd-connection-point-ref {
 *       key "member-vnf-index-ref vnfd-connection-point-ref";
 *       leaf member-vnf-index-ref {
 *         type string;
 *       }
 *       leaf vnfd-id-ref {
 *         type string;
 *       }
 *       leaf vnfd-connection-point-ref {
 *         type leafref {
 *           path "../../../../../../project-vnfd:vnfd-catalog/project-vnfd:vnfd[project-vnfd:id = current()/../vnfd-id-ref]/project-vnfd:connection-point/project-vnfd:name";
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsr-nsd-vld</i>
 *
 */
public interface NsrNsdVld
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("nsr-nsd-vld");

    /**
     * @return <code>java.util.List</code> <code>vld</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Vld> getVld();

}

