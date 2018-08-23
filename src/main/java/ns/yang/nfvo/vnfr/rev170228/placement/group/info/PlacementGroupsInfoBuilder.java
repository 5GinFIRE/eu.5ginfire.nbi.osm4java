package ns.yang.nfvo.vnfr.rev170228.placement.group.info;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.CloudAccountType;
import ns.yang.nfvo.mano.types.rev170208.PlacementGroupInfo.Strategy;
import ns.yang.nfvo.mano.types.rev170208.placement.group.input.CloudProvider;
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
 * Class that builds {@link PlacementGroupsInfo} instances.
 * 
 * @see PlacementGroupsInfo
 *
 */
public class PlacementGroupsInfoBuilder implements Builder<PlacementGroupsInfo> {

    private CloudProvider _cloudProvider;
    private CloudAccountType _cloudType;
    private String _name;
    private String _requirement;
    private Strategy _strategy;
    private PlacementGroupsInfoKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("placement-groups-info");

    Map<Class<? extends Augmentation<PlacementGroupsInfo>>, Augmentation<PlacementGroupsInfo>> augmentation = Collections.emptyMap();

    public PlacementGroupsInfoBuilder() {
    }
    public PlacementGroupsInfoBuilder(ns.yang.nfvo.mano.types.rev170208.PlacementGroupInfo arg) {
        this._name = arg.getName();
        this._requirement = arg.getRequirement();
        this._strategy = arg.getStrategy();
    }
    public PlacementGroupsInfoBuilder(ns.yang.nfvo.mano.types.rev170208.PlacementGroupInput arg) {
        this._cloudType = arg.getCloudType();
        this._cloudProvider = arg.getCloudProvider();
    }

    public PlacementGroupsInfoBuilder(PlacementGroupsInfo base) {
        if (base.key() == null) {
            this.key = new PlacementGroupsInfoKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this.key = base.key();
            this._name = key.getName();
        }
        this._cloudProvider = base.getCloudProvider();
        this._cloudType = base.getCloudType();
        this._requirement = base.getRequirement();
        this._strategy = base.getStrategy();
        if (base instanceof PlacementGroupsInfoImpl) {
            PlacementGroupsInfoImpl impl = (PlacementGroupsInfoImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<PlacementGroupsInfo> casted =(AugmentationHolder<PlacementGroupsInfo>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInfo</li>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInput</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ns.yang.nfvo.mano.types.rev170208.PlacementGroupInfo) {
            this._name = ((ns.yang.nfvo.mano.types.rev170208.PlacementGroupInfo)arg).getName();
            this._requirement = ((ns.yang.nfvo.mano.types.rev170208.PlacementGroupInfo)arg).getRequirement();
            this._strategy = ((ns.yang.nfvo.mano.types.rev170208.PlacementGroupInfo)arg).getStrategy();
            isValidArg = true;
        }
        if (arg instanceof ns.yang.nfvo.mano.types.rev170208.PlacementGroupInput) {
            this._cloudType = ((ns.yang.nfvo.mano.types.rev170208.PlacementGroupInput)arg).getCloudType();
            this._cloudProvider = ((ns.yang.nfvo.mano.types.rev170208.PlacementGroupInput)arg).getCloudProvider();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInfo, model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInput]");
    }

    public PlacementGroupsInfoKey key() {
        return key;
    }
    
    public CloudProvider getCloudProvider() {
        return _cloudProvider;
    }
    
    public CloudAccountType getCloudType() {
        return _cloudType;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getRequirement() {
        return _requirement;
    }
    
    public Strategy getStrategy() {
        return _strategy;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<PlacementGroupsInfo>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public PlacementGroupsInfoBuilder withKey(final PlacementGroupsInfoKey key) {
        this.key = key;
        return this;
    }
    
    public PlacementGroupsInfoBuilder setCloudProvider(final CloudProvider value) {
        this._cloudProvider = value;
        return this;
    }
    
    public PlacementGroupsInfoBuilder setCloudType(final CloudAccountType value) {
        this._cloudType = value;
        return this;
    }
    
    public PlacementGroupsInfoBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public PlacementGroupsInfoBuilder setRequirement(final String value) {
        this._requirement = value;
        return this;
    }
    
    public PlacementGroupsInfoBuilder setStrategy(final Strategy value) {
        this._strategy = value;
        return this;
    }
    
    public PlacementGroupsInfoBuilder addAugmentation(Class<? extends Augmentation<PlacementGroupsInfo>> augmentationType, Augmentation<PlacementGroupsInfo> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public PlacementGroupsInfoBuilder removeAugmentation(Class<? extends Augmentation<PlacementGroupsInfo>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public PlacementGroupsInfo build() {
        return new PlacementGroupsInfoImpl(this);
    }

    private static final class PlacementGroupsInfoImpl implements PlacementGroupsInfo {

        @Override
        public Class<PlacementGroupsInfo> getImplementedInterface() {
            return PlacementGroupsInfo.class;
        }

        private final CloudProvider _cloudProvider;
        private final CloudAccountType _cloudType;
        private final String _name;
        private final String _requirement;
        private final Strategy _strategy;
        private final PlacementGroupsInfoKey key;

        private Map<Class<? extends Augmentation<PlacementGroupsInfo>>, Augmentation<PlacementGroupsInfo>> augmentation = Collections.emptyMap();

        private PlacementGroupsInfoImpl(PlacementGroupsInfoBuilder base) {
            if (base.key() == null) {
                this.key = new PlacementGroupsInfoKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this.key = base.key();
                this._name = key.getName();
            }
            this._cloudProvider = base.getCloudProvider();
            this._cloudType = base.getCloudType();
            this._requirement = base.getRequirement();
            this._strategy = base.getStrategy();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public PlacementGroupsInfoKey key() {
            return key;
        }
        
        @Override
        public CloudProvider getCloudProvider() {
            return _cloudProvider;
        }
        
        @Override
        public CloudAccountType getCloudType() {
            return _cloudType;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public String getRequirement() {
            return _requirement;
        }
        
        @Override
        public Strategy getStrategy() {
            return _strategy;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<PlacementGroupsInfo>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cloudProvider);
            result = prime * result + Objects.hashCode(_cloudType);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_requirement);
            result = prime * result + Objects.hashCode(_strategy);
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
            if (!PlacementGroupsInfo.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            PlacementGroupsInfo other = (PlacementGroupsInfo)obj;
            if (!Objects.equals(_cloudProvider, other.getCloudProvider())) {
                return false;
            }
            if (!Objects.equals(_cloudType, other.getCloudType())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_requirement, other.getRequirement())) {
                return false;
            }
            if (!Objects.equals(_strategy, other.getStrategy())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                PlacementGroupsInfoImpl otherImpl = (PlacementGroupsInfoImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<PlacementGroupsInfo>>, Augmentation<PlacementGroupsInfo>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("PlacementGroupsInfo");
            CodeHelpers.appendValue(helper, "_cloudProvider", _cloudProvider);
            CodeHelpers.appendValue(helper, "_cloudType", _cloudType);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_requirement", _requirement);
            CodeHelpers.appendValue(helper, "_strategy", _strategy);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
