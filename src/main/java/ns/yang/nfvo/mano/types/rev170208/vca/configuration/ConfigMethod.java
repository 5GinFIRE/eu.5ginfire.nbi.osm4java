package ns.yang.nfvo.mano.types.rev170208.vca.configuration;
import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.VcaConfiguration;

/**
 * Defines the configuration method for the VNF or VDU.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * choice config-method {
 *   case script {
 *     container script {
 *       leaf script-type {
 *         type enumeration {
 *           enum rift;
 *         }
 *       }
 *     }
 *   }
 *   case juju {
 *     container juju {
 *       leaf charm {
 *         type string;
 *       }
 *       leaf proxy {
 *         type boolean;
 *         default true;
 *       }
 *       uses manotypes:vca-relationships;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vca-configuration/config-method</i>
 *
 */
public interface ConfigMethod
    extends
    ChoiceIn<VcaConfiguration>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("config-method");


}

