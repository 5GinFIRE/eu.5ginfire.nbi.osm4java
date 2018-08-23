package ns.yang.ietf.network.topology.rev150608.network;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.network.topology.rev150608.$YangModuleInfoImpl;
import ns.yang.ietf.network.topology.rev150608.LinkId;
import ns.yang.ietf.network.topology.rev150608.network.link.Destination;
import ns.yang.ietf.network.topology.rev150608.network.link.Source;
import ns.yang.ietf.network.topology.rev150608.network.link.SupportingLink;

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
 * Class that builds {@link Link} instances.
 * 
 * @see Link
 *
 */
public class LinkBuilder implements Builder<Link> {

    private Destination _destination;
    private LinkId _linkId;
    private Source _source;
    private List<SupportingLink> _supportingLink;
    private LinkKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("link");

    Map<Class<? extends Augmentation<Link>>, Augmentation<Link>> augmentation = Collections.emptyMap();

    public LinkBuilder() {
    }

    public LinkBuilder(Link base) {
        if (base.key() == null) {
            this.key = new LinkKey(
                base.getLinkId()
            );
            this._linkId = base.getLinkId();
        } else {
            this.key = base.key();
            this._linkId = key.getLinkId();
        }
        this._destination = base.getDestination();
        this._source = base.getSource();
        this._supportingLink = base.getSupportingLink();
        if (base instanceof LinkImpl) {
            LinkImpl impl = (LinkImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Link> casted =(AugmentationHolder<Link>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public LinkKey key() {
        return key;
    }
    
    public Destination getDestination() {
        return _destination;
    }
    
    public LinkId getLinkId() {
        return _linkId;
    }
    
    public Source getSource() {
        return _source;
    }
    
    public List<SupportingLink> getSupportingLink() {
        return _supportingLink;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Link>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public LinkBuilder withKey(final LinkKey key) {
        this.key = key;
        return this;
    }
    
    public LinkBuilder setDestination(final Destination value) {
        this._destination = value;
        return this;
    }
    
    public LinkBuilder setLinkId(final LinkId value) {
        this._linkId = value;
        return this;
    }
    
    public LinkBuilder setSource(final Source value) {
        this._source = value;
        return this;
    }
    public LinkBuilder setSupportingLink(final List<SupportingLink> values) {
        this._supportingLink = values;
        return this;
    }
    
    
    public LinkBuilder addAugmentation(Class<? extends Augmentation<Link>> augmentationType, Augmentation<Link> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public LinkBuilder removeAugmentation(Class<? extends Augmentation<Link>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Link build() {
        return new LinkImpl(this);
    }

    private static final class LinkImpl implements Link {

        @Override
        public Class<Link> getImplementedInterface() {
            return Link.class;
        }

        private final Destination _destination;
        private final LinkId _linkId;
        private final Source _source;
        private final List<SupportingLink> _supportingLink;
        private final LinkKey key;

        private Map<Class<? extends Augmentation<Link>>, Augmentation<Link>> augmentation = Collections.emptyMap();

        private LinkImpl(LinkBuilder base) {
            if (base.key() == null) {
                this.key = new LinkKey(
                    base.getLinkId()
                );
                this._linkId = base.getLinkId();
            } else {
                this.key = base.key();
                this._linkId = key.getLinkId();
            }
            this._destination = base.getDestination();
            this._source = base.getSource();
            this._supportingLink = base.getSupportingLink();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public LinkKey key() {
            return key;
        }
        
        @Override
        public Destination getDestination() {
            return _destination;
        }
        
        @Override
        public LinkId getLinkId() {
            return _linkId;
        }
        
        @Override
        public Source getSource() {
            return _source;
        }
        
        @Override
        public List<SupportingLink> getSupportingLink() {
            return _supportingLink;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Link>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_destination);
            result = prime * result + Objects.hashCode(_linkId);
            result = prime * result + Objects.hashCode(_source);
            result = prime * result + Objects.hashCode(_supportingLink);
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
            if (!Link.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Link other = (Link)obj;
            if (!Objects.equals(_destination, other.getDestination())) {
                return false;
            }
            if (!Objects.equals(_linkId, other.getLinkId())) {
                return false;
            }
            if (!Objects.equals(_source, other.getSource())) {
                return false;
            }
            if (!Objects.equals(_supportingLink, other.getSupportingLink())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                LinkImpl otherImpl = (LinkImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Link>>, Augmentation<Link>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Link");
            CodeHelpers.appendValue(helper, "_destination", _destination);
            CodeHelpers.appendValue(helper, "_linkId", _linkId);
            CodeHelpers.appendValue(helper, "_source", _source);
            CodeHelpers.appendValue(helper, "_supportingLink", _supportingLink);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
