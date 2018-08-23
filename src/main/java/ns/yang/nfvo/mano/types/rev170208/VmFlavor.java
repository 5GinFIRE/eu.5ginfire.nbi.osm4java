package ns.yang.nfvo.mano.types.rev170208;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping vm-flavor {
 *   container vm-flavor {
 *     leaf vcpu-count {
 *       type uint16;
 *     }
 *     leaf memory-mb {
 *       type uint64;
 *     }
 *     leaf storage-gb {
 *       type uint64;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vm-flavor</i>
 *
 */
public interface VmFlavor
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vm-flavor");

    /**
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vm.flavor.VmFlavor</code> <code>vmFlavor</code>, or <code>null</code> if not present
     */
    @Nullable
    ns.yang.nfvo.mano.types.rev170208.vm.flavor.VmFlavor getVmFlavor();

}

