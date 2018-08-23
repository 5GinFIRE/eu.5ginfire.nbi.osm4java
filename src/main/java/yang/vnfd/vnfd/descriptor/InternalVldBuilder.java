package yang.vnfd.vnfd.descriptor;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Range;

import ns.yang.nfvo.mano.types.rev170208.VirtualLinkType;
import ns.yang.nfvo.mano.types.rev170208.provider.network.ProviderNetwork;
import yang.vnfd.$YangModuleInfoImpl;
import yang.vnfd.vnfd.descriptor.internal.vld.InitParams;
import yang.vnfd.vnfd.descriptor.internal.vld.InternalConnectionPoint;

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

import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Class that builds {@link InternalVld} instances.
 * 
 * @see InternalVld
 *
 */
public class InternalVldBuilder implements Builder<InternalVld> {

    private String _description;
    private String _id;
    private InitParams _initParams;
    private List<InternalConnectionPoint> _internalConnectionPoint;
    private BigInteger _leafBandwidth;
    private String _name;
    private ProviderNetwork _providerNetwork;
    private BigInteger _rootBandwidth;
    private String _shortName;
    private VirtualLinkType _type;
    private InternalVldKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("internal-vld");

    Map<Class<? extends Augmentation<InternalVld>>, Augmentation<InternalVld>> augmentation = Collections.emptyMap();

    public InternalVldBuilder() {
    }
    public InternalVldBuilder(ns.yang.nfvo.mano.types.rev170208.ProviderNetwork arg) {
        this._providerNetwork = arg.getProviderNetwork();
    }

    public InternalVldBuilder(InternalVld base) {
        if (base.key() == null) {
            this.key = new InternalVldKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this.key = base.key();
            this._id = key.getId();
        }
        this._description = base.getDescription();
        this._initParams = base.getInitParams();
        this._internalConnectionPoint = base.getInternalConnectionPoint();
        this._leafBandwidth = base.getLeafBandwidth();
        this._name = base.getName();
        this._providerNetwork = base.getProviderNetwork();
        this._rootBandwidth = base.getRootBandwidth();
        this._shortName = base.getShortName();
        this._type = base.getType();
        if (base instanceof InternalVldImpl) {
            InternalVldImpl impl = (InternalVldImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<InternalVld> casted =(AugmentationHolder<InternalVld>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ProviderNetwork</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ns.yang.nfvo.mano.types.rev170208.ProviderNetwork) {
            this._providerNetwork = ((ns.yang.nfvo.mano.types.rev170208.ProviderNetwork)arg).getProviderNetwork();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ProviderNetwork]");
    }

    public InternalVldKey key() {
        return key;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public String getId() {
        return _id;
    }
    
    public InitParams getInitParams() {
        return _initParams;
    }
    
    public List<InternalConnectionPoint> getInternalConnectionPoint() {
        return _internalConnectionPoint;
    }
    
    public BigInteger getLeafBandwidth() {
        return _leafBandwidth;
    }
    
    public String getName() {
        return _name;
    }
    
    public ProviderNetwork getProviderNetwork() {
        return _providerNetwork;
    }
    
    public BigInteger getRootBandwidth() {
        return _rootBandwidth;
    }
    
    public String getShortName() {
        return _shortName;
    }
    
    public VirtualLinkType getType() {
        return _type;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<InternalVld>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public InternalVldBuilder withKey(final InternalVldKey key) {
        this.key = key;
        return this;
    }
    
    public InternalVldBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public InternalVldBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public InternalVldBuilder setInitParams(final InitParams value) {
        this._initParams = value;
        return this;
    }
    public InternalVldBuilder setInternalConnectionPoint(final List<InternalConnectionPoint> values) {
        this._internalConnectionPoint = values;
        return this;
    }
    
    private static final Range<java.math.BigInteger>[] CHECKLEAFBANDWIDTHRANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
        CHECKLEAFBANDWIDTHRANGE_RANGES = a;
    }
    private static void checkLeafBandwidthRange(final java.math.BigInteger value) {
        for (Range<java.math.BigInteger> r : CHECKLEAFBANDWIDTHRANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKLEAFBANDWIDTHRANGE_RANGES, value);
    }
    
    public InternalVldBuilder setLeafBandwidth(final BigInteger value) {
    if (value != null) {
        checkLeafBandwidthRange(value);
        
    }
        this._leafBandwidth = value;
        return this;
    }
    
    public InternalVldBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public InternalVldBuilder setProviderNetwork(final ProviderNetwork value) {
        this._providerNetwork = value;
        return this;
    }
    private static final Range<java.math.BigInteger>[] CHECKROOTBANDWIDTHRANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
        CHECKROOTBANDWIDTHRANGE_RANGES = a;
    }
    private static void checkRootBandwidthRange(final java.math.BigInteger value) {
        for (Range<java.math.BigInteger> r : CHECKROOTBANDWIDTHRANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKROOTBANDWIDTHRANGE_RANGES, value);
    }
    
    public InternalVldBuilder setRootBandwidth(final BigInteger value) {
    if (value != null) {
        checkRootBandwidthRange(value);
        
    }
        this._rootBandwidth = value;
        return this;
    }
    
    public InternalVldBuilder setShortName(final String value) {
        this._shortName = value;
        return this;
    }
    
    public InternalVldBuilder setType(final VirtualLinkType value) {
        this._type = value;
        return this;
    }
    
    public InternalVldBuilder addAugmentation(Class<? extends Augmentation<InternalVld>> augmentationType, Augmentation<InternalVld> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public InternalVldBuilder removeAugmentation(Class<? extends Augmentation<InternalVld>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public InternalVld build() {
        return new InternalVldImpl(this);
    }

    private static final class InternalVldImpl implements InternalVld {

        @Override
        public Class<InternalVld> getImplementedInterface() {
            return InternalVld.class;
        }

        private final String _description;
        private final String _id;
        private final InitParams _initParams;
        private final List<InternalConnectionPoint> _internalConnectionPoint;
        private final BigInteger _leafBandwidth;
        private final String _name;
        private final ProviderNetwork _providerNetwork;
        private final BigInteger _rootBandwidth;
        private final String _shortName;
        private final VirtualLinkType _type;
        private final InternalVldKey key;

        private Map<Class<? extends Augmentation<InternalVld>>, Augmentation<InternalVld>> augmentation = Collections.emptyMap();

        private InternalVldImpl(InternalVldBuilder base) {
            if (base.key() == null) {
                this.key = new InternalVldKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this.key = base.key();
                this._id = key.getId();
            }
            this._description = base.getDescription();
            this._initParams = base.getInitParams();
            this._internalConnectionPoint = base.getInternalConnectionPoint();
            this._leafBandwidth = base.getLeafBandwidth();
            this._name = base.getName();
            this._providerNetwork = base.getProviderNetwork();
            this._rootBandwidth = base.getRootBandwidth();
            this._shortName = base.getShortName();
            this._type = base.getType();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public InternalVldKey key() {
            return key;
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
        public InitParams getInitParams() {
            return _initParams;
        }
        
        @Override
        public List<InternalConnectionPoint> getInternalConnectionPoint() {
            return _internalConnectionPoint;
        }
        
        @Override
        public BigInteger getLeafBandwidth() {
            return _leafBandwidth;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public ProviderNetwork getProviderNetwork() {
            return _providerNetwork;
        }
        
        @Override
        public BigInteger getRootBandwidth() {
            return _rootBandwidth;
        }
        
        @Override
        public String getShortName() {
            return _shortName;
        }
        
        @Override
        public VirtualLinkType getType() {
            return _type;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<InternalVld>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_initParams);
            result = prime * result + Objects.hashCode(_internalConnectionPoint);
            result = prime * result + Objects.hashCode(_leafBandwidth);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_providerNetwork);
            result = prime * result + Objects.hashCode(_rootBandwidth);
            result = prime * result + Objects.hashCode(_shortName);
            result = prime * result + Objects.hashCode(_type);
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
            if (!InternalVld.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            InternalVld other = (InternalVld)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_initParams, other.getInitParams())) {
                return false;
            }
            if (!Objects.equals(_internalConnectionPoint, other.getInternalConnectionPoint())) {
                return false;
            }
            if (!Objects.equals(_leafBandwidth, other.getLeafBandwidth())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_providerNetwork, other.getProviderNetwork())) {
                return false;
            }
            if (!Objects.equals(_rootBandwidth, other.getRootBandwidth())) {
                return false;
            }
            if (!Objects.equals(_shortName, other.getShortName())) {
                return false;
            }
            if (!Objects.equals(_type, other.getType())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                InternalVldImpl otherImpl = (InternalVldImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<InternalVld>>, Augmentation<InternalVld>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("InternalVld");
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_initParams", _initParams);
            CodeHelpers.appendValue(helper, "_internalConnectionPoint", _internalConnectionPoint);
            CodeHelpers.appendValue(helper, "_leafBandwidth", _leafBandwidth);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_providerNetwork", _providerNetwork);
            CodeHelpers.appendValue(helper, "_rootBandwidth", _rootBandwidth);
            CodeHelpers.appendValue(helper, "_shortName", _shortName);
            CodeHelpers.appendValue(helper, "_type", _type);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
