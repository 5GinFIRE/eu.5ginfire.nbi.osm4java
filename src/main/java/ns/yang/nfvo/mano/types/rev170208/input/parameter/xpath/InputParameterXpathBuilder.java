package ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath;
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
 * Class that builds {@link InputParameterXpath} instances.
 * 
 * @see InputParameterXpath
 *
 */
public class InputParameterXpathBuilder implements Builder<InputParameterXpath> {

    private String _defaultValue;
    private String _label;
    private String _xpath;
    private InputParameterXpathKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("input-parameter-xpath");

    Map<Class<? extends Augmentation<InputParameterXpath>>, Augmentation<InputParameterXpath>> augmentation = Collections.emptyMap();

    public InputParameterXpathBuilder() {
    }

    public InputParameterXpathBuilder(InputParameterXpath base) {
        if (base.key() == null) {
            this.key = new InputParameterXpathKey(
                base.getXpath()
            );
            this._xpath = base.getXpath();
        } else {
            this.key = base.key();
            this._xpath = key.getXpath();
        }
        this._defaultValue = base.getDefaultValue();
        this._label = base.getLabel();
        if (base instanceof InputParameterXpathImpl) {
            InputParameterXpathImpl impl = (InputParameterXpathImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<InputParameterXpath> casted =(AugmentationHolder<InputParameterXpath>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public InputParameterXpathKey key() {
        return key;
    }
    
    public String getDefaultValue() {
        return _defaultValue;
    }
    
    public String getLabel() {
        return _label;
    }
    
    public String getXpath() {
        return _xpath;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<InputParameterXpath>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public InputParameterXpathBuilder withKey(final InputParameterXpathKey key) {
        this.key = key;
        return this;
    }
    
    public InputParameterXpathBuilder setDefaultValue(final String value) {
        this._defaultValue = value;
        return this;
    }
    
    public InputParameterXpathBuilder setLabel(final String value) {
        this._label = value;
        return this;
    }
    
    public InputParameterXpathBuilder setXpath(final String value) {
        this._xpath = value;
        return this;
    }
    
    public InputParameterXpathBuilder addAugmentation(Class<? extends Augmentation<InputParameterXpath>> augmentationType, Augmentation<InputParameterXpath> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public InputParameterXpathBuilder removeAugmentation(Class<? extends Augmentation<InputParameterXpath>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public InputParameterXpath build() {
        return new InputParameterXpathImpl(this);
    }

    private static final class InputParameterXpathImpl implements InputParameterXpath {

        @Override
        public Class<InputParameterXpath> getImplementedInterface() {
            return InputParameterXpath.class;
        }

        private final String _defaultValue;
        private final String _label;
        private final String _xpath;
        private final InputParameterXpathKey key;

        private Map<Class<? extends Augmentation<InputParameterXpath>>, Augmentation<InputParameterXpath>> augmentation = Collections.emptyMap();

        private InputParameterXpathImpl(InputParameterXpathBuilder base) {
            if (base.key() == null) {
                this.key = new InputParameterXpathKey(
                    base.getXpath()
                );
                this._xpath = base.getXpath();
            } else {
                this.key = base.key();
                this._xpath = key.getXpath();
            }
            this._defaultValue = base.getDefaultValue();
            this._label = base.getLabel();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public InputParameterXpathKey key() {
            return key;
        }
        
        @Override
        public String getDefaultValue() {
            return _defaultValue;
        }
        
        @Override
        public String getLabel() {
            return _label;
        }
        
        @Override
        public String getXpath() {
            return _xpath;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<InputParameterXpath>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_defaultValue);
            result = prime * result + Objects.hashCode(_label);
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
            if (!InputParameterXpath.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            InputParameterXpath other = (InputParameterXpath)obj;
            if (!Objects.equals(_defaultValue, other.getDefaultValue())) {
                return false;
            }
            if (!Objects.equals(_label, other.getLabel())) {
                return false;
            }
            if (!Objects.equals(_xpath, other.getXpath())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InputParameterXpathImpl otherImpl = (InputParameterXpathImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<InputParameterXpath>>, Augmentation<InputParameterXpath>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("InputParameterXpath");
            CodeHelpers.appendValue(helper, "_defaultValue", _defaultValue);
            CodeHelpers.appendValue(helper, "_label", _label);
            CodeHelpers.appendValue(helper, "_xpath", _xpath);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
