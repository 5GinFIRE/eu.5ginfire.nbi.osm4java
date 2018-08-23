package ns.yang.nfvo.mano.types.rev170208.vca.configuration;
import java.lang.Override;
import java.math.BigInteger;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.VcaConfiguration;
import ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.PrimitiveType;

/**
 * Initial set of configuration primitives.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list initial-config-primitive {
 *   key seq;
 *   leaf seq {
 *     type uint64;
 *   }
 *   choice primitive-type {
 *     case primitive-definition {
 *       leaf name {
 *         type string;
 *       }
 *       uses primitive-parameter-value;
 *       leaf user-defined-script {
 *         type string;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vca-configuration/initial-config-primitive</i>
 * 
 * <p>To create instances of this class use {@link InitialConfigPrimitiveBuilder}.
 * @see InitialConfigPrimitiveBuilder
 * @see InitialConfigPrimitiveKey
 *
 */
public interface InitialConfigPrimitive
    extends
    ChildOf<VcaConfiguration>,
    Augmentable<InitialConfigPrimitive>,
    Identifiable<InitialConfigPrimitiveKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("initial-config-primitive");

    /**
     * Sequence number for the configuration primitive.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>seq</code>, or <code>null</code> if not present
     */
    @Nullable
    BigInteger getSeq();
    
    /**
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.PrimitiveType</code> <code>primitiveType</code>, or <code>null</code> if not present
     */
    @Nullable
    PrimitiveType getPrimitiveType();
    
    @Override
    InitialConfigPrimitiveKey key();

}

