package yang.vnfd.vnfd.descriptor.vdu;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.NfviMetricType;
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
 * Class that builds {@link MonitoringParam} instances.
 * 
 * @see MonitoringParam
 *
 */
public class MonitoringParamBuilder implements Builder<MonitoringParam> {

    private String _id;
    private String _interfaceNameRef;
    private NfviMetricType _nfviMetric;
    private MonitoringParamKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("monitoring-param");

    Map<Class<? extends Augmentation<MonitoringParam>>, Augmentation<MonitoringParam>> augmentation = Collections.emptyMap();

    public MonitoringParamBuilder() {
    }

    public MonitoringParamBuilder(MonitoringParam base) {
        if (base.key() == null) {
            this.key = new MonitoringParamKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this.key = base.key();
            this._id = key.getId();
        }
        this._interfaceNameRef = base.getInterfaceNameRef();
        this._nfviMetric = base.getNfviMetric();
        if (base instanceof MonitoringParamImpl) {
            MonitoringParamImpl impl = (MonitoringParamImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<MonitoringParam> casted =(AugmentationHolder<MonitoringParam>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public MonitoringParamKey key() {
        return key;
    }
    
    public String getId() {
        return _id;
    }
    
    public String getInterfaceNameRef() {
        return _interfaceNameRef;
    }
    
    public NfviMetricType getNfviMetric() {
        return _nfviMetric;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<MonitoringParam>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public MonitoringParamBuilder withKey(final MonitoringParamKey key) {
        this.key = key;
        return this;
    }
    
    public MonitoringParamBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public MonitoringParamBuilder setInterfaceNameRef(final String value) {
        this._interfaceNameRef = value;
        return this;
    }
    
    public MonitoringParamBuilder setNfviMetric(final NfviMetricType value) {
        this._nfviMetric = value;
        return this;
    }
    
    public MonitoringParamBuilder addAugmentation(Class<? extends Augmentation<MonitoringParam>> augmentationType, Augmentation<MonitoringParam> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public MonitoringParamBuilder removeAugmentation(Class<? extends Augmentation<MonitoringParam>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public MonitoringParam build() {
        return new MonitoringParamImpl(this);
    }

    private static final class MonitoringParamImpl implements MonitoringParam {

        @Override
        public Class<MonitoringParam> getImplementedInterface() {
            return MonitoringParam.class;
        }

        private final String _id;
        private final String _interfaceNameRef;
        private final NfviMetricType _nfviMetric;
        private final MonitoringParamKey key;

        private Map<Class<? extends Augmentation<MonitoringParam>>, Augmentation<MonitoringParam>> augmentation = Collections.emptyMap();

        private MonitoringParamImpl(MonitoringParamBuilder base) {
            if (base.key() == null) {
                this.key = new MonitoringParamKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this.key = base.key();
                this._id = key.getId();
            }
            this._interfaceNameRef = base.getInterfaceNameRef();
            this._nfviMetric = base.getNfviMetric();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public MonitoringParamKey key() {
            return key;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public String getInterfaceNameRef() {
            return _interfaceNameRef;
        }
        
        @Override
        public NfviMetricType getNfviMetric() {
            return _nfviMetric;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<MonitoringParam>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_interfaceNameRef);
            result = prime * result + Objects.hashCode(_nfviMetric);
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
            if (!MonitoringParam.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            MonitoringParam other = (MonitoringParam)obj;
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_interfaceNameRef, other.getInterfaceNameRef())) {
                return false;
            }
            if (!Objects.equals(_nfviMetric, other.getNfviMetric())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MonitoringParamImpl otherImpl = (MonitoringParamImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<MonitoringParam>>, Augmentation<MonitoringParam>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("MonitoringParam");
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_interfaceNameRef", _interfaceNameRef);
            CodeHelpers.appendValue(helper, "_nfviMetric", _nfviMetric);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
