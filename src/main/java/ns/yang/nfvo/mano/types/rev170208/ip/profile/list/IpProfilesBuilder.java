package ns.yang.nfvo.mano.types.rev170208.ip.profile.list;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.ip.profile.info.IpProfileParams;

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
 * Class that builds {@link IpProfiles} instances.
 * 
 * @see IpProfiles
 *
 */
public class IpProfilesBuilder implements Builder<IpProfiles> {

    private String _description;
    private IpProfileParams _ipProfileParams;
    private String _name;
    private IpProfilesKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ip-profiles");

    Map<Class<? extends Augmentation<IpProfiles>>, Augmentation<IpProfiles>> augmentation = Collections.emptyMap();

    public IpProfilesBuilder() {
    }
    public IpProfilesBuilder(ns.yang.nfvo.mano.types.rev170208.IpProfileInfo arg) {
        this._ipProfileParams = arg.getIpProfileParams();
    }

    public IpProfilesBuilder(IpProfiles base) {
        if (base.key() == null) {
            this.key = new IpProfilesKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this.key = base.key();
            this._name = key.getName();
        }
        this._description = base.getDescription();
        this._ipProfileParams = base.getIpProfileParams();
        if (base instanceof IpProfilesImpl) {
            IpProfilesImpl impl = (IpProfilesImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<IpProfiles> casted =(AugmentationHolder<IpProfiles>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.IpProfileInfo</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ns.yang.nfvo.mano.types.rev170208.IpProfileInfo) {
            this._ipProfileParams = ((ns.yang.nfvo.mano.types.rev170208.IpProfileInfo)arg).getIpProfileParams();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.IpProfileInfo]");
    }

    public IpProfilesKey key() {
        return key;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public IpProfileParams getIpProfileParams() {
        return _ipProfileParams;
    }
    
    public String getName() {
        return _name;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<IpProfiles>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public IpProfilesBuilder withKey(final IpProfilesKey key) {
        this.key = key;
        return this;
    }
    
    public IpProfilesBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public IpProfilesBuilder setIpProfileParams(final IpProfileParams value) {
        this._ipProfileParams = value;
        return this;
    }
    
    public IpProfilesBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public IpProfilesBuilder addAugmentation(Class<? extends Augmentation<IpProfiles>> augmentationType, Augmentation<IpProfiles> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public IpProfilesBuilder removeAugmentation(Class<? extends Augmentation<IpProfiles>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public IpProfiles build() {
        return new IpProfilesImpl(this);
    }

    private static final class IpProfilesImpl implements IpProfiles {

        @Override
        public Class<IpProfiles> getImplementedInterface() {
            return IpProfiles.class;
        }

        private final String _description;
        private final IpProfileParams _ipProfileParams;
        private final String _name;
        private final IpProfilesKey key;

        private Map<Class<? extends Augmentation<IpProfiles>>, Augmentation<IpProfiles>> augmentation = Collections.emptyMap();

        private IpProfilesImpl(IpProfilesBuilder base) {
            if (base.key() == null) {
                this.key = new IpProfilesKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this.key = base.key();
                this._name = key.getName();
            }
            this._description = base.getDescription();
            this._ipProfileParams = base.getIpProfileParams();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public IpProfilesKey key() {
            return key;
        }
        
        @Override
        public String getDescription() {
            return _description;
        }
        
        @Override
        public IpProfileParams getIpProfileParams() {
            return _ipProfileParams;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<IpProfiles>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_ipProfileParams);
            result = prime * result + Objects.hashCode(_name);
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
            if (!IpProfiles.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            IpProfiles other = (IpProfiles)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_ipProfileParams, other.getIpProfileParams())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                IpProfilesImpl otherImpl = (IpProfilesImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<IpProfiles>>, Augmentation<IpProfiles>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("IpProfiles");
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_ipProfileParams", _ipProfileParams);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
