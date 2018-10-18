package yang.vnfd.vnfd.descriptor;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import yang.vnfd.$YangModuleInfoImpl;
import yang.vnfd.CommonConnectionPoint;
import yang.vnfd.VnfdDescriptor;
import yang.vnfd.vnfd.descriptor.ConnectionPointBuilder.ConnectionPointImpl;

/**
 * List for external connection points. Each VNF has oneor more external 
 * points that connect the VNFto other VNFs or to external networks. Each VNF 
 * exposesconnection points to the orchestrator, which can constructnetwork 
 * services by connecting the connection pointsbetween different VNFs. The NFVO 
 * will use VLDs and VNFFGsat the network service level to construct network 
 * services.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list connection-point {
 *   key name;
 *   uses common-connection-point;
 *   leaf internal-vld-ref {
 *     type leafref {
 *       path ../../internal-vld/id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/connection-point</i>
 * 
 * <p>To create instances of this class use {@link ConnectionPointBuilder}.
 * @see ConnectionPointBuilder
 * @see ConnectionPointKey
 *
 */
@JsonDeserialize(as = ConnectionPointImpl.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public interface ConnectionPoint
    extends
    ChildOf<VnfdDescriptor>,
    Augmentable<ConnectionPoint>,
    CommonConnectionPoint,
    Identifiable<ConnectionPointKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("connection-point");

    /**
     * Reference to an internal VLD of the VNF. This field isoptional. It allows 
     * exposing an internal VLD through aconnection point. When building a NS, this VNF
     * CP might beconnected to a NS VLD, then both VLDs (the i-VLD of the VNF and 
     * theVLD of the NS) will become the same network and the IP profile willbe the one
     * configured at NS level.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>internalVldRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getInternalVldRef();
    
    @Override
    ConnectionPointKey key();

}

