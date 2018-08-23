package ns.yang.nfvo.mano.types.rev170208.vca.relationships;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships.Relation;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container vca-relationships {
 *   list relation {
 *     key "requires provides";
 *     leaf requires {
 *       type string;
 *     }
 *     leaf provides {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vca-relationships/vca-relationships</i>
 * 
 * <p>To create instances of this class use {@link VcaRelationshipsBuilder}.
 * @see VcaRelationshipsBuilder
 *
 */
public interface VcaRelationships
    extends
    ChildOf<ns.yang.nfvo.mano.types.rev170208.VcaRelationships>,
    Augmentable<VcaRelationships>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vca-relationships");

    /**
     * List of relations between VCA componets.
     *
     *
     *
     * @return <code>java.util.List</code> <code>relation</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Relation> getRelation();

}

