package ns.yang.nfvo.mano.types.rev170208.vm.flavor;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Range;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;

import java.lang.Class;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.reflect.Array;
import java.math.BigInteger;
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
 * Class that builds {@link VmFlavor} instances.
 * 
 * @see VmFlavor
 *
 */
public class VmFlavorBuilder implements Builder<VmFlavor> {

    private BigInteger _memoryMb;
    private BigInteger _storageGb;
    private Integer _vcpuCount;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vm-flavor");

    Map<Class<? extends Augmentation<VmFlavor>>, Augmentation<VmFlavor>> augmentation = Collections.emptyMap();

    public VmFlavorBuilder() {
    }

    public VmFlavorBuilder(VmFlavor base) {
        this._memoryMb = base.getMemoryMb();
        this._storageGb = base.getStorageGb();
        this._vcpuCount = base.getVcpuCount();
        if (base instanceof VmFlavorImpl) {
            VmFlavorImpl impl = (VmFlavorImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<VmFlavor> casted =(AugmentationHolder<VmFlavor>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public BigInteger getMemoryMb() {
        return _memoryMb;
    }
    
    public BigInteger getStorageGb() {
        return _storageGb;
    }
    
    public Integer getVcpuCount() {
        return _vcpuCount;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<VmFlavor>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    private static final Range<java.math.BigInteger>[] CHECKMEMORYMBRANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
        CHECKMEMORYMBRANGE_RANGES = a;
    }
    private static void checkMemoryMbRange(final java.math.BigInteger value) {
        for (Range<java.math.BigInteger> r : CHECKMEMORYMBRANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKMEMORYMBRANGE_RANGES, value);
    }
    
    public VmFlavorBuilder setMemoryMb(final BigInteger value) {
    if (value != null) {
        checkMemoryMbRange(value);
        
    }
        this._memoryMb = value;
        return this;
    }
    private static final Range<java.math.BigInteger>[] CHECKSTORAGEGBRANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
        CHECKSTORAGEGBRANGE_RANGES = a;
    }
    private static void checkStorageGbRange(final java.math.BigInteger value) {
        for (Range<java.math.BigInteger> r : CHECKSTORAGEGBRANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKSTORAGEGBRANGE_RANGES, value);
    }
    
    public VmFlavorBuilder setStorageGb(final BigInteger value) {
    if (value != null) {
        checkStorageGbRange(value);
        
    }
        this._storageGb = value;
        return this;
    }
    private static void checkVcpuCountRange(final int value) {
        if (value >= 0 && value <= 65535) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..65535]]", value);
    }
    
    public VmFlavorBuilder setVcpuCount(final Integer value) {
    if (value != null) {
        checkVcpuCountRange(value);
        
    }
        this._vcpuCount = value;
        return this;
    }
    
    public VmFlavorBuilder addAugmentation(Class<? extends Augmentation<VmFlavor>> augmentationType, Augmentation<VmFlavor> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VmFlavorBuilder removeAugmentation(Class<? extends Augmentation<VmFlavor>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public VmFlavor build() {
        return new VmFlavorImpl(this);
    }

    public static final class VmFlavorImpl implements VmFlavor {

        @Override
        public Class<VmFlavor> getImplementedInterface() {
            return VmFlavor.class;
        }
        @JsonProperty("memory-mb")
        private final BigInteger _memoryMb;
        @JsonProperty("storage-gb")        
        private final BigInteger _storageGb;
        //@JsonProperty("vcpu-count")        
        private final Integer _vcpuCount;

        private Map<Class<? extends Augmentation<VmFlavor>>, Augmentation<VmFlavor>> augmentation = Collections.emptyMap();

        private VmFlavorImpl(VmFlavorBuilder base) {
            this._memoryMb = base.getMemoryMb();
            this._storageGb = base.getStorageGb();
            this._vcpuCount = base.getVcpuCount();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        public VmFlavorImpl(){
        	this( new VmFlavorBuilder() );
        }
        
        @Override
        public BigInteger getMemoryMb() {
            return _memoryMb;
        }
        
        @Override
        public BigInteger getStorageGb() {
            return _storageGb;
        }
        
        @Override
        public Integer getVcpuCount() {
            return _vcpuCount;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<VmFlavor>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_memoryMb);
            result = prime * result + Objects.hashCode(_storageGb);
            result = prime * result + Objects.hashCode(_vcpuCount);
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
            if (!VmFlavor.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            VmFlavor other = (VmFlavor)obj;
            if (!Objects.equals(_memoryMb, other.getMemoryMb())) {
                return false;
            }
            if (!Objects.equals(_storageGb, other.getStorageGb())) {
                return false;
            }
            if (!Objects.equals(_vcpuCount, other.getVcpuCount())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VmFlavorImpl otherImpl = (VmFlavorImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<VmFlavor>>, Augmentation<VmFlavor>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VmFlavor");
            CodeHelpers.appendValue(helper, "_memoryMb", _memoryMb);
            CodeHelpers.appendValue(helper, "_storageGb", _storageGb);
            CodeHelpers.appendValue(helper, "_vcpuCount", _vcpuCount);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
