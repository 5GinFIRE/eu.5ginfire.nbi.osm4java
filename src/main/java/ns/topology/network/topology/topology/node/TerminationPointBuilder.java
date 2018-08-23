package ns.topology.network.topology.topology.node;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.topology.$YangModuleInfoImpl;
import ns.topology.TpId;

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
 * Class that builds {@link TerminationPoint} instances.
 * 
 * @see TerminationPoint
 *
 */
public class TerminationPointBuilder implements Builder<TerminationPoint> {

    private TpId _tpId;
    private List<TpId> _tpRef;
    private TerminationPointKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("termination-point");

    Map<Class<? extends Augmentation<TerminationPoint>>, Augmentation<TerminationPoint>> augmentation = Collections.emptyMap();

    public TerminationPointBuilder() {
    }
    public TerminationPointBuilder(ns.topology.TpAttributes arg) {
        this._tpId = arg.getTpId();
        this._tpRef = arg.getTpRef();
    }

    public TerminationPointBuilder(TerminationPoint base) {
        if (base.key() == null) {
            this.key = new TerminationPointKey(
                base.getTpId()
            );
            this._tpId = base.getTpId();
        } else {
            this.key = base.key();
            this._tpId = key.getTpId();
        }
        this._tpRef = base.getTpRef();
        if (base instanceof TerminationPointImpl) {
            TerminationPointImpl impl = (TerminationPointImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<TerminationPoint> casted =(AugmentationHolder<TerminationPoint>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>model.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TpAttributes</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ns.topology.TpAttributes) {
            this._tpId = ((ns.topology.TpAttributes)arg).getTpId();
            this._tpRef = ((ns.topology.TpAttributes)arg).getTpRef();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[model.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TpAttributes]");
    }

    public TerminationPointKey key() {
        return key;
    }
    
    public TpId getTpId() {
        return _tpId;
    }
    
    public List<TpId> getTpRef() {
        return _tpRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<TerminationPoint>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public TerminationPointBuilder withKey(final TerminationPointKey key) {
        this.key = key;
        return this;
    }
    
    public TerminationPointBuilder setTpId(final TpId value) {
        this._tpId = value;
        return this;
    }
    public TerminationPointBuilder setTpRef(final List<TpId> values) {
        this._tpRef = values;
        return this;
    }
    
    
    public TerminationPointBuilder addAugmentation(Class<? extends Augmentation<TerminationPoint>> augmentationType, Augmentation<TerminationPoint> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public TerminationPointBuilder removeAugmentation(Class<? extends Augmentation<TerminationPoint>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public TerminationPoint build() {
        return new TerminationPointImpl(this);
    }

    private static final class TerminationPointImpl implements TerminationPoint {

        @Override
        public Class<TerminationPoint> getImplementedInterface() {
            return TerminationPoint.class;
        }

        private final TpId _tpId;
        private final List<TpId> _tpRef;
        private final TerminationPointKey key;

        private Map<Class<? extends Augmentation<TerminationPoint>>, Augmentation<TerminationPoint>> augmentation = Collections.emptyMap();

        private TerminationPointImpl(TerminationPointBuilder base) {
            if (base.key() == null) {
                this.key = new TerminationPointKey(
                    base.getTpId()
                );
                this._tpId = base.getTpId();
            } else {
                this.key = base.key();
                this._tpId = key.getTpId();
            }
            this._tpRef = base.getTpRef();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public TerminationPointKey key() {
            return key;
        }
        
        @Override
        public TpId getTpId() {
            return _tpId;
        }
        
        @Override
        public List<TpId> getTpRef() {
            return _tpRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<TerminationPoint>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_tpId);
            result = prime * result + Objects.hashCode(_tpRef);
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
            if (!TerminationPoint.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            TerminationPoint other = (TerminationPoint)obj;
            if (!Objects.equals(_tpId, other.getTpId())) {
                return false;
            }
            if (!Objects.equals(_tpRef, other.getTpRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                TerminationPointImpl otherImpl = (TerminationPointImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<TerminationPoint>>, Augmentation<TerminationPoint>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("TerminationPoint");
            CodeHelpers.appendValue(helper, "_tpId", _tpId);
            CodeHelpers.appendValue(helper, "_tpRef", _tpRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
