package ns.yang.nfvo.mano.types.rev170208.host.epa;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Range;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa.CpuFeature;
import ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa.OmCpuFeature;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.reflect.Array;
import java.math.BigInteger;
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
 * Class that builds {@link HostEpa} instances.
 * 
 * @see HostEpa
 *
 */
public class HostEpaBuilder implements Builder<HostEpa> {

	private HostEpa.CpuArch _cpuArch;
	private BigInteger _cpuCoreCount;
	private BigInteger _cpuCoreThreadCount;
	private List<CpuFeature> _cpuFeature;
	private HostEpa.CpuModel _cpuModel;
	private BigInteger _cpuSocketCount;
	private HostEpa.CpuVendor _cpuVendor;
	private List<OmCpuFeature> _omCpuFeature;
	private String _omCpuModelString;

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("host-epa");

	Map<Class<? extends Augmentation<HostEpa>>, Augmentation<HostEpa>> augmentation = Collections.emptyMap();

	public HostEpaBuilder() {
	}

	public HostEpaBuilder(HostEpa base) {
		this._cpuArch = base.getCpuArch();
		this._cpuCoreCount = base.getCpuCoreCount();
		this._cpuCoreThreadCount = base.getCpuCoreThreadCount();
		this._cpuFeature = base.getCpuFeature();
		this._cpuModel = base.getCpuModel();
		this._cpuSocketCount = base.getCpuSocketCount();
		this._cpuVendor = base.getCpuVendor();
		this._omCpuFeature = base.getOmCpuFeature();
		this._omCpuModelString = base.getOmCpuModelString();
		if (base instanceof HostEpaImpl) {
			HostEpaImpl impl = (HostEpaImpl) base;
			if (!impl.augmentation.isEmpty()) {
				this.augmentation = new HashMap<>(impl.augmentation);
			}
		} else if (base instanceof AugmentationHolder) {
			@SuppressWarnings("unchecked")
			AugmentationHolder<HostEpa> casted = (AugmentationHolder<HostEpa>) base;
			if (!casted.augmentations().isEmpty()) {
				this.augmentation = new HashMap<>(casted.augmentations());
			}
		}
	}

	public HostEpa.CpuArch getCpuArch() {
		return _cpuArch;
	}

	public BigInteger getCpuCoreCount() {
		return _cpuCoreCount;
	}

	public BigInteger getCpuCoreThreadCount() {
		return _cpuCoreThreadCount;
	}

	public List<CpuFeature> getCpuFeature() {
		return _cpuFeature;
	}

	public HostEpa.CpuModel getCpuModel() {
		return _cpuModel;
	}

	public BigInteger getCpuSocketCount() {
		return _cpuSocketCount;
	}

	public HostEpa.CpuVendor getCpuVendor() {
		return _cpuVendor;
	}

	public List<OmCpuFeature> getOmCpuFeature() {
		return _omCpuFeature;
	}

	public String getOmCpuModelString() {
		return _omCpuModelString;
	}

	@SuppressWarnings("unchecked")
	public <E extends Augmentation<HostEpa>> E augmentation(Class<E> augmentationType) {
		return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
	}

	public HostEpaBuilder setCpuArch(final HostEpa.CpuArch value) {
		this._cpuArch = value;
		return this;
	}

	private static final Range<java.math.BigInteger>[] CHECKCPUCORECOUNTRANGE_RANGES;
	static {
		@SuppressWarnings("unchecked")
		final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
		a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
		CHECKCPUCORECOUNTRANGE_RANGES = a;
	}

	private static void checkCpuCoreCountRange(final java.math.BigInteger value) {
		for (Range<java.math.BigInteger> r : CHECKCPUCORECOUNTRANGE_RANGES) {
			if (r.contains(value)) {
				return;
			}
		}
		CodeHelpers.throwInvalidRange(CHECKCPUCORECOUNTRANGE_RANGES, value);
	}

	public HostEpaBuilder setCpuCoreCount(final BigInteger value) {
		if (value != null) {
			checkCpuCoreCountRange(value);

		}
		this._cpuCoreCount = value;
		return this;
	}

	private static final Range<java.math.BigInteger>[] CHECKCPUCORETHREADCOUNTRANGE_RANGES;
	static {
		@SuppressWarnings("unchecked")
		final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
		a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
		CHECKCPUCORETHREADCOUNTRANGE_RANGES = a;
	}

	private static void checkCpuCoreThreadCountRange(final java.math.BigInteger value) {
		for (Range<java.math.BigInteger> r : CHECKCPUCORETHREADCOUNTRANGE_RANGES) {
			if (r.contains(value)) {
				return;
			}
		}
		CodeHelpers.throwInvalidRange(CHECKCPUCORETHREADCOUNTRANGE_RANGES, value);
	}

	public HostEpaBuilder setCpuCoreThreadCount(final BigInteger value) {
		if (value != null) {
			checkCpuCoreThreadCountRange(value);

		}
		this._cpuCoreThreadCount = value;
		return this;
	}

	public HostEpaBuilder setCpuFeature(final List<CpuFeature> values) {
		this._cpuFeature = values;
		return this;
	}

	public HostEpaBuilder setCpuModel(final HostEpa.CpuModel value) {
		this._cpuModel = value;
		return this;
	}

	private static final Range<java.math.BigInteger>[] CHECKCPUSOCKETCOUNTRANGE_RANGES;
	static {
		@SuppressWarnings("unchecked")
		final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
		a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
		CHECKCPUSOCKETCOUNTRANGE_RANGES = a;
	}

	private static void checkCpuSocketCountRange(final java.math.BigInteger value) {
		for (Range<java.math.BigInteger> r : CHECKCPUSOCKETCOUNTRANGE_RANGES) {
			if (r.contains(value)) {
				return;
			}
		}
		CodeHelpers.throwInvalidRange(CHECKCPUSOCKETCOUNTRANGE_RANGES, value);
	}

	public HostEpaBuilder setCpuSocketCount(final BigInteger value) {
		if (value != null) {
			checkCpuSocketCountRange(value);

		}
		this._cpuSocketCount = value;
		return this;
	}

	public HostEpaBuilder setCpuVendor(final HostEpa.CpuVendor value) {
		this._cpuVendor = value;
		return this;
	}

	public HostEpaBuilder setOmCpuFeature(final List<OmCpuFeature> values) {
		this._omCpuFeature = values;
		return this;
	}

	public HostEpaBuilder setOmCpuModelString(final String value) {
		this._omCpuModelString = value;
		return this;
	}

	public HostEpaBuilder addAugmentation(Class<? extends Augmentation<HostEpa>> augmentationType,
			Augmentation<HostEpa> augmentationValue) {
		if (augmentationValue == null) {
			return removeAugmentation(augmentationType);
		}

		if (!(this.augmentation instanceof HashMap)) {
			this.augmentation = new HashMap<>();
		}

		this.augmentation.put(augmentationType, augmentationValue);
		return this;
	}

	public HostEpaBuilder removeAugmentation(Class<? extends Augmentation<HostEpa>> augmentationType) {
		if (this.augmentation instanceof HashMap) {
			this.augmentation.remove(augmentationType);
		}
		return this;
	}

	@Override
	public HostEpa build() {
		return new HostEpaImpl(this);
	}

	private static final class HostEpaImpl implements HostEpa {

		@Override
		public Class<HostEpa> getImplementedInterface() {
			return HostEpa.class;
		}

		private final HostEpa.CpuArch _cpuArch;
		private final BigInteger _cpuCoreCount;
		private final BigInteger _cpuCoreThreadCount;
		private final List<CpuFeature> _cpuFeature;
		private final HostEpa.CpuModel _cpuModel;
		private final BigInteger _cpuSocketCount;
		private final HostEpa.CpuVendor _cpuVendor;
		private final List<OmCpuFeature> _omCpuFeature;
		private final String _omCpuModelString;

		private Map<Class<? extends Augmentation<HostEpa>>, Augmentation<HostEpa>> augmentation = Collections
				.emptyMap();

		private HostEpaImpl(HostEpaBuilder base) {
			this._cpuArch = base.getCpuArch();
			this._cpuCoreCount = base.getCpuCoreCount();
			this._cpuCoreThreadCount = base.getCpuCoreThreadCount();
			this._cpuFeature = base.getCpuFeature();
			this._cpuModel = base.getCpuModel();
			this._cpuSocketCount = base.getCpuSocketCount();
			this._cpuVendor = base.getCpuVendor();
			this._omCpuFeature = base.getOmCpuFeature();
			this._omCpuModelString = base.getOmCpuModelString();
			this.augmentation = ImmutableMap.copyOf(base.augmentation);
		}

		@Override
		public HostEpa.CpuArch getCpuArch() {
			return _cpuArch;
		}

		@Override
		public BigInteger getCpuCoreCount() {
			return _cpuCoreCount;
		}

		@Override
		public BigInteger getCpuCoreThreadCount() {
			return _cpuCoreThreadCount;
		}

		@Override
		public List<CpuFeature> getCpuFeature() {
			return _cpuFeature;
		}

		@Override
		public HostEpa.CpuModel getCpuModel() {
			return _cpuModel;
		}

		@Override
		public BigInteger getCpuSocketCount() {
			return _cpuSocketCount;
		}

		@Override
		public HostEpa.CpuVendor getCpuVendor() {
			return _cpuVendor;
		}

		@Override
		public List<OmCpuFeature> getOmCpuFeature() {
			return _omCpuFeature;
		}

		@Override
		public String getOmCpuModelString() {
			return _omCpuModelString;
		}

		@SuppressWarnings("unchecked")
		@Override
		public <E extends Augmentation<HostEpa>> E augmentation(Class<E> augmentationType) {
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
			result = prime * result + Objects.hashCode(_cpuArch);
			result = prime * result + Objects.hashCode(_cpuCoreCount);
			result = prime * result + Objects.hashCode(_cpuCoreThreadCount);
			result = prime * result + Objects.hashCode(_cpuFeature);
			result = prime * result + Objects.hashCode(_cpuModel);
			result = prime * result + Objects.hashCode(_cpuSocketCount);
			result = prime * result + Objects.hashCode(_cpuVendor);
			result = prime * result + Objects.hashCode(_omCpuFeature);
			result = prime * result + Objects.hashCode(_omCpuModelString);
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
			if (!HostEpa.class.equals(((DataObject) obj).getImplementedInterface())) {
				return false;
			}
			HostEpa other = (HostEpa) obj;
			if (!Objects.equals(_cpuArch, other.getCpuArch())) {
				return false;
			}
			if (!Objects.equals(_cpuCoreCount, other.getCpuCoreCount())) {
				return false;
			}
			if (!Objects.equals(_cpuCoreThreadCount, other.getCpuCoreThreadCount())) {
				return false;
			}
			if (!Objects.equals(_cpuFeature, other.getCpuFeature())) {
				return false;
			}
			if (!Objects.equals(_cpuModel, other.getCpuModel())) {
				return false;
			}
			if (!Objects.equals(_cpuSocketCount, other.getCpuSocketCount())) {
				return false;
			}
			if (!Objects.equals(_cpuVendor, other.getCpuVendor())) {
				return false;
			}
			if (!Objects.equals(_omCpuFeature, other.getOmCpuFeature())) {
				return false;
			}
			if (!Objects.equals(_omCpuModelString, other.getOmCpuModelString())) {
				return false;
			}
			if (getClass() == obj.getClass()) {
				// Simple case: we are comparing against self
				HostEpaImpl otherImpl = (HostEpaImpl) obj;
				if (!Objects.equals(augmentation, otherImpl.augmentation)) {
					return false;
				}
			} else {
				// Hard case: compare our augments with presence there...
				for (Map.Entry<Class<? extends Augmentation<HostEpa>>, Augmentation<HostEpa>> e : augmentation
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
			final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("HostEpa");
			CodeHelpers.appendValue(helper, "_cpuArch", _cpuArch);
			CodeHelpers.appendValue(helper, "_cpuCoreCount", _cpuCoreCount);
			CodeHelpers.appendValue(helper, "_cpuCoreThreadCount", _cpuCoreThreadCount);
			CodeHelpers.appendValue(helper, "_cpuFeature", _cpuFeature);
			CodeHelpers.appendValue(helper, "_cpuModel", _cpuModel);
			CodeHelpers.appendValue(helper, "_cpuSocketCount", _cpuSocketCount);
			CodeHelpers.appendValue(helper, "_cpuVendor", _cpuVendor);
			CodeHelpers.appendValue(helper, "_omCpuFeature", _omCpuFeature);
			CodeHelpers.appendValue(helper, "_omCpuModelString", _omCpuModelString);
			CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
			return helper.toString();
		}
	}

}
