package ns.yang.ietf.l2.topology.rev150623.l2.network.attributes;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.l2.topology.rev150623.$YangModuleInfoImpl;
import ns.yang.ietf.l2.topology.rev150623.FlagIdentity;

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
 * Class that builds {@link L2NetworkAttributes} instances.
 * 
 * @see L2NetworkAttributes
 *
 */
public class L2NetworkAttributesBuilder implements Builder<L2NetworkAttributes> {

    private List<Class<? extends FlagIdentity>> _flag;
    private String _name;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("l2-network-attributes");

    Map<Class<? extends Augmentation<L2NetworkAttributes>>, Augmentation<L2NetworkAttributes>> augmentation = Collections.emptyMap();

    public L2NetworkAttributesBuilder() {
    }

    public L2NetworkAttributesBuilder(L2NetworkAttributes base) {
        this._flag = base.getFlag();
        this._name = base.getName();
        if (base instanceof L2NetworkAttributesImpl) {
            L2NetworkAttributesImpl impl = (L2NetworkAttributesImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<L2NetworkAttributes> casted =(AugmentationHolder<L2NetworkAttributes>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<Class<? extends FlagIdentity>> getFlag() {
        return _flag;
    }
    
    public String getName() {
        return _name;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<L2NetworkAttributes>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public L2NetworkAttributesBuilder setFlag(final List<Class<? extends FlagIdentity>> values) {
        this._flag = values;
        return this;
    }
    
    
    public L2NetworkAttributesBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public L2NetworkAttributesBuilder addAugmentation(Class<? extends Augmentation<L2NetworkAttributes>> augmentationType, Augmentation<L2NetworkAttributes> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public L2NetworkAttributesBuilder removeAugmentation(Class<? extends Augmentation<L2NetworkAttributes>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public L2NetworkAttributes build() {
        return new L2NetworkAttributesImpl(this);
    }

    private static final class L2NetworkAttributesImpl implements L2NetworkAttributes {

        @Override
        public Class<L2NetworkAttributes> getImplementedInterface() {
            return L2NetworkAttributes.class;
        }

        private final List<Class<? extends FlagIdentity>> _flag;
        private final String _name;

        private Map<Class<? extends Augmentation<L2NetworkAttributes>>, Augmentation<L2NetworkAttributes>> augmentation = Collections.emptyMap();

        private L2NetworkAttributesImpl(L2NetworkAttributesBuilder base) {
            this._flag = base.getFlag();
            this._name = base.getName();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public List<Class<? extends FlagIdentity>> getFlag() {
            return _flag;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<L2NetworkAttributes>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_flag);
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
            if (!L2NetworkAttributes.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            L2NetworkAttributes other = (L2NetworkAttributes)obj;
            if (!Objects.equals(_flag, other.getFlag())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                L2NetworkAttributesImpl otherImpl = (L2NetworkAttributesImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<L2NetworkAttributes>>, Augmentation<L2NetworkAttributes>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("L2NetworkAttributes");
            CodeHelpers.appendValue(helper, "_flag", _flag);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
