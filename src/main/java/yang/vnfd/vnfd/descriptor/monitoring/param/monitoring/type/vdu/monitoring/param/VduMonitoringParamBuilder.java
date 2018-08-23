package yang.vnfd.vnfd.descriptor.monitoring.param.monitoring.type.vdu.monitoring.param;
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
 * Class that builds {@link VduMonitoringParam} instances.
 * 
 * @see VduMonitoringParam
 *
 */
public class VduMonitoringParamBuilder implements Builder<VduMonitoringParam> {

    private Object _vduMonitoringParamRef;
    private String _vduRef;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vdu-monitoring-param");

    Map<Class<? extends Augmentation<VduMonitoringParam>>, Augmentation<VduMonitoringParam>> augmentation = Collections.emptyMap();

    public VduMonitoringParamBuilder() {
    }

    public VduMonitoringParamBuilder(VduMonitoringParam base) {
        this._vduMonitoringParamRef = base.getVduMonitoringParamRef();
        this._vduRef = base.getVduRef();
        if (base instanceof VduMonitoringParamImpl) {
            VduMonitoringParamImpl impl = (VduMonitoringParamImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<VduMonitoringParam> casted =(AugmentationHolder<VduMonitoringParam>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public Object getVduMonitoringParamRef() {
        return _vduMonitoringParamRef;
    }
    
    public String getVduRef() {
        return _vduRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<VduMonitoringParam>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public VduMonitoringParamBuilder setVduMonitoringParamRef(final Object value) {
        this._vduMonitoringParamRef = value;
        return this;
    }
    
    public VduMonitoringParamBuilder setVduRef(final String value) {
        this._vduRef = value;
        return this;
    }
    
    public VduMonitoringParamBuilder addAugmentation(Class<? extends Augmentation<VduMonitoringParam>> augmentationType, Augmentation<VduMonitoringParam> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VduMonitoringParamBuilder removeAugmentation(Class<? extends Augmentation<VduMonitoringParam>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VduMonitoringParam build() {
        return new VduMonitoringParamImpl(this);
    }

    private static final class VduMonitoringParamImpl implements VduMonitoringParam {

        @Override
        public Class<VduMonitoringParam> getImplementedInterface() {
            return VduMonitoringParam.class;
        }

        private final Object _vduMonitoringParamRef;
        private final String _vduRef;

        private Map<Class<? extends Augmentation<VduMonitoringParam>>, Augmentation<VduMonitoringParam>> augmentation = Collections.emptyMap();

        private VduMonitoringParamImpl(VduMonitoringParamBuilder base) {
            this._vduMonitoringParamRef = base.getVduMonitoringParamRef();
            this._vduRef = base.getVduRef();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public Object getVduMonitoringParamRef() {
            return _vduMonitoringParamRef;
        }
        
        @Override
        public String getVduRef() {
            return _vduRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<VduMonitoringParam>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_vduMonitoringParamRef);
            result = prime * result + Objects.hashCode(_vduRef);
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
            if (!VduMonitoringParam.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            VduMonitoringParam other = (VduMonitoringParam)obj;
            if (!Objects.equals(_vduMonitoringParamRef, other.getVduMonitoringParamRef())) {
                return false;
            }
            if (!Objects.equals(_vduRef, other.getVduRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VduMonitoringParamImpl otherImpl = (VduMonitoringParamImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VduMonitoringParam>>, Augmentation<VduMonitoringParam>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VduMonitoringParam");
            CodeHelpers.appendValue(helper, "_vduMonitoringParamRef", _vduMonitoringParamRef);
            CodeHelpers.appendValue(helper, "_vduRef", _vduRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
