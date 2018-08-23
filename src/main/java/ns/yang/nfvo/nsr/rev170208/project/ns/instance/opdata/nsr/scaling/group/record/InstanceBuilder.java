package ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.scaling.group.record;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.nsr.rev170208.ConfigStates;

import java.lang.Boolean;
import java.lang.Class;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
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
 * Class that builds {@link Instance} instances.
 * 
 * @see Instance
 *
 */
public class InstanceBuilder implements Builder<Instance> {

    private ConfigStates _configStatus;
    private Long _createTime;
    private String _errorMsg;
    private Integer _instanceId;
    private Instance.OpStatus _opStatus;
    private List<String> _vnfrs;
    private Boolean _isDefault;
    private InstanceKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("instance");

    Map<Class<? extends Augmentation<Instance>>, Augmentation<Instance>> augmentation = Collections.emptyMap();

    public InstanceBuilder() {
    }

    public InstanceBuilder(Instance base) {
        if (base.key() == null) {
            this.key = new InstanceKey(
                base.getInstanceId()
            );
            this._instanceId = base.getInstanceId();
        } else {
            this.key = base.key();
            this._instanceId = key.getInstanceId();
        }
        this._configStatus = base.getConfigStatus();
        this._createTime = base.getCreateTime();
        this._errorMsg = base.getErrorMsg();
        this._opStatus = base.getOpStatus();
        this._vnfrs = base.getVnfrs();
        this._isDefault = base.isIsDefault();
        if (base instanceof InstanceImpl) {
            InstanceImpl impl = (InstanceImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Instance> casted =(AugmentationHolder<Instance>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public InstanceKey key() {
        return key;
    }
    
    public ConfigStates getConfigStatus() {
        return _configStatus;
    }
    
    public Long getCreateTime() {
        return _createTime;
    }
    
    public String getErrorMsg() {
        return _errorMsg;
    }
    
    public Integer getInstanceId() {
        return _instanceId;
    }
    
    public Instance.OpStatus getOpStatus() {
        return _opStatus;
    }
    
    public List<String> getVnfrs() {
        return _vnfrs;
    }
    
    public Boolean isIsDefault() {
        return _isDefault;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Instance>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public InstanceBuilder withKey(final InstanceKey key) {
        this.key = key;
        return this;
    }
    
    public InstanceBuilder setConfigStatus(final ConfigStates value) {
        this._configStatus = value;
        return this;
    }
    private static void checkCreateTimeRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public InstanceBuilder setCreateTime(final Long value) {
    if (value != null) {
        checkCreateTimeRange(value);
        
    }
        this._createTime = value;
        return this;
    }
    
    public InstanceBuilder setErrorMsg(final String value) {
        this._errorMsg = value;
        return this;
    }
    private static void checkInstanceIdRange(final int value) {
        if (value >= 0 && value <= 65535) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..65535]]", value);
    }
    
    public InstanceBuilder setInstanceId(final Integer value) {
    if (value != null) {
        checkInstanceIdRange(value);
        
    }
        this._instanceId = value;
        return this;
    }
    
    public InstanceBuilder setOpStatus(final Instance.OpStatus value) {
        this._opStatus = value;
        return this;
    }
    public InstanceBuilder setVnfrs(final List<String> values) {
        this._vnfrs = values;
        return this;
    }
    
    
    public InstanceBuilder setIsDefault(final Boolean value) {
        this._isDefault = value;
        return this;
    }
    
    public InstanceBuilder addAugmentation(Class<? extends Augmentation<Instance>> augmentationType, Augmentation<Instance> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public InstanceBuilder removeAugmentation(Class<? extends Augmentation<Instance>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Instance build() {
        return new InstanceImpl(this);
    }

    private static final class InstanceImpl implements Instance {

        @Override
        public Class<Instance> getImplementedInterface() {
            return Instance.class;
        }

        private final ConfigStates _configStatus;
        private final Long _createTime;
        private final String _errorMsg;
        private final Integer _instanceId;
        private final Instance.OpStatus _opStatus;
        private final List<String> _vnfrs;
        private final Boolean _isDefault;
        private final InstanceKey key;

        private Map<Class<? extends Augmentation<Instance>>, Augmentation<Instance>> augmentation = Collections.emptyMap();

        private InstanceImpl(InstanceBuilder base) {
            if (base.key() == null) {
                this.key = new InstanceKey(
                    base.getInstanceId()
                );
                this._instanceId = base.getInstanceId();
            } else {
                this.key = base.key();
                this._instanceId = key.getInstanceId();
            }
            this._configStatus = base.getConfigStatus();
            this._createTime = base.getCreateTime();
            this._errorMsg = base.getErrorMsg();
            this._opStatus = base.getOpStatus();
            this._vnfrs = base.getVnfrs();
            this._isDefault = base.isIsDefault();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public InstanceKey key() {
            return key;
        }
        
        @Override
        public ConfigStates getConfigStatus() {
            return _configStatus;
        }
        
        @Override
        public Long getCreateTime() {
            return _createTime;
        }
        
        @Override
        public String getErrorMsg() {
            return _errorMsg;
        }
        
        @Override
        public Integer getInstanceId() {
            return _instanceId;
        }
        
        @Override
        public Instance.OpStatus getOpStatus() {
            return _opStatus;
        }
        
        @Override
        public List<String> getVnfrs() {
            return _vnfrs;
        }
        
        @Override
        public Boolean isIsDefault() {
            return _isDefault;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Instance>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_configStatus);
            result = prime * result + Objects.hashCode(_createTime);
            result = prime * result + Objects.hashCode(_errorMsg);
            result = prime * result + Objects.hashCode(_instanceId);
            result = prime * result + Objects.hashCode(_opStatus);
            result = prime * result + Objects.hashCode(_vnfrs);
            result = prime * result + Objects.hashCode(_isDefault);
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
            if (!Instance.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Instance other = (Instance)obj;
            if (!Objects.equals(_configStatus, other.getConfigStatus())) {
                return false;
            }
            if (!Objects.equals(_createTime, other.getCreateTime())) {
                return false;
            }
            if (!Objects.equals(_errorMsg, other.getErrorMsg())) {
                return false;
            }
            if (!Objects.equals(_instanceId, other.getInstanceId())) {
                return false;
            }
            if (!Objects.equals(_opStatus, other.getOpStatus())) {
                return false;
            }
            if (!Objects.equals(_vnfrs, other.getVnfrs())) {
                return false;
            }
            if (!Objects.equals(_isDefault, other.isIsDefault())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InstanceImpl otherImpl = (InstanceImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Instance>>, Augmentation<Instance>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Instance");
            CodeHelpers.appendValue(helper, "_configStatus", _configStatus);
            CodeHelpers.appendValue(helper, "_createTime", _createTime);
            CodeHelpers.appendValue(helper, "_errorMsg", _errorMsg);
            CodeHelpers.appendValue(helper, "_instanceId", _instanceId);
            CodeHelpers.appendValue(helper, "_opStatus", _opStatus);
            CodeHelpers.appendValue(helper, "_vnfrs", _vnfrs);
            CodeHelpers.appendValue(helper, "_isDefault", _isDefault);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
