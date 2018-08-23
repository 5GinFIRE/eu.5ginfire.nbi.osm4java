package ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParamsCommon;
import ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group.Instance;

/**
 * List of ns scaling group instances
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list scaling-group {
 *   key scaling-group-name-ref;
 *   leaf scaling-group-name-ref {
 *     type string;
 *   }
 *   list instance {
 *     key id;
 *     leaf id {
 *       type uint16;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/ns-instance-config-params-common/scaling-group</i>
 * 
 * <p>To create instances of this class use {@link ScalingGroupBuilder}.
 * @see ScalingGroupBuilder
 * @see ScalingGroupKey
 *
 */
public interface ScalingGroup
    extends
    ChildOf<NsInstanceConfigParamsCommon>,
    Augmentable<ScalingGroup>,
    Identifiable<ScalingGroupKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("scaling-group");

    /**
     * name of the scaling groupleafref path ../nsd/scaling-group-descriptor/name
     *
     *
     *
     * @return <code>java.lang.String</code> <code>scalingGroupNameRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getScalingGroupNameRef();
    
    /**
     * The instance of the scaling group
     *
     *
     *
     * @return <code>java.util.List</code> <code>instance</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Instance> getInstance();
    
    @Override
    ScalingGroupKey key();

}

