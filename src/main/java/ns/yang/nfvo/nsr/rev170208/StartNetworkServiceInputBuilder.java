package ns.yang.nfvo.nsr.rev170208;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.input.parameter.InputParameter;
import ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps;
import ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.ScalingGroup;
import ns.yang.nfvo.nsr.rev170208.start.network.service.input.VnfdPlacementGroupMaps;

import java.lang.Class;
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
 * Class that builds {@link StartNetworkServiceInput} instances.
 * 
 * @see StartNetworkServiceInput
 *
 */
public class StartNetworkServiceInputBuilder implements Builder<StartNetworkServiceInput> {

    private List<InputParameter> _inputParameter;
    private String _name;
    private Object _nsdIdRef;
    private List<NsdPlacementGroupMaps> _nsdPlacementGroupMaps;
    private String _projectName;
    private List<ScalingGroup> _scalingGroup;
    private List<VnfdPlacementGroupMaps> _vnfdPlacementGroupMaps;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("input");

    Map<Class<? extends Augmentation<StartNetworkServiceInput>>, Augmentation<StartNetworkServiceInput>> augmentation = Collections.emptyMap();

    public StartNetworkServiceInputBuilder() {
    }
    public StartNetworkServiceInputBuilder(ns.yang.nfvo.mano.types.rev170208.RpcProjectName arg) {
        this._projectName = arg.getProjectName();
    }
    public StartNetworkServiceInputBuilder(ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParamsCommon arg) {
        this._scalingGroup = arg.getScalingGroup();
        this._nsdPlacementGroupMaps = arg.getNsdPlacementGroupMaps();
        this._inputParameter = arg.getInputParameter();
    }
    public StartNetworkServiceInputBuilder(ns.yang.nfvo.mano.types.rev170208.InputParameter arg) {
        this._inputParameter = arg.getInputParameter();
    }

    public StartNetworkServiceInputBuilder(StartNetworkServiceInput base) {
        this._inputParameter = base.getInputParameter();
        this._name = base.getName();
        this._nsdIdRef = base.getNsdIdRef();
        this._nsdPlacementGroupMaps = base.getNsdPlacementGroupMaps();
        this._projectName = base.getProjectName();
        this._scalingGroup = base.getScalingGroup();
        this._vnfdPlacementGroupMaps = base.getVnfdPlacementGroupMaps();
        if (base instanceof StartNetworkServiceInputImpl) {
            StartNetworkServiceInputImpl impl = (StartNetworkServiceInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<StartNetworkServiceInput> casted =(AugmentationHolder<StartNetworkServiceInput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.RpcProjectName</li>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParamsCommon</li>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.InputParameter</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ns.yang.nfvo.mano.types.rev170208.RpcProjectName) {
            this._projectName = ((ns.yang.nfvo.mano.types.rev170208.RpcProjectName)arg).getProjectName();
            isValidArg = true;
        }
        if (arg instanceof ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParamsCommon) {
            this._scalingGroup = ((ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParamsCommon)arg).getScalingGroup();
            this._nsdPlacementGroupMaps = ((ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParamsCommon)arg).getNsdPlacementGroupMaps();
            isValidArg = true;
        }
        if (arg instanceof ns.yang.nfvo.mano.types.rev170208.InputParameter) {
            this._inputParameter = ((ns.yang.nfvo.mano.types.rev170208.InputParameter)arg).getInputParameter();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.RpcProjectName, model.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParamsCommon, model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.InputParameter]");
    }

    public List<InputParameter> getInputParameter() {
        return _inputParameter;
    }
    
    public String getName() {
        return _name;
    }
    
    public Object getNsdIdRef() {
        return _nsdIdRef;
    }
    
    public List<NsdPlacementGroupMaps> getNsdPlacementGroupMaps() {
        return _nsdPlacementGroupMaps;
    }
    
    public String getProjectName() {
        return _projectName;
    }
    
    public List<ScalingGroup> getScalingGroup() {
        return _scalingGroup;
    }
    
    public List<VnfdPlacementGroupMaps> getVnfdPlacementGroupMaps() {
        return _vnfdPlacementGroupMaps;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<StartNetworkServiceInput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public StartNetworkServiceInputBuilder setInputParameter(final List<InputParameter> values) {
        this._inputParameter = values;
        return this;
    }
    
    
    public StartNetworkServiceInputBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public StartNetworkServiceInputBuilder setNsdIdRef(final Object value) {
        this._nsdIdRef = value;
        return this;
    }
    public StartNetworkServiceInputBuilder setNsdPlacementGroupMaps(final List<NsdPlacementGroupMaps> values) {
        this._nsdPlacementGroupMaps = values;
        return this;
    }
    
    private static void check_projectNameLength(final String value) {
        final int length = value.length();
        if (length >= 1 && length <= 255) {
            return;
        }
        CodeHelpers.throwInvalidLength("[[1..255]]", value);
    }
    
    public StartNetworkServiceInputBuilder setProjectName(final String value) {
    if (value != null) {
        check_projectNameLength(value);
        
    }
        this._projectName = value;
        return this;
    }
    public StartNetworkServiceInputBuilder setScalingGroup(final List<ScalingGroup> values) {
        this._scalingGroup = values;
        return this;
    }
    
    public StartNetworkServiceInputBuilder setVnfdPlacementGroupMaps(final List<VnfdPlacementGroupMaps> values) {
        this._vnfdPlacementGroupMaps = values;
        return this;
    }
    
    
    public StartNetworkServiceInputBuilder addAugmentation(Class<? extends Augmentation<StartNetworkServiceInput>> augmentationType, Augmentation<StartNetworkServiceInput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public StartNetworkServiceInputBuilder removeAugmentation(Class<? extends Augmentation<StartNetworkServiceInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public StartNetworkServiceInput build() {
        return new StartNetworkServiceInputImpl(this);
    }

    private static final class StartNetworkServiceInputImpl implements StartNetworkServiceInput {

        @Override
        public Class<StartNetworkServiceInput> getImplementedInterface() {
            return StartNetworkServiceInput.class;
        }

        private final List<InputParameter> _inputParameter;
        private final String _name;
        private final Object _nsdIdRef;
        private final List<NsdPlacementGroupMaps> _nsdPlacementGroupMaps;
        private final String _projectName;
        private final List<ScalingGroup> _scalingGroup;
        private final List<VnfdPlacementGroupMaps> _vnfdPlacementGroupMaps;

        private Map<Class<? extends Augmentation<StartNetworkServiceInput>>, Augmentation<StartNetworkServiceInput>> augmentation = Collections.emptyMap();

        private StartNetworkServiceInputImpl(StartNetworkServiceInputBuilder base) {
            this._inputParameter = base.getInputParameter();
            this._name = base.getName();
            this._nsdIdRef = base.getNsdIdRef();
            this._nsdPlacementGroupMaps = base.getNsdPlacementGroupMaps();
            this._projectName = base.getProjectName();
            this._scalingGroup = base.getScalingGroup();
            this._vnfdPlacementGroupMaps = base.getVnfdPlacementGroupMaps();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public List<InputParameter> getInputParameter() {
            return _inputParameter;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public Object getNsdIdRef() {
            return _nsdIdRef;
        }
        
        @Override
        public List<NsdPlacementGroupMaps> getNsdPlacementGroupMaps() {
            return _nsdPlacementGroupMaps;
        }
        
        @Override
        public String getProjectName() {
            return _projectName;
        }
        
        @Override
        public List<ScalingGroup> getScalingGroup() {
            return _scalingGroup;
        }
        
        @Override
        public List<VnfdPlacementGroupMaps> getVnfdPlacementGroupMaps() {
            return _vnfdPlacementGroupMaps;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<StartNetworkServiceInput>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_inputParameter);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_nsdIdRef);
            result = prime * result + Objects.hashCode(_nsdPlacementGroupMaps);
            result = prime * result + Objects.hashCode(_projectName);
            result = prime * result + Objects.hashCode(_scalingGroup);
            result = prime * result + Objects.hashCode(_vnfdPlacementGroupMaps);
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
            if (!StartNetworkServiceInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            StartNetworkServiceInput other = (StartNetworkServiceInput)obj;
            if (!Objects.equals(_inputParameter, other.getInputParameter())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_nsdIdRef, other.getNsdIdRef())) {
                return false;
            }
            if (!Objects.equals(_nsdPlacementGroupMaps, other.getNsdPlacementGroupMaps())) {
                return false;
            }
            if (!Objects.equals(_projectName, other.getProjectName())) {
                return false;
            }
            if (!Objects.equals(_scalingGroup, other.getScalingGroup())) {
                return false;
            }
            if (!Objects.equals(_vnfdPlacementGroupMaps, other.getVnfdPlacementGroupMaps())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                StartNetworkServiceInputImpl otherImpl = (StartNetworkServiceInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<StartNetworkServiceInput>>, Augmentation<StartNetworkServiceInput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("StartNetworkServiceInput");
            CodeHelpers.appendValue(helper, "_inputParameter", _inputParameter);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_nsdIdRef", _nsdIdRef);
            CodeHelpers.appendValue(helper, "_nsdPlacementGroupMaps", _nsdPlacementGroupMaps);
            CodeHelpers.appendValue(helper, "_projectName", _projectName);
            CodeHelpers.appendValue(helper, "_scalingGroup", _scalingGroup);
            CodeHelpers.appendValue(helper, "_vnfdPlacementGroupMaps", _vnfdPlacementGroupMaps);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
