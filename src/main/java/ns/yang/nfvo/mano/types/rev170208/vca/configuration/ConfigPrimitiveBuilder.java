package ns.yang.nfvo.mano.types.rev170208.vca.configuration;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.primitive.Parameter;

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
 * Class that builds {@link ConfigPrimitive} instances.
 * 
 * @see ConfigPrimitive
 *
 */
public class ConfigPrimitiveBuilder implements Builder<ConfigPrimitive> {

    private String _name;
    private List<Parameter> _parameter;
    private String _userDefinedScript;
    private ConfigPrimitiveKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("config-primitive");

    Map<Class<? extends Augmentation<ConfigPrimitive>>, Augmentation<ConfigPrimitive>> augmentation = Collections.emptyMap();

    public ConfigPrimitiveBuilder() {
    }

    public ConfigPrimitiveBuilder(ConfigPrimitive base) {
        if (base.key() == null) {
            this.key = new ConfigPrimitiveKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this.key = base.key();
            this._name = key.getName();
        }
        this._parameter = base.getParameter();
        this._userDefinedScript = base.getUserDefinedScript();
        if (base instanceof ConfigPrimitiveImpl) {
            ConfigPrimitiveImpl impl = (ConfigPrimitiveImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ConfigPrimitive> casted =(AugmentationHolder<ConfigPrimitive>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public ConfigPrimitiveKey key() {
        return key;
    }
    
    public String getName() {
        return _name;
    }
    
    public List<Parameter> getParameter() {
        return _parameter;
    }
    
    public String getUserDefinedScript() {
        return _userDefinedScript;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ConfigPrimitive>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public ConfigPrimitiveBuilder withKey(final ConfigPrimitiveKey key) {
        this.key = key;
        return this;
    }
    
    public ConfigPrimitiveBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    public ConfigPrimitiveBuilder setParameter(final List<Parameter> values) {
        this._parameter = values;
        return this;
    }
    
    
    public ConfigPrimitiveBuilder setUserDefinedScript(final String value) {
        this._userDefinedScript = value;
        return this;
    }
    
    public ConfigPrimitiveBuilder addAugmentation(Class<? extends Augmentation<ConfigPrimitive>> augmentationType, Augmentation<ConfigPrimitive> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ConfigPrimitiveBuilder removeAugmentation(Class<? extends Augmentation<ConfigPrimitive>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ConfigPrimitive build() {
        return new ConfigPrimitiveImpl(this);
    }

    private static final class ConfigPrimitiveImpl implements ConfigPrimitive {

        @Override
        public Class<ConfigPrimitive> getImplementedInterface() {
            return ConfigPrimitive.class;
        }

        private final String _name;
        private final List<Parameter> _parameter;
        private final String _userDefinedScript;
        private final ConfigPrimitiveKey key;

        private Map<Class<? extends Augmentation<ConfigPrimitive>>, Augmentation<ConfigPrimitive>> augmentation = Collections.emptyMap();

        private ConfigPrimitiveImpl(ConfigPrimitiveBuilder base) {
            if (base.key() == null) {
                this.key = new ConfigPrimitiveKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this.key = base.key();
                this._name = key.getName();
            }
            this._parameter = base.getParameter();
            this._userDefinedScript = base.getUserDefinedScript();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public ConfigPrimitiveKey key() {
            return key;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public List<Parameter> getParameter() {
            return _parameter;
        }
        
        @Override
        public String getUserDefinedScript() {
            return _userDefinedScript;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ConfigPrimitive>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_parameter);
            result = prime * result + Objects.hashCode(_userDefinedScript);
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
            if (!ConfigPrimitive.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ConfigPrimitive other = (ConfigPrimitive)obj;
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_parameter, other.getParameter())) {
                return false;
            }
            if (!Objects.equals(_userDefinedScript, other.getUserDefinedScript())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ConfigPrimitiveImpl otherImpl = (ConfigPrimitiveImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ConfigPrimitive>>, Augmentation<ConfigPrimitive>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ConfigPrimitive");
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_parameter", _parameter);
            CodeHelpers.appendValue(helper, "_userDefinedScript", _userDefinedScript);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
