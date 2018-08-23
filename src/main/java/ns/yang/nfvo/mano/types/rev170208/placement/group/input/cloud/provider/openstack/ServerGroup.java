package ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.openstack;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.PlacementGroupInput;

/**
 * Name of the Affinity/Anti-Affinity Server Group
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container server-group {
 *   leaf name {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/placement-group-input/cloud-provider/openstack/server-group</i>
 * 
 * <p>To create instances of this class use {@link ServerGroupBuilder}.
 * @see ServerGroupBuilder
 *
 */
public interface ServerGroup
    extends
    ChildOf<PlacementGroupInput>,
    Augmentable<ServerGroup>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("server-group");

    /**
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();

}

