package yang.base.nsd.descriptor.common.vnffgd;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import yang.base.$YangModuleInfoImpl;
import yang.base.nsd.descriptor.common.vnffgd.rsp.VnfdConnectionPointRef;

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
 * Class that builds {@link Rsp} instances.
 * 
 * @see Rsp
 *
 */
public class RspBuilder implements Builder<Rsp> {

	private String _id;
	private String _name;
	private List<VnfdConnectionPointRef> _vnfdConnectionPointRef;
	private RspKey key;

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("rsp");

	Map<Class<? extends Augmentation<Rsp>>, Augmentation<Rsp>> augmentation = Collections.emptyMap();

	public RspBuilder() {
	}

	public RspBuilder(Rsp base) {
		if (base.key() == null) {
			this.key = new RspKey(base.getId());
			this._id = base.getId();
		} else {
			this.key = base.key();
			this._id = key.getId();
		}
		this._name = base.getName();
		this._vnfdConnectionPointRef = base.getVnfdConnectionPointRef();
		if (base instanceof RspImpl) {
			RspImpl impl = (RspImpl) base;
			if (!impl.augmentation.isEmpty()) {
				this.augmentation = new HashMap<>(impl.augmentation);
			}
		} else if (base instanceof AugmentationHolder) {
			@SuppressWarnings("unchecked")
			AugmentationHolder<Rsp> casted = (AugmentationHolder<Rsp>) base;
			if (!casted.augmentations().isEmpty()) {
				this.augmentation = new HashMap<>(casted.augmentations());
			}
		}
	}

	public RspKey key() {
		return key;
	}

	public String getId() {
		return _id;
	}

	public String getName() {
		return _name;
	}

	public List<VnfdConnectionPointRef> getVnfdConnectionPointRef() {
		return _vnfdConnectionPointRef;
	}

	@SuppressWarnings("unchecked")
	public <E extends Augmentation<Rsp>> E augmentation(Class<E> augmentationType) {
		return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
	}

	public RspBuilder withKey(final RspKey key) {
		this.key = key;
		return this;
	}

	public RspBuilder setId(final String value) {
		this._id = value;
		return this;
	}

	public RspBuilder setName(final String value) {
		this._name = value;
		return this;
	}

	public RspBuilder setVnfdConnectionPointRef(final List<VnfdConnectionPointRef> values) {
		this._vnfdConnectionPointRef = values;
		return this;
	}

	public RspBuilder addAugmentation(Class<? extends Augmentation<Rsp>> augmentationType,
			Augmentation<Rsp> augmentationValue) {
		if (augmentationValue == null) {
			return removeAugmentation(augmentationType);
		}

		if (!(this.augmentation instanceof HashMap)) {
			this.augmentation = new HashMap<>();
		}

		this.augmentation.put(augmentationType, augmentationValue);
		return this;
	}

	public RspBuilder removeAugmentation(Class<? extends Augmentation<Rsp>> augmentationType) {
		if (this.augmentation instanceof HashMap) {
			this.augmentation.remove(augmentationType);
		}
		return this;
	}

	@Override
	public Rsp build() {
		return new RspImpl(this);
	}

	private static final class RspImpl implements Rsp {

		@Override
		public Class<Rsp> getImplementedInterface() {
			return Rsp.class;
		}

		private final String _id;
		private final String _name;
		private final List<VnfdConnectionPointRef> _vnfdConnectionPointRef;
		private final RspKey key;

		private Map<Class<? extends Augmentation<Rsp>>, Augmentation<Rsp>> augmentation = Collections.emptyMap();

		private RspImpl(RspBuilder base) {
			if (base.key() == null) {
				this.key = new RspKey(base.getId());
				this._id = base.getId();
			} else {
				this.key = base.key();
				this._id = key.getId();
			}
			this._name = base.getName();
			this._vnfdConnectionPointRef = base.getVnfdConnectionPointRef();
			this.augmentation = ImmutableMap.copyOf(base.augmentation);
		}

		@Override
		public RspKey key() {
			return key;
		}

		@Override
		public String getId() {
			return _id;
		}

		@Override
		public String getName() {
			return _name;
		}

		@Override
		public List<VnfdConnectionPointRef> getVnfdConnectionPointRef() {
			return _vnfdConnectionPointRef;
		}

		@SuppressWarnings("unchecked")
		@Override
		public <E extends Augmentation<Rsp>> E augmentation(Class<E> augmentationType) {
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
			result = prime * result + Objects.hashCode(_id);
			result = prime * result + Objects.hashCode(_name);
			result = prime * result + Objects.hashCode(_vnfdConnectionPointRef);
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
			if (!Rsp.class.equals(((DataObject) obj).getImplementedInterface())) {
				return false;
			}
			Rsp other = (Rsp) obj;
			if (!Objects.equals(_id, other.getId())) {
				return false;
			}
			if (!Objects.equals(_name, other.getName())) {
				return false;
			}
			if (!Objects.equals(_vnfdConnectionPointRef, other.getVnfdConnectionPointRef())) {
				return false;
			}
			if (getClass() == obj.getClass()) {
				// Simple case: we are comparing against self
				RspImpl otherImpl = (RspImpl) obj;
				if (!Objects.equals(augmentation, otherImpl.augmentation)) {
					return false;
				}
			} else {
				// Hard case: compare our augments with presence there...
				for (Map.Entry<Class<? extends Augmentation<Rsp>>, Augmentation<Rsp>> e : augmentation.entrySet()) {
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
			final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Rsp");
			CodeHelpers.appendValue(helper, "_id", _id);
			CodeHelpers.appendValue(helper, "_name", _name);
			CodeHelpers.appendValue(helper, "_vnfdConnectionPointRef", _vnfdConnectionPointRef);
			CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
			return helper.toString();
		}
	}

}
