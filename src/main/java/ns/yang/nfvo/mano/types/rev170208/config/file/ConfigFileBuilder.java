package ns.yang.nfvo.mano.types.rev170208.config.file;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;

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
 * Class that builds {@link ConfigFile} instances.
 * 
 * @see ConfigFile
 *
 */
public class ConfigFileBuilder implements Builder<ConfigFile> {

    private String _dest;
    private String _source;
    private ConfigFileKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("config-file");

    Map<Class<? extends Augmentation<ConfigFile>>, Augmentation<ConfigFile>> augmentation = Collections.emptyMap();

    public ConfigFileBuilder() {
    }

    public ConfigFileBuilder(ConfigFile base) {
        if (base.key() == null) {
            this.key = new ConfigFileKey(
                base.getSource()
            );
            this._source = base.getSource();
        } else {
            this.key = base.key();
            this._source = key.getSource();
        }
        this._dest = base.getDest();
        if (base instanceof ConfigFileImpl) {
            ConfigFileImpl impl = (ConfigFileImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ConfigFile> casted =(AugmentationHolder<ConfigFile>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public ConfigFileKey key() {
        return key;
    }
    
    public String getDest() {
        return _dest;
    }
    
    public String getSource() {
        return _source;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ConfigFile>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public ConfigFileBuilder withKey(final ConfigFileKey key) {
        this.key = key;
        return this;
    }
    
    public ConfigFileBuilder setDest(final String value) {
        this._dest = value;
        return this;
    }
    
    public ConfigFileBuilder setSource(final String value) {
        this._source = value;
        return this;
    }
    
    public ConfigFileBuilder addAugmentation(Class<? extends Augmentation<ConfigFile>> augmentationType, Augmentation<ConfigFile> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ConfigFileBuilder removeAugmentation(Class<? extends Augmentation<ConfigFile>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ConfigFile build() {
        return new ConfigFileImpl(this);
    }

    private static final class ConfigFileImpl implements ConfigFile {

        @Override
        public Class<ConfigFile> getImplementedInterface() {
            return ConfigFile.class;
        }

        private final String _dest;
        private final String _source;
        private final ConfigFileKey key;

        private Map<Class<? extends Augmentation<ConfigFile>>, Augmentation<ConfigFile>> augmentation = Collections.emptyMap();

        private ConfigFileImpl(ConfigFileBuilder base) {
            if (base.key() == null) {
                this.key = new ConfigFileKey(
                    base.getSource()
                );
                this._source = base.getSource();
            } else {
                this.key = base.key();
                this._source = key.getSource();
            }
            this._dest = base.getDest();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public ConfigFileKey key() {
            return key;
        }
        
        @Override
        public String getDest() {
            return _dest;
        }
        
        @Override
        public String getSource() {
            return _source;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ConfigFile>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_dest);
            result = prime * result + Objects.hashCode(_source);
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
            if (!ConfigFile.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ConfigFile other = (ConfigFile)obj;
            if (!Objects.equals(_dest, other.getDest())) {
                return false;
            }
            if (!Objects.equals(_source, other.getSource())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ConfigFileImpl otherImpl = (ConfigFileImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ConfigFile>>, Augmentation<ConfigFile>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ConfigFile");
            CodeHelpers.appendValue(helper, "_dest", _dest);
            CodeHelpers.appendValue(helper, "_source", _source);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
