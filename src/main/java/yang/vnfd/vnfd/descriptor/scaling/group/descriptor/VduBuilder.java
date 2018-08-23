package yang.vnfd.vnfd.descriptor.scaling.group.descriptor;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import yang.vnfd.$YangModuleInfoImpl;

import java.lang.Class;
import java.lang.Long;
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
 * Class that builds {@link Vdu} instances.
 * 
 * @see Vdu
 *
 */
public class VduBuilder implements Builder<Vdu> {

    private Long _count;
    private String _vduIdRef;
    private VduKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vdu");

    Map<Class<? extends Augmentation<Vdu>>, Augmentation<Vdu>> augmentation = Collections.emptyMap();

    public VduBuilder() {
    }

    public VduBuilder(Vdu base) {
        if (base.key() == null) {
            this.key = new VduKey(
                base.getVduIdRef()
            );
            this._vduIdRef = base.getVduIdRef();
        } else {
            this.key = base.key();
            this._vduIdRef = key.getVduIdRef();
        }
        this._count = base.getCount();
        if (base instanceof VduImpl) {
            VduImpl impl = (VduImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Vdu> casted =(AugmentationHolder<Vdu>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public VduKey key() {
        return key;
    }
    
    public Long getCount() {
        return _count;
    }
    
    public String getVduIdRef() {
        return _vduIdRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Vdu>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public VduBuilder withKey(final VduKey key) {
        this.key = key;
        return this;
    }
    private static void checkCountRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public VduBuilder setCount(final Long value) {
    if (value != null) {
        checkCountRange(value);
        
    }
        this._count = value;
        return this;
    }
    
    public VduBuilder setVduIdRef(final String value) {
        this._vduIdRef = value;
        return this;
    }
    
    public VduBuilder addAugmentation(Class<? extends Augmentation<Vdu>> augmentationType, Augmentation<Vdu> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VduBuilder removeAugmentation(Class<? extends Augmentation<Vdu>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Vdu build() {
        return new VduImpl(this);
    }

    private static final class VduImpl implements Vdu {

        @Override
        public Class<Vdu> getImplementedInterface() {
            return Vdu.class;
        }

        private final Long _count;
        private final String _vduIdRef;
        private final VduKey key;

        private Map<Class<? extends Augmentation<Vdu>>, Augmentation<Vdu>> augmentation = Collections.emptyMap();

        private VduImpl(VduBuilder base) {
            if (base.key() == null) {
                this.key = new VduKey(
                    base.getVduIdRef()
                );
                this._vduIdRef = base.getVduIdRef();
            } else {
                this.key = base.key();
                this._vduIdRef = key.getVduIdRef();
            }
            this._count = base.getCount();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public VduKey key() {
            return key;
        }
        
        @Override
        public Long getCount() {
            return _count;
        }
        
        @Override
        public String getVduIdRef() {
            return _vduIdRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Vdu>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_count);
            result = prime * result + Objects.hashCode(_vduIdRef);
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
            if (!Vdu.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Vdu other = (Vdu)obj;
            if (!Objects.equals(_count, other.getCount())) {
                return false;
            }
            if (!Objects.equals(_vduIdRef, other.getVduIdRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VduImpl otherImpl = (VduImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Vdu>>, Augmentation<Vdu>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Vdu");
            CodeHelpers.appendValue(helper, "_count", _count);
            CodeHelpers.appendValue(helper, "_vduIdRef", _vduIdRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
