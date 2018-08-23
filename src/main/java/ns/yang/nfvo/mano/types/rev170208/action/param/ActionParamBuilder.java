package ns.yang.nfvo.mano.types.rev170208.action.param;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.inet.types.rev100924.Uri;
import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.HttpMethod;

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
 * Class that builds {@link ActionParam} instances.
 * 
 * @see ActionParam
 *
 */
public class ActionParamBuilder implements Builder<ActionParam> {

    private String _description;
    private String _groupTag;
    private String _id;
    private HttpMethod _method;
    private String _name;
    private String _payload;
    private Uri _url;
    private ActionParamKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("action-param");

    Map<Class<? extends Augmentation<ActionParam>>, Augmentation<ActionParam>> augmentation = Collections.emptyMap();

    public ActionParamBuilder() {
    }

    public ActionParamBuilder(ActionParam base) {
        if (base.key() == null) {
            this.key = new ActionParamKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this.key = base.key();
            this._id = key.getId();
        }
        this._description = base.getDescription();
        this._groupTag = base.getGroupTag();
        this._method = base.getMethod();
        this._name = base.getName();
        this._payload = base.getPayload();
        this._url = base.getUrl();
        if (base instanceof ActionParamImpl) {
            ActionParamImpl impl = (ActionParamImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ActionParam> casted =(AugmentationHolder<ActionParam>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public ActionParamKey key() {
        return key;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public String getGroupTag() {
        return _groupTag;
    }
    
    public String getId() {
        return _id;
    }
    
    public HttpMethod getMethod() {
        return _method;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getPayload() {
        return _payload;
    }
    
    public Uri getUrl() {
        return _url;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ActionParam>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public ActionParamBuilder withKey(final ActionParamKey key) {
        this.key = key;
        return this;
    }
    
    public ActionParamBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public ActionParamBuilder setGroupTag(final String value) {
        this._groupTag = value;
        return this;
    }
    
    public ActionParamBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public ActionParamBuilder setMethod(final HttpMethod value) {
        this._method = value;
        return this;
    }
    
    public ActionParamBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public ActionParamBuilder setPayload(final String value) {
        this._payload = value;
        return this;
    }
    
    public ActionParamBuilder setUrl(final Uri value) {
        this._url = value;
        return this;
    }
    
    public ActionParamBuilder addAugmentation(Class<? extends Augmentation<ActionParam>> augmentationType, Augmentation<ActionParam> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ActionParamBuilder removeAugmentation(Class<? extends Augmentation<ActionParam>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ActionParam build() {
        return new ActionParamImpl(this);
    }

    private static final class ActionParamImpl implements ActionParam {

        @Override
        public Class<ActionParam> getImplementedInterface() {
            return ActionParam.class;
        }

        private final String _description;
        private final String _groupTag;
        private final String _id;
        private final HttpMethod _method;
        private final String _name;
        private final String _payload;
        private final Uri _url;
        private final ActionParamKey key;

        private Map<Class<? extends Augmentation<ActionParam>>, Augmentation<ActionParam>> augmentation = Collections.emptyMap();

        private ActionParamImpl(ActionParamBuilder base) {
            if (base.key() == null) {
                this.key = new ActionParamKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this.key = base.key();
                this._id = key.getId();
            }
            this._description = base.getDescription();
            this._groupTag = base.getGroupTag();
            this._method = base.getMethod();
            this._name = base.getName();
            this._payload = base.getPayload();
            this._url = base.getUrl();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public ActionParamKey key() {
            return key;
        }
        
        @Override
        public String getDescription() {
            return _description;
        }
        
        @Override
        public String getGroupTag() {
            return _groupTag;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public HttpMethod getMethod() {
            return _method;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @Override
        public String getPayload() {
            return _payload;
        }
        
        @Override
        public Uri getUrl() {
            return _url;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ActionParam>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_groupTag);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_method);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_payload);
            result = prime * result + Objects.hashCode(_url);
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
            if (!ActionParam.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ActionParam other = (ActionParam)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_groupTag, other.getGroupTag())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_method, other.getMethod())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_payload, other.getPayload())) {
                return false;
            }
            if (!Objects.equals(_url, other.getUrl())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ActionParamImpl otherImpl = (ActionParamImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ActionParam>>, Augmentation<ActionParam>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ActionParam");
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_groupTag", _groupTag);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_method", _method);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_payload", _payload);
            CodeHelpers.appendValue(helper, "_url", _url);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
