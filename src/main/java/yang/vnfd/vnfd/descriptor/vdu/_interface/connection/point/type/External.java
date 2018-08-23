package yang.vnfd.vnfd.descriptor.vdu._interface.connection.point.type;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import yang.vnfd.$YangModuleInfoImpl;
import yang.vnfd.vnfd.descriptor.vdu.InterfaceBuilder.InterfaceImpl;
import yang.vnfd.vnfd.descriptor.vdu._interface.ConnectionPointType;
import yang.vnfd.vnfd.descriptor.vdu._interface.connection.point.type.ExternalBuilder.ExternalImpl;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * case external {
 *   leaf external-connection-point-ref {
 *     type leafref {
 *       path ../../../../../connection-point/name;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/vdu/interface/connection-point-type/external</i>
 *
 */
@JsonDeserialize(as = ExternalImpl.class)
public interface External
    extends
    DataObject,
    Augmentable<External>,
    ConnectionPointType
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("external");

    /**
     * Leaf Ref to the particular external connection point
     *
     *
     *
     * @return <code>java.lang.String</code> <code>externalConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getExternalConnectionPointRef();

}

