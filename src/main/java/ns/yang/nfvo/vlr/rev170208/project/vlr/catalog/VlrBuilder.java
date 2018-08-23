package ns.yang.nfvo.vlr.rev170208.project.vlr.catalog;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Range;

import ns.yang.ietf.yang.types.rev130715.Uuid;
import ns.yang.nfvo.mano.types.rev170208.VirtualLinkType;
import ns.yang.nfvo.mano.types.rev170208.ip.profile.info.IpProfileParams;
import ns.yang.nfvo.mano.types.rev170208.provider.network.ProviderNetwork;
import ns.yang.nfvo.vlr.rev170208.$YangModuleInfoImpl;

import java.lang.Class;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.reflect.Array;
import java.math.BigInteger;
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
 * Class that builds {@link Vlr} instances.
 * 
 * @see Vlr
 *
 */
public class VlrBuilder implements Builder<Vlr> {

    private Long _createTime;
    private String _description;
    private Uuid _id;
    private IpProfileParams _ipProfileParams;
    private BigInteger _leafBandwidth;
    private String _name;
    private String _networkId;
    private Uuid _nsrIdRef;
    private Vlr.OperationalStatus _operationalStatus;
    private ProviderNetwork _providerNetwork;
    private Uuid _resId;
    private BigInteger _rootBandwidth;
    private String _shortName;
    private Vlr.Status _status;
    private VirtualLinkType _type;
    private Long _uptime;
    private String _vendor;
    private String _version;
    private String _vimNetworkName;
    private String _vldRef;
    private VlrKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vlr");
    private static final Pattern patterns_id = Pattern.compile("^(?:[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})$");
    private static final String regexes_id = "[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}";
    private static final Pattern patterns_nsrIdRef = Pattern.compile("^(?:[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})$");
    private static final String regexes_nsrIdRef = "[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}";
    private static final Pattern patterns_resId = Pattern.compile("^(?:[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})$");
    private static final String regexes_resId = "[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}";

    Map<Class<? extends Augmentation<Vlr>>, Augmentation<Vlr>> augmentation = Collections.emptyMap();

    public VlrBuilder() {
    }
    public VlrBuilder(ns.yang.nfvo.mano.types.rev170208.IpProfileInfo arg) {
        this._ipProfileParams = arg.getIpProfileParams();
    }
    public VlrBuilder(ns.yang.nfvo.mano.types.rev170208.ProviderNetwork arg) {
        this._providerNetwork = arg.getProviderNetwork();
    }

    public VlrBuilder(Vlr base) {
        if (base.key() == null) {
            this.key = new VlrKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this.key = base.key();
            this._id = key.getId();
        }
        this._createTime = base.getCreateTime();
        this._description = base.getDescription();
        this._ipProfileParams = base.getIpProfileParams();
        this._leafBandwidth = base.getLeafBandwidth();
        this._name = base.getName();
        this._networkId = base.getNetworkId();
        this._nsrIdRef = base.getNsrIdRef();
        this._operationalStatus = base.getOperationalStatus();
        this._providerNetwork = base.getProviderNetwork();
        this._resId = base.getResId();
        this._rootBandwidth = base.getRootBandwidth();
        this._shortName = base.getShortName();
        this._status = base.getStatus();
        this._type = base.getType();
        this._uptime = base.getUptime();
        this._vendor = base.getVendor();
        this._version = base.getVersion();
        this._vimNetworkName = base.getVimNetworkName();
        this._vldRef = base.getVldRef();
        if (base instanceof VlrImpl) {
            VlrImpl impl = (VlrImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Vlr> casted =(AugmentationHolder<Vlr>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.IpProfileInfo</li>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ProviderNetwork</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ns.yang.nfvo.mano.types.rev170208.IpProfileInfo) {
            this._ipProfileParams = ((ns.yang.nfvo.mano.types.rev170208.IpProfileInfo)arg).getIpProfileParams();
            isValidArg = true;
        }
        if (arg instanceof ns.yang.nfvo.mano.types.rev170208.ProviderNetwork) {
            this._providerNetwork = ((ns.yang.nfvo.mano.types.rev170208.ProviderNetwork)arg).getProviderNetwork();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.IpProfileInfo, model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ProviderNetwork]");
    }

    public VlrKey key() {
        return key;
    }
    
    public Long getCreateTime() {
        return _createTime;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public Uuid getId() {
        return _id;
    }
    
    public IpProfileParams getIpProfileParams() {
        return _ipProfileParams;
    }
    
    public BigInteger getLeafBandwidth() {
        return _leafBandwidth;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getNetworkId() {
        return _networkId;
    }
    
    public Uuid getNsrIdRef() {
        return _nsrIdRef;
    }
    
    public Vlr.OperationalStatus getOperationalStatus() {
        return _operationalStatus;
    }
    
    public ProviderNetwork getProviderNetwork() {
        return _providerNetwork;
    }
    
    public Uuid getResId() {
        return _resId;
    }
    
    public BigInteger getRootBandwidth() {
        return _rootBandwidth;
    }
    
    public String getShortName() {
        return _shortName;
    }
    
    public Vlr.Status getStatus() {
        return _status;
    }
    
    public VirtualLinkType getType() {
        return _type;
    }
    
    public Long getUptime() {
        return _uptime;
    }
    
    public String getVendor() {
        return _vendor;
    }
    
    public String getVersion() {
        return _version;
    }
    
    public String getVimNetworkName() {
        return _vimNetworkName;
    }
    
    public String getVldRef() {
        return _vldRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Vlr>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public VlrBuilder withKey(final VlrKey key) {
        this.key = key;
        return this;
    }
    private static void checkCreateTimeRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public VlrBuilder setCreateTime(final Long value) {
    if (value != null) {
        checkCreateTimeRange(value);
        
    }
        this._createTime = value;
        return this;
    }
    
    public VlrBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public VlrBuilder setId(final Uuid value) {
        this._id = value;
        return this;
    }
    
    public VlrBuilder setIpProfileParams(final IpProfileParams value) {
        this._ipProfileParams = value;
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
    
    public VlrBuilder setLeafBandwidth(final BigInteger value) {
    if (value != null) {
        checkLeafBandwidthRange(value);
        
    }
        this._leafBandwidth = value;
        return this;
    }
    
    public VlrBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public VlrBuilder setNetworkId(final String value) {
        this._networkId = value;
        return this;
    }
    
    public VlrBuilder setNsrIdRef(final Uuid value) {
        this._nsrIdRef = value;
        return this;
    }
    
    public VlrBuilder setOperationalStatus(final Vlr.OperationalStatus value) {
        this._operationalStatus = value;
        return this;
    }
    
    public VlrBuilder setProviderNetwork(final ProviderNetwork value) {
        this._providerNetwork = value;
        return this;
    }
    
    public VlrBuilder setResId(final Uuid value) {
        this._resId = value;
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
    
    public VlrBuilder setRootBandwidth(final BigInteger value) {
    if (value != null) {
        checkRootBandwidthRange(value);
        
    }
        this._rootBandwidth = value;
        return this;
    }
    
    public VlrBuilder setShortName(final String value) {
        this._shortName = value;
        return this;
    }
    
    public VlrBuilder setStatus(final Vlr.Status value) {
        this._status = value;
        return this;
    }
    
    public VlrBuilder setType(final VirtualLinkType value) {
        this._type = value;
        return this;
    }
    private static void checkUptimeRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public VlrBuilder setUptime(final Long value) {
    if (value != null) {
        checkUptimeRange(value);
        
    }
        this._uptime = value;
        return this;
    }
    
    public VlrBuilder setVendor(final String value) {
        this._vendor = value;
        return this;
    }
    
    public VlrBuilder setVersion(final String value) {
        this._version = value;
        return this;
    }
    
    public VlrBuilder setVimNetworkName(final String value) {
        this._vimNetworkName = value;
        return this;
    }
    
    public VlrBuilder setVldRef(final String value) {
        this._vldRef = value;
        return this;
    }
    
    public VlrBuilder addAugmentation(Class<? extends Augmentation<Vlr>> augmentationType, Augmentation<Vlr> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VlrBuilder removeAugmentation(Class<? extends Augmentation<Vlr>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Vlr build() {
        return new VlrImpl(this);
    }

    private static final class VlrImpl implements Vlr {

        @Override
        public Class<Vlr> getImplementedInterface() {
            return Vlr.class;
        }

        private final Long _createTime;
        private final String _description;
        private final Uuid _id;
        private final IpProfileParams _ipProfileParams;
        private final BigInteger _leafBandwidth;
        private final String _name;
        private final String _networkId;
        private final Uuid _nsrIdRef;
        private final Vlr.OperationalStatus _operationalStatus;
        private final ProviderNetwork _providerNetwork;
        private final Uuid _resId;
        private final BigInteger _rootBandwidth;
        private final String _shortName;
        private final Vlr.Status _status;
        private final VirtualLinkType _type;
        private final Long _uptime;
        private final String _vendor;
        private final String _version;
        private final String _vimNetworkName;
        private final String _vldRef;
        private final VlrKey key;

        private Map<Class<? extends Augmentation<Vlr>>, Augmentation<Vlr>> augmentation = Collections.emptyMap();

        private VlrImpl(VlrBuilder base) {
            if (base.key() == null) {
                this.key = new VlrKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this.key = base.key();
                this._id = key.getId();
            }
            this._createTime = base.getCreateTime();
            this._description = base.getDescription();
            this._ipProfileParams = base.getIpProfileParams();
            this._leafBandwidth = base.getLeafBandwidth();
            this._name = base.getName();
            this._networkId = base.getNetworkId();
            this._nsrIdRef = base.getNsrIdRef();
            this._operationalStatus = base.getOperationalStatus();
            this._providerNetwork = base.getProviderNetwork();
            this._resId = base.getResId();
            this._rootBandwidth = base.getRootBandwidth();
            this._shortName = base.getShortName();
            this._status = base.getStatus();
            this._type = base.getType();
            this._uptime = base.getUptime();
            this._vendor = base.getVendor();
            this._version = base.getVersion();
            this._vimNetworkName = base.getVimNetworkName();
            this._vldRef = base.getVldRef();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public VlrKey key() {
            return key;
        }
        
        @Override
        public Long getCreateTime() {
            return _createTime;
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
        public IpProfileParams getIpProfileParams() {
            return _ipProfileParams;
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
        public String getNetworkId() {
            return _networkId;
        }
        
        @Override
        public Uuid getNsrIdRef() {
            return _nsrIdRef;
        }
        
        @Override
        public Vlr.OperationalStatus getOperationalStatus() {
            return _operationalStatus;
        }
        
        @Override
        public ProviderNetwork getProviderNetwork() {
            return _providerNetwork;
        }
        
        @Override
        public Uuid getResId() {
            return _resId;
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
        public Vlr.Status getStatus() {
            return _status;
        }
        
        @Override
        public VirtualLinkType getType() {
            return _type;
        }
        
        @Override
        public Long getUptime() {
            return _uptime;
        }
        
        @Override
        public String getVendor() {
            return _vendor;
        }
        
        @Override
        public String getVersion() {
            return _version;
        }
        
        @Override
        public String getVimNetworkName() {
            return _vimNetworkName;
        }
        
        @Override
        public String getVldRef() {
            return _vldRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Vlr>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_createTime);
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_ipProfileParams);
            result = prime * result + Objects.hashCode(_leafBandwidth);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_networkId);
            result = prime * result + Objects.hashCode(_nsrIdRef);
            result = prime * result + Objects.hashCode(_operationalStatus);
            result = prime * result + Objects.hashCode(_providerNetwork);
            result = prime * result + Objects.hashCode(_resId);
            result = prime * result + Objects.hashCode(_rootBandwidth);
            result = prime * result + Objects.hashCode(_shortName);
            result = prime * result + Objects.hashCode(_status);
            result = prime * result + Objects.hashCode(_type);
            result = prime * result + Objects.hashCode(_uptime);
            result = prime * result + Objects.hashCode(_vendor);
            result = prime * result + Objects.hashCode(_version);
            result = prime * result + Objects.hashCode(_vimNetworkName);
            result = prime * result + Objects.hashCode(_vldRef);
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
            if (!Vlr.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Vlr other = (Vlr)obj;
            if (!Objects.equals(_createTime, other.getCreateTime())) {
                return false;
            }
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_ipProfileParams, other.getIpProfileParams())) {
                return false;
            }
            if (!Objects.equals(_leafBandwidth, other.getLeafBandwidth())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_networkId, other.getNetworkId())) {
                return false;
            }
            if (!Objects.equals(_nsrIdRef, other.getNsrIdRef())) {
                return false;
            }
            if (!Objects.equals(_operationalStatus, other.getOperationalStatus())) {
                return false;
            }
            if (!Objects.equals(_providerNetwork, other.getProviderNetwork())) {
                return false;
            }
            if (!Objects.equals(_resId, other.getResId())) {
                return false;
            }
            if (!Objects.equals(_rootBandwidth, other.getRootBandwidth())) {
                return false;
            }
            if (!Objects.equals(_shortName, other.getShortName())) {
                return false;
            }
            if (!Objects.equals(_status, other.getStatus())) {
                return false;
            }
            if (!Objects.equals(_type, other.getType())) {
                return false;
            }
            if (!Objects.equals(_uptime, other.getUptime())) {
                return false;
            }
            if (!Objects.equals(_vendor, other.getVendor())) {
                return false;
            }
            if (!Objects.equals(_version, other.getVersion())) {
                return false;
            }
            if (!Objects.equals(_vimNetworkName, other.getVimNetworkName())) {
                return false;
            }
            if (!Objects.equals(_vldRef, other.getVldRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VlrImpl otherImpl = (VlrImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Vlr>>, Augmentation<Vlr>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Vlr");
            CodeHelpers.appendValue(helper, "_createTime", _createTime);
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_ipProfileParams", _ipProfileParams);
            CodeHelpers.appendValue(helper, "_leafBandwidth", _leafBandwidth);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_networkId", _networkId);
            CodeHelpers.appendValue(helper, "_nsrIdRef", _nsrIdRef);
            CodeHelpers.appendValue(helper, "_operationalStatus", _operationalStatus);
            CodeHelpers.appendValue(helper, "_providerNetwork", _providerNetwork);
            CodeHelpers.appendValue(helper, "_resId", _resId);
            CodeHelpers.appendValue(helper, "_rootBandwidth", _rootBandwidth);
            CodeHelpers.appendValue(helper, "_shortName", _shortName);
            CodeHelpers.appendValue(helper, "_status", _status);
            CodeHelpers.appendValue(helper, "_type", _type);
            CodeHelpers.appendValue(helper, "_uptime", _uptime);
            CodeHelpers.appendValue(helper, "_vendor", _vendor);
            CodeHelpers.appendValue(helper, "_version", _version);
            CodeHelpers.appendValue(helper, "_vimNetworkName", _vimNetworkName);
            CodeHelpers.appendValue(helper, "_vldRef", _vldRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
