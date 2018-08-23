package ns.yang.nfvo.mano.rift.groupings.norev;
import java.lang.Boolean;
import java.lang.Integer;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-rift-groupings</b>
 * <pre>
 * grouping volume-info-additions {
 *   leaf boot-volume {
 *     type boolean;
 *   }
 *   leaf boot-priority {
 *     type int32;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-rift-groupings/volume-info-additions</i>
 *
 */
public interface VolumeInfoAdditions
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("volume-info-additions");

    /**
     * This flag indicates if this is boot volume or not
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>bootVolume</code>, or <code>null</code> if not present
     */
    @Nullable
    Boolean isBootVolume();
    
    /**
     * Boot priority associated with volume
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>bootPriority</code>, or <code>null</code> if not present
     */
    @Nullable
    Integer getBootPriority();

}

