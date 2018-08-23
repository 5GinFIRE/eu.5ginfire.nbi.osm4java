package yang.project.nsd.rev170228.nsr.nsd.vnf.dependency;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import yang.project.nsd.rev170228.$YangModuleInfoImpl;

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
 * Class that builds {@link VnfDependency} instances.
 * 
 * @see VnfDependency
 *
 */
public class VnfDependencyBuilder implements Builder<VnfDependency> {

    private String _vnfDependsOnRef;
    private String _vnfSourceRef;
    private VnfDependencyKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnf-dependency");

    Map<Class<? extends Augmentation<VnfDependency>>, Augmentation<VnfDependency>> augmentation = Collections.emptyMap();

    public VnfDependencyBuilder() {
    }

    public VnfDependencyBuilder(VnfDependency base) {
        if (base.key() == null) {
            this.key = new VnfDependencyKey(
                base.getVnfSourceRef()
            );
            this._vnfSourceRef = base.getVnfSourceRef();
        } else {
            this.key = base.key();
            this._vnfSourceRef = key.getVnfSourceRef();
        }
        this._vnfDependsOnRef = base.getVnfDependsOnRef();
        if (base instanceof VnfDependencyImpl) {
            VnfDependencyImpl impl = (VnfDependencyImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<VnfDependency> casted =(AugmentationHolder<VnfDependency>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public VnfDependencyKey key() {
        return key;
    }
    
    public String getVnfDependsOnRef() {
        return _vnfDependsOnRef;
    }
    
    public String getVnfSourceRef() {
        return _vnfSourceRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<VnfDependency>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public VnfDependencyBuilder withKey(final VnfDependencyKey key) {
        this.key = key;
        return this;
    }
    
    public VnfDependencyBuilder setVnfDependsOnRef(final String value) {
        this._vnfDependsOnRef = value;
        return this;
    }
    
    public VnfDependencyBuilder setVnfSourceRef(final String value) {
        this._vnfSourceRef = value;
        return this;
    }
    
    public VnfDependencyBuilder addAugmentation(Class<? extends Augmentation<VnfDependency>> augmentationType, Augmentation<VnfDependency> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfDependencyBuilder removeAugmentation(Class<? extends Augmentation<VnfDependency>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VnfDependency build() {
        return new VnfDependencyImpl(this);
    }

    private static final class VnfDependencyImpl implements VnfDependency {

        @Override
        public Class<VnfDependency> getImplementedInterface() {
            return VnfDependency.class;
        }

        private final String _vnfDependsOnRef;
        private final String _vnfSourceRef;
        private final VnfDependencyKey key;

        private Map<Class<? extends Augmentation<VnfDependency>>, Augmentation<VnfDependency>> augmentation = Collections.emptyMap();

        private VnfDependencyImpl(VnfDependencyBuilder base) {
            if (base.key() == null) {
                this.key = new VnfDependencyKey(
                    base.getVnfSourceRef()
                );
                this._vnfSourceRef = base.getVnfSourceRef();
            } else {
                this.key = base.key();
                this._vnfSourceRef = key.getVnfSourceRef();
            }
            this._vnfDependsOnRef = base.getVnfDependsOnRef();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public VnfDependencyKey key() {
            return key;
        }
        
        @Override
        public String getVnfDependsOnRef() {
            return _vnfDependsOnRef;
        }
        
        @Override
        public String getVnfSourceRef() {
            return _vnfSourceRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<VnfDependency>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_vnfDependsOnRef);
            result = prime * result + Objects.hashCode(_vnfSourceRef);
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
            if (!VnfDependency.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            VnfDependency other = (VnfDependency)obj;
            if (!Objects.equals(_vnfDependsOnRef, other.getVnfDependsOnRef())) {
                return false;
            }
            if (!Objects.equals(_vnfSourceRef, other.getVnfSourceRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfDependencyImpl otherImpl = (VnfDependencyImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VnfDependency>>, Augmentation<VnfDependency>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VnfDependency");
            CodeHelpers.appendValue(helper, "_vnfDependsOnRef", _vnfDependsOnRef);
            CodeHelpers.appendValue(helper, "_vnfSourceRef", _vnfSourceRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
