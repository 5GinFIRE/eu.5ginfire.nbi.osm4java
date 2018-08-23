package ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param.monitoring.type.vdu.metric;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.yang.types.rev130715.Uuid;
import ns.yang.nfvo.vnfr.rev170228.$YangModuleInfoImpl;

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
 * Class that builds {@link VduMetric} instances.
 * 
 * @see VduMetric
 *
 */
public class VduMetricBuilder implements Builder<VduMetric> {

    private Object _vduMetricNameRef;
    private Uuid _vduRef;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vdu-metric");

    Map<Class<? extends Augmentation<VduMetric>>, Augmentation<VduMetric>> augmentation = Collections.emptyMap();

    public VduMetricBuilder() {
    }

    public VduMetricBuilder(VduMetric base) {
        this._vduMetricNameRef = base.getVduMetricNameRef();
        this._vduRef = base.getVduRef();
        if (base instanceof VduMetricImpl) {
            VduMetricImpl impl = (VduMetricImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<VduMetric> casted =(AugmentationHolder<VduMetric>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public Object getVduMetricNameRef() {
        return _vduMetricNameRef;
    }
    
    public Uuid getVduRef() {
        return _vduRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<VduMetric>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public VduMetricBuilder setVduMetricNameRef(final Object value) {
        this._vduMetricNameRef = value;
        return this;
    }
    
    public VduMetricBuilder setVduRef(final Uuid value) {
        this._vduRef = value;
        return this;
    }
    
    public VduMetricBuilder addAugmentation(Class<? extends Augmentation<VduMetric>> augmentationType, Augmentation<VduMetric> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VduMetricBuilder removeAugmentation(Class<? extends Augmentation<VduMetric>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VduMetric build() {
        return new VduMetricImpl(this);
    }

    private static final class VduMetricImpl implements VduMetric {

        @Override
        public Class<VduMetric> getImplementedInterface() {
            return VduMetric.class;
        }

        private final Object _vduMetricNameRef;
        private final Uuid _vduRef;

        private Map<Class<? extends Augmentation<VduMetric>>, Augmentation<VduMetric>> augmentation = Collections.emptyMap();

        private VduMetricImpl(VduMetricBuilder base) {
            this._vduMetricNameRef = base.getVduMetricNameRef();
            this._vduRef = base.getVduRef();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public Object getVduMetricNameRef() {
            return _vduMetricNameRef;
        }
        
        @Override
        public Uuid getVduRef() {
            return _vduRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<VduMetric>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_vduMetricNameRef);
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
            if (!VduMetric.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            VduMetric other = (VduMetric)obj;
            if (!Objects.equals(_vduMetricNameRef, other.getVduMetricNameRef())) {
                return false;
            }
            if (!Objects.equals(_vduRef, other.getVduRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VduMetricImpl otherImpl = (VduMetricImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VduMetric>>, Augmentation<VduMetric>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VduMetric");
            CodeHelpers.appendValue(helper, "_vduMetricNameRef", _vduMetricNameRef);
            CodeHelpers.appendValue(helper, "_vduRef", _vduRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
