package ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.vnf.list;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.primitive.parameter.value.Parameter;
import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;

import java.lang.Class;
import java.lang.Long;
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
 * Class that builds {@link VnfPrimitive} instances.
 * 
 * @see VnfPrimitive
 *
 */
public class VnfPrimitiveBuilder implements Builder<VnfPrimitive> {

    private Long _index;
    private String _name;
    private List<Parameter> _parameter;
    private VnfPrimitiveKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnf-primitive");

    Map<Class<? extends Augmentation<VnfPrimitive>>, Augmentation<VnfPrimitive>> augmentation = Collections.emptyMap();

    public VnfPrimitiveBuilder() {
    }
    public VnfPrimitiveBuilder(ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue arg) {
        this._parameter = arg.getParameter();
    }

    public VnfPrimitiveBuilder(VnfPrimitive base) {
        if (base.key() == null) {
            this.key = new VnfPrimitiveKey(
                base.getIndex()
            );
            this._index = base.getIndex();
        } else {
            this.key = base.key();
            this._index = key.getIndex();
        }
        this._name = base.getName();
        this._parameter = base.getParameter();
        if (base instanceof VnfPrimitiveImpl) {
            VnfPrimitiveImpl impl = (VnfPrimitiveImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<VnfPrimitive> casted =(AugmentationHolder<VnfPrimitive>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue) {
            this._parameter = ((ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue)arg).getParameter();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue]");
    }

    public VnfPrimitiveKey key() {
        return key;
    }
    
    public Long getIndex() {
        return _index;
    }
    
    public String getName() {
        return _name;
    }
    
    public List<Parameter> getParameter() {
        return _parameter;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<VnfPrimitive>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public VnfPrimitiveBuilder withKey(final VnfPrimitiveKey key) {
        this.key = key;
        return this;
    }
    private static void checkIndexRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public VnfPrimitiveBuilder setIndex(final Long value) {
    if (value != null) {
        checkIndexRange(value);
        
    }
        this._index = value;
        return this;
    }
    
    public VnfPrimitiveBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    public VnfPrimitiveBuilder setParameter(final List<Parameter> values) {
        this._parameter = values;
        return this;
    }
    
    
    public VnfPrimitiveBuilder addAugmentation(Class<? extends Augmentation<VnfPrimitive>> augmentationType, Augmentation<VnfPrimitive> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfPrimitiveBuilder removeAugmentation(Class<? extends Augmentation<VnfPrimitive>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VnfPrimitive build() {
        return new VnfPrimitiveImpl(this);
    }

    private static final class VnfPrimitiveImpl implements VnfPrimitive {

        @Override
        public Class<VnfPrimitive> getImplementedInterface() {
            return VnfPrimitive.class;
        }

        private final Long _index;
        private final String _name;
        private final List<Parameter> _parameter;
        private final VnfPrimitiveKey key;

        private Map<Class<? extends Augmentation<VnfPrimitive>>, Augmentation<VnfPrimitive>> augmentation = Collections.emptyMap();

        private VnfPrimitiveImpl(VnfPrimitiveBuilder base) {
            if (base.key() == null) {
                this.key = new VnfPrimitiveKey(
                    base.getIndex()
                );
                this._index = base.getIndex();
            } else {
                this.key = base.key();
                this._index = key.getIndex();
            }
            this._name = base.getName();
            this._parameter = base.getParameter();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public VnfPrimitiveKey key() {
            return key;
        }
        
        @Override
        public Long getIndex() {
            return _index;
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
        public <E extends Augmentation<VnfPrimitive>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_index);
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
            if (!VnfPrimitive.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            VnfPrimitive other = (VnfPrimitive)obj;
            if (!Objects.equals(_index, other.getIndex())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_parameter, other.getParameter())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfPrimitiveImpl otherImpl = (VnfPrimitiveImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VnfPrimitive>>, Augmentation<VnfPrimitive>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VnfPrimitive");
            CodeHelpers.appendValue(helper, "_index", _index);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_parameter", _parameter);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
