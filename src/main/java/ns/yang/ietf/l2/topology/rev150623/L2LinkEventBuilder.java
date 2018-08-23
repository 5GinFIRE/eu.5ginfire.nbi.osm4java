package ns.yang.ietf.l2.topology.rev150623;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.l2.topology.rev150623.l2.link.attributes.L2LinkAttributes;
import ns.yang.ietf.l2.topology.rev150623.l2.network.type.L2Network;
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
 * Class that builds {@link L2LinkEvent} instances.
 * 
 * @see L2LinkEvent
 *
 */
public class L2LinkEventBuilder implements Builder<L2LinkEvent> {

    private L2NetworkEventType _eventType;
    private L2LinkAttributes _l2LinkAttributes;
    private L2Network _l2Network;
    private Object _linkRef;
    private NetworkId _networkRef;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("l2-link-event");

    Map<Class<? extends Augmentation<L2LinkEvent>>, Augmentation<L2LinkEvent>> augmentation = Collections.emptyMap();

    public L2LinkEventBuilder() {
    }
    public L2LinkEventBuilder(ns.yang.ietf.l2.topology.rev150623.L2LinkAttributes arg) {
        this._l2LinkAttributes = arg.getL2LinkAttributes();
    }
    public L2LinkEventBuilder(ns.yang.ietf.l2.topology.rev150623.L2NetworkType arg) {
        this._l2Network = arg.getL2Network();
    }
    public L2LinkEventBuilder(ns.yang.ietf.l2.topology.rev150623.LinkRef arg) {
        this._linkRef = arg.getLinkRef();
        this._networkRef = arg.getNetworkRef();
    }
    public L2LinkEventBuilder(ns.yang.ietf.l2.topology.rev150623.NetworkRef arg) {
        this._networkRef = arg.getNetworkRef();
    }

    public L2LinkEventBuilder(L2LinkEvent base) {
        this._eventType = base.getEventType();
        this._l2LinkAttributes = base.getL2LinkAttributes();
        this._l2Network = base.getL2Network();
        this._linkRef = base.getLinkRef();
        this._networkRef = base.getNetworkRef();
        if (base instanceof L2LinkEventImpl) {
            L2LinkEventImpl impl = (L2LinkEventImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<L2LinkEvent> casted =(AugmentationHolder<L2LinkEvent>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NetworkType</li>
     * <li>model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.LinkRef</li>
     * <li>model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkAttributes</li>
     * <li>model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.NetworkRef</li>
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
        if (arg instanceof ns.yang.ietf.l2.topology.rev150623.LinkRef) {
            this._linkRef = ((ns.yang.ietf.l2.topology.rev150623.LinkRef)arg).getLinkRef();
            isValidArg = true;
        }
        if (arg instanceof ns.yang.ietf.l2.topology.rev150623.L2LinkAttributes) {
            this._l2LinkAttributes = ((ns.yang.ietf.l2.topology.rev150623.L2LinkAttributes)arg).getL2LinkAttributes();
            isValidArg = true;
        }
        if (arg instanceof ns.yang.ietf.l2.topology.rev150623.NetworkRef) {
            this._networkRef = ((ns.yang.ietf.l2.topology.rev150623.NetworkRef)arg).getNetworkRef();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NetworkType, model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.LinkRef, model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkAttributes, model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.NetworkRef]");
    }

    public L2NetworkEventType getEventType() {
        return _eventType;
    }
    
    public L2LinkAttributes getL2LinkAttributes() {
        return _l2LinkAttributes;
    }
    
    public L2Network getL2Network() {
        return _l2Network;
    }
    
    public Object getLinkRef() {
        return _linkRef;
    }
    
    public NetworkId getNetworkRef() {
        return _networkRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<L2LinkEvent>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public L2LinkEventBuilder setEventType(final L2NetworkEventType value) {
        this._eventType = value;
        return this;
    }
    
    public L2LinkEventBuilder setL2LinkAttributes(final L2LinkAttributes value) {
        this._l2LinkAttributes = value;
        return this;
    }
    
    public L2LinkEventBuilder setL2Network(final L2Network value) {
        this._l2Network = value;
        return this;
    }
    
    public L2LinkEventBuilder setLinkRef(final Object value) {
        this._linkRef = value;
        return this;
    }
    
    public L2LinkEventBuilder setNetworkRef(final NetworkId value) {
        this._networkRef = value;
        return this;
    }
    
    public L2LinkEventBuilder addAugmentation(Class<? extends Augmentation<L2LinkEvent>> augmentationType, Augmentation<L2LinkEvent> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public L2LinkEventBuilder removeAugmentation(Class<? extends Augmentation<L2LinkEvent>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public L2LinkEvent build() {
        return new L2LinkEventImpl(this);
    }

    private static final class L2LinkEventImpl implements L2LinkEvent {

        @Override
        public Class<L2LinkEvent> getImplementedInterface() {
            return L2LinkEvent.class;
        }

        private final L2NetworkEventType _eventType;
        private final L2LinkAttributes _l2LinkAttributes;
        private final L2Network _l2Network;
        private final Object _linkRef;
        private final NetworkId _networkRef;

        private Map<Class<? extends Augmentation<L2LinkEvent>>, Augmentation<L2LinkEvent>> augmentation = Collections.emptyMap();

        private L2LinkEventImpl(L2LinkEventBuilder base) {
            this._eventType = base.getEventType();
            this._l2LinkAttributes = base.getL2LinkAttributes();
            this._l2Network = base.getL2Network();
            this._linkRef = base.getLinkRef();
            this._networkRef = base.getNetworkRef();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public L2NetworkEventType getEventType() {
            return _eventType;
        }
        
        @Override
        public L2LinkAttributes getL2LinkAttributes() {
            return _l2LinkAttributes;
        }
        
        @Override
        public L2Network getL2Network() {
            return _l2Network;
        }
        
        @Override
        public Object getLinkRef() {
            return _linkRef;
        }
        
        @Override
        public NetworkId getNetworkRef() {
            return _networkRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<L2LinkEvent>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_l2LinkAttributes);
            result = prime * result + Objects.hashCode(_l2Network);
            result = prime * result + Objects.hashCode(_linkRef);
            result = prime * result + Objects.hashCode(_networkRef);
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
            if (!L2LinkEvent.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            L2LinkEvent other = (L2LinkEvent)obj;
            if (!Objects.equals(_eventType, other.getEventType())) {
                return false;
            }
            if (!Objects.equals(_l2LinkAttributes, other.getL2LinkAttributes())) {
                return false;
            }
            if (!Objects.equals(_l2Network, other.getL2Network())) {
                return false;
            }
            if (!Objects.equals(_linkRef, other.getLinkRef())) {
                return false;
            }
            if (!Objects.equals(_networkRef, other.getNetworkRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                L2LinkEventImpl otherImpl = (L2LinkEventImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<L2LinkEvent>>, Augmentation<L2LinkEvent>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("L2LinkEvent");
            CodeHelpers.appendValue(helper, "_eventType", _eventType);
            CodeHelpers.appendValue(helper, "_l2LinkAttributes", _l2LinkAttributes);
            CodeHelpers.appendValue(helper, "_l2Network", _l2Network);
            CodeHelpers.appendValue(helper, "_linkRef", _linkRef);
            CodeHelpers.appendValue(helper, "_networkRef", _networkRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
