package yang.vnfd.vnfd.descriptor.internal.vld;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.inet.types.rev100924.IpAddress;
import yang.vnfd.$YangModuleInfoImpl;

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
 * Class that builds {@link InternalConnectionPoint} instances.
 * 
 * @see InternalConnectionPoint
 *
 */
public class InternalConnectionPointBuilder implements Builder<InternalConnectionPoint> {

    private String _idRef;
    private IpAddress _ipAddress;
    private InternalConnectionPointKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("internal-connection-point");

    Map<Class<? extends Augmentation<InternalConnectionPoint>>, Augmentation<InternalConnectionPoint>> augmentation = Collections.emptyMap();

    public InternalConnectionPointBuilder() {
    }

    public InternalConnectionPointBuilder(InternalConnectionPoint base) {
        if (base.key() == null) {
            this.key = new InternalConnectionPointKey(
                base.getIdRef()
            );
            this._idRef = base.getIdRef();
        } else {
            this.key = base.key();
            this._idRef = key.getIdRef();
        }
        this._ipAddress = base.getIpAddress();
        if (base instanceof InternalConnectionPointImpl) {
            InternalConnectionPointImpl impl = (InternalConnectionPointImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<InternalConnectionPoint> casted =(AugmentationHolder<InternalConnectionPoint>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public InternalConnectionPointKey key() {
        return key;
    }
    
    public String getIdRef() {
        return _idRef;
    }
    
    public IpAddress getIpAddress() {
        return _ipAddress;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<InternalConnectionPoint>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public InternalConnectionPointBuilder withKey(final InternalConnectionPointKey key) {
        this.key = key;
        return this;
    }
    
    public InternalConnectionPointBuilder setIdRef(final String value) {
        this._idRef = value;
        return this;
    }
    
    public InternalConnectionPointBuilder setIpAddress(final IpAddress value) {
        this._ipAddress = value;
        return this;
    }
    
    public InternalConnectionPointBuilder addAugmentation(Class<? extends Augmentation<InternalConnectionPoint>> augmentationType, Augmentation<InternalConnectionPoint> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public InternalConnectionPointBuilder removeAugmentation(Class<? extends Augmentation<InternalConnectionPoint>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public InternalConnectionPoint build() {
        return new InternalConnectionPointImpl(this);
    }

    private static final class InternalConnectionPointImpl implements InternalConnectionPoint {

        @Override
        public Class<InternalConnectionPoint> getImplementedInterface() {
            return InternalConnectionPoint.class;
        }

        private final String _idRef;
        private final IpAddress _ipAddress;
        private final InternalConnectionPointKey key;

        private Map<Class<? extends Augmentation<InternalConnectionPoint>>, Augmentation<InternalConnectionPoint>> augmentation = Collections.emptyMap();

        private InternalConnectionPointImpl(InternalConnectionPointBuilder base) {
            if (base.key() == null) {
                this.key = new InternalConnectionPointKey(
                    base.getIdRef()
                );
                this._idRef = base.getIdRef();
            } else {
                this.key = base.key();
                this._idRef = key.getIdRef();
            }
            this._ipAddress = base.getIpAddress();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public InternalConnectionPointKey key() {
            return key;
        }
        
        @Override
        public String getIdRef() {
            return _idRef;
        }
        
        @Override
        public IpAddress getIpAddress() {
            return _ipAddress;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<InternalConnectionPoint>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_idRef);
            result = prime * result + Objects.hashCode(_ipAddress);
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
            if (!InternalConnectionPoint.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            InternalConnectionPoint other = (InternalConnectionPoint)obj;
            if (!Objects.equals(_idRef, other.getIdRef())) {
                return false;
            }
            if (!Objects.equals(_ipAddress, other.getIpAddress())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InternalConnectionPointImpl otherImpl = (InternalConnectionPointImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<InternalConnectionPoint>>, Augmentation<InternalConnectionPoint>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("InternalConnectionPoint");
            CodeHelpers.appendValue(helper, "_idRef", _idRef);
            CodeHelpers.appendValue(helper, "_ipAddress", _ipAddress);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
