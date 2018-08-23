package ns.yang.nfvo.nsr.rev170208.cloud.config.user;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.nsr.rev170208.cloud.config.User;

/**
 * Used to configure the list of public keys to be injected as part of ns 
 * instantiation
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list ssh-authorized-key {
 *   key key-pair-ref;
 *   leaf key-pair-ref {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/cloud-config/user/ssh-authorized-key</i>
 * 
 * <p>To create instances of this class use {@link SshAuthorizedKeyBuilder}.
 * @see SshAuthorizedKeyBuilder
 * @see SshAuthorizedKeyKey
 *
 */
public interface SshAuthorizedKey
    extends
    ChildOf<User>,
    Augmentable<SshAuthorizedKey>,
    Identifiable<SshAuthorizedKeyKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ssh-authorized-key");

    /**
     * A reference to the key pair entry in the global key pair table
     *
     *
     *
     * @return <code>java.lang.String</code> <code>keyPairRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getKeyPairRef();
    
    @Override
    SshAuthorizedKeyKey key();

}

