package ns.yang.nfvo.mano.types.rev170208.vca.metrics;
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
 * Class that builds {@link Metrics} instances.
 * 
 * @see Metrics
 *
 */
public class MetricsBuilder implements Builder<Metrics> {

    private String _name;
    private MetricsKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("metrics");

    Map<Class<? extends Augmentation<Metrics>>, Augmentation<Metrics>> augmentation = Collections.emptyMap();

    public MetricsBuilder() {
    }

    public MetricsBuilder(Metrics base) {
        if (base.key() == null) {
            this.key = new MetricsKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this.key = base.key();
            this._name = key.getName();
        }
        if (base instanceof MetricsImpl) {
            MetricsImpl impl = (MetricsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Metrics> casted =(AugmentationHolder<Metrics>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public MetricsKey key() {
        return key;
    }
    
    public String getName() {
        return _name;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Metrics>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public MetricsBuilder withKey(final MetricsKey key) {
        this.key = key;
        return this;
    }
    
    public MetricsBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public MetricsBuilder addAugmentation(Class<? extends Augmentation<Metrics>> augmentationType, Augmentation<Metrics> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public MetricsBuilder removeAugmentation(Class<? extends Augmentation<Metrics>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Metrics build() {
        return new MetricsImpl(this);
    }

    private static final class MetricsImpl implements Metrics {

        @Override
        public Class<Metrics> getImplementedInterface() {
            return Metrics.class;
        }

        private final String _name;
        private final MetricsKey key;

        private Map<Class<? extends Augmentation<Metrics>>, Augmentation<Metrics>> augmentation = Collections.emptyMap();

        private MetricsImpl(MetricsBuilder base) {
            if (base.key() == null) {
                this.key = new MetricsKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this.key = base.key();
                this._name = key.getName();
            }
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public MetricsKey key() {
            return key;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Metrics>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_name);
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
            if (!Metrics.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Metrics other = (Metrics)obj;
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MetricsImpl otherImpl = (MetricsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Metrics>>, Augmentation<Metrics>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Metrics");
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
