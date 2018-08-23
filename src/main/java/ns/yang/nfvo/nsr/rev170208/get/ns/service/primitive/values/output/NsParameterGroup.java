package ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.nsr.rev170208.GetNsServicePrimitiveValuesOutput;
import ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.ns.parameter.group.Parameter;

/**
 * Automatically generated parameters in parameter group
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list ns-parameter-group {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   list parameter {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     leaf value {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/get-ns-service-primitive-values/output/ns-parameter-group</i>
 * 
 * <p>To create instances of this class use {@link NsParameterGroupBuilder}.
 * @see NsParameterGroupBuilder
 * @see NsParameterGroupKey
 *
 */
public interface NsParameterGroup
    extends
    ChildOf<GetNsServicePrimitiveValuesOutput>,
    Augmentable<NsParameterGroup>,
    Identifiable<NsParameterGroupKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ns-parameter-group");

    /**
     * Parameter group name
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * Automatically generated group parameter
     *
     *
     *
     * @return <code>java.util.List</code> <code>parameter</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Parameter> getParameter();
    
    @Override
    NsParameterGroupKey key();

}

