package yang.vnfd.vnfd.descriptor.internal.vld;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.ietf.inet.types.rev100924.IpAddress;
import yang.vnfd.$YangModuleInfoImpl;
import yang.vnfd.vnfd.descriptor.InternalVld;

/**
 * List of internal connection points in this VLD
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list internal-connection-point {
 *   key id-ref;
 *   leaf id-ref {
 *     type leafref {
 *       path ../../../vdu/internal-connection-point/id;
 *     }
 *   }
 *   leaf ip-address {
 *     type inet:ip-address;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/internal-vld/internal-connection-point</i>
 * 
 * <p>To create instances of this class use {@link InternalConnectionPointBuilder}.
 * @see InternalConnectionPointBuilder
 * @see InternalConnectionPointKey
 *
 */
public interface InternalConnectionPoint
    extends
    ChildOf<InternalVld>,
    Augmentable<InternalConnectionPoint>,
    Identifiable<InternalConnectionPointKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("internal-connection-point");

    /**
     * Reference to the internal connection point id
     *
     *
     *
     * @return <code>java.lang.String</code> <code>idRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getIdRef();
    
    /**
     * IP address of the internal connection point
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.IpAddress</code> <code>ipAddress</code>, or <code>null</code> if not present
     */
    @Nullable
    IpAddress getIpAddress();
    
    @Override
    InternalConnectionPointKey key();

}

