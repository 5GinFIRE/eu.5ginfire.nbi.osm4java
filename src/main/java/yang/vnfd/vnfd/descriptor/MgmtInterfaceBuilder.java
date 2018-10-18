package yang.vnfd.vnfd.descriptor;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.inet.types.rev100924.PortNumber;
import yang.vnfd.$YangModuleInfoImpl;
import yang.vnfd.vnfd.descriptor.mgmt._interface.DashboardParams;
import yang.vnfd.vnfd.descriptor.mgmt._interface.EndpointType;
import yang.vnfd.vnfd.descriptor.mgmt._interface.endpoint.type.CpBuilder;
import yang.vnfd.vnfd.descriptor.mgmt._interface.endpoint.type.IpBuilder;
import yang.vnfd.vnfd.descriptor.mgmt._interface.endpoint.type.VduIdBuilder;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
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
 * Class that builds {@link MgmtInterface} instances.
 * 
 * @see MgmtInterface
 *
 */
public class MgmtInterfaceBuilder implements Builder<MgmtInterface> {

    private DashboardParams _dashboardParams;
    private EndpointType _endpointType;
    private PortNumber _port;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("mgmt-interface");

    Map<Class<? extends Augmentation<MgmtInterface>>, Augmentation<MgmtInterface>> augmentation = Collections.emptyMap();

    public MgmtInterfaceBuilder() {
    }

    public MgmtInterfaceBuilder(MgmtInterface base) {
        this._dashboardParams = base.getDashboardParams();
        this._endpointType = base.getEndpointType();
        this._port = base.getPort();
        if (base instanceof MgmtInterfaceImpl) {
            MgmtInterfaceImpl impl = (MgmtInterfaceImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<MgmtInterface> casted =(AugmentationHolder<MgmtInterface>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public DashboardParams getDashboardParams() {
        return _dashboardParams;
    }
    
    public EndpointType getEndpointType() {
        return _endpointType;
    }
    
    public PortNumber getPort() {
        return _port;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<MgmtInterface>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public MgmtInterfaceBuilder setDashboardParams(final DashboardParams value) {
        this._dashboardParams = value;
        return this;
    }
    
    public MgmtInterfaceBuilder setEndpointType(final EndpointType value) {
        this._endpointType = value;
        return this;
    }
    
    public MgmtInterfaceBuilder setPort(final PortNumber value) {
        this._port = value;
        return this;
    }
    
    public MgmtInterfaceBuilder addAugmentation(Class<? extends Augmentation<MgmtInterface>> augmentationType, Augmentation<MgmtInterface> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public MgmtInterfaceBuilder removeAugmentation(Class<? extends Augmentation<MgmtInterface>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public MgmtInterface build() {
        return new MgmtInterfaceImpl(this);
    }

    public static final class MgmtInterfaceImpl implements MgmtInterface {

        @Override
        public Class<MgmtInterface> getImplementedInterface() {
            return MgmtInterface.class;
        }
        //@JsonProperty("dashboard-params") 
        private final DashboardParams _dashboardParams;
        //@JsonProperty("endpoint-type")
        private EndpointType _endpointType;        
        //@JsonProperty("port")
        private final PortNumber _port;

        private Map<Class<? extends Augmentation<MgmtInterface>>, Augmentation<MgmtInterface>> augmentation = Collections.emptyMap();

        private MgmtInterfaceImpl(MgmtInterfaceBuilder base) {
            this._dashboardParams = base.getDashboardParams();
            this._endpointType = base.getEndpointType();
            this._port = base.getPort();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        public MgmtInterfaceImpl(){
        	this( new MgmtInterfaceBuilder() );
        }
        
        @JsonProperty("vdu-id")
        public void setVduidAsEndpointType(String s){
        	_endpointType = (new VduIdBuilder()).build() ;
        }
        
        @JsonProperty("cp")
        public void setCPAsEndpointType(String s){
        	_endpointType = (new CpBuilder()).build() ;
        }
        
        @JsonProperty("ip")
        public void setIPAsEndpointType(String s){
        	_endpointType = (new IpBuilder()).build() ;
        }
        
        @Override
        public DashboardParams getDashboardParams() {
            return _dashboardParams;
        }
        
        @Override
        public EndpointType getEndpointType() {
            return _endpointType;
        }
        
        @Override
        public PortNumber getPort() {
            return _port;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<MgmtInterface>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_dashboardParams);
            result = prime * result + Objects.hashCode(_endpointType);
            result = prime * result + Objects.hashCode(_port);
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
            if (!MgmtInterface.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            MgmtInterface other = (MgmtInterface)obj;
            if (!Objects.equals(_dashboardParams, other.getDashboardParams())) {
                return false;
            }
            if (!Objects.equals(_endpointType, other.getEndpointType())) {
                return false;
            }
            if (!Objects.equals(_port, other.getPort())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MgmtInterfaceImpl otherImpl = (MgmtInterfaceImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<MgmtInterface>>, Augmentation<MgmtInterface>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("MgmtInterface");
            CodeHelpers.appendValue(helper, "_dashboardParams", _dashboardParams);
            CodeHelpers.appendValue(helper, "_endpointType", _endpointType);
            CodeHelpers.appendValue(helper, "_port", _port);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
