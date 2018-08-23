package ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;

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
 * Class that builds {@link NsParameter} instances.
 * 
 * @see NsParameter
 *
 */
public class NsParameterBuilder implements Builder<NsParameter> {

    private String _name;
    private String _value;
    private NsParameterKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ns-parameter");

    Map<Class<? extends Augmentation<NsParameter>>, Augmentation<NsParameter>> augmentation = Collections.emptyMap();

    public NsParameterBuilder() {
    }

    public NsParameterBuilder(NsParameter base) {
        if (base.key() == null) {
            this.key = new NsParameterKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this.key = base.key();
            this._name = key.getName();
        }
        this._value = base.getValue();
        if (base instanceof NsParameterImpl) {
            NsParameterImpl impl = (NsParameterImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<NsParameter> casted =(AugmentationHolder<NsParameter>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public NsParameterKey key() {
        return key;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getValue() {
        return _value;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<NsParameter>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public NsParameterBuilder withKey(final NsParameterKey key) {
        this.key = key;
        return this;
    }
    
    public NsParameterBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public NsParameterBuilder setValue(final String value) {
        this._value = value;
        return this;
    }
    
    public NsParameterBuilder addAugmentation(Class<? extends Augmentation<NsParameter>> augmentationType, Augmentation<NsParameter> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NsParameterBuilder removeAugmentation(Class<? extends Augmentation<NsParameter>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NsParameter build() {
        return new NsParameterImpl(this);
    }

    private static final class NsParameterImpl implements NsParameter {

        @Override
        public Class<NsParameter> getImplementedInterface() {
            return NsParameter.class;
        }

        private final String _name;
        private final String _value;
        private final NsParameterKey key;

        private Map<Class<? extends Augmentation<NsParameter>>, Augmentation<NsParameter>> augmentation = Collections.emptyMap();

        private NsParameterImpl(NsParameterBuilder base) {
            if (base.key() == null) {
                this.key = new NsParameterKey(
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
        public NsParameterKey key() {
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
        public <E extends Augmentation<NsParameter>> E augmentation(Class<E> augmentationType) {
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
            if (!NsParameter.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            NsParameter other = (NsParameter)obj;
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_value, other.getValue())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NsParameterImpl otherImpl = (NsParameterImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<NsParameter>>, Augmentation<NsParameter>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("NsParameter");
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_value", _value);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
