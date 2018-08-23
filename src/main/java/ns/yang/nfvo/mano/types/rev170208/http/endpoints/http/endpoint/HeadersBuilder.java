package ns.yang.nfvo.mano.types.rev170208.http.endpoints.http.endpoint;
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
 * Class that builds {@link Headers} instances.
 * 
 * @see Headers
 *
 */
public class HeadersBuilder implements Builder<Headers> {

    private String _key;
    private String _value;
    private HeadersKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("headers");

    Map<Class<? extends Augmentation<Headers>>, Augmentation<Headers>> augmentation = Collections.emptyMap();

    public HeadersBuilder() {
    }

    public HeadersBuilder(Headers base) {
        if (base.key() == null) {
            this.key = new HeadersKey(
                base.getKey()
            );
            this._key = base.getKey();
        } else {
            this.key = base.key();
            this._key = key.getKey();
        }
        this._value = base.getValue();
        if (base instanceof HeadersImpl) {
            HeadersImpl impl = (HeadersImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Headers> casted =(AugmentationHolder<Headers>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public HeadersKey key() {
        return key;
    }
    
    public String getKey() {
        return _key;
    }
    
    public String getValue() {
        return _value;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Headers>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public HeadersBuilder withKey(final HeadersKey key) {
        this.key = key;
        return this;
    }
    
    public HeadersBuilder setKey(final String value) {
        this._key = value;
        return this;
    }
    
    public HeadersBuilder setValue(final String value) {
        this._value = value;
        return this;
    }
    
    public HeadersBuilder addAugmentation(Class<? extends Augmentation<Headers>> augmentationType, Augmentation<Headers> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public HeadersBuilder removeAugmentation(Class<? extends Augmentation<Headers>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Headers build() {
        return new HeadersImpl(this);
    }

    private static final class HeadersImpl implements Headers {

        @Override
        public Class<Headers> getImplementedInterface() {
            return Headers.class;
        }

        private final String _key;
        private final String _value;
        private final HeadersKey key;

        private Map<Class<? extends Augmentation<Headers>>, Augmentation<Headers>> augmentation = Collections.emptyMap();

        private HeadersImpl(HeadersBuilder base) {
            if (base.key() == null) {
                this.key = new HeadersKey(
                    base.getKey()
                );
                this._key = base.getKey();
            } else {
                this.key = base.key();
                this._key = key.getKey();
            }
            this._value = base.getValue();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public HeadersKey key() {
            return key;
        }
        
        @Override
        public String getKey() {
            return _key;
        }
        
        @Override
        public String getValue() {
            return _value;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Headers>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_key);
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
            if (!Headers.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Headers other = (Headers)obj;
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_value, other.getValue())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                HeadersImpl otherImpl = (HeadersImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Headers>>, Augmentation<Headers>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Headers");
            CodeHelpers.appendValue(helper, "_key", _key);
            CodeHelpers.appendValue(helper, "_value", _value);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
