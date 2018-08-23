package ns.yang.ietf.network.topology.rev150608.network.node.termination.point;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.network.rev150608.NetworkId;
import ns.yang.ietf.network.rev150608.NodeId;
import ns.yang.ietf.network.topology.rev150608.$YangModuleInfoImpl;

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
 * Class that builds {@link SupportingTerminationPoint} instances.
 * 
 * @see SupportingTerminationPoint
 *
 */
public class SupportingTerminationPointBuilder implements Builder<SupportingTerminationPoint> {

    private NetworkId _networkRef;
    private NodeId _nodeRef;
    private Object _tpRef;
    private SupportingTerminationPointKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("supporting-termination-point");

    Map<Class<? extends Augmentation<SupportingTerminationPoint>>, Augmentation<SupportingTerminationPoint>> augmentation = Collections.emptyMap();

    public SupportingTerminationPointBuilder() {
    }

    public SupportingTerminationPointBuilder(SupportingTerminationPoint base) {
        if (base.key() == null) {
            this.key = new SupportingTerminationPointKey(
                base.getNetworkRef(), 
                base.getNodeRef(), 
                base.getTpRef()
            );
            this._networkRef = base.getNetworkRef();
            this._nodeRef = base.getNodeRef();
            this._tpRef = base.getTpRef();
        } else {
            this.key = base.key();
            this._networkRef = key.getNetworkRef();
            this._nodeRef = key.getNodeRef();
            this._tpRef = key.getTpRef();
        }
        if (base instanceof SupportingTerminationPointImpl) {
            SupportingTerminationPointImpl impl = (SupportingTerminationPointImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<SupportingTerminationPoint> casted =(AugmentationHolder<SupportingTerminationPoint>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public SupportingTerminationPointKey key() {
        return key;
    }
    
    public NetworkId getNetworkRef() {
        return _networkRef;
    }
    
    public NodeId getNodeRef() {
        return _nodeRef;
    }
    
    public Object getTpRef() {
        return _tpRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<SupportingTerminationPoint>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public SupportingTerminationPointBuilder withKey(final SupportingTerminationPointKey key) {
        this.key = key;
        return this;
    }
    
    public SupportingTerminationPointBuilder setNetworkRef(final NetworkId value) {
        this._networkRef = value;
        return this;
    }
    
    public SupportingTerminationPointBuilder setNodeRef(final NodeId value) {
        this._nodeRef = value;
        return this;
    }
    
    public SupportingTerminationPointBuilder setTpRef(final Object value) {
        this._tpRef = value;
        return this;
    }
    
    public SupportingTerminationPointBuilder addAugmentation(Class<? extends Augmentation<SupportingTerminationPoint>> augmentationType, Augmentation<SupportingTerminationPoint> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public SupportingTerminationPointBuilder removeAugmentation(Class<? extends Augmentation<SupportingTerminationPoint>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public SupportingTerminationPoint build() {
        return new SupportingTerminationPointImpl(this);
    }

    private static final class SupportingTerminationPointImpl implements SupportingTerminationPoint {

        @Override
        public Class<SupportingTerminationPoint> getImplementedInterface() {
            return SupportingTerminationPoint.class;
        }

        private final NetworkId _networkRef;
        private final NodeId _nodeRef;
        private final Object _tpRef;
        private final SupportingTerminationPointKey key;

        private Map<Class<? extends Augmentation<SupportingTerminationPoint>>, Augmentation<SupportingTerminationPoint>> augmentation = Collections.emptyMap();

        private SupportingTerminationPointImpl(SupportingTerminationPointBuilder base) {
            if (base.key() == null) {
                this.key = new SupportingTerminationPointKey(
                    base.getNetworkRef(), 
                    base.getNodeRef(), 
                    base.getTpRef()
                );
                this._networkRef = base.getNetworkRef();
                this._nodeRef = base.getNodeRef();
                this._tpRef = base.getTpRef();
            } else {
                this.key = base.key();
                this._networkRef = key.getNetworkRef();
                this._nodeRef = key.getNodeRef();
                this._tpRef = key.getTpRef();
            }
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public SupportingTerminationPointKey key() {
            return key;
        }
        
        @Override
        public NetworkId getNetworkRef() {
            return _networkRef;
        }
        
        @Override
        public NodeId getNodeRef() {
            return _nodeRef;
        }
        
        @Override
        public Object getTpRef() {
            return _tpRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<SupportingTerminationPoint>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_networkRef);
            result = prime * result + Objects.hashCode(_nodeRef);
            result = prime * result + Objects.hashCode(_tpRef);
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
            if (!SupportingTerminationPoint.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            SupportingTerminationPoint other = (SupportingTerminationPoint)obj;
            if (!Objects.equals(_networkRef, other.getNetworkRef())) {
                return false;
            }
            if (!Objects.equals(_nodeRef, other.getNodeRef())) {
                return false;
            }
            if (!Objects.equals(_tpRef, other.getTpRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SupportingTerminationPointImpl otherImpl = (SupportingTerminationPointImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<SupportingTerminationPoint>>, Augmentation<SupportingTerminationPoint>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("SupportingTerminationPoint");
            CodeHelpers.appendValue(helper, "_networkRef", _networkRef);
            CodeHelpers.appendValue(helper, "_nodeRef", _nodeRef);
            CodeHelpers.appendValue(helper, "_tpRef", _tpRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
