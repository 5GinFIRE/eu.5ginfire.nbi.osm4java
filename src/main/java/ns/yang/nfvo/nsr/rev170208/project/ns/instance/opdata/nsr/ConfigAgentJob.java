package ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;

import ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue;
import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.nsr.rev170208.TriggerType;
import ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr;
import ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job.ParameterGroup;
import ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job.Vnfr;

import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Enumeration;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list config-agent-job {
 *   key job-id;
 *   leaf job-id {
 *     type uint64;
 *   }
 *   leaf job-name {
 *     type string;
 *   }
 *   leaf job-status {
 *     type enumeration {
 *       enum pending;
 *       enum success;
 *       enum failure;
 *     }
 *   }
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
 *   list vnfr {
 *     key id;
 *     leaf id {
 *       type yang:uuid;
 *     }
 *     leaf vnf-job-status {
 *       type enumeration {
 *         enum pending;
 *         enum success;
 *         enum failure;
 *       }
 *     }
 *     list primitive {
 *       key name;
 *       leaf name {
 *         type string;
 *       }
 *       uses manotypes:primitive-parameter-value;
 *       leaf execution-id {
 *         type string;
 *       }
 *       leaf execution-status {
 *         type enumeration {
 *           enum pending;
 *           enum success;
 *           enum failure;
 *         }
 *       }
 *       leaf execution-error-details {
 *         type string;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:ietf:params:xml:ns:yang:nfvo:nsr?revision=2017-02-08)ns-instance-opdata/nsr/config-agent-job</i>
 * 
 * <p>To create instances of this class use {@link ConfigAgentJobBuilder}.
 * @see ConfigAgentJobBuilder
 * @see ConfigAgentJobKey
 *
 */
public interface ConfigAgentJob
    extends
    ChildOf<Nsr>,
    Augmentable<ConfigAgentJob>,
    PrimitiveParameterValue,
    Identifiable<ConfigAgentJobKey>
{


    public enum JobStatus implements Enumeration {
        Pending(0, "pending"),
        
        Success(1, "success"),
        
        Failure(2, "failure")
        ;
    
        private static final Map<String, JobStatus> NAME_MAP;
        private static final Map<Integer, JobStatus> VALUE_MAP;
    
        static {
            final Builder<String, JobStatus> nb = ImmutableMap.builder();
            final Builder<Integer, JobStatus> vb = ImmutableMap.builder();
            for (JobStatus enumItem : JobStatus.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private JobStatus(int value, String name) {
            this.value = value;
            this.name = name;
        }
    
        @Override
        public String getName() {
            return name;
        }
    
        @Override
        public int getIntValue() {
            return value;
        }
    
        /**
         * Return the enumeration member whose {@link #getName()} matches specified value.
         *
         * @param name YANG assigned name
         * @return corresponding JobStatus item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<JobStatus> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding JobStatus item, or null if no such item exists
         */
        public static JobStatus forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("config-agent-job");

    /**
     * config agent job Identifier for the NS.
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>jobId</code>, or <code>null</code> if not present
     */
    @Nullable
    BigInteger getJobId();
    
    /**
     * Config agent job name
     *
     *
     *
     * @return <code>java.lang.String</code> <code>jobName</code>, or <code>null</code> if not present
     */
    @Nullable
    String getJobName();
    
    /**
     * Job status to be set based on each VNF primitive execution,pending - if at least
     * one VNF is in pending state and remaining VNFs are in success state.Success - if
     * all VNF executions are in success statefailure - if one of the VNF executions is
     * failure
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob.JobStatus</code> <code>jobStatus</code>, or <code>null</code> if not present
     */
    @Nullable
    JobStatus getJobStatus();
    
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
     * Creation timestamp of this Config Agent Job.The timestamp is expressed as 
     * secondssince unix epoch - 1970-01-01T00:00:00Z
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>createTime</code>, or <code>null</code> if not present
     */
    @Nullable
    Long getCreateTime();
    
    /**
     * Config agent job status details, in case of errors
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
     * @return <code>java.util.List</code> <code>vnfr</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Vnfr> getVnfr();
    
    @Override
    ConfigAgentJobKey key();

}

