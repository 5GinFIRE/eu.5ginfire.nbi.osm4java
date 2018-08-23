package yang.vnfd.vnfd.descriptor.mgmt._interface.endpoint.type;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.ietf.inet.types.rev100924.IpAddress;
import yang.vnfd.$YangModuleInfoImpl;
import yang.vnfd.vnfd.descriptor.mgmt._interface.EndpointType;

/**
 * Specifies the static IP address for managing the VNF.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * case ip {
 *   leaf ip-address {
 *     type inet:ip-address;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/mgmt-interface/endpoint-type/ip</i>
 *
 */
public interface Ip
    extends
    DataObject,
    Augmentable<Ip>,
    EndpointType
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ip");

    /**
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.IpAddress</code> <code>ipAddress</code>, or <code>null</code> if not present
     */
    @Nullable
    IpAddress getIpAddress();

}

