package ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.yang.types.rev130715.Uuid;
import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;

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
 * Class that builds {@link Classifier} instances.
 * 
 * @see Classifier
 *
 */
public class ClassifierBuilder implements Builder<Classifier> {

    private List<Uuid> _classifierId;
    private Uuid _id;
    private String _ipAddress;
    private String _name;
    private String _portId;
    private Uuid _rspIdRef;
    private String _rspName;
    private String _sffName;
    private String _vmId;
    private Object _vnfrConnectionPointRef;
    private String _vnfrIdRef;
    private String _vnfrNameRef;
    private ClassifierKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("classifier");
    private static final Pattern patterns_id = Pattern.compile("^(?:[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})$");
    private static final String regexes_id = "[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}";
    private static final Pattern patterns_classifierId = Pattern.compile("^(?:[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})$");
    private static final String regexes_classifierId = "[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}";

    Map<Class<? extends Augmentation<Classifier>>, Augmentation<Classifier>> augmentation = Collections.emptyMap();

    public ClassifierBuilder() {
    }

    public ClassifierBuilder(Classifier base) {
        if (base.key() == null) {
            this.key = new ClassifierKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this.key = base.key();
            this._id = key.getId();
        }
        this._classifierId = base.getClassifierId();
        this._ipAddress = base.getIpAddress();
        this._name = base.getName();
        this._portId = base.getPortId();
        this._rspIdRef = base.getRspIdRef();
        this._rspName = base.getRspName();
        this._sffName = base.getSffName();
        this._vmId = base.getVmId();
        this._vnfrConnectionPointRef = base.getVnfrConnectionPointRef();
        this._vnfrIdRef = base.getVnfrIdRef();
        this._vnfrNameRef = base.getVnfrNameRef();
        if (base instanceof ClassifierImpl) {
            ClassifierImpl impl = (ClassifierImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Classifier> casted =(AugmentationHolder<Classifier>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public ClassifierKey key() {
        return key;
    }
    
    public List<Uuid> getClassifierId() {
        return _classifierId;
    }
    
    public Uuid getId() {
        return _id;
    }
    
    public String getIpAddress() {
        return _ipAddress;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getPortId() {
        return _portId;
    }
    
    public Uuid getRspIdRef() {
        return _rspIdRef;
    }
    
    public String getRspName() {
        return _rspName;
    }
    
    public String getSffName() {
        return _sffName;
    }
    
    public String getVmId() {
        return _vmId;
    }
    
    public Object getVnfrConnectionPointRef() {
        return _vnfrConnectionPointRef;
    }
    
    public String getVnfrIdRef() {
        return _vnfrIdRef;
    }
    
    public String getVnfrNameRef() {
        return _vnfrNameRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Classifier>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public ClassifierBuilder withKey(final ClassifierKey key) {
        this.key = key;
        return this;
    }
    public ClassifierBuilder setClassifierId(final List<Uuid> values) {
        this._classifierId = values;
        return this;
    }
    
    
    public ClassifierBuilder setId(final Uuid value) {
        this._id = value;
        return this;
    }
    
    public ClassifierBuilder setIpAddress(final String value) {
        this._ipAddress = value;
        return this;
    }
    
    public ClassifierBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public ClassifierBuilder setPortId(final String value) {
        this._portId = value;
        return this;
    }
    
    public ClassifierBuilder setRspIdRef(final Uuid value) {
        this._rspIdRef = value;
        return this;
    }
    
    public ClassifierBuilder setRspName(final String value) {
        this._rspName = value;
        return this;
    }
    
    public ClassifierBuilder setSffName(final String value) {
        this._sffName = value;
        return this;
    }
    
    public ClassifierBuilder setVmId(final String value) {
        this._vmId = value;
        return this;
    }
    
    public ClassifierBuilder setVnfrConnectionPointRef(final Object value) {
        this._vnfrConnectionPointRef = value;
        return this;
    }
    
    public ClassifierBuilder setVnfrIdRef(final String value) {
        this._vnfrIdRef = value;
        return this;
    }
    
    public ClassifierBuilder setVnfrNameRef(final String value) {
        this._vnfrNameRef = value;
        return this;
    }
    
    public ClassifierBuilder addAugmentation(Class<? extends Augmentation<Classifier>> augmentationType, Augmentation<Classifier> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ClassifierBuilder removeAugmentation(Class<? extends Augmentation<Classifier>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Classifier build() {
        return new ClassifierImpl(this);
    }

    private static final class ClassifierImpl implements Classifier {

        @Override
        public Class<Classifier> getImplementedInterface() {
            return Classifier.class;
        }

        private final List<Uuid> _classifierId;
        private final Uuid _id;
        private final String _ipAddress;
        private final String _name;
        private final String _portId;
        private final Uuid _rspIdRef;
        private final String _rspName;
        private final String _sffName;
        private final String _vmId;
        private final Object _vnfrConnectionPointRef;
        private final String _vnfrIdRef;
        private final String _vnfrNameRef;
        private final ClassifierKey key;

        private Map<Class<? extends Augmentation<Classifier>>, Augmentation<Classifier>> augmentation = Collections.emptyMap();

        private ClassifierImpl(ClassifierBuilder base) {
            if (base.key() == null) {
                this.key = new ClassifierKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this.key = base.key();
                this._id = key.getId();
            }
            this._classifierId = base.getClassifierId();
            this._ipAddress = base.getIpAddress();
            this._name = base.getName();
            this._portId = base.getPortId();
            this._rspIdRef = base.getRspIdRef();
            this._rspName = base.getRspName();
            this._sffName = base.getSffName();
            this._vmId = base.getVmId();
            this._vnfrConnectionPointRef = base.getVnfrConnectionPointRef();
            this._vnfrIdRef = base.getVnfrIdRef();
            this._vnfrNameRef = base.getVnfrNameRef();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public ClassifierKey key() {
            return key;
        }
        
        @Override
        public List<Uuid> getClassifierId() {
            return _classifierId;
        }
        
        @Override
        public Uuid getId() {
            return _id;
        }
        
        @Override
        public String getIpAddress() {
            return _ipAddress;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public String getPortId() {
            return _portId;
        }
        
        @Override
        public Uuid getRspIdRef() {
            return _rspIdRef;
        }
        
        @Override
        public String getRspName() {
            return _rspName;
        }
        
        @Override
        public String getSffName() {
            return _sffName;
        }
        
        @Override
        public String getVmId() {
            return _vmId;
        }
        
        @Override
        public Object getVnfrConnectionPointRef() {
            return _vnfrConnectionPointRef;
        }
        
        @Override
        public String getVnfrIdRef() {
            return _vnfrIdRef;
        }
        
        @Override
        public String getVnfrNameRef() {
            return _vnfrNameRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Classifier>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_classifierId);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_ipAddress);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_portId);
            result = prime * result + Objects.hashCode(_rspIdRef);
            result = prime * result + Objects.hashCode(_rspName);
            result = prime * result + Objects.hashCode(_sffName);
            result = prime * result + Objects.hashCode(_vmId);
            result = prime * result + Objects.hashCode(_vnfrConnectionPointRef);
            result = prime * result + Objects.hashCode(_vnfrIdRef);
            result = prime * result + Objects.hashCode(_vnfrNameRef);
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
            if (!Classifier.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Classifier other = (Classifier)obj;
            if (!Objects.equals(_classifierId, other.getClassifierId())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_ipAddress, other.getIpAddress())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_portId, other.getPortId())) {
                return false;
            }
            if (!Objects.equals(_rspIdRef, other.getRspIdRef())) {
                return false;
            }
            if (!Objects.equals(_rspName, other.getRspName())) {
                return false;
            }
            if (!Objects.equals(_sffName, other.getSffName())) {
                return false;
            }
            if (!Objects.equals(_vmId, other.getVmId())) {
                return false;
            }
            if (!Objects.equals(_vnfrConnectionPointRef, other.getVnfrConnectionPointRef())) {
                return false;
            }
            if (!Objects.equals(_vnfrIdRef, other.getVnfrIdRef())) {
                return false;
            }
            if (!Objects.equals(_vnfrNameRef, other.getVnfrNameRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ClassifierImpl otherImpl = (ClassifierImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Classifier>>, Augmentation<Classifier>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Classifier");
            CodeHelpers.appendValue(helper, "_classifierId", _classifierId);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_ipAddress", _ipAddress);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_portId", _portId);
            CodeHelpers.appendValue(helper, "_rspIdRef", _rspIdRef);
            CodeHelpers.appendValue(helper, "_rspName", _rspName);
            CodeHelpers.appendValue(helper, "_sffName", _sffName);
            CodeHelpers.appendValue(helper, "_vmId", _vmId);
            CodeHelpers.appendValue(helper, "_vnfrConnectionPointRef", _vnfrConnectionPointRef);
            CodeHelpers.appendValue(helper, "_vnfrIdRef", _vnfrIdRef);
            CodeHelpers.appendValue(helper, "_vnfrNameRef", _vnfrNameRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
