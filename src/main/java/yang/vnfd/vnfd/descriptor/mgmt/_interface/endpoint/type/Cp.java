package yang.vnfd.vnfd.descriptor.mgmt._interface.endpoint.type;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import yang.vnfd.$YangModuleInfoImpl;
import yang.vnfd.vnfd.descriptor.mgmt._interface.EndpointType;

/**
 * Use the ip address associated with this connection point. This cp is then 
 * considered as management.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * case cp {
 *   leaf cp {
 *     type leafref {
 *       path ../../../../connection-point/name;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/mgmt-interface/endpoint-type/cp</i>
 *
 */
public interface Cp
    extends
    DataObject,
    Augmentable<Cp>,
    EndpointType
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("cp");

    /**
     * @return <code>java.lang.String</code> <code>cp</code>, or <code>null</code> if not present
     */
    @Nullable
    String getCp();

}

