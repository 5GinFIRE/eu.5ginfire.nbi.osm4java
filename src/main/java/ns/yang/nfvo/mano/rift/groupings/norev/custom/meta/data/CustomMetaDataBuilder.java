package ns.yang.nfvo.mano.rift.groupings.norev.custom.meta.data;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.rift.groupings.norev.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.MetaDataType;

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
 * Class that builds {@link CustomMetaData} instances.
 * 
 * @see CustomMetaData
 *
 */
public class CustomMetaDataBuilder implements Builder<CustomMetaData> {

    private MetaDataType _dataType;
    private CustomMetaData.Destination _destination;
    private String _name;
    private String _value;
    private CustomMetaDataKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("custom-meta-data");

    Map<Class<? extends Augmentation<CustomMetaData>>, Augmentation<CustomMetaData>> augmentation = Collections.emptyMap();

    public CustomMetaDataBuilder() {
    }

    public CustomMetaDataBuilder(CustomMetaData base) {
        if (base.key() == null) {
            this.key = new CustomMetaDataKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this.key = base.key();
            this._name = key.getName();
        }
        this._dataType = base.getDataType();
        this._destination = base.getDestination();
        this._value = base.getValue();
        if (base instanceof CustomMetaDataImpl) {
            CustomMetaDataImpl impl = (CustomMetaDataImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<CustomMetaData> casted =(AugmentationHolder<CustomMetaData>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public CustomMetaDataKey key() {
        return key;
    }
    
    public MetaDataType getDataType() {
        return _dataType;
    }
    
    public CustomMetaData.Destination getDestination() {
        return _destination;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getValue() {
        return _value;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<CustomMetaData>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public CustomMetaDataBuilder withKey(final CustomMetaDataKey key) {
        this.key = key;
        return this;
    }
    
    public CustomMetaDataBuilder setDataType(final MetaDataType value) {
        this._dataType = value;
        return this;
    }
    
    public CustomMetaDataBuilder setDestination(final CustomMetaData.Destination value) {
        this._destination = value;
        return this;
    }
    
    public CustomMetaDataBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public CustomMetaDataBuilder setValue(final String value) {
        this._value = value;
        return this;
    }
    
    public CustomMetaDataBuilder addAugmentation(Class<? extends Augmentation<CustomMetaData>> augmentationType, Augmentation<CustomMetaData> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public CustomMetaDataBuilder removeAugmentation(Class<? extends Augmentation<CustomMetaData>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public CustomMetaData build() {
        return new CustomMetaDataImpl(this);
    }

    private static final class CustomMetaDataImpl implements CustomMetaData {

        @Override
        public Class<CustomMetaData> getImplementedInterface() {
            return CustomMetaData.class;
        }

        private final MetaDataType _dataType;
        private final CustomMetaData.Destination _destination;
        private final String _name;
        private final String _value;
        private final CustomMetaDataKey key;

        private Map<Class<? extends Augmentation<CustomMetaData>>, Augmentation<CustomMetaData>> augmentation = Collections.emptyMap();

        private CustomMetaDataImpl(CustomMetaDataBuilder base) {
            if (base.key() == null) {
                this.key = new CustomMetaDataKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this.key = base.key();
                this._name = key.getName();
            }
            this._dataType = base.getDataType();
            this._destination = base.getDestination();
            this._value = base.getValue();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public CustomMetaDataKey key() {
            return key;
        }
        
        @Override
        public MetaDataType getDataType() {
            return _dataType;
        }
        
        @Override
        public CustomMetaData.Destination getDestination() {
            return _destination;
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
        public <E extends Augmentation<CustomMetaData>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_destination);
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
            if (!CustomMetaData.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            CustomMetaData other = (CustomMetaData)obj;
            if (!Objects.equals(_dataType, other.getDataType())) {
                return false;
            }
            if (!Objects.equals(_destination, other.getDestination())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_value, other.getValue())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CustomMetaDataImpl otherImpl = (CustomMetaDataImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<CustomMetaData>>, Augmentation<CustomMetaData>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("CustomMetaData");
            CodeHelpers.appendValue(helper, "_dataType", _dataType);
            CodeHelpers.appendValue(helper, "_destination", _destination);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_value", _value);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
