package ns.yang.nfvo.nsr.rev170208.project;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr;

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
 * Class that builds {@link NsInstanceOpdata} instances.
 * 
 * @see NsInstanceOpdata
 *
 */
public class NsInstanceOpdataBuilder implements Builder<NsInstanceOpdata> {

	private List<Nsr> _nsr;

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ns-instance-opdata");

	Map<Class<? extends Augmentation<NsInstanceOpdata>>, Augmentation<NsInstanceOpdata>> augmentation = Collections
			.emptyMap();

	public NsInstanceOpdataBuilder() {
	}

	public NsInstanceOpdataBuilder(NsInstanceOpdata base) {
		this._nsr = base.getNsr();
		if (base instanceof NsInstanceOpdataImpl) {
			NsInstanceOpdataImpl impl = (NsInstanceOpdataImpl) base;
			if (!impl.augmentation.isEmpty()) {
				this.augmentation = new HashMap<>(impl.augmentation);
			}
		} else if (base instanceof AugmentationHolder) {
			@SuppressWarnings("unchecked")
			AugmentationHolder<NsInstanceOpdata> casted = (AugmentationHolder<NsInstanceOpdata>) base;
			if (!casted.augmentations().isEmpty()) {
				this.augmentation = new HashMap<>(casted.augmentations());
			}
		}
	}

	public List<Nsr> getNsr() {
		return _nsr;
	}

	@SuppressWarnings("unchecked")
	public <E extends Augmentation<NsInstanceOpdata>> E augmentation(Class<E> augmentationType) {
		return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
	}

	public NsInstanceOpdataBuilder setNsr(final List<Nsr> values) {
		this._nsr = values;
		return this;
	}

	public NsInstanceOpdataBuilder addAugmentation(Class<? extends Augmentation<NsInstanceOpdata>> augmentationType,
			Augmentation<NsInstanceOpdata> augmentationValue) {
		if (augmentationValue == null) {
			return removeAugmentation(augmentationType);
		}

		if (!(this.augmentation instanceof HashMap)) {
			this.augmentation = new HashMap<>();
		}

		this.augmentation.put(augmentationType, augmentationValue);
		return this;
	}

	public NsInstanceOpdataBuilder removeAugmentation(
			Class<? extends Augmentation<NsInstanceOpdata>> augmentationType) {
		if (this.augmentation instanceof HashMap) {
			this.augmentation.remove(augmentationType);
		}
		return this;
	}

	@Override
	public NsInstanceOpdata build() {
		return new NsInstanceOpdataImpl(this);
	}

	private static final class NsInstanceOpdataImpl implements NsInstanceOpdata {

		@Override
		public Class<NsInstanceOpdata> getImplementedInterface() {
			return NsInstanceOpdata.class;
		}

		private final List<Nsr> _nsr;

		private Map<Class<? extends Augmentation<NsInstanceOpdata>>, Augmentation<NsInstanceOpdata>> augmentation = Collections
				.emptyMap();

		private NsInstanceOpdataImpl(NsInstanceOpdataBuilder base) {
			this._nsr = base.getNsr();
			this.augmentation = ImmutableMap.copyOf(base.augmentation);
		}

		@Override
		public List<Nsr> getNsr() {
			return _nsr;
		}

		@SuppressWarnings("unchecked")
		@Override
		public <E extends Augmentation<NsInstanceOpdata>> E augmentation(Class<E> augmentationType) {
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
			result = prime * result + Objects.hashCode(_nsr);
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
			if (!NsInstanceOpdata.class.equals(((DataObject) obj).getImplementedInterface())) {
				return false;
			}
			NsInstanceOpdata other = (NsInstanceOpdata) obj;
			if (!Objects.equals(_nsr, other.getNsr())) {
				return false;
			}
			if (getClass() == obj.getClass()) {
				// Simple case: we are comparing against self
				NsInstanceOpdataImpl otherImpl = (NsInstanceOpdataImpl) obj;
				if (!Objects.equals(augmentation, otherImpl.augmentation)) {
					return false;
				}
			} else {
				// Hard case: compare our augments with presence there...
				for (Map.Entry<Class<? extends Augmentation<NsInstanceOpdata>>, Augmentation<NsInstanceOpdata>> e : augmentation
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
			final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("NsInstanceOpdata");
			CodeHelpers.appendValue(helper, "_nsr", _nsr);
			CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
			return helper.toString();
		}
	}

}
