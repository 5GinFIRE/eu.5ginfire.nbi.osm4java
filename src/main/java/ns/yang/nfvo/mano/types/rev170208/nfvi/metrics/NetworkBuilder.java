package ns.yang.nfvo.mano.types.rev170208.nfvi.metrics;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.network.Incoming;
import ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.network.Outgoing;

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
 * Class that builds {@link Network} instances.
 * 
 * @see Network
 *
 */
public class NetworkBuilder implements Builder<Network> {

    private Incoming _incoming;
    private String _label;
    private Outgoing _outgoing;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("network");

    Map<Class<? extends Augmentation<Network>>, Augmentation<Network>> augmentation = Collections.emptyMap();

    public NetworkBuilder() {
    }

    public NetworkBuilder(Network base) {
        this._incoming = base.getIncoming();
        this._label = base.getLabel();
        this._outgoing = base.getOutgoing();
        if (base instanceof NetworkImpl) {
            NetworkImpl impl = (NetworkImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Network> casted =(AugmentationHolder<Network>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public Incoming getIncoming() {
        return _incoming;
    }
    
    public String getLabel() {
        return _label;
    }
    
    public Outgoing getOutgoing() {
        return _outgoing;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Network>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public NetworkBuilder setIncoming(final Incoming value) {
        this._incoming = value;
        return this;
    }
    
    public NetworkBuilder setLabel(final String value) {
        this._label = value;
        return this;
    }
    
    public NetworkBuilder setOutgoing(final Outgoing value) {
        this._outgoing = value;
        return this;
    }
    
    public NetworkBuilder addAugmentation(Class<? extends Augmentation<Network>> augmentationType, Augmentation<Network> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NetworkBuilder removeAugmentation(Class<? extends Augmentation<Network>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Network build() {
        return new NetworkImpl(this);
    }

    private static final class NetworkImpl implements Network {

        @Override
        public Class<Network> getImplementedInterface() {
            return Network.class;
        }

        private final Incoming _incoming;
        private final String _label;
        private final Outgoing _outgoing;

        private Map<Class<? extends Augmentation<Network>>, Augmentation<Network>> augmentation = Collections.emptyMap();

        private NetworkImpl(NetworkBuilder base) {
            this._incoming = base.getIncoming();
            this._label = base.getLabel();
            this._outgoing = base.getOutgoing();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public Incoming getIncoming() {
            return _incoming;
        }
        
        @Override
        public String getLabel() {
            return _label;
        }
        
        @Override
        public Outgoing getOutgoing() {
            return _outgoing;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Network>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_incoming);
            result = prime * result + Objects.hashCode(_label);
            result = prime * result + Objects.hashCode(_outgoing);
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
            if (!Network.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Network other = (Network)obj;
            if (!Objects.equals(_incoming, other.getIncoming())) {
                return false;
            }
            if (!Objects.equals(_label, other.getLabel())) {
                return false;
            }
            if (!Objects.equals(_outgoing, other.getOutgoing())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NetworkImpl otherImpl = (NetworkImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Network>>, Augmentation<Network>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Network");
            CodeHelpers.appendValue(helper, "_incoming", _incoming);
            CodeHelpers.appendValue(helper, "_label", _label);
            CodeHelpers.appendValue(helper, "_outgoing", _outgoing);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
