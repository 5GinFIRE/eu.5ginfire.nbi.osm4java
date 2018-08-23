package ns.yang.nfvo.vnfd.rev170228;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.vnfd.rev170228.vnfd.catalog.Vnfd;

/**
 * Virtual Network Function Descriptor (VNFD).
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd</b>
 * <pre>
 * container vnfd-catalog {
 *   leaf schema-version {
 *     type string;
 *     default v3.0;
 *   }
 *   list vnfd {
 *     key id;
 *     uses vnfd-base:vnfd-descriptor;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd/vnfd-catalog</i>
 * 
 * <p>To create instances of this class use {@link VnfdCatalogBuilder}.
 * @see VnfdCatalogBuilder
 *
 */
public interface VnfdCatalog
    extends
    ChildOf<VnfdData>,
    Augmentable<VnfdCatalog>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnfd-catalog");

    /**
     * Schema version for the VNFD. If unspecified, it assumes v3.0
     *
     *
     *
     * @return <code>java.lang.String</code> <code>schemaVersion</code>, or <code>null</code> if not present
     */
    @Nullable
    String getSchemaVersion();
    
    /**
     * @return <code>java.util.List</code> <code>vnfd</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Vnfd> getVnfd();

}

