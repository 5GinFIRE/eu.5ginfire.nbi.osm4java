package yang.project.nsd.rev170228.nsd.placement.groups.placement.groups;
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
 * Class that builds {@link MemberVnfd} instances.
 * 
 * @see MemberVnfd
 *
 */
public class MemberVnfdBuilder implements Builder<MemberVnfd> {

    private String _memberVnfIndexRef;
    private String _vnfdIdRef;
    private MemberVnfdKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("member-vnfd");

    Map<Class<? extends Augmentation<MemberVnfd>>, Augmentation<MemberVnfd>> augmentation = Collections.emptyMap();

    public MemberVnfdBuilder() {
    }

    public MemberVnfdBuilder(MemberVnfd base) {
        if (base.key() == null) {
            this.key = new MemberVnfdKey(
                base.getMemberVnfIndexRef()
            );
            this._memberVnfIndexRef = base.getMemberVnfIndexRef();
        } else {
            this.key = base.key();
            this._memberVnfIndexRef = key.getMemberVnfIndexRef();
        }
        this._vnfdIdRef = base.getVnfdIdRef();
        if (base instanceof MemberVnfdImpl) {
            MemberVnfdImpl impl = (MemberVnfdImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<MemberVnfd> casted =(AugmentationHolder<MemberVnfd>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public MemberVnfdKey key() {
        return key;
    }
    
    public String getMemberVnfIndexRef() {
        return _memberVnfIndexRef;
    }
    
    public String getVnfdIdRef() {
        return _vnfdIdRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<MemberVnfd>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public MemberVnfdBuilder withKey(final MemberVnfdKey key) {
        this.key = key;
        return this;
    }
    
    public MemberVnfdBuilder setMemberVnfIndexRef(final String value) {
        this._memberVnfIndexRef = value;
        return this;
    }
    
    public MemberVnfdBuilder setVnfdIdRef(final String value) {
        this._vnfdIdRef = value;
        return this;
    }
    
    public MemberVnfdBuilder addAugmentation(Class<? extends Augmentation<MemberVnfd>> augmentationType, Augmentation<MemberVnfd> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public MemberVnfdBuilder removeAugmentation(Class<? extends Augmentation<MemberVnfd>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public MemberVnfd build() {
        return new MemberVnfdImpl(this);
    }

    private static final class MemberVnfdImpl implements MemberVnfd {

        @Override
        public Class<MemberVnfd> getImplementedInterface() {
            return MemberVnfd.class;
        }

        private final String _memberVnfIndexRef;
        private final String _vnfdIdRef;
        private final MemberVnfdKey key;

        private Map<Class<? extends Augmentation<MemberVnfd>>, Augmentation<MemberVnfd>> augmentation = Collections.emptyMap();

        private MemberVnfdImpl(MemberVnfdBuilder base) {
            if (base.key() == null) {
                this.key = new MemberVnfdKey(
                    base.getMemberVnfIndexRef()
                );
                this._memberVnfIndexRef = base.getMemberVnfIndexRef();
            } else {
                this.key = base.key();
                this._memberVnfIndexRef = key.getMemberVnfIndexRef();
            }
            this._vnfdIdRef = base.getVnfdIdRef();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public MemberVnfdKey key() {
            return key;
        }
        
        @Override
        public String getMemberVnfIndexRef() {
            return _memberVnfIndexRef;
        }
        
        @Override
        public String getVnfdIdRef() {
            return _vnfdIdRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<MemberVnfd>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_vnfdIdRef);
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
            if (!MemberVnfd.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            MemberVnfd other = (MemberVnfd)obj;
            if (!Objects.equals(_memberVnfIndexRef, other.getMemberVnfIndexRef())) {
                return false;
            }
            if (!Objects.equals(_vnfdIdRef, other.getVnfdIdRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MemberVnfdImpl otherImpl = (MemberVnfdImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<MemberVnfd>>, Augmentation<MemberVnfd>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("MemberVnfd");
            CodeHelpers.appendValue(helper, "_memberVnfIndexRef", _memberVnfIndexRef);
            CodeHelpers.appendValue(helper, "_vnfdIdRef", _vnfdIdRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
