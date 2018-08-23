package yang.vnfd.vnfd.descriptor;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.vca.configuration.ConfigMethod;
import ns.yang.nfvo.mano.types.rev170208.vca.configuration.ConfigPrimitive;
import ns.yang.nfvo.mano.types.rev170208.vca.configuration.InitialConfigPrimitive;
import ns.yang.nfvo.mano.types.rev170208.vca.metrics.Metrics;
import yang.vnfd.$YangModuleInfoImpl;

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
 * Class that builds {@link VnfConfiguration} instances.
 * 
 * @see VnfConfiguration
 *
 */
public class VnfConfigurationBuilder implements Builder<VnfConfiguration> {

    private ConfigMethod _configMethod;
    private List<ConfigPrimitive> _configPrimitive;
    private List<InitialConfigPrimitive> _initialConfigPrimitive;
    private List<Metrics> _metrics;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnf-configuration");

    Map<Class<? extends Augmentation<VnfConfiguration>>, Augmentation<VnfConfiguration>> augmentation = Collections.emptyMap();

    public VnfConfigurationBuilder() {
    }
    public VnfConfigurationBuilder(ns.yang.nfvo.mano.types.rev170208.VcaConfiguration arg) {
        this._configMethod = arg.getConfigMethod();
        this._configPrimitive = arg.getConfigPrimitive();
        this._initialConfigPrimitive = arg.getInitialConfigPrimitive();
        this._metrics = arg.getMetrics();
    }
    public VnfConfigurationBuilder(ns.yang.nfvo.mano.types.rev170208.VcaMetrics arg) {
        this._metrics = arg.getMetrics();
    }

    public VnfConfigurationBuilder(VnfConfiguration base) {
        this._configMethod = base.getConfigMethod();
        this._configPrimitive = base.getConfigPrimitive();
        this._initialConfigPrimitive = base.getInitialConfigPrimitive();
        this._metrics = base.getMetrics();
        if (base instanceof VnfConfigurationImpl) {
            VnfConfigurationImpl impl = (VnfConfigurationImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<VnfConfiguration> casted =(AugmentationHolder<VnfConfiguration>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VcaConfiguration</li>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VcaMetrics</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ns.yang.nfvo.mano.types.rev170208.VcaConfiguration) {
            this._configMethod = ((ns.yang.nfvo.mano.types.rev170208.VcaConfiguration)arg).getConfigMethod();
            this._configPrimitive = ((ns.yang.nfvo.mano.types.rev170208.VcaConfiguration)arg).getConfigPrimitive();
            this._initialConfigPrimitive = ((ns.yang.nfvo.mano.types.rev170208.VcaConfiguration)arg).getInitialConfigPrimitive();
            isValidArg = true;
        }
        if (arg instanceof ns.yang.nfvo.mano.types.rev170208.VcaMetrics) {
            this._metrics = ((ns.yang.nfvo.mano.types.rev170208.VcaMetrics)arg).getMetrics();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VcaConfiguration, model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VcaMetrics]");
    }

    public ConfigMethod getConfigMethod() {
        return _configMethod;
    }
    
    public List<ConfigPrimitive> getConfigPrimitive() {
        return _configPrimitive;
    }
    
    public List<InitialConfigPrimitive> getInitialConfigPrimitive() {
        return _initialConfigPrimitive;
    }
    
    public List<Metrics> getMetrics() {
        return _metrics;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<VnfConfiguration>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public VnfConfigurationBuilder setConfigMethod(final ConfigMethod value) {
        this._configMethod = value;
        return this;
    }
    public VnfConfigurationBuilder setConfigPrimitive(final List<ConfigPrimitive> values) {
        this._configPrimitive = values;
        return this;
    }
    
    public VnfConfigurationBuilder setInitialConfigPrimitive(final List<InitialConfigPrimitive> values) {
        this._initialConfigPrimitive = values;
        return this;
    }
    
    public VnfConfigurationBuilder setMetrics(final List<Metrics> values) {
        this._metrics = values;
        return this;
    }
    
    
    public VnfConfigurationBuilder addAugmentation(Class<? extends Augmentation<VnfConfiguration>> augmentationType, Augmentation<VnfConfiguration> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfConfigurationBuilder removeAugmentation(Class<? extends Augmentation<VnfConfiguration>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VnfConfiguration build() {
        return new VnfConfigurationImpl(this);
    }

    private static final class VnfConfigurationImpl implements VnfConfiguration {

        @Override
        public Class<VnfConfiguration> getImplementedInterface() {
            return VnfConfiguration.class;
        }

        private final ConfigMethod _configMethod;
        private final List<ConfigPrimitive> _configPrimitive;
        private final List<InitialConfigPrimitive> _initialConfigPrimitive;
        private final List<Metrics> _metrics;

        private Map<Class<? extends Augmentation<VnfConfiguration>>, Augmentation<VnfConfiguration>> augmentation = Collections.emptyMap();

        private VnfConfigurationImpl(VnfConfigurationBuilder base) {
            this._configMethod = base.getConfigMethod();
            this._configPrimitive = base.getConfigPrimitive();
            this._initialConfigPrimitive = base.getInitialConfigPrimitive();
            this._metrics = base.getMetrics();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public ConfigMethod getConfigMethod() {
            return _configMethod;
        }
        
        @Override
        public List<ConfigPrimitive> getConfigPrimitive() {
            return _configPrimitive;
        }
        
        @Override
        public List<InitialConfigPrimitive> getInitialConfigPrimitive() {
            return _initialConfigPrimitive;
        }
        
        @Override
        public List<Metrics> getMetrics() {
            return _metrics;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<VnfConfiguration>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_configMethod);
            result = prime * result + Objects.hashCode(_configPrimitive);
            result = prime * result + Objects.hashCode(_initialConfigPrimitive);
            result = prime * result + Objects.hashCode(_metrics);
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
            if (!VnfConfiguration.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            VnfConfiguration other = (VnfConfiguration)obj;
            if (!Objects.equals(_configMethod, other.getConfigMethod())) {
                return false;
            }
            if (!Objects.equals(_configPrimitive, other.getConfigPrimitive())) {
                return false;
            }
            if (!Objects.equals(_initialConfigPrimitive, other.getInitialConfigPrimitive())) {
                return false;
            }
            if (!Objects.equals(_metrics, other.getMetrics())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfConfigurationImpl otherImpl = (VnfConfigurationImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VnfConfiguration>>, Augmentation<VnfConfiguration>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VnfConfiguration");
            CodeHelpers.appendValue(helper, "_configMethod", _configMethod);
            CodeHelpers.appendValue(helper, "_configPrimitive", _configPrimitive);
            CodeHelpers.appendValue(helper, "_initialConfigPrimitive", _initialConfigPrimitive);
            CodeHelpers.appendValue(helper, "_metrics", _metrics);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
