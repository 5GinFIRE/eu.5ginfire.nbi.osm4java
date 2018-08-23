package ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;

import java.lang.Boolean;
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
 * Class that builds {@link Aws} instances.
 * 
 * @see Aws
 *
 */
public class AwsBuilder implements Builder<Aws> {

    private Boolean _awsConstruct;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("aws");

    Map<Class<? extends Augmentation<Aws>>, Augmentation<Aws>> augmentation = Collections.emptyMap();

    public AwsBuilder() {
    }

    public AwsBuilder(Aws base) {
        this._awsConstruct = base.isAwsConstruct();
        if (base instanceof AwsImpl) {
            AwsImpl impl = (AwsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Aws> casted =(AugmentationHolder<Aws>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public Boolean isAwsConstruct() {
        return _awsConstruct;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Aws>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public AwsBuilder setAwsConstruct(final Boolean value) {
        this._awsConstruct = value;
        return this;
    }
    
    public AwsBuilder addAugmentation(Class<? extends Augmentation<Aws>> augmentationType, Augmentation<Aws> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public AwsBuilder removeAugmentation(Class<? extends Augmentation<Aws>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Aws build() {
        return new AwsImpl(this);
    }

    private static final class AwsImpl implements Aws {

        @Override
        public Class<Aws> getImplementedInterface() {
            return Aws.class;
        }

        private final Boolean _awsConstruct;

        private Map<Class<? extends Augmentation<Aws>>, Augmentation<Aws>> augmentation = Collections.emptyMap();

        private AwsImpl(AwsBuilder base) {
            this._awsConstruct = base.isAwsConstruct();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public Boolean isAwsConstruct() {
            return _awsConstruct;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Aws>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_awsConstruct);
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
            if (!Aws.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Aws other = (Aws)obj;
            if (!Objects.equals(_awsConstruct, other.isAwsConstruct())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AwsImpl otherImpl = (AwsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Aws>>, Augmentation<Aws>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Aws");
            CodeHelpers.appendValue(helper, "_awsConstruct", _awsConstruct);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
