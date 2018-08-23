package ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesOutput;

/**
 * Automatically generated parameter
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list ns-parameter {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   leaf value {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/get-ns-service-primitive-values/output/ns-parameter</i>
 * 
 * <p>To create instances of this class use {@link NsParameterBuilder}.
 * @see NsParameterBuilder
 * @see NsParameterKey
 *
 */
public interface NsParameter
    extends
    ChildOf<GetNsServicePrimitiveValuesOutput>,
    Augmentable<NsParameter>,
    Identifiable<NsParameterKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ns-parameter");

    /**
     * Parameter name which should be pulled from a parameter pool
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * Automatically generated value
     *
     *
     *
     * @return <code>java.lang.String</code> <code>value</code>, or <code>null</code> if not present
     */
    @Nullable
    String getValue();
    
    @Override
    NsParameterKey key();

}

