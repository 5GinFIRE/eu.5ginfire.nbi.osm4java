package ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider;
import java.lang.Boolean;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.placement.group.input.CloudProvider;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * case openmano {
 *   leaf openmano-construct {
 *     type empty;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/placement-group-input/cloud-provider/openmano</i>
 *
 */
public interface Openmano
    extends
    DataObject,
    Augmentable<Openmano>,
    CloudProvider
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("openmano");

    /**
     * @return <code>java.lang.Boolean</code> <code>openmanoConstruct</code>, or <code>null</code> if not present
     */
    @Nullable
    Boolean isOpenmanoConstruct();

}

