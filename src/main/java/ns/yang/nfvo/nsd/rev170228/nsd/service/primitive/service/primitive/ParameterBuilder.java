package ns.yang.nfvo.nsd.rev170228.nsd.service.primitive.service.primitive;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.ParameterDataType;
import ns.yang.nfvo.nsd.rev170228.$YangModuleInfoImpl;

import java.lang.Boolean;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Class that builds {@link Parameter} instances.
 * 
 * @see Parameter
 *
 */
public class ParameterBuilder implements Builder<Parameter> {

    private ParameterDataType _dataType;
    private String _defaultValue;
    private String _name;
    private String _parameterPool;
    private Boolean _hidden;
    private Boolean _mandatory;
    private Boolean _readOnly;
    private ParameterKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("parameter");

    Map<Class<? extends Augmentation<Parameter>>, Augmentation<Parameter>> augmentation = Collections.emptyMap();

    public ParameterBuilder() {
    }
    public ParameterBuilder(ns.yang.nfvo.mano.types.rev170208.PrimitiveParameter arg) {
        this._name = arg.getName();
        this._dataType = arg.getDataType();
        this._mandatory = arg.isMandatory();
        this._defaultValue = arg.getDefaultValue();
        this._parameterPool = arg.getParameterPool();
        this._readOnly = arg.isReadOnly();
        this._hidden = arg.isHidden();
    }

    public ParameterBuilder(Parameter base) {
        if (base.key() == null) {
            this.key = new ParameterKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this.key = base.key();
            this._name = key.getName();
        }
        this._dataType = base.getDataType();
        this._defaultValue = base.getDefaultValue();
        this._parameterPool = base.getParameterPool();
        this._hidden = base.isHidden();
        this._mandatory = base.isMandatory();
        this._readOnly = base.isReadOnly();
        if (base instanceof ParameterImpl) {
            ParameterImpl impl = (ParameterImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Parameter> casted =(AugmentationHolder<Parameter>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameter</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ns.yang.nfvo.mano.types.rev170208.PrimitiveParameter) {
            this._name = ((ns.yang.nfvo.mano.types.rev170208.PrimitiveParameter)arg).getName();
            this._dataType = ((ns.yang.nfvo.mano.types.rev170208.PrimitiveParameter)arg).getDataType();
            this._mandatory = ((ns.yang.nfvo.mano.types.rev170208.PrimitiveParameter)arg).isMandatory();
            this._defaultValue = ((ns.yang.nfvo.mano.types.rev170208.PrimitiveParameter)arg).getDefaultValue();
            this._parameterPool = ((ns.yang.nfvo.mano.types.rev170208.PrimitiveParameter)arg).getParameterPool();
            this._readOnly = ((ns.yang.nfvo.mano.types.rev170208.PrimitiveParameter)arg).isReadOnly();
            this._hidden = ((ns.yang.nfvo.mano.types.rev170208.PrimitiveParameter)arg).isHidden();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameter]");
    }

    public ParameterKey key() {
        return key;
    }
    
    public ParameterDataType getDataType() {
        return _dataType;
    }
    
    public String getDefaultValue() {
        return _defaultValue;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getParameterPool() {
        return _parameterPool;
    }
    
    public Boolean isHidden() {
        return _hidden;
    }
    
    public Boolean isMandatory() {
        return _mandatory;
    }
    
    public Boolean isReadOnly() {
        return _readOnly;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Parameter>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public ParameterBuilder withKey(final ParameterKey key) {
        this.key = key;
        return this;
    }
    
    public ParameterBuilder setDataType(final ParameterDataType value) {
        this._dataType = value;
        return this;
    }
    
    public ParameterBuilder setDefaultValue(final String value) {
        this._defaultValue = value;
        return this;
    }
    
    public ParameterBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public ParameterBuilder setParameterPool(final String value) {
        this._parameterPool = value;
        return this;
    }
    
    public ParameterBuilder setHidden(final Boolean value) {
        this._hidden = value;
        return this;
    }
    
    public ParameterBuilder setMandatory(final Boolean value) {
        this._mandatory = value;
        return this;
    }
    
    public ParameterBuilder setReadOnly(final Boolean value) {
        this._readOnly = value;
        return this;
    }
    
    public ParameterBuilder addAugmentation(Class<? extends Augmentation<Parameter>> augmentationType, Augmentation<Parameter> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ParameterBuilder removeAugmentation(Class<? extends Augmentation<Parameter>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Parameter build() {
        return new ParameterImpl(this);
    }

    private static final class ParameterImpl implements Parameter {

        @Override
        public Class<Parameter> getImplementedInterface() {
            return Parameter.class;
        }

        private final ParameterDataType _dataType;
        private final String _defaultValue;
        private final String _name;
        private final String _parameterPool;
        private final Boolean _hidden;
        private final Boolean _mandatory;
        private final Boolean _readOnly;
        private final ParameterKey key;

        private Map<Class<? extends Augmentation<Parameter>>, Augmentation<Parameter>> augmentation = Collections.emptyMap();

        private ParameterImpl(ParameterBuilder base) {
            if (base.key() == null) {
                this.key = new ParameterKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this.key = base.key();
                this._name = key.getName();
            }
            this._dataType = base.getDataType();
            this._defaultValue = base.getDefaultValue();
            this._parameterPool = base.getParameterPool();
            this._hidden = base.isHidden();
            this._mandatory = base.isMandatory();
            this._readOnly = base.isReadOnly();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public ParameterKey key() {
            return key;
        }
        
        @Override
        public ParameterDataType getDataType() {
            return _dataType;
        }
        
        @Override
        public String getDefaultValue() {
            return _defaultValue;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public String getParameterPool() {
            return _parameterPool;
        }
        
        @Override
        public Boolean isHidden() {
            return _hidden;
        }
        
        @Override
        public Boolean isMandatory() {
            return _mandatory;
        }
        
        @Override
        public Boolean isReadOnly() {
            return _readOnly;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Parameter>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_dataType);
            result = prime * result + Objects.hashCode(_defaultValue);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_parameterPool);
            result = prime * result + Objects.hashCode(_hidden);
            result = prime * result + Objects.hashCode(_mandatory);
            result = prime * result + Objects.hashCode(_readOnly);
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
            if (!Parameter.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Parameter other = (Parameter)obj;
            if (!Objects.equals(_dataType, other.getDataType())) {
                return false;
            }
            if (!Objects.equals(_defaultValue, other.getDefaultValue())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_parameterPool, other.getParameterPool())) {
                return false;
            }
            if (!Objects.equals(_hidden, other.isHidden())) {
                return false;
            }
            if (!Objects.equals(_mandatory, other.isMandatory())) {
                return false;
            }
            if (!Objects.equals(_readOnly, other.isReadOnly())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ParameterImpl otherImpl = (ParameterImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Parameter>>, Augmentation<Parameter>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Parameter");
            CodeHelpers.appendValue(helper, "_dataType", _dataType);
            CodeHelpers.appendValue(helper, "_defaultValue", _defaultValue);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_parameterPool", _parameterPool);
            CodeHelpers.appendValue(helper, "_hidden", _hidden);
            CodeHelpers.appendValue(helper, "_mandatory", _mandatory);
            CodeHelpers.appendValue(helper, "_readOnly", _readOnly);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
