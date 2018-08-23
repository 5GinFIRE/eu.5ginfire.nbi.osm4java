package yang.project.nsd.rev170228;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import yang.project.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * grouping nsd-constituent-vnfd {
 *   list constituent-vnfd {
 *     key member-vnf-index;
 *     leaf member-vnf-index {
 *       type string;
 *     }
 *     leaf vnfd-id-ref {
 *       type leafref {
 *         path "/rw-project:project[rw-project:name = current()/../../../../rw-project:name]/project-vnfd:vnfd-catalog/project-vnfd:vnfd/project-vnfd:id";
 *       }
 *     }
 *     leaf start-by-default {
 *       type boolean;
 *       default true;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsd-constituent-vnfd</i>
 *
 */
public interface NsdConstituentVnfd
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("nsd-constituent-vnfd");

    /**
     * List of VNFDs that are part of thisnetwork service.
     *
     *
     *
     * @return <code>java.util.List</code> <code>constituentVnfd</code>, or <code>null</code> if not present
     */
    @Nullable
    List<ConstituentVnfd> getConstituentVnfd();

}

