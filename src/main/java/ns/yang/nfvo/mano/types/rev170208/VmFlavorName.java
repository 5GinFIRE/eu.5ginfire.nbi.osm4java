package ns.yang.nfvo.mano.types.rev170208;
import java.lang.String;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping vm-flavor-name {
 *   leaf vm-flavor-name {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vm-flavor-name</i>
 *
 */
public interface VmFlavorName
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vm-flavor-name");

    /**
     * flavor name to be used while creating vm using cloud account
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vmFlavorName</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVmFlavorName();

}

