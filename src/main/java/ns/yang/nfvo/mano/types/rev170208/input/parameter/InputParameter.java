package ns.yang.nfvo.mano.types.rev170208.input.parameter;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;

/**
 * List of input parameters
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list input-parameter {
 *   key xpath;
 *   leaf xpath {
 *     type string;
 *   }
 *   leaf value {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/input-parameter/input-parameter</i>
 * 
 * <p>To create instances of this class use {@link InputParameterBuilder}.
 * @see InputParameterBuilder
 * @see InputParameterKey
 *
 */
public interface InputParameter
    extends
    ChildOf<ns.yang.nfvo.mano.types.rev170208.InputParameter>,
    Augmentable<InputParameter>,
    Identifiable<InputParameterKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("input-parameter");

    /**
     * An xpath that specfies which element in a descriptor is to bemodified.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>xpath</code>, or <code>null</code> if not present
     */
    @Nullable
    String getXpath();
    
    /**
     * The value that the element specified by the xpath should take when arecord is 
     * created.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>value</code>, or <code>null</code> if not present
     */
    @Nullable
    String getValue();
    
    @Override
    InputParameterKey key();

}

