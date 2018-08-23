package ns.yang.nfvo.mano.types.rev170208.primitive.parameter.value;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;

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

    private String _name;
    private String _value;
    private ParameterKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("parameter");

    Map<Class<? extends Augmentation<Parameter>>, Augmentation<Parameter>> augmentation = Collections.emptyMap();

    public ParameterBuilder() {
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
        this._value = base.getValue();
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


    public ParameterKey key() {
        return key;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getValue() {
        return _value;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Parameter>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public ParameterBuilder withKey(final ParameterKey key) {
        this.key = key;
        return this;
    }
    
    public ParameterBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public ParameterBuilder setValue(final String value) {
        this._value = value;
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

        private final String _name;
        private final String _value;
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
            this._value = base.getValue();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public ParameterKey key() {
            return key;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public String getValue() {
            return _value;
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
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_value);
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
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_value, other.getValue())) {
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
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_value", _value);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
