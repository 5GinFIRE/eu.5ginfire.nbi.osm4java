package ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.vca.configuration.ConfigMethod;

/**
 * Use custom script for configuring the VNF or VDU.This script is executed in the 
 * context ofOrchestrator (The same system and environmentas the Launchpad).
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * case script {
 *   container script {
 *     leaf script-type {
 *       type enumeration {
 *         enum rift;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vca-configuration/config-method/script</i>
 *
 */
public interface Script
    extends
    DataObject,
    Augmentable<Script>,
    ConfigMethod
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("script");

    /**
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.script.Script</code> <code>script</code>, or <code>null</code> if not present
     */
    @Nullable
    ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.script.Script getScript();

}

