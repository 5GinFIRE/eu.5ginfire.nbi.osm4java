package ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param.monitoring.param;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.nsd.rev170228.$YangModuleInfoImpl;

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
 * Class that builds {@link VnfdMonitoringParam} instances.
 * 
 * @see VnfdMonitoringParam
 *
 */
public class VnfdMonitoringParamBuilder implements Builder<VnfdMonitoringParam> {

    private String _memberVnfIndexRef;
    private Object _vnfdIdRef;
    private Object _vnfdMonitoringParamRef;
    private VnfdMonitoringParamKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnfd-monitoring-param");

    Map<Class<? extends Augmentation<VnfdMonitoringParam>>, Augmentation<VnfdMonitoringParam>> augmentation = Collections.emptyMap();

    public VnfdMonitoringParamBuilder() {
    }

    public VnfdMonitoringParamBuilder(VnfdMonitoringParam base) {
        if (base.key() == null) {
            this.key = new VnfdMonitoringParamKey(
                base.getMemberVnfIndexRef(), 
                base.getVnfdMonitoringParamRef()
            );
            this._memberVnfIndexRef = base.getMemberVnfIndexRef();
            this._vnfdMonitoringParamRef = base.getVnfdMonitoringParamRef();
        } else {
            this.key = base.key();
            this._memberVnfIndexRef = key.getMemberVnfIndexRef();
            this._vnfdMonitoringParamRef = key.getVnfdMonitoringParamRef();
        }
        this._vnfdIdRef = base.getVnfdIdRef();
        if (base instanceof VnfdMonitoringParamImpl) {
            VnfdMonitoringParamImpl impl = (VnfdMonitoringParamImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<VnfdMonitoringParam> casted =(AugmentationHolder<VnfdMonitoringParam>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public VnfdMonitoringParamKey key() {
        return key;
    }
    
    public String getMemberVnfIndexRef() {
        return _memberVnfIndexRef;
    }
    
    public Object getVnfdIdRef() {
        return _vnfdIdRef;
    }
    
    public Object getVnfdMonitoringParamRef() {
        return _vnfdMonitoringParamRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<VnfdMonitoringParam>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public VnfdMonitoringParamBuilder withKey(final VnfdMonitoringParamKey key) {
        this.key = key;
        return this;
    }
    
    public VnfdMonitoringParamBuilder setMemberVnfIndexRef(final String value) {
        this._memberVnfIndexRef = value;
        return this;
    }
    
    public VnfdMonitoringParamBuilder setVnfdIdRef(final Object value) {
        this._vnfdIdRef = value;
        return this;
    }
    
    public VnfdMonitoringParamBuilder setVnfdMonitoringParamRef(final Object value) {
        this._vnfdMonitoringParamRef = value;
        return this;
    }
    
    public VnfdMonitoringParamBuilder addAugmentation(Class<? extends Augmentation<VnfdMonitoringParam>> augmentationType, Augmentation<VnfdMonitoringParam> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfdMonitoringParamBuilder removeAugmentation(Class<? extends Augmentation<VnfdMonitoringParam>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VnfdMonitoringParam build() {
        return new VnfdMonitoringParamImpl(this);
    }

    private static final class VnfdMonitoringParamImpl implements VnfdMonitoringParam {

        @Override
        public Class<VnfdMonitoringParam> getImplementedInterface() {
            return VnfdMonitoringParam.class;
        }

        private final String _memberVnfIndexRef;
        private final Object _vnfdIdRef;
        private final Object _vnfdMonitoringParamRef;
        private final VnfdMonitoringParamKey key;

        private Map<Class<? extends Augmentation<VnfdMonitoringParam>>, Augmentation<VnfdMonitoringParam>> augmentation = Collections.emptyMap();

        private VnfdMonitoringParamImpl(VnfdMonitoringParamBuilder base) {
            if (base.key() == null) {
                this.key = new VnfdMonitoringParamKey(
                    base.getMemberVnfIndexRef(), 
                    base.getVnfdMonitoringParamRef()
                );
                this._memberVnfIndexRef = base.getMemberVnfIndexRef();
                this._vnfdMonitoringParamRef = base.getVnfdMonitoringParamRef();
            } else {
                this.key = base.key();
                this._memberVnfIndexRef = key.getMemberVnfIndexRef();
                this._vnfdMonitoringParamRef = key.getVnfdMonitoringParamRef();
            }
            this._vnfdIdRef = base.getVnfdIdRef();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public VnfdMonitoringParamKey key() {
            return key;
        }
        
        @Override
        public String getMemberVnfIndexRef() {
            return _memberVnfIndexRef;
        }
        
        @Override
        public Object getVnfdIdRef() {
            return _vnfdIdRef;
        }
        
        @Override
        public Object getVnfdMonitoringParamRef() {
            return _vnfdMonitoringParamRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<VnfdMonitoringParam>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_vnfdMonitoringParamRef);
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
            if (!VnfdMonitoringParam.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            VnfdMonitoringParam other = (VnfdMonitoringParam)obj;
            if (!Objects.equals(_memberVnfIndexRef, other.getMemberVnfIndexRef())) {
                return false;
            }
            if (!Objects.equals(_vnfdIdRef, other.getVnfdIdRef())) {
                return false;
            }
            if (!Objects.equals(_vnfdMonitoringParamRef, other.getVnfdMonitoringParamRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfdMonitoringParamImpl otherImpl = (VnfdMonitoringParamImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VnfdMonitoringParam>>, Augmentation<VnfdMonitoringParam>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VnfdMonitoringParam");
            CodeHelpers.appendValue(helper, "_memberVnfIndexRef", _memberVnfIndexRef);
            CodeHelpers.appendValue(helper, "_vnfdIdRef", _vnfdIdRef);
            CodeHelpers.appendValue(helper, "_vnfdMonitoringParamRef", _vnfdMonitoringParamRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
