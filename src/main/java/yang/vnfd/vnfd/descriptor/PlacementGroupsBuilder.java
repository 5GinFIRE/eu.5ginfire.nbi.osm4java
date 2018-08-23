package yang.vnfd.vnfd.descriptor;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.PlacementGroupInfo.Strategy;
import yang.vnfd.$YangModuleInfoImpl;
import yang.vnfd.vnfd.descriptor.placement.groups.MemberVdus;

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
 * Class that builds {@link PlacementGroups} instances.
 * 
 * @see PlacementGroups
 *
 */
public class PlacementGroupsBuilder implements Builder<PlacementGroups> {

    private List<MemberVdus> _memberVdus;
    private String _name;
    private String _requirement;
    private Strategy _strategy;
    private PlacementGroupsKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("placement-groups");

    Map<Class<? extends Augmentation<PlacementGroups>>, Augmentation<PlacementGroups>> augmentation = Collections.emptyMap();

    public PlacementGroupsBuilder() {
    }
    public PlacementGroupsBuilder(ns.yang.nfvo.mano.types.rev170208.PlacementGroupInfo arg) {
        this._name = arg.getName();
        this._requirement = arg.getRequirement();
        this._strategy = arg.getStrategy();
    }

    public PlacementGroupsBuilder(PlacementGroups base) {
        if (base.key() == null) {
            this.key = new PlacementGroupsKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this.key = base.key();
            this._name = key.getName();
        }
        this._memberVdus = base.getMemberVdus();
        this._requirement = base.getRequirement();
        this._strategy = base.getStrategy();
        if (base instanceof PlacementGroupsImpl) {
            PlacementGroupsImpl impl = (PlacementGroupsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<PlacementGroups> casted =(AugmentationHolder<PlacementGroups>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInfo</li>
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
        CodeHelpers.validValue(isValidArg, arg, "[model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PlacementGroupInfo]");
    }

    public PlacementGroupsKey key() {
        return key;
    }
    
    public List<MemberVdus> getMemberVdus() {
        return _memberVdus;
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
    public <E extends Augmentation<PlacementGroups>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public PlacementGroupsBuilder withKey(final PlacementGroupsKey key) {
        this.key = key;
        return this;
    }
    public PlacementGroupsBuilder setMemberVdus(final List<MemberVdus> values) {
        this._memberVdus = values;
        return this;
    }
    
    
    public PlacementGroupsBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public PlacementGroupsBuilder setRequirement(final String value) {
        this._requirement = value;
        return this;
    }
    
    public PlacementGroupsBuilder setStrategy(final Strategy value) {
        this._strategy = value;
        return this;
    }
    
    public PlacementGroupsBuilder addAugmentation(Class<? extends Augmentation<PlacementGroups>> augmentationType, Augmentation<PlacementGroups> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public PlacementGroupsBuilder removeAugmentation(Class<? extends Augmentation<PlacementGroups>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public PlacementGroups build() {
        return new PlacementGroupsImpl(this);
    }

    private static final class PlacementGroupsImpl implements PlacementGroups {

        @Override
        public Class<PlacementGroups> getImplementedInterface() {
            return PlacementGroups.class;
        }

        private final List<MemberVdus> _memberVdus;
        private final String _name;
        private final String _requirement;
        private final Strategy _strategy;
        private final PlacementGroupsKey key;

        private Map<Class<? extends Augmentation<PlacementGroups>>, Augmentation<PlacementGroups>> augmentation = Collections.emptyMap();

        private PlacementGroupsImpl(PlacementGroupsBuilder base) {
            if (base.key() == null) {
                this.key = new PlacementGroupsKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this.key = base.key();
                this._name = key.getName();
            }
            this._memberVdus = base.getMemberVdus();
            this._requirement = base.getRequirement();
            this._strategy = base.getStrategy();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public PlacementGroupsKey key() {
            return key;
        }
        
        @Override
        public List<MemberVdus> getMemberVdus() {
            return _memberVdus;
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
        public <E extends Augmentation<PlacementGroups>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_memberVdus);
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
            if (!PlacementGroups.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            PlacementGroups other = (PlacementGroups)obj;
            if (!Objects.equals(_memberVdus, other.getMemberVdus())) {
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
                PlacementGroupsImpl otherImpl = (PlacementGroupsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<PlacementGroups>>, Augmentation<PlacementGroups>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("PlacementGroups");
            CodeHelpers.appendValue(helper, "_memberVdus", _memberVdus);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_requirement", _requirement);
            CodeHelpers.appendValue(helper, "_strategy", _strategy);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
