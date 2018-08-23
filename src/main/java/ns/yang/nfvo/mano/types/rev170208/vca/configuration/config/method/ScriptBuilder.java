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
 * Class that builds {@link Script} instances.
 * 
 * @see Script
 *
 */
public class ScriptBuilder implements Builder<Script> {

    private ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.script.Script _script;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("script");

    Map<Class<? extends Augmentation<Script>>, Augmentation<Script>> augmentation = Collections.emptyMap();

    public ScriptBuilder() {
    }

    public ScriptBuilder(Script base) {
        this._script = base.getScript();
        if (base instanceof ScriptImpl) {
            ScriptImpl impl = (ScriptImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Script> casted =(AugmentationHolder<Script>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.script.Script getScript() {
        return _script;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Script>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public ScriptBuilder setScript(final ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.script.Script value) {
        this._script = value;
        return this;
    }
    
    public ScriptBuilder addAugmentation(Class<? extends Augmentation<Script>> augmentationType, Augmentation<Script> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ScriptBuilder removeAugmentation(Class<? extends Augmentation<Script>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Script build() {
        return new ScriptImpl(this);
    }

    private static final class ScriptImpl implements Script {

        @Override
        public Class<Script> getImplementedInterface() {
            return Script.class;
        }

        private final ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.script.Script _script;

        private Map<Class<? extends Augmentation<Script>>, Augmentation<Script>> augmentation = Collections.emptyMap();

        private ScriptImpl(ScriptBuilder base) {
            this._script = base.getScript();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public ns.yang.nfvo.mano.types.rev170208.vca.configuration.config.method.script.Script getScript() {
            return _script;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Script>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_script);
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
            if (!Script.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Script other = (Script)obj;
            if (!Objects.equals(_script, other.getScript())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ScriptImpl otherImpl = (ScriptImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Script>>, Augmentation<Script>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Script");
            CodeHelpers.appendValue(helper, "_script", _script);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
