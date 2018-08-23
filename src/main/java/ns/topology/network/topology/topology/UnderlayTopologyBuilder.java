package ns.topology.network.topology.topology;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.topology.$YangModuleInfoImpl;
import ns.topology.TopologyId;

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
 * Class that builds {@link UnderlayTopology} instances.
 * 
 * @see UnderlayTopology
 *
 */
public class UnderlayTopologyBuilder implements Builder<UnderlayTopology> {

    private TopologyId _topologyRef;
    private UnderlayTopologyKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("underlay-topology");

    Map<Class<? extends Augmentation<UnderlayTopology>>, Augmentation<UnderlayTopology>> augmentation = Collections.emptyMap();

    public UnderlayTopologyBuilder() {
    }

    public UnderlayTopologyBuilder(UnderlayTopology base) {
        if (base.key() == null) {
            this.key = new UnderlayTopologyKey(
                base.getTopologyRef()
            );
            this._topologyRef = base.getTopologyRef();
        } else {
            this.key = base.key();
            this._topologyRef = key.getTopologyRef();
        }
        if (base instanceof UnderlayTopologyImpl) {
            UnderlayTopologyImpl impl = (UnderlayTopologyImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<UnderlayTopology> casted =(AugmentationHolder<UnderlayTopology>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public UnderlayTopologyKey key() {
        return key;
    }
    
    public TopologyId getTopologyRef() {
        return _topologyRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<UnderlayTopology>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public UnderlayTopologyBuilder withKey(final UnderlayTopologyKey key) {
        this.key = key;
        return this;
    }
    
    public UnderlayTopologyBuilder setTopologyRef(final TopologyId value) {
        this._topologyRef = value;
        return this;
    }
    
    public UnderlayTopologyBuilder addAugmentation(Class<? extends Augmentation<UnderlayTopology>> augmentationType, Augmentation<UnderlayTopology> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public UnderlayTopologyBuilder removeAugmentation(Class<? extends Augmentation<UnderlayTopology>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public UnderlayTopology build() {
        return new UnderlayTopologyImpl(this);
    }

    private static final class UnderlayTopologyImpl implements UnderlayTopology {

        @Override
        public Class<UnderlayTopology> getImplementedInterface() {
            return UnderlayTopology.class;
        }

        private final TopologyId _topologyRef;
        private final UnderlayTopologyKey key;

        private Map<Class<? extends Augmentation<UnderlayTopology>>, Augmentation<UnderlayTopology>> augmentation = Collections.emptyMap();

        private UnderlayTopologyImpl(UnderlayTopologyBuilder base) {
            if (base.key() == null) {
                this.key = new UnderlayTopologyKey(
                    base.getTopologyRef()
                );
                this._topologyRef = base.getTopologyRef();
            } else {
                this.key = base.key();
                this._topologyRef = key.getTopologyRef();
            }
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public UnderlayTopologyKey key() {
            return key;
        }
        
        @Override
        public TopologyId getTopologyRef() {
            return _topologyRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<UnderlayTopology>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_topologyRef);
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
            if (!UnderlayTopology.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            UnderlayTopology other = (UnderlayTopology)obj;
            if (!Objects.equals(_topologyRef, other.getTopologyRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                UnderlayTopologyImpl otherImpl = (UnderlayTopologyImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<UnderlayTopology>>, Augmentation<UnderlayTopology>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("UnderlayTopology");
            CodeHelpers.appendValue(helper, "_topologyRef", _topologyRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
