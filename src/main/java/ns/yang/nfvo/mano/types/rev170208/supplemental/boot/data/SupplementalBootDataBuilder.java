package ns.yang.nfvo.mano.types.rev170208.supplemental.boot.data;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.config.file.ConfigFile;

import java.lang.Boolean;
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
 * Class that builds {@link SupplementalBootData} instances.
 * 
 * @see SupplementalBootData
 *
 */
public class SupplementalBootDataBuilder implements Builder<SupplementalBootData> {

    private List<ConfigFile> _configFile;
    private Boolean _bootDataDrive;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("supplemental-boot-data");

    Map<Class<? extends Augmentation<SupplementalBootData>>, Augmentation<SupplementalBootData>> augmentation = Collections.emptyMap();

    public SupplementalBootDataBuilder() {
    }
    public SupplementalBootDataBuilder(ns.yang.nfvo.mano.types.rev170208.ConfigFile arg) {
        this._configFile = arg.getConfigFile();
    }

    public SupplementalBootDataBuilder(SupplementalBootData base) {
        this._configFile = base.getConfigFile();
        this._bootDataDrive = base.isBootDataDrive();
        if (base instanceof SupplementalBootDataImpl) {
            SupplementalBootDataImpl impl = (SupplementalBootDataImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<SupplementalBootData> casted =(AugmentationHolder<SupplementalBootData>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ConfigFile</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ns.yang.nfvo.mano.types.rev170208.ConfigFile) {
            this._configFile = ((ns.yang.nfvo.mano.types.rev170208.ConfigFile)arg).getConfigFile();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ConfigFile]");
    }

    public List<ConfigFile> getConfigFile() {
        return _configFile;
    }
    
    public Boolean isBootDataDrive() {
        return _bootDataDrive;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<SupplementalBootData>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public SupplementalBootDataBuilder setConfigFile(final List<ConfigFile> values) {
        this._configFile = values;
        return this;
    }
    
    
    public SupplementalBootDataBuilder setBootDataDrive(final Boolean value) {
        this._bootDataDrive = value;
        return this;
    }
    
    public SupplementalBootDataBuilder addAugmentation(Class<? extends Augmentation<SupplementalBootData>> augmentationType, Augmentation<SupplementalBootData> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public SupplementalBootDataBuilder removeAugmentation(Class<? extends Augmentation<SupplementalBootData>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public SupplementalBootData build() {
        return new SupplementalBootDataImpl(this);
    }

    private static final class SupplementalBootDataImpl implements SupplementalBootData {

        @Override
        public Class<SupplementalBootData> getImplementedInterface() {
            return SupplementalBootData.class;
        }

        private final List<ConfigFile> _configFile;
        private final Boolean _bootDataDrive;

        private Map<Class<? extends Augmentation<SupplementalBootData>>, Augmentation<SupplementalBootData>> augmentation = Collections.emptyMap();

        private SupplementalBootDataImpl(SupplementalBootDataBuilder base) {
            this._configFile = base.getConfigFile();
            this._bootDataDrive = base.isBootDataDrive();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public List<ConfigFile> getConfigFile() {
            return _configFile;
        }
        
        @Override
        public Boolean isBootDataDrive() {
            return _bootDataDrive;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<SupplementalBootData>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_configFile);
            result = prime * result + Objects.hashCode(_bootDataDrive);
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
            if (!SupplementalBootData.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            SupplementalBootData other = (SupplementalBootData)obj;
            if (!Objects.equals(_configFile, other.getConfigFile())) {
                return false;
            }
            if (!Objects.equals(_bootDataDrive, other.isBootDataDrive())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SupplementalBootDataImpl otherImpl = (SupplementalBootDataImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<SupplementalBootData>>, Augmentation<SupplementalBootData>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("SupplementalBootData");
            CodeHelpers.appendValue(helper, "_configFile", _configFile);
            CodeHelpers.appendValue(helper, "_bootDataDrive", _bootDataDrive);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
