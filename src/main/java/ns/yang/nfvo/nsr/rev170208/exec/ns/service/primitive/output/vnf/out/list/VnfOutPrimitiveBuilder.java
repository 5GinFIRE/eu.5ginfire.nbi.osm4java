package ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.vnf.out.list;
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
 * Class that builds {@link VnfOutPrimitive} instances.
 * 
 * @see VnfOutPrimitive
 *
 */
public class VnfOutPrimitiveBuilder implements Builder<VnfOutPrimitive> {

    private String _executionErrorDetails;
    private String _executionId;
    private String _executionStatus;
    private Long _index;
    private String _name;
    private List<Parameter> _parameter;
    private VnfOutPrimitiveKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnf-out-primitive");

    Map<Class<? extends Augmentation<VnfOutPrimitive>>, Augmentation<VnfOutPrimitive>> augmentation = Collections.emptyMap();

    public VnfOutPrimitiveBuilder() {
    }
    public VnfOutPrimitiveBuilder(ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue arg) {
        this._parameter = arg.getParameter();
    }

    public VnfOutPrimitiveBuilder(VnfOutPrimitive base) {
        if (base.key() == null) {
            this.key = new VnfOutPrimitiveKey(
                base.getIndex()
            );
            this._index = base.getIndex();
        } else {
            this.key = base.key();
            this._index = key.getIndex();
        }
        this._executionErrorDetails = base.getExecutionErrorDetails();
        this._executionId = base.getExecutionId();
        this._executionStatus = base.getExecutionStatus();
        this._name = base.getName();
        this._parameter = base.getParameter();
        if (base instanceof VnfOutPrimitiveImpl) {
            VnfOutPrimitiveImpl impl = (VnfOutPrimitiveImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<VnfOutPrimitive> casted =(AugmentationHolder<VnfOutPrimitive>) base;
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

    public VnfOutPrimitiveKey key() {
        return key;
    }
    
    public String getExecutionErrorDetails() {
        return _executionErrorDetails;
    }
    
    public String getExecutionId() {
        return _executionId;
    }
    
    public String getExecutionStatus() {
        return _executionStatus;
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
    public <E extends Augmentation<VnfOutPrimitive>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public VnfOutPrimitiveBuilder withKey(final VnfOutPrimitiveKey key) {
        this.key = key;
        return this;
    }
    
    public VnfOutPrimitiveBuilder setExecutionErrorDetails(final String value) {
        this._executionErrorDetails = value;
        return this;
    }
    
    public VnfOutPrimitiveBuilder setExecutionId(final String value) {
        this._executionId = value;
        return this;
    }
    
    public VnfOutPrimitiveBuilder setExecutionStatus(final String value) {
        this._executionStatus = value;
        return this;
    }
    private static void checkIndexRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public VnfOutPrimitiveBuilder setIndex(final Long value) {
    if (value != null) {
        checkIndexRange(value);
        
    }
        this._index = value;
        return this;
    }
    
    public VnfOutPrimitiveBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    public VnfOutPrimitiveBuilder setParameter(final List<Parameter> values) {
        this._parameter = values;
        return this;
    }
    
    
    public VnfOutPrimitiveBuilder addAugmentation(Class<? extends Augmentation<VnfOutPrimitive>> augmentationType, Augmentation<VnfOutPrimitive> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfOutPrimitiveBuilder removeAugmentation(Class<? extends Augmentation<VnfOutPrimitive>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VnfOutPrimitive build() {
        return new VnfOutPrimitiveImpl(this);
    }

    private static final class VnfOutPrimitiveImpl implements VnfOutPrimitive {

        @Override
        public Class<VnfOutPrimitive> getImplementedInterface() {
            return VnfOutPrimitive.class;
        }

        private final String _executionErrorDetails;
        private final String _executionId;
        private final String _executionStatus;
        private final Long _index;
        private final String _name;
        private final List<Parameter> _parameter;
        private final VnfOutPrimitiveKey key;

        private Map<Class<? extends Augmentation<VnfOutPrimitive>>, Augmentation<VnfOutPrimitive>> augmentation = Collections.emptyMap();

        private VnfOutPrimitiveImpl(VnfOutPrimitiveBuilder base) {
            if (base.key() == null) {
                this.key = new VnfOutPrimitiveKey(
                    base.getIndex()
                );
                this._index = base.getIndex();
            } else {
                this.key = base.key();
                this._index = key.getIndex();
            }
            this._executionErrorDetails = base.getExecutionErrorDetails();
            this._executionId = base.getExecutionId();
            this._executionStatus = base.getExecutionStatus();
            this._name = base.getName();
            this._parameter = base.getParameter();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public VnfOutPrimitiveKey key() {
            return key;
        }
        
        @Override
        public String getExecutionErrorDetails() {
            return _executionErrorDetails;
        }
        
        @Override
        public String getExecutionId() {
            return _executionId;
        }
        
        @Override
        public String getExecutionStatus() {
            return _executionStatus;
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
        public <E extends Augmentation<VnfOutPrimitive>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_executionErrorDetails);
            result = prime * result + Objects.hashCode(_executionId);
            result = prime * result + Objects.hashCode(_executionStatus);
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
            if (!VnfOutPrimitive.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            VnfOutPrimitive other = (VnfOutPrimitive)obj;
            if (!Objects.equals(_executionErrorDetails, other.getExecutionErrorDetails())) {
                return false;
            }
            if (!Objects.equals(_executionId, other.getExecutionId())) {
                return false;
            }
            if (!Objects.equals(_executionStatus, other.getExecutionStatus())) {
                return false;
            }
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
                VnfOutPrimitiveImpl otherImpl = (VnfOutPrimitiveImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VnfOutPrimitive>>, Augmentation<VnfOutPrimitive>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VnfOutPrimitive");
            CodeHelpers.appendValue(helper, "_executionErrorDetails", _executionErrorDetails);
            CodeHelpers.appendValue(helper, "_executionId", _executionId);
            CodeHelpers.appendValue(helper, "_executionStatus", _executionStatus);
            CodeHelpers.appendValue(helper, "_index", _index);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_parameter", _parameter);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
