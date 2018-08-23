package ns.yang.nfvo.mano.types.rev170208.vca.configuration;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.VcaConfiguration;
import ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.primitive.Parameter;

/**
 * List of config primitives supported by theconfiguration agent for this VNF or 
 * VDU.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list config-primitive {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   list parameter {
 *     key name;
 *     uses primitive-parameter;
 *   }
 *   leaf user-defined-script {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/vca-configuration/config-primitive</i>
 * 
 * <p>To create instances of this class use {@link ConfigPrimitiveBuilder}.
 * @see ConfigPrimitiveBuilder
 * @see ConfigPrimitiveKey
 *
 */
public interface ConfigPrimitive
    extends
    ChildOf<VcaConfiguration>,
    Augmentable<ConfigPrimitive>,
    Identifiable<ConfigPrimitiveKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("config-primitive");

    /**
     * Name of the config primitive.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * List of parameters to the config primitive.
     *
     *
     *
     * @return <code>java.util.List</code> <code>parameter</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Parameter> getParameter();
    
    /**
     * A user defined script. If user defined script is defined,the script will be 
     * executed using bash
     *
     *
     *
     * @return <code>java.lang.String</code> <code>userDefinedScript</code>, or <code>null</code> if not present
     */
    @Nullable
    String getUserDefinedScript();
    
    @Override
    ConfigPrimitiveKey key();

}

