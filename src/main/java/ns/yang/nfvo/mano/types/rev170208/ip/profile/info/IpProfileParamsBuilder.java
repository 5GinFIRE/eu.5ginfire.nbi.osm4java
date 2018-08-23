package ns.yang.nfvo.mano.types.rev170208.ip.profile.info;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.inet.types.rev100924.IpAddress;
import ns.yang.ietf.inet.types.rev100924.IpPrefix;
import ns.yang.ietf.inet.types.rev100924.IpVersion;
import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DhcpParams;
import ns.yang.nfvo.mano.types.rev170208.ip.profile.info.ip.profile.params.DnsServer;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
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
 * Class that builds {@link IpProfileParams} instances.
 * 
 * @see IpProfileParams
 *
 */
public class IpProfileParamsBuilder implements Builder<IpProfileParams> {

    private DhcpParams _dhcpParams;
    private List<DnsServer> _dnsServer;
    private IpAddress _gatewayAddress;
    private IpVersion _ipVersion;
    private String _securityGroup;
    private IpPrefix _subnetAddress;
    private String _subnetPrefixPool;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ip-profile-params");

    Map<Class<? extends Augmentation<IpProfileParams>>, Augmentation<IpProfileParams>> augmentation = Collections.emptyMap();

    public IpProfileParamsBuilder() {
    }

    public IpProfileParamsBuilder(IpProfileParams base) {
        this._dhcpParams = base.getDhcpParams();
        this._dnsServer = base.getDnsServer();
        this._gatewayAddress = base.getGatewayAddress();
        this._ipVersion = base.getIpVersion();
        this._securityGroup = base.getSecurityGroup();
        this._subnetAddress = base.getSubnetAddress();
        this._subnetPrefixPool = base.getSubnetPrefixPool();
        if (base instanceof IpProfileParamsImpl) {
            IpProfileParamsImpl impl = (IpProfileParamsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<IpProfileParams> casted =(AugmentationHolder<IpProfileParams>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public DhcpParams getDhcpParams() {
        return _dhcpParams;
    }
    
    public List<DnsServer> getDnsServer() {
        return _dnsServer;
    }
    
    public IpAddress getGatewayAddress() {
        return _gatewayAddress;
    }
    
    public IpVersion getIpVersion() {
        return _ipVersion;
    }
    
    public String getSecurityGroup() {
        return _securityGroup;
    }
    
    public IpPrefix getSubnetAddress() {
        return _subnetAddress;
    }
    
    public String getSubnetPrefixPool() {
        return _subnetPrefixPool;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<IpProfileParams>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public IpProfileParamsBuilder setDhcpParams(final DhcpParams value) {
        this._dhcpParams = value;
        return this;
    }
    public IpProfileParamsBuilder setDnsServer(final List<DnsServer> values) {
        this._dnsServer = values;
        return this;
    }
    
    
    public IpProfileParamsBuilder setGatewayAddress(final IpAddress value) {
        this._gatewayAddress = value;
        return this;
    }
    
    public IpProfileParamsBuilder setIpVersion(final IpVersion value) {
        this._ipVersion = value;
        return this;
    }
    
    public IpProfileParamsBuilder setSecurityGroup(final String value) {
        this._securityGroup = value;
        return this;
    }
    
    public IpProfileParamsBuilder setSubnetAddress(final IpPrefix value) {
        this._subnetAddress = value;
        return this;
    }
    
    public IpProfileParamsBuilder setSubnetPrefixPool(final String value) {
        this._subnetPrefixPool = value;
        return this;
    }
    
    public IpProfileParamsBuilder addAugmentation(Class<? extends Augmentation<IpProfileParams>> augmentationType, Augmentation<IpProfileParams> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public IpProfileParamsBuilder removeAugmentation(Class<? extends Augmentation<IpProfileParams>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public IpProfileParams build() {
        return new IpProfileParamsImpl(this);
    }

    private static final class IpProfileParamsImpl implements IpProfileParams {

        @Override
        public Class<IpProfileParams> getImplementedInterface() {
            return IpProfileParams.class;
        }

        private final DhcpParams _dhcpParams;
        private final List<DnsServer> _dnsServer;
        private final IpAddress _gatewayAddress;
        private final IpVersion _ipVersion;
        private final String _securityGroup;
        private final IpPrefix _subnetAddress;
        private final String _subnetPrefixPool;

        private Map<Class<? extends Augmentation<IpProfileParams>>, Augmentation<IpProfileParams>> augmentation = Collections.emptyMap();

        private IpProfileParamsImpl(IpProfileParamsBuilder base) {
            this._dhcpParams = base.getDhcpParams();
            this._dnsServer = base.getDnsServer();
            this._gatewayAddress = base.getGatewayAddress();
            this._ipVersion = base.getIpVersion();
            this._securityGroup = base.getSecurityGroup();
            this._subnetAddress = base.getSubnetAddress();
            this._subnetPrefixPool = base.getSubnetPrefixPool();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public DhcpParams getDhcpParams() {
            return _dhcpParams;
        }
        
        @Override
        public List<DnsServer> getDnsServer() {
            return _dnsServer;
        }
        
        @Override
        public IpAddress getGatewayAddress() {
            return _gatewayAddress;
        }
        
        @Override
        public IpVersion getIpVersion() {
            return _ipVersion;
        }
        
        @Override
        public String getSecurityGroup() {
            return _securityGroup;
        }
        
        @Override
        public IpPrefix getSubnetAddress() {
            return _subnetAddress;
        }
        
        @Override
        public String getSubnetPrefixPool() {
            return _subnetPrefixPool;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<IpProfileParams>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_dhcpParams);
            result = prime * result + Objects.hashCode(_dnsServer);
            result = prime * result + Objects.hashCode(_gatewayAddress);
            result = prime * result + Objects.hashCode(_ipVersion);
            result = prime * result + Objects.hashCode(_securityGroup);
            result = prime * result + Objects.hashCode(_subnetAddress);
            result = prime * result + Objects.hashCode(_subnetPrefixPool);
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
            if (!IpProfileParams.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            IpProfileParams other = (IpProfileParams)obj;
            if (!Objects.equals(_dhcpParams, other.getDhcpParams())) {
                return false;
            }
            if (!Objects.equals(_dnsServer, other.getDnsServer())) {
                return false;
            }
            if (!Objects.equals(_gatewayAddress, other.getGatewayAddress())) {
                return false;
            }
            if (!Objects.equals(_ipVersion, other.getIpVersion())) {
                return false;
            }
            if (!Objects.equals(_securityGroup, other.getSecurityGroup())) {
                return false;
            }
            if (!Objects.equals(_subnetAddress, other.getSubnetAddress())) {
                return false;
            }
            if (!Objects.equals(_subnetPrefixPool, other.getSubnetPrefixPool())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                IpProfileParamsImpl otherImpl = (IpProfileParamsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<IpProfileParams>>, Augmentation<IpProfileParams>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("IpProfileParams");
            CodeHelpers.appendValue(helper, "_dhcpParams", _dhcpParams);
            CodeHelpers.appendValue(helper, "_dnsServer", _dnsServer);
            CodeHelpers.appendValue(helper, "_gatewayAddress", _gatewayAddress);
            CodeHelpers.appendValue(helper, "_ipVersion", _ipVersion);
            CodeHelpers.appendValue(helper, "_securityGroup", _securityGroup);
            CodeHelpers.appendValue(helper, "_subnetAddress", _subnetAddress);
            CodeHelpers.appendValue(helper, "_subnetPrefixPool", _subnetPrefixPool);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
