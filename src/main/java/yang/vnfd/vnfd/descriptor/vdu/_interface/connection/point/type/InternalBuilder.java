package yang.vnfd.vnfd.descriptor.vdu._interface.connection.point.type;

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
 * Class that builds {@link Internal} instances.
 * 
 * @see Internal
 *
 */
public class InternalBuilder implements Builder<Internal> {

	private String _internalConnectionPointRef;

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("internal");

	Map<Class<? extends Augmentation<Internal>>, Augmentation<Internal>> augmentation = Collections.emptyMap();

	public InternalBuilder() {
	}

	public InternalBuilder(Internal base) {
		this._internalConnectionPointRef = base.getInternalConnectionPointRef();
		if (base instanceof InternalImpl) {
			InternalImpl impl = (InternalImpl) base;
			if (!impl.augmentation.isEmpty()) {
				this.augmentation = new HashMap<>(impl.augmentation);
			}
		} else if (base instanceof AugmentationHolder) {
			@SuppressWarnings("unchecked")
			AugmentationHolder<Internal> casted = (AugmentationHolder<Internal>) base;
			if (!casted.augmentations().isEmpty()) {
				this.augmentation = new HashMap<>(casted.augmentations());
			}
		}
	}

	public String getInternalConnectionPointRef() {
		return _internalConnectionPointRef;
	}

	@SuppressWarnings("unchecked")
	public <E extends Augmentation<Internal>> E augmentation(Class<E> augmentationType) {
		return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
	}

	public InternalBuilder setInternalConnectionPointRef(final String value) {
		this._internalConnectionPointRef = value;
		return this;
	}

	public InternalBuilder addAugmentation(Class<? extends Augmentation<Internal>> augmentationType,
			Augmentation<Internal> augmentationValue) {
		if (augmentationValue == null) {
			return removeAugmentation(augmentationType);
		}

		if (!(this.augmentation instanceof HashMap)) {
			this.augmentation = new HashMap<>();
		}

		this.augmentation.put(augmentationType, augmentationValue);
		return this;
	}

	public InternalBuilder removeAugmentation(Class<? extends Augmentation<Internal>> augmentationType) {
		if (this.augmentation instanceof HashMap) {
			this.augmentation.remove(augmentationType);
		}
		return this;
	}

	@Override
	public Internal build() {
		return new InternalImpl(this);
	}

	private static final class InternalImpl implements Internal {

		@Override
		public Class<Internal> getImplementedInterface() {
			return Internal.class;
		}

		private final String _internalConnectionPointRef;

		private Map<Class<? extends Augmentation<Internal>>, Augmentation<Internal>> augmentation = Collections
				.emptyMap();

		private InternalImpl(InternalBuilder base) {
			this._internalConnectionPointRef = base.getInternalConnectionPointRef();
			this.augmentation = ImmutableMap.copyOf(base.augmentation);
		}

		@Override
		public String getInternalConnectionPointRef() {
			return _internalConnectionPointRef;
		}

		@SuppressWarnings("unchecked")
		@Override
		public <E extends Augmentation<Internal>> E augmentation(Class<E> augmentationType) {
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
			result = prime * result + Objects.hashCode(_internalConnectionPointRef);
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
			if (!Internal.class.equals(((DataObject) obj).getImplementedInterface())) {
				return false;
			}
			Internal other = (Internal) obj;
			if (!Objects.equals(_internalConnectionPointRef, other.getInternalConnectionPointRef())) {
				return false;
			}
			if (getClass() == obj.getClass()) {
				// Simple case: we are comparing against self
				InternalImpl otherImpl = (InternalImpl) obj;
				if (!Objects.equals(augmentation, otherImpl.augmentation)) {
					return false;
				}
			} else {
				// Hard case: compare our augments with presence there...
				for (Map.Entry<Class<? extends Augmentation<Internal>>, Augmentation<Internal>> e : augmentation
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
			final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Internal");
			CodeHelpers.appendValue(helper, "_internalConnectionPointRef", _internalConnectionPointRef);
			CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
			return helper.toString();
		}
	}

}
