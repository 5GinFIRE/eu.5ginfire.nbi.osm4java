package yang.vnfd.vnfd.descriptor;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import yang.vnfd.$YangModuleInfoImpl;

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
 * Class that builds {@link VduDependency} instances.
 * 
 * @see VduDependency
 *
 */
public class VduDependencyBuilder implements Builder<VduDependency> {

    private String _vduDependsOnRef;
    private String _vduSourceRef;
    private VduDependencyKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vdu-dependency");

    Map<Class<? extends Augmentation<VduDependency>>, Augmentation<VduDependency>> augmentation = Collections.emptyMap();

    public VduDependencyBuilder() {
    }

    public VduDependencyBuilder(VduDependency base) {
        if (base.key() == null) {
            this.key = new VduDependencyKey(
                base.getVduSourceRef()
            );
            this._vduSourceRef = base.getVduSourceRef();
        } else {
            this.key = base.key();
            this._vduSourceRef = key.getVduSourceRef();
        }
        this._vduDependsOnRef = base.getVduDependsOnRef();
        if (base instanceof VduDependencyImpl) {
            VduDependencyImpl impl = (VduDependencyImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<VduDependency> casted =(AugmentationHolder<VduDependency>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public VduDependencyKey key() {
        return key;
    }
    
    public String getVduDependsOnRef() {
        return _vduDependsOnRef;
    }
    
    public String getVduSourceRef() {
        return _vduSourceRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<VduDependency>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public VduDependencyBuilder withKey(final VduDependencyKey key) {
        this.key = key;
        return this;
    }
    
    public VduDependencyBuilder setVduDependsOnRef(final String value) {
        this._vduDependsOnRef = value;
        return this;
    }
    
    public VduDependencyBuilder setVduSourceRef(final String value) {
        this._vduSourceRef = value;
        return this;
    }
    
    public VduDependencyBuilder addAugmentation(Class<? extends Augmentation<VduDependency>> augmentationType, Augmentation<VduDependency> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VduDependencyBuilder removeAugmentation(Class<? extends Augmentation<VduDependency>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VduDependency build() {
        return new VduDependencyImpl(this);
    }

    private static final class VduDependencyImpl implements VduDependency {

        @Override
        public Class<VduDependency> getImplementedInterface() {
            return VduDependency.class;
        }

        private final String _vduDependsOnRef;
        private final String _vduSourceRef;
        private final VduDependencyKey key;

        private Map<Class<? extends Augmentation<VduDependency>>, Augmentation<VduDependency>> augmentation = Collections.emptyMap();

        private VduDependencyImpl(VduDependencyBuilder base) {
            if (base.key() == null) {
                this.key = new VduDependencyKey(
                    base.getVduSourceRef()
                );
                this._vduSourceRef = base.getVduSourceRef();
            } else {
                this.key = base.key();
                this._vduSourceRef = key.getVduSourceRef();
            }
            this._vduDependsOnRef = base.getVduDependsOnRef();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public VduDependencyKey key() {
            return key;
        }
        
        @Override
        public String getVduDependsOnRef() {
            return _vduDependsOnRef;
        }
        
        @Override
        public String getVduSourceRef() {
            return _vduSourceRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<VduDependency>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_vduDependsOnRef);
            result = prime * result + Objects.hashCode(_vduSourceRef);
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
            if (!VduDependency.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            VduDependency other = (VduDependency)obj;
            if (!Objects.equals(_vduDependsOnRef, other.getVduDependsOnRef())) {
                return false;
            }
            if (!Objects.equals(_vduSourceRef, other.getVduSourceRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VduDependencyImpl otherImpl = (VduDependencyImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VduDependency>>, Augmentation<VduDependency>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VduDependency");
            CodeHelpers.appendValue(helper, "_vduDependsOnRef", _vduDependsOnRef);
            CodeHelpers.appendValue(helper, "_vduSourceRef", _vduSourceRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
