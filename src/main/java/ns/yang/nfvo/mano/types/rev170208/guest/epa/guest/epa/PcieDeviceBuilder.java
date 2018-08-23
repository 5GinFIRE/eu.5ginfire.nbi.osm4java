package ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Range;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;

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
 * Class that builds {@link PcieDevice} instances.
 * 
 * @see PcieDevice
 *
 */
public class PcieDeviceBuilder implements Builder<PcieDevice> {

	private BigInteger _count;
	private String _deviceId;
	private PcieDeviceKey key;

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("pcie-device");

	Map<Class<? extends Augmentation<PcieDevice>>, Augmentation<PcieDevice>> augmentation = Collections.emptyMap();

	public PcieDeviceBuilder() {
	}

	public PcieDeviceBuilder(PcieDevice base) {
		if (base.key() == null) {
			this.key = new PcieDeviceKey(base.getDeviceId());
			this._deviceId = base.getDeviceId();
		} else {
			this.key = base.key();
			this._deviceId = key.getDeviceId();
		}
		this._count = base.getCount();
		if (base instanceof PcieDeviceImpl) {
			PcieDeviceImpl impl = (PcieDeviceImpl) base;
			if (!impl.augmentation.isEmpty()) {
				this.augmentation = new HashMap<>(impl.augmentation);
			}
		} else if (base instanceof AugmentationHolder) {
			@SuppressWarnings("unchecked")
			AugmentationHolder<PcieDevice> casted = (AugmentationHolder<PcieDevice>) base;
			if (!casted.augmentations().isEmpty()) {
				this.augmentation = new HashMap<>(casted.augmentations());
			}
		}
	}

	public PcieDeviceKey key() {
		return key;
	}

	public BigInteger getCount() {
		return _count;
	}

	public String getDeviceId() {
		return _deviceId;
	}

	@SuppressWarnings("unchecked")
	public <E extends Augmentation<PcieDevice>> E augmentation(Class<E> augmentationType) {
		return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
	}

	public PcieDeviceBuilder withKey(final PcieDeviceKey key) {
		this.key = key;
		return this;
	}

	private static final Range<java.math.BigInteger>[] CHECKCOUNTRANGE_RANGES;
	static {
		@SuppressWarnings("unchecked")
		final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
		a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
		CHECKCOUNTRANGE_RANGES = a;
	}

	private static void checkCountRange(final java.math.BigInteger value) {
		for (Range<java.math.BigInteger> r : CHECKCOUNTRANGE_RANGES) {
			if (r.contains(value)) {
				return;
			}
		}
		CodeHelpers.throwInvalidRange(CHECKCOUNTRANGE_RANGES, value);
	}

	public PcieDeviceBuilder setCount(final BigInteger value) {
		if (value != null) {
			checkCountRange(value);

		}
		this._count = value;
		return this;
	}

	public PcieDeviceBuilder setDeviceId(final String value) {
		this._deviceId = value;
		return this;
	}

	public PcieDeviceBuilder addAugmentation(Class<? extends Augmentation<PcieDevice>> augmentationType,
			Augmentation<PcieDevice> augmentationValue) {
		if (augmentationValue == null) {
			return removeAugmentation(augmentationType);
		}

		if (!(this.augmentation instanceof HashMap)) {
			this.augmentation = new HashMap<>();
		}

		this.augmentation.put(augmentationType, augmentationValue);
		return this;
	}

	public PcieDeviceBuilder removeAugmentation(Class<? extends Augmentation<PcieDevice>> augmentationType) {
		if (this.augmentation instanceof HashMap) {
			this.augmentation.remove(augmentationType);
		}
		return this;
	}

	@Override
	public PcieDevice build() {
		return new PcieDeviceImpl(this);
	}

	private static final class PcieDeviceImpl implements PcieDevice {

		@Override
		public Class<PcieDevice> getImplementedInterface() {
			return PcieDevice.class;
		}

		private final BigInteger _count;
		private final String _deviceId;
		private final PcieDeviceKey key;

		private Map<Class<? extends Augmentation<PcieDevice>>, Augmentation<PcieDevice>> augmentation = Collections
				.emptyMap();

		private PcieDeviceImpl(PcieDeviceBuilder base) {
			if (base.key() == null) {
				this.key = new PcieDeviceKey(base.getDeviceId());
				this._deviceId = base.getDeviceId();
			} else {
				this.key = base.key();
				this._deviceId = key.getDeviceId();
			}
			this._count = base.getCount();
			this.augmentation = ImmutableMap.copyOf(base.augmentation);
		}

		@Override
		public PcieDeviceKey key() {
			return key;
		}

		@Override
		public BigInteger getCount() {
			return _count;
		}

		@Override
		public String getDeviceId() {
			return _deviceId;
		}

		@SuppressWarnings("unchecked")
		@Override
		public <E extends Augmentation<PcieDevice>> E augmentation(Class<E> augmentationType) {
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
			result = prime * result + Objects.hashCode(_count);
			result = prime * result + Objects.hashCode(_deviceId);
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
			if (!PcieDevice.class.equals(((DataObject) obj).getImplementedInterface())) {
				return false;
			}
			PcieDevice other = (PcieDevice) obj;
			if (!Objects.equals(_count, other.getCount())) {
				return false;
			}
			if (!Objects.equals(_deviceId, other.getDeviceId())) {
				return false;
			}
			if (getClass() == obj.getClass()) {
				// Simple case: we are comparing against self
				PcieDeviceImpl otherImpl = (PcieDeviceImpl) obj;
				if (!Objects.equals(augmentation, otherImpl.augmentation)) {
					return false;
				}
			} else {
				// Hard case: compare our augments with presence there...
				for (Map.Entry<Class<? extends Augmentation<PcieDevice>>, Augmentation<PcieDevice>> e : augmentation
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
			final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("PcieDevice");
			CodeHelpers.appendValue(helper, "_count", _count);
			CodeHelpers.appendValue(helper, "_deviceId", _deviceId);
			CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
			return helper.toString();
		}
	}

}
