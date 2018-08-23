package ns.yang.nfvo.vnfr.rev170228.virtual._interface;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Range;

import ns.yang.nfvo.vnfr.rev170228.$YangModuleInfoImpl;

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
 * Class that builds {@link VirtualInterface} instances.
 * 
 * @see VirtualInterface
 *
 */
public class VirtualInterfaceBuilder implements Builder<VirtualInterface> {

	private BigInteger _bandwidth;
	private String _datapathLibrary;
	private VirtualInterface.OvsOffload _ovsOffload;
	private String _providerNetworkName;
	private VirtualInterface.Type _type;
	private String _vendorId;

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("virtual-interface");

	Map<Class<? extends Augmentation<VirtualInterface>>, Augmentation<VirtualInterface>> augmentation = Collections
			.emptyMap();

	public VirtualInterfaceBuilder() {
	}

	public VirtualInterfaceBuilder(VirtualInterface base) {
		this._bandwidth = base.getBandwidth();
		this._datapathLibrary = base.getDatapathLibrary();
		this._ovsOffload = base.getOvsOffload();
		this._providerNetworkName = base.getProviderNetworkName();
		this._type = base.getType();
		this._vendorId = base.getVendorId();
		if (base instanceof VirtualInterfaceImpl) {
			VirtualInterfaceImpl impl = (VirtualInterfaceImpl) base;
			if (!impl.augmentation.isEmpty()) {
				this.augmentation = new HashMap<>(impl.augmentation);
			}
		} else if (base instanceof AugmentationHolder) {
			@SuppressWarnings("unchecked")
			AugmentationHolder<VirtualInterface> casted = (AugmentationHolder<VirtualInterface>) base;
			if (!casted.augmentations().isEmpty()) {
				this.augmentation = new HashMap<>(casted.augmentations());
			}
		}
	}

	public BigInteger getBandwidth() {
		return _bandwidth;
	}

	public String getDatapathLibrary() {
		return _datapathLibrary;
	}

	public VirtualInterface.OvsOffload getOvsOffload() {
		return _ovsOffload;
	}

	public String getProviderNetworkName() {
		return _providerNetworkName;
	}

	public VirtualInterface.Type getType() {
		return _type;
	}

	public String getVendorId() {
		return _vendorId;
	}

	@SuppressWarnings("unchecked")
	public <E extends Augmentation<VirtualInterface>> E augmentation(Class<E> augmentationType) {
		return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
	}

	private static final Range<java.math.BigInteger>[] CHECKBANDWIDTHRANGE_RANGES;
	static {
		@SuppressWarnings("unchecked")
		final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
		a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
		CHECKBANDWIDTHRANGE_RANGES = a;
	}

	private static void checkBandwidthRange(final java.math.BigInteger value) {
		for (Range<java.math.BigInteger> r : CHECKBANDWIDTHRANGE_RANGES) {
			if (r.contains(value)) {
				return;
			}
		}
		CodeHelpers.throwInvalidRange(CHECKBANDWIDTHRANGE_RANGES, value);
	}

	public VirtualInterfaceBuilder setBandwidth(final BigInteger value) {
		if (value != null) {
			checkBandwidthRange(value);

		}
		this._bandwidth = value;
		return this;
	}

	public VirtualInterfaceBuilder setDatapathLibrary(final String value) {
		this._datapathLibrary = value;
		return this;
	}

	public VirtualInterfaceBuilder setOvsOffload(final VirtualInterface.OvsOffload value) {
		this._ovsOffload = value;
		return this;
	}

	public VirtualInterfaceBuilder setProviderNetworkName(final String value) {
		this._providerNetworkName = value;
		return this;
	}

	public VirtualInterfaceBuilder setType(final VirtualInterface.Type value) {
		this._type = value;
		return this;
	}

	public VirtualInterfaceBuilder setVendorId(final String value) {
		this._vendorId = value;
		return this;
	}

	public VirtualInterfaceBuilder addAugmentation(Class<? extends Augmentation<VirtualInterface>> augmentationType,
			Augmentation<VirtualInterface> augmentationValue) {
		if (augmentationValue == null) {
			return removeAugmentation(augmentationType);
		}

		if (!(this.augmentation instanceof HashMap)) {
			this.augmentation = new HashMap<>();
		}

		this.augmentation.put(augmentationType, augmentationValue);
		return this;
	}

	public VirtualInterfaceBuilder removeAugmentation(
			Class<? extends Augmentation<VirtualInterface>> augmentationType) {
		if (this.augmentation instanceof HashMap) {
			this.augmentation.remove(augmentationType);
		}
		return this;
	}

	@Override
	public VirtualInterface build() {
		return new VirtualInterfaceImpl(this);
	}

	private static final class VirtualInterfaceImpl implements VirtualInterface {

		@Override
		public Class<VirtualInterface> getImplementedInterface() {
			return VirtualInterface.class;
		}

		private final BigInteger _bandwidth;
		private final String _datapathLibrary;
		private final VirtualInterface.OvsOffload _ovsOffload;
		private final String _providerNetworkName;
		private final VirtualInterface.Type _type;
		private final String _vendorId;

		private Map<Class<? extends Augmentation<VirtualInterface>>, Augmentation<VirtualInterface>> augmentation = Collections
				.emptyMap();

		private VirtualInterfaceImpl(VirtualInterfaceBuilder base) {
			this._bandwidth = base.getBandwidth();
			this._datapathLibrary = base.getDatapathLibrary();
			this._ovsOffload = base.getOvsOffload();
			this._providerNetworkName = base.getProviderNetworkName();
			this._type = base.getType();
			this._vendorId = base.getVendorId();
			this.augmentation = ImmutableMap.copyOf(base.augmentation);
		}

		@Override
		public BigInteger getBandwidth() {
			return _bandwidth;
		}

		@Override
		public String getDatapathLibrary() {
			return _datapathLibrary;
		}

		@Override
		public VirtualInterface.OvsOffload getOvsOffload() {
			return _ovsOffload;
		}

		@Override
		public String getProviderNetworkName() {
			return _providerNetworkName;
		}

		@Override
		public VirtualInterface.Type getType() {
			return _type;
		}

		@Override
		public String getVendorId() {
			return _vendorId;
		}

		@SuppressWarnings("unchecked")
		@Override
		public <E extends Augmentation<VirtualInterface>> E augmentation(Class<E> augmentationType) {
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
			result = prime * result + Objects.hashCode(_bandwidth);
			result = prime * result + Objects.hashCode(_datapathLibrary);
			result = prime * result + Objects.hashCode(_ovsOffload);
			result = prime * result + Objects.hashCode(_providerNetworkName);
			result = prime * result + Objects.hashCode(_type);
			result = prime * result + Objects.hashCode(_vendorId);
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
			if (!VirtualInterface.class.equals(((DataObject) obj).getImplementedInterface())) {
				return false;
			}
			VirtualInterface other = (VirtualInterface) obj;
			if (!Objects.equals(_bandwidth, other.getBandwidth())) {
				return false;
			}
			if (!Objects.equals(_datapathLibrary, other.getDatapathLibrary())) {
				return false;
			}
			if (!Objects.equals(_ovsOffload, other.getOvsOffload())) {
				return false;
			}
			if (!Objects.equals(_providerNetworkName, other.getProviderNetworkName())) {
				return false;
			}
			if (!Objects.equals(_type, other.getType())) {
				return false;
			}
			if (!Objects.equals(_vendorId, other.getVendorId())) {
				return false;
			}
			if (getClass() == obj.getClass()) {
				// Simple case: we are comparing against self
				VirtualInterfaceImpl otherImpl = (VirtualInterfaceImpl) obj;
				if (!Objects.equals(augmentation, otherImpl.augmentation)) {
					return false;
				}
			} else {
				// Hard case: compare our augments with presence there...
				for (Map.Entry<Class<? extends Augmentation<VirtualInterface>>, Augmentation<VirtualInterface>> e : augmentation
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
			final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VirtualInterface");
			CodeHelpers.appendValue(helper, "_bandwidth", _bandwidth);
			CodeHelpers.appendValue(helper, "_datapathLibrary", _datapathLibrary);
			CodeHelpers.appendValue(helper, "_ovsOffload", _ovsOffload);
			CodeHelpers.appendValue(helper, "_providerNetworkName", _providerNetworkName);
			CodeHelpers.appendValue(helper, "_type", _type);
			CodeHelpers.appendValue(helper, "_vendorId", _vendorId);
			CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
			return helper.toString();
		}
	}

}
