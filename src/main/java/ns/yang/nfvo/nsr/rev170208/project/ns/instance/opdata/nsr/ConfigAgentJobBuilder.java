package ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Range;

import ns.yang.nfvo.mano.types.rev170208.primitive.parameter.value.Parameter;
import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.nsr.rev170208.TriggerType;
import ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job.ParameterGroup;
import ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job.Vnfr;

import java.lang.Class;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Class that builds {@link ConfigAgentJob} instances.
 * 
 * @see ConfigAgentJob
 *
 */
public class ConfigAgentJobBuilder implements Builder<ConfigAgentJob> {

    private Long _createTime;
    private BigInteger _jobId;
    private String _jobName;
    private ConfigAgentJob.JobStatus _jobStatus;
    private String _jobStatusDetails;
    private List<Parameter> _parameter;
    private List<ParameterGroup> _parameterGroup;
    private TriggerType _triggeredBy;
    private List<Vnfr> _vnfr;
    private ConfigAgentJobKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("config-agent-job");

    Map<Class<? extends Augmentation<ConfigAgentJob>>, Augmentation<ConfigAgentJob>> augmentation = Collections.emptyMap();

    public ConfigAgentJobBuilder() {
    }
    public ConfigAgentJobBuilder(ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue arg) {
        this._parameter = arg.getParameter();
    }

    public ConfigAgentJobBuilder(ConfigAgentJob base) {
        if (base.key() == null) {
            this.key = new ConfigAgentJobKey(
                base.getJobId()
            );
            this._jobId = base.getJobId();
        } else {
            this.key = base.key();
            this._jobId = key.getJobId();
        }
        this._createTime = base.getCreateTime();
        this._jobName = base.getJobName();
        this._jobStatus = base.getJobStatus();
        this._jobStatusDetails = base.getJobStatusDetails();
        this._parameter = base.getParameter();
        this._parameterGroup = base.getParameterGroup();
        this._triggeredBy = base.getTriggeredBy();
        this._vnfr = base.getVnfr();
        if (base instanceof ConfigAgentJobImpl) {
            ConfigAgentJobImpl impl = (ConfigAgentJobImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ConfigAgentJob> casted =(AugmentationHolder<ConfigAgentJob>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue) {
            this._parameter = ((ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue)arg).getParameter();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue]");
    }

    public ConfigAgentJobKey key() {
        return key;
    }
    
    public Long getCreateTime() {
        return _createTime;
    }
    
    public BigInteger getJobId() {
        return _jobId;
    }
    
    public String getJobName() {
        return _jobName;
    }
    
    public ConfigAgentJob.JobStatus getJobStatus() {
        return _jobStatus;
    }
    
    public String getJobStatusDetails() {
        return _jobStatusDetails;
    }
    
    public List<Parameter> getParameter() {
        return _parameter;
    }
    
    public List<ParameterGroup> getParameterGroup() {
        return _parameterGroup;
    }
    
    public TriggerType getTriggeredBy() {
        return _triggeredBy;
    }
    
    public List<Vnfr> getVnfr() {
        return _vnfr;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ConfigAgentJob>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public ConfigAgentJobBuilder withKey(final ConfigAgentJobKey key) {
        this.key = key;
        return this;
    }
    private static void checkCreateTimeRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public ConfigAgentJobBuilder setCreateTime(final Long value) {
    if (value != null) {
        checkCreateTimeRange(value);
        
    }
        this._createTime = value;
        return this;
    }
    private static final Range<java.math.BigInteger>[] CHECKJOBIDRANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
        CHECKJOBIDRANGE_RANGES = a;
    }
    private static void checkJobIdRange(final java.math.BigInteger value) {
        for (Range<java.math.BigInteger> r : CHECKJOBIDRANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKJOBIDRANGE_RANGES, value);
    }
    
    public ConfigAgentJobBuilder setJobId(final BigInteger value) {
    if (value != null) {
        checkJobIdRange(value);
        
    }
        this._jobId = value;
        return this;
    }
    
    public ConfigAgentJobBuilder setJobName(final String value) {
        this._jobName = value;
        return this;
    }
    
    public ConfigAgentJobBuilder setJobStatus(final ConfigAgentJob.JobStatus value) {
        this._jobStatus = value;
        return this;
    }
    
    public ConfigAgentJobBuilder setJobStatusDetails(final String value) {
        this._jobStatusDetails = value;
        return this;
    }
    public ConfigAgentJobBuilder setParameter(final List<Parameter> values) {
        this._parameter = values;
        return this;
    }
    
    public ConfigAgentJobBuilder setParameterGroup(final List<ParameterGroup> values) {
        this._parameterGroup = values;
        return this;
    }
    
    
    public ConfigAgentJobBuilder setTriggeredBy(final TriggerType value) {
        this._triggeredBy = value;
        return this;
    }
    public ConfigAgentJobBuilder setVnfr(final List<Vnfr> values) {
        this._vnfr = values;
        return this;
    }
    
    
    public ConfigAgentJobBuilder addAugmentation(Class<? extends Augmentation<ConfigAgentJob>> augmentationType, Augmentation<ConfigAgentJob> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ConfigAgentJobBuilder removeAugmentation(Class<? extends Augmentation<ConfigAgentJob>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ConfigAgentJob build() {
        return new ConfigAgentJobImpl(this);
    }

    private static final class ConfigAgentJobImpl implements ConfigAgentJob {

        @Override
        public Class<ConfigAgentJob> getImplementedInterface() {
            return ConfigAgentJob.class;
        }

        private final Long _createTime;
        private final BigInteger _jobId;
        private final String _jobName;
        private final ConfigAgentJob.JobStatus _jobStatus;
        private final String _jobStatusDetails;
        private final List<Parameter> _parameter;
        private final List<ParameterGroup> _parameterGroup;
        private final TriggerType _triggeredBy;
        private final List<Vnfr> _vnfr;
        private final ConfigAgentJobKey key;

        private Map<Class<? extends Augmentation<ConfigAgentJob>>, Augmentation<ConfigAgentJob>> augmentation = Collections.emptyMap();

        private ConfigAgentJobImpl(ConfigAgentJobBuilder base) {
            if (base.key() == null) {
                this.key = new ConfigAgentJobKey(
                    base.getJobId()
                );
                this._jobId = base.getJobId();
            } else {
                this.key = base.key();
                this._jobId = key.getJobId();
            }
            this._createTime = base.getCreateTime();
            this._jobName = base.getJobName();
            this._jobStatus = base.getJobStatus();
            this._jobStatusDetails = base.getJobStatusDetails();
            this._parameter = base.getParameter();
            this._parameterGroup = base.getParameterGroup();
            this._triggeredBy = base.getTriggeredBy();
            this._vnfr = base.getVnfr();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public ConfigAgentJobKey key() {
            return key;
        }
        
        @Override
        public Long getCreateTime() {
            return _createTime;
        }
        
        @Override
        public BigInteger getJobId() {
            return _jobId;
        }
        
        @Override
        public String getJobName() {
            return _jobName;
        }
        
        @Override
        public ConfigAgentJob.JobStatus getJobStatus() {
            return _jobStatus;
        }
        
        @Override
        public String getJobStatusDetails() {
            return _jobStatusDetails;
        }
        
        @Override
        public List<Parameter> getParameter() {
            return _parameter;
        }
        
        @Override
        public List<ParameterGroup> getParameterGroup() {
            return _parameterGroup;
        }
        
        @Override
        public TriggerType getTriggeredBy() {
            return _triggeredBy;
        }
        
        @Override
        public List<Vnfr> getVnfr() {
            return _vnfr;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ConfigAgentJob>> E augmentation(Class<E> augmentationType) {
            return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
        }

        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hashCode(_createTime);
            result = prime * result + Objects.hashCode(_jobId);
            result = prime * result + Objects.hashCode(_jobName);
            result = prime * result + Objects.hashCode(_jobStatus);
            result = prime * result + Objects.hashCode(_jobStatusDetails);
            result = prime * result + Objects.hashCode(_parameter);
            result = prime * result + Objects.hashCode(_parameterGroup);
            result = prime * result + Objects.hashCode(_triggeredBy);
            result = prime * result + Objects.hashCode(_vnfr);
            result = prime * result + Objects.hashCode(augmentation);
        
            hash = result;
            hashValid = true;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!ConfigAgentJob.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ConfigAgentJob other = (ConfigAgentJob)obj;
            if (!Objects.equals(_createTime, other.getCreateTime())) {
                return false;
            }
            if (!Objects.equals(_jobId, other.getJobId())) {
                return false;
            }
            if (!Objects.equals(_jobName, other.getJobName())) {
                return false;
            }
            if (!Objects.equals(_jobStatus, other.getJobStatus())) {
                return false;
            }
            if (!Objects.equals(_jobStatusDetails, other.getJobStatusDetails())) {
                return false;
            }
            if (!Objects.equals(_parameter, other.getParameter())) {
                return false;
            }
            if (!Objects.equals(_parameterGroup, other.getParameterGroup())) {
                return false;
            }
            if (!Objects.equals(_triggeredBy, other.getTriggeredBy())) {
                return false;
            }
            if (!Objects.equals(_vnfr, other.getVnfr())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ConfigAgentJobImpl otherImpl = (ConfigAgentJobImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ConfigAgentJob>>, Augmentation<ConfigAgentJob>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.augmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ConfigAgentJob");
            CodeHelpers.appendValue(helper, "_createTime", _createTime);
            CodeHelpers.appendValue(helper, "_jobId", _jobId);
            CodeHelpers.appendValue(helper, "_jobName", _jobName);
            CodeHelpers.appendValue(helper, "_jobStatus", _jobStatus);
            CodeHelpers.appendValue(helper, "_jobStatusDetails", _jobStatusDetails);
            CodeHelpers.appendValue(helper, "_parameter", _parameter);
            CodeHelpers.appendValue(helper, "_parameterGroup", _parameterGroup);
            CodeHelpers.appendValue(helper, "_triggeredBy", _triggeredBy);
            CodeHelpers.appendValue(helper, "_vnfr", _vnfr);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
