package ns.yang.nfvo.nsr.rev170208;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
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
 * Class that builds {@link ExecScaleInInput} instances.
 * 
 * @see ExecScaleInInput
 *
 */
public class ExecScaleInInputBuilder implements Builder<ExecScaleInInput> {

    private Object _instanceId;
    private Object _nsrIdRef;
    private String _projectName;
    private Object _scalingGroupNameRef;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("input");

    Map<Class<? extends Augmentation<ExecScaleInInput>>, Augmentation<ExecScaleInInput>> augmentation = Collections.emptyMap();

    public ExecScaleInInputBuilder() {
    }
    public ExecScaleInInputBuilder(ns.yang.nfvo.nsr.rev170208.RpcCommon arg) {
        this._nsrIdRef = arg.getNsrIdRef();
        this._projectName = arg.getProjectName();
    }
    public ExecScaleInInputBuilder(ns.yang.nfvo.mano.types.rev170208.RpcProjectName arg) {
        this._projectName = arg.getProjectName();
    }

    public ExecScaleInInputBuilder(ExecScaleInInput base) {
        this._instanceId = base.getInstanceId();
        this._nsrIdRef = base.getNsrIdRef();
        this._projectName = base.getProjectName();
        this._scalingGroupNameRef = base.getScalingGroupNameRef();
        if (base instanceof ExecScaleInInputImpl) {
            ExecScaleInInputImpl impl = (ExecScaleInInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ExecScaleInInput> casted =(AugmentationHolder<ExecScaleInInput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.RpcProjectName</li>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.RpcCommon</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ns.yang.nfvo.mano.types.rev170208.RpcProjectName) {
            this._projectName = ((ns.yang.nfvo.mano.types.rev170208.RpcProjectName)arg).getProjectName();
            isValidArg = true;
        }
        if (arg instanceof ns.yang.nfvo.nsr.rev170208.RpcCommon) {
            this._nsrIdRef = ((ns.yang.nfvo.nsr.rev170208.RpcCommon)arg).getNsrIdRef();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.RpcProjectName, model.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.RpcCommon]");
    }

    public Object getInstanceId() {
        return _instanceId;
    }
    
    public Object getNsrIdRef() {
        return _nsrIdRef;
    }
    
    public String getProjectName() {
        return _projectName;
    }
    
    public Object getScalingGroupNameRef() {
        return _scalingGroupNameRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ExecScaleInInput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public ExecScaleInInputBuilder setInstanceId(final Object value) {
        this._instanceId = value;
        return this;
    }
    
    public ExecScaleInInputBuilder setNsrIdRef(final Object value) {
        this._nsrIdRef = value;
        return this;
    }
    private static void check_projectNameLength(final String value) {
        final int length = value.length();
        if (length >= 1 && length <= 255) {
            return;
        }
        CodeHelpers.throwInvalidLength("[[1..255]]", value);
    }
    
    public ExecScaleInInputBuilder setProjectName(final String value) {
    if (value != null) {
        check_projectNameLength(value);
        
    }
        this._projectName = value;
        return this;
    }
    
    public ExecScaleInInputBuilder setScalingGroupNameRef(final Object value) {
        this._scalingGroupNameRef = value;
        return this;
    }
    
    public ExecScaleInInputBuilder addAugmentation(Class<? extends Augmentation<ExecScaleInInput>> augmentationType, Augmentation<ExecScaleInInput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ExecScaleInInputBuilder removeAugmentation(Class<? extends Augmentation<ExecScaleInInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ExecScaleInInput build() {
        return new ExecScaleInInputImpl(this);
    }

    private static final class ExecScaleInInputImpl implements ExecScaleInInput {

        @Override
        public Class<ExecScaleInInput> getImplementedInterface() {
            return ExecScaleInInput.class;
        }

        private final Object _instanceId;
        private final Object _nsrIdRef;
        private final String _projectName;
        private final Object _scalingGroupNameRef;

        private Map<Class<? extends Augmentation<ExecScaleInInput>>, Augmentation<ExecScaleInInput>> augmentation = Collections.emptyMap();

        private ExecScaleInInputImpl(ExecScaleInInputBuilder base) {
            this._instanceId = base.getInstanceId();
            this._nsrIdRef = base.getNsrIdRef();
            this._projectName = base.getProjectName();
            this._scalingGroupNameRef = base.getScalingGroupNameRef();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public Object getInstanceId() {
            return _instanceId;
        }
        
        @Override
        public Object getNsrIdRef() {
            return _nsrIdRef;
        }
        
        @Override
        public String getProjectName() {
            return _projectName;
        }
        
        @Override
        public Object getScalingGroupNameRef() {
            return _scalingGroupNameRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ExecScaleInInput>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_instanceId);
            result = prime * result + Objects.hashCode(_nsrIdRef);
            result = prime * result + Objects.hashCode(_projectName);
            result = prime * result + Objects.hashCode(_scalingGroupNameRef);
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
            if (!ExecScaleInInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ExecScaleInInput other = (ExecScaleInInput)obj;
            if (!Objects.equals(_instanceId, other.getInstanceId())) {
                return false;
            }
            if (!Objects.equals(_nsrIdRef, other.getNsrIdRef())) {
                return false;
            }
            if (!Objects.equals(_projectName, other.getProjectName())) {
                return false;
            }
            if (!Objects.equals(_scalingGroupNameRef, other.getScalingGroupNameRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ExecScaleInInputImpl otherImpl = (ExecScaleInInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ExecScaleInInput>>, Augmentation<ExecScaleInInput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ExecScaleInInput");
            CodeHelpers.appendValue(helper, "_instanceId", _instanceId);
            CodeHelpers.appendValue(helper, "_nsrIdRef", _nsrIdRef);
            CodeHelpers.appendValue(helper, "_projectName", _projectName);
            CodeHelpers.appendValue(helper, "_scalingGroupNameRef", _scalingGroupNameRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
