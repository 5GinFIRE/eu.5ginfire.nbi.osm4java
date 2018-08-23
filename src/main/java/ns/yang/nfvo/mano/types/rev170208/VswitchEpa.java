package ns.yang.nfvo.mano.types.rev170208;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping vswitch-epa {
 *   container vswitch-epa {
 *     leaf ovs-acceleration {
 *       type enumeration {
 *         enum MANDATORY;
 *         enum PREFERRED;
 *         enum DISABLED;
 *       }
 *     }
 *     leaf ovs-offload {
 *       type enumeration {
 *         enum MANDATORY;
 *         enum PREFERRED;
 *         enum DISABLED;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vswitch-epa</i>
 *
 */
public interface VswitchEpa
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vswitch-epa");

    /**
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa</code> <code>vswitchEpa</code>, or <code>null</code> if not present
     */
    @Nullable
    ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa getVswitchEpa();

}

