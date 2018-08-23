package ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.openstack;

import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.PlacementGroupInput;

/**
 * Name of the Availability Zone
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module
 * <b>mano-types</b>
 * 
 * <pre>
 * container availability-zone {
 *   leaf name {
 *     type string;
 *   }
 * }
 * </pre>
 * 
 * The schema path to identify an instance is
 * <i>mano-types/placement-group-input/cloud-provider/openstack/availability-zone</i>
 * 
 * <p>
 * To create instances of this class use {@link AvailabilityZoneBuilder}.
 * 
 * @see AvailabilityZoneBuilder
 *
 */
public interface AvailabilityZone extends ChildOf<PlacementGroupInput>, Augmentable<AvailabilityZone> {

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("availability-zone");

	/**
	 * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code>
	 *         if not present
	 */
	@Nullable
	String getName();

}
