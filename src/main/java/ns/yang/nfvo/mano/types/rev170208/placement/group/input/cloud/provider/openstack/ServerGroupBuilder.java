package ns.yang.nfvo.mano.types.rev170208.placement.group.input.cloud.provider.openstack;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;

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
 * Class that builds {@link ServerGroup} instances.
 * 
 * @see ServerGroup
 *
 */
public class ServerGroupBuilder implements Builder<ServerGroup> {

    private String _name;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("server-group");

    Map<Class<? extends Augmentation<ServerGroup>>, Augmentation<ServerGroup>> augmentation = Collections.emptyMap();

    public ServerGroupBuilder() {
    }

    public ServerGroupBuilder(ServerGroup base) {
        this._name = base.getName();
        if (base instanceof ServerGroupImpl) {
            ServerGroupImpl impl = (ServerGroupImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ServerGroup> casted =(AugmentationHolder<ServerGroup>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public String getName() {
        return _name;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ServerGroup>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public ServerGroupBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public ServerGroupBuilder addAugmentation(Class<? extends Augmentation<ServerGroup>> augmentationType, Augmentation<ServerGroup> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ServerGroupBuilder removeAugmentation(Class<? extends Augmentation<ServerGroup>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ServerGroup build() {
        return new ServerGroupImpl(this);
    }

    private static final class ServerGroupImpl implements ServerGroup {

        @Override
        public Class<ServerGroup> getImplementedInterface() {
            return ServerGroup.class;
        }

        private final String _name;

        private Map<Class<? extends Augmentation<ServerGroup>>, Augmentation<ServerGroup>> augmentation = Collections.emptyMap();

        private ServerGroupImpl(ServerGroupBuilder base) {
            this._name = base.getName();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public String getName() {
            return _name;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ServerGroup>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_name);
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
            if (!ServerGroup.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ServerGroup other = (ServerGroup)obj;
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ServerGroupImpl otherImpl = (ServerGroupImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ServerGroup>>, Augmentation<ServerGroup>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ServerGroup");
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
