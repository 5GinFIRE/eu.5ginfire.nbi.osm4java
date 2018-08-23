package ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source;
import java.lang.Boolean;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.volume.info.VolumeSource;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * case ephemeral {
 *   leaf ephemeral {
 *     type empty;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/volume-info/volume-source/ephemeral</i>
 *
 */
public interface Ephemeral
    extends
    DataObject,
    Augmentable<Ephemeral>,
    VolumeSource
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ephemeral");

    /**
     * @return <code>java.lang.Boolean</code> <code>ephemeral</code>, or <code>null</code> if not present
     */
    @Nullable
    Boolean isEphemeral();

}

