package ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.om.numa.type.paired.threads.paired.threads;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.Short;
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
 * Class that builds {@link PairedThreadIds} instances.
 * 
 * @see PairedThreadIds
 *
 */
public class PairedThreadIdsBuilder implements Builder<PairedThreadIds> {

    private Short _threadA;
    private Short _threadB;
    private PairedThreadIdsKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("paired-thread-ids");

    Map<Class<? extends Augmentation<PairedThreadIds>>, Augmentation<PairedThreadIds>> augmentation = Collections.emptyMap();

    public PairedThreadIdsBuilder() {
    }

    public PairedThreadIdsBuilder(PairedThreadIds base) {
        if (base.key() == null) {
            this.key = new PairedThreadIdsKey(
                base.getThreadA()
            );
            this._threadA = base.getThreadA();
        } else {
            this.key = base.key();
            this._threadA = key.getThreadA();
        }
        this._threadB = base.getThreadB();
        if (base instanceof PairedThreadIdsImpl) {
            PairedThreadIdsImpl impl = (PairedThreadIdsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<PairedThreadIds> casted =(AugmentationHolder<PairedThreadIds>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public PairedThreadIdsKey key() {
        return key;
    }
    
    public Short getThreadA() {
        return _threadA;
    }
    
    public Short getThreadB() {
        return _threadB;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<PairedThreadIds>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public PairedThreadIdsBuilder withKey(final PairedThreadIdsKey key) {
        this.key = key;
        return this;
    }
    private static void checkThreadARange(final short value) {
        if (value >= (short)0 && value <= (short)255) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..255]]", value);
    }
    
    public PairedThreadIdsBuilder setThreadA(final Short value) {
    if (value != null) {
        checkThreadARange(value);
        
    }
        this._threadA = value;
        return this;
    }
    private static void checkThreadBRange(final short value) {
        if (value >= (short)0 && value <= (short)255) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..255]]", value);
    }
    
    public PairedThreadIdsBuilder setThreadB(final Short value) {
    if (value != null) {
        checkThreadBRange(value);
        
    }
        this._threadB = value;
        return this;
    }
    
    public PairedThreadIdsBuilder addAugmentation(Class<? extends Augmentation<PairedThreadIds>> augmentationType, Augmentation<PairedThreadIds> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public PairedThreadIdsBuilder removeAugmentation(Class<? extends Augmentation<PairedThreadIds>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public PairedThreadIds build() {
        return new PairedThreadIdsImpl(this);
    }

    private static final class PairedThreadIdsImpl implements PairedThreadIds {

        @Override
        public Class<PairedThreadIds> getImplementedInterface() {
            return PairedThreadIds.class;
        }

        private final Short _threadA;
        private final Short _threadB;
        private final PairedThreadIdsKey key;

        private Map<Class<? extends Augmentation<PairedThreadIds>>, Augmentation<PairedThreadIds>> augmentation = Collections.emptyMap();

        private PairedThreadIdsImpl(PairedThreadIdsBuilder base) {
            if (base.key() == null) {
                this.key = new PairedThreadIdsKey(
                    base.getThreadA()
                );
                this._threadA = base.getThreadA();
            } else {
                this.key = base.key();
                this._threadA = key.getThreadA();
            }
            this._threadB = base.getThreadB();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public PairedThreadIdsKey key() {
            return key;
        }
        
        @Override
        public Short getThreadA() {
            return _threadA;
        }
        
        @Override
        public Short getThreadB() {
            return _threadB;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<PairedThreadIds>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_threadA);
            result = prime * result + Objects.hashCode(_threadB);
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
            if (!PairedThreadIds.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            PairedThreadIds other = (PairedThreadIds)obj;
            if (!Objects.equals(_threadA, other.getThreadA())) {
                return false;
            }
            if (!Objects.equals(_threadB, other.getThreadB())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                PairedThreadIdsImpl otherImpl = (PairedThreadIdsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<PairedThreadIds>>, Augmentation<PairedThreadIds>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("PairedThreadIds");
            CodeHelpers.appendValue(helper, "_threadA", _threadA);
            CodeHelpers.appendValue(helper, "_threadB", _threadB);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
