package ns.yang.ietf.l2.topology.rev150623;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.l2.topology.rev150623.l2.network.type.L2Network;
import ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes;
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
 * Class that builds {@link L2TerminationPointEvent} instances.
 * 
 * @see L2TerminationPointEvent
 *
 */
public class L2TerminationPointEventBuilder implements Builder<L2TerminationPointEvent> {

    private L2NetworkEventType _eventType;
    private L2Network _l2Network;
    private L2TerminationPointAttributes _l2TerminationPointAttributes;
    private NetworkId _networkRef;
    private Object _nodeRef;
    private Object _tpRef;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("l2-termination-point-event");

    Map<Class<? extends Augmentation<L2TerminationPointEvent>>, Augmentation<L2TerminationPointEvent>> augmentation = Collections.emptyMap();

    public L2TerminationPointEventBuilder() {
    }
    public L2TerminationPointEventBuilder(ns.yang.ietf.l2.topology.rev150623.TpRef arg) {
        this._tpRef = arg.getTpRef();
        this._nodeRef = arg.getNodeRef();
        this._networkRef = arg.getNetworkRef();
    }
    public L2TerminationPointEventBuilder(ns.yang.ietf.l2.topology.rev150623.NodeRef arg) {
        this._nodeRef = arg.getNodeRef();
        this._networkRef = arg.getNetworkRef();
    }
    public L2TerminationPointEventBuilder(ns.yang.ietf.l2.topology.rev150623.NetworkRef arg) {
        this._networkRef = arg.getNetworkRef();
    }
    public L2TerminationPointEventBuilder(ns.yang.ietf.l2.topology.rev150623.L2NetworkType arg) {
        this._l2Network = arg.getL2Network();
    }
    public L2TerminationPointEventBuilder(ns.yang.ietf.l2.topology.rev150623.L2TerminationPointAttributes arg) {
        this._l2TerminationPointAttributes = arg.getL2TerminationPointAttributes();
    }

    public L2TerminationPointEventBuilder(L2TerminationPointEvent base) {
        this._eventType = base.getEventType();
        this._l2Network = base.getL2Network();
        this._l2TerminationPointAttributes = base.getL2TerminationPointAttributes();
        this._networkRef = base.getNetworkRef();
        this._nodeRef = base.getNodeRef();
        this._tpRef = base.getTpRef();
        if (base instanceof L2TerminationPointEventImpl) {
            L2TerminationPointEventImpl impl = (L2TerminationPointEventImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<L2TerminationPointEvent> casted =(AugmentationHolder<L2TerminationPointEvent>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NetworkType</li>
     * <li>model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.TpRef</li>
     * <li>model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointAttributes</li>
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
        if (arg instanceof ns.yang.ietf.l2.topology.rev150623.TpRef) {
            this._tpRef = ((ns.yang.ietf.l2.topology.rev150623.TpRef)arg).getTpRef();
            isValidArg = true;
        }
        if (arg instanceof ns.yang.ietf.l2.topology.rev150623.L2TerminationPointAttributes) {
            this._l2TerminationPointAttributes = ((ns.yang.ietf.l2.topology.rev150623.L2TerminationPointAttributes)arg).getL2TerminationPointAttributes();
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
        CodeHelpers.validValue(isValidArg, arg, "[model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NetworkType, model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.TpRef, model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointAttributes, model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.NetworkRef, model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.NodeRef]");
    }

    public L2NetworkEventType getEventType() {
        return _eventType;
    }
    
    public L2Network getL2Network() {
        return _l2Network;
    }
    
    public L2TerminationPointAttributes getL2TerminationPointAttributes() {
        return _l2TerminationPointAttributes;
    }
    
    public NetworkId getNetworkRef() {
        return _networkRef;
    }
    
    public Object getNodeRef() {
        return _nodeRef;
    }
    
    public Object getTpRef() {
        return _tpRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<L2TerminationPointEvent>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public L2TerminationPointEventBuilder setEventType(final L2NetworkEventType value) {
        this._eventType = value;
        return this;
    }
    
    public L2TerminationPointEventBuilder setL2Network(final L2Network value) {
        this._l2Network = value;
        return this;
    }
    
    public L2TerminationPointEventBuilder setL2TerminationPointAttributes(final L2TerminationPointAttributes value) {
        this._l2TerminationPointAttributes = value;
        return this;
    }
    
    public L2TerminationPointEventBuilder setNetworkRef(final NetworkId value) {
        this._networkRef = value;
        return this;
    }
    
    public L2TerminationPointEventBuilder setNodeRef(final Object value) {
        this._nodeRef = value;
        return this;
    }
    
    public L2TerminationPointEventBuilder setTpRef(final Object value) {
        this._tpRef = value;
        return this;
    }
    
    public L2TerminationPointEventBuilder addAugmentation(Class<? extends Augmentation<L2TerminationPointEvent>> augmentationType, Augmentation<L2TerminationPointEvent> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public L2TerminationPointEventBuilder removeAugmentation(Class<? extends Augmentation<L2TerminationPointEvent>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public L2TerminationPointEvent build() {
        return new L2TerminationPointEventImpl(this);
    }

    private static final class L2TerminationPointEventImpl implements L2TerminationPointEvent {

        @Override
        public Class<L2TerminationPointEvent> getImplementedInterface() {
            return L2TerminationPointEvent.class;
        }

        private final L2NetworkEventType _eventType;
        private final L2Network _l2Network;
        private final L2TerminationPointAttributes _l2TerminationPointAttributes;
        private final NetworkId _networkRef;
        private final Object _nodeRef;
        private final Object _tpRef;

        private Map<Class<? extends Augmentation<L2TerminationPointEvent>>, Augmentation<L2TerminationPointEvent>> augmentation = Collections.emptyMap();

        private L2TerminationPointEventImpl(L2TerminationPointEventBuilder base) {
            this._eventType = base.getEventType();
            this._l2Network = base.getL2Network();
            this._l2TerminationPointAttributes = base.getL2TerminationPointAttributes();
            this._networkRef = base.getNetworkRef();
            this._nodeRef = base.getNodeRef();
            this._tpRef = base.getTpRef();
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
        public L2TerminationPointAttributes getL2TerminationPointAttributes() {
            return _l2TerminationPointAttributes;
        }
        
        @Override
        public NetworkId getNetworkRef() {
            return _networkRef;
        }
        
        @Override
        public Object getNodeRef() {
            return _nodeRef;
        }
        
        @Override
        public Object getTpRef() {
            return _tpRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<L2TerminationPointEvent>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_l2TerminationPointAttributes);
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
            if (!L2TerminationPointEvent.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            L2TerminationPointEvent other = (L2TerminationPointEvent)obj;
            if (!Objects.equals(_eventType, other.getEventType())) {
                return false;
            }
            if (!Objects.equals(_l2Network, other.getL2Network())) {
                return false;
            }
            if (!Objects.equals(_l2TerminationPointAttributes, other.getL2TerminationPointAttributes())) {
                return false;
            }
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
                L2TerminationPointEventImpl otherImpl = (L2TerminationPointEventImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<L2TerminationPointEvent>>, Augmentation<L2TerminationPointEvent>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("L2TerminationPointEvent");
            CodeHelpers.appendValue(helper, "_eventType", _eventType);
            CodeHelpers.appendValue(helper, "_l2Network", _l2Network);
            CodeHelpers.appendValue(helper, "_l2TerminationPointAttributes", _l2TerminationPointAttributes);
            CodeHelpers.appendValue(helper, "_networkRef", _networkRef);
            CodeHelpers.appendValue(helper, "_nodeRef", _nodeRef);
            CodeHelpers.appendValue(helper, "_tpRef", _tpRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
