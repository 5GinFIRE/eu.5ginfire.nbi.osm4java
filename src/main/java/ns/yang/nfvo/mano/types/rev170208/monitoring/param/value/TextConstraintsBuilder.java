package ns.yang.nfvo.mano.types.rev170208.monitoring.param.value;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.Short;
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
 * Class that builds {@link TextConstraints} instances.
 * 
 * @see TextConstraints
 *
 */
public class TextConstraintsBuilder implements Builder<TextConstraints> {

    private Short _maxLength;
    private Short _minLength;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("text-constraints");

    Map<Class<? extends Augmentation<TextConstraints>>, Augmentation<TextConstraints>> augmentation = Collections.emptyMap();

    public TextConstraintsBuilder() {
    }

    public TextConstraintsBuilder(TextConstraints base) {
        this._maxLength = base.getMaxLength();
        this._minLength = base.getMinLength();
        if (base instanceof TextConstraintsImpl) {
            TextConstraintsImpl impl = (TextConstraintsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<TextConstraints> casted =(AugmentationHolder<TextConstraints>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public Short getMaxLength() {
        return _maxLength;
    }
    
    public Short getMinLength() {
        return _minLength;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<TextConstraints>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    private static void checkMaxLengthRange(final short value) {
        if (value >= (short)0 && value <= (short)255) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..255]]", value);
    }
    
    public TextConstraintsBuilder setMaxLength(final Short value) {
    if (value != null) {
        checkMaxLengthRange(value);
        
    }
        this._maxLength = value;
        return this;
    }
    private static void checkMinLengthRange(final short value) {
        if (value >= (short)0 && value <= (short)255) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..255]]", value);
    }
    
    public TextConstraintsBuilder setMinLength(final Short value) {
    if (value != null) {
        checkMinLengthRange(value);
        
    }
        this._minLength = value;
        return this;
    }
    
    public TextConstraintsBuilder addAugmentation(Class<? extends Augmentation<TextConstraints>> augmentationType, Augmentation<TextConstraints> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public TextConstraintsBuilder removeAugmentation(Class<? extends Augmentation<TextConstraints>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public TextConstraints build() {
        return new TextConstraintsImpl(this);
    }

    private static final class TextConstraintsImpl implements TextConstraints {

        @Override
        public Class<TextConstraints> getImplementedInterface() {
            return TextConstraints.class;
        }

        private final Short _maxLength;
        private final Short _minLength;

        private Map<Class<? extends Augmentation<TextConstraints>>, Augmentation<TextConstraints>> augmentation = Collections.emptyMap();

        private TextConstraintsImpl(TextConstraintsBuilder base) {
            this._maxLength = base.getMaxLength();
            this._minLength = base.getMinLength();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public Short getMaxLength() {
            return _maxLength;
        }
        
        @Override
        public Short getMinLength() {
            return _minLength;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<TextConstraints>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_maxLength);
            result = prime * result + Objects.hashCode(_minLength);
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
            if (!TextConstraints.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            TextConstraints other = (TextConstraints)obj;
            if (!Objects.equals(_maxLength, other.getMaxLength())) {
                return false;
            }
            if (!Objects.equals(_minLength, other.getMinLength())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                TextConstraintsImpl otherImpl = (TextConstraintsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<TextConstraints>>, Augmentation<TextConstraints>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("TextConstraints");
            CodeHelpers.appendValue(helper, "_maxLength", _maxLength);
            CodeHelpers.appendValue(helper, "_minLength", _minLength);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
