package ns.yang.nfvo.mano.rift.groupings.norev;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-rift-groupings</b>
 * <pre>
 * grouping ssh-key-generated {
 *   container ssh-key-generated {
 *     leaf public-key {
 *       type string;
 *     }
 *     leaf private-key-file {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-rift-groupings/ssh-key-generated</i>
 *
 */
public interface SshKeyGenerated
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ssh-key-generated");

    /**
     * SSH key pair generated for this NS
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.ssh.key.generated.SshKeyGenerated</code> <code>sshKeyGenerated</code>, or <code>null</code> if not present
     */
    @Nullable
    ns.yang.nfvo.mano.rift.groupings.norev.ssh.key.generated.SshKeyGenerated getSshKeyGenerated();

}

