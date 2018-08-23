package ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;

/**
 * List of xpaths to parameters inside the NSDthe can be customized during the 
 * instantiation.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list input-parameter-xpath {
 *   key xpath;
 *   leaf xpath {
 *     type string;
 *   }
 *   leaf label {
 *     type string;
 *   }
 *   leaf default-value {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/input-parameter-xpath/input-parameter-xpath</i>
 * 
 * <p>To create instances of this class use {@link InputParameterXpathBuilder}.
 * @see InputParameterXpathBuilder
 * @see InputParameterXpathKey
 *
 */
public interface InputParameterXpath
    extends
    ChildOf<ns.yang.nfvo.mano.types.rev170208.InputParameterXpath>,
    Augmentable<InputParameterXpath>,
    Identifiable<InputParameterXpathKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("input-parameter-xpath");

    /**
     * An xpath that specifies the element in a descriptor.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>xpath</code>, or <code>null</code> if not present
     */
    @Nullable
    String getXpath();
    
    /**
     * A descriptive string
     *
     *
     *
     * @return <code>java.lang.String</code> <code>label</code>, or <code>null</code> if not present
     */
    @Nullable
    String getLabel();
    
    /**
     * Default Value for the Input Parameter
     *
     *
     *
     * @return <code>java.lang.String</code> <code>defaultValue</code>, or <code>null</code> if not present
     */
    @Nullable
    String getDefaultValue();
    
    @Override
    InputParameterXpathKey key();

}

