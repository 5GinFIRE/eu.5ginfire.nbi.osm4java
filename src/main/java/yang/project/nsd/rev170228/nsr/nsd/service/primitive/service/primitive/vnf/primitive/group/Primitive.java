package yang.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.vnf.primitive.group;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import yang.project.nsd.rev170228.$YangModuleInfoImpl;
import yang.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.VnfPrimitiveGroup;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * list primitive {
 *   key index;
 *   leaf index {
 *     type uint32;
 *   }
 *   leaf name {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsr-nsd-service-primitive/service-primitive/vnf-primitive-group/primitive</i>
 * 
 * <p>To create instances of this class use {@link PrimitiveBuilder}.
 * @see PrimitiveBuilder
 * @see PrimitiveKey
 *
 */
public interface Primitive
    extends
    ChildOf<VnfPrimitiveGroup>,
    Augmentable<Primitive>,
    Identifiable<PrimitiveKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("primitive");

    /**
     * Index of this primitive
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>index</code>, or <code>null</code> if not present
     */
    @Nullable
    Long getIndex();
    
    /**
     * Name of the primitive in the VNF primitive 
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    @Override
    PrimitiveKey key();

}

