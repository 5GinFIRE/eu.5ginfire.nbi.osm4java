package ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.ietf.yang.types.rev130715.Uuid;
import ns.yang.nfvo.vnfr.rev170228.$YangModuleInfoImpl;
import ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * list internal-vlr {
 *   key vlr-ref;
 *   leaf vlr-ref {
 *     type leafref {
 *       path ../../../../vlr:vlr-catalog/vlr:vlr/vlr:id;
 *     }
 *   }
 *   leaf-list internal-connection-point-ref {
 *     type leafref {
 *       path ../../vdur/internal-connection-point/id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/project/(urn:ietf:params:xml:ns:yang:nfvo:vnfr?revision=2017-02-28)vnfr-catalog/vnfr/internal-vlr</i>
 * 
 * <p>To create instances of this class use {@link InternalVlrBuilder}.
 * @see InternalVlrBuilder
 * @see InternalVlrKey
 *
 */
public interface InternalVlr
    extends
    ChildOf<Vnfr>,
    Augmentable<InternalVlr>,
    Identifiable<InternalVlrKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("internal-vlr");

    /**
     * Reference to a VLR record in the VLR catalog
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>vlrRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Uuid getVlrRef();
    
    /**
     * @return <code>java.util.List</code> <code>internalConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable
    List<String> getInternalConnectionPointRef();
    
    @Override
    InternalVlrKey key();

}

