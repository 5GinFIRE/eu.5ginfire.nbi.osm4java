package ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Range;

import ns.yang.ietf.yang.types.rev130715.Uuid;
import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.vnf.list.VnfPrimitive;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.reflect.Array;
import java.math.BigInteger;
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
 * Class that builds {@link VnfList} instances.
 * 
 * @see VnfList
 *
 */
public class VnfListBuilder implements Builder<VnfList> {

    private BigInteger _memberVnfIndexRef;
    private List<VnfPrimitive> _vnfPrimitive;
    private Uuid _vnfrIdRef;
    private VnfListKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnf-list");
    private static final Pattern patterns_vnfrIdRef = Pattern.compile("^(?:[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})$");
    private static final String regexes_vnfrIdRef = "[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}";

    Map<Class<? extends Augmentation<VnfList>>, Augmentation<VnfList>> augmentation = Collections.emptyMap();

    public VnfListBuilder() {
    }

    public VnfListBuilder(VnfList base) {
        if (base.key() == null) {
            this.key = new VnfListKey(
                base.getMemberVnfIndexRef()
            );
            this._memberVnfIndexRef = base.getMemberVnfIndexRef();
        } else {
            this.key = base.key();
            this._memberVnfIndexRef = key.getMemberVnfIndexRef();
        }
        this._vnfPrimitive = base.getVnfPrimitive();
        this._vnfrIdRef = base.getVnfrIdRef();
        if (base instanceof VnfListImpl) {
            VnfListImpl impl = (VnfListImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<VnfList> casted =(AugmentationHolder<VnfList>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public VnfListKey key() {
        return key;
    }
    
    public BigInteger getMemberVnfIndexRef() {
        return _memberVnfIndexRef;
    }
    
    public List<VnfPrimitive> getVnfPrimitive() {
        return _vnfPrimitive;
    }
    
    public Uuid getVnfrIdRef() {
        return _vnfrIdRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<VnfList>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public VnfListBuilder withKey(final VnfListKey key) {
        this.key = key;
        return this;
    }
    private static final Range<java.math.BigInteger>[] CHECKMEMBERVNFINDEXREFRANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
        CHECKMEMBERVNFINDEXREFRANGE_RANGES = a;
    }
    private static void checkMemberVnfIndexRefRange(final java.math.BigInteger value) {
        for (Range<java.math.BigInteger> r : CHECKMEMBERVNFINDEXREFRANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKMEMBERVNFINDEXREFRANGE_RANGES, value);
    }
    
    public VnfListBuilder setMemberVnfIndexRef(final BigInteger value) {
    if (value != null) {
        checkMemberVnfIndexRefRange(value);
        
    }
        this._memberVnfIndexRef = value;
        return this;
    }
    public VnfListBuilder setVnfPrimitive(final List<VnfPrimitive> values) {
        this._vnfPrimitive = values;
        return this;
    }
    
    
    public VnfListBuilder setVnfrIdRef(final Uuid value) {
        this._vnfrIdRef = value;
        return this;
    }
    
    public VnfListBuilder addAugmentation(Class<? extends Augmentation<VnfList>> augmentationType, Augmentation<VnfList> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfListBuilder removeAugmentation(Class<? extends Augmentation<VnfList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VnfList build() {
        return new VnfListImpl(this);
    }

    private static final class VnfListImpl implements VnfList {

        @Override
        public Class<VnfList> getImplementedInterface() {
            return VnfList.class;
        }

        private final BigInteger _memberVnfIndexRef;
        private final List<VnfPrimitive> _vnfPrimitive;
        private final Uuid _vnfrIdRef;
        private final VnfListKey key;

        private Map<Class<? extends Augmentation<VnfList>>, Augmentation<VnfList>> augmentation = Collections.emptyMap();

        private VnfListImpl(VnfListBuilder base) {
            if (base.key() == null) {
                this.key = new VnfListKey(
                    base.getMemberVnfIndexRef()
                );
                this._memberVnfIndexRef = base.getMemberVnfIndexRef();
            } else {
                this.key = base.key();
                this._memberVnfIndexRef = key.getMemberVnfIndexRef();
            }
            this._vnfPrimitive = base.getVnfPrimitive();
            this._vnfrIdRef = base.getVnfrIdRef();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public VnfListKey key() {
            return key;
        }
        
        @Override
        public BigInteger getMemberVnfIndexRef() {
            return _memberVnfIndexRef;
        }
        
        @Override
        public List<VnfPrimitive> getVnfPrimitive() {
            return _vnfPrimitive;
        }
        
        @Override
        public Uuid getVnfrIdRef() {
            return _vnfrIdRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<VnfList>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_memberVnfIndexRef);
            result = prime * result + Objects.hashCode(_vnfPrimitive);
            result = prime * result + Objects.hashCode(_vnfrIdRef);
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
            if (!VnfList.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            VnfList other = (VnfList)obj;
            if (!Objects.equals(_memberVnfIndexRef, other.getMemberVnfIndexRef())) {
                return false;
            }
            if (!Objects.equals(_vnfPrimitive, other.getVnfPrimitive())) {
                return false;
            }
            if (!Objects.equals(_vnfrIdRef, other.getVnfrIdRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfListImpl otherImpl = (VnfListImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VnfList>>, Augmentation<VnfList>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VnfList");
            CodeHelpers.appendValue(helper, "_memberVnfIndexRef", _memberVnfIndexRef);
            CodeHelpers.appendValue(helper, "_vnfPrimitive", _vnfPrimitive);
            CodeHelpers.appendValue(helper, "_vnfrIdRef", _vnfrIdRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
