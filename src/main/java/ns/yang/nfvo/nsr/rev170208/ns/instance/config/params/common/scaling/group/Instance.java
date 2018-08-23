package ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group;
import java.lang.Integer;
import java.lang.Override;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.ScalingGroup;

/**
 * The instance of the scaling group
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list instance {
 *   key id;
 *   leaf id {
 *     type uint16;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/ns-instance-config-params-common/scaling-group/instance</i>
 * 
 * <p>To create instances of this class use {@link InstanceBuilder}.
 * @see InstanceBuilder
 * @see InstanceKey
 *
 */
public interface Instance
    extends
    ChildOf<ScalingGroup>,
    Augmentable<Instance>,
    Identifiable<InstanceKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("instance");

    /**
     * Scaling group instance uuid
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable
    Integer getId();
    
    @Override
    InstanceKey key();

}

