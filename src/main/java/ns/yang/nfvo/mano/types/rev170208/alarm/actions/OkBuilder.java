package ns.yang.nfvo.mano.types.rev170208.alarm.actions;
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
 * Class that builds {@link Ok} instances.
 * 
 * @see Ok
 *
 */
public class OkBuilder implements Builder<Ok> {

    private String _url;
    private OkKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ok");

    Map<Class<? extends Augmentation<Ok>>, Augmentation<Ok>> augmentation = Collections.emptyMap();

    public OkBuilder() {
    }

    public OkBuilder(Ok base) {
        if (base.key() == null) {
            this.key = new OkKey(
                base.getUrl()
            );
            this._url = base.getUrl();
        } else {
            this.key = base.key();
            this._url = key.getUrl();
        }
        if (base instanceof OkImpl) {
            OkImpl impl = (OkImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Ok> casted =(AugmentationHolder<Ok>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public OkKey key() {
        return key;
    }
    
    public String getUrl() {
        return _url;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Ok>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public OkBuilder withKey(final OkKey key) {
        this.key = key;
        return this;
    }
    
    public OkBuilder setUrl(final String value) {
        this._url = value;
        return this;
    }
    
    public OkBuilder addAugmentation(Class<? extends Augmentation<Ok>> augmentationType, Augmentation<Ok> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public OkBuilder removeAugmentation(Class<? extends Augmentation<Ok>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Ok build() {
        return new OkImpl(this);
    }

    private static final class OkImpl implements Ok {

        @Override
        public Class<Ok> getImplementedInterface() {
            return Ok.class;
        }

        private final String _url;
        private final OkKey key;

        private Map<Class<? extends Augmentation<Ok>>, Augmentation<Ok>> augmentation = Collections.emptyMap();

        private OkImpl(OkBuilder base) {
            if (base.key() == null) {
                this.key = new OkKey(
                    base.getUrl()
                );
                this._url = base.getUrl();
            } else {
                this.key = base.key();
                this._url = key.getUrl();
            }
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public OkKey key() {
            return key;
        }
        
        @Override
        public String getUrl() {
            return _url;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Ok>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_url);
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
            if (!Ok.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Ok other = (Ok)obj;
            if (!Objects.equals(_url, other.getUrl())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                OkImpl otherImpl = (OkImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Ok>>, Augmentation<Ok>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Ok");
            CodeHelpers.appendValue(helper, "_url", _url);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
