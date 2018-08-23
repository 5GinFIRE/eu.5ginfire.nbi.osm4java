package ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.Node;

import java.lang.Class;
import java.lang.Integer;
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
 * Class that builds {@link NumaNodePolicy} instances.
 * 
 * @see NumaNodePolicy
 *
 */
public class NumaNodePolicyBuilder implements Builder<NumaNodePolicy> {

    private NumaNodePolicy.MemPolicy _memPolicy;
    private List<Node> _node;
    private Integer _nodeCnt;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("numa-node-policy");

    Map<Class<? extends Augmentation<NumaNodePolicy>>, Augmentation<NumaNodePolicy>> augmentation = Collections.emptyMap();

    public NumaNodePolicyBuilder() {
    }

    public NumaNodePolicyBuilder(NumaNodePolicy base) {
        this._memPolicy = base.getMemPolicy();
        this._node = base.getNode();
        this._nodeCnt = base.getNodeCnt();
        if (base instanceof NumaNodePolicyImpl) {
            NumaNodePolicyImpl impl = (NumaNodePolicyImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<NumaNodePolicy> casted =(AugmentationHolder<NumaNodePolicy>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public NumaNodePolicy.MemPolicy getMemPolicy() {
        return _memPolicy;
    }
    
    public List<Node> getNode() {
        return _node;
    }
    
    public Integer getNodeCnt() {
        return _nodeCnt;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<NumaNodePolicy>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public NumaNodePolicyBuilder setMemPolicy(final NumaNodePolicy.MemPolicy value) {
        this._memPolicy = value;
        return this;
    }
    public NumaNodePolicyBuilder setNode(final List<Node> values) {
        this._node = values;
        return this;
    }
    
    private static void checkNodeCntRange(final int value) {
        if (value >= 0 && value <= 65535) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..65535]]", value);
    }
    
    public NumaNodePolicyBuilder setNodeCnt(final Integer value) {
    if (value != null) {
        checkNodeCntRange(value);
        
    }
        this._nodeCnt = value;
        return this;
    }
    
    public NumaNodePolicyBuilder addAugmentation(Class<? extends Augmentation<NumaNodePolicy>> augmentationType, Augmentation<NumaNodePolicy> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NumaNodePolicyBuilder removeAugmentation(Class<? extends Augmentation<NumaNodePolicy>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NumaNodePolicy build() {
        return new NumaNodePolicyImpl(this);
    }

    private static final class NumaNodePolicyImpl implements NumaNodePolicy {

        @Override
        public Class<NumaNodePolicy> getImplementedInterface() {
            return NumaNodePolicy.class;
        }

        private final NumaNodePolicy.MemPolicy _memPolicy;
        private final List<Node> _node;
        private final Integer _nodeCnt;

        private Map<Class<? extends Augmentation<NumaNodePolicy>>, Augmentation<NumaNodePolicy>> augmentation = Collections.emptyMap();

        private NumaNodePolicyImpl(NumaNodePolicyBuilder base) {
            this._memPolicy = base.getMemPolicy();
            this._node = base.getNode();
            this._nodeCnt = base.getNodeCnt();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public NumaNodePolicy.MemPolicy getMemPolicy() {
            return _memPolicy;
        }
        
        @Override
        public List<Node> getNode() {
            return _node;
        }
        
        @Override
        public Integer getNodeCnt() {
            return _nodeCnt;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<NumaNodePolicy>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_memPolicy);
            result = prime * result + Objects.hashCode(_node);
            result = prime * result + Objects.hashCode(_nodeCnt);
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
            if (!NumaNodePolicy.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            NumaNodePolicy other = (NumaNodePolicy)obj;
            if (!Objects.equals(_memPolicy, other.getMemPolicy())) {
                return false;
            }
            if (!Objects.equals(_node, other.getNode())) {
                return false;
            }
            if (!Objects.equals(_nodeCnt, other.getNodeCnt())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NumaNodePolicyImpl otherImpl = (NumaNodePolicyImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<NumaNodePolicy>>, Augmentation<NumaNodePolicy>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("NumaNodePolicy");
            CodeHelpers.appendValue(helper, "_memPolicy", _memPolicy);
            CodeHelpers.appendValue(helper, "_node", _node);
            CodeHelpers.appendValue(helper, "_nodeCnt", _nodeCnt);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
