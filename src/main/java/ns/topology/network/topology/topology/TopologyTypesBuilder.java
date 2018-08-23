package ns.topology.network.topology.topology;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.topology.$YangModuleInfoImpl;

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
 * Class that builds {@link TopologyTypes} instances.
 * 
 * @see TopologyTypes
 *
 */
public class TopologyTypesBuilder implements Builder<TopologyTypes> {


    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("topology-types");

    Map<Class<? extends Augmentation<TopologyTypes>>, Augmentation<TopologyTypes>> augmentation = Collections.emptyMap();

    public TopologyTypesBuilder() {
    }

    public TopologyTypesBuilder(TopologyTypes base) {
        if (base instanceof TopologyTypesImpl) {
            TopologyTypesImpl impl = (TopologyTypesImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<TopologyTypes> casted =(AugmentationHolder<TopologyTypes>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<TopologyTypes>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public TopologyTypesBuilder addAugmentation(Class<? extends Augmentation<TopologyTypes>> augmentationType, Augmentation<TopologyTypes> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public TopologyTypesBuilder removeAugmentation(Class<? extends Augmentation<TopologyTypes>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public TopologyTypes build() {
        return new TopologyTypesImpl(this);
    }

    private static final class TopologyTypesImpl implements TopologyTypes {

        @Override
        public Class<TopologyTypes> getImplementedInterface() {
            return TopologyTypes.class;
        }


        private Map<Class<? extends Augmentation<TopologyTypes>>, Augmentation<TopologyTypes>> augmentation = Collections.emptyMap();

        private TopologyTypesImpl(TopologyTypesBuilder base) {
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<TopologyTypes>> E augmentation(Class<E> augmentationType) {
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
            if (!TopologyTypes.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            TopologyTypes other = (TopologyTypes)obj;
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                TopologyTypesImpl otherImpl = (TopologyTypesImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<TopologyTypes>>, Augmentation<TopologyTypes>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("TopologyTypes");
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
