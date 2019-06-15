		package ns.yang.nfvo.nsd.rev170228.nsd.constituent.vnfd;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.nsd.rev170228.$YangModuleInfoImpl;

import java.lang.Boolean;
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
 * Class that builds {@link ConstituentVnfd} instances.
 * 
 * @see ConstituentVnfd
 *
 */
public class ConstituentVnfdBuilder implements Builder<ConstituentVnfd> {

    private String _memberVnfIndex;
    private String _vnfdIdRef;
    private Boolean _startByDefault;
    private ConstituentVnfdKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("constituent-vnfd");

    Map<Class<? extends Augmentation<ConstituentVnfd>>, Augmentation<ConstituentVnfd>> augmentation = Collections.emptyMap();

    public ConstituentVnfdBuilder() {
    }

    public ConstituentVnfdBuilder(ConstituentVnfd base) {
        if (base.key() == null) {
            this.key = new ConstituentVnfdKey(
                base.getMemberVnfIndex()
            );
            this._memberVnfIndex = base.getMemberVnfIndex();
        } else {
            this.key = base.key();
            this._memberVnfIndex = key.getMemberVnfIndex();
        }
        this._vnfdIdRef = base.getVnfdIdRef();
        this._startByDefault = base.isStartByDefault();
        if (base instanceof ConstituentVnfdImpl) {
            ConstituentVnfdImpl impl = (ConstituentVnfdImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ConstituentVnfd> casted =(AugmentationHolder<ConstituentVnfd>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public ConstituentVnfdKey key() {
        return key;
    }
    
    public String getMemberVnfIndex() {
        return _memberVnfIndex;
    }
    
    public String getVnfdIdRef() {
        return _vnfdIdRef;
    }
    
    public Boolean isStartByDefault() {
        return _startByDefault;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ConstituentVnfd>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public ConstituentVnfdBuilder withKey(final ConstituentVnfdKey key) {
        this.key = key;
        return this;
    }
    
    public ConstituentVnfdBuilder setMemberVnfIndex(final String value) {
        this._memberVnfIndex = value;
        return this;
    }
    private static void check_vnfdIdRefLength(final String value) {
        final int length = value.length();
        if (length >= 1 && length <= 63) {
            return;
        }
        CodeHelpers.throwInvalidLength("[[1..63]]", value);
    }
    
    public ConstituentVnfdBuilder setVnfdIdRef(final String value) {
    if (value != null) {
        check_vnfdIdRefLength(value);
        
    }
        this._vnfdIdRef = value;
        return this;
    }
    
    public ConstituentVnfdBuilder setStartByDefault(final Boolean value) {
        this._startByDefault = value;
        return this;
    }
    
    public ConstituentVnfdBuilder addAugmentation(Class<? extends Augmentation<ConstituentVnfd>> augmentationType, Augmentation<ConstituentVnfd> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ConstituentVnfdBuilder removeAugmentation(Class<? extends Augmentation<ConstituentVnfd>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ConstituentVnfd build() {
        return new ConstituentVnfdImpl(this);
    }

    public static final class ConstituentVnfdImpl implements ConstituentVnfd {

        @Override
        public Class<ConstituentVnfd> getImplementedInterface() {
            return ConstituentVnfd.class;
        }

        @JsonProperty("member-vnf-index")        
        private final String _memberVnfIndex;
        @JsonProperty("vnfd-id-ref")        
        private final String _vnfdIdRef;
        @JsonProperty("start-by-default")        
        private final Boolean _startByDefault;
        
        private final ConstituentVnfdKey key;

        private Map<Class<? extends Augmentation<ConstituentVnfd>>, Augmentation<ConstituentVnfd>> augmentation = Collections.emptyMap();

        private ConstituentVnfdImpl(ConstituentVnfdBuilder base) {
            if (base.key() == null) {
                this.key = new ConstituentVnfdKey(
                    base.getMemberVnfIndex()
                );
                this._memberVnfIndex = base.getMemberVnfIndex();
            } else {
                this.key = base.key();
                this._memberVnfIndex = key.getMemberVnfIndex();
            }
            this._vnfdIdRef = base.getVnfdIdRef();
            this._startByDefault = base.isStartByDefault();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        public ConstituentVnfdImpl(){
        	this(new ConstituentVnfdBuilder() );
        }
        
        @Override
        public ConstituentVnfdKey key() {
            return key;
        }
        
        @Override
        public String getMemberVnfIndex() {
            return _memberVnfIndex;
        }
        
        @Override
        public String getVnfdIdRef() {
            return _vnfdIdRef;
        }
        
        @Override
        public Boolean isStartByDefault() {
            return _startByDefault;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ConstituentVnfd>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_memberVnfIndex);
            result = prime * result + Objects.hashCode(_vnfdIdRef);
            result = prime * result + Objects.hashCode(_startByDefault);
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
            if (!ConstituentVnfd.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ConstituentVnfd other = (ConstituentVnfd)obj;
            if (!Objects.equals(_memberVnfIndex, other.getMemberVnfIndex())) {
                return false;
            }
            if (!Objects.equals(_vnfdIdRef, other.getVnfdIdRef())) {
                return false;
            }
            if (!Objects.equals(_startByDefault, other.isStartByDefault())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ConstituentVnfdImpl otherImpl = (ConstituentVnfdImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ConstituentVnfd>>, Augmentation<ConstituentVnfd>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ConstituentVnfd");
            CodeHelpers.appendValue(helper, "_memberVnfIndex", _memberVnfIndex);
            CodeHelpers.appendValue(helper, "_vnfdIdRef", _vnfdIdRef);
            CodeHelpers.appendValue(helper, "_startByDefault", _startByDefault);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
