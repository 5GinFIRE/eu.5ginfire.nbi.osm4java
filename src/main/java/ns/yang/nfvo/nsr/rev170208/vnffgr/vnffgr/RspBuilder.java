package ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.yang.types.rev130715.Uuid;
import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.VnfrConnectionPointRef;

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
import java.util.regex.Pattern;

import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Class that builds {@link Rsp} instances.
 * 
 * @see Rsp
 *
 */
public class RspBuilder implements Builder<Rsp> {

    private String _classifierName;
    private Uuid _id;
    private String _name;
    private Long _pathId;
    private Uuid _rspId;
    private Object _vnffgdRspIdRef;
    private Object _vnffgdRspNameRef;
    private List<VnfrConnectionPointRef> _vnfrConnectionPointRef;
    private RspKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("rsp");
    private static final Pattern patterns_id = Pattern.compile("^(?:[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})$");
    private static final String regexes_id = "[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}";
    private static final Pattern patterns_rspId = Pattern.compile("^(?:[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})$");
    private static final String regexes_rspId = "[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}";

    Map<Class<? extends Augmentation<Rsp>>, Augmentation<Rsp>> augmentation = Collections.emptyMap();

    public RspBuilder() {
    }

    public RspBuilder(Rsp base) {
        if (base.key() == null) {
            this.key = new RspKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this.key = base.key();
            this._id = key.getId();
        }
        this._classifierName = base.getClassifierName();
        this._name = base.getName();
        this._pathId = base.getPathId();
        this._rspId = base.getRspId();
        this._vnffgdRspIdRef = base.getVnffgdRspIdRef();
        this._vnffgdRspNameRef = base.getVnffgdRspNameRef();
        this._vnfrConnectionPointRef = base.getVnfrConnectionPointRef();
        if (base instanceof RspImpl) {
            RspImpl impl = (RspImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Rsp> casted =(AugmentationHolder<Rsp>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public RspKey key() {
        return key;
    }
    
    public String getClassifierName() {
        return _classifierName;
    }
    
    public Uuid getId() {
        return _id;
    }
    
    public String getName() {
        return _name;
    }
    
    public Long getPathId() {
        return _pathId;
    }
    
    public Uuid getRspId() {
        return _rspId;
    }
    
    public Object getVnffgdRspIdRef() {
        return _vnffgdRspIdRef;
    }
    
    public Object getVnffgdRspNameRef() {
        return _vnffgdRspNameRef;
    }
    
    public List<VnfrConnectionPointRef> getVnfrConnectionPointRef() {
        return _vnfrConnectionPointRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Rsp>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public RspBuilder withKey(final RspKey key) {
        this.key = key;
        return this;
    }
    
    public RspBuilder setClassifierName(final String value) {
        this._classifierName = value;
        return this;
    }
    
    public RspBuilder setId(final Uuid value) {
        this._id = value;
        return this;
    }
    
    public RspBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    private static void checkPathIdRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public RspBuilder setPathId(final Long value) {
    if (value != null) {
        checkPathIdRange(value);
        
    }
        this._pathId = value;
        return this;
    }
    
    public RspBuilder setRspId(final Uuid value) {
        this._rspId = value;
        return this;
    }
    
    public RspBuilder setVnffgdRspIdRef(final Object value) {
        this._vnffgdRspIdRef = value;
        return this;
    }
    
    public RspBuilder setVnffgdRspNameRef(final Object value) {
        this._vnffgdRspNameRef = value;
        return this;
    }
    public RspBuilder setVnfrConnectionPointRef(final List<VnfrConnectionPointRef> values) {
        this._vnfrConnectionPointRef = values;
        return this;
    }
    
    
    public RspBuilder addAugmentation(Class<? extends Augmentation<Rsp>> augmentationType, Augmentation<Rsp> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RspBuilder removeAugmentation(Class<? extends Augmentation<Rsp>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Rsp build() {
        return new RspImpl(this);
    }

    private static final class RspImpl implements Rsp {

        @Override
        public Class<Rsp> getImplementedInterface() {
            return Rsp.class;
        }

        private final String _classifierName;
        private final Uuid _id;
        private final String _name;
        private final Long _pathId;
        private final Uuid _rspId;
        private final Object _vnffgdRspIdRef;
        private final Object _vnffgdRspNameRef;
        private final List<VnfrConnectionPointRef> _vnfrConnectionPointRef;
        private final RspKey key;

        private Map<Class<? extends Augmentation<Rsp>>, Augmentation<Rsp>> augmentation = Collections.emptyMap();

        private RspImpl(RspBuilder base) {
            if (base.key() == null) {
                this.key = new RspKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this.key = base.key();
                this._id = key.getId();
            }
            this._classifierName = base.getClassifierName();
            this._name = base.getName();
            this._pathId = base.getPathId();
            this._rspId = base.getRspId();
            this._vnffgdRspIdRef = base.getVnffgdRspIdRef();
            this._vnffgdRspNameRef = base.getVnffgdRspNameRef();
            this._vnfrConnectionPointRef = base.getVnfrConnectionPointRef();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public RspKey key() {
            return key;
        }
        
        @Override
        public String getClassifierName() {
            return _classifierName;
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
        public Long getPathId() {
            return _pathId;
        }
        
        @Override
        public Uuid getRspId() {
            return _rspId;
        }
        
        @Override
        public Object getVnffgdRspIdRef() {
            return _vnffgdRspIdRef;
        }
        
        @Override
        public Object getVnffgdRspNameRef() {
            return _vnffgdRspNameRef;
        }
        
        @Override
        public List<VnfrConnectionPointRef> getVnfrConnectionPointRef() {
            return _vnfrConnectionPointRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Rsp>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_classifierName);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_pathId);
            result = prime * result + Objects.hashCode(_rspId);
            result = prime * result + Objects.hashCode(_vnffgdRspIdRef);
            result = prime * result + Objects.hashCode(_vnffgdRspNameRef);
            result = prime * result + Objects.hashCode(_vnfrConnectionPointRef);
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
            if (!Rsp.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Rsp other = (Rsp)obj;
            if (!Objects.equals(_classifierName, other.getClassifierName())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_pathId, other.getPathId())) {
                return false;
            }
            if (!Objects.equals(_rspId, other.getRspId())) {
                return false;
            }
            if (!Objects.equals(_vnffgdRspIdRef, other.getVnffgdRspIdRef())) {
                return false;
            }
            if (!Objects.equals(_vnffgdRspNameRef, other.getVnffgdRspNameRef())) {
                return false;
            }
            if (!Objects.equals(_vnfrConnectionPointRef, other.getVnfrConnectionPointRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RspImpl otherImpl = (RspImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Rsp>>, Augmentation<Rsp>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Rsp");
            CodeHelpers.appendValue(helper, "_classifierName", _classifierName);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_pathId", _pathId);
            CodeHelpers.appendValue(helper, "_rspId", _rspId);
            CodeHelpers.appendValue(helper, "_vnffgdRspIdRef", _vnffgdRspIdRef);
            CodeHelpers.appendValue(helper, "_vnffgdRspNameRef", _vnffgdRspNameRef);
            CodeHelpers.appendValue(helper, "_vnfrConnectionPointRef", _vnfrConnectionPointRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
