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
 * Class that builds {@link Cores} instances.
 * 
 * @see Cores
 *
 */
public class CoresBuilder implements Builder<Cores> {

    private Short _numCores;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("cores");

    Map<Class<? extends Augmentation<Cores>>, Augmentation<Cores>> augmentation = Collections.emptyMap();

    public CoresBuilder() {
    }

    public CoresBuilder(Cores base) {
        this._numCores = base.getNumCores();
        if (base instanceof CoresImpl) {
            CoresImpl impl = (CoresImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Cores> casted =(AugmentationHolder<Cores>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public Short getNumCores() {
        return _numCores;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Cores>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    private static void checkNumCoresRange(final short value) {
        if (value >= (short)0 && value <= (short)255) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..255]]", value);
    }
    
    public CoresBuilder setNumCores(final Short value) {
    if (value != null) {
        checkNumCoresRange(value);
        
    }
        this._numCores = value;
        return this;
    }
    
    public CoresBuilder addAugmentation(Class<? extends Augmentation<Cores>> augmentationType, Augmentation<Cores> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public CoresBuilder removeAugmentation(Class<? extends Augmentation<Cores>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cores build() {
        return new CoresImpl(this);
    }

    private static final class CoresImpl implements Cores {

        @Override
        public Class<Cores> getImplementedInterface() {
            return Cores.class;
        }

        private final Short _numCores;

        private Map<Class<? extends Augmentation<Cores>>, Augmentation<Cores>> augmentation = Collections.emptyMap();

        private CoresImpl(CoresBuilder base) {
            this._numCores = base.getNumCores();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public Short getNumCores() {
            return _numCores;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Cores>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_numCores);
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
            if (!Cores.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Cores other = (Cores)obj;
            if (!Objects.equals(_numCores, other.getNumCores())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CoresImpl otherImpl = (CoresImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Cores>>, Augmentation<Cores>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Cores");
            CodeHelpers.appendValue(helper, "_numCores", _numCores);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
