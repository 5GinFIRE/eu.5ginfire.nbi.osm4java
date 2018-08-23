package ns.yang.ietf.l2.topology.rev150623.l2.node.attributes;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.inet.types.rev100924.IpAddress;
import ns.yang.ietf.l2.topology.rev150623.$YangModuleInfoImpl;
import ns.yang.ietf.l2.topology.rev150623.FlagIdentity;
import ns.yang.ietf.l2.topology.rev150623.TrillNickname;
import ns.yang.ietf.l2.topology.rev150623.Vlan;

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
 * Class that builds {@link L2NodeAttributes} instances.
 * 
 * @see L2NodeAttributes
 *
 */
public class L2NodeAttributesBuilder implements Builder<L2NodeAttributes> {

    private String _description;
    private List<Class<? extends FlagIdentity>> _flag;
    private List<IpAddress> _managementAddress;
    private Vlan _managementVid;
    private String _name;
    private List<TrillNickname> _nickName;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("l2-node-attributes");

    Map<Class<? extends Augmentation<L2NodeAttributes>>, Augmentation<L2NodeAttributes>> augmentation = Collections.emptyMap();

    public L2NodeAttributesBuilder() {
    }

    public L2NodeAttributesBuilder(L2NodeAttributes base) {
        this._description = base.getDescription();
        this._flag = base.getFlag();
        this._managementAddress = base.getManagementAddress();
        this._managementVid = base.getManagementVid();
        this._name = base.getName();
        this._nickName = base.getNickName();
        if (base instanceof L2NodeAttributesImpl) {
            L2NodeAttributesImpl impl = (L2NodeAttributesImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<L2NodeAttributes> casted =(AugmentationHolder<L2NodeAttributes>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public String getDescription() {
        return _description;
    }
    
    public List<Class<? extends FlagIdentity>> getFlag() {
        return _flag;
    }
    
    public List<IpAddress> getManagementAddress() {
        return _managementAddress;
    }
    
    public Vlan getManagementVid() {
        return _managementVid;
    }
    
    public String getName() {
        return _name;
    }
    
    public List<TrillNickname> getNickName() {
        return _nickName;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<L2NodeAttributes>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public L2NodeAttributesBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    public L2NodeAttributesBuilder setFlag(final List<Class<? extends FlagIdentity>> values) {
        this._flag = values;
        return this;
    }
    
    public L2NodeAttributesBuilder setManagementAddress(final List<IpAddress> values) {
        this._managementAddress = values;
        return this;
    }
    
    
    public L2NodeAttributesBuilder setManagementVid(final Vlan value) {
        this._managementVid = value;
        return this;
    }
    
    public L2NodeAttributesBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    public L2NodeAttributesBuilder setNickName(final List<TrillNickname> values) {
        this._nickName = values;
        return this;
    }
    
    
    public L2NodeAttributesBuilder addAugmentation(Class<? extends Augmentation<L2NodeAttributes>> augmentationType, Augmentation<L2NodeAttributes> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public L2NodeAttributesBuilder removeAugmentation(Class<? extends Augmentation<L2NodeAttributes>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public L2NodeAttributes build() {
        return new L2NodeAttributesImpl(this);
    }

    private static final class L2NodeAttributesImpl implements L2NodeAttributes {

        @Override
        public Class<L2NodeAttributes> getImplementedInterface() {
            return L2NodeAttributes.class;
        }

        private final String _description;
        private final List<Class<? extends FlagIdentity>> _flag;
        private final List<IpAddress> _managementAddress;
        private final Vlan _managementVid;
        private final String _name;
        private final List<TrillNickname> _nickName;

        private Map<Class<? extends Augmentation<L2NodeAttributes>>, Augmentation<L2NodeAttributes>> augmentation = Collections.emptyMap();

        private L2NodeAttributesImpl(L2NodeAttributesBuilder base) {
            this._description = base.getDescription();
            this._flag = base.getFlag();
            this._managementAddress = base.getManagementAddress();
            this._managementVid = base.getManagementVid();
            this._name = base.getName();
            this._nickName = base.getNickName();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public String getDescription() {
            return _description;
        }
        
        @Override
        public List<Class<? extends FlagIdentity>> getFlag() {
            return _flag;
        }
        
        @Override
        public List<IpAddress> getManagementAddress() {
            return _managementAddress;
        }
        
        @Override
        public Vlan getManagementVid() {
            return _managementVid;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public List<TrillNickname> getNickName() {
            return _nickName;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<L2NodeAttributes>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_flag);
            result = prime * result + Objects.hashCode(_managementAddress);
            result = prime * result + Objects.hashCode(_managementVid);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_nickName);
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
            if (!L2NodeAttributes.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            L2NodeAttributes other = (L2NodeAttributes)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_flag, other.getFlag())) {
                return false;
            }
            if (!Objects.equals(_managementAddress, other.getManagementAddress())) {
                return false;
            }
            if (!Objects.equals(_managementVid, other.getManagementVid())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_nickName, other.getNickName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                L2NodeAttributesImpl otherImpl = (L2NodeAttributesImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<L2NodeAttributes>>, Augmentation<L2NodeAttributes>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("L2NodeAttributes");
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_flag", _flag);
            CodeHelpers.appendValue(helper, "_managementAddress", _managementAddress);
            CodeHelpers.appendValue(helper, "_managementVid", _managementVid);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_nickName", _nickName);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
