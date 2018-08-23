package ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.yang.types.rev130715.Uuid;
import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr.vlr.VnfrConnectionPointRef;

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
 * Class that builds {@link Vlr} instances.
 * 
 * @see Vlr
 *
 */
public class VlrBuilder implements Builder<Vlr> {

	private Uuid _vlrRef;
	private List<VnfrConnectionPointRef> _vnfrConnectionPointRef;
	private VlrKey key;

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vlr");

	Map<Class<? extends Augmentation<Vlr>>, Augmentation<Vlr>> augmentation = Collections.emptyMap();

	public VlrBuilder() {
	}

	public VlrBuilder(Vlr base) {
		if (base.key() == null) {
			this.key = new VlrKey(base.getVlrRef());
			this._vlrRef = base.getVlrRef();
		} else {
			this.key = base.key();
			this._vlrRef = key.getVlrRef();
		}
		this._vnfrConnectionPointRef = base.getVnfrConnectionPointRef();
		if (base instanceof VlrImpl) {
			VlrImpl impl = (VlrImpl) base;
			if (!impl.augmentation.isEmpty()) {
				this.augmentation = new HashMap<>(impl.augmentation);
			}
		} else if (base instanceof AugmentationHolder) {
			@SuppressWarnings("unchecked")
			AugmentationHolder<Vlr> casted = (AugmentationHolder<Vlr>) base;
			if (!casted.augmentations().isEmpty()) {
				this.augmentation = new HashMap<>(casted.augmentations());
			}
		}
	}

	public VlrKey key() {
		return key;
	}

	public Uuid getVlrRef() {
		return _vlrRef;
	}

	public List<VnfrConnectionPointRef> getVnfrConnectionPointRef() {
		return _vnfrConnectionPointRef;
	}

	@SuppressWarnings("unchecked")
	public <E extends Augmentation<Vlr>> E augmentation(Class<E> augmentationType) {
		return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
	}

	public VlrBuilder withKey(final VlrKey key) {
		this.key = key;
		return this;
	}

	public VlrBuilder setVlrRef(final Uuid value) {
		this._vlrRef = value;
		return this;
	}

	public VlrBuilder setVnfrConnectionPointRef(final List<VnfrConnectionPointRef> values) {
		this._vnfrConnectionPointRef = values;
		return this;
	}

	public VlrBuilder addAugmentation(Class<? extends Augmentation<Vlr>> augmentationType,
			Augmentation<Vlr> augmentationValue) {
		if (augmentationValue == null) {
			return removeAugmentation(augmentationType);
		}

		if (!(this.augmentation instanceof HashMap)) {
			this.augmentation = new HashMap<>();
		}

		this.augmentation.put(augmentationType, augmentationValue);
		return this;
	}

	public VlrBuilder removeAugmentation(Class<? extends Augmentation<Vlr>> augmentationType) {
		if (this.augmentation instanceof HashMap) {
			this.augmentation.remove(augmentationType);
		}
		return this;
	}

	@Override
	public Vlr build() {
		return new VlrImpl(this);
	}

	private static final class VlrImpl implements Vlr {

		@Override
		public Class<Vlr> getImplementedInterface() {
			return Vlr.class;
		}

		private final Uuid _vlrRef;
		private final List<VnfrConnectionPointRef> _vnfrConnectionPointRef;
		private final VlrKey key;

		private Map<Class<? extends Augmentation<Vlr>>, Augmentation<Vlr>> augmentation = Collections.emptyMap();

		private VlrImpl(VlrBuilder base) {
			if (base.key() == null) {
				this.key = new VlrKey(base.getVlrRef());
				this._vlrRef = base.getVlrRef();
			} else {
				this.key = base.key();
				this._vlrRef = key.getVlrRef();
			}
			this._vnfrConnectionPointRef = base.getVnfrConnectionPointRef();
			this.augmentation = ImmutableMap.copyOf(base.augmentation);
		}

		@Override
		public VlrKey key() {
			return key;
		}

		@Override
		public Uuid getVlrRef() {
			return _vlrRef;
		}

		@Override
		public List<VnfrConnectionPointRef> getVnfrConnectionPointRef() {
			return _vnfrConnectionPointRef;
		}

		@SuppressWarnings("unchecked")
		@Override
		public <E extends Augmentation<Vlr>> E augmentation(Class<E> augmentationType) {
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
			result = prime * result + Objects.hashCode(_vlrRef);
			result = prime * result + Objects.hashCode(_vnfrConnectionPointRef);
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
			if (!Vlr.class.equals(((DataObject) obj).getImplementedInterface())) {
				return false;
			}
			Vlr other = (Vlr) obj;
			if (!Objects.equals(_vlrRef, other.getVlrRef())) {
				return false;
			}
			if (!Objects.equals(_vnfrConnectionPointRef, other.getVnfrConnectionPointRef())) {
				return false;
			}
			if (getClass() == obj.getClass()) {
				// Simple case: we are comparing against self
				VlrImpl otherImpl = (VlrImpl) obj;
				if (!Objects.equals(augmentation, otherImpl.augmentation)) {
					return false;
				}
			} else {
				// Hard case: compare our augments with presence there...
				for (Map.Entry<Class<? extends Augmentation<Vlr>>, Augmentation<Vlr>> e : augmentation.entrySet()) {
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
			final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Vlr");
			CodeHelpers.appendValue(helper, "_vlrRef", _vlrRef);
			CodeHelpers.appendValue(helper, "_vnfrConnectionPointRef", _vnfrConnectionPointRef);
			CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
			return helper.toString();
		}
	}

}
