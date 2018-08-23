package ns.yang.nfvo.vnfr.rev170228;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.vnfr.rev170228.associated.virtual.cps.VirtualCps;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * grouping associated-virtual-cps {
 *   list virtual-cps {
 *     key name;
 *     uses vnfd-base:common-connection-point;
 *     leaf ip-address {
 *       type inet:ip-address;
 *     }
 *     leaf mac-address {
 *       type string;
 *     }
 *     leaf connection-point-id {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/associated-virtual-cps</i>
 *
 */
public interface AssociatedVirtualCps
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("associated-virtual-cps");

    /**
     * @return <code>java.util.List</code> <code>virtualCps</code>, or <code>null</code> if not present
     */
    @Nullable
    List<VirtualCps> getVirtualCps();

}

