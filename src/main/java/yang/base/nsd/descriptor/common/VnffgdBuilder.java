package yang.base.nsd.descriptor.common;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import yang.base.$YangModuleInfoImpl;
import yang.base.nsd.descriptor.common.vnffgd.Classifier;
import yang.base.nsd.descriptor.common.vnffgd.Rsp;

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
 * Class that builds {@link Vnffgd} instances.
 * 
 * @see Vnffgd
 *
 */
public class VnffgdBuilder implements Builder<Vnffgd> {

    private List<Classifier> _classifier;
    private String _description;
    private String _id;
    private String _name;
    private List<Rsp> _rsp;
    private String _shortName;
    private String _vendor;
    private String _version;
    private VnffgdKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnffgd");

    Map<Class<? extends Augmentation<Vnffgd>>, Augmentation<Vnffgd>> augmentation = Collections.emptyMap();

    public VnffgdBuilder() {
    }

    public VnffgdBuilder(Vnffgd base) {
        if (base.key() == null) {
            this.key = new VnffgdKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this.key = base.key();
            this._id = key.getId();
        }
        this._classifier = base.getClassifier();
        this._description = base.getDescription();
        this._name = base.getName();
        this._rsp = base.getRsp();
        this._shortName = base.getShortName();
        this._vendor = base.getVendor();
        this._version = base.getVersion();
        if (base instanceof VnffgdImpl) {
            VnffgdImpl impl = (VnffgdImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Vnffgd> casted =(AugmentationHolder<Vnffgd>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public VnffgdKey key() {
        return key;
    }
    
    public List<Classifier> getClassifier() {
        return _classifier;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public String getId() {
        return _id;
    }
    
    public String getName() {
        return _name;
    }
    
    public List<Rsp> getRsp() {
        return _rsp;
    }
    
    public String getShortName() {
        return _shortName;
    }
    
    public String getVendor() {
        return _vendor;
    }
    
    public String getVersion() {
        return _version;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Vnffgd>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public VnffgdBuilder withKey(final VnffgdKey key) {
        this.key = key;
        return this;
    }
    public VnffgdBuilder setClassifier(final List<Classifier> values) {
        this._classifier = values;
        return this;
    }
    
    
    public VnffgdBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public VnffgdBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public VnffgdBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    public VnffgdBuilder setRsp(final List<Rsp> values) {
        this._rsp = values;
        return this;
    }
    
    
    public VnffgdBuilder setShortName(final String value) {
        this._shortName = value;
        return this;
    }
    
    public VnffgdBuilder setVendor(final String value) {
        this._vendor = value;
        return this;
    }
    
    public VnffgdBuilder setVersion(final String value) {
        this._version = value;
        return this;
    }
    
    public VnffgdBuilder addAugmentation(Class<? extends Augmentation<Vnffgd>> augmentationType, Augmentation<Vnffgd> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnffgdBuilder removeAugmentation(Class<? extends Augmentation<Vnffgd>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Vnffgd build() {
        return new VnffgdImpl(this);
    }

    private static final class VnffgdImpl implements Vnffgd {

        @Override
        public Class<Vnffgd> getImplementedInterface() {
            return Vnffgd.class;
        }

        private final List<Classifier> _classifier;
        private final String _description;
        private final String _id;
        private final String _name;
        private final List<Rsp> _rsp;
        private final String _shortName;
        private final String _vendor;
        private final String _version;
        private final VnffgdKey key;

        private Map<Class<? extends Augmentation<Vnffgd>>, Augmentation<Vnffgd>> augmentation = Collections.emptyMap();

        private VnffgdImpl(VnffgdBuilder base) {
            if (base.key() == null) {
                this.key = new VnffgdKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this.key = base.key();
                this._id = key.getId();
            }
            this._classifier = base.getClassifier();
            this._description = base.getDescription();
            this._name = base.getName();
            this._rsp = base.getRsp();
            this._shortName = base.getShortName();
            this._vendor = base.getVendor();
            this._version = base.getVersion();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public VnffgdKey key() {
            return key;
        }
        
        @Override
        public List<Classifier> getClassifier() {
            return _classifier;
        }
        
        @Override
        public String getDescription() {
            return _description;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public List<Rsp> getRsp() {
            return _rsp;
        }
        
        @Override
        public String getShortName() {
            return _shortName;
        }
        
        @Override
        public String getVendor() {
            return _vendor;
        }
        
        @Override
        public String getVersion() {
            return _version;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Vnffgd>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_classifier);
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_rsp);
            result = prime * result + Objects.hashCode(_shortName);
            result = prime * result + Objects.hashCode(_vendor);
            result = prime * result + Objects.hashCode(_version);
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
            if (!Vnffgd.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Vnffgd other = (Vnffgd)obj;
            if (!Objects.equals(_classifier, other.getClassifier())) {
                return false;
            }
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_rsp, other.getRsp())) {
                return false;
            }
            if (!Objects.equals(_shortName, other.getShortName())) {
                return false;
            }
            if (!Objects.equals(_vendor, other.getVendor())) {
                return false;
            }
            if (!Objects.equals(_version, other.getVersion())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnffgdImpl otherImpl = (VnffgdImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Vnffgd>>, Augmentation<Vnffgd>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Vnffgd");
            CodeHelpers.appendValue(helper, "_classifier", _classifier);
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_rsp", _rsp);
            CodeHelpers.appendValue(helper, "_shortName", _shortName);
            CodeHelpers.appendValue(helper, "_vendor", _vendor);
            CodeHelpers.appendValue(helper, "_version", _version);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
