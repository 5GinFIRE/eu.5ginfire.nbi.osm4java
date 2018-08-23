package ns.yang.ietf.l2.topology.rev150623.l2.link.attributes;
import java.lang.Class;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.ietf.l2.topology.rev150623.$YangModuleInfoImpl;
import ns.yang.ietf.l2.topology.rev150623.FlagIdentity;

/**
 * Containing L2 link attributes
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * container l2-link-attributes {
 *   leaf name {
 *     type string;
 *   }
 *   leaf-list flag {
 *     type flag-type;
 *   }
 *   leaf rate {
 *     type decimal64 {
 *       fraction-digits 2;
 *     }
 *   }
 *   leaf delay {
 *     type uint32;
 *   }
 *   leaf-list srlg {
 *     type uint32;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/l2-link-attributes/l2-link-attributes</i>
 * 
 * <p>To create instances of this class use {@link L2LinkAttributesBuilder}.
 * @see L2LinkAttributesBuilder
 *
 */
public interface L2LinkAttributes
    extends
    ChildOf<ns.yang.ietf.l2.topology.rev150623.L2LinkAttributes>,
    Augmentable<L2LinkAttributes>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("l2-link-attributes");

    /**
     * Link name
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * Link flags
     *
     *
     *
     * @return <code>java.util.List</code> <code>flag</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Class<? extends FlagIdentity>> getFlag();
    
    /**
     * Link rate
     *
     *
     *
     * @return <code>java.math.BigDecimal</code> <code>rate</code>, or <code>null</code> if not present
     */
    @Nullable
    BigDecimal getRate();
    
    /**
     * Link delay in microseconds
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>delay</code>, or <code>null</code> if not present
     */
    @Nullable
    Long getDelay();
    
    /**
     * List of Shared Risk Link Groupsthis link belongs to.
     *
     *
     *
     * @return <code>java.util.List</code> <code>srlg</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Long> getSrlg();

}

