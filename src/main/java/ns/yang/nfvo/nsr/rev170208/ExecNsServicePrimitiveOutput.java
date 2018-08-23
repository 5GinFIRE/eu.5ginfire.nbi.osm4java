package ns.yang.nfvo.nsr.rev170208;
import java.lang.Long;
import java.lang.String;
import java.math.BigInteger;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.RpcOutput;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue;
import ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.ParameterGroup;
import ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.VnfOutList;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * output {
 *   leaf job-id {
 *     type uint64;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   uses rpc-common;
 *   leaf triggered-by {
 *     type trigger-type;
 *   }
 *   leaf create-time {
 *     type uint32;
 *   }
 *   leaf job-status-details {
 *     type string;
 *   }
 *   uses manotypes:primitive-parameter-value;
 *   list parameter-group {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     uses manotypes:primitive-parameter-value;
 *   }
 *   list vnf-out-list {
 *     key member_vnf_index_ref;
 *     leaf member_vnf_index_ref {
 *       type uint64;
 *     }
 *     leaf vnfr-id-ref {
 *       type yang:uuid;
 *     }
 *     list vnf-out-primitive {
 *       key index;
 *       leaf index {
 *         type uint32;
 *       }
 *       leaf name {
 *         type string;
 *       }
 *       uses manotypes:primitive-parameter-value;
 *       leaf execution-id {
 *         type string;
 *       }
 *       leaf execution-status {
 *         type string;
 *       }
 *       leaf execution-error-details {
 *         type string;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/exec-ns-service-primitive/output</i>
 * 
 * <p>To create instances of this class use {@link ExecNsServicePrimitiveOutputBuilder}.
 * @see ExecNsServicePrimitiveOutputBuilder
 *
 */
public interface ExecNsServicePrimitiveOutput
    extends
    PrimitiveParameterValue,
    RpcCommon,
    RpcOutput,
    Augmentable<ExecNsServicePrimitiveOutput>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("output");

    /**
     * Job identifier for this RPC
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>jobId</code>, or <code>null</code> if not present
     */
    @Nullable
    BigInteger getJobId();
    
    /**
     * Name of the service primitive
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * The primitive is triggered from NS or VNF level
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.TriggerType</code> <code>triggeredBy</code>, or <code>null</code> if not present
     */
    @Nullable
    TriggerType getTriggeredBy();
    
    /**
     * Creation timestamp of this config agent JOB.The timestamp is expressed as 
     * secondssince unix epoch - 1970-01-01T00:00:00Z
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>createTime</code>, or <code>null</code> if not present
     */
    @Nullable
    Long getCreateTime();
    
    /**
     * Job status details, in case of any errors
     *
     *
     *
     * @return <code>java.lang.String</code> <code>jobStatusDetails</code>, or <code>null</code> if not present
     */
    @Nullable
    String getJobStatusDetails();
    
    /**
     * List of NS Primitive parameter groups
     *
     *
     *
     * @return <code>java.util.List</code> <code>parameterGroup</code>, or <code>null</code> if not present
     */
    @Nullable
    List<ParameterGroup> getParameterGroup();
    
    /**
     * List of VNFs whose primitives were set.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfOutList</code>, or <code>null</code> if not present
     */
    @Nullable
    List<VnfOutList> getVnfOutList();

}

