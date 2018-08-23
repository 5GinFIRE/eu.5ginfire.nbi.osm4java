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
 * Class that builds {@link Mock} instances.
 * 
 * @see Mock
 *
 */
public class MockBuilder implements Builder<Mock> {

    private Boolean _mockConstruct;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("mock");

    Map<Class<? extends Augmentation<Mock>>, Augmentation<Mock>> augmentation = Collections.emptyMap();

    public MockBuilder() {
    }

    public MockBuilder(Mock base) {
        this._mockConstruct = base.isMockConstruct();
        if (base instanceof MockImpl) {
            MockImpl impl = (MockImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Mock> casted =(AugmentationHolder<Mock>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public Boolean isMockConstruct() {
        return _mockConstruct;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Mock>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public MockBuilder setMockConstruct(final Boolean value) {
        this._mockConstruct = value;
        return this;
    }
    
    public MockBuilder addAugmentation(Class<? extends Augmentation<Mock>> augmentationType, Augmentation<Mock> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public MockBuilder removeAugmentation(Class<? extends Augmentation<Mock>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Mock build() {
        return new MockImpl(this);
    }

    private static final class MockImpl implements Mock {

        @Override
        public Class<Mock> getImplementedInterface() {
            return Mock.class;
        }

        private final Boolean _mockConstruct;

        private Map<Class<? extends Augmentation<Mock>>, Augmentation<Mock>> augmentation = Collections.emptyMap();

        private MockImpl(MockBuilder base) {
            this._mockConstruct = base.isMockConstruct();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public Boolean isMockConstruct() {
            return _mockConstruct;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Mock>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_mockConstruct);
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
            if (!Mock.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Mock other = (Mock)obj;
            if (!Objects.equals(_mockConstruct, other.isMockConstruct())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MockImpl otherImpl = (MockImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Mock>>, Augmentation<Mock>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Mock");
            CodeHelpers.appendValue(helper, "_mockConstruct", _mockConstruct);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
