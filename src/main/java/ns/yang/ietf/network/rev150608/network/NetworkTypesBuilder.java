package ns.yang.ietf.network.rev150608.network;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.network.rev150608.$YangModuleInfoImpl;

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
 * Class that builds {@link NetworkTypes} instances.
 * 
 * @see NetworkTypes
 *
 */
public class NetworkTypesBuilder implements Builder<NetworkTypes> {


    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("network-types");

    Map<Class<? extends Augmentation<NetworkTypes>>, Augmentation<NetworkTypes>> augmentation = Collections.emptyMap();

    public NetworkTypesBuilder() {
    }

    public NetworkTypesBuilder(NetworkTypes base) {
        if (base instanceof NetworkTypesImpl) {
            NetworkTypesImpl impl = (NetworkTypesImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<NetworkTypes> casted =(AugmentationHolder<NetworkTypes>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<NetworkTypes>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public NetworkTypesBuilder addAugmentation(Class<? extends Augmentation<NetworkTypes>> augmentationType, Augmentation<NetworkTypes> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NetworkTypesBuilder removeAugmentation(Class<? extends Augmentation<NetworkTypes>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NetworkTypes build() {
        return new NetworkTypesImpl(this);
    }

    private static final class NetworkTypesImpl implements NetworkTypes {

        @Override
        public Class<NetworkTypes> getImplementedInterface() {
            return NetworkTypes.class;
        }


        private Map<Class<? extends Augmentation<NetworkTypes>>, Augmentation<NetworkTypes>> augmentation = Collections.emptyMap();

        private NetworkTypesImpl(NetworkTypesBuilder base) {
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<NetworkTypes>> E augmentation(Class<E> augmentationType) {
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
            if (!NetworkTypes.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            NetworkTypes other = (NetworkTypes)obj;
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NetworkTypesImpl otherImpl = (NetworkTypesImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<NetworkTypes>>, Augmentation<NetworkTypes>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("NetworkTypes");
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
