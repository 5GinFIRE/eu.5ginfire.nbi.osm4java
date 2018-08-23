package ns.yang.nfvo.vnfr.rev170228;

import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.vnfr.rev170228.placement.group.info.PlacementGroupsInfo;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module
 * <b>vnfr</b>
 * 
 * <pre>
 * grouping placement-group-info {
 *   list placement-groups-info {
 *     key name;
 *     uses manotypes:placement-group-info;
 *     uses manotypes:placement-group-input;
 *   }
 * }
 * </pre>
 * 
 * The schema path to identify an instance is <i>vnfr/placement-group-info</i>
 *
 */
public interface PlacementGroupInfo extends DataObject {

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("placement-group-info");

	/**
	 * Placement groups to which this VDU belongs and itscloud construct
	 *
	 *
	 *
	 * @return <code>java.util.List</code> <code>placementGroupsInfo</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	List<PlacementGroupsInfo> getPlacementGroupsInfo();

}
