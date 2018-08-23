package ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.ethernet;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.l2.topology.rev150623.$YangModuleInfoImpl;
import ns.yang.ietf.l2.topology.rev150623.Vlan;

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
 * Class that builds {@link VlanIdName} instances.
 * 
 * @see VlanIdName
 *
 */
public class VlanIdNameBuilder implements Builder<VlanIdName> {

    private Vlan _vlanId;
    private String _vlanName;
    private VlanIdNameKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vlan-id-name");

    Map<Class<? extends Augmentation<VlanIdName>>, Augmentation<VlanIdName>> augmentation = Collections.emptyMap();

    public VlanIdNameBuilder() {
    }

    public VlanIdNameBuilder(VlanIdName base) {
        if (base.key() == null) {
            this.key = new VlanIdNameKey(
                base.getVlanId()
            );
            this._vlanId = base.getVlanId();
        } else {
            this.key = base.key();
            this._vlanId = key.getVlanId();
        }
        this._vlanName = base.getVlanName();
        if (base instanceof VlanIdNameImpl) {
            VlanIdNameImpl impl = (VlanIdNameImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<VlanIdName> casted =(AugmentationHolder<VlanIdName>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public VlanIdNameKey key() {
        return key;
    }
    
    public Vlan getVlanId() {
        return _vlanId;
    }
    
    public String getVlanName() {
        return _vlanName;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<VlanIdName>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public VlanIdNameBuilder withKey(final VlanIdNameKey key) {
        this.key = key;
        return this;
    }
    
    public VlanIdNameBuilder setVlanId(final Vlan value) {
        this._vlanId = value;
        return this;
    }
    
    public VlanIdNameBuilder setVlanName(final String value) {
        this._vlanName = value;
        return this;
    }
    
    public VlanIdNameBuilder addAugmentation(Class<? extends Augmentation<VlanIdName>> augmentationType, Augmentation<VlanIdName> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VlanIdNameBuilder removeAugmentation(Class<? extends Augmentation<VlanIdName>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VlanIdName build() {
        return new VlanIdNameImpl(this);
    }

    private static final class VlanIdNameImpl implements VlanIdName {

        @Override
        public Class<VlanIdName> getImplementedInterface() {
            return VlanIdName.class;
        }

        private final Vlan _vlanId;
        private final String _vlanName;
        private final VlanIdNameKey key;

        private Map<Class<? extends Augmentation<VlanIdName>>, Augmentation<VlanIdName>> augmentation = Collections.emptyMap();

        private VlanIdNameImpl(VlanIdNameBuilder base) {
            if (base.key() == null) {
                this.key = new VlanIdNameKey(
                    base.getVlanId()
                );
                this._vlanId = base.getVlanId();
            } else {
                this.key = base.key();
                this._vlanId = key.getVlanId();
            }
            this._vlanName = base.getVlanName();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public VlanIdNameKey key() {
            return key;
        }
        
        @Override
        public Vlan getVlanId() {
            return _vlanId;
        }
        
        @Override
        public String getVlanName() {
            return _vlanName;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<VlanIdName>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_vlanId);
            result = prime * result + Objects.hashCode(_vlanName);
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
            if (!VlanIdName.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            VlanIdName other = (VlanIdName)obj;
            if (!Objects.equals(_vlanId, other.getVlanId())) {
                return false;
            }
            if (!Objects.equals(_vlanName, other.getVlanName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VlanIdNameImpl otherImpl = (VlanIdNameImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VlanIdName>>, Augmentation<VlanIdName>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VlanIdName");
            CodeHelpers.appendValue(helper, "_vlanId", _vlanId);
            CodeHelpers.appendValue(helper, "_vlanName", _vlanName);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
