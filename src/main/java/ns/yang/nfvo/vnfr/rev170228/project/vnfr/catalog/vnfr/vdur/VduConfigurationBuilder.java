package ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.vca.configuration.ConfigMethod;
import ns.yang.nfvo.mano.types.rev170208.vca.configuration.ConfigPrimitive;
import ns.yang.nfvo.mano.types.rev170208.vca.configuration.InitialConfigPrimitive;
import ns.yang.nfvo.mano.types.rev170208.vca.metrics.Metrics;
import ns.yang.nfvo.vnfr.rev170228.$YangModuleInfoImpl;

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
 * Class that builds {@link VduConfiguration} instances.
 * 
 * @see VduConfiguration
 *
 */
public class VduConfigurationBuilder implements Builder<VduConfiguration> {

    private ConfigMethod _configMethod;
    private List<ConfigPrimitive> _configPrimitive;
    private List<InitialConfigPrimitive> _initialConfigPrimitive;
    private List<Metrics> _metrics;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vdu-configuration");

    Map<Class<? extends Augmentation<VduConfiguration>>, Augmentation<VduConfiguration>> augmentation = Collections.emptyMap();

    public VduConfigurationBuilder() {
    }
    public VduConfigurationBuilder(ns.yang.nfvo.mano.types.rev170208.VcaConfiguration arg) {
        this._configMethod = arg.getConfigMethod();
        this._configPrimitive = arg.getConfigPrimitive();
        this._initialConfigPrimitive = arg.getInitialConfigPrimitive();
        this._metrics = arg.getMetrics();
    }
    public VduConfigurationBuilder(ns.yang.nfvo.mano.types.rev170208.VcaMetrics arg) {
        this._metrics = arg.getMetrics();
    }

    public VduConfigurationBuilder(VduConfiguration base) {
        this._configMethod = base.getConfigMethod();
        this._configPrimitive = base.getConfigPrimitive();
        this._initialConfigPrimitive = base.getInitialConfigPrimitive();
        this._metrics = base.getMetrics();
        if (base instanceof VduConfigurationImpl) {
            VduConfigurationImpl impl = (VduConfigurationImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<VduConfiguration> casted =(AugmentationHolder<VduConfiguration>) base;
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
    public <E extends Augmentation<VduConfiguration>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public VduConfigurationBuilder setConfigMethod(final ConfigMethod value) {
        this._configMethod = value;
        return this;
    }
    public VduConfigurationBuilder setConfigPrimitive(final List<ConfigPrimitive> values) {
        this._configPrimitive = values;
        return this;
    }
    
    public VduConfigurationBuilder setInitialConfigPrimitive(final List<InitialConfigPrimitive> values) {
        this._initialConfigPrimitive = values;
        return this;
    }
    
    public VduConfigurationBuilder setMetrics(final List<Metrics> values) {
        this._metrics = values;
        return this;
    }
    
    
    public VduConfigurationBuilder addAugmentation(Class<? extends Augmentation<VduConfiguration>> augmentationType, Augmentation<VduConfiguration> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VduConfigurationBuilder removeAugmentation(Class<? extends Augmentation<VduConfiguration>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VduConfiguration build() {
        return new VduConfigurationImpl(this);
    }

    private static final class VduConfigurationImpl implements VduConfiguration {

        @Override
        public Class<VduConfiguration> getImplementedInterface() {
            return VduConfiguration.class;
        }

        private final ConfigMethod _configMethod;
        private final List<ConfigPrimitive> _configPrimitive;
        private final List<InitialConfigPrimitive> _initialConfigPrimitive;
        private final List<Metrics> _metrics;

        private Map<Class<? extends Augmentation<VduConfiguration>>, Augmentation<VduConfiguration>> augmentation = Collections.emptyMap();

        private VduConfigurationImpl(VduConfigurationBuilder base) {
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
        public <E extends Augmentation<VduConfiguration>> E augmentation(Class<E> augmentationType) {
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
            if (!VduConfiguration.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            VduConfiguration other = (VduConfiguration)obj;
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
                VduConfigurationImpl otherImpl = (VduConfigurationImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VduConfiguration>>, Augmentation<VduConfiguration>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VduConfiguration");
            CodeHelpers.appendValue(helper, "_configMethod", _configMethod);
            CodeHelpers.appendValue(helper, "_configPrimitive", _configPrimitive);
            CodeHelpers.appendValue(helper, "_initialConfigPrimitive", _initialConfigPrimitive);
            CodeHelpers.appendValue(helper, "_metrics", _metrics);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
