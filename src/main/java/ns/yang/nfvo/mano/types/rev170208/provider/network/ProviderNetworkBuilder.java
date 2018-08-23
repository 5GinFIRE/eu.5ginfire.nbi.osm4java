package ns.yang.nfvo.mano.types.rev170208.provider.network;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;

import java.lang.Class;
import java.lang.Long;
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
 * Class that builds {@link ProviderNetwork} instances.
 * 
 * @see ProviderNetwork
 *
 */
public class ProviderNetworkBuilder implements Builder<ProviderNetwork> {

    private String _physicalNetwork;
    private Long _segmentationId;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("provider-network");

    Map<Class<? extends Augmentation<ProviderNetwork>>, Augmentation<ProviderNetwork>> augmentation = Collections.emptyMap();

    public ProviderNetworkBuilder() {
    }

    public ProviderNetworkBuilder(ProviderNetwork base) {
        this._physicalNetwork = base.getPhysicalNetwork();
        this._segmentationId = base.getSegmentationId();
        if (base instanceof ProviderNetworkImpl) {
            ProviderNetworkImpl impl = (ProviderNetworkImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ProviderNetwork> casted =(AugmentationHolder<ProviderNetwork>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public String getPhysicalNetwork() {
        return _physicalNetwork;
    }
    
    public Long getSegmentationId() {
        return _segmentationId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ProviderNetwork>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public ProviderNetworkBuilder setPhysicalNetwork(final String value) {
        this._physicalNetwork = value;
        return this;
    }
    private static void checkSegmentationIdRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public ProviderNetworkBuilder setSegmentationId(final Long value) {
    if (value != null) {
        checkSegmentationIdRange(value);
        
    }
        this._segmentationId = value;
        return this;
    }
    
    public ProviderNetworkBuilder addAugmentation(Class<? extends Augmentation<ProviderNetwork>> augmentationType, Augmentation<ProviderNetwork> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ProviderNetworkBuilder removeAugmentation(Class<? extends Augmentation<ProviderNetwork>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ProviderNetwork build() {
        return new ProviderNetworkImpl(this);
    }

    private static final class ProviderNetworkImpl implements ProviderNetwork {

        @Override
        public Class<ProviderNetwork> getImplementedInterface() {
            return ProviderNetwork.class;
        }

        private final String _physicalNetwork;
        private final Long _segmentationId;

        private Map<Class<? extends Augmentation<ProviderNetwork>>, Augmentation<ProviderNetwork>> augmentation = Collections.emptyMap();

        private ProviderNetworkImpl(ProviderNetworkBuilder base) {
            this._physicalNetwork = base.getPhysicalNetwork();
            this._segmentationId = base.getSegmentationId();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public String getPhysicalNetwork() {
            return _physicalNetwork;
        }
        
        @Override
        public Long getSegmentationId() {
            return _segmentationId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ProviderNetwork>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_physicalNetwork);
            result = prime * result + Objects.hashCode(_segmentationId);
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
            if (!ProviderNetwork.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ProviderNetwork other = (ProviderNetwork)obj;
            if (!Objects.equals(_physicalNetwork, other.getPhysicalNetwork())) {
                return false;
            }
            if (!Objects.equals(_segmentationId, other.getSegmentationId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ProviderNetworkImpl otherImpl = (ProviderNetworkImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ProviderNetwork>>, Augmentation<ProviderNetwork>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ProviderNetwork");
            CodeHelpers.appendValue(helper, "_physicalNetwork", _physicalNetwork);
            CodeHelpers.appendValue(helper, "_segmentationId", _segmentationId);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
