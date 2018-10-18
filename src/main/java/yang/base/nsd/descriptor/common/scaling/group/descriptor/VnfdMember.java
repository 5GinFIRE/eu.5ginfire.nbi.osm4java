package yang.base.nsd.descriptor.common.scaling.group.descriptor;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import yang.base.$YangModuleInfoImpl;
import yang.base.nsd.descriptor.common.ScalingGroupDescriptor;
import yang.base.nsd.descriptor.common.scaling.group.descriptor.VnfdMemberBuilder.VnfdMemberImpl;

/**
 * List of VNFs in this scaling group
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list vnfd-member {
 *   key member-vnf-index-ref;
 *   leaf member-vnf-index-ref {
 *     type string;
 *   }
 *   leaf count {
 *     type uint32;
 *     default 1;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/scaling-group-descriptor/vnfd-member</i>
 * 
 * <p>To create instances of this class use {@link VnfdMemberBuilder}.
 * @see VnfdMemberBuilder
 * @see VnfdMemberKey
 *
 */
@JsonDeserialize(as = VnfdMemberImpl.class)
@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonIgnoreProperties( {} )
public interface VnfdMember
    extends
    ChildOf<ScalingGroupDescriptor>,
    Augmentable<VnfdMember>,
    Identifiable<VnfdMemberKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnfd-member");

    /**
     * member VNF index of this member VNF
     *
     *
     *
     * @return <code>java.lang.String</code> <code>memberVnfIndexRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getMemberVnfIndexRef();
    
    /**
     * count of this member VNF within this scaling group.The count allows to define 
     * the number of instanceswhen a scaling action targets this scaling group
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>count</code>, or <code>null</code> if not present
     */
    @Nullable
    Long getCount();
    
    @Override
    VnfdMemberKey key();

}

