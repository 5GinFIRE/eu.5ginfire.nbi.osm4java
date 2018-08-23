package yang.vnfd.vnfd.descriptor.mgmt._interface.endpoint.type;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import yang.vnfd.$YangModuleInfoImpl;
import yang.vnfd.vnfd.descriptor.mgmt._interface.EndpointType;

/**
 * Use the default management interface on this VDU.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * case vdu-id {
 *   leaf vdu-id {
 *     type leafref {
 *       path ../../../../vdu/id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/mgmt-interface/endpoint-type/vdu-id</i>
 *
 */
public interface VduId
    extends
    DataObject,
    Augmentable<VduId>,
    EndpointType
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vdu-id");

    /**
     * @return <code>java.lang.String</code> <code>vduId</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVduId();

}

