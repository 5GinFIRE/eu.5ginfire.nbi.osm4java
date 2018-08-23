package ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.l2.topology.rev150623.$YangModuleInfoImpl;
import ns.yang.ietf.l2.topology.rev150623.EthEncapsulationType;
import ns.yang.ietf.l2.topology.rev150623.Vlan;
import ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type.ethernet.VlanIdName;
import ns.yang.ietf.yang.types.rev130715.MacAddress;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;

import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Class that builds {@link Ethernet} instances.
 * 
 * @see Ethernet
 *
 */
public class EthernetBuilder implements Builder<Ethernet> {

    private Class<? extends EthEncapsulationType> _ethEncapsulation;
    private MacAddress _macAddress;
    private Vlan _portVlanId;
    private List<VlanIdName> _vlanIdName;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ethernet");
    private static final Pattern patterns_macAddress = Pattern.compile("^(?:[0-9a-fA-F]{2}(:[0-9a-fA-F]{2}){5})$");
    private static final String regexes_macAddress = "[0-9a-fA-F]{2}(:[0-9a-fA-F]{2}){5}";

    Map<Class<? extends Augmentation<Ethernet>>, Augmentation<Ethernet>> augmentation = Collections.emptyMap();

    public EthernetBuilder() {
    }

    public EthernetBuilder(Ethernet base) {
        this._ethEncapsulation = base.getEthEncapsulation();
        this._macAddress = base.getMacAddress();
        this._portVlanId = base.getPortVlanId();
        this._vlanIdName = base.getVlanIdName();
        if (base instanceof EthernetImpl) {
            EthernetImpl impl = (EthernetImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Ethernet> casted =(AugmentationHolder<Ethernet>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public Class<? extends EthEncapsulationType> getEthEncapsulation() {
        return _ethEncapsulation;
    }
    
    public MacAddress getMacAddress() {
        return _macAddress;
    }
    
    public Vlan getPortVlanId() {
        return _portVlanId;
    }
    
    public List<VlanIdName> getVlanIdName() {
        return _vlanIdName;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Ethernet>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public EthernetBuilder setEthEncapsulation(final Class<? extends EthEncapsulationType> value) {
        this._ethEncapsulation = value;
        return this;
    }
    
    public EthernetBuilder setMacAddress(final MacAddress value) {
        this._macAddress = value;
        return this;
    }
    
    public EthernetBuilder setPortVlanId(final Vlan value) {
        this._portVlanId = value;
        return this;
    }
    public EthernetBuilder setVlanIdName(final List<VlanIdName> values) {
        this._vlanIdName = values;
        return this;
    }
    
    
    public EthernetBuilder addAugmentation(Class<? extends Augmentation<Ethernet>> augmentationType, Augmentation<Ethernet> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public EthernetBuilder removeAugmentation(Class<? extends Augmentation<Ethernet>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Ethernet build() {
        return new EthernetImpl(this);
    }

    private static final class EthernetImpl implements Ethernet {

        @Override
        public Class<Ethernet> getImplementedInterface() {
            return Ethernet.class;
        }

        private final Class<? extends EthEncapsulationType> _ethEncapsulation;
        private final MacAddress _macAddress;
        private final Vlan _portVlanId;
        private final List<VlanIdName> _vlanIdName;

        private Map<Class<? extends Augmentation<Ethernet>>, Augmentation<Ethernet>> augmentation = Collections.emptyMap();

        private EthernetImpl(EthernetBuilder base) {
            this._ethEncapsulation = base.getEthEncapsulation();
            this._macAddress = base.getMacAddress();
            this._portVlanId = base.getPortVlanId();
            this._vlanIdName = base.getVlanIdName();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public Class<? extends EthEncapsulationType> getEthEncapsulation() {
            return _ethEncapsulation;
        }
        
        @Override
        public MacAddress getMacAddress() {
            return _macAddress;
        }
        
        @Override
        public Vlan getPortVlanId() {
            return _portVlanId;
        }
        
        @Override
        public List<VlanIdName> getVlanIdName() {
            return _vlanIdName;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Ethernet>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_ethEncapsulation);
            result = prime * result + Objects.hashCode(_macAddress);
            result = prime * result + Objects.hashCode(_portVlanId);
            result = prime * result + Objects.hashCode(_vlanIdName);
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
            if (!Ethernet.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Ethernet other = (Ethernet)obj;
            if (!Objects.equals(_ethEncapsulation, other.getEthEncapsulation())) {
                return false;
            }
            if (!Objects.equals(_macAddress, other.getMacAddress())) {
                return false;
            }
            if (!Objects.equals(_portVlanId, other.getPortVlanId())) {
                return false;
            }
            if (!Objects.equals(_vlanIdName, other.getVlanIdName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                EthernetImpl otherImpl = (EthernetImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Ethernet>>, Augmentation<Ethernet>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Ethernet");
            CodeHelpers.appendValue(helper, "_ethEncapsulation", _ethEncapsulation);
            CodeHelpers.appendValue(helper, "_macAddress", _macAddress);
            CodeHelpers.appendValue(helper, "_portVlanId", _portVlanId);
            CodeHelpers.appendValue(helper, "_vlanIdName", _vlanIdName);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
