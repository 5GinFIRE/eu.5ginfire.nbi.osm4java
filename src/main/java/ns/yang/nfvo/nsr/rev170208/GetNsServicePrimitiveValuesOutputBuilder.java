package ns.yang.nfvo.nsr.rev170208;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.NsParameter;
import ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.NsParameterGroup;
import ns.yang.nfvo.nsr.rev170208.get.ns.service.primitive.values.output.VnfPrimitiveGroup;

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
 * Class that builds {@link GetNsServicePrimitiveValuesOutput} instances.
 * 
 * @see GetNsServicePrimitiveValuesOutput
 *
 */
public class GetNsServicePrimitiveValuesOutputBuilder implements Builder<GetNsServicePrimitiveValuesOutput> {

    private List<NsParameter> _nsParameter;
    private List<NsParameterGroup> _nsParameterGroup;
    private List<VnfPrimitiveGroup> _vnfPrimitiveGroup;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("output");

    Map<Class<? extends Augmentation<GetNsServicePrimitiveValuesOutput>>, Augmentation<GetNsServicePrimitiveValuesOutput>> augmentation = Collections.emptyMap();

    public GetNsServicePrimitiveValuesOutputBuilder() {
    }

    public GetNsServicePrimitiveValuesOutputBuilder(GetNsServicePrimitiveValuesOutput base) {
        this._nsParameter = base.getNsParameter();
        this._nsParameterGroup = base.getNsParameterGroup();
        this._vnfPrimitiveGroup = base.getVnfPrimitiveGroup();
        if (base instanceof GetNsServicePrimitiveValuesOutputImpl) {
            GetNsServicePrimitiveValuesOutputImpl impl = (GetNsServicePrimitiveValuesOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<GetNsServicePrimitiveValuesOutput> casted =(AugmentationHolder<GetNsServicePrimitiveValuesOutput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<NsParameter> getNsParameter() {
        return _nsParameter;
    }
    
    public List<NsParameterGroup> getNsParameterGroup() {
        return _nsParameterGroup;
    }
    
    public List<VnfPrimitiveGroup> getVnfPrimitiveGroup() {
        return _vnfPrimitiveGroup;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<GetNsServicePrimitiveValuesOutput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public GetNsServicePrimitiveValuesOutputBuilder setNsParameter(final List<NsParameter> values) {
        this._nsParameter = values;
        return this;
    }
    
    public GetNsServicePrimitiveValuesOutputBuilder setNsParameterGroup(final List<NsParameterGroup> values) {
        this._nsParameterGroup = values;
        return this;
    }
    
    public GetNsServicePrimitiveValuesOutputBuilder setVnfPrimitiveGroup(final List<VnfPrimitiveGroup> values) {
        this._vnfPrimitiveGroup = values;
        return this;
    }
    
    
    public GetNsServicePrimitiveValuesOutputBuilder addAugmentation(Class<? extends Augmentation<GetNsServicePrimitiveValuesOutput>> augmentationType, Augmentation<GetNsServicePrimitiveValuesOutput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public GetNsServicePrimitiveValuesOutputBuilder removeAugmentation(Class<? extends Augmentation<GetNsServicePrimitiveValuesOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public GetNsServicePrimitiveValuesOutput build() {
        return new GetNsServicePrimitiveValuesOutputImpl(this);
    }

    private static final class GetNsServicePrimitiveValuesOutputImpl implements GetNsServicePrimitiveValuesOutput {

        @Override
        public Class<GetNsServicePrimitiveValuesOutput> getImplementedInterface() {
            return GetNsServicePrimitiveValuesOutput.class;
        }

        private final List<NsParameter> _nsParameter;
        private final List<NsParameterGroup> _nsParameterGroup;
        private final List<VnfPrimitiveGroup> _vnfPrimitiveGroup;

        private Map<Class<? extends Augmentation<GetNsServicePrimitiveValuesOutput>>, Augmentation<GetNsServicePrimitiveValuesOutput>> augmentation = Collections.emptyMap();

        private GetNsServicePrimitiveValuesOutputImpl(GetNsServicePrimitiveValuesOutputBuilder base) {
            this._nsParameter = base.getNsParameter();
            this._nsParameterGroup = base.getNsParameterGroup();
            this._vnfPrimitiveGroup = base.getVnfPrimitiveGroup();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public List<NsParameter> getNsParameter() {
            return _nsParameter;
        }
        
        @Override
        public List<NsParameterGroup> getNsParameterGroup() {
            return _nsParameterGroup;
        }
        
        @Override
        public List<VnfPrimitiveGroup> getVnfPrimitiveGroup() {
            return _vnfPrimitiveGroup;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<GetNsServicePrimitiveValuesOutput>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_nsParameter);
            result = prime * result + Objects.hashCode(_nsParameterGroup);
            result = prime * result + Objects.hashCode(_vnfPrimitiveGroup);
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
            if (!GetNsServicePrimitiveValuesOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            GetNsServicePrimitiveValuesOutput other = (GetNsServicePrimitiveValuesOutput)obj;
            if (!Objects.equals(_nsParameter, other.getNsParameter())) {
                return false;
            }
            if (!Objects.equals(_nsParameterGroup, other.getNsParameterGroup())) {
                return false;
            }
            if (!Objects.equals(_vnfPrimitiveGroup, other.getVnfPrimitiveGroup())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                GetNsServicePrimitiveValuesOutputImpl otherImpl = (GetNsServicePrimitiveValuesOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<GetNsServicePrimitiveValuesOutput>>, Augmentation<GetNsServicePrimitiveValuesOutput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("GetNsServicePrimitiveValuesOutput");
            CodeHelpers.appendValue(helper, "_nsParameter", _nsParameter);
            CodeHelpers.appendValue(helper, "_nsParameterGroup", _nsParameterGroup);
            CodeHelpers.appendValue(helper, "_vnfPrimitiveGroup", _vnfPrimitiveGroup);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
