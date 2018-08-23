package ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.openstack;
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
 * Class that builds {@link AvailabilityZone} instances.
 * 
 * @see AvailabilityZone
 *
 */
public class AvailabilityZoneBuilder implements Builder<AvailabilityZone> {

    private String _name;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("availability-zone");

    Map<Class<? extends Augmentation<AvailabilityZone>>, Augmentation<AvailabilityZone>> augmentation = Collections.emptyMap();

    public AvailabilityZoneBuilder() {
    }

    public AvailabilityZoneBuilder(AvailabilityZone base) {
        this._name = base.getName();
        if (base instanceof AvailabilityZoneImpl) {
            AvailabilityZoneImpl impl = (AvailabilityZoneImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<AvailabilityZone> casted =(AugmentationHolder<AvailabilityZone>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public String getName() {
        return _name;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<AvailabilityZone>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public AvailabilityZoneBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public AvailabilityZoneBuilder addAugmentation(Class<? extends Augmentation<AvailabilityZone>> augmentationType, Augmentation<AvailabilityZone> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public AvailabilityZoneBuilder removeAugmentation(Class<? extends Augmentation<AvailabilityZone>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public AvailabilityZone build() {
        return new AvailabilityZoneImpl(this);
    }

    private static final class AvailabilityZoneImpl implements AvailabilityZone {

        @Override
        public Class<AvailabilityZone> getImplementedInterface() {
            return AvailabilityZone.class;
        }

        private final String _name;

        private Map<Class<? extends Augmentation<AvailabilityZone>>, Augmentation<AvailabilityZone>> augmentation = Collections.emptyMap();

        private AvailabilityZoneImpl(AvailabilityZoneBuilder base) {
            this._name = base.getName();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public String getName() {
            return _name;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<AvailabilityZone>> E augmentation(Class<E> augmentationType) {
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
            if (!AvailabilityZone.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            AvailabilityZone other = (AvailabilityZone)obj;
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AvailabilityZoneImpl otherImpl = (AvailabilityZoneImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<AvailabilityZone>>, Augmentation<AvailabilityZone>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("AvailabilityZone");
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
