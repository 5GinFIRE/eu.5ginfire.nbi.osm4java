package ns.yang.nfvo.mano.types.rev170208.vca.configuration;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Range;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.vca.configuration.initial.config.primitive.PrimitiveType;

import java.lang.Class;
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
 * Class that builds {@link InitialConfigPrimitive} instances.
 * 
 * @see InitialConfigPrimitive
 *
 */
public class InitialConfigPrimitiveBuilder implements Builder<InitialConfigPrimitive> {

    private PrimitiveType _primitiveType;
    private BigInteger _seq;
    private InitialConfigPrimitiveKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("initial-config-primitive");

    Map<Class<? extends Augmentation<InitialConfigPrimitive>>, Augmentation<InitialConfigPrimitive>> augmentation = Collections.emptyMap();

    public InitialConfigPrimitiveBuilder() {
    }

    public InitialConfigPrimitiveBuilder(InitialConfigPrimitive base) {
        if (base.key() == null) {
            this.key = new InitialConfigPrimitiveKey(
                base.getSeq()
            );
            this._seq = base.getSeq();
        } else {
            this.key = base.key();
            this._seq = key.getSeq();
        }
        this._primitiveType = base.getPrimitiveType();
        if (base instanceof InitialConfigPrimitiveImpl) {
            InitialConfigPrimitiveImpl impl = (InitialConfigPrimitiveImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<InitialConfigPrimitive> casted =(AugmentationHolder<InitialConfigPrimitive>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public InitialConfigPrimitiveKey key() {
        return key;
    }
    
    public PrimitiveType getPrimitiveType() {
        return _primitiveType;
    }
    
    public BigInteger getSeq() {
        return _seq;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<InitialConfigPrimitive>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public InitialConfigPrimitiveBuilder withKey(final InitialConfigPrimitiveKey key) {
        this.key = key;
        return this;
    }
    
    public InitialConfigPrimitiveBuilder setPrimitiveType(final PrimitiveType value) {
        this._primitiveType = value;
        return this;
    }
    private static final Range<java.math.BigInteger>[] CHECKSEQRANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
        CHECKSEQRANGE_RANGES = a;
    }
    private static void checkSeqRange(final java.math.BigInteger value) {
        for (Range<java.math.BigInteger> r : CHECKSEQRANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKSEQRANGE_RANGES, value);
    }
    
    public InitialConfigPrimitiveBuilder setSeq(final BigInteger value) {
    if (value != null) {
        checkSeqRange(value);
        
    }
        this._seq = value;
        return this;
    }
    
    public InitialConfigPrimitiveBuilder addAugmentation(Class<? extends Augmentation<InitialConfigPrimitive>> augmentationType, Augmentation<InitialConfigPrimitive> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public InitialConfigPrimitiveBuilder removeAugmentation(Class<? extends Augmentation<InitialConfigPrimitive>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public InitialConfigPrimitive build() {
        return new InitialConfigPrimitiveImpl(this);
    }

    private static final class InitialConfigPrimitiveImpl implements InitialConfigPrimitive {

        @Override
        public Class<InitialConfigPrimitive> getImplementedInterface() {
            return InitialConfigPrimitive.class;
        }

        private final PrimitiveType _primitiveType;
        private final BigInteger _seq;
        private final InitialConfigPrimitiveKey key;

        private Map<Class<? extends Augmentation<InitialConfigPrimitive>>, Augmentation<InitialConfigPrimitive>> augmentation = Collections.emptyMap();

        private InitialConfigPrimitiveImpl(InitialConfigPrimitiveBuilder base) {
            if (base.key() == null) {
                this.key = new InitialConfigPrimitiveKey(
                    base.getSeq()
                );
                this._seq = base.getSeq();
            } else {
                this.key = base.key();
                this._seq = key.getSeq();
            }
            this._primitiveType = base.getPrimitiveType();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public InitialConfigPrimitiveKey key() {
            return key;
        }
        
        @Override
        public PrimitiveType getPrimitiveType() {
            return _primitiveType;
        }
        
        @Override
        public BigInteger getSeq() {
            return _seq;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<InitialConfigPrimitive>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_primitiveType);
            result = prime * result + Objects.hashCode(_seq);
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
            if (!InitialConfigPrimitive.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            InitialConfigPrimitive other = (InitialConfigPrimitive)obj;
            if (!Objects.equals(_primitiveType, other.getPrimitiveType())) {
                return false;
            }
            if (!Objects.equals(_seq, other.getSeq())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InitialConfigPrimitiveImpl otherImpl = (InitialConfigPrimitiveImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<InitialConfigPrimitive>>, Augmentation<InitialConfigPrimitive>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("InitialConfigPrimitive");
            CodeHelpers.appendValue(helper, "_primitiveType", _primitiveType);
            CodeHelpers.appendValue(helper, "_seq", _seq);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
