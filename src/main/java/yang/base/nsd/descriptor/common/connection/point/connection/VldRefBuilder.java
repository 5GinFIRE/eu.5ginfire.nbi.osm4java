package yang.base.nsd.descriptor.common.connection.point.connection;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import yang.base.$YangModuleInfoImpl;

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
 * Class that builds {@link VldRef} instances.
 * 
 * @see VldRef
 *
 */
public class VldRefBuilder implements Builder<VldRef> {

    private String _vldIdRef;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vld-ref");

    Map<Class<? extends Augmentation<VldRef>>, Augmentation<VldRef>> augmentation = Collections.emptyMap();

    public VldRefBuilder() {
    }

    public VldRefBuilder(VldRef base) {
        this._vldIdRef = base.getVldIdRef();
        if (base instanceof VldRefImpl) {
            VldRefImpl impl = (VldRefImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<VldRef> casted =(AugmentationHolder<VldRef>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public String getVldIdRef() {
        return _vldIdRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<VldRef>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public VldRefBuilder setVldIdRef(final String value) {
        this._vldIdRef = value;
        return this;
    }
    
    public VldRefBuilder addAugmentation(Class<? extends Augmentation<VldRef>> augmentationType, Augmentation<VldRef> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VldRefBuilder removeAugmentation(Class<? extends Augmentation<VldRef>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VldRef build() {
        return new VldRefImpl(this);
    }

    private static final class VldRefImpl implements VldRef {

        @Override
        public Class<VldRef> getImplementedInterface() {
            return VldRef.class;
        }

        private final String _vldIdRef;

        private Map<Class<? extends Augmentation<VldRef>>, Augmentation<VldRef>> augmentation = Collections.emptyMap();

        private VldRefImpl(VldRefBuilder base) {
            this._vldIdRef = base.getVldIdRef();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public String getVldIdRef() {
            return _vldIdRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<VldRef>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_vldIdRef);
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
            if (!VldRef.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            VldRef other = (VldRef)obj;
            if (!Objects.equals(_vldIdRef, other.getVldIdRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VldRefImpl otherImpl = (VldRefImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VldRef>>, Augmentation<VldRef>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VldRef");
            CodeHelpers.appendValue(helper, "_vldIdRef", _vldIdRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
