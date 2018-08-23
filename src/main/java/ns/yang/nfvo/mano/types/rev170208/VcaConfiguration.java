package ns.yang.nfvo.mano.types.rev170208;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.vca.configuration.ConfigMethod;
import ns.yang.nfvo.mano.types.rev170208.vca.configuration.ConfigPrimitive;
import ns.yang.nfvo.mano.types.rev170208.vca.configuration.InitialConfigPrimitive;

/**
 * Information about the VNF or VDU configuration. Note:If the NS contains 
 * instances of thesame VNF or VDU, each instance could have a 
 * differentconfiguration.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping vca-configuration {
 *   choice config-method {
 *     case script {
 *       container script {
 *         leaf script-type {
 *           type enumeration {
 *             enum rift;
 *           }
 *         }
 *       }
 *     }
 *     case juju {
 *       container juju {
 *         leaf charm {
 *           type string;
 *         }
 *         leaf proxy {
 *           type boolean;
 *           default true;
 *         }
 *         uses manotypes:vca-relationships;
 *       }
 *     }
 *   }
 *   list config-primitive {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     list parameter {
 *       key name;
 *       uses primitive-parameter;
 *     }
 *     leaf user-defined-script {
 *       type string;
 *     }
 *   }
 *   list initial-config-primitive {
 *     key seq;
 *     leaf seq {
 *       type uint64;
 *     }
 *     choice primitive-type {
 *       case primitive-definition {
 *         leaf name {
 *           type string;
 *         }
 *         uses primitive-parameter-value;
 *         leaf user-defined-script {
 *           type string;
 *         }
 *       }
 *     }
 *   }
 *   uses manotypes:vca-metrics;
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vca-configuration</i>
 *
 */
public interface VcaConfiguration
    extends
    DataObject,
    VcaMetrics
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vca-configuration");

    /**
     * Defines the configuration method for the VNF or VDU.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.ConfigMethod</code> <code>configMethod</code>, or <code>null</code> if not present
     */
    @Nullable
    ConfigMethod getConfigMethod();
    
    /**
     * List of config primitives supported by theconfiguration agent for this VNF or 
     * VDU.
     *
     *
     *
     * @return <code>java.util.List</code> <code>configPrimitive</code>, or <code>null</code> if not present
     */
    @Nullable
    List<ConfigPrimitive> getConfigPrimitive();
    
    /**
     * Initial set of configuration primitives.
     *
     *
     *
     * @return <code>java.util.List</code> <code>initialConfigPrimitive</code>, or <code>null</code> if not present
     */
    @Nullable
    List<InitialConfigPrimitive> getInitialConfigPrimitive();

}

