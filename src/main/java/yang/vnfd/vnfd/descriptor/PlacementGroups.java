package yang.vnfd.vnfd.descriptor;
import java.lang.Override;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.PlacementGroupInfo;
import yang.vnfd.$YangModuleInfoImpl;
import yang.vnfd.VnfdDescriptor;
import yang.vnfd.vnfd.descriptor.placement.groups.MemberVdus;

/**
 * List of placement groups at VNF level
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list placement-groups {
 *   key name;
 *   uses manotypes:placement-group-info;
 *   list member-vdus {
 *     key member-vdu-ref;
 *     leaf member-vdu-ref {
 *       type leafref {
 *         path ../../../vdu/id;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/placement-groups</i>
 * 
 * <p>To create instances of this class use {@link PlacementGroupsBuilder}.
 * @see PlacementGroupsBuilder
 * @see PlacementGroupsKey
 *
 */
public interface PlacementGroups
    extends
    ChildOf<VnfdDescriptor>,
    Augmentable<PlacementGroups>,
    PlacementGroupInfo,
    Identifiable<PlacementGroupsKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("placement-groups");

    /**
     * List of VDUs that are part of this placement group
     *
     *
     *
     * @return <code>java.util.List</code> <code>memberVdus</code>, or <code>null</code> if not present
     */
    @Nullable
    List<MemberVdus> getMemberVdus();
    
    @Override
    PlacementGroupsKey key();

}

