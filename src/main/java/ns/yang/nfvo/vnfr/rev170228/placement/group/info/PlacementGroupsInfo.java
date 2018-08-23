package ns.yang.nfvo.vnfr.rev170228.placement.group.info;
import java.lang.Override;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.PlacementGroupInput;
import ns.yang.nfvo.vnfr.rev170228.$YangModuleInfoImpl;
import ns.yang.nfvo.vnfr.rev170228.PlacementGroupInfo;

/**
 * Placement groups to which this VDU belongs and itscloud construct
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * list placement-groups-info {
 *   key name;
 *   uses manotypes:placement-group-info;
 *   uses manotypes:placement-group-input;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/placement-group-info/placement-groups-info</i>
 * 
 * <p>To create instances of this class use {@link PlacementGroupsInfoBuilder}.
 * @see PlacementGroupsInfoBuilder
 * @see PlacementGroupsInfoKey
 *
 */
public interface PlacementGroupsInfo
    extends
    ChildOf<PlacementGroupInfo>,
    Augmentable<PlacementGroupsInfo>,
    ns.yang.nfvo.mano.types.rev170208.PlacementGroupInfo,
    PlacementGroupInput,
    Identifiable<PlacementGroupsInfoKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("placement-groups-info");

    @Override
    PlacementGroupsInfoKey key();

}

