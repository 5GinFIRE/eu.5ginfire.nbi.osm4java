package ns.yang.nfvo.nsd.rev170228;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.nsd.rev170228.nsd.catalog.Nsd;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * container nsd-catalog {
 *   leaf schema-version {
 *     type string;
 *     default v3.0;
 *   }
 *   list nsd {
 *     key id;
 *     uses nsd-base:nsd-descriptor-common;
 *     uses nsd-vld;
 *     uses nsd-constituent-vnfd;
 *     uses nsd-placement-groups;
 *     uses nsd-vnf-dependency;
 *     uses nsd-monitoring-param;
 *     uses nsd-service-primitive;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd/nsd-catalog</i>
 * 
 * <p>To create instances of this class use {@link NsdCatalogBuilder}.
 * @see NsdCatalogBuilder
 *
 */
public interface NsdCatalog
    extends
    ChildOf<NsdData>,
    Augmentable<NsdCatalog>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("nsd-catalog");

    /**
     * Schema version for the NSD. If unspecified, it assumes v3.0
     *
     *
     *
     * @return <code>java.lang.String</code> <code>schemaVersion</code>, or <code>null</code> if not present
     */
    @Nullable
    String getSchemaVersion();
    
    /**
     * @return <code>java.util.List</code> <code>nsd</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Nsd> getNsd();

}

