package ns.yang.nfvo.vnfd.rev170228;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataRoot;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd</b>
 * <pre>
 * module vnfd {
 *   namespace urn:ietf:params:xml:ns:yang:nfvo:vnfd;
 *   prefix vnfd;
 *   import vnfd-base {
 *     prefix vnfd-base;
 *   }
 *   revision 2017-02-28 {
 *   }
 *   revision 2015-09-10 {
 *   }
 *   container vnfd-catalog {
 *     leaf schema-version {
 *       type string;
 *       default v3.0;
 *     }
 *     list vnfd {
 *       key id;
 *       uses vnfd-base:vnfd-descriptor;
 *     }
 *   }
 * }
 * </pre>
 *
 */
public interface VnfdData
    extends
    DataRoot
{




    /**
     * Virtual Network Function Descriptor (VNFD).
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.vnfd.rev170228.VnfdCatalog</code> <code>vnfdCatalog</code>, or <code>null</code> if not present
     */
    @Nullable
    VnfdCatalog getVnfdCatalog();

}

