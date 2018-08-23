package ns.yang.nfvo.nsr.rev170208.project;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.Nsr;

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
 * Class that builds {@link NsInstanceConfig} instances.
 * 
 * @see NsInstanceConfig
 *
 */
public class NsInstanceConfigBuilder implements Builder<NsInstanceConfig> {

    private List<Nsr> _nsr;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ns-instance-config");

    Map<Class<? extends Augmentation<NsInstanceConfig>>, Augmentation<NsInstanceConfig>> augmentation = Collections.emptyMap();

    public NsInstanceConfigBuilder() {
    }

    public NsInstanceConfigBuilder(NsInstanceConfig base) {
        this._nsr = base.getNsr();
        if (base instanceof NsInstanceConfigImpl) {
            NsInstanceConfigImpl impl = (NsInstanceConfigImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<NsInstanceConfig> casted =(AugmentationHolder<NsInstanceConfig>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<Nsr> getNsr() {
        return _nsr;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<NsInstanceConfig>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public NsInstanceConfigBuilder setNsr(final List<Nsr> values) {
        this._nsr = values;
        return this;
    }
    
    
    public NsInstanceConfigBuilder addAugmentation(Class<? extends Augmentation<NsInstanceConfig>> augmentationType, Augmentation<NsInstanceConfig> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NsInstanceConfigBuilder removeAugmentation(Class<? extends Augmentation<NsInstanceConfig>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NsInstanceConfig build() {
        return new NsInstanceConfigImpl(this);
    }

    private static final class NsInstanceConfigImpl implements NsInstanceConfig {

        @Override
        public Class<NsInstanceConfig> getImplementedInterface() {
            return NsInstanceConfig.class;
        }

        private final List<Nsr> _nsr;

        private Map<Class<? extends Augmentation<NsInstanceConfig>>, Augmentation<NsInstanceConfig>> augmentation = Collections.emptyMap();

        private NsInstanceConfigImpl(NsInstanceConfigBuilder base) {
            this._nsr = base.getNsr();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public List<Nsr> getNsr() {
            return _nsr;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<NsInstanceConfig>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_nsr);
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
            if (!NsInstanceConfig.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            NsInstanceConfig other = (NsInstanceConfig)obj;
            if (!Objects.equals(_nsr, other.getNsr())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NsInstanceConfigImpl otherImpl = (NsInstanceConfigImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<NsInstanceConfig>>, Augmentation<NsInstanceConfig>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("NsInstanceConfig");
            CodeHelpers.appendValue(helper, "_nsr", _nsr);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
