package ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.ns.service.primitive.service.primitive.parameter.group.Parameter;

import java.lang.Boolean;
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
 * Class that builds {@link ParameterGroup} instances.
 * 
 * @see ParameterGroup
 *
 */
public class ParameterGroupBuilder implements Builder<ParameterGroup> {

    private String _name;
    private List<Parameter> _parameter;
    private Boolean _mandatory;
    private ParameterGroupKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("parameter-group");

    Map<Class<? extends Augmentation<ParameterGroup>>, Augmentation<ParameterGroup>> augmentation = Collections.emptyMap();

    public ParameterGroupBuilder() {
    }

    public ParameterGroupBuilder(ParameterGroup base) {
        if (base.key() == null) {
            this.key = new ParameterGroupKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this.key = base.key();
            this._name = key.getName();
        }
        this._parameter = base.getParameter();
        this._mandatory = base.isMandatory();
        if (base instanceof ParameterGroupImpl) {
            ParameterGroupImpl impl = (ParameterGroupImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ParameterGroup> casted =(AugmentationHolder<ParameterGroup>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public ParameterGroupKey key() {
        return key;
    }
    
    public String getName() {
        return _name;
    }
    
    public List<Parameter> getParameter() {
        return _parameter;
    }
    
    public Boolean isMandatory() {
        return _mandatory;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ParameterGroup>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public ParameterGroupBuilder withKey(final ParameterGroupKey key) {
        this.key = key;
        return this;
    }
    
    public ParameterGroupBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    public ParameterGroupBuilder setParameter(final List<Parameter> values) {
        this._parameter = values;
        return this;
    }
    
    
    public ParameterGroupBuilder setMandatory(final Boolean value) {
        this._mandatory = value;
        return this;
    }
    
    public ParameterGroupBuilder addAugmentation(Class<? extends Augmentation<ParameterGroup>> augmentationType, Augmentation<ParameterGroup> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ParameterGroupBuilder removeAugmentation(Class<? extends Augmentation<ParameterGroup>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ParameterGroup build() {
        return new ParameterGroupImpl(this);
    }

    private static final class ParameterGroupImpl implements ParameterGroup {

        @Override
        public Class<ParameterGroup> getImplementedInterface() {
            return ParameterGroup.class;
        }

        private final String _name;
        private final List<Parameter> _parameter;
        private final Boolean _mandatory;
        private final ParameterGroupKey key;

        private Map<Class<? extends Augmentation<ParameterGroup>>, Augmentation<ParameterGroup>> augmentation = Collections.emptyMap();

        private ParameterGroupImpl(ParameterGroupBuilder base) {
            if (base.key() == null) {
                this.key = new ParameterGroupKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this.key = base.key();
                this._name = key.getName();
            }
            this._parameter = base.getParameter();
            this._mandatory = base.isMandatory();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public ParameterGroupKey key() {
            return key;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public List<Parameter> getParameter() {
            return _parameter;
        }
        
        @Override
        public Boolean isMandatory() {
            return _mandatory;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ParameterGroup>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_parameter);
            result = prime * result + Objects.hashCode(_mandatory);
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
            if (!ParameterGroup.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ParameterGroup other = (ParameterGroup)obj;
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_parameter, other.getParameter())) {
                return false;
            }
            if (!Objects.equals(_mandatory, other.isMandatory())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ParameterGroupImpl otherImpl = (ParameterGroupImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ParameterGroup>>, Augmentation<ParameterGroup>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ParameterGroup");
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_parameter", _parameter);
            CodeHelpers.appendValue(helper, "_mandatory", _mandatory);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
