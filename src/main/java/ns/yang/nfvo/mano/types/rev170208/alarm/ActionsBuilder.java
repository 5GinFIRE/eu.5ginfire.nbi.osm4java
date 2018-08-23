package ns.yang.nfvo.mano.types.rev170208.alarm;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.alarm.actions.Alarm;
import ns.yang.nfvo.mano.types.rev170208.alarm.actions.InsufficientData;
import ns.yang.nfvo.mano.types.rev170208.alarm.actions.Ok;

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
 * Class that builds {@link Actions} instances.
 * 
 * @see Actions
 *
 */
public class ActionsBuilder implements Builder<Actions> {

    private List<Alarm> _alarm;
    private List<InsufficientData> _insufficientData;
    private List<Ok> _ok;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("actions");

    Map<Class<? extends Augmentation<Actions>>, Augmentation<Actions>> augmentation = Collections.emptyMap();

    public ActionsBuilder() {
    }

    public ActionsBuilder(Actions base) {
        this._alarm = base.getAlarm();
        this._insufficientData = base.getInsufficientData();
        this._ok = base.getOk();
        if (base instanceof ActionsImpl) {
            ActionsImpl impl = (ActionsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Actions> casted =(AugmentationHolder<Actions>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<Alarm> getAlarm() {
        return _alarm;
    }
    
    public List<InsufficientData> getInsufficientData() {
        return _insufficientData;
    }
    
    public List<Ok> getOk() {
        return _ok;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Actions>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public ActionsBuilder setAlarm(final List<Alarm> values) {
        this._alarm = values;
        return this;
    }
    
    public ActionsBuilder setInsufficientData(final List<InsufficientData> values) {
        this._insufficientData = values;
        return this;
    }
    
    public ActionsBuilder setOk(final List<Ok> values) {
        this._ok = values;
        return this;
    }
    
    
    public ActionsBuilder addAugmentation(Class<? extends Augmentation<Actions>> augmentationType, Augmentation<Actions> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ActionsBuilder removeAugmentation(Class<? extends Augmentation<Actions>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Actions build() {
        return new ActionsImpl(this);
    }

    private static final class ActionsImpl implements Actions {

        @Override
        public Class<Actions> getImplementedInterface() {
            return Actions.class;
        }

        private final List<Alarm> _alarm;
        private final List<InsufficientData> _insufficientData;
        private final List<Ok> _ok;

        private Map<Class<? extends Augmentation<Actions>>, Augmentation<Actions>> augmentation = Collections.emptyMap();

        private ActionsImpl(ActionsBuilder base) {
            this._alarm = base.getAlarm();
            this._insufficientData = base.getInsufficientData();
            this._ok = base.getOk();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public List<Alarm> getAlarm() {
            return _alarm;
        }
        
        @Override
        public List<InsufficientData> getInsufficientData() {
            return _insufficientData;
        }
        
        @Override
        public List<Ok> getOk() {
            return _ok;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Actions>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_insufficientData);
            result = prime * result + Objects.hashCode(_ok);
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
            if (!Actions.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Actions other = (Actions)obj;
            if (!Objects.equals(_alarm, other.getAlarm())) {
                return false;
            }
            if (!Objects.equals(_insufficientData, other.getInsufficientData())) {
                return false;
            }
            if (!Objects.equals(_ok, other.getOk())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ActionsImpl otherImpl = (ActionsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Actions>>, Augmentation<Actions>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Actions");
            CodeHelpers.appendValue(helper, "_alarm", _alarm);
            CodeHelpers.appendValue(helper, "_insufficientData", _insufficientData);
            CodeHelpers.appendValue(helper, "_ok", _ok);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
