package yang.project.nsd.rev170228.nsd.service.primitive.service.primitive;
import java.lang.Override;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.PrimitiveParameter;
import yang.project.nsd.rev170228.$YangModuleInfoImpl;
import yang.project.nsd.rev170228.nsd.service.primitive.ServicePrimitive;

/**
 * List of parameters for the service primitive.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * list parameter {
 *   key name;
 *   uses manotypes:primitive-parameter;
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsd-service-primitive/service-primitive/parameter</i>
 * 
 * <p>To create instances of this class use {@link ParameterBuilder}.
 * @see ParameterBuilder
 * @see ParameterKey
 *
 */
public interface Parameter
    extends
    ChildOf<ServicePrimitive>,
    Augmentable<Parameter>,
    PrimitiveParameter,
    Identifiable<ParameterKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("parameter");

    @Override
    ParameterKey key();

}

