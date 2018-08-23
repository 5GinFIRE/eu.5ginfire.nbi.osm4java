package ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.inet.types.rev100924.IpAddress;
import ns.yang.ietf.inet.types.rev100924.Uri;
import ns.yang.ietf.yang.types.rev130715.Uuid;
import ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa;
import ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa;
import ns.yang.nfvo.mano.types.rev170208.hypervisor.epa.HypervisorEpa;
import ns.yang.nfvo.mano.types.rev170208.supplemental.boot.data.SupplementalBootData;
import ns.yang.nfvo.mano.types.rev170208.vm.flavor.VmFlavor;
import ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa;
import ns.yang.nfvo.vnfr.rev170228.$YangModuleInfoImpl;
import ns.yang.nfvo.vnfr.rev170228.VduOperationalStatus;
import ns.yang.nfvo.vnfr.rev170228.placement.group.info.PlacementGroupsInfo;
import ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Interface;
import ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.InternalConnectionPoint;
import ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.MonitoringParam;
import ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.VduConfiguration;
import ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur.Volumes;

import java.lang.Class;
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
 * Class that builds {@link Vdur} instances.
 * 
 * @see Vdur
 *
 */
public class VdurBuilder implements Builder<Vdur> {

    private Uri _consoleUrl;
    private String _flavorId;
    private GuestEpa _guestEpa;
    private HostEpa _hostEpa;
    private HypervisorEpa _hypervisorEpa;
    private Uuid _id;
    private String _imageId;
    private List<Interface> _interface;
    private List<InternalConnectionPoint> _internalConnectionPoint;
    private IpAddress _managementIp;
    private List<MonitoringParam> _monitoringParam;
    private String _name;
    private VduOperationalStatus _operationalStatus;
    private List<PlacementGroupsInfo> _placementGroupsInfo;
    private SupplementalBootData _supplementalBootData;
    private String _uniqueShortName;
    private VduConfiguration _vduConfiguration;
    private String _vduIdRef;
    private String _vimId;
    private VmFlavor _vmFlavor;
    private IpAddress _vmManagementIp;
    private List<Volumes> _volumes;
    private VswitchEpa _vswitchEpa;
    private VdurKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vdur");
    private static final Pattern patterns_id = Pattern.compile("^(?:[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})$");
    private static final String regexes_id = "[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}";

    Map<Class<? extends Augmentation<Vdur>>, Augmentation<Vdur>> augmentation = Collections.emptyMap();

    public VdurBuilder() {
    }
    public VdurBuilder(ns.yang.nfvo.mano.types.rev170208.GuestEpa arg) {
        this._guestEpa = arg.getGuestEpa();
    }
    public VdurBuilder(ns.yang.nfvo.mano.types.rev170208.SupplementalBootData arg) {
        this._supplementalBootData = arg.getSupplementalBootData();
    }
    public VdurBuilder(ns.yang.nfvo.mano.types.rev170208.HostEpa arg) {
        this._hostEpa = arg.getHostEpa();
    }
    public VdurBuilder(ns.yang.nfvo.mano.types.rev170208.VmFlavor arg) {
        this._vmFlavor = arg.getVmFlavor();
    }
    public VdurBuilder(ns.yang.nfvo.mano.types.rev170208.VswitchEpa arg) {
        this._vswitchEpa = arg.getVswitchEpa();
    }
    public VdurBuilder(ns.yang.nfvo.vnfr.rev170228.PlacementGroupInfo arg) {
        this._placementGroupsInfo = arg.getPlacementGroupsInfo();
    }
    public VdurBuilder(ns.yang.nfvo.mano.types.rev170208.HypervisorEpa arg) {
        this._hypervisorEpa = arg.getHypervisorEpa();
    }

    public VdurBuilder(Vdur base) {
        if (base.key() == null) {
            this.key = new VdurKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this.key = base.key();
            this._id = key.getId();
        }
        this._consoleUrl = base.getConsoleUrl();
        this._flavorId = base.getFlavorId();
        this._guestEpa = base.getGuestEpa();
        this._hostEpa = base.getHostEpa();
        this._hypervisorEpa = base.getHypervisorEpa();
        this._imageId = base.getImageId();
        this._interface = base.getInterface();
        this._internalConnectionPoint = base.getInternalConnectionPoint();
        this._managementIp = base.getManagementIp();
        this._monitoringParam = base.getMonitoringParam();
        this._name = base.getName();
        this._operationalStatus = base.getOperationalStatus();
        this._placementGroupsInfo = base.getPlacementGroupsInfo();
        this._supplementalBootData = base.getSupplementalBootData();
        this._uniqueShortName = base.getUniqueShortName();
        this._vduConfiguration = base.getVduConfiguration();
        this._vduIdRef = base.getVduIdRef();
        this._vimId = base.getVimId();
        this._vmFlavor = base.getVmFlavor();
        this._vmManagementIp = base.getVmManagementIp();
        this._volumes = base.getVolumes();
        this._vswitchEpa = base.getVswitchEpa();
        if (base instanceof VdurImpl) {
            VdurImpl impl = (VdurImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Vdur> casted =(AugmentationHolder<Vdur>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.PlacementGroupInfo</li>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HypervisorEpa</li>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.SupplementalBootData</li>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.GuestEpa</li>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VswitchEpa</li>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VmFlavor</li>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HostEpa</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ns.yang.nfvo.vnfr.rev170228.PlacementGroupInfo) {
            this._placementGroupsInfo = ((ns.yang.nfvo.vnfr.rev170228.PlacementGroupInfo)arg).getPlacementGroupsInfo();
            isValidArg = true;
        }
        if (arg instanceof ns.yang.nfvo.mano.types.rev170208.HypervisorEpa) {
            this._hypervisorEpa = ((ns.yang.nfvo.mano.types.rev170208.HypervisorEpa)arg).getHypervisorEpa();
            isValidArg = true;
        }
        if (arg instanceof ns.yang.nfvo.mano.types.rev170208.SupplementalBootData) {
            this._supplementalBootData = ((ns.yang.nfvo.mano.types.rev170208.SupplementalBootData)arg).getSupplementalBootData();
            isValidArg = true;
        }
        if (arg instanceof ns.yang.nfvo.mano.types.rev170208.GuestEpa) {
            this._guestEpa = ((ns.yang.nfvo.mano.types.rev170208.GuestEpa)arg).getGuestEpa();
            isValidArg = true;
        }
        if (arg instanceof ns.yang.nfvo.mano.types.rev170208.VswitchEpa) {
            this._vswitchEpa = ((ns.yang.nfvo.mano.types.rev170208.VswitchEpa)arg).getVswitchEpa();
            isValidArg = true;
        }
        if (arg instanceof ns.yang.nfvo.mano.types.rev170208.VmFlavor) {
            this._vmFlavor = ((ns.yang.nfvo.mano.types.rev170208.VmFlavor)arg).getVmFlavor();
            isValidArg = true;
        }
        if (arg instanceof ns.yang.nfvo.mano.types.rev170208.HostEpa) {
            this._hostEpa = ((ns.yang.nfvo.mano.types.rev170208.HostEpa)arg).getHostEpa();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[model.urn.ietf.params.xml.ns.yang.nfvo.vnfr.rev170228.PlacementGroupInfo, model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HypervisorEpa, model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.SupplementalBootData, model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.GuestEpa, model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VswitchEpa, model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VmFlavor, model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HostEpa]");
    }

    public VdurKey key() {
        return key;
    }
    
    public Uri getConsoleUrl() {
        return _consoleUrl;
    }
    
    public String getFlavorId() {
        return _flavorId;
    }
    
    public GuestEpa getGuestEpa() {
        return _guestEpa;
    }
    
    public HostEpa getHostEpa() {
        return _hostEpa;
    }
    
    public HypervisorEpa getHypervisorEpa() {
        return _hypervisorEpa;
    }
    
    public Uuid getId() {
        return _id;
    }
    
    public String getImageId() {
        return _imageId;
    }
    
    public List<Interface> getInterface() {
        return _interface;
    }
    
    public List<InternalConnectionPoint> getInternalConnectionPoint() {
        return _internalConnectionPoint;
    }
    
    public IpAddress getManagementIp() {
        return _managementIp;
    }
    
    public List<MonitoringParam> getMonitoringParam() {
        return _monitoringParam;
    }
    
    public String getName() {
        return _name;
    }
    
    public VduOperationalStatus getOperationalStatus() {
        return _operationalStatus;
    }
    
    public List<PlacementGroupsInfo> getPlacementGroupsInfo() {
        return _placementGroupsInfo;
    }
    
    public SupplementalBootData getSupplementalBootData() {
        return _supplementalBootData;
    }
    
    public String getUniqueShortName() {
        return _uniqueShortName;
    }
    
    public VduConfiguration getVduConfiguration() {
        return _vduConfiguration;
    }
    
    public String getVduIdRef() {
        return _vduIdRef;
    }
    
    public String getVimId() {
        return _vimId;
    }
    
    public VmFlavor getVmFlavor() {
        return _vmFlavor;
    }
    
    public IpAddress getVmManagementIp() {
        return _vmManagementIp;
    }
    
    public List<Volumes> getVolumes() {
        return _volumes;
    }
    
    public VswitchEpa getVswitchEpa() {
        return _vswitchEpa;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Vdur>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public VdurBuilder withKey(final VdurKey key) {
        this.key = key;
        return this;
    }
    
    public VdurBuilder setConsoleUrl(final Uri value) {
        this._consoleUrl = value;
        return this;
    }
    
    public VdurBuilder setFlavorId(final String value) {
        this._flavorId = value;
        return this;
    }
    
    public VdurBuilder setGuestEpa(final GuestEpa value) {
        this._guestEpa = value;
        return this;
    }
    
    public VdurBuilder setHostEpa(final HostEpa value) {
        this._hostEpa = value;
        return this;
    }
    
    public VdurBuilder setHypervisorEpa(final HypervisorEpa value) {
        this._hypervisorEpa = value;
        return this;
    }
    
    public VdurBuilder setId(final Uuid value) {
        this._id = value;
        return this;
    }
    
    public VdurBuilder setImageId(final String value) {
        this._imageId = value;
        return this;
    }
    public VdurBuilder setInterface(final List<Interface> values) {
        this._interface = values;
        return this;
    }
    
    public VdurBuilder setInternalConnectionPoint(final List<InternalConnectionPoint> values) {
        this._internalConnectionPoint = values;
        return this;
    }
    
    
    public VdurBuilder setManagementIp(final IpAddress value) {
        this._managementIp = value;
        return this;
    }
    public VdurBuilder setMonitoringParam(final List<MonitoringParam> values) {
        this._monitoringParam = values;
        return this;
    }
    
    
    public VdurBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public VdurBuilder setOperationalStatus(final VduOperationalStatus value) {
        this._operationalStatus = value;
        return this;
    }
    public VdurBuilder setPlacementGroupsInfo(final List<PlacementGroupsInfo> values) {
        this._placementGroupsInfo = values;
        return this;
    }
    
    
    public VdurBuilder setSupplementalBootData(final SupplementalBootData value) {
        this._supplementalBootData = value;
        return this;
    }
    
    public VdurBuilder setUniqueShortName(final String value) {
        this._uniqueShortName = value;
        return this;
    }
    
    public VdurBuilder setVduConfiguration(final VduConfiguration value) {
        this._vduConfiguration = value;
        return this;
    }
    
    public VdurBuilder setVduIdRef(final String value) {
        this._vduIdRef = value;
        return this;
    }
    
    public VdurBuilder setVimId(final String value) {
        this._vimId = value;
        return this;
    }
    
    public VdurBuilder setVmFlavor(final VmFlavor value) {
        this._vmFlavor = value;
        return this;
    }
    
    public VdurBuilder setVmManagementIp(final IpAddress value) {
        this._vmManagementIp = value;
        return this;
    }
    public VdurBuilder setVolumes(final List<Volumes> values) {
        this._volumes = values;
        return this;
    }
    
    
    public VdurBuilder setVswitchEpa(final VswitchEpa value) {
        this._vswitchEpa = value;
        return this;
    }
    
    public VdurBuilder addAugmentation(Class<? extends Augmentation<Vdur>> augmentationType, Augmentation<Vdur> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VdurBuilder removeAugmentation(Class<? extends Augmentation<Vdur>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Vdur build() {
        return new VdurImpl(this);
    }

    private static final class VdurImpl implements Vdur {

        @Override
        public Class<Vdur> getImplementedInterface() {
            return Vdur.class;
        }

        private final Uri _consoleUrl;
        private final String _flavorId;
        private final GuestEpa _guestEpa;
        private final HostEpa _hostEpa;
        private final HypervisorEpa _hypervisorEpa;
        private final Uuid _id;
        private final String _imageId;
        private final List<Interface> _interface;
        private final List<InternalConnectionPoint> _internalConnectionPoint;
        private final IpAddress _managementIp;
        private final List<MonitoringParam> _monitoringParam;
        private final String _name;
        private final VduOperationalStatus _operationalStatus;
        private final List<PlacementGroupsInfo> _placementGroupsInfo;
        private final SupplementalBootData _supplementalBootData;
        private final String _uniqueShortName;
        private final VduConfiguration _vduConfiguration;
        private final String _vduIdRef;
        private final String _vimId;
        private final VmFlavor _vmFlavor;
        private final IpAddress _vmManagementIp;
        private final List<Volumes> _volumes;
        private final VswitchEpa _vswitchEpa;
        private final VdurKey key;

        private Map<Class<? extends Augmentation<Vdur>>, Augmentation<Vdur>> augmentation = Collections.emptyMap();

        private VdurImpl(VdurBuilder base) {
            if (base.key() == null) {
                this.key = new VdurKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this.key = base.key();
                this._id = key.getId();
            }
            this._consoleUrl = base.getConsoleUrl();
            this._flavorId = base.getFlavorId();
            this._guestEpa = base.getGuestEpa();
            this._hostEpa = base.getHostEpa();
            this._hypervisorEpa = base.getHypervisorEpa();
            this._imageId = base.getImageId();
            this._interface = base.getInterface();
            this._internalConnectionPoint = base.getInternalConnectionPoint();
            this._managementIp = base.getManagementIp();
            this._monitoringParam = base.getMonitoringParam();
            this._name = base.getName();
            this._operationalStatus = base.getOperationalStatus();
            this._placementGroupsInfo = base.getPlacementGroupsInfo();
            this._supplementalBootData = base.getSupplementalBootData();
            this._uniqueShortName = base.getUniqueShortName();
            this._vduConfiguration = base.getVduConfiguration();
            this._vduIdRef = base.getVduIdRef();
            this._vimId = base.getVimId();
            this._vmFlavor = base.getVmFlavor();
            this._vmManagementIp = base.getVmManagementIp();
            this._volumes = base.getVolumes();
            this._vswitchEpa = base.getVswitchEpa();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public VdurKey key() {
            return key;
        }
        
        @Override
        public Uri getConsoleUrl() {
            return _consoleUrl;
        }
        
        @Override
        public String getFlavorId() {
            return _flavorId;
        }
        
        @Override
        public GuestEpa getGuestEpa() {
            return _guestEpa;
        }
        
        @Override
        public HostEpa getHostEpa() {
            return _hostEpa;
        }
        
        @Override
        public HypervisorEpa getHypervisorEpa() {
            return _hypervisorEpa;
        }
        
        @Override
        public Uuid getId() {
            return _id;
        }
        
        @Override
        public String getImageId() {
            return _imageId;
        }
        
        @Override
        public List<Interface> getInterface() {
            return _interface;
        }
        
        @Override
        public List<InternalConnectionPoint> getInternalConnectionPoint() {
            return _internalConnectionPoint;
        }
        
        @Override
        public IpAddress getManagementIp() {
            return _managementIp;
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
        public VduOperationalStatus getOperationalStatus() {
            return _operationalStatus;
        }
        
        @Override
        public List<PlacementGroupsInfo> getPlacementGroupsInfo() {
            return _placementGroupsInfo;
        }
        
        @Override
        public SupplementalBootData getSupplementalBootData() {
            return _supplementalBootData;
        }
        
        @Override
        public String getUniqueShortName() {
            return _uniqueShortName;
        }
        
        @Override
        public VduConfiguration getVduConfiguration() {
            return _vduConfiguration;
        }
        
        @Override
        public String getVduIdRef() {
            return _vduIdRef;
        }
        
        @Override
        public String getVimId() {
            return _vimId;
        }
        
        @Override
        public VmFlavor getVmFlavor() {
            return _vmFlavor;
        }
        
        @Override
        public IpAddress getVmManagementIp() {
            return _vmManagementIp;
        }
        
        @Override
        public List<Volumes> getVolumes() {
            return _volumes;
        }
        
        @Override
        public VswitchEpa getVswitchEpa() {
            return _vswitchEpa;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Vdur>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_consoleUrl);
            result = prime * result + Objects.hashCode(_flavorId);
            result = prime * result + Objects.hashCode(_guestEpa);
            result = prime * result + Objects.hashCode(_hostEpa);
            result = prime * result + Objects.hashCode(_hypervisorEpa);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_imageId);
            result = prime * result + Objects.hashCode(_interface);
            result = prime * result + Objects.hashCode(_internalConnectionPoint);
            result = prime * result + Objects.hashCode(_managementIp);
            result = prime * result + Objects.hashCode(_monitoringParam);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_operationalStatus);
            result = prime * result + Objects.hashCode(_placementGroupsInfo);
            result = prime * result + Objects.hashCode(_supplementalBootData);
            result = prime * result + Objects.hashCode(_uniqueShortName);
            result = prime * result + Objects.hashCode(_vduConfiguration);
            result = prime * result + Objects.hashCode(_vduIdRef);
            result = prime * result + Objects.hashCode(_vimId);
            result = prime * result + Objects.hashCode(_vmFlavor);
            result = prime * result + Objects.hashCode(_vmManagementIp);
            result = prime * result + Objects.hashCode(_volumes);
            result = prime * result + Objects.hashCode(_vswitchEpa);
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
            if (!Vdur.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Vdur other = (Vdur)obj;
            if (!Objects.equals(_consoleUrl, other.getConsoleUrl())) {
                return false;
            }
            if (!Objects.equals(_flavorId, other.getFlavorId())) {
                return false;
            }
            if (!Objects.equals(_guestEpa, other.getGuestEpa())) {
                return false;
            }
            if (!Objects.equals(_hostEpa, other.getHostEpa())) {
                return false;
            }
            if (!Objects.equals(_hypervisorEpa, other.getHypervisorEpa())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_imageId, other.getImageId())) {
                return false;
            }
            if (!Objects.equals(_interface, other.getInterface())) {
                return false;
            }
            if (!Objects.equals(_internalConnectionPoint, other.getInternalConnectionPoint())) {
                return false;
            }
            if (!Objects.equals(_managementIp, other.getManagementIp())) {
                return false;
            }
            if (!Objects.equals(_monitoringParam, other.getMonitoringParam())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_operationalStatus, other.getOperationalStatus())) {
                return false;
            }
            if (!Objects.equals(_placementGroupsInfo, other.getPlacementGroupsInfo())) {
                return false;
            }
            if (!Objects.equals(_supplementalBootData, other.getSupplementalBootData())) {
                return false;
            }
            if (!Objects.equals(_uniqueShortName, other.getUniqueShortName())) {
                return false;
            }
            if (!Objects.equals(_vduConfiguration, other.getVduConfiguration())) {
                return false;
            }
            if (!Objects.equals(_vduIdRef, other.getVduIdRef())) {
                return false;
            }
            if (!Objects.equals(_vimId, other.getVimId())) {
                return false;
            }
            if (!Objects.equals(_vmFlavor, other.getVmFlavor())) {
                return false;
            }
            if (!Objects.equals(_vmManagementIp, other.getVmManagementIp())) {
                return false;
            }
            if (!Objects.equals(_volumes, other.getVolumes())) {
                return false;
            }
            if (!Objects.equals(_vswitchEpa, other.getVswitchEpa())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                VdurImpl otherImpl = (VdurImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Vdur>>, Augmentation<Vdur>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Vdur");
            CodeHelpers.appendValue(helper, "_consoleUrl", _consoleUrl);
            CodeHelpers.appendValue(helper, "_flavorId", _flavorId);
            CodeHelpers.appendValue(helper, "_guestEpa", _guestEpa);
            CodeHelpers.appendValue(helper, "_hostEpa", _hostEpa);
            CodeHelpers.appendValue(helper, "_hypervisorEpa", _hypervisorEpa);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_imageId", _imageId);
            CodeHelpers.appendValue(helper, "_interface", _interface);
            CodeHelpers.appendValue(helper, "_internalConnectionPoint", _internalConnectionPoint);
            CodeHelpers.appendValue(helper, "_managementIp", _managementIp);
            CodeHelpers.appendValue(helper, "_monitoringParam", _monitoringParam);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_operationalStatus", _operationalStatus);
            CodeHelpers.appendValue(helper, "_placementGroupsInfo", _placementGroupsInfo);
            CodeHelpers.appendValue(helper, "_supplementalBootData", _supplementalBootData);
            CodeHelpers.appendValue(helper, "_uniqueShortName", _uniqueShortName);
            CodeHelpers.appendValue(helper, "_vduConfiguration", _vduConfiguration);
            CodeHelpers.appendValue(helper, "_vduIdRef", _vduIdRef);
            CodeHelpers.appendValue(helper, "_vimId", _vimId);
            CodeHelpers.appendValue(helper, "_vmFlavor", _vmFlavor);
            CodeHelpers.appendValue(helper, "_vmManagementIp", _vmManagementIp);
            CodeHelpers.appendValue(helper, "_volumes", _volumes);
            CodeHelpers.appendValue(helper, "_vswitchEpa", _vswitchEpa);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
