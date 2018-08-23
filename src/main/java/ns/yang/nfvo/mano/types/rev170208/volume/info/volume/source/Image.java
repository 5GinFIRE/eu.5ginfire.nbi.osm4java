package ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.ImageProperties;
import ns.yang.nfvo.mano.types.rev170208.volume.info.VolumeSource;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * case image {
 *   uses image-properties;
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/volume-info/volume-source/image</i>
 *
 */
public interface Image
    extends
    DataObject,
    Augmentable<Image>,
    ImageProperties,
    VolumeSource
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("image");


}

