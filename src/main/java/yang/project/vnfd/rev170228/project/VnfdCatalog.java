package yang.project.vnfd.rev170228.project;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import yang.project.vnfd.rev170228.$YangModuleInfoImpl;
import yang.project.vnfd.rev170228.Project1;
import yang.project.vnfd.rev170228.project.vnfd.catalog.Vnfd;

/**
 * Virtual Network Function Descriptor (VNFD).
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-vnfd</b>
 * <pre>
 * container vnfd-catalog {
 *   list vnfd {
 *     key id;
 *     uses vnfd-base:vnfd-descriptor;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-vnfd/project/(http://riftio.com/ns/riftware-1.0/project-vnfd?revision=2017-02-28)vnfd-catalog</i>
 * 
 * <p>To create instances of this class use {@link VnfdCatalogBuilder}.
 * @see VnfdCatalogBuilder
 *
 */
public interface VnfdCatalog
    extends
    ChildOf<Project1>,
    Augmentable<VnfdCatalog>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnfd-catalog");

    /**
     * @return <code>java.util.List</code> <code>vnfd</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Vnfd> getVnfd();

}

