package ns.yang.nfvo.mano.types.rev170208;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.ip.profile.list.IpProfiles;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping ip-profile-list {
 *   list ip-profiles {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     leaf description {
 *       type string;
 *     }
 *     uses ip-profile-info;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/ip-profile-list</i>
 *
 */
public interface IpProfileList
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ip-profile-list");

    /**
     * List of IP Profiles. IP Profile describes the IP characteristics for the 
     * Virtual-Link
     *
     *
     *
     * @return <code>java.util.List</code> <code>ipProfiles</code>, or <code>null</code> if not present
     */
    @Nullable
    List<IpProfiles> getIpProfiles();

}

