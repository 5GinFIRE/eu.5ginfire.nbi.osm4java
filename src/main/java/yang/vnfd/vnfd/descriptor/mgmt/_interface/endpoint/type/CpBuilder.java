package yang.vnfd.vnfd.descriptor.mgmt._interface.endpoint.type;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

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
 * Class that builds {@link Cp} instances.
 * 
 * @see Cp
 *
 */
public class CpBuilder implements Builder<Cp> {

    private String _cp;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("cp");

    Map<Class<? extends Augmentation<Cp>>, Augmentation<Cp>> augmentation = Collections.emptyMap();

    public CpBuilder() {
    }

    public CpBuilder(Cp base) {
        this._cp = base.getCp();
        if (base instanceof CpImpl) {
            CpImpl impl = (CpImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Cp> casted =(AugmentationHolder<Cp>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public String getCp() {
        return _cp;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Cp>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public CpBuilder setCp(final String value) {
        this._cp = value;
        return this;
    }
    
    public CpBuilder addAugmentation(Class<? extends Augmentation<Cp>> augmentationType, Augmentation<Cp> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public CpBuilder removeAugmentation(Class<? extends Augmentation<Cp>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cp build() {
        return new CpImpl(this);
    }

    private static final class CpImpl implements Cp {

        @Override
        public Class<Cp> getImplementedInterface() {
            return Cp.class;
        }

        private final String _cp;

        private Map<Class<? extends Augmentation<Cp>>, Augmentation<Cp>> augmentation = Collections.emptyMap();

        private CpImpl(CpBuilder base) {
            this._cp = base.getCp();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public String getCp() {
            return _cp;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Cp>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cp);
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
            if (!Cp.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Cp other = (Cp)obj;
            if (!Objects.equals(_cp, other.getCp())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CpImpl otherImpl = (CpImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Cp>>, Augmentation<Cp>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Cp");
            CodeHelpers.appendValue(helper, "_cp", _cp);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
