package ns.yang.nfvo.nsr.rev170208.project.ns.instance.config;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.yang.types.rev130715.Uuid;
import ns.yang.nfvo.mano.types.rev170208.input.parameter.InputParameter;
import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.nsr.rev170208.cloud.config.SshAuthorizedKey;
import ns.yang.nfvo.nsr.rev170208.cloud.config.User;
import ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.VnfdPlacementGroupMaps;
import ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.NsdPlacementGroupMaps;
import ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.ScalingGroup;
import ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.nsr.Nsd;

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
 * Class that builds {@link Nsr} instances.
 * 
 * @see Nsr
 *
 */
public class NsrBuilder implements Builder<Nsr> {

    private Nsr.AdminStatus _adminStatus;
    private String _description;
    private Uuid _id;
    private List<InputParameter> _inputParameter;
    private String _name;
    private Nsd _nsd;
    private List<NsdPlacementGroupMaps> _nsdPlacementGroupMaps;
    private List<ScalingGroup> _scalingGroup;
    private String _schemaVersion;
    private String _shortName;
    private List<SshAuthorizedKey> _sshAuthorizedKey;
    private List<User> _user;
    private List<VnfdPlacementGroupMaps> _vnfdPlacementGroupMaps;
    private NsrKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("nsr");
    private static final Pattern patterns_id = Pattern.compile("^(?:[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})$");
    private static final String regexes_id = "[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}";

    Map<Class<? extends Augmentation<Nsr>>, Augmentation<Nsr>> augmentation = Collections.emptyMap();

    public NsrBuilder() {
    }
    public NsrBuilder(ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParams arg) {
        this._vnfdPlacementGroupMaps = arg.getVnfdPlacementGroupMaps();
        this._scalingGroup = arg.getScalingGroup();
        this._nsdPlacementGroupMaps = arg.getNsdPlacementGroupMaps();
        this._inputParameter = arg.getInputParameter();
        this._sshAuthorizedKey = arg.getSshAuthorizedKey();
        this._user = arg.getUser();
    }
    public NsrBuilder(ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParamsCommon arg) {
        this._scalingGroup = arg.getScalingGroup();
        this._nsdPlacementGroupMaps = arg.getNsdPlacementGroupMaps();
        this._inputParameter = arg.getInputParameter();
    }
    public NsrBuilder(ns.yang.nfvo.mano.types.rev170208.InputParameter arg) {
        this._inputParameter = arg.getInputParameter();
    }
    public NsrBuilder(ns.yang.nfvo.nsr.rev170208.CloudConfig arg) {
        this._sshAuthorizedKey = arg.getSshAuthorizedKey();
        this._user = arg.getUser();
    }

    public NsrBuilder(Nsr base) {
        if (base.key() == null) {
            this.key = new NsrKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this.key = base.key();
            this._id = key.getId();
        }
        this._adminStatus = base.getAdminStatus();
        this._description = base.getDescription();
        this._inputParameter = base.getInputParameter();
        this._name = base.getName();
        this._nsd = base.getNsd();
        this._nsdPlacementGroupMaps = base.getNsdPlacementGroupMaps();
        this._scalingGroup = base.getScalingGroup();
        this._schemaVersion = base.getSchemaVersion();
        this._shortName = base.getShortName();
        this._sshAuthorizedKey = base.getSshAuthorizedKey();
        this._user = base.getUser();
        this._vnfdPlacementGroupMaps = base.getVnfdPlacementGroupMaps();
        if (base instanceof NsrImpl) {
            NsrImpl impl = (NsrImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Nsr> casted =(AugmentationHolder<Nsr>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.CloudConfig</li>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParams</li>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParamsCommon</li>
     * <li>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.InputParameter</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ns.yang.nfvo.nsr.rev170208.CloudConfig) {
            this._sshAuthorizedKey = ((ns.yang.nfvo.nsr.rev170208.CloudConfig)arg).getSshAuthorizedKey();
            this._user = ((ns.yang.nfvo.nsr.rev170208.CloudConfig)arg).getUser();
            isValidArg = true;
        }
        if (arg instanceof ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParams) {
            this._vnfdPlacementGroupMaps = ((ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParams)arg).getVnfdPlacementGroupMaps();
            isValidArg = true;
        }
        if (arg instanceof ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParamsCommon) {
            this._scalingGroup = ((ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParamsCommon)arg).getScalingGroup();
            this._nsdPlacementGroupMaps = ((ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParamsCommon)arg).getNsdPlacementGroupMaps();
            isValidArg = true;
        }
        if (arg instanceof ns.yang.nfvo.mano.types.rev170208.InputParameter) {
            this._inputParameter = ((ns.yang.nfvo.mano.types.rev170208.InputParameter)arg).getInputParameter();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[model.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.CloudConfig, model.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParams, model.urn.ietf.params.xml.ns.yang.nfvo.nsr.rev170208.NsInstanceConfigParamsCommon, model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.InputParameter]");
    }

    public NsrKey key() {
        return key;
    }
    
    public Nsr.AdminStatus getAdminStatus() {
        return _adminStatus;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public Uuid getId() {
        return _id;
    }
    
    public List<InputParameter> getInputParameter() {
        return _inputParameter;
    }
    
    public String getName() {
        return _name;
    }
    
    public Nsd getNsd() {
        return _nsd;
    }
    
    public List<NsdPlacementGroupMaps> getNsdPlacementGroupMaps() {
        return _nsdPlacementGroupMaps;
    }
    
    public List<ScalingGroup> getScalingGroup() {
        return _scalingGroup;
    }
    
    public String getSchemaVersion() {
        return _schemaVersion;
    }
    
    public String getShortName() {
        return _shortName;
    }
    
    public List<SshAuthorizedKey> getSshAuthorizedKey() {
        return _sshAuthorizedKey;
    }
    
    public List<User> getUser() {
        return _user;
    }
    
    public List<VnfdPlacementGroupMaps> getVnfdPlacementGroupMaps() {
        return _vnfdPlacementGroupMaps;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Nsr>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public NsrBuilder withKey(final NsrKey key) {
        this.key = key;
        return this;
    }
    
    public NsrBuilder setAdminStatus(final Nsr.AdminStatus value) {
        this._adminStatus = value;
        return this;
    }
    
    public NsrBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public NsrBuilder setId(final Uuid value) {
        this._id = value;
        return this;
    }
    public NsrBuilder setInputParameter(final List<InputParameter> values) {
        this._inputParameter = values;
        return this;
    }
    
    
    public NsrBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public NsrBuilder setNsd(final Nsd value) {
        this._nsd = value;
        return this;
    }
    public NsrBuilder setNsdPlacementGroupMaps(final List<NsdPlacementGroupMaps> values) {
        this._nsdPlacementGroupMaps = values;
        return this;
    }
    
    public NsrBuilder setScalingGroup(final List<ScalingGroup> values) {
        this._scalingGroup = values;
        return this;
    }
    
    
    public NsrBuilder setSchemaVersion(final String value) {
        this._schemaVersion = value;
        return this;
    }
    
    public NsrBuilder setShortName(final String value) {
        this._shortName = value;
        return this;
    }
    public NsrBuilder setSshAuthorizedKey(final List<SshAuthorizedKey> values) {
        this._sshAuthorizedKey = values;
        return this;
    }
    
    public NsrBuilder setUser(final List<User> values) {
        this._user = values;
        return this;
    }
    
    public NsrBuilder setVnfdPlacementGroupMaps(final List<VnfdPlacementGroupMaps> values) {
        this._vnfdPlacementGroupMaps = values;
        return this;
    }
    
    
    public NsrBuilder addAugmentation(Class<? extends Augmentation<Nsr>> augmentationType, Augmentation<Nsr> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public NsrBuilder removeAugmentation(Class<? extends Augmentation<Nsr>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Nsr build() {
        return new NsrImpl(this);
    }

    private static final class NsrImpl implements Nsr {

        @Override
        public Class<Nsr> getImplementedInterface() {
            return Nsr.class;
        }

        private final Nsr.AdminStatus _adminStatus;
        private final String _description;
        private final Uuid _id;
        private final List<InputParameter> _inputParameter;
        private final String _name;
        private final Nsd _nsd;
        private final List<NsdPlacementGroupMaps> _nsdPlacementGroupMaps;
        private final List<ScalingGroup> _scalingGroup;
        private final String _schemaVersion;
        private final String _shortName;
        private final List<SshAuthorizedKey> _sshAuthorizedKey;
        private final List<User> _user;
        private final List<VnfdPlacementGroupMaps> _vnfdPlacementGroupMaps;
        private final NsrKey key;

        private Map<Class<? extends Augmentation<Nsr>>, Augmentation<Nsr>> augmentation = Collections.emptyMap();

        private NsrImpl(NsrBuilder base) {
            if (base.key() == null) {
                this.key = new NsrKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this.key = base.key();
                this._id = key.getId();
            }
            this._adminStatus = base.getAdminStatus();
            this._description = base.getDescription();
            this._inputParameter = base.getInputParameter();
            this._name = base.getName();
            this._nsd = base.getNsd();
            this._nsdPlacementGroupMaps = base.getNsdPlacementGroupMaps();
            this._scalingGroup = base.getScalingGroup();
            this._schemaVersion = base.getSchemaVersion();
            this._shortName = base.getShortName();
            this._sshAuthorizedKey = base.getSshAuthorizedKey();
            this._user = base.getUser();
            this._vnfdPlacementGroupMaps = base.getVnfdPlacementGroupMaps();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public NsrKey key() {
            return key;
        }
        
        @Override
        public Nsr.AdminStatus getAdminStatus() {
            return _adminStatus;
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
        public List<InputParameter> getInputParameter() {
            return _inputParameter;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public Nsd getNsd() {
            return _nsd;
        }
        
        @Override
        public List<NsdPlacementGroupMaps> getNsdPlacementGroupMaps() {
            return _nsdPlacementGroupMaps;
        }
        
        @Override
        public List<ScalingGroup> getScalingGroup() {
            return _scalingGroup;
        }
        
        @Override
        public String getSchemaVersion() {
            return _schemaVersion;
        }
        
        @Override
        public String getShortName() {
            return _shortName;
        }
        
        @Override
        public List<SshAuthorizedKey> getSshAuthorizedKey() {
            return _sshAuthorizedKey;
        }
        
        @Override
        public List<User> getUser() {
            return _user;
        }
        
        @Override
        public List<VnfdPlacementGroupMaps> getVnfdPlacementGroupMaps() {
            return _vnfdPlacementGroupMaps;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Nsr>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_adminStatus);
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_inputParameter);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_nsd);
            result = prime * result + Objects.hashCode(_nsdPlacementGroupMaps);
            result = prime * result + Objects.hashCode(_scalingGroup);
            result = prime * result + Objects.hashCode(_schemaVersion);
            result = prime * result + Objects.hashCode(_shortName);
            result = prime * result + Objects.hashCode(_sshAuthorizedKey);
            result = prime * result + Objects.hashCode(_user);
            result = prime * result + Objects.hashCode(_vnfdPlacementGroupMaps);
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
            if (!Nsr.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Nsr other = (Nsr)obj;
            if (!Objects.equals(_adminStatus, other.getAdminStatus())) {
                return false;
            }
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_inputParameter, other.getInputParameter())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_nsd, other.getNsd())) {
                return false;
            }
            if (!Objects.equals(_nsdPlacementGroupMaps, other.getNsdPlacementGroupMaps())) {
                return false;
            }
            if (!Objects.equals(_scalingGroup, other.getScalingGroup())) {
                return false;
            }
            if (!Objects.equals(_schemaVersion, other.getSchemaVersion())) {
                return false;
            }
            if (!Objects.equals(_shortName, other.getShortName())) {
                return false;
            }
            if (!Objects.equals(_sshAuthorizedKey, other.getSshAuthorizedKey())) {
                return false;
            }
            if (!Objects.equals(_user, other.getUser())) {
                return false;
            }
            if (!Objects.equals(_vnfdPlacementGroupMaps, other.getVnfdPlacementGroupMaps())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NsrImpl otherImpl = (NsrImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Nsr>>, Augmentation<Nsr>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Nsr");
            CodeHelpers.appendValue(helper, "_adminStatus", _adminStatus);
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_inputParameter", _inputParameter);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_nsd", _nsd);
            CodeHelpers.appendValue(helper, "_nsdPlacementGroupMaps", _nsdPlacementGroupMaps);
            CodeHelpers.appendValue(helper, "_scalingGroup", _scalingGroup);
            CodeHelpers.appendValue(helper, "_schemaVersion", _schemaVersion);
            CodeHelpers.appendValue(helper, "_shortName", _shortName);
            CodeHelpers.appendValue(helper, "_sshAuthorizedKey", _sshAuthorizedKey);
            CodeHelpers.appendValue(helper, "_user", _user);
            CodeHelpers.appendValue(helper, "_vnfdPlacementGroupMaps", _vnfdPlacementGroupMaps);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
