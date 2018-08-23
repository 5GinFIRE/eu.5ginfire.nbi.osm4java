package ns.yang.nfvo.mano.types.rev170208.alarm;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.Alarm;
import ns.yang.nfvo.mano.types.rev170208.alarm.actions.InsufficientData;
import ns.yang.nfvo.mano.types.rev170208.alarm.actions.Ok;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container actions {
 *   list ok {
 *     key url;
 *     leaf url {
 *       type string;
 *     }
 *   }
 *   list insufficient-data {
 *     key url;
 *     leaf url {
 *       type string;
 *     }
 *   }
 *   list alarm {
 *     key url;
 *     leaf url {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/alarm/actions</i>
 * 
 * <p>To create instances of this class use {@link ActionsBuilder}.
 * @see ActionsBuilder
 *
 */
public interface Actions
    extends
    ChildOf<Alarm>,
    Augmentable<Actions>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("actions");

    /**
     * @return <code>java.util.List</code> <code>ok</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Ok> getOk();
    
    /**
     * @return <code>java.util.List</code> <code>insufficientData</code>, or <code>null</code> if not present
     */
    @Nullable
    List<InsufficientData> getInsufficientData();
    
    /**
     * @return <code>java.util.List</code> <code>alarm</code>, or <code>null</code> if not present
     */
    @Nullable
    List<ns.yang.nfvo.mano.types.rev170208.alarm.actions.Alarm> getAlarm();

}

