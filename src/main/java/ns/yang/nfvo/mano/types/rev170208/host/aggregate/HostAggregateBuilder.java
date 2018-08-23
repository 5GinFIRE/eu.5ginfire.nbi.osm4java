package ns.yang.nfvo.mano.types.rev170208.host.aggregate;
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
 * Class that builds {@link HostAggregate} instances.
 * 
 * @see HostAggregate
 *
 */
public class HostAggregateBuilder implements Builder<HostAggregate> {

    private String _metadataKey;
    private String _metadataValue;
    private HostAggregateKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("host-aggregate");

    Map<Class<? extends Augmentation<HostAggregate>>, Augmentation<HostAggregate>> augmentation = Collections.emptyMap();

    public HostAggregateBuilder() {
    }

    public HostAggregateBuilder(HostAggregate base) {
        if (base.key() == null) {
            this.key = new HostAggregateKey(
                base.getMetadataKey()
            );
            this._metadataKey = base.getMetadataKey();
        } else {
            this.key = base.key();
            this._metadataKey = key.getMetadataKey();
        }
        this._metadataValue = base.getMetadataValue();
        if (base instanceof HostAggregateImpl) {
            HostAggregateImpl impl = (HostAggregateImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<HostAggregate> casted =(AugmentationHolder<HostAggregate>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public HostAggregateKey key() {
        return key;
    }
    
    public String getMetadataKey() {
        return _metadataKey;
    }
    
    public String getMetadataValue() {
        return _metadataValue;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<HostAggregate>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public HostAggregateBuilder withKey(final HostAggregateKey key) {
        this.key = key;
        return this;
    }
    
    public HostAggregateBuilder setMetadataKey(final String value) {
        this._metadataKey = value;
        return this;
    }
    
    public HostAggregateBuilder setMetadataValue(final String value) {
        this._metadataValue = value;
        return this;
    }
    
    public HostAggregateBuilder addAugmentation(Class<? extends Augmentation<HostAggregate>> augmentationType, Augmentation<HostAggregate> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public HostAggregateBuilder removeAugmentation(Class<? extends Augmentation<HostAggregate>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public HostAggregate build() {
        return new HostAggregateImpl(this);
    }

    private static final class HostAggregateImpl implements HostAggregate {

        @Override
        public Class<HostAggregate> getImplementedInterface() {
            return HostAggregate.class;
        }

        private final String _metadataKey;
        private final String _metadataValue;
        private final HostAggregateKey key;

        private Map<Class<? extends Augmentation<HostAggregate>>, Augmentation<HostAggregate>> augmentation = Collections.emptyMap();

        private HostAggregateImpl(HostAggregateBuilder base) {
            if (base.key() == null) {
                this.key = new HostAggregateKey(
                    base.getMetadataKey()
                );
                this._metadataKey = base.getMetadataKey();
            } else {
                this.key = base.key();
                this._metadataKey = key.getMetadataKey();
            }
            this._metadataValue = base.getMetadataValue();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public HostAggregateKey key() {
            return key;
        }
        
        @Override
        public String getMetadataKey() {
            return _metadataKey;
        }
        
        @Override
        public String getMetadataValue() {
            return _metadataValue;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<HostAggregate>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_metadataKey);
            result = prime * result + Objects.hashCode(_metadataValue);
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
            if (!HostAggregate.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            HostAggregate other = (HostAggregate)obj;
            if (!Objects.equals(_metadataKey, other.getMetadataKey())) {
                return false;
            }
            if (!Objects.equals(_metadataValue, other.getMetadataValue())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                HostAggregateImpl otherImpl = (HostAggregateImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<HostAggregate>>, Augmentation<HostAggregate>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("HostAggregate");
            CodeHelpers.appendValue(helper, "_metadataKey", _metadataKey);
            CodeHelpers.appendValue(helper, "_metadataValue", _metadataValue);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
