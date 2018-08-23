package yang.vnfd.vnfd.descriptor.mgmt._interface;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.inet.types.rev100924.PortNumber;
import yang.vnfd.$YangModuleInfoImpl;

import java.lang.Boolean;
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
 * Class that builds {@link DashboardParams} instances.
 * 
 * @see DashboardParams
 *
 */
public class DashboardParamsBuilder implements Builder<DashboardParams> {

    private String _path;
    private PortNumber _port;
    private Boolean _https;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("dashboard-params");

    Map<Class<? extends Augmentation<DashboardParams>>, Augmentation<DashboardParams>> augmentation = Collections.emptyMap();

    public DashboardParamsBuilder() {
    }

    public DashboardParamsBuilder(DashboardParams base) {
        this._path = base.getPath();
        this._port = base.getPort();
        this._https = base.isHttps();
        if (base instanceof DashboardParamsImpl) {
            DashboardParamsImpl impl = (DashboardParamsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<DashboardParams> casted =(AugmentationHolder<DashboardParams>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public String getPath() {
        return _path;
    }
    
    public PortNumber getPort() {
        return _port;
    }
    
    public Boolean isHttps() {
        return _https;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<DashboardParams>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public DashboardParamsBuilder setPath(final String value) {
        this._path = value;
        return this;
    }
    
    public DashboardParamsBuilder setPort(final PortNumber value) {
        this._port = value;
        return this;
    }
    
    public DashboardParamsBuilder setHttps(final Boolean value) {
        this._https = value;
        return this;
    }
    
    public DashboardParamsBuilder addAugmentation(Class<? extends Augmentation<DashboardParams>> augmentationType, Augmentation<DashboardParams> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public DashboardParamsBuilder removeAugmentation(Class<? extends Augmentation<DashboardParams>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public DashboardParams build() {
        return new DashboardParamsImpl(this);
    }

    private static final class DashboardParamsImpl implements DashboardParams {

        @Override
        public Class<DashboardParams> getImplementedInterface() {
            return DashboardParams.class;
        }

        private final String _path;
        private final PortNumber _port;
        private final Boolean _https;

        private Map<Class<? extends Augmentation<DashboardParams>>, Augmentation<DashboardParams>> augmentation = Collections.emptyMap();

        private DashboardParamsImpl(DashboardParamsBuilder base) {
            this._path = base.getPath();
            this._port = base.getPort();
            this._https = base.isHttps();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public String getPath() {
            return _path;
        }
        
        @Override
        public PortNumber getPort() {
            return _port;
        }
        
        @Override
        public Boolean isHttps() {
            return _https;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<DashboardParams>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_path);
            result = prime * result + Objects.hashCode(_port);
            result = prime * result + Objects.hashCode(_https);
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
            if (!DashboardParams.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            DashboardParams other = (DashboardParams)obj;
            if (!Objects.equals(_path, other.getPath())) {
                return false;
            }
            if (!Objects.equals(_port, other.getPort())) {
                return false;
            }
            if (!Objects.equals(_https, other.isHttps())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                DashboardParamsImpl otherImpl = (DashboardParamsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<DashboardParams>>, Augmentation<DashboardParams>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("DashboardParams");
            CodeHelpers.appendValue(helper, "_path", _path);
            CodeHelpers.appendValue(helper, "_port", _port);
            CodeHelpers.appendValue(helper, "_https", _https);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
