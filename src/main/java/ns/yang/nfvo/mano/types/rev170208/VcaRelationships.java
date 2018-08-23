package ns.yang.nfvo.mano.types.rev170208;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping vca-relationships {
 *   container vca-relationships {
 *     list relation {
 *       key "requires provides";
 *       leaf requires {
 *         type string;
 *       }
 *       leaf provides {
 *         type string;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vca-relationships</i>
 *
 */
public interface VcaRelationships
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vca-relationships");

    /**
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.relationships.VcaRelationships</code> <code>vcaRelationships</code>, or <code>null</code> if not present
     */
    @Nullable
    ns.yang.nfvo.mano.types.rev170208.vca.relationships.VcaRelationships getVcaRelationships();

}

