package ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.vlr;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.yang.types.rev130715.Uuid;
import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;

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
 * Class that builds {@link VnfrConnectionPointRef} instances.
 * 
 * @see VnfrConnectionPointRef
 *
 */
public class VnfrConnectionPointRefBuilder implements Builder<VnfrConnectionPointRef> {

	private Object _connectionPoint;
	private Uuid _vnfrId;
	private VnfrConnectionPointRefKey key;

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnfr-connection-point-ref");

	Map<Class<? extends Augmentation<VnfrConnectionPointRef>>, Augmentation<VnfrConnectionPointRef>> augmentation = Collections
			.emptyMap();

	public VnfrConnectionPointRefBuilder() {
	}

	public VnfrConnectionPointRefBuilder(VnfrConnectionPointRef base) {
		if (base.key() == null) {
			this.key = new VnfrConnectionPointRefKey(base.getVnfrId());
			this._vnfrId = base.getVnfrId();
		} else {
			this.key = base.key();
			this._vnfrId = key.getVnfrId();
		}
		this._connectionPoint = base.getConnectionPoint();
		if (base instanceof VnfrConnectionPointRefImpl) {
			VnfrConnectionPointRefImpl impl = (VnfrConnectionPointRefImpl) base;
			if (!impl.augmentation.isEmpty()) {
				this.augmentation = new HashMap<>(impl.augmentation);
			}
		} else if (base instanceof AugmentationHolder) {
			@SuppressWarnings("unchecked")
			AugmentationHolder<VnfrConnectionPointRef> casted = (AugmentationHolder<VnfrConnectionPointRef>) base;
			if (!casted.augmentations().isEmpty()) {
				this.augmentation = new HashMap<>(casted.augmentations());
			}
		}
	}

	public VnfrConnectionPointRefKey key() {
		return key;
	}

	public Object getConnectionPoint() {
		return _connectionPoint;
	}

	public Uuid getVnfrId() {
		return _vnfrId;
	}

	@SuppressWarnings("unchecked")
	public <E extends Augmentation<VnfrConnectionPointRef>> E augmentation(Class<E> augmentationType) {
		return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
	}

	public VnfrConnectionPointRefBuilder withKey(final VnfrConnectionPointRefKey key) {
		this.key = key;
		return this;
	}

	public VnfrConnectionPointRefBuilder setConnectionPoint(final Object value) {
		this._connectionPoint = value;
		return this;
	}

	public VnfrConnectionPointRefBuilder setVnfrId(final Uuid value) {
		this._vnfrId = value;
		return this;
	}

	public VnfrConnectionPointRefBuilder addAugmentation(
			Class<? extends Augmentation<VnfrConnectionPointRef>> augmentationType,
			Augmentation<VnfrConnectionPointRef> augmentationValue) {
		if (augmentationValue == null) {
			return removeAugmentation(augmentationType);
		}

		if (!(this.augmentation instanceof HashMap)) {
			this.augmentation = new HashMap<>();
		}

		this.augmentation.put(augmentationType, augmentationValue);
		return this;
	}

	public VnfrConnectionPointRefBuilder removeAugmentation(
			Class<? extends Augmentation<VnfrConnectionPointRef>> augmentationType) {
		if (this.augmentation instanceof HashMap) {
			this.augmentation.remove(augmentationType);
		}
		return this;
	}

	@Override
	public VnfrConnectionPointRef build() {
		return new VnfrConnectionPointRefImpl(this);
	}

	private static final class VnfrConnectionPointRefImpl implements VnfrConnectionPointRef {

		@Override
		public Class<VnfrConnectionPointRef> getImplementedInterface() {
			return VnfrConnectionPointRef.class;
		}

		private final Object _connectionPoint;
		private final Uuid _vnfrId;
		private final VnfrConnectionPointRefKey key;

		private Map<Class<? extends Augmentation<VnfrConnectionPointRef>>, Augmentation<VnfrConnectionPointRef>> augmentation = Collections
				.emptyMap();

		private VnfrConnectionPointRefImpl(VnfrConnectionPointRefBuilder base) {
			if (base.key() == null) {
				this.key = new VnfrConnectionPointRefKey(base.getVnfrId());
				this._vnfrId = base.getVnfrId();
			} else {
				this.key = base.key();
				this._vnfrId = key.getVnfrId();
			}
			this._connectionPoint = base.getConnectionPoint();
			this.augmentation = ImmutableMap.copyOf(base.augmentation);
		}

		@Override
		public VnfrConnectionPointRefKey key() {
			return key;
		}

		@Override
		public Object getConnectionPoint() {
			return _connectionPoint;
		}

		@Override
		public Uuid getVnfrId() {
			return _vnfrId;
		}

		@SuppressWarnings("unchecked")
		@Override
		public <E extends Augmentation<VnfrConnectionPointRef>> E augmentation(Class<E> augmentationType) {
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
			result = prime * result + Objects.hashCode(_connectionPoint);
			result = prime * result + Objects.hashCode(_vnfrId);
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
			if (!VnfrConnectionPointRef.class.equals(((DataObject) obj).getImplementedInterface())) {
				return false;
			}
			VnfrConnectionPointRef other = (VnfrConnectionPointRef) obj;
			if (!Objects.equals(_connectionPoint, other.getConnectionPoint())) {
				return false;
			}
			if (!Objects.equals(_vnfrId, other.getVnfrId())) {
				return false;
			}
			if (getClass() == obj.getClass()) {
				// Simple case: we are comparing against self
				VnfrConnectionPointRefImpl otherImpl = (VnfrConnectionPointRefImpl) obj;
				if (!Objects.equals(augmentation, otherImpl.augmentation)) {
					return false;
				}
			} else {
				// Hard case: compare our augments with presence there...
				for (Map.Entry<Class<? extends Augmentation<VnfrConnectionPointRef>>, Augmentation<VnfrConnectionPointRef>> e : augmentation
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
			final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VnfrConnectionPointRef");
			CodeHelpers.appendValue(helper, "_connectionPoint", _connectionPoint);
			CodeHelpers.appendValue(helper, "_vnfrId", _vnfrId);
			CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
			return helper.toString();
		}
	}

}
