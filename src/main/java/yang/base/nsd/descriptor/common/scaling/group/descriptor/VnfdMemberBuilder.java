package yang.base.nsd.descriptor.common.scaling.group.descriptor;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import yang.base.$YangModuleInfoImpl;

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
 * Class that builds {@link VnfdMember} instances.
 * 
 * @see VnfdMember
 *
 */
public class VnfdMemberBuilder implements Builder<VnfdMember> {

    private Long _count;
    private String _memberVnfIndexRef;
    private VnfdMemberKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnfd-member");

    Map<Class<? extends Augmentation<VnfdMember>>, Augmentation<VnfdMember>> augmentation = Collections.emptyMap();

    public VnfdMemberBuilder() {
    }

    public VnfdMemberBuilder(VnfdMember base) {
        if (base.key() == null) {
            this.key = new VnfdMemberKey(
                base.getMemberVnfIndexRef()
            );
            this._memberVnfIndexRef = base.getMemberVnfIndexRef();
        } else {
            this.key = base.key();
            this._memberVnfIndexRef = key.getMemberVnfIndexRef();
        }
        this._count = base.getCount();
        if (base instanceof VnfdMemberImpl) {
            VnfdMemberImpl impl = (VnfdMemberImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<VnfdMember> casted =(AugmentationHolder<VnfdMember>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public VnfdMemberKey key() {
        return key;
    }
    
    public Long getCount() {
        return _count;
    }
    
    public String getMemberVnfIndexRef() {
        return _memberVnfIndexRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<VnfdMember>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public VnfdMemberBuilder withKey(final VnfdMemberKey key) {
        this.key = key;
        return this;
    }
    private static void checkCountRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public VnfdMemberBuilder setCount(final Long value) {
    if (value != null) {
        checkCountRange(value);
        
    }
        this._count = value;
        return this;
    }
    
    public VnfdMemberBuilder setMemberVnfIndexRef(final String value) {
        this._memberVnfIndexRef = value;
        return this;
    }
    
    public VnfdMemberBuilder addAugmentation(Class<? extends Augmentation<VnfdMember>> augmentationType, Augmentation<VnfdMember> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfdMemberBuilder removeAugmentation(Class<? extends Augmentation<VnfdMember>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VnfdMember build() {
        return new VnfdMemberImpl(this);
    }

    public static final class VnfdMemberImpl implements VnfdMember {

        @Override
        public Class<VnfdMember> getImplementedInterface() {
            return VnfdMember.class;
        }
        @JsonProperty("count")
        private final Long _count;
        @JsonProperty("member-vnf-index-ref")
        private final String _memberVnfIndexRef;
        private final VnfdMemberKey key;

        private Map<Class<? extends Augmentation<VnfdMember>>, Augmentation<VnfdMember>> augmentation = Collections.emptyMap();

        private VnfdMemberImpl(VnfdMemberBuilder base) {
            if (base.key() == null) {
                this.key = new VnfdMemberKey(
                    base.getMemberVnfIndexRef()
                );
                this._memberVnfIndexRef = base.getMemberVnfIndexRef();
            } else {
                this.key = base.key();
                this._memberVnfIndexRef = key.getMemberVnfIndexRef();
            }
            this._count = base.getCount();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
        
        private VnfdMemberImpl() {
    		this( new VnfdMemberBuilder() );
    	}

        @Override
        public VnfdMemberKey key() {
            return key;
        }
        
        @Override
        public Long getCount() {
            return _count;
        }
        
        @Override
        public String getMemberVnfIndexRef() {
            return _memberVnfIndexRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<VnfdMember>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_memberVnfIndexRef);
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
            if (!VnfdMember.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            VnfdMember other = (VnfdMember)obj;
            if (!Objects.equals(_count, other.getCount())) {
                return false;
            }
            if (!Objects.equals(_memberVnfIndexRef, other.getMemberVnfIndexRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfdMemberImpl otherImpl = (VnfdMemberImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VnfdMember>>, Augmentation<VnfdMember>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VnfdMember");
            CodeHelpers.appendValue(helper, "_count", _count);
            CodeHelpers.appendValue(helper, "_memberVnfIndexRef", _memberVnfIndexRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
