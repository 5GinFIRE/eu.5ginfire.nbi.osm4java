package ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method;
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
 * Class that builds {@link Juju} instances.
 * 
 * @see Juju
 *
 */
public class JujuBuilder implements Builder<Juju> {

    private ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.juju.Juju _juju;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("juju");

    Map<Class<? extends Augmentation<Juju>>, Augmentation<Juju>> augmentation = Collections.emptyMap();

    public JujuBuilder() {
    }

    public JujuBuilder(Juju base) {
        this._juju = base.getJuju();
        if (base instanceof JujuImpl) {
            JujuImpl impl = (JujuImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Juju> casted =(AugmentationHolder<Juju>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.juju.Juju getJuju() {
        return _juju;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Juju>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public JujuBuilder setJuju(final ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.juju.Juju value) {
        this._juju = value;
        return this;
    }
    
    public JujuBuilder addAugmentation(Class<? extends Augmentation<Juju>> augmentationType, Augmentation<Juju> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public JujuBuilder removeAugmentation(Class<? extends Augmentation<Juju>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Juju build() {
        return new JujuImpl(this);
    }

    private static final class JujuImpl implements Juju {

        @Override
        public Class<Juju> getImplementedInterface() {
            return Juju.class;
        }

        private final ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.juju.Juju _juju;

        private Map<Class<? extends Augmentation<Juju>>, Augmentation<Juju>> augmentation = Collections.emptyMap();

        private JujuImpl(JujuBuilder base) {
            this._juju = base.getJuju();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.juju.Juju getJuju() {
            return _juju;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Juju>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_juju);
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
            if (!Juju.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Juju other = (Juju)obj;
            if (!Objects.equals(_juju, other.getJuju())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                JujuImpl otherImpl = (JujuImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Juju>>, Augmentation<Juju>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Juju");
            CodeHelpers.appendValue(helper, "_juju", _juju);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
