package ns.yang.nfvo.mano.types.rev170208.control.param;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Range;

import ns.yang.ietf.inet.types.rev100924.Uri;
import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.HttpMethod;
import ns.yang.nfvo.mano.types.rev170208.WidgetType;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.reflect.Array;
import java.math.BigInteger;
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
 * Class that builds {@link ControlParam} instances.
 * 
 * @see ControlParam
 *
 */
public class ControlParamBuilder implements Builder<ControlParam> {

    private BigInteger _currentValue;
    private String _description;
    private String _groupTag;
    private String _id;
    private BigInteger _maxValue;
    private HttpMethod _method;
    private BigInteger _minValue;
    private String _name;
    private String _payload;
    private BigInteger _stepValue;
    private String _units;
    private Uri _url;
    private WidgetType _widgetType;
    private ControlParamKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("control-param");

    Map<Class<? extends Augmentation<ControlParam>>, Augmentation<ControlParam>> augmentation = Collections.emptyMap();

    public ControlParamBuilder() {
    }

    public ControlParamBuilder(ControlParam base) {
        if (base.key() == null) {
            this.key = new ControlParamKey(
                base.getId()
            );
            this._id = base.getId();
        } else {
            this.key = base.key();
            this._id = key.getId();
        }
        this._currentValue = base.getCurrentValue();
        this._description = base.getDescription();
        this._groupTag = base.getGroupTag();
        this._maxValue = base.getMaxValue();
        this._method = base.getMethod();
        this._minValue = base.getMinValue();
        this._name = base.getName();
        this._payload = base.getPayload();
        this._stepValue = base.getStepValue();
        this._units = base.getUnits();
        this._url = base.getUrl();
        this._widgetType = base.getWidgetType();
        if (base instanceof ControlParamImpl) {
            ControlParamImpl impl = (ControlParamImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<ControlParam> casted =(AugmentationHolder<ControlParam>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public ControlParamKey key() {
        return key;
    }
    
    public BigInteger getCurrentValue() {
        return _currentValue;
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
    
    public BigInteger getMaxValue() {
        return _maxValue;
    }
    
    public HttpMethod getMethod() {
        return _method;
    }
    
    public BigInteger getMinValue() {
        return _minValue;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getPayload() {
        return _payload;
    }
    
    public BigInteger getStepValue() {
        return _stepValue;
    }
    
    public String getUnits() {
        return _units;
    }
    
    public Uri getUrl() {
        return _url;
    }
    
    public WidgetType getWidgetType() {
        return _widgetType;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ControlParam>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public ControlParamBuilder withKey(final ControlParamKey key) {
        this.key = key;
        return this;
    }
    private static final Range<java.math.BigInteger>[] CHECKCURRENTVALUERANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
        CHECKCURRENTVALUERANGE_RANGES = a;
    }
    private static void checkCurrentValueRange(final java.math.BigInteger value) {
        for (Range<java.math.BigInteger> r : CHECKCURRENTVALUERANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKCURRENTVALUERANGE_RANGES, value);
    }
    
    public ControlParamBuilder setCurrentValue(final BigInteger value) {
    if (value != null) {
        checkCurrentValueRange(value);
        
    }
        this._currentValue = value;
        return this;
    }
    
    public ControlParamBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    
    public ControlParamBuilder setGroupTag(final String value) {
        this._groupTag = value;
        return this;
    }
    
    public ControlParamBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    private static final Range<java.math.BigInteger>[] CHECKMAXVALUERANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
        CHECKMAXVALUERANGE_RANGES = a;
    }
    private static void checkMaxValueRange(final java.math.BigInteger value) {
        for (Range<java.math.BigInteger> r : CHECKMAXVALUERANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKMAXVALUERANGE_RANGES, value);
    }
    
    public ControlParamBuilder setMaxValue(final BigInteger value) {
    if (value != null) {
        checkMaxValueRange(value);
        
    }
        this._maxValue = value;
        return this;
    }
    
    public ControlParamBuilder setMethod(final HttpMethod value) {
        this._method = value;
        return this;
    }
    private static final Range<java.math.BigInteger>[] CHECKMINVALUERANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
        CHECKMINVALUERANGE_RANGES = a;
    }
    private static void checkMinValueRange(final java.math.BigInteger value) {
        for (Range<java.math.BigInteger> r : CHECKMINVALUERANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKMINVALUERANGE_RANGES, value);
    }
    
    public ControlParamBuilder setMinValue(final BigInteger value) {
    if (value != null) {
        checkMinValueRange(value);
        
    }
        this._minValue = value;
        return this;
    }
    
    public ControlParamBuilder setName(final String value) {
        this._name = value;
        return this;
    }
    
    public ControlParamBuilder setPayload(final String value) {
        this._payload = value;
        return this;
    }
    private static final Range<java.math.BigInteger>[] CHECKSTEPVALUERANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
        CHECKSTEPVALUERANGE_RANGES = a;
    }
    private static void checkStepValueRange(final java.math.BigInteger value) {
        for (Range<java.math.BigInteger> r : CHECKSTEPVALUERANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECKSTEPVALUERANGE_RANGES, value);
    }
    
    public ControlParamBuilder setStepValue(final BigInteger value) {
    if (value != null) {
        checkStepValueRange(value);
        
    }
        this._stepValue = value;
        return this;
    }
    
    public ControlParamBuilder setUnits(final String value) {
        this._units = value;
        return this;
    }
    
    public ControlParamBuilder setUrl(final Uri value) {
        this._url = value;
        return this;
    }
    
    public ControlParamBuilder setWidgetType(final WidgetType value) {
        this._widgetType = value;
        return this;
    }
    
    public ControlParamBuilder addAugmentation(Class<? extends Augmentation<ControlParam>> augmentationType, Augmentation<ControlParam> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ControlParamBuilder removeAugmentation(Class<? extends Augmentation<ControlParam>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ControlParam build() {
        return new ControlParamImpl(this);
    }

    private static final class ControlParamImpl implements ControlParam {

        @Override
        public Class<ControlParam> getImplementedInterface() {
            return ControlParam.class;
        }

        private final BigInteger _currentValue;
        private final String _description;
        private final String _groupTag;
        private final String _id;
        private final BigInteger _maxValue;
        private final HttpMethod _method;
        private final BigInteger _minValue;
        private final String _name;
        private final String _payload;
        private final BigInteger _stepValue;
        private final String _units;
        private final Uri _url;
        private final WidgetType _widgetType;
        private final ControlParamKey key;

        private Map<Class<? extends Augmentation<ControlParam>>, Augmentation<ControlParam>> augmentation = Collections.emptyMap();

        private ControlParamImpl(ControlParamBuilder base) {
            if (base.key() == null) {
                this.key = new ControlParamKey(
                    base.getId()
                );
                this._id = base.getId();
            } else {
                this.key = base.key();
                this._id = key.getId();
            }
            this._currentValue = base.getCurrentValue();
            this._description = base.getDescription();
            this._groupTag = base.getGroupTag();
            this._maxValue = base.getMaxValue();
            this._method = base.getMethod();
            this._minValue = base.getMinValue();
            this._name = base.getName();
            this._payload = base.getPayload();
            this._stepValue = base.getStepValue();
            this._units = base.getUnits();
            this._url = base.getUrl();
            this._widgetType = base.getWidgetType();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public ControlParamKey key() {
            return key;
        }
        
        @Override
        public BigInteger getCurrentValue() {
            return _currentValue;
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
        public BigInteger getMaxValue() {
            return _maxValue;
        }
        
        @Override
        public HttpMethod getMethod() {
            return _method;
        }
        
        @Override
        public BigInteger getMinValue() {
            return _minValue;
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
        public BigInteger getStepValue() {
            return _stepValue;
        }
        
        @Override
        public String getUnits() {
            return _units;
        }
        
        @Override
        public Uri getUrl() {
            return _url;
        }
        
        @Override
        public WidgetType getWidgetType() {
            return _widgetType;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ControlParam>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_currentValue);
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_groupTag);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_maxValue);
            result = prime * result + Objects.hashCode(_method);
            result = prime * result + Objects.hashCode(_minValue);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_payload);
            result = prime * result + Objects.hashCode(_stepValue);
            result = prime * result + Objects.hashCode(_units);
            result = prime * result + Objects.hashCode(_url);
            result = prime * result + Objects.hashCode(_widgetType);
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
            if (!ControlParam.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ControlParam other = (ControlParam)obj;
            if (!Objects.equals(_currentValue, other.getCurrentValue())) {
                return false;
            }
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_groupTag, other.getGroupTag())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_maxValue, other.getMaxValue())) {
                return false;
            }
            if (!Objects.equals(_method, other.getMethod())) {
                return false;
            }
            if (!Objects.equals(_minValue, other.getMinValue())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_payload, other.getPayload())) {
                return false;
            }
            if (!Objects.equals(_stepValue, other.getStepValue())) {
                return false;
            }
            if (!Objects.equals(_units, other.getUnits())) {
                return false;
            }
            if (!Objects.equals(_url, other.getUrl())) {
                return false;
            }
            if (!Objects.equals(_widgetType, other.getWidgetType())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ControlParamImpl otherImpl = (ControlParamImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ControlParam>>, Augmentation<ControlParam>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ControlParam");
            CodeHelpers.appendValue(helper, "_currentValue", _currentValue);
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_groupTag", _groupTag);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_maxValue", _maxValue);
            CodeHelpers.appendValue(helper, "_method", _method);
            CodeHelpers.appendValue(helper, "_minValue", _minValue);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "_payload", _payload);
            CodeHelpers.appendValue(helper, "_stepValue", _stepValue);
            CodeHelpers.appendValue(helper, "_units", _units);
            CodeHelpers.appendValue(helper, "_url", _url);
            CodeHelpers.appendValue(helper, "_widgetType", _widgetType);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
