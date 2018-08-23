package ns.yang.nfvo.mano.types.rev170208.ip.profile.list;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.IpProfileInfo;
import ns.yang.nfvo.mano.types.rev170208.IpProfileList;

/**
 * List of IP Profiles. IP Profile describes the IP characteristics for the
 * Virtual-Link
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module
 * <b>mano-types</b>
 * 
 * <pre>
 * list ip-profiles {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   leaf description {
 *     type string;
 *   }
 *   uses ip-profile-info;
 * }
 * </pre>
 * 
 * The schema path to identify an instance is
 * <i>mano-types/ip-profile-list/ip-profiles</i>
 * 
 * <p>
 * To create instances of this class use {@link IpProfilesBuilder}.
 * 
 * @see IpProfilesBuilder
 * @see IpProfilesKey
 *
 */
public interface IpProfiles
		extends ChildOf<IpProfileList>, Augmentable<IpProfiles>, IpProfileInfo, Identifiable<IpProfilesKey> {

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ip-profiles");

	/**
	 * Name of the IP-Profile
	 *
	 *
	 *
	 * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code>
	 *         if not present
	 */
	@Nullable
	String getName();

	/**
	 * Description for IP profile
	 *
	 *
	 *
	 * @return <code>java.lang.String</code> <code>description</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	String getDescription();

	@Override
	IpProfilesKey key();

}
