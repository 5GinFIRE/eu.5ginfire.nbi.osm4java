package ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type;
import java.lang.Class;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.ietf.l2.topology.rev150623.$YangModuleInfoImpl;
import ns.yang.ietf.l2.topology.rev150623.EncapsulationType;
import ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.L2TerminationPointType;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * case legacy {
 *   leaf encapsulation {
 *     type identityref {
 *       base encapsulation-type;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/l2-termination-point-attributes/l2-termination-point-attributes/l2-termination-point-type/legacy</i>
 *
 */
public interface Legacy
    extends
    DataObject,
    Augmentable<Legacy>,
    L2TerminationPointType
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("legacy");

    /**
     * Encapsulation type of this termination point.
     *
     *
     *
     * @return <code>java.lang.Class</code> <code>encapsulation</code>, or <code>null</code> if not present
     */
    @Nullable
    Class<? extends EncapsulationType> getEncapsulation();

}

