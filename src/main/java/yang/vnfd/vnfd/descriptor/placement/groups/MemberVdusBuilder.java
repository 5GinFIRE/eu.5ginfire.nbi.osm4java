package yang.vnfd.vnfd.descriptor.placement.groups;
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
 * Class that builds {@link MemberVdus} instances.
 * 
 * @see MemberVdus
 *
 */
public class MemberVdusBuilder implements Builder<MemberVdus> {

    private String _memberVduRef;
    private MemberVdusKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("member-vdus");

    Map<Class<? extends Augmentation<MemberVdus>>, Augmentation<MemberVdus>> augmentation = Collections.emptyMap();

    public MemberVdusBuilder() {
    }

    public MemberVdusBuilder(MemberVdus base) {
        if (base.key() == null) {
            this.key = new MemberVdusKey(
                base.getMemberVduRef()
            );
            this._memberVduRef = base.getMemberVduRef();
        } else {
            this.key = base.key();
            this._memberVduRef = key.getMemberVduRef();
        }
        if (base instanceof MemberVdusImpl) {
            MemberVdusImpl impl = (MemberVdusImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<MemberVdus> casted =(AugmentationHolder<MemberVdus>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public MemberVdusKey key() {
        return key;
    }
    
    public String getMemberVduRef() {
        return _memberVduRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<MemberVdus>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public MemberVdusBuilder withKey(final MemberVdusKey key) {
        this.key = key;
        return this;
    }
    
    public MemberVdusBuilder setMemberVduRef(final String value) {
        this._memberVduRef = value;
        return this;
    }
    
    public MemberVdusBuilder addAugmentation(Class<? extends Augmentation<MemberVdus>> augmentationType, Augmentation<MemberVdus> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public MemberVdusBuilder removeAugmentation(Class<? extends Augmentation<MemberVdus>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public MemberVdus build() {
        return new MemberVdusImpl(this);
    }

    private static final class MemberVdusImpl implements MemberVdus {

        @Override
        public Class<MemberVdus> getImplementedInterface() {
            return MemberVdus.class;
        }

        private final String _memberVduRef;
        private final MemberVdusKey key;

        private Map<Class<? extends Augmentation<MemberVdus>>, Augmentation<MemberVdus>> augmentation = Collections.emptyMap();

        private MemberVdusImpl(MemberVdusBuilder base) {
            if (base.key() == null) {
                this.key = new MemberVdusKey(
                    base.getMemberVduRef()
                );
                this._memberVduRef = base.getMemberVduRef();
            } else {
                this.key = base.key();
                this._memberVduRef = key.getMemberVduRef();
            }
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public MemberVdusKey key() {
            return key;
        }
        
        @Override
        public String getMemberVduRef() {
            return _memberVduRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<MemberVdus>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_memberVduRef);
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
            if (!MemberVdus.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            MemberVdus other = (MemberVdus)obj;
            if (!Objects.equals(_memberVduRef, other.getMemberVduRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MemberVdusImpl otherImpl = (MemberVdusImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<MemberVdus>>, Augmentation<MemberVdus>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("MemberVdus");
            CodeHelpers.appendValue(helper, "_memberVduRef", _memberVduRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
