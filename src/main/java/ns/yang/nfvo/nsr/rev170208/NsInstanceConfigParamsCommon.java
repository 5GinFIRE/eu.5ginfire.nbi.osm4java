package ns.yang.nfvo.nsr.rev170208;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.InputParameter;
import ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps;
import ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.ScalingGroup;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * grouping ns-instance-config-params-common {
 *   uses manotypes:input-parameter;
 *   list scaling-group {
 *     key scaling-group-name-ref;
 *     leaf scaling-group-name-ref {
 *       type string;
 *     }
 *     list instance {
 *       key id;
 *       leaf id {
 *         type uint16;
 *       }
 *     }
 *   }
 *   list nsd-placement-group-maps {
 *     key placement-group-ref;
 *     leaf placement-group-ref {
 *       type string;
 *     }
 *     uses manotypes:placement-group-input;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/ns-instance-config-params-common</i>
 *
 */
public interface NsInstanceConfigParamsCommon
    extends
    DataObject,
    InputParameter
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ns-instance-config-params-common");

    /**
     * List of ns scaling group instances
     *
     *
     *
     * @return <code>java.util.List</code> <code>scalingGroup</code>, or <code>null</code> if not present
     */
    @Nullable
    List<ScalingGroup> getScalingGroup();
    
    /**
     * Mapping from mano-placement groups construct from NSD to cloudplatform placement
     * group construct
     *
     *
     *
     * @return <code>java.util.List</code> <code>nsdPlacementGroupMaps</code>, or <code>null</code> if not present
     */
    @Nullable
    List<NsdPlacementGroupMaps> getNsdPlacementGroupMaps();

}

