package yang.vnfd.vnfd.descriptor.mgmt._interface.endpoint.type;

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
 * Class that builds {@link VduId} instances.
 * 
 * @see VduId
 *
 */
public class VduIdBuilder implements Builder<VduId> {

	private String _vduId;

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vdu-id");

	Map<Class<? extends Augmentation<VduId>>, Augmentation<VduId>> augmentation = Collections.emptyMap();

	public VduIdBuilder() {
	}

	public VduIdBuilder(VduId base) {
		this._vduId = base.getVduId();
		if (base instanceof VduIdImpl) {
			VduIdImpl impl = (VduIdImpl) base;
			if (!impl.augmentation.isEmpty()) {
				this.augmentation = new HashMap<>(impl.augmentation);
			}
		} else if (base instanceof AugmentationHolder) {
			@SuppressWarnings("unchecked")
			AugmentationHolder<VduId> casted = (AugmentationHolder<VduId>) base;
			if (!casted.augmentations().isEmpty()) {
				this.augmentation = new HashMap<>(casted.augmentations());
			}
		}
	}

	public String getVduId() {
		return _vduId;
	}

	@SuppressWarnings("unchecked")
	public <E extends Augmentation<VduId>> E augmentation(Class<E> augmentationType) {
		return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
	}

	public VduIdBuilder setVduId(final String value) {
		this._vduId = value;
		return this;
	}

	public VduIdBuilder addAugmentation(Class<? extends Augmentation<VduId>> augmentationType,
			Augmentation<VduId> augmentationValue) {
		if (augmentationValue == null) {
			return removeAugmentation(augmentationType);
		}

		if (!(this.augmentation instanceof HashMap)) {
			this.augmentation = new HashMap<>();
		}

		this.augmentation.put(augmentationType, augmentationValue);
		return this;
	}

	public VduIdBuilder removeAugmentation(Class<? extends Augmentation<VduId>> augmentationType) {
		if (this.augmentation instanceof HashMap) {
			this.augmentation.remove(augmentationType);
		}
		return this;
	}

	@Override
	public VduId build() {
		return new VduIdImpl(this);
	}

	private static final class VduIdImpl implements VduId {

		@Override
		public Class<VduId> getImplementedInterface() {
			return VduId.class;
		}

		private final String _vduId;

		private Map<Class<? extends Augmentation<VduId>>, Augmentation<VduId>> augmentation = Collections.emptyMap();

		private VduIdImpl(VduIdBuilder base) {
			this._vduId = base.getVduId();
			this.augmentation = ImmutableMap.copyOf(base.augmentation);
		}

		@Override
		public String getVduId() {
			return _vduId;
		}

		@SuppressWarnings("unchecked")
		@Override
		public <E extends Augmentation<VduId>> E augmentation(Class<E> augmentationType) {
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
			result = prime * result + Objects.hashCode(_vduId);
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
			if (!VduId.class.equals(((DataObject) obj).getImplementedInterface())) {
				return false;
			}
			VduId other = (VduId) obj;
			if (!Objects.equals(_vduId, other.getVduId())) {
				return false;
			}
			if (getClass() == obj.getClass()) {
				// Simple case: we are comparing against self
				VduIdImpl otherImpl = (VduIdImpl) obj;
				if (!Objects.equals(augmentation, otherImpl.augmentation)) {
					return false;
				}
			} else {
				// Hard case: compare our augments with presence there...
				for (Map.Entry<Class<? extends Augmentation<VduId>>, Augmentation<VduId>> e : augmentation.entrySet()) {
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
			final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VduId");
			CodeHelpers.appendValue(helper, "_vduId", _vduId);
			CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
			return helper.toString();
		}
	}

}
