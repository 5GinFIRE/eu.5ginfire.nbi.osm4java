package ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Range;

import ns.yang.ietf.yang.types.rev130715.Uuid;
import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.output.vnf.out.list.VnfOutPrimitive;

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
 * Class that builds {@link VnfOutList} instances.
 * 
 * @see VnfOutList
 *
 */
public class VnfOutListBuilder implements Builder<VnfOutList> {

    private BigInteger _memberVnfIndexRef;
    private List<VnfOutPrimitive> _vnfOutPrimitive;
    private Uuid _vnfrIdRef;
    private VnfOutListKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnf-out-list");
    private static final Pattern patterns_vnfrIdRef = Pattern.compile("^(?:[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})$");
    private static final String regexes_vnfrIdRef = "[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}";

    Map<Class<? extends Augmentation<VnfOutList>>, Augmentation<VnfOutList>> augmentation = Collections.emptyMap();

    public VnfOutListBuilder() {
    }

    public VnfOutListBuilder(VnfOutList base) {
        if (base.key() == null) {
            this.key = new VnfOutListKey(
                base.getMemberVnfIndexRef()
            );
            this._memberVnfIndexRef = base.getMemberVnfIndexRef();
        } else {
            this.key = base.key();
            this._memberVnfIndexRef = key.getMemberVnfIndexRef();
        }
        this._vnfOutPrimitive = base.getVnfOutPrimitive();
        this._vnfrIdRef = base.getVnfrIdRef();
        if (base instanceof VnfOutListImpl) {
            VnfOutListImpl impl = (VnfOutListImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<VnfOutList> casted =(AugmentationHolder<VnfOutList>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public VnfOutListKey key() {
        return key;
    }
    
    public BigInteger getMemberVnfIndexRef() {
        return _memberVnfIndexRef;
    }
    
    public List<VnfOutPrimitive> getVnfOutPrimitive() {
        return _vnfOutPrimitive;
    }
    
    public Uuid getVnfrIdRef() {
        return _vnfrIdRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<VnfOutList>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public VnfOutListBuilder withKey(final VnfOutListKey key) {
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
    
    public VnfOutListBuilder setMemberVnfIndexRef(final BigInteger value) {
    if (value != null) {
        checkMemberVnfIndexRefRange(value);
        
    }
        this._memberVnfIndexRef = value;
        return this;
    }
    public VnfOutListBuilder setVnfOutPrimitive(final List<VnfOutPrimitive> values) {
        this._vnfOutPrimitive = values;
        return this;
    }
    
    
    public VnfOutListBuilder setVnfrIdRef(final Uuid value) {
        this._vnfrIdRef = value;
        return this;
    }
    
    public VnfOutListBuilder addAugmentation(Class<? extends Augmentation<VnfOutList>> augmentationType, Augmentation<VnfOutList> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VnfOutListBuilder removeAugmentation(Class<? extends Augmentation<VnfOutList>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VnfOutList build() {
        return new VnfOutListImpl(this);
    }

    private static final class VnfOutListImpl implements VnfOutList {

        @Override
        public Class<VnfOutList> getImplementedInterface() {
            return VnfOutList.class;
        }

        private final BigInteger _memberVnfIndexRef;
        private final List<VnfOutPrimitive> _vnfOutPrimitive;
        private final Uuid _vnfrIdRef;
        private final VnfOutListKey key;

        private Map<Class<? extends Augmentation<VnfOutList>>, Augmentation<VnfOutList>> augmentation = Collections.emptyMap();

        private VnfOutListImpl(VnfOutListBuilder base) {
            if (base.key() == null) {
                this.key = new VnfOutListKey(
                    base.getMemberVnfIndexRef()
                );
                this._memberVnfIndexRef = base.getMemberVnfIndexRef();
            } else {
                this.key = base.key();
                this._memberVnfIndexRef = key.getMemberVnfIndexRef();
            }
            this._vnfOutPrimitive = base.getVnfOutPrimitive();
            this._vnfrIdRef = base.getVnfrIdRef();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public VnfOutListKey key() {
            return key;
        }
        
        @Override
        public BigInteger getMemberVnfIndexRef() {
            return _memberVnfIndexRef;
        }
        
        @Override
        public List<VnfOutPrimitive> getVnfOutPrimitive() {
            return _vnfOutPrimitive;
        }
        
        @Override
        public Uuid getVnfrIdRef() {
            return _vnfrIdRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<VnfOutList>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_vnfOutPrimitive);
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
            if (!VnfOutList.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            VnfOutList other = (VnfOutList)obj;
            if (!Objects.equals(_memberVnfIndexRef, other.getMemberVnfIndexRef())) {
                return false;
            }
            if (!Objects.equals(_vnfOutPrimitive, other.getVnfOutPrimitive())) {
                return false;
            }
            if (!Objects.equals(_vnfrIdRef, other.getVnfrIdRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VnfOutListImpl otherImpl = (VnfOutListImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VnfOutList>>, Augmentation<VnfOutList>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VnfOutList");
            CodeHelpers.appendValue(helper, "_memberVnfIndexRef", _memberVnfIndexRef);
            CodeHelpers.appendValue(helper, "_vnfOutPrimitive", _vnfOutPrimitive);
            CodeHelpers.appendValue(helper, "_vnfrIdRef", _vnfrIdRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
