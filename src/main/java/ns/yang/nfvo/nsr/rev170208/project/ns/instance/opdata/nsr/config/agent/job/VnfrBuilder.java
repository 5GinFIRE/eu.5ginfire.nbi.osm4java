package ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.yang.types.rev130715.Uuid;
import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.config.agent.job.vnfr.Primitive;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;

import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Class that builds {@link Vnfr} instances.
 * 
 * @see Vnfr
 *
 */
public class VnfrBuilder implements Builder<Vnfr> {

    private Uuid _id;
    private List<Primitive> _primitive;
    private Vnfr.VnfJobStatus _vnfJobStatus;
    private VnfrKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnfr");
    private static final Pattern patterns_id = Pattern.compile("^(?:[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})$");
    private static final String regexes_id = "[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}";

    Map<Class<? extends Augmentation<Vnfr>>, Augmentation<Vnfr>> augmentation = Collections.emptyMap();

    public VnfrBuilder() {
    }

    public VnfrBuilder(Vnfr base) {
        if (base.key() == null) {
            this.key = new VnfrKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this.key = base.key();
            this._id = key.getId();
        }
        this._primitive = base.getPrimitive();
        this._vnfJobStatus = base.getVnfJobStatus();
        if (base instanceof VnfrImpl) {
            VnfrImpl impl = (VnfrImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Vnfr> casted =(AugmentationHolder<Vnfr>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public VnfrKey key() {
        return key;
    }
    
    public Uuid getId() {
        return _id;
    }
    
    public List<Primitive> getPrimitive() {
        return _primitive;
    }
    
    public Vnfr.VnfJobStatus getVnfJobStatus() {
        return _vnfJobStatus;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Vnfr>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public VnfrBuilder withKey(final VnfrKey key) {
        this.key = key;
        return this;
    }
    
    public VnfrBuilder setId(final Uuid value) {
        this._id = value;
        return this;
    }
    public VnfrBuilder setPrimitive(final List<Primitive> values) {
        this._primitive = values;
        return this;
    }
    
    
    public VnfrBuilder setVnfJobStatus(final Vnfr.VnfJobStatus value) {
        this._vnfJobStatus = value;
        return this;
    }
    
    public VnfrBuilder addAugmentation(Class<? extends Augmentation<Vnfr>> augmentationType, Augmentation<Vnfr> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfrBuilder removeAugmentation(Class<? extends Augmentation<Vnfr>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Vnfr build() {
        return new VnfrImpl(this);
    }

    private static final class VnfrImpl implements Vnfr {

        @Override
        public Class<Vnfr> getImplementedInterface() {
            return Vnfr.class;
        }

        private final Uuid _id;
        private final List<Primitive> _primitive;
        private final Vnfr.VnfJobStatus _vnfJobStatus;
        private final VnfrKey key;

        private Map<Class<? extends Augmentation<Vnfr>>, Augmentation<Vnfr>> augmentation = Collections.emptyMap();

        private VnfrImpl(VnfrBuilder base) {
            if (base.key() == null) {
                this.key = new VnfrKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this.key = base.key();
                this._id = key.getId();
            }
            this._primitive = base.getPrimitive();
            this._vnfJobStatus = base.getVnfJobStatus();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public VnfrKey key() {
            return key;
        }
        
        @Override
        public Uuid getId() {
            return _id;
        }
        
        @Override
        public List<Primitive> getPrimitive() {
            return _primitive;
        }
        
        @Override
        public Vnfr.VnfJobStatus getVnfJobStatus() {
            return _vnfJobStatus;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Vnfr>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_primitive);
            result = prime * result + Objects.hashCode(_vnfJobStatus);
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
            if (!Vnfr.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Vnfr other = (Vnfr)obj;
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_primitive, other.getPrimitive())) {
                return false;
            }
            if (!Objects.equals(_vnfJobStatus, other.getVnfJobStatus())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfrImpl otherImpl = (VnfrImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Vnfr>>, Augmentation<Vnfr>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Vnfr");
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_primitive", _primitive);
            CodeHelpers.appendValue(helper, "_vnfJobStatus", _vnfJobStatus);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
