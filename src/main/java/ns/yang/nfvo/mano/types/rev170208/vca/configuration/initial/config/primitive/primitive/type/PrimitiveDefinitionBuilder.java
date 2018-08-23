package ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.primitive.type;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.primitive.parameter.value.Parameter;

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
 * Class that builds {@link PrimitiveDefinition} instances.
 * 
 * @see PrimitiveDefinition
 *
 */
public class PrimitiveDefinitionBuilder implements Builder<PrimitiveDefinition> {

    private String _name;
    private List<Parameter> _parameter;
    private String _userDefinedScript;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("primitive-definition");

    Map<Class<? extends Augmentation<PrimitiveDefinition>>, Augmentation<PrimitiveDefinition>> augmentation = Collections.emptyMap();

    public PrimitiveDefinitionBuilder() {
    }
    public PrimitiveDefinitionBuilder(ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue arg) {
        this._parameter = arg.getParameter();
    }

    public PrimitiveDefinitionBuilder(PrimitiveDefinition base) {
        this._name = base.getName();
        this._parameter = base.getParameter();
        this._userDefinedScript = base.getUserDefinedScript();
        if (base instanceof PrimitiveDefinitionImpl) {
            PrimitiveDefinitionImpl impl = (PrimitiveDefinitionImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<PrimitiveDefinition> casted =(AugmentationHolder<PrimitiveDefinition>) base;
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

    public String getName() {
        return _name;
    }
    
    public List<Parameter> getParameter() {
        return _parameter;
    }
    
    public String getUserDefinedScript() {
        return _userDefinedScript;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<PrimitiveDefinition>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public PrimitiveDefinitionBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    public PrimitiveDefinitionBuilder setParameter(final List<Parameter> values) {
        this._parameter = values;
        return this;
    }
    
    
    public PrimitiveDefinitionBuilder setUserDefinedScript(final String value) {
        this._userDefinedScript = value;
        return this;
    }
    
    public PrimitiveDefinitionBuilder addAugmentation(Class<? extends Augmentation<PrimitiveDefinition>> augmentationType, Augmentation<PrimitiveDefinition> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public PrimitiveDefinitionBuilder removeAugmentation(Class<? extends Augmentation<PrimitiveDefinition>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public PrimitiveDefinition build() {
        return new PrimitiveDefinitionImpl(this);
    }

    private static final class PrimitiveDefinitionImpl implements PrimitiveDefinition {

        @Override
        public Class<PrimitiveDefinition> getImplementedInterface() {
            return PrimitiveDefinition.class;
        }

        private final String _name;
        private final List<Parameter> _parameter;
        private final String _userDefinedScript;

        private Map<Class<? extends Augmentation<PrimitiveDefinition>>, Augmentation<PrimitiveDefinition>> augmentation = Collections.emptyMap();

        private PrimitiveDefinitionImpl(PrimitiveDefinitionBuilder base) {
            this._name = base.getName();
            this._parameter = base.getParameter();
            this._userDefinedScript = base.getUserDefinedScript();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public List<Parameter> getParameter() {
            return _parameter;
        }
        
        @Override
        public String getUserDefinedScript() {
            return _userDefinedScript;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<PrimitiveDefinition>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_parameter);
            result = prime * result + Objects.hashCode(_userDefinedScript);
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
            if (!PrimitiveDefinition.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            PrimitiveDefinition other = (PrimitiveDefinition)obj;
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_parameter, other.getParameter())) {
                return false;
            }
            if (!Objects.equals(_userDefinedScript, other.getUserDefinedScript())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                PrimitiveDefinitionImpl otherImpl = (PrimitiveDefinitionImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<PrimitiveDefinition>>, Augmentation<PrimitiveDefinition>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("PrimitiveDefinition");
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_parameter", _parameter);
            CodeHelpers.appendValue(helper, "_userDefinedScript", _userDefinedScript);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
