package ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.yang.types.rev130715.Uuid;
import ns.yang.nfvo.vnfr.rev170228.$YangModuleInfoImpl;

import java.lang.Class;
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
 * Class that builds {@link InternalVlr} instances.
 * 
 * @see InternalVlr
 *
 */
public class InternalVlrBuilder implements Builder<InternalVlr> {

    private List<String> _internalConnectionPointRef;
    private Uuid _vlrRef;
    private InternalVlrKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("internal-vlr");

    Map<Class<? extends Augmentation<InternalVlr>>, Augmentation<InternalVlr>> augmentation = Collections.emptyMap();

    public InternalVlrBuilder() {
    }

    public InternalVlrBuilder(InternalVlr base) {
        if (base.key() == null) {
            this.key = new InternalVlrKey(
                base.getVlrRef()
            );
            this._vlrRef = base.getVlrRef();
        } else {
            this.key = base.key();
            this._vlrRef = key.getVlrRef();
        }
        this._internalConnectionPointRef = base.getInternalConnectionPointRef();
        if (base instanceof InternalVlrImpl) {
            InternalVlrImpl impl = (InternalVlrImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<InternalVlr> casted =(AugmentationHolder<InternalVlr>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public InternalVlrKey key() {
        return key;
    }
    
    public List<String> getInternalConnectionPointRef() {
        return _internalConnectionPointRef;
    }
    
    public Uuid getVlrRef() {
        return _vlrRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<InternalVlr>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public InternalVlrBuilder withKey(final InternalVlrKey key) {
        this.key = key;
        return this;
    }
    public InternalVlrBuilder setInternalConnectionPointRef(final List<String> values) {
        this._internalConnectionPointRef = values;
        return this;
    }
    
    
    public InternalVlrBuilder setVlrRef(final Uuid value) {
        this._vlrRef = value;
        return this;
    }
    
    public InternalVlrBuilder addAugmentation(Class<? extends Augmentation<InternalVlr>> augmentationType, Augmentation<InternalVlr> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public InternalVlrBuilder removeAugmentation(Class<? extends Augmentation<InternalVlr>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public InternalVlr build() {
        return new InternalVlrImpl(this);
    }

    private static final class InternalVlrImpl implements InternalVlr {

        @Override
        public Class<InternalVlr> getImplementedInterface() {
            return InternalVlr.class;
        }

        private final List<String> _internalConnectionPointRef;
        private final Uuid _vlrRef;
        private final InternalVlrKey key;

        private Map<Class<? extends Augmentation<InternalVlr>>, Augmentation<InternalVlr>> augmentation = Collections.emptyMap();

        private InternalVlrImpl(InternalVlrBuilder base) {
            if (base.key() == null) {
                this.key = new InternalVlrKey(
                    base.getVlrRef()
                );
                this._vlrRef = base.getVlrRef();
            } else {
                this.key = base.key();
                this._vlrRef = key.getVlrRef();
            }
            this._internalConnectionPointRef = base.getInternalConnectionPointRef();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public InternalVlrKey key() {
            return key;
        }
        
        @Override
        public List<String> getInternalConnectionPointRef() {
            return _internalConnectionPointRef;
        }
        
        @Override
        public Uuid getVlrRef() {
            return _vlrRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<InternalVlr>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_internalConnectionPointRef);
            result = prime * result + Objects.hashCode(_vlrRef);
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
            if (!InternalVlr.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            InternalVlr other = (InternalVlr)obj;
            if (!Objects.equals(_internalConnectionPointRef, other.getInternalConnectionPointRef())) {
                return false;
            }
            if (!Objects.equals(_vlrRef, other.getVlrRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InternalVlrImpl otherImpl = (InternalVlrImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<InternalVlr>>, Augmentation<InternalVlr>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("InternalVlr");
            CodeHelpers.appendValue(helper, "_internalConnectionPointRef", _internalConnectionPointRef);
            CodeHelpers.appendValue(helper, "_vlrRef", _vlrRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
