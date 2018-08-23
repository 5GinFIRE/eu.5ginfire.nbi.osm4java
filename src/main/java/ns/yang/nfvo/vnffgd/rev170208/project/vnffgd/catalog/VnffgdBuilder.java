package ns.yang.nfvo.vnffgd.rev170208.project.vnffgd.catalog;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.yang.types.rev130715.Uuid;
import ns.yang.nfvo.vnffgd.rev170208.$YangModuleInfoImpl;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
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
 * Class that builds {@link Vnffgd} instances.
 * 
 * @see Vnffgd
 *
 */
public class VnffgdBuilder implements Builder<Vnffgd> {

    private String _description;
    private Uuid _id;
    private String _name;
    private String _provider;
    private String _version;
    private VnffgdKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnffgd");
    private static final Pattern patterns_id = Pattern.compile("^(?:[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})$");
    private static final String regexes_id = "[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}";

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
        this._description = base.getDescription();
        this._name = base.getName();
        this._provider = base.getProvider();
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
    
    public String getDescription() {
        return _description;
    }
    
    public Uuid getId() {
        return _id;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getProvider() {
        return _provider;
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
    
    public VnffgdBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public VnffgdBuilder setId(final Uuid value) {
        this._id = value;
        return this;
    }
    
    public VnffgdBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public VnffgdBuilder setProvider(final String value) {
        this._provider = value;
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

        private final String _description;
        private final Uuid _id;
        private final String _name;
        private final String _provider;
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
            this._description = base.getDescription();
            this._name = base.getName();
            this._provider = base.getProvider();
            this._version = base.getVersion();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public VnffgdKey key() {
            return key;
        }
        
        @Override
        public String getDescription() {
            return _description;
        }
        
        @Override
        public Uuid getId() {
            return _id;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public String getProvider() {
            return _provider;
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
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_provider);
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
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_provider, other.getProvider())) {
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
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_provider", _provider);
            CodeHelpers.appendValue(helper, "_version", _version);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
