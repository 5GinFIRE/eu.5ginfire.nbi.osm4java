package ns.yang.nfvo.nsr.rev170208;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.primitive.parameter.value.Parameter;
import ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.ParameterGroup;
import ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.VnfList;

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
 * Class that builds {@link ExecNsServicePrimitiveInput} instances.
 * 
 * @see ExecNsServicePrimitiveInput
 *
 */
public class ExecNsServicePrimitiveInputBuilder implements Builder<ExecNsServicePrimitiveInput> {

    private String _name;
    private Object _nsrIdRef;
    private List<Parameter> _parameter;
    private List<ParameterGroup> _parameterGroup;
    private String _projectName;
    private TriggerType _triggeredBy;
    private String _userDefinedScript;
    private List<VnfList> _vnfList;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("input");

    Map<Class<? extends Augmentation<ExecNsServicePrimitiveInput>>, Augmentation<ExecNsServicePrimitiveInput>> augmentation = Collections.emptyMap();

    public ExecNsServicePrimitiveInputBuilder() {
    }
    public ExecNsServicePrimitiveInputBuilder(ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue arg) {
        this._parameter = arg.getParameter();
    }
    public ExecNsServicePrimitiveInputBuilder(ns.yang.nfvo.nsr.rev170208.RpcCommon arg) {
        this._nsrIdRef = arg.getNsrIdRef();
        this._projectName = arg.getProjectName();
    }
    public ExecNsServicePrimitiveInputBuilder(ns.yang.nfvo.mano.types.rev170208.RpcProjectName arg) {
        this._projectName = arg.getProjectName();
    }

    public ExecNsServicePrimitiveInputBuilder(ExecNsServicePrimitiveInput base) {
        this._name = base.getName();
        this._nsrIdRef = base.getNsrIdRef();
        this._parameter = base.getParameter();
        this._parameterGroup = base.getParameterGroup();
        this._projectName = base.getProjectName();
        this._triggeredBy = base.getTriggeredBy();
        this._userDefinedScript = base.getUserDefinedScript();
        this._vnfList = base.getVnfList();
        if (base instanceof ExecNsServicePrimitiveInputImpl) {
            ExecNsServicePrimitiveInputImpl impl = (ExecNsServicePrimitiveInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ExecNsServicePrimitiveInput> casted =(AugmentationHolder<ExecNsServicePrimitiveInput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue</li>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.RpcProjectName</li>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.RpcCommon</li>
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
        if (arg instanceof ns.yang.nfvo.mano.types.rev170208.RpcProjectName) {
            this._projectName = ((ns.yang.nfvo.mano.types.rev170208.RpcProjectName)arg).getProjectName();
            isValidArg = true;
        }
        if (arg instanceof ns.yang.nfvo.nsr.rev170208.RpcCommon) {
            this._nsrIdRef = ((ns.yang.nfvo.nsr.rev170208.RpcCommon)arg).getNsrIdRef();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue, model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.RpcProjectName, model.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.RpcCommon]");
    }

    public String getName() {
        return _name;
    }
    
    public Object getNsrIdRef() {
        return _nsrIdRef;
    }
    
    public List<Parameter> getParameter() {
        return _parameter;
    }
    
    public List<ParameterGroup> getParameterGroup() {
        return _parameterGroup;
    }
    
    public String getProjectName() {
        return _projectName;
    }
    
    public TriggerType getTriggeredBy() {
        return _triggeredBy;
    }
    
    public String getUserDefinedScript() {
        return _userDefinedScript;
    }
    
    public List<VnfList> getVnfList() {
        return _vnfList;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ExecNsServicePrimitiveInput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public ExecNsServicePrimitiveInputBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public ExecNsServicePrimitiveInputBuilder setNsrIdRef(final Object value) {
        this._nsrIdRef = value;
        return this;
    }
    public ExecNsServicePrimitiveInputBuilder setParameter(final List<Parameter> values) {
        this._parameter = values;
        return this;
    }
    
    public ExecNsServicePrimitiveInputBuilder setParameterGroup(final List<ParameterGroup> values) {
        this._parameterGroup = values;
        return this;
    }
    
    private static void check_projectNameLength(final String value) {
        final int length = value.length();
        if (length >= 1 && length <= 255) {
            return;
        }
        CodeHelpers.throwInvalidLength("[[1..255]]", value);
    }
    
    public ExecNsServicePrimitiveInputBuilder setProjectName(final String value) {
    if (value != null) {
        check_projectNameLength(value);
        
    }
        this._projectName = value;
        return this;
    }
    
    public ExecNsServicePrimitiveInputBuilder setTriggeredBy(final TriggerType value) {
        this._triggeredBy = value;
        return this;
    }
    
    public ExecNsServicePrimitiveInputBuilder setUserDefinedScript(final String value) {
        this._userDefinedScript = value;
        return this;
    }
    public ExecNsServicePrimitiveInputBuilder setVnfList(final List<VnfList> values) {
        this._vnfList = values;
        return this;
    }
    
    
    public ExecNsServicePrimitiveInputBuilder addAugmentation(Class<? extends Augmentation<ExecNsServicePrimitiveInput>> augmentationType, Augmentation<ExecNsServicePrimitiveInput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ExecNsServicePrimitiveInputBuilder removeAugmentation(Class<? extends Augmentation<ExecNsServicePrimitiveInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ExecNsServicePrimitiveInput build() {
        return new ExecNsServicePrimitiveInputImpl(this);
    }

    private static final class ExecNsServicePrimitiveInputImpl implements ExecNsServicePrimitiveInput {

        @Override
        public Class<ExecNsServicePrimitiveInput> getImplementedInterface() {
            return ExecNsServicePrimitiveInput.class;
        }

        private final String _name;
        private final Object _nsrIdRef;
        private final List<Parameter> _parameter;
        private final List<ParameterGroup> _parameterGroup;
        private final String _projectName;
        private final TriggerType _triggeredBy;
        private final String _userDefinedScript;
        private final List<VnfList> _vnfList;

        private Map<Class<? extends Augmentation<ExecNsServicePrimitiveInput>>, Augmentation<ExecNsServicePrimitiveInput>> augmentation = Collections.emptyMap();

        private ExecNsServicePrimitiveInputImpl(ExecNsServicePrimitiveInputBuilder base) {
            this._name = base.getName();
            this._nsrIdRef = base.getNsrIdRef();
            this._parameter = base.getParameter();
            this._parameterGroup = base.getParameterGroup();
            this._projectName = base.getProjectName();
            this._triggeredBy = base.getTriggeredBy();
            this._userDefinedScript = base.getUserDefinedScript();
            this._vnfList = base.getVnfList();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public Object getNsrIdRef() {
            return _nsrIdRef;
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
        public String getProjectName() {
            return _projectName;
        }
        
        @Override
        public TriggerType getTriggeredBy() {
            return _triggeredBy;
        }
        
        @Override
        public String getUserDefinedScript() {
            return _userDefinedScript;
        }
        
        @Override
        public List<VnfList> getVnfList() {
            return _vnfList;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ExecNsServicePrimitiveInput>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_nsrIdRef);
            result = prime * result + Objects.hashCode(_parameter);
            result = prime * result + Objects.hashCode(_parameterGroup);
            result = prime * result + Objects.hashCode(_projectName);
            result = prime * result + Objects.hashCode(_triggeredBy);
            result = prime * result + Objects.hashCode(_userDefinedScript);
            result = prime * result + Objects.hashCode(_vnfList);
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
            if (!ExecNsServicePrimitiveInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ExecNsServicePrimitiveInput other = (ExecNsServicePrimitiveInput)obj;
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_nsrIdRef, other.getNsrIdRef())) {
                return false;
            }
            if (!Objects.equals(_parameter, other.getParameter())) {
                return false;
            }
            if (!Objects.equals(_parameterGroup, other.getParameterGroup())) {
                return false;
            }
            if (!Objects.equals(_projectName, other.getProjectName())) {
                return false;
            }
            if (!Objects.equals(_triggeredBy, other.getTriggeredBy())) {
                return false;
            }
            if (!Objects.equals(_userDefinedScript, other.getUserDefinedScript())) {
                return false;
            }
            if (!Objects.equals(_vnfList, other.getVnfList())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ExecNsServicePrimitiveInputImpl otherImpl = (ExecNsServicePrimitiveInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ExecNsServicePrimitiveInput>>, Augmentation<ExecNsServicePrimitiveInput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ExecNsServicePrimitiveInput");
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_nsrIdRef", _nsrIdRef);
            CodeHelpers.appendValue(helper, "_parameter", _parameter);
            CodeHelpers.appendValue(helper, "_parameterGroup", _parameterGroup);
            CodeHelpers.appendValue(helper, "_projectName", _projectName);
            CodeHelpers.appendValue(helper, "_triggeredBy", _triggeredBy);
            CodeHelpers.appendValue(helper, "_userDefinedScript", _userDefinedScript);
            CodeHelpers.appendValue(helper, "_vnfList", _vnfList);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
