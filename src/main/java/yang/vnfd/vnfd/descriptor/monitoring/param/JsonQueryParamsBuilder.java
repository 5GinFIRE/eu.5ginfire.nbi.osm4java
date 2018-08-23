package yang.vnfd.vnfd.descriptor.monitoring.param;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import yang.vnfd.$YangModuleInfoImpl;

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
 * Class that builds {@link JsonQueryParams} instances.
 * 
 * @see JsonQueryParams
 *
 */
public class JsonQueryParamsBuilder implements Builder<JsonQueryParams> {

	private String _jsonPath;
	private String _objectPath;

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("json-query-params");

	Map<Class<? extends Augmentation<JsonQueryParams>>, Augmentation<JsonQueryParams>> augmentation = Collections
			.emptyMap();

	public JsonQueryParamsBuilder() {
	}

	public JsonQueryParamsBuilder(JsonQueryParams base) {
		this._jsonPath = base.getJsonPath();
		this._objectPath = base.getObjectPath();
		if (base instanceof JsonQueryParamsImpl) {
			JsonQueryParamsImpl impl = (JsonQueryParamsImpl) base;
			if (!impl.augmentation.isEmpty()) {
				this.augmentation = new HashMap<>(impl.augmentation);
			}
		} else if (base instanceof AugmentationHolder) {
			@SuppressWarnings("unchecked")
			AugmentationHolder<JsonQueryParams> casted = (AugmentationHolder<JsonQueryParams>) base;
			if (!casted.augmentations().isEmpty()) {
				this.augmentation = new HashMap<>(casted.augmentations());
			}
		}
	}

	public String getJsonPath() {
		return _jsonPath;
	}

	public String getObjectPath() {
		return _objectPath;
	}

	@SuppressWarnings("unchecked")
	public <E extends Augmentation<JsonQueryParams>> E augmentation(Class<E> augmentationType) {
		return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
	}

	public JsonQueryParamsBuilder setJsonPath(final String value) {
		this._jsonPath = value;
		return this;
	}

	public JsonQueryParamsBuilder setObjectPath(final String value) {
		this._objectPath = value;
		return this;
	}

	public JsonQueryParamsBuilder addAugmentation(Class<? extends Augmentation<JsonQueryParams>> augmentationType,
			Augmentation<JsonQueryParams> augmentationValue) {
		if (augmentationValue == null) {
			return removeAugmentation(augmentationType);
		}

		if (!(this.augmentation instanceof HashMap)) {
			this.augmentation = new HashMap<>();
		}

		this.augmentation.put(augmentationType, augmentationValue);
		return this;
	}

	public JsonQueryParamsBuilder removeAugmentation(Class<? extends Augmentation<JsonQueryParams>> augmentationType) {
		if (this.augmentation instanceof HashMap) {
			this.augmentation.remove(augmentationType);
		}
		return this;
	}

	@Override
	public JsonQueryParams build() {
		return new JsonQueryParamsImpl(this);
	}

	private static final class JsonQueryParamsImpl implements JsonQueryParams {

		@Override
		public Class<JsonQueryParams> getImplementedInterface() {
			return JsonQueryParams.class;
		}

		private final String _jsonPath;
		private final String _objectPath;

		private Map<Class<? extends Augmentation<JsonQueryParams>>, Augmentation<JsonQueryParams>> augmentation = Collections
				.emptyMap();

		private JsonQueryParamsImpl(JsonQueryParamsBuilder base) {
			this._jsonPath = base.getJsonPath();
			this._objectPath = base.getObjectPath();
			this.augmentation = ImmutableMap.copyOf(base.augmentation);
		}

		@Override
		public String getJsonPath() {
			return _jsonPath;
		}

		@Override
		public String getObjectPath() {
			return _objectPath;
		}

		@SuppressWarnings("unchecked")
		@Override
		public <E extends Augmentation<JsonQueryParams>> E augmentation(Class<E> augmentationType) {
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
			result = prime * result + Objects.hashCode(_jsonPath);
			result = prime * result + Objects.hashCode(_objectPath);
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
			if (!JsonQueryParams.class.equals(((DataObject) obj).getImplementedInterface())) {
				return false;
			}
			JsonQueryParams other = (JsonQueryParams) obj;
			if (!Objects.equals(_jsonPath, other.getJsonPath())) {
				return false;
			}
			if (!Objects.equals(_objectPath, other.getObjectPath())) {
				return false;
			}
			if (getClass() == obj.getClass()) {
				// Simple case: we are comparing against self
				JsonQueryParamsImpl otherImpl = (JsonQueryParamsImpl) obj;
				if (!Objects.equals(augmentation, otherImpl.augmentation)) {
					return false;
				}
			} else {
				// Hard case: compare our augments with presence there...
				for (Map.Entry<Class<? extends Augmentation<JsonQueryParams>>, Augmentation<JsonQueryParams>> e : augmentation
						.entrySet()) {
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
			final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("JsonQueryParams");
			CodeHelpers.appendValue(helper, "_jsonPath", _jsonPath);
			CodeHelpers.appendValue(helper, "_objectPath", _objectPath);
			CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
			return helper.toString();
		}
	}

}
