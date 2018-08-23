package ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.om.numa.type;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;

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
 * Class that builds {@link PairedThreads} instances.
 * 
 * @see PairedThreads
 *
 */
public class PairedThreadsBuilder implements Builder<PairedThreads> {

    private ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.om.numa.type.paired.threads.PairedThreads _pairedThreads;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("paired-threads");

    Map<Class<? extends Augmentation<PairedThreads>>, Augmentation<PairedThreads>> augmentation = Collections.emptyMap();

    public PairedThreadsBuilder() {
    }

    public PairedThreadsBuilder(PairedThreads base) {
        this._pairedThreads = base.getPairedThreads();
        if (base instanceof PairedThreadsImpl) {
            PairedThreadsImpl impl = (PairedThreadsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<PairedThreads> casted =(AugmentationHolder<PairedThreads>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.om.numa.type.paired.threads.PairedThreads getPairedThreads() {
        return _pairedThreads;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<PairedThreads>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public PairedThreadsBuilder setPairedThreads(final ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.om.numa.type.paired.threads.PairedThreads value) {
        this._pairedThreads = value;
        return this;
    }
    
    public PairedThreadsBuilder addAugmentation(Class<? extends Augmentation<PairedThreads>> augmentationType, Augmentation<PairedThreads> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public PairedThreadsBuilder removeAugmentation(Class<? extends Augmentation<PairedThreads>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public PairedThreads build() {
        return new PairedThreadsImpl(this);
    }

    private static final class PairedThreadsImpl implements PairedThreads {

        @Override
        public Class<PairedThreads> getImplementedInterface() {
            return PairedThreads.class;
        }

        private final ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.om.numa.type.paired.threads.PairedThreads _pairedThreads;

        private Map<Class<? extends Augmentation<PairedThreads>>, Augmentation<PairedThreads>> augmentation = Collections.emptyMap();

        private PairedThreadsImpl(PairedThreadsBuilder base) {
            this._pairedThreads = base.getPairedThreads();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.om.numa.type.paired.threads.PairedThreads getPairedThreads() {
            return _pairedThreads;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<PairedThreads>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_pairedThreads);
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
            if (!PairedThreads.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            PairedThreads other = (PairedThreads)obj;
            if (!Objects.equals(_pairedThreads, other.getPairedThreads())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                PairedThreadsImpl otherImpl = (PairedThreadsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<PairedThreads>>, Augmentation<PairedThreads>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("PairedThreads");
            CodeHelpers.appendValue(helper, "_pairedThreads", _pairedThreads);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
