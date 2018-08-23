package yang.vnfd.vnfd.descriptor.placement.groups;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import yang.vnfd.$YangModuleInfoImpl;
import yang.vnfd.vnfd.descriptor.PlacementGroups;

/**
 * List of VDUs that are part of this placement group
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list member-vdus {
 *   key member-vdu-ref;
 *   leaf member-vdu-ref {
 *     type leafref {
 *       path ../../../vdu/id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/placement-groups/member-vdus</i>
 * 
 * <p>To create instances of this class use {@link MemberVdusBuilder}.
 * @see MemberVdusBuilder
 * @see MemberVdusKey
 *
 */
public interface MemberVdus
    extends
    ChildOf<PlacementGroups>,
    Augmentable<MemberVdus>,
    Identifiable<MemberVdusKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("member-vdus");

    /**
     * @return <code>java.lang.String</code> <code>memberVduRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getMemberVduRef();
    
    @Override
    MemberVdusKey key();

}

