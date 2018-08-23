package yang.base.nsd.descriptor.common.scaling.group.descriptor;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.ScalingTrigger;
import yang.base.$YangModuleInfoImpl;
import yang.base.nsd.descriptor.common.ScalingGroupDescriptor;

/**
 * List of scaling config actions
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list scaling-config-action {
 *   key trigger;
 *   leaf trigger {
 *     type manotypes:scaling-trigger;
 *   }
 *   leaf ns-service-primitive-name-ref {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/scaling-group-descriptor/scaling-config-action</i>
 * 
 * <p>To create instances of this class use {@link ScalingConfigActionBuilder}.
 * @see ScalingConfigActionBuilder
 * @see ScalingConfigActionKey
 *
 */
public interface ScalingConfigAction
    extends
    ChildOf<ScalingGroupDescriptor>,
    Augmentable<ScalingConfigAction>,
    Identifiable<ScalingConfigActionKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("scaling-config-action");

    /**
     * scaling trigger
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ScalingTrigger</code> <code>trigger</code>, or <code>null</code> if not present
     */
    @Nullable
    ScalingTrigger getTrigger();
    
    /**
     * Reference to the NS service primitive
     *
     *
     *
     * @return <code>java.lang.String</code> <code>nsServicePrimitiveNameRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getNsServicePrimitiveNameRef();
    
    @Override
    ScalingConfigActionKey key();

}

