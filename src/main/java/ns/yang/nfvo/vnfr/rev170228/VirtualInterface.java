package ns.yang.nfvo.vnfr.rev170228;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * grouping virtual-interface {
 *   container virtual-interface {
 *     leaf type {
 *       type enumeration {
 *         enum VIRTIO;
 *         enum PCI-PASSTHROUGH;
 *         enum SR-IOV;
 *       }
 *     }
 *     leaf bandwidth {
 *       type uint64;
 *     }
 *     leaf ovs-offload {
 *       type enumeration {
 *         enum MANDATORY;
 *         enum PREFERRED;
 *       }
 *     }
 *     leaf vendor-id {
 *       type string;
 *     }
 *     leaf datapath-library {
 *       type string;
 *     }
 *     leaf provider-network-name {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/virtual-interface</i>
 *
 */
public interface VirtualInterface
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("virtual-interface");

    /**
     * Container for the virtual interface properties
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.virtual._interface.VirtualInterface</code> <code>virtualInterface</code>, or <code>null</code> if not present
     */
    @Nullable
    ns.yang.nfvo.vnfr.rev170228.virtual._interface.VirtualInterface getVirtualInterface();

}

