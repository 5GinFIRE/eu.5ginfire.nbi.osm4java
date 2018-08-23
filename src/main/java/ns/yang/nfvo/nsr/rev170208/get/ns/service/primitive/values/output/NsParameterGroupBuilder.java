package ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.ns.parameter.group.Parameter;

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
 * Class that builds {@link NsParameterGroup} instances.
 * 
 * @see NsParameterGroup
 *
 */
public class NsParameterGroupBuilder implements Builder<NsParameterGroup> {

    private String _name;
    private List<Parameter> _parameter;
    private NsParameterGroupKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ns-parameter-group");

    Map<Class<? extends Augmentation<NsParameterGroup>>, Augmentation<NsParameterGroup>> augmentation = Collections.emptyMap();

    public NsParameterGroupBuilder() {
    }

    public NsParameterGroupBuilder(NsParameterGroup base) {
        if (base.key() == null) {
            this.key = new NsParameterGroupKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this.key = base.key();
            this._name = key.getName();
        }
        this._parameter = base.getParameter();
        if (base instanceof NsParameterGroupImpl) {
            NsParameterGroupImpl impl = (NsParameterGroupImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<NsParameterGroup> casted =(AugmentationHolder<NsParameterGroup>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public NsParameterGroupKey key() {
        return key;
    }
    
    public String getName() {
        return _name;
    }
    
    public List<Parameter> getParameter() {
        return _parameter;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<NsParameterGroup>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public NsParameterGroupBuilder withKey(final NsParameterGroupKey key) {
        this.key = key;
        return this;
    }
    
    public NsParameterGroupBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    public NsParameterGroupBuilder setParameter(final List<Parameter> values) {
        this._parameter = values;
        return this;
    }
    
    
    public NsParameterGroupBuilder addAugmentation(Class<? extends Augmentation<NsParameterGroup>> augmentationType, Augmentation<NsParameterGroup> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NsParameterGroupBuilder removeAugmentation(Class<? extends Augmentation<NsParameterGroup>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public NsParameterGroup build() {
        return new NsParameterGroupImpl(this);
    }

    private static final class NsParameterGroupImpl implements NsParameterGroup {

        @Override
        public Class<NsParameterGroup> getImplementedInterface() {
            return NsParameterGroup.class;
        }

        private final String _name;
        private final List<Parameter> _parameter;
        private final NsParameterGroupKey key;

        private Map<Class<? extends Augmentation<NsParameterGroup>>, Augmentation<NsParameterGroup>> augmentation = Collections.emptyMap();

        private NsParameterGroupImpl(NsParameterGroupBuilder base) {
            if (base.key() == null) {
                this.key = new NsParameterGroupKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this.key = base.key();
                this._name = key.getName();
            }
            this._parameter = base.getParameter();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public NsParameterGroupKey key() {
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
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<NsParameterGroup>> E augmentation(Class<E> augmentationType) {
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
            if (!NsParameterGroup.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            NsParameterGroup other = (NsParameterGroup)obj;
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_parameter, other.getParameter())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NsParameterGroupImpl otherImpl = (NsParameterGroupImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<NsParameterGroup>>, Augmentation<NsParameterGroup>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("NsParameterGroup");
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_parameter", _parameter);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
