package yang.vnfd.vnfd.descriptor.vdu.cloud.init.input;
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
 * Class that builds {@link Inline} instances.
 * 
 * @see Inline
 *
 */
public class InlineBuilder implements Builder<Inline> {

    private String _cloudInit;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("inline");

    Map<Class<? extends Augmentation<Inline>>, Augmentation<Inline>> augmentation = Collections.emptyMap();

    public InlineBuilder() {
    }

    public InlineBuilder(Inline base) {
        this._cloudInit = base.getCloudInit();
        if (base instanceof InlineImpl) {
            InlineImpl impl = (InlineImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Inline> casted =(AugmentationHolder<Inline>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public String getCloudInit() {
        return _cloudInit;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Inline>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public InlineBuilder setCloudInit(final String value) {
        this._cloudInit = value;
        return this;
    }
    
    public InlineBuilder addAugmentation(Class<? extends Augmentation<Inline>> augmentationType, Augmentation<Inline> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public InlineBuilder removeAugmentation(Class<? extends Augmentation<Inline>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Inline build() {
        return new InlineImpl(this);
    }

    private static final class InlineImpl implements Inline {

        @Override
        public Class<Inline> getImplementedInterface() {
            return Inline.class;
        }

        private final String _cloudInit;

        private Map<Class<? extends Augmentation<Inline>>, Augmentation<Inline>> augmentation = Collections.emptyMap();

        private InlineImpl(InlineBuilder base) {
            this._cloudInit = base.getCloudInit();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public String getCloudInit() {
            return _cloudInit;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Inline>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_cloudInit);
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
            if (!Inline.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Inline other = (Inline)obj;
            if (!Objects.equals(_cloudInit, other.getCloudInit())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InlineImpl otherImpl = (InlineImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Inline>>, Augmentation<Inline>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Inline");
            CodeHelpers.appendValue(helper, "_cloudInit", _cloudInit);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
