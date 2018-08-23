package ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Range;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.OmNumaType;
import ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.Vcpu;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.reflect.Array;
import java.math.BigInteger;
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
 * Class that builds {@link Node} instances.
 * 
 * @see Node
 *
 */
public class NodeBuilder implements Builder<Node> {

    private BigInteger _id;
    private BigInteger _memoryMb;
    private OmNumaType _omNumaType;
    private List<Vcpu> _vcpu;
    private NodeKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("node");

    Map<Class<? extends Augmentation<Node>>, Augmentation<Node>> augmentation = Collections.emptyMap();

    public NodeBuilder() {
    }

    public NodeBuilder(Node base) {
        if (base.key() == null) {
            this.key = new NodeKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this.key = base.key();
            this._id = key.getId();
        }
        this._memoryMb = base.getMemoryMb();
        this._omNumaType = base.getOmNumaType();
        this._vcpu = base.getVcpu();
        if (base instanceof NodeImpl) {
            NodeImpl impl = (NodeImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Node> casted =(AugmentationHolder<Node>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public NodeKey key() {
        return key;
    }
    
    public BigInteger getId() {
        return _id;
    }
    
    public BigInteger getMemoryMb() {
        return _memoryMb;
    }
    
    public OmNumaType getOmNumaType() {
        return _omNumaType;
    }
    
    public List<Vcpu> getVcpu() {
        return _vcpu;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Node>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public NodeBuilder withKey(final NodeKey key) {
        this.key = key;
        return this;
    }
    private static final Range<java.math.BigInteger>[] CHECKIDRANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
        CHECKIDRANGE_RANGES = a;
    }
    private static void checkIdRange(final java.math.BigInteger value) {
        for (Range<java.math.BigInteger> r : CHECKIDRANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKIDRANGE_RANGES, value);
    }
    
    public NodeBuilder setId(final BigInteger value) {
    if (value != null) {
        checkIdRange(value);
        
    }
        this._id = value;
        return this;
    }
    private static final Range<java.math.BigInteger>[] CHECKMEMORYMBRANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
        CHECKMEMORYMBRANGE_RANGES = a;
    }
    private static void checkMemoryMbRange(final java.math.BigInteger value) {
        for (Range<java.math.BigInteger> r : CHECKMEMORYMBRANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKMEMORYMBRANGE_RANGES, value);
    }
    
    public NodeBuilder setMemoryMb(final BigInteger value) {
    if (value != null) {
        checkMemoryMbRange(value);
        
    }
        this._memoryMb = value;
        return this;
    }
    
    public NodeBuilder setOmNumaType(final OmNumaType value) {
        this._omNumaType = value;
        return this;
    }
    public NodeBuilder setVcpu(final List<Vcpu> values) {
        this._vcpu = values;
        return this;
    }
    
    
    public NodeBuilder addAugmentation(Class<? extends Augmentation<Node>> augmentationType, Augmentation<Node> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NodeBuilder removeAugmentation(Class<? extends Augmentation<Node>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Node build() {
        return new NodeImpl(this);
    }

    private static final class NodeImpl implements Node {

        @Override
        public Class<Node> getImplementedInterface() {
            return Node.class;
        }

        private final BigInteger _id;
        private final BigInteger _memoryMb;
        private final OmNumaType _omNumaType;
        private final List<Vcpu> _vcpu;
        private final NodeKey key;

        private Map<Class<? extends Augmentation<Node>>, Augmentation<Node>> augmentation = Collections.emptyMap();

        private NodeImpl(NodeBuilder base) {
            if (base.key() == null) {
                this.key = new NodeKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this.key = base.key();
                this._id = key.getId();
            }
            this._memoryMb = base.getMemoryMb();
            this._omNumaType = base.getOmNumaType();
            this._vcpu = base.getVcpu();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public NodeKey key() {
            return key;
        }
        
        @Override
        public BigInteger getId() {
            return _id;
        }
        
        @Override
        public BigInteger getMemoryMb() {
            return _memoryMb;
        }
        
        @Override
        public OmNumaType getOmNumaType() {
            return _omNumaType;
        }
        
        @Override
        public List<Vcpu> getVcpu() {
            return _vcpu;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Node>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_memoryMb);
            result = prime * result + Objects.hashCode(_omNumaType);
            result = prime * result + Objects.hashCode(_vcpu);
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
            if (!Node.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Node other = (Node)obj;
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_memoryMb, other.getMemoryMb())) {
                return false;
            }
            if (!Objects.equals(_omNumaType, other.getOmNumaType())) {
                return false;
            }
            if (!Objects.equals(_vcpu, other.getVcpu())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NodeImpl otherImpl = (NodeImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Node>>, Augmentation<Node>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Node");
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_memoryMb", _memoryMb);
            CodeHelpers.appendValue(helper, "_omNumaType", _omNumaType);
            CodeHelpers.appendValue(helper, "_vcpu", _vcpu);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
