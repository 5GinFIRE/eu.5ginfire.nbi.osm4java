package yang.vnfd.vnfd.descriptor;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Range;

import ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa;
import ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa;
import ns.yang.nfvo.mano.types.rev170208.hypervisor.epa.HypervisorEpa;
import ns.yang.nfvo.mano.types.rev170208.supplemental.boot.data.SupplementalBootData;
import ns.yang.nfvo.mano.types.rev170208.vm.flavor.VmFlavor;
import ns.yang.nfvo.mano.types.rev170208.vswitch.epa.VswitchEpa;
import yang.vnfd.$YangModuleInfoImpl;
import yang.vnfd.vnfd.descriptor.vdu.Alarm;
import yang.vnfd.vnfd.descriptor.vdu.AlternativeImages;
import yang.vnfd.vnfd.descriptor.vdu.CloudInitInput;
import yang.vnfd.vnfd.descriptor.vdu.Interface;
import yang.vnfd.vnfd.descriptor.vdu.InternalConnectionPoint;
import yang.vnfd.vnfd.descriptor.vdu.MonitoringParam;
import yang.vnfd.vnfd.descriptor.vdu.VduConfiguration;
import yang.vnfd.vnfd.descriptor.vdu.Volumes;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
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
 * Class that builds {@link Vdu} instances.
 * 
 * @see Vdu
 *
 */
public class VduBuilder implements Builder<Vdu> {

    private List<Alarm> _alarm;
    private List<AlternativeImages> _alternativeImages;
    private CloudInitInput _cloudInitInput;
    private BigInteger _count;
    private String _description;
    private GuestEpa _guestEpa;
    private HostEpa _hostEpa;
    private HypervisorEpa _hypervisorEpa;
    private String _id;
    private String _image;
    private String _imageChecksum;
    private List<Interface> _interface;
    private List<InternalConnectionPoint> _internalConnectionPoint;
    private String _mgmtVpci;
    private List<MonitoringParam> _monitoringParam;
    private String _name;
    private String _pduType;
    private SupplementalBootData _supplementalBootData;
    private VduConfiguration _vduConfiguration;
    private VmFlavor _vmFlavor;
    private List<Volumes> _volumes;
    private VswitchEpa _vswitchEpa;
    private VduKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vdu");

    Map<Class<? extends Augmentation<Vdu>>, Augmentation<Vdu>> augmentation = Collections.emptyMap();

    public VduBuilder() {
    }
    public VduBuilder(ns.yang.nfvo.mano.types.rev170208.GuestEpa arg) {
        this._guestEpa = arg.getGuestEpa();
    }
    public VduBuilder(ns.yang.nfvo.mano.types.rev170208.SupplementalBootData arg) {
        this._supplementalBootData = arg.getSupplementalBootData();
    }
    public VduBuilder(ns.yang.nfvo.mano.types.rev170208.HostEpa arg) {
        this._hostEpa = arg.getHostEpa();
    }
    public VduBuilder(ns.yang.nfvo.mano.types.rev170208.VmFlavor arg) {
        this._vmFlavor = arg.getVmFlavor();
    }
    public VduBuilder(ns.yang.nfvo.mano.types.rev170208.ImageProperties arg) {
        this._image = arg.getImage();
        this._imageChecksum = arg.getImageChecksum();
    }
    public VduBuilder(ns.yang.nfvo.mano.types.rev170208.VswitchEpa arg) {
        this._vswitchEpa = arg.getVswitchEpa();
    }
    public VduBuilder(ns.yang.nfvo.mano.types.rev170208.HypervisorEpa arg) {
        this._hypervisorEpa = arg.getHypervisorEpa();
    }

    public VduBuilder(Vdu base) {
        if (base.key() == null) {
            this.key = new VduKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this.key = base.key();
            this._id = key.getId();
        }
        this._alarm = base.getAlarm();
        this._alternativeImages = base.getAlternativeImages();
        this._cloudInitInput = base.getCloudInitInput();
        this._count = base.getCount();
        this._description = base.getDescription();
        this._guestEpa = base.getGuestEpa();
        this._hostEpa = base.getHostEpa();
        this._hypervisorEpa = base.getHypervisorEpa();
        this._image = base.getImage();
        this._imageChecksum = base.getImageChecksum();
        this._interface = base.getInterface();
        this._internalConnectionPoint = base.getInternalConnectionPoint();
        this._mgmtVpci = base.getMgmtVpci();
        this._monitoringParam = base.getMonitoringParam();
        this._name = base.getName();
        this._pduType = base.getPduType();
        this._supplementalBootData = base.getSupplementalBootData();
        this._vduConfiguration = base.getVduConfiguration();
        this._vmFlavor = base.getVmFlavor();
        this._volumes = base.getVolumes();
        this._vswitchEpa = base.getVswitchEpa();
        if (base instanceof VduImpl) {
            VduImpl impl = (VduImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Vdu> casted =(AugmentationHolder<Vdu>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ImageProperties</li>
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
        if (arg instanceof ns.yang.nfvo.mano.types.rev170208.ImageProperties) {
            this._image = ((ns.yang.nfvo.mano.types.rev170208.ImageProperties)arg).getImage();
            this._imageChecksum = ((ns.yang.nfvo.mano.types.rev170208.ImageProperties)arg).getImageChecksum();
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
        CodeHelpers.validValue(isValidArg, arg, "[model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ImageProperties, model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HypervisorEpa, model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.SupplementalBootData, model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.GuestEpa, model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VswitchEpa, model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VmFlavor, model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HostEpa]");
    }

    public VduKey key() {
        return key;
    }
    
    public List<Alarm> getAlarm() {
        return _alarm;
    }
    
    public List<AlternativeImages> getAlternativeImages() {
        return _alternativeImages;
    }
    
    public CloudInitInput getCloudInitInput() {
        return _cloudInitInput;
    }
    
    public BigInteger getCount() {
        return _count;
    }
    
    public String getDescription() {
        return _description;
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
    
    public String getId() {
        return _id;
    }
    
    public String getImage() {
        return _image;
    }
    
    public String getImageChecksum() {
        return _imageChecksum;
    }
    
    public List<Interface> getInterface() {
        return _interface;
    }
    
    public List<InternalConnectionPoint> getInternalConnectionPoint() {
        return _internalConnectionPoint;
    }
    
    public String getMgmtVpci() {
        return _mgmtVpci;
    }
    
    public List<MonitoringParam> getMonitoringParam() {
        return _monitoringParam;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getPduType() {
        return _pduType;
    }
    
    public SupplementalBootData getSupplementalBootData() {
        return _supplementalBootData;
    }
    
    public VduConfiguration getVduConfiguration() {
        return _vduConfiguration;
    }
    
    public VmFlavor getVmFlavor() {
        return _vmFlavor;
    }
    
    public List<Volumes> getVolumes() {
        return _volumes;
    }
    
    public VswitchEpa getVswitchEpa() {
        return _vswitchEpa;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Vdu>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public VduBuilder withKey(final VduKey key) {
        this.key = key;
        return this;
    }
    public VduBuilder setAlarm(final List<Alarm> values) {
        this._alarm = values;
        return this;
    }
    
    public VduBuilder setAlternativeImages(final List<AlternativeImages> values) {
        this._alternativeImages = values;
        return this;
    }
    
    
    public VduBuilder setCloudInitInput(final CloudInitInput value) {
        this._cloudInitInput = value;
        return this;
    }
    private static final Range<java.math.BigInteger>[] CHECKCOUNTRANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
        CHECKCOUNTRANGE_RANGES = a;
    }
    private static void checkCountRange(final java.math.BigInteger value) {
        for (Range<java.math.BigInteger> r : CHECKCOUNTRANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKCOUNTRANGE_RANGES, value);
    }
    
    public VduBuilder setCount(final BigInteger value) {
    if (value != null) {
        checkCountRange(value);
        
    }
        this._count = value;
        return this;
    }
    
    public VduBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public VduBuilder setGuestEpa(final GuestEpa value) {
        this._guestEpa = value;
        return this;
    }
    
    public VduBuilder setHostEpa(final HostEpa value) {
        this._hostEpa = value;
        return this;
    }
    
    public VduBuilder setHypervisorEpa(final HypervisorEpa value) {
        this._hypervisorEpa = value;
        return this;
    }
    
    public VduBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public VduBuilder setImage(final String value) {
        this._image = value;
        return this;
    }
    
    public VduBuilder setImageChecksum(final String value) {
        this._imageChecksum = value;
        return this;
    }
    public VduBuilder setInterface(final List<Interface> values) {
        this._interface = values;
        return this;
    }
    
    public VduBuilder setInternalConnectionPoint(final List<InternalConnectionPoint> values) {
        this._internalConnectionPoint = values;
        return this;
    }
    
    
    public VduBuilder setMgmtVpci(final String value) {
        this._mgmtVpci = value;
        return this;
    }
    public VduBuilder setMonitoringParam(final List<MonitoringParam> values) {
        this._monitoringParam = values;
        return this;
    }
    
    
    public VduBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public VduBuilder setPduType(final String value) {
        this._pduType = value;
        return this;
    }
    
    public VduBuilder setSupplementalBootData(final SupplementalBootData value) {
        this._supplementalBootData = value;
        return this;
    }
    
    public VduBuilder setVduConfiguration(final VduConfiguration value) {
        this._vduConfiguration = value;
        return this;
    }
    
    public VduBuilder setVmFlavor(final VmFlavor value) {
        this._vmFlavor = value;
        return this;
    }
    public VduBuilder setVolumes(final List<Volumes> values) {
        this._volumes = values;
        return this;
    }
    
    
    public VduBuilder setVswitchEpa(final VswitchEpa value) {
        this._vswitchEpa = value;
        return this;
    }
    
    public VduBuilder addAugmentation(Class<? extends Augmentation<Vdu>> augmentationType, Augmentation<Vdu> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public VduBuilder removeAugmentation(Class<? extends Augmentation<Vdu>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Vdu build() {
        return new VduImpl(this);
    }

    public static final class VduImpl implements Vdu {

        @Override
        public Class<Vdu> getImplementedInterface() {
            return Vdu.class;
        }

        private final List<Alarm> _alarm;
        private final List<AlternativeImages> _alternativeImages;
        private final CloudInitInput _cloudInitInput;
        @JsonProperty("count")
        private final BigInteger _count;
        @JsonProperty("description")        
        private final String _description;
        @JsonProperty("guest-epa")        
        private final GuestEpa _guestEpa;
        private final HostEpa _hostEpa;
        private final HypervisorEpa _hypervisorEpa;
        @JsonProperty("id")        
        private final String _id;
        @JsonProperty("image")        
        private final String _image;
        @JsonProperty("image-checksum")        
        private final String _imageChecksum;
        @JsonProperty("interface")        
        private final List<Interface> _interface = new ArrayList<Interface>();
        private final List<InternalConnectionPoint> _internalConnectionPoint;
        private final String _mgmtVpci;
        private final List<MonitoringParam> _monitoringParam;
        @JsonProperty("name")        
        private final String _name;
        private final String _pduType;
        @JsonProperty("supplemental-boot-data")        
        private final SupplementalBootData _supplementalBootData;
        private final VduConfiguration _vduConfiguration;
        @JsonProperty("vm-flavor")        
        private final VmFlavor _vmFlavor;
        private final List<Volumes> _volumes;
        private final VswitchEpa _vswitchEpa;
        private final VduKey key;

        private Map<Class<? extends Augmentation<Vdu>>, Augmentation<Vdu>> augmentation = Collections.emptyMap();

        private VduImpl(VduBuilder base) {
            if (base.key() == null) {
                this.key = new VduKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this.key = base.key();
                this._id = key.getId();
            }
            this._alarm = base.getAlarm();
            this._alternativeImages = base.getAlternativeImages();
            this._cloudInitInput = base.getCloudInitInput();
            this._count = base.getCount();
            this._description = base.getDescription();
            this._guestEpa = base.getGuestEpa();
            this._hostEpa = base.getHostEpa();
            this._hypervisorEpa = base.getHypervisorEpa();
            this._image = base.getImage();
            this._imageChecksum = base.getImageChecksum();
//            this._interface = base.getInterface();
            this._internalConnectionPoint = base.getInternalConnectionPoint();
            this._mgmtVpci = base.getMgmtVpci();
            this._monitoringParam = base.getMonitoringParam();
            this._name = base.getName();
            this._pduType = base.getPduType();
            this._supplementalBootData = base.getSupplementalBootData();
            this._vduConfiguration = base.getVduConfiguration();
            this._vmFlavor = base.getVmFlavor();
            this._volumes = base.getVolumes();
            this._vswitchEpa = base.getVswitchEpa();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        public VduImpl(){
        	this(new VduBuilder() );
        }

        @Override
        public VduKey key() {
            return key;
        }
        
        @Override
        public List<Alarm> getAlarm() {
            return _alarm;
        }
        
        @Override
        public List<AlternativeImages> getAlternativeImages() {
            return _alternativeImages;
        }
        
        @Override
        public CloudInitInput getCloudInitInput() {
            return _cloudInitInput;
        }
        
        @Override
        public BigInteger getCount() {
            return _count;
        }
        
        @Override
        public String getDescription() {
            return _description;
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
        public String getId() {
            return _id;
        }
        
        @Override
        public String getImage() {
            return _image;
        }
        
        @Override
        public String getImageChecksum() {
            return _imageChecksum;
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
        public String getMgmtVpci() {
            return _mgmtVpci;
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
        public String getPduType() {
            return _pduType;
        }
        
        @Override
        public SupplementalBootData getSupplementalBootData() {
            return _supplementalBootData;
        }
        
        @Override
        public VduConfiguration getVduConfiguration() {
            return _vduConfiguration;
        }
        
        @Override
        public VmFlavor getVmFlavor() {
            return _vmFlavor;
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
        public <E extends Augmentation<Vdu>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_alarm);
            result = prime * result + Objects.hashCode(_alternativeImages);
            result = prime * result + Objects.hashCode(_cloudInitInput);
            result = prime * result + Objects.hashCode(_count);
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_guestEpa);
            result = prime * result + Objects.hashCode(_hostEpa);
            result = prime * result + Objects.hashCode(_hypervisorEpa);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_image);
            result = prime * result + Objects.hashCode(_imageChecksum);
            result = prime * result + Objects.hashCode(_interface);
            result = prime * result + Objects.hashCode(_internalConnectionPoint);
            result = prime * result + Objects.hashCode(_mgmtVpci);
            result = prime * result + Objects.hashCode(_monitoringParam);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_pduType);
            result = prime * result + Objects.hashCode(_supplementalBootData);
            result = prime * result + Objects.hashCode(_vduConfiguration);
            result = prime * result + Objects.hashCode(_vmFlavor);
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
            if (!Vdu.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Vdu other = (Vdu)obj;
            if (!Objects.equals(_alarm, other.getAlarm())) {
                return false;
            }
            if (!Objects.equals(_alternativeImages, other.getAlternativeImages())) {
                return false;
            }
            if (!Objects.equals(_cloudInitInput, other.getCloudInitInput())) {
                return false;
            }
            if (!Objects.equals(_count, other.getCount())) {
                return false;
            }
            if (!Objects.equals(_description, other.getDescription())) {
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
            if (!Objects.equals(_image, other.getImage())) {
                return false;
            }
            if (!Objects.equals(_imageChecksum, other.getImageChecksum())) {
                return false;
            }
            if (!Objects.equals(_interface, other.getInterface())) {
                return false;
            }
            if (!Objects.equals(_internalConnectionPoint, other.getInternalConnectionPoint())) {
                return false;
            }
            if (!Objects.equals(_mgmtVpci, other.getMgmtVpci())) {
                return false;
            }
            if (!Objects.equals(_monitoringParam, other.getMonitoringParam())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_pduType, other.getPduType())) {
                return false;
            }
            if (!Objects.equals(_supplementalBootData, other.getSupplementalBootData())) {
                return false;
            }
            if (!Objects.equals(_vduConfiguration, other.getVduConfiguration())) {
                return false;
            }
            if (!Objects.equals(_vmFlavor, other.getVmFlavor())) {
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
                VduImpl otherImpl = (VduImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Vdu>>, Augmentation<Vdu>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Vdu");
            CodeHelpers.appendValue(helper, "_alarm", _alarm);
            CodeHelpers.appendValue(helper, "_alternativeImages", _alternativeImages);
            CodeHelpers.appendValue(helper, "_cloudInitInput", _cloudInitInput);
            CodeHelpers.appendValue(helper, "_count", _count);
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_guestEpa", _guestEpa);
            CodeHelpers.appendValue(helper, "_hostEpa", _hostEpa);
            CodeHelpers.appendValue(helper, "_hypervisorEpa", _hypervisorEpa);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_image", _image);
            CodeHelpers.appendValue(helper, "_imageChecksum", _imageChecksum);
            CodeHelpers.appendValue(helper, "_interface", _interface);
            CodeHelpers.appendValue(helper, "_internalConnectionPoint", _internalConnectionPoint);
            CodeHelpers.appendValue(helper, "_mgmtVpci", _mgmtVpci);
            CodeHelpers.appendValue(helper, "_monitoringParam", _monitoringParam);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_pduType", _pduType);
            CodeHelpers.appendValue(helper, "_supplementalBootData", _supplementalBootData);
            CodeHelpers.appendValue(helper, "_vduConfiguration", _vduConfiguration);
            CodeHelpers.appendValue(helper, "_vmFlavor", _vmFlavor);
            CodeHelpers.appendValue(helper, "_volumes", _volumes);
            CodeHelpers.appendValue(helper, "_vswitchEpa", _vswitchEpa);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
