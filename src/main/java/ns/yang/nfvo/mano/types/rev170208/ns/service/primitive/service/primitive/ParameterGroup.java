package ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.ServicePrimitive;
import ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.parameter.group.Parameter;

/**
 * Grouping of parameters which are logically grouped in UI
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list parameter-group {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   list parameter {
 *     key name;
 *     uses manotypes:primitive-parameter;
 *   }
 *   leaf mandatory {
 *     type boolean;
 *     default true;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/ns-service-primitive/service-primitive/parameter-group</i>
 * 
 * <p>To create instances of this class use {@link ParameterGroupBuilder}.
 * @see ParameterGroupBuilder
 * @see ParameterGroupKey
 *
 */
public interface ParameterGroup
    extends
    ChildOf<ServicePrimitive>,
    Augmentable<ParameterGroup>,
    Identifiable<ParameterGroupKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("parameter-group");

    /**
     * Name of the parameter group
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * List of parameters for the service primitive.
     *
     *
     *
     * @return <code>java.util.List</code> <code>parameter</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Parameter> getParameter();
    
    /**
     * Is this parameter group mandatory
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>mandatory</code>, or <code>null</code> if not present
     */
    @Nullable
    Boolean isMandatory();
    
    @Override
    ParameterGroupKey key();

}

