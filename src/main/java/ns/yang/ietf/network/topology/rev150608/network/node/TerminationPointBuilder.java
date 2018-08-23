package ns.yang.ietf.network.topology.rev150608.network.node;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.network.topology.rev150608.$YangModuleInfoImpl;
import ns.yang.ietf.network.topology.rev150608.TpId;
import ns.yang.ietf.network.topology.rev150608.network.node.termination.point.SupportingTerminationPoint;

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

    private List<SupportingTerminationPoint> _supportingTerminationPoint;
    private TpId _tpId;
    private TerminationPointKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("termination-point");

    Map<Class<? extends Augmentation<TerminationPoint>>, Augmentation<TerminationPoint>> augmentation = Collections.emptyMap();

    public TerminationPointBuilder() {
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
        this._supportingTerminationPoint = base.getSupportingTerminationPoint();
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


    public TerminationPointKey key() {
        return key;
    }
    
    public List<SupportingTerminationPoint> getSupportingTerminationPoint() {
        return _supportingTerminationPoint;
    }
    
    public TpId getTpId() {
        return _tpId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<TerminationPoint>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public TerminationPointBuilder withKey(final TerminationPointKey key) {
        this.key = key;
        return this;
    }
    public TerminationPointBuilder setSupportingTerminationPoint(final List<SupportingTerminationPoint> values) {
        this._supportingTerminationPoint = values;
        return this;
    }
    
    
    public TerminationPointBuilder setTpId(final TpId value) {
        this._tpId = value;
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

        private final List<SupportingTerminationPoint> _supportingTerminationPoint;
        private final TpId _tpId;
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
            this._supportingTerminationPoint = base.getSupportingTerminationPoint();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public TerminationPointKey key() {
            return key;
        }
        
        @Override
        public List<SupportingTerminationPoint> getSupportingTerminationPoint() {
            return _supportingTerminationPoint;
        }
        
        @Override
        public TpId getTpId() {
            return _tpId;
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
            result = prime * result + Objects.hashCode(_supportingTerminationPoint);
            result = prime * result + Objects.hashCode(_tpId);
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
            if (!Objects.equals(_supportingTerminationPoint, other.getSupportingTerminationPoint())) {
                return false;
            }
            if (!Objects.equals(_tpId, other.getTpId())) {
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
            CodeHelpers.appendValue(helper, "_supportingTerminationPoint", _supportingTerminationPoint);
            CodeHelpers.appendValue(helper, "_tpId", _tpId);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
