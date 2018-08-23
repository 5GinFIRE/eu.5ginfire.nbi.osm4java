package ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.vnf.out.list;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue;
import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.VnfOutList;

/**
 * List of service primitives supported by theconfiguration agent for this VNF.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list vnf-out-primitive {
 *   key index;
 *   leaf index {
 *     type uint32;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   uses manotypes:primitive-parameter-value;
 *   leaf execution-id {
 *     type string;
 *   }
 *   leaf execution-status {
 *     type string;
 *   }
 *   leaf execution-error-details {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/exec-ns-service-primitive/output/vnf-out-list/vnf-out-primitive</i>
 * 
 * <p>To create instances of this class use {@link VnfOutPrimitiveBuilder}.
 * @see VnfOutPrimitiveBuilder
 * @see VnfOutPrimitiveKey
 *
 */
public interface VnfOutPrimitive
    extends
    ChildOf<VnfOutList>,
    Augmentable<VnfOutPrimitive>,
    PrimitiveParameterValue,
    Identifiable<VnfOutPrimitiveKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnf-out-primitive");

    /**
     * index of the service primitive.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>index</code>, or <code>null</code> if not present
     */
    @Nullable
    Long getIndex();
    
    /**
     * Name of the service primitive.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * Execution id of this primitive
     *
     *
     *
     * @return <code>java.lang.String</code> <code>executionId</code>, or <code>null</code> if not present
     */
    @Nullable
    String getExecutionId();
    
    /**
     * Status of the execution of this primitive
     *
     *
     *
     * @return <code>java.lang.String</code> <code>executionStatus</code>, or <code>null</code> if not present
     */
    @Nullable
    String getExecutionStatus();
    
    /**
     * Error details if execution-status is failed
     *
     *
     *
     * @return <code>java.lang.String</code> <code>executionErrorDetails</code>, or <code>null</code> if not present
     */
    @Nullable
    String getExecutionErrorDetails();
    
    @Override
    VnfOutPrimitiveKey key();

}

