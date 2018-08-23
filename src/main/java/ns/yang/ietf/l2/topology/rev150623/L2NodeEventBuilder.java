package ns.yang.ietf.l2.topology.rev150623;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.l2.topology.rev150623.l2.network.type.L2Network;
import ns.yang.ietf.l2.topology.rev150623.l2.node.attributes.L2NodeAttributes;
import ns.yang.ietf.network.rev150608.NetworkId;

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
 * Class that builds {@link L2NodeEvent} instances.
 * 
 * @see L2NodeEvent
 *
 */
public class L2NodeEventBuilder implements Builder<L2NodeEvent> {

    private L2NetworkEventType _eventType;
    private L2Network _l2Network;
    private L2NodeAttributes _l2NodeAttributes;
    private NetworkId _networkRef;
    private Object _nodeRef;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("l2-node-event");

    Map<Class<? extends Augmentation<L2NodeEvent>>, Augmentation<L2NodeEvent>> augmentation = Collections.emptyMap();

    public L2NodeEventBuilder() {
    }
    public L2NodeEventBuilder(ns.yang.ietf.l2.topology.rev150623.NodeRef arg) {
        this._nodeRef = arg.getNodeRef();
        this._networkRef = arg.getNetworkRef();
    }
    public L2NodeEventBuilder(ns.yang.ietf.l2.topology.rev150623.NetworkRef arg) {
        this._networkRef = arg.getNetworkRef();
    }
    public L2NodeEventBuilder(ns.yang.ietf.l2.topology.rev150623.L2NetworkType arg) {
        this._l2Network = arg.getL2Network();
    }
    public L2NodeEventBuilder(ns.yang.ietf.l2.topology.rev150623.L2NodeAttributes arg) {
        this._l2NodeAttributes = arg.getL2NodeAttributes();
    }

    public L2NodeEventBuilder(L2NodeEvent base) {
        this._eventType = base.getEventType();
        this._l2Network = base.getL2Network();
        this._l2NodeAttributes = base.getL2NodeAttributes();
        this._networkRef = base.getNetworkRef();
        this._nodeRef = base.getNodeRef();
        if (base instanceof L2NodeEventImpl) {
            L2NodeEventImpl impl = (L2NodeEventImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<L2NodeEvent> casted =(AugmentationHolder<L2NodeEvent>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NetworkType</li>
     * <li>model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NodeAttributes</li>
     * <li>model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.NetworkRef</li>
     * <li>model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.NodeRef</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ns.yang.ietf.l2.topology.rev150623.L2NetworkType) {
            this._l2Network = ((ns.yang.ietf.l2.topology.rev150623.L2NetworkType)arg).getL2Network();
            isValidArg = true;
        }
        if (arg instanceof ns.yang.ietf.l2.topology.rev150623.L2NodeAttributes) {
            this._l2NodeAttributes = ((ns.yang.ietf.l2.topology.rev150623.L2NodeAttributes)arg).getL2NodeAttributes();
            isValidArg = true;
        }
        if (arg instanceof ns.yang.ietf.l2.topology.rev150623.NetworkRef) {
            this._networkRef = ((ns.yang.ietf.l2.topology.rev150623.NetworkRef)arg).getNetworkRef();
            isValidArg = true;
        }
        if (arg instanceof ns.yang.ietf.l2.topology.rev150623.NodeRef) {
            this._nodeRef = ((ns.yang.ietf.l2.topology.rev150623.NodeRef)arg).getNodeRef();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NetworkType, model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NodeAttributes, model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.NetworkRef, model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.NodeRef]");
    }

    public L2NetworkEventType getEventType() {
        return _eventType;
    }
    
    public L2Network getL2Network() {
        return _l2Network;
    }
    
    public L2NodeAttributes getL2NodeAttributes() {
        return _l2NodeAttributes;
    }
    
    public NetworkId getNetworkRef() {
        return _networkRef;
    }
    
    public Object getNodeRef() {
        return _nodeRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<L2NodeEvent>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public L2NodeEventBuilder setEventType(final L2NetworkEventType value) {
        this._eventType = value;
        return this;
    }
    
    public L2NodeEventBuilder setL2Network(final L2Network value) {
        this._l2Network = value;
        return this;
    }
    
    public L2NodeEventBuilder setL2NodeAttributes(final L2NodeAttributes value) {
        this._l2NodeAttributes = value;
        return this;
    }
    
    public L2NodeEventBuilder setNetworkRef(final NetworkId value) {
        this._networkRef = value;
        return this;
    }
    
    public L2NodeEventBuilder setNodeRef(final Object value) {
        this._nodeRef = value;
        return this;
    }
    
    public L2NodeEventBuilder addAugmentation(Class<? extends Augmentation<L2NodeEvent>> augmentationType, Augmentation<L2NodeEvent> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public L2NodeEventBuilder removeAugmentation(Class<? extends Augmentation<L2NodeEvent>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public L2NodeEvent build() {
        return new L2NodeEventImpl(this);
    }

    private static final class L2NodeEventImpl implements L2NodeEvent {

        @Override
        public Class<L2NodeEvent> getImplementedInterface() {
            return L2NodeEvent.class;
        }

        private final L2NetworkEventType _eventType;
        private final L2Network _l2Network;
        private final L2NodeAttributes _l2NodeAttributes;
        private final NetworkId _networkRef;
        private final Object _nodeRef;

        private Map<Class<? extends Augmentation<L2NodeEvent>>, Augmentation<L2NodeEvent>> augmentation = Collections.emptyMap();

        private L2NodeEventImpl(L2NodeEventBuilder base) {
            this._eventType = base.getEventType();
            this._l2Network = base.getL2Network();
            this._l2NodeAttributes = base.getL2NodeAttributes();
            this._networkRef = base.getNetworkRef();
            this._nodeRef = base.getNodeRef();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public L2NetworkEventType getEventType() {
            return _eventType;
        }
        
        @Override
        public L2Network getL2Network() {
            return _l2Network;
        }
        
        @Override
        public L2NodeAttributes getL2NodeAttributes() {
            return _l2NodeAttributes;
        }
        
        @Override
        public NetworkId getNetworkRef() {
            return _networkRef;
        }
        
        @Override
        public Object getNodeRef() {
            return _nodeRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<L2NodeEvent>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_eventType);
            result = prime * result + Objects.hashCode(_l2Network);
            result = prime * result + Objects.hashCode(_l2NodeAttributes);
            result = prime * result + Objects.hashCode(_networkRef);
            result = prime * result + Objects.hashCode(_nodeRef);
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
            if (!L2NodeEvent.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            L2NodeEvent other = (L2NodeEvent)obj;
            if (!Objects.equals(_eventType, other.getEventType())) {
                return false;
            }
            if (!Objects.equals(_l2Network, other.getL2Network())) {
                return false;
            }
            if (!Objects.equals(_l2NodeAttributes, other.getL2NodeAttributes())) {
                return false;
            }
            if (!Objects.equals(_networkRef, other.getNetworkRef())) {
                return false;
            }
            if (!Objects.equals(_nodeRef, other.getNodeRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                L2NodeEventImpl otherImpl = (L2NodeEventImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<L2NodeEvent>>, Augmentation<L2NodeEvent>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("L2NodeEvent");
            CodeHelpers.appendValue(helper, "_eventType", _eventType);
            CodeHelpers.appendValue(helper, "_l2Network", _l2Network);
            CodeHelpers.appendValue(helper, "_l2NodeAttributes", _l2NodeAttributes);
            CodeHelpers.appendValue(helper, "_networkRef", _networkRef);
            CodeHelpers.appendValue(helper, "_nodeRef", _nodeRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
