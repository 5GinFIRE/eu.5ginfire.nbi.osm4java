package yang.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import yang.project.nsd.rev170228.$YangModuleInfoImpl;
import yang.project.nsd.rev170228.nsr.nsd.service.primitive.service.primitive.vnf.primitive.group.Primitive;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Class that builds {@link VnfPrimitiveGroup} instances.
 * 
 * @see VnfPrimitiveGroup
 *
 */
public class VnfPrimitiveGroupBuilder implements Builder<VnfPrimitiveGroup> {

    private String _memberVnfIndexRef;
    private List<Primitive> _primitive;
    private Object _vnfdIdRef;
    private Object _vnfdName;
    private VnfPrimitiveGroupKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnf-primitive-group");

    Map<Class<? extends Augmentation<VnfPrimitiveGroup>>, Augmentation<VnfPrimitiveGroup>> augmentation = Collections.emptyMap();

    public VnfPrimitiveGroupBuilder() {
    }

    public VnfPrimitiveGroupBuilder(VnfPrimitiveGroup base) {
        if (base.key() == null) {
            this.key = new VnfPrimitiveGroupKey(
                base.getMemberVnfIndexRef()
            );
            this._memberVnfIndexRef = base.getMemberVnfIndexRef();
        } else {
            this.key = base.key();
            this._memberVnfIndexRef = key.getMemberVnfIndexRef();
        }
        this._primitive = base.getPrimitive();
        this._vnfdIdRef = base.getVnfdIdRef();
        this._vnfdName = base.getVnfdName();
        if (base instanceof VnfPrimitiveGroupImpl) {
            VnfPrimitiveGroupImpl impl = (VnfPrimitiveGroupImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<VnfPrimitiveGroup> casted =(AugmentationHolder<VnfPrimitiveGroup>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public VnfPrimitiveGroupKey key() {
        return key;
    }
    
    public String getMemberVnfIndexRef() {
        return _memberVnfIndexRef;
    }
    
    public List<Primitive> getPrimitive() {
        return _primitive;
    }
    
    public Object getVnfdIdRef() {
        return _vnfdIdRef;
    }
    
    public Object getVnfdName() {
        return _vnfdName;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<VnfPrimitiveGroup>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public VnfPrimitiveGroupBuilder withKey(final VnfPrimitiveGroupKey key) {
        this.key = key;
        return this;
    }
    
    public VnfPrimitiveGroupBuilder setMemberVnfIndexRef(final String value) {
        this._memberVnfIndexRef = value;
        return this;
    }
    public VnfPrimitiveGroupBuilder setPrimitive(final List<Primitive> values) {
        this._primitive = values;
        return this;
    }
    
    
    public VnfPrimitiveGroupBuilder setVnfdIdRef(final Object value) {
        this._vnfdIdRef = value;
        return this;
    }
    
    public VnfPrimitiveGroupBuilder setVnfdName(final Object value) {
        this._vnfdName = value;
        return this;
    }
    
    public VnfPrimitiveGroupBuilder addAugmentation(Class<? extends Augmentation<VnfPrimitiveGroup>> augmentationType, Augmentation<VnfPrimitiveGroup> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfPrimitiveGroupBuilder removeAugmentation(Class<? extends Augmentation<VnfPrimitiveGroup>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VnfPrimitiveGroup build() {
        return new VnfPrimitiveGroupImpl(this);
    }

    private static final class VnfPrimitiveGroupImpl implements VnfPrimitiveGroup {

        @Override
        public Class<VnfPrimitiveGroup> getImplementedInterface() {
            return VnfPrimitiveGroup.class;
        }

        private final String _memberVnfIndexRef;
        private final List<Primitive> _primitive;
        private final Object _vnfdIdRef;
        private final Object _vnfdName;
        private final VnfPrimitiveGroupKey key;

        private Map<Class<? extends Augmentation<VnfPrimitiveGroup>>, Augmentation<VnfPrimitiveGroup>> augmentation = Collections.emptyMap();

        private VnfPrimitiveGroupImpl(VnfPrimitiveGroupBuilder base) {
            if (base.key() == null) {
                this.key = new VnfPrimitiveGroupKey(
                    base.getMemberVnfIndexRef()
                );
                this._memberVnfIndexRef = base.getMemberVnfIndexRef();
            } else {
                this.key = base.key();
                this._memberVnfIndexRef = key.getMemberVnfIndexRef();
            }
            this._primitive = base.getPrimitive();
            this._vnfdIdRef = base.getVnfdIdRef();
            this._vnfdName = base.getVnfdName();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public VnfPrimitiveGroupKey key() {
            return key;
        }
        
        @Override
        public String getMemberVnfIndexRef() {
            return _memberVnfIndexRef;
        }
        
        @Override
        public List<Primitive> getPrimitive() {
            return _primitive;
        }
        
        @Override
        public Object getVnfdIdRef() {
            return _vnfdIdRef;
        }
        
        @Override
        public Object getVnfdName() {
            return _vnfdName;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<VnfPrimitiveGroup>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_memberVnfIndexRef);
            result = prime * result + Objects.hashCode(_primitive);
            result = prime * result + Objects.hashCode(_vnfdIdRef);
            result = prime * result + Objects.hashCode(_vnfdName);
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
            if (!VnfPrimitiveGroup.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            VnfPrimitiveGroup other = (VnfPrimitiveGroup)obj;
            if (!Objects.equals(_memberVnfIndexRef, other.getMemberVnfIndexRef())) {
                return false;
            }
            if (!Objects.equals(_primitive, other.getPrimitive())) {
                return false;
            }
            if (!Objects.equals(_vnfdIdRef, other.getVnfdIdRef())) {
                return false;
            }
            if (!Objects.equals(_vnfdName, other.getVnfdName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfPrimitiveGroupImpl otherImpl = (VnfPrimitiveGroupImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VnfPrimitiveGroup>>, Augmentation<VnfPrimitiveGroup>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VnfPrimitiveGroup");
            CodeHelpers.appendValue(helper, "_memberVnfIndexRef", _memberVnfIndexRef);
            CodeHelpers.appendValue(helper, "_primitive", _primitive);
            CodeHelpers.appendValue(helper, "_vnfdIdRef", _vnfdIdRef);
            CodeHelpers.appendValue(helper, "_vnfdName", _vnfdName);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
