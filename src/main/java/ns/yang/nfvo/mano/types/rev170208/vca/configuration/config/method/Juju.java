package ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.vca.configuration.ConfigMethod;

/**
 * Configure the VNF or VDU through Juju.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * case juju {
 *   container juju {
 *     leaf charm {
 *       type string;
 *     }
 *     leaf proxy {
 *       type boolean;
 *       default true;
 *     }
 *     uses manotypes:vca-relationships;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vca-configuration/config-method/juju</i>
 *
 */
public interface Juju
    extends
    DataObject,
    Augmentable<Juju>,
    ConfigMethod
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("juju");

    /**
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.juju.Juju</code> <code>juju</code>, or <code>null</code> if not present
     */
    @Nullable
    ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.juju.Juju getJuju();

}

