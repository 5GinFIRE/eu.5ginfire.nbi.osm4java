package yang.vnfd.vnfd.descriptor;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import yang.vnfd.$YangModuleInfoImpl;
import yang.vnfd.VnfdDescriptor;

/**
 * List of VDU dependencies.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list vdu-dependency {
 *   key vdu-source-ref;
 *   leaf vdu-source-ref {
 *     type leafref {
 *       path ../../vdu/id;
 *     }
 *   }
 *   leaf vdu-depends-on-ref {
 *     type leafref {
 *       path ../../vdu/id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/vdu-dependency</i>
 * 
 * <p>To create instances of this class use {@link VduDependencyBuilder}.
 * @see VduDependencyBuilder
 * @see VduDependencyKey
 *
 */
public interface VduDependency
    extends
    ChildOf<VnfdDescriptor>,
    Augmentable<VduDependency>,
    Identifiable<VduDependencyKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vdu-dependency");

    /**
     * @return <code>java.lang.String</code> <code>vduSourceRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVduSourceRef();
    
    /**
     * Reference to the VDU on whichthe source VDU depends.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vduDependsOnRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVduDependsOnRef();
    
    @Override
    VduDependencyKey key();

}

