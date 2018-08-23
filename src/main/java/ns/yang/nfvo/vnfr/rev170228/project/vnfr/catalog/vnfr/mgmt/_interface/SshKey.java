package ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.mgmt._interface;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.vnfr.rev170228.$YangModuleInfoImpl;
import ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.MgmtInterface;

/**
 * SSH key pair used for this VNF
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * container ssh-key {
 *   leaf public-key {
 *     type string;
 *   }
 *   leaf private-key-file {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/project/(urn:ietf:params:xml:ns:yang:nfvo:vnfr?revision=2017-02-28)vnfr-catalog/vnfr/mgmt-interface/ssh-key</i>
 * 
 * <p>To create instances of this class use {@link SshKeyBuilder}.
 * @see SshKeyBuilder
 *
 */
public interface SshKey
    extends
    ChildOf<MgmtInterface>,
    Augmentable<SshKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ssh-key");

    /**
     * Public key configured on this VNF
     *
     *
     *
     * @return <code>java.lang.String</code> <code>publicKey</code>, or <code>null</code> if not present
     */
    @Nullable
    String getPublicKey();
    
    /**
     * Path to the private key file
     *
     *
     *
     * @return <code>java.lang.String</code> <code>privateKeyFile</code>, or <code>null</code> if not present
     */
    @Nullable
    String getPrivateKeyFile();

}

