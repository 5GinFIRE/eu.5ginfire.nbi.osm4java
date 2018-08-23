package yang.vnfd.vnfd.descriptor.vdu;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import yang.vnfd.$YangModuleInfoImpl;
import yang.vnfd.CommonConnectionPoint;
import yang.vnfd.vnfd.descriptor.Vdu;

/**
 * List for internal connection points. Each VNFChas zero or more internal 
 * connection points.Internal connection points are used for connectingthe VNF 
 * components internal to the VNF. If a VNFhas only one VNFC, it may not have any 
 * internalconnection points.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list internal-connection-point {
 *   key id;
 *   uses common-connection-point;
 *   leaf internal-vld-ref {
 *     type leafref {
 *       path ../../../internal-vld/id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/vdu/internal-connection-point</i>
 * 
 * <p>To create instances of this class use {@link InternalConnectionPointBuilder}.
 * @see InternalConnectionPointBuilder
 * @see InternalConnectionPointKey
 *
 */
public interface InternalConnectionPoint
    extends
    ChildOf<Vdu>,
    Augmentable<InternalConnectionPoint>,
    CommonConnectionPoint,
    Identifiable<InternalConnectionPointKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("internal-connection-point");

    /**
     * @return <code>java.lang.String</code> <code>internalVldRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getInternalVldRef();
    
    @Override
    InternalConnectionPointKey key();

}

