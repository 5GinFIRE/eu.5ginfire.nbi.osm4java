package ns.yang.nfvo.mano.types.rev170208.input.parameter;
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
 * Class that builds {@link InputParameter} instances.
 * 
 * @see InputParameter
 *
 */
public class InputParameterBuilder implements Builder<InputParameter> {

    private String _value;
    private String _xpath;
    private InputParameterKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("input-parameter");

    Map<Class<? extends Augmentation<InputParameter>>, Augmentation<InputParameter>> augmentation = Collections.emptyMap();

    public InputParameterBuilder() {
    }

    public InputParameterBuilder(InputParameter base) {
        if (base.key() == null) {
            this.key = new InputParameterKey(
                base.getXpath()
            );
            this._xpath = base.getXpath();
        } else {
            this.key = base.key();
            this._xpath = key.getXpath();
        }
        this._value = base.getValue();
        if (base instanceof InputParameterImpl) {
            InputParameterImpl impl = (InputParameterImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<InputParameter> casted =(AugmentationHolder<InputParameter>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public InputParameterKey key() {
        return key;
    }
    
    public String getValue() {
        return _value;
    }
    
    public String getXpath() {
        return _xpath;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<InputParameter>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public InputParameterBuilder withKey(final InputParameterKey key) {
        this.key = key;
        return this;
    }
    
    public InputParameterBuilder setValue(final String value) {
        this._value = value;
        return this;
    }
    
    public InputParameterBuilder setXpath(final String value) {
        this._xpath = value;
        return this;
    }
    
    public InputParameterBuilder addAugmentation(Class<? extends Augmentation<InputParameter>> augmentationType, Augmentation<InputParameter> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public InputParameterBuilder removeAugmentation(Class<? extends Augmentation<InputParameter>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public InputParameter build() {
        return new InputParameterImpl(this);
    }

    private static final class InputParameterImpl implements InputParameter {

        @Override
        public Class<InputParameter> getImplementedInterface() {
            return InputParameter.class;
        }

        private final String _value;
        private final String _xpath;
        private final InputParameterKey key;

        private Map<Class<? extends Augmentation<InputParameter>>, Augmentation<InputParameter>> augmentation = Collections.emptyMap();

        private InputParameterImpl(InputParameterBuilder base) {
            if (base.key() == null) {
                this.key = new InputParameterKey(
                    base.getXpath()
                );
                this._xpath = base.getXpath();
            } else {
                this.key = base.key();
                this._xpath = key.getXpath();
            }
            this._value = base.getValue();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public InputParameterKey key() {
            return key;
        }
        
        @Override
        public String getValue() {
            return _value;
        }
        
        @Override
        public String getXpath() {
            return _xpath;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<InputParameter>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_value);
            result = prime * result + Objects.hashCode(_xpath);
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
            if (!InputParameter.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            InputParameter other = (InputParameter)obj;
            if (!Objects.equals(_value, other.getValue())) {
                return false;
            }
            if (!Objects.equals(_xpath, other.getXpath())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InputParameterImpl otherImpl = (InputParameterImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<InputParameter>>, Augmentation<InputParameter>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("InputParameter");
            CodeHelpers.appendValue(helper, "_value", _value);
            CodeHelpers.appendValue(helper, "_xpath", _xpath);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
