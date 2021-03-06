package ns.topology.link.attributes;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.topology.$YangModuleInfoImpl;
import ns.topology.LinkId;

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
 * Class that builds {@link SupportingLink} instances.
 * 
 * @see SupportingLink
 *
 */
public class SupportingLinkBuilder implements Builder<SupportingLink> {

    private LinkId _linkRef;
    private SupportingLinkKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("supporting-link");

    Map<Class<? extends Augmentation<SupportingLink>>, Augmentation<SupportingLink>> augmentation = Collections.emptyMap();

    public SupportingLinkBuilder() {
    }

    public SupportingLinkBuilder(SupportingLink base) {
        if (base.key() == null) {
            this.key = new SupportingLinkKey(
                base.getLinkRef()
            );
            this._linkRef = base.getLinkRef();
        } else {
            this.key = base.key();
            this._linkRef = key.getLinkRef();
        }
        if (base instanceof SupportingLinkImpl) {
            SupportingLinkImpl impl = (SupportingLinkImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<SupportingLink> casted =(AugmentationHolder<SupportingLink>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public SupportingLinkKey key() {
        return key;
    }
    
    public LinkId getLinkRef() {
        return _linkRef;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<SupportingLink>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public SupportingLinkBuilder withKey(final SupportingLinkKey key) {
        this.key = key;
        return this;
    }
    
    public SupportingLinkBuilder setLinkRef(final LinkId value) {
        this._linkRef = value;
        return this;
    }
    
    public SupportingLinkBuilder addAugmentation(Class<? extends Augmentation<SupportingLink>> augmentationType, Augmentation<SupportingLink> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public SupportingLinkBuilder removeAugmentation(Class<? extends Augmentation<SupportingLink>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public SupportingLink build() {
        return new SupportingLinkImpl(this);
    }

    private static final class SupportingLinkImpl implements SupportingLink {

        @Override
        public Class<SupportingLink> getImplementedInterface() {
            return SupportingLink.class;
        }

        private final LinkId _linkRef;
        private final SupportingLinkKey key;

        private Map<Class<? extends Augmentation<SupportingLink>>, Augmentation<SupportingLink>> augmentation = Collections.emptyMap();

        private SupportingLinkImpl(SupportingLinkBuilder base) {
            if (base.key() == null) {
                this.key = new SupportingLinkKey(
                    base.getLinkRef()
                );
                this._linkRef = base.getLinkRef();
            } else {
                this.key = base.key();
                this._linkRef = key.getLinkRef();
            }
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public SupportingLinkKey key() {
            return key;
        }
        
        @Override
        public LinkId getLinkRef() {
            return _linkRef;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<SupportingLink>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_linkRef);
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
            if (!SupportingLink.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            SupportingLink other = (SupportingLink)obj;
            if (!Objects.equals(_linkRef, other.getLinkRef())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SupportingLinkImpl otherImpl = (SupportingLinkImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<SupportingLink>>, Augmentation<SupportingLink>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("SupportingLink");
            CodeHelpers.appendValue(helper, "_linkRef", _linkRef);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
