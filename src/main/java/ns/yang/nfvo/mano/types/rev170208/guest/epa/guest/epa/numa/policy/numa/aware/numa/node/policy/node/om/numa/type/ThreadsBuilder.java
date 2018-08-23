package ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa.numa.policy.numa.aware.numa.node.policy.node.om.numa.type;
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
 * Class that builds {@link Threads} instances.
 * 
 * @see Threads
 *
 */
public class ThreadsBuilder implements Builder<Threads> {

    private Short _numThreads;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("threads");

    Map<Class<? extends Augmentation<Threads>>, Augmentation<Threads>> augmentation = Collections.emptyMap();

    public ThreadsBuilder() {
    }

    public ThreadsBuilder(Threads base) {
        this._numThreads = base.getNumThreads();
        if (base instanceof ThreadsImpl) {
            ThreadsImpl impl = (ThreadsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Threads> casted =(AugmentationHolder<Threads>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public Short getNumThreads() {
        return _numThreads;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Threads>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    private static void checkNumThreadsRange(final short value) {
        if (value >= (short)0 && value <= (short)255) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..255]]", value);
    }
    
    public ThreadsBuilder setNumThreads(final Short value) {
    if (value != null) {
        checkNumThreadsRange(value);
        
    }
        this._numThreads = value;
        return this;
    }
    
    public ThreadsBuilder addAugmentation(Class<? extends Augmentation<Threads>> augmentationType, Augmentation<Threads> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ThreadsBuilder removeAugmentation(Class<? extends Augmentation<Threads>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Threads build() {
        return new ThreadsImpl(this);
    }

    private static final class ThreadsImpl implements Threads {

        @Override
        public Class<Threads> getImplementedInterface() {
            return Threads.class;
        }

        private final Short _numThreads;

        private Map<Class<? extends Augmentation<Threads>>, Augmentation<Threads>> augmentation = Collections.emptyMap();

        private ThreadsImpl(ThreadsBuilder base) {
            this._numThreads = base.getNumThreads();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public Short getNumThreads() {
            return _numThreads;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Threads>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_numThreads);
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
            if (!Threads.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Threads other = (Threads)obj;
            if (!Objects.equals(_numThreads, other.getNumThreads())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ThreadsImpl otherImpl = (ThreadsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Threads>>, Augmentation<Threads>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Threads");
            CodeHelpers.appendValue(helper, "_numThreads", _numThreads);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
