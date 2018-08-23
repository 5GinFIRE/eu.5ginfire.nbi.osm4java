package ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr;
import java.lang.Object;
import java.lang.Override;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr;
import ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record.Instance;

/**
 * List of scaling group records
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list scaling-group-record {
 *   key scaling-group-name-ref;
 *   leaf scaling-group-name-ref {
 *     type leafref {
 *       path ../../../../ns-instance-config/nsr[id=current()/../../ns-instance-config-ref]/nsd/scaling-group-descriptor/name;
 *     }
 *   }
 *   list instance {
 *     key instance-id;
 *     leaf instance-id {
 *       type uint16;
 *     }
 *     leaf is-default {
 *       type boolean;
 *     }
 *     leaf op-status {
 *       type enumeration {
 *         enum init;
 *         enum vnf-init-phase;
 *         enum running;
 *         enum terminate;
 *         enum vnf-terminate-phase;
 *         enum terminated;
 *         enum failed;
 *       }
 *     }
 *     leaf config-status {
 *       type config-states;
 *     }
 *     leaf error-msg {
 *       type string;
 *     }
 *     leaf create-time {
 *       type uint32;
 *     }
 *     leaf-list vnfrs {
 *       type leafref {
 *         path ../../../constituent-vnfr-ref/vnfr-id;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:ietf:params:xml:ns:yang:nfvo:nsr?revision=2017-02-08)ns-instance-opdata/nsr/scaling-group-record</i>
 * 
 * <p>To create instances of this class use {@link ScalingGroupRecordBuilder}.
 * @see ScalingGroupRecordBuilder
 * @see ScalingGroupRecordKey
 *
 */
public interface ScalingGroupRecord
    extends
    ChildOf<Nsr>,
    Augmentable<ScalingGroupRecord>,
    Identifiable<ScalingGroupRecordKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("scaling-group-record");

    /**
     * name of the scaling group
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>scalingGroupNameRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getScalingGroupNameRef();
    
    /**
     * Reference to scaling group instance record
     *
     *
     *
     * @return <code>java.util.List</code> <code>instance</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Instance> getInstance();
    
    @Override
    ScalingGroupRecordKey key();

}

