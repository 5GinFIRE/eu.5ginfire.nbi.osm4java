package ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;

import ns.yang.ietf.yang.types.rev130715.Uuid;
import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.ConfigAgentJob;
import ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job.vnfr.Primitive;

import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
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
 * list vnfr {
 *   key id;
 *   leaf id {
 *     type yang:uuid;
 *   }
 *   leaf vnf-job-status {
 *     type enumeration {
 *       enum pending;
 *       enum success;
 *       enum failure;
 *     }
 *   }
 *   list primitive {
 *     key name;
 *     leaf name {
 *       type string;
 *     }
 *     uses manotypes:primitive-parameter-value;
 *     leaf execution-id {
 *       type string;
 *     }
 *     leaf execution-status {
 *       type enumeration {
 *         enum pending;
 *         enum success;
 *         enum failure;
 *       }
 *     }
 *     leaf execution-error-details {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:ietf:params:xml:ns:yang:nfvo:nsr?revision=2017-02-08)ns-instance-opdata/nsr/config-agent-job/vnfr</i>
 * 
 * <p>To create instances of this class use {@link VnfrBuilder}.
 * @see VnfrBuilder
 * @see VnfrKey
 *
 */
public interface Vnfr
    extends
    ChildOf<ConfigAgentJob>,
    Augmentable<Vnfr>,
    Identifiable<VnfrKey>
{


    public enum VnfJobStatus implements Enumeration {
        Pending(0, "pending"),
        
        Success(1, "success"),
        
        Failure(2, "failure")
        ;
    
        private static final Map<String, VnfJobStatus> NAME_MAP;
        private static final Map<Integer, VnfJobStatus> VALUE_MAP;
    
        static {
            final Builder<String, VnfJobStatus> nb = ImmutableMap.builder();
            final Builder<Integer, VnfJobStatus> vb = ImmutableMap.builder();
            for (VnfJobStatus enumItem : VnfJobStatus.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private VnfJobStatus(int value, String name) {
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
         * @return corresponding VnfJobStatus item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<VnfJobStatus> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding VnfJobStatus item, or null if no such item exists
         */
        public static VnfJobStatus forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnfr");

    /**
     * Identifier for the VNFR.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable
    Uuid getId();
    
    /**
     * Job status to be set based on each VNF primitive execution,pending - if at least
     * one primitive is in pending state and remaining primitives are in success 
     * state.Success - if all primitive executions are in success statefailure - if one
     * of the primitive executions is failure
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job.Vnfr.VnfJobStatus</code> <code>vnfJobStatus</code>, or <code>null</code> if not present
     */
    @Nullable
    VnfJobStatus getVnfJobStatus();
    
    /**
     * @return <code>java.util.List</code> <code>primitive</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Primitive> getPrimitive();
    
    @Override
    VnfrKey key();

}

