package ns.yang.nfvo.mano.types.rev170208.nfvi.metrics.network;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Range;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.reflect.Array;
import java.math.BigDecimal;
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
 * Class that builds {@link Outgoing} instances.
 * 
 * @see Outgoing
 *
 */
public class OutgoingBuilder implements Builder<Outgoing> {

    private BigDecimal _byteRate;
    private BigInteger _bytes;
    private String _label;
    private BigDecimal _packetRate;
    private BigInteger _packets;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("outgoing");

    Map<Class<? extends Augmentation<Outgoing>>, Augmentation<Outgoing>> augmentation = Collections.emptyMap();

    public OutgoingBuilder() {
    }

    public OutgoingBuilder(Outgoing base) {
        this._byteRate = base.getByteRate();
        this._bytes = base.getBytes();
        this._label = base.getLabel();
        this._packetRate = base.getPacketRate();
        this._packets = base.getPackets();
        if (base instanceof OutgoingImpl) {
            OutgoingImpl impl = (OutgoingImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Outgoing> casted =(AugmentationHolder<Outgoing>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public BigDecimal getByteRate() {
        return _byteRate;
    }
    
    public BigInteger getBytes() {
        return _bytes;
    }
    
    public String getLabel() {
        return _label;
    }
    
    public BigDecimal getPacketRate() {
        return _packetRate;
    }
    
    public BigInteger getPackets() {
        return _packets;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Outgoing>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public OutgoingBuilder setByteRate(final BigDecimal value) {
    if (value != null) {
        
    }
        this._byteRate = value;
        return this;
    }
    private static final Range<java.math.BigInteger>[] CHECKBYTESRANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
        CHECKBYTESRANGE_RANGES = a;
    }
    private static void checkBytesRange(final java.math.BigInteger value) {
        for (Range<java.math.BigInteger> r : CHECKBYTESRANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKBYTESRANGE_RANGES, value);
    }
    
    public OutgoingBuilder setBytes(final BigInteger value) {
    if (value != null) {
        checkBytesRange(value);
        
    }
        this._bytes = value;
        return this;
    }
    
    public OutgoingBuilder setLabel(final String value) {
        this._label = value;
        return this;
    }
    
    public OutgoingBuilder setPacketRate(final BigDecimal value) {
    if (value != null) {
        
    }
        this._packetRate = value;
        return this;
    }
    private static final Range<java.math.BigInteger>[] CHECKPACKETSRANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
        CHECKPACKETSRANGE_RANGES = a;
    }
    private static void checkPacketsRange(final java.math.BigInteger value) {
        for (Range<java.math.BigInteger> r : CHECKPACKETSRANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKPACKETSRANGE_RANGES, value);
    }
    
    public OutgoingBuilder setPackets(final BigInteger value) {
    if (value != null) {
        checkPacketsRange(value);
        
    }
        this._packets = value;
        return this;
    }
    
    public OutgoingBuilder addAugmentation(Class<? extends Augmentation<Outgoing>> augmentationType, Augmentation<Outgoing> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public OutgoingBuilder removeAugmentation(Class<? extends Augmentation<Outgoing>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Outgoing build() {
        return new OutgoingImpl(this);
    }

    private static final class OutgoingImpl implements Outgoing {

        @Override
        public Class<Outgoing> getImplementedInterface() {
            return Outgoing.class;
        }

        private final BigDecimal _byteRate;
        private final BigInteger _bytes;
        private final String _label;
        private final BigDecimal _packetRate;
        private final BigInteger _packets;

        private Map<Class<? extends Augmentation<Outgoing>>, Augmentation<Outgoing>> augmentation = Collections.emptyMap();

        private OutgoingImpl(OutgoingBuilder base) {
            this._byteRate = base.getByteRate();
            this._bytes = base.getBytes();
            this._label = base.getLabel();
            this._packetRate = base.getPacketRate();
            this._packets = base.getPackets();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public BigDecimal getByteRate() {
            return _byteRate;
        }
        
        @Override
        public BigInteger getBytes() {
            return _bytes;
        }
        
        @Override
        public String getLabel() {
            return _label;
        }
        
        @Override
        public BigDecimal getPacketRate() {
            return _packetRate;
        }
        
        @Override
        public BigInteger getPackets() {
            return _packets;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Outgoing>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_byteRate);
            result = prime * result + Objects.hashCode(_bytes);
            result = prime * result + Objects.hashCode(_label);
            result = prime * result + Objects.hashCode(_packetRate);
            result = prime * result + Objects.hashCode(_packets);
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
            if (!Outgoing.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Outgoing other = (Outgoing)obj;
            if (!Objects.equals(_byteRate, other.getByteRate())) {
                return false;
            }
            if (!Objects.equals(_bytes, other.getBytes())) {
                return false;
            }
            if (!Objects.equals(_label, other.getLabel())) {
                return false;
            }
            if (!Objects.equals(_packetRate, other.getPacketRate())) {
                return false;
            }
            if (!Objects.equals(_packets, other.getPackets())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                OutgoingImpl otherImpl = (OutgoingImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Outgoing>>, Augmentation<Outgoing>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Outgoing");
            CodeHelpers.appendValue(helper, "_byteRate", _byteRate);
            CodeHelpers.appendValue(helper, "_bytes", _bytes);
            CodeHelpers.appendValue(helper, "_label", _label);
            CodeHelpers.appendValue(helper, "_packetRate", _packetRate);
            CodeHelpers.appendValue(helper, "_packets", _packets);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
