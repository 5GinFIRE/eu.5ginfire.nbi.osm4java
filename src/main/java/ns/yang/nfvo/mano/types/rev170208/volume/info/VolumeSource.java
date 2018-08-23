package ns.yang.nfvo.mano.types.rev170208.volume.info;
import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.VolumeInfo;

/**
 * Defines the source of the volume. Possible options are1. Ephemeral -- Empty 
 * disk2. Image -- Refer to image to be used for volume3. Volume -- Reference of 
 * pre-existing volume to be used
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * choice volume-source {
 *   case ephemeral {
 *     leaf ephemeral {
 *       type empty;
 *     }
 *   }
 *   case image {
 *     uses image-properties;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/volume-info/volume-source</i>
 *
 */
public interface VolumeSource
    extends
    ChoiceIn<VolumeInfo>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("volume-source");


}

