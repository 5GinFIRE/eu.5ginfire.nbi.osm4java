package ns.yang.nfvo.nsd.rev170228.nsd.catalog;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath.InputParameterXpath;
import ns.yang.nfvo.mano.types.rev170208.ip.profile.list.IpProfiles;
import ns.yang.nfvo.nsd.rev170228.$YangModuleInfoImpl;
import ns.yang.nfvo.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd;
import ns.yang.nfvo.nsd.rev170228.nsd.monitoring.param.MonitoringParam;
import ns.yang.nfvo.nsd.rev170228.nsd.placement.groups.PlacementGroups;
import ns.yang.nfvo.nsd.rev170228.nsd.service.primitive.ServicePrimitive;
import ns.yang.nfvo.nsd.rev170228.nsd.vld.Vld;
import ns.yang.nfvo.nsd.rev170228.nsd.vnf.dependency.VnfDependency;
import yang.base.nsd.descriptor.common.ConnectionPoint;
import yang.base.nsd.descriptor.common.InitialServicePrimitive;
import yang.base.nsd.descriptor.common.KeyPair;
import yang.base.nsd.descriptor.common.ParameterPool;
import yang.base.nsd.descriptor.common.ScalingGroupDescriptor;
import yang.base.nsd.descriptor.common.TerminateServicePrimitive;
import yang.base.nsd.descriptor.common.User;
import yang.base.nsd.descriptor.common.Vnffgd;

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
 * Class that builds {@link Nsd} instances.
 * 
 * @see Nsd
 *
 */
public class NsdBuilder implements Builder<Nsd> {

    private List<ConnectionPoint> _connectionPoint;
    private List<ConstituentVnfd> _constituentVnfd;
    private String _description;
    private String _id;
    private List<InitialServicePrimitive> _initialServicePrimitive;
    private List<InputParameterXpath> _inputParameterXpath;
    private List<IpProfiles> _ipProfiles;
    private List<KeyPair> _keyPair;
    private String _logo;
    private List<MonitoringParam> _monitoringParam;
    private String _name;
    private List<ParameterPool> _parameterPool;
    private List<PlacementGroups> _placementGroups;
    private List<ScalingGroupDescriptor> _scalingGroupDescriptor;
    private List<ServicePrimitive> _servicePrimitive;
    private String _shortName;
    private List<TerminateServicePrimitive> _terminateServicePrimitive;
    private List<User> _user;
    private String _vendor;
    private String _version;
    private List<Vld> _vld;
    private List<VnfDependency> _vnfDependency;
    private List<Vnffgd> _vnffgd;
    private NsdKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("nsd");

    Map<Class<? extends Augmentation<Nsd>>, Augmentation<Nsd>> augmentation = Collections.emptyMap();

    public NsdBuilder() {
    }
    public NsdBuilder(ns.yang.nfvo.nsd.rev170228.NsdMonitoringParam arg) {
        this._monitoringParam = arg.getMonitoringParam();
    }
    public NsdBuilder(ns.yang.nfvo.nsd.rev170228.NsdServicePrimitive arg) {
        this._servicePrimitive = arg.getServicePrimitive();
    }
    public NsdBuilder(ns.yang.nfvo.nsd.rev170228.NsdVld arg) {
        this._vld = arg.getVld();
    }
    public NsdBuilder(ns.yang.nfvo.nsd.rev170228.NsdConstituentVnfd arg) {
        this._constituentVnfd = arg.getConstituentVnfd();
    }
    public NsdBuilder(ns.yang.nfvo.nsd.rev170228.NsdPlacementGroups arg) {
        this._placementGroups = arg.getPlacementGroups();
    }
    public NsdBuilder(yang.base.NsdDescriptorCommon arg) {
        this._id = arg.getId();
        this._name = arg.getName();
        this._shortName = arg.getShortName();
        this._vendor = arg.getVendor();
        this._logo = arg.getLogo();
        this._description = arg.getDescription();
        this._version = arg.getVersion();
        this._connectionPoint = arg.getConnectionPoint();
        this._scalingGroupDescriptor = arg.getScalingGroupDescriptor();
        this._vnffgd = arg.getVnffgd();
        this._initialServicePrimitive = arg.getInitialServicePrimitive();
        this._terminateServicePrimitive = arg.getTerminateServicePrimitive();
        this._parameterPool = arg.getParameterPool();
        this._keyPair = arg.getKeyPair();
        this._user = arg.getUser();
        this._ipProfiles = arg.getIpProfiles();
        this._inputParameterXpath = arg.getInputParameterXpath();
    }
    public NsdBuilder(ns.yang.nfvo.mano.types.rev170208.IpProfileList arg) {
        this._ipProfiles = arg.getIpProfiles();
    }
    public NsdBuilder(ns.yang.nfvo.mano.types.rev170208.InputParameterXpath arg) {
        this._inputParameterXpath = arg.getInputParameterXpath();
    }
    public NsdBuilder(ns.yang.nfvo.nsd.rev170228.NsdVnfDependency arg) {
        this._vnfDependency = arg.getVnfDependency();
    }

    public NsdBuilder(Nsd base) {
        if (base.key() == null) {
            this.key = new NsdKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this.key = base.key();
            this._id = key.getId();
        }
        this._connectionPoint = base.getConnectionPoint();
        this._constituentVnfd = base.getConstituentVnfd();
        this._description = base.getDescription();
        this._initialServicePrimitive = base.getInitialServicePrimitive();
        this._inputParameterXpath = base.getInputParameterXpath();
        this._ipProfiles = base.getIpProfiles();
        this._keyPair = base.getKeyPair();
        this._logo = base.getLogo();
        this._monitoringParam = base.getMonitoringParam();
        this._name = base.getName();
        this._parameterPool = base.getParameterPool();
        this._placementGroups = base.getPlacementGroups();
        this._scalingGroupDescriptor = base.getScalingGroupDescriptor();
        this._servicePrimitive = base.getServicePrimitive();
        this._shortName = base.getShortName();
        this._terminateServicePrimitive = base.getTerminateServicePrimitive();
        this._user = base.getUser();
        this._vendor = base.getVendor();
        this._version = base.getVersion();
        this._vld = base.getVld();
        this._vnfDependency = base.getVnfDependency();
        this._vnffgd = base.getVnffgd();
        if (base instanceof NsdImpl) {
            NsdImpl impl = (NsdImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Nsd> casted =(AugmentationHolder<Nsd>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>model.http.riftio.com.ns.riftware._1._0.nsd.base.rev170228.NsdDescriptorCommon</li>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.InputParameterXpath</li>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.IpProfileList</li>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev170228.NsdVld</li>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev170228.NsdPlacementGroups</li>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev170228.NsdServicePrimitive</li>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev170228.NsdMonitoringParam</li>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev170228.NsdConstituentVnfd</li>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev170228.NsdVnfDependency</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof yang.base.NsdDescriptorCommon) {
            this._id = ((yang.base.NsdDescriptorCommon)arg).getId();
            this._name = ((yang.base.NsdDescriptorCommon)arg).getName();
            this._shortName = ((yang.base.NsdDescriptorCommon)arg).getShortName();
            this._vendor = ((yang.base.NsdDescriptorCommon)arg).getVendor();
            this._logo = ((yang.base.NsdDescriptorCommon)arg).getLogo();
            this._description = ((yang.base.NsdDescriptorCommon)arg).getDescription();
            this._version = ((yang.base.NsdDescriptorCommon)arg).getVersion();
            this._connectionPoint = ((yang.base.NsdDescriptorCommon)arg).getConnectionPoint();
            this._scalingGroupDescriptor = ((yang.base.NsdDescriptorCommon)arg).getScalingGroupDescriptor();
            this._vnffgd = ((yang.base.NsdDescriptorCommon)arg).getVnffgd();
            this._initialServicePrimitive = ((yang.base.NsdDescriptorCommon)arg).getInitialServicePrimitive();
            this._terminateServicePrimitive = ((yang.base.NsdDescriptorCommon)arg).getTerminateServicePrimitive();
            this._parameterPool = ((yang.base.NsdDescriptorCommon)arg).getParameterPool();
            this._keyPair = ((yang.base.NsdDescriptorCommon)arg).getKeyPair();
            this._user = ((yang.base.NsdDescriptorCommon)arg).getUser();
            isValidArg = true;
        }
        if (arg instanceof ns.yang.nfvo.mano.types.rev170208.InputParameterXpath) {
            this._inputParameterXpath = ((ns.yang.nfvo.mano.types.rev170208.InputParameterXpath)arg).getInputParameterXpath();
            isValidArg = true;
        }
        if (arg instanceof ns.yang.nfvo.mano.types.rev170208.IpProfileList) {
            this._ipProfiles = ((ns.yang.nfvo.mano.types.rev170208.IpProfileList)arg).getIpProfiles();
            isValidArg = true;
        }
        if (arg instanceof ns.yang.nfvo.nsd.rev170228.NsdVld) {
            this._vld = ((ns.yang.nfvo.nsd.rev170228.NsdVld)arg).getVld();
            isValidArg = true;
        }
        if (arg instanceof ns.yang.nfvo.nsd.rev170228.NsdPlacementGroups) {
            this._placementGroups = ((ns.yang.nfvo.nsd.rev170228.NsdPlacementGroups)arg).getPlacementGroups();
            isValidArg = true;
        }
        if (arg instanceof ns.yang.nfvo.nsd.rev170228.NsdServicePrimitive) {
            this._servicePrimitive = ((ns.yang.nfvo.nsd.rev170228.NsdServicePrimitive)arg).getServicePrimitive();
            isValidArg = true;
        }
        if (arg instanceof ns.yang.nfvo.nsd.rev170228.NsdMonitoringParam) {
            this._monitoringParam = ((ns.yang.nfvo.nsd.rev170228.NsdMonitoringParam)arg).getMonitoringParam();
            isValidArg = true;
        }
        if (arg instanceof ns.yang.nfvo.nsd.rev170228.NsdConstituentVnfd) {
            this._constituentVnfd = ((ns.yang.nfvo.nsd.rev170228.NsdConstituentVnfd)arg).getConstituentVnfd();
            isValidArg = true;
        }
        if (arg instanceof ns.yang.nfvo.nsd.rev170228.NsdVnfDependency) {
            this._vnfDependency = ((ns.yang.nfvo.nsd.rev170228.NsdVnfDependency)arg).getVnfDependency();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[model.http.riftio.com.ns.riftware._1._0.nsd.base.rev170228.NsdDescriptorCommon, model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.InputParameterXpath, model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.IpProfileList, model.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev170228.NsdVld, model.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev170228.NsdPlacementGroups, model.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev170228.NsdServicePrimitive, model.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev170228.NsdMonitoringParam, model.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev170228.NsdConstituentVnfd, model.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev170228.NsdVnfDependency]");
    }

    public NsdKey key() {
        return key;
    }
    
    public List<ConnectionPoint> getConnectionPoint() {
        return _connectionPoint;
    }
    
    public List<ConstituentVnfd> getConstituentVnfd() {
        return _constituentVnfd;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public String getId() {
        return _id;
    }
    
    public List<InitialServicePrimitive> getInitialServicePrimitive() {
        return _initialServicePrimitive;
    }
    
    public List<InputParameterXpath> getInputParameterXpath() {
        return _inputParameterXpath;
    }
    
    public List<IpProfiles> getIpProfiles() {
        return _ipProfiles;
    }
    
    public List<KeyPair> getKeyPair() {
        return _keyPair;
    }
    
    public String getLogo() {
        return _logo;
    }
    
    public List<MonitoringParam> getMonitoringParam() {
        return _monitoringParam;
    }
    
    public String getName() {
        return _name;
    }
    
    public List<ParameterPool> getParameterPool() {
        return _parameterPool;
    }
    
    public List<PlacementGroups> getPlacementGroups() {
        return _placementGroups;
    }
    
    public List<ScalingGroupDescriptor> getScalingGroupDescriptor() {
        return _scalingGroupDescriptor;
    }
    
    public List<ServicePrimitive> getServicePrimitive() {
        return _servicePrimitive;
    }
    
    public String getShortName() {
        return _shortName;
    }
    
    public List<TerminateServicePrimitive> getTerminateServicePrimitive() {
        return _terminateServicePrimitive;
    }
    
    public List<User> getUser() {
        return _user;
    }
    
    public String getVendor() {
        return _vendor;
    }
    
    public String getVersion() {
        return _version;
    }
    
    public List<Vld> getVld() {
        return _vld;
    }
    
    public List<VnfDependency> getVnfDependency() {
        return _vnfDependency;
    }
    
    public List<Vnffgd> getVnffgd() {
        return _vnffgd;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Nsd>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public NsdBuilder withKey(final NsdKey key) {
        this.key = key;
        return this;
    }
    public NsdBuilder setConnectionPoint(final List<ConnectionPoint> values) {
        this._connectionPoint = values;
        return this;
    }
    
    public NsdBuilder setConstituentVnfd(final List<ConstituentVnfd> values) {
        this._constituentVnfd = values;
        return this;
    }
    
    
    public NsdBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    private static void check_idLength(final String value) {
        final int length = value.length();
        if (length >= 1 && length <= 63) {
            return;
        }
        CodeHelpers.throwInvalidLength("[[1..63]]", value);
    }
    
    public NsdBuilder setId(final String value) {
    if (value != null) {
        check_idLength(value);
        
    }
        this._id = value;
        return this;
    }
    public NsdBuilder setInitialServicePrimitive(final List<InitialServicePrimitive> values) {
        this._initialServicePrimitive = values;
        return this;
    }
    
    public NsdBuilder setInputParameterXpath(final List<InputParameterXpath> values) {
        this._inputParameterXpath = values;
        return this;
    }
    
    public NsdBuilder setIpProfiles(final List<IpProfiles> values) {
        this._ipProfiles = values;
        return this;
    }
    
    public NsdBuilder setKeyPair(final List<KeyPair> values) {
        this._keyPair = values;
        return this;
    }
    
    
    public NsdBuilder setLogo(final String value) {
        this._logo = value;
        return this;
    }
    public NsdBuilder setMonitoringParam(final List<MonitoringParam> values) {
        this._monitoringParam = values;
        return this;
    }
    
    
    public NsdBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    public NsdBuilder setParameterPool(final List<ParameterPool> values) {
        this._parameterPool = values;
        return this;
    }
    
    public NsdBuilder setPlacementGroups(final List<PlacementGroups> values) {
        this._placementGroups = values;
        return this;
    }
    
    public NsdBuilder setScalingGroupDescriptor(final List<ScalingGroupDescriptor> values) {
        this._scalingGroupDescriptor = values;
        return this;
    }
    
    public NsdBuilder setServicePrimitive(final List<ServicePrimitive> values) {
        this._servicePrimitive = values;
        return this;
    }
    
    
    public NsdBuilder setShortName(final String value) {
        this._shortName = value;
        return this;
    }
    public NsdBuilder setTerminateServicePrimitive(final List<TerminateServicePrimitive> values) {
        this._terminateServicePrimitive = values;
        return this;
    }
    
    public NsdBuilder setUser(final List<User> values) {
        this._user = values;
        return this;
    }
    
    
    public NsdBuilder setVendor(final String value) {
        this._vendor = value;
        return this;
    }
    
    public NsdBuilder setVersion(final String value) {
        this._version = value;
        return this;
    }
    public NsdBuilder setVld(final List<Vld> values) {
        this._vld = values;
        return this;
    }
    
    public NsdBuilder setVnfDependency(final List<VnfDependency> values) {
        this._vnfDependency = values;
        return this;
    }
    
    public NsdBuilder setVnffgd(final List<Vnffgd> values) {
        this._vnffgd = values;
        return this;
    }
    
    
    public NsdBuilder addAugmentation(Class<? extends Augmentation<Nsd>> augmentationType, Augmentation<Nsd> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NsdBuilder removeAugmentation(Class<? extends Augmentation<Nsd>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Nsd build() {
        return new NsdImpl(this);
    }

    public static final class NsdImpl implements Nsd {

        @Override
        public Class<Nsd> getImplementedInterface() {
            return Nsd.class;
        }

        private final List<ConnectionPoint> _connectionPoint;
        @JsonProperty("constituent-vnfd")        
        private final List<ConstituentVnfd> _constituentVnfd;
        @JsonProperty("description")        
        private final String _description;
        @JsonProperty("_id")        
        private final String _id;
        @JsonProperty("id")        
        private final String id = null;
        @JsonProperty("initial-config-primitive")        
        private final List<InitialServicePrimitive> _initialServicePrimitive;
        private final List<InputParameterXpath> _inputParameterXpath;
        @JsonProperty("ip-profiles")        
        private final List<IpProfiles> _ipProfiles;
        private final List<KeyPair> _keyPair;
        @JsonProperty("logo")        
        private final String _logo;
        private final List<MonitoringParam> _monitoringParam;
        @JsonProperty("name")        
        private final String _name;
        private final List<ParameterPool> _parameterPool;
        @JsonProperty("placement-groups")        
        private final List<PlacementGroups> _placementGroups;
        @JsonProperty("scaling-group-descriptor")        
        private final List<ScalingGroupDescriptor> _scalingGroupDescriptor;
        private final List<ServicePrimitive> _servicePrimitive;
        @JsonProperty("short-name")        
        private final String _shortName;
        private final List<TerminateServicePrimitive> _terminateServicePrimitive;
        private final List<User> _user;
        @JsonProperty("vendor")        
        private final String _vendor;
        @JsonProperty("version")        
        private final String _version;
        @JsonProperty("vld")        
        private final List<Vld> _vld;
        private final List<VnfDependency> _vnfDependency;
        private final List<Vnffgd> _vnffgd;
        private final NsdKey key;

        private Map<Class<? extends Augmentation<Nsd>>, Augmentation<Nsd>> augmentation = Collections.emptyMap();

        private NsdImpl(NsdBuilder base) {
            if (base.key() == null) {
                this.key = new NsdKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this.key = base.key();
                this._id = key.getId();
            }
            this._connectionPoint = base.getConnectionPoint();
            this._constituentVnfd = base.getConstituentVnfd();
            this._description = base.getDescription();
            this._initialServicePrimitive = base.getInitialServicePrimitive();
            this._inputParameterXpath = base.getInputParameterXpath();
            this._ipProfiles = base.getIpProfiles();
            this._keyPair = base.getKeyPair();
            this._logo = base.getLogo();
            this._monitoringParam = base.getMonitoringParam();
            this._name = base.getName();
            this._parameterPool = base.getParameterPool();
            this._placementGroups = base.getPlacementGroups();
            this._scalingGroupDescriptor = base.getScalingGroupDescriptor();
            this._servicePrimitive = base.getServicePrimitive();
            this._shortName = base.getShortName();
            this._terminateServicePrimitive = base.getTerminateServicePrimitive();
            this._user = base.getUser();
            this._vendor = base.getVendor();
            this._version = base.getVersion();
            this._vld = base.getVld();
            this._vnfDependency = base.getVnfDependency();
            this._vnffgd = base.getVnffgd();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

    	public NsdImpl(){
    		this( new NsdBuilder() );
    	}
        
        @Override
        public NsdKey key() {
            return key;
        }
        
        @Override
        public List<ConnectionPoint> getConnectionPoint() {
            return _connectionPoint;
        }
        
        @Override
        public List<ConstituentVnfd> getConstituentVnfd() {
            return _constituentVnfd;
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
        public List<InitialServicePrimitive> getInitialServicePrimitive() {
            return _initialServicePrimitive;
        }
        
        @Override
        public List<InputParameterXpath> getInputParameterXpath() {
            return _inputParameterXpath;
        }
        
        @Override
        public List<IpProfiles> getIpProfiles() {
            return _ipProfiles;
        }
        
        @Override
        public List<KeyPair> getKeyPair() {
            return _keyPair;
        }
        
        @Override
        public String getLogo() {
            return _logo;
        }
        
        @Override
        public List<MonitoringParam> getMonitoringParam() {
            return _monitoringParam;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public List<ParameterPool> getParameterPool() {
            return _parameterPool;
        }
        
        @Override
        public List<PlacementGroups> getPlacementGroups() {
            return _placementGroups;
        }
        
        @Override
        public List<ScalingGroupDescriptor> getScalingGroupDescriptor() {
            return _scalingGroupDescriptor;
        }
        
        @Override
        public List<ServicePrimitive> getServicePrimitive() {
            return _servicePrimitive;
        }
        
        @Override
        public String getShortName() {
            return _shortName;
        }
        
        @Override
        public List<TerminateServicePrimitive> getTerminateServicePrimitive() {
            return _terminateServicePrimitive;
        }
        
        @Override
        public List<User> getUser() {
            return _user;
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
        public List<Vld> getVld() {
            return _vld;
        }
        
        @Override
        public List<VnfDependency> getVnfDependency() {
            return _vnfDependency;
        }
        
        @Override
        public List<Vnffgd> getVnffgd() {
            return _vnffgd;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Nsd>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_connectionPoint);
            result = prime * result + Objects.hashCode(_constituentVnfd);
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_initialServicePrimitive);
            result = prime * result + Objects.hashCode(_inputParameterXpath);
            result = prime * result + Objects.hashCode(_ipProfiles);
            result = prime * result + Objects.hashCode(_keyPair);
            result = prime * result + Objects.hashCode(_logo);
            result = prime * result + Objects.hashCode(_monitoringParam);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_parameterPool);
            result = prime * result + Objects.hashCode(_placementGroups);
            result = prime * result + Objects.hashCode(_scalingGroupDescriptor);
            result = prime * result + Objects.hashCode(_servicePrimitive);
            result = prime * result + Objects.hashCode(_shortName);
            result = prime * result + Objects.hashCode(_terminateServicePrimitive);
            result = prime * result + Objects.hashCode(_user);
            result = prime * result + Objects.hashCode(_vendor);
            result = prime * result + Objects.hashCode(_version);
            result = prime * result + Objects.hashCode(_vld);
            result = prime * result + Objects.hashCode(_vnfDependency);
            result = prime * result + Objects.hashCode(_vnffgd);
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
            if (!Nsd.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Nsd other = (Nsd)obj;
            if (!Objects.equals(_connectionPoint, other.getConnectionPoint())) {
                return false;
            }
            if (!Objects.equals(_constituentVnfd, other.getConstituentVnfd())) {
                return false;
            }
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_initialServicePrimitive, other.getInitialServicePrimitive())) {
                return false;
            }
            if (!Objects.equals(_inputParameterXpath, other.getInputParameterXpath())) {
                return false;
            }
            if (!Objects.equals(_ipProfiles, other.getIpProfiles())) {
                return false;
            }
            if (!Objects.equals(_keyPair, other.getKeyPair())) {
                return false;
            }
            if (!Objects.equals(_logo, other.getLogo())) {
                return false;
            }
            if (!Objects.equals(_monitoringParam, other.getMonitoringParam())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_parameterPool, other.getParameterPool())) {
                return false;
            }
            if (!Objects.equals(_placementGroups, other.getPlacementGroups())) {
                return false;
            }
            if (!Objects.equals(_scalingGroupDescriptor, other.getScalingGroupDescriptor())) {
                return false;
            }
            if (!Objects.equals(_servicePrimitive, other.getServicePrimitive())) {
                return false;
            }
            if (!Objects.equals(_shortName, other.getShortName())) {
                return false;
            }
            if (!Objects.equals(_terminateServicePrimitive, other.getTerminateServicePrimitive())) {
                return false;
            }
            if (!Objects.equals(_user, other.getUser())) {
                return false;
            }
            if (!Objects.equals(_vendor, other.getVendor())) {
                return false;
            }
            if (!Objects.equals(_version, other.getVersion())) {
                return false;
            }
            if (!Objects.equals(_vld, other.getVld())) {
                return false;
            }
            if (!Objects.equals(_vnfDependency, other.getVnfDependency())) {
                return false;
            }
            if (!Objects.equals(_vnffgd, other.getVnffgd())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NsdImpl otherImpl = (NsdImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Nsd>>, Augmentation<Nsd>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Nsd");
            CodeHelpers.appendValue(helper, "_connectionPoint", _connectionPoint);
            CodeHelpers.appendValue(helper, "_constituentVnfd", _constituentVnfd);
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_initialServicePrimitive", _initialServicePrimitive);
            CodeHelpers.appendValue(helper, "_inputParameterXpath", _inputParameterXpath);
            CodeHelpers.appendValue(helper, "_ipProfiles", _ipProfiles);
            CodeHelpers.appendValue(helper, "_keyPair", _keyPair);
            CodeHelpers.appendValue(helper, "_logo", _logo);
            CodeHelpers.appendValue(helper, "_monitoringParam", _monitoringParam);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_parameterPool", _parameterPool);
            CodeHelpers.appendValue(helper, "_placementGroups", _placementGroups);
            CodeHelpers.appendValue(helper, "_scalingGroupDescriptor", _scalingGroupDescriptor);
            CodeHelpers.appendValue(helper, "_servicePrimitive", _servicePrimitive);
            CodeHelpers.appendValue(helper, "_shortName", _shortName);
            CodeHelpers.appendValue(helper, "_terminateServicePrimitive", _terminateServicePrimitive);
            CodeHelpers.appendValue(helper, "_user", _user);
            CodeHelpers.appendValue(helper, "_vendor", _vendor);
            CodeHelpers.appendValue(helper, "_version", _version);
            CodeHelpers.appendValue(helper, "_vld", _vld);
            CodeHelpers.appendValue(helper, "_vnfDependency", _vnfDependency);
            CodeHelpers.appendValue(helper, "_vnffgd", _vnffgd);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
