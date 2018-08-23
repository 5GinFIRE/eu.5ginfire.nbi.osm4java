package ns.yang.nfvo.mano.types.rev170208.cloud.config;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;

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
 * Class that builds {@link KeyPair} instances.
 * 
 * @see KeyPair
 *
 */
public class KeyPairBuilder implements Builder<KeyPair> {

	private String _key;
	private String _name;
	private KeyPairKey key;

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("key-pair");

	Map<Class<? extends Augmentation<KeyPair>>, Augmentation<KeyPair>> augmentation = Collections.emptyMap();

	public KeyPairBuilder() {
	}

	public KeyPairBuilder(KeyPair base) {
		if (base.key() == null) {
			this.key = new KeyPairKey(base.getName());
			this._name = base.getName();
		} else {
			this.key = base.key();
			this._name = key.getName();
		}
		this._key = base.getKey();
		if (base instanceof KeyPairImpl) {
			KeyPairImpl impl = (KeyPairImpl) base;
			if (!impl.augmentation.isEmpty()) {
				this.augmentation = new HashMap<>(impl.augmentation);
			}
		} else if (base instanceof AugmentationHolder) {
			@SuppressWarnings("unchecked")
			AugmentationHolder<KeyPair> casted = (AugmentationHolder<KeyPair>) base;
			if (!casted.augmentations().isEmpty()) {
				this.augmentation = new HashMap<>(casted.augmentations());
			}
		}
	}

	public KeyPairKey key() {
		return key;
	}

	public String getKey() {
		return _key;
	}

	public String getName() {
		return _name;
	}

	@SuppressWarnings("unchecked")
	public <E extends Augmentation<KeyPair>> E augmentation(Class<E> augmentationType) {
		return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
	}

	public KeyPairBuilder withKey(final KeyPairKey key) {
		this.key = key;
		return this;
	}

	public KeyPairBuilder setKey(final String value) {
		this._key = value;
		return this;
	}

	public KeyPairBuilder setName(final String value) {
		this._name = value;
		return this;
	}

	public KeyPairBuilder addAugmentation(Class<? extends Augmentation<KeyPair>> augmentationType,
			Augmentation<KeyPair> augmentationValue) {
		if (augmentationValue == null) {
			return removeAugmentation(augmentationType);
		}

		if (!(this.augmentation instanceof HashMap)) {
			this.augmentation = new HashMap<>();
		}

		this.augmentation.put(augmentationType, augmentationValue);
		return this;
	}

	public KeyPairBuilder removeAugmentation(Class<? extends Augmentation<KeyPair>> augmentationType) {
		if (this.augmentation instanceof HashMap) {
			this.augmentation.remove(augmentationType);
		}
		return this;
	}

	@Override
	public KeyPair build() {
		return new KeyPairImpl(this);
	}

	private static final class KeyPairImpl implements KeyPair {

		@Override
		public Class<KeyPair> getImplementedInterface() {
			return KeyPair.class;
		}

		private final String _key;
		private final String _name;
		private final KeyPairKey key;

		private Map<Class<? extends Augmentation<KeyPair>>, Augmentation<KeyPair>> augmentation = Collections
				.emptyMap();

		private KeyPairImpl(KeyPairBuilder base) {
			if (base.key() == null) {
				this.key = new KeyPairKey(base.getName());
				this._name = base.getName();
			} else {
				this.key = base.key();
				this._name = key.getName();
			}
			this._key = base.getKey();
			this.augmentation = ImmutableMap.copyOf(base.augmentation);
		}

		@Override
		public KeyPairKey key() {
			return key;
		}

		@Override
		public String getKey() {
			return _key;
		}

		@Override
		public String getName() {
			return _name;
		}

		@SuppressWarnings("unchecked")
		@Override
		public <E extends Augmentation<KeyPair>> E augmentation(Class<E> augmentationType) {
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
			result = prime * result + Objects.hashCode(_key);
			result = prime * result + Objects.hashCode(_name);
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
			if (!KeyPair.class.equals(((DataObject) obj).getImplementedInterface())) {
				return false;
			}
			KeyPair other = (KeyPair) obj;
			if (!Objects.equals(_key, other.getKey())) {
				return false;
			}
			if (!Objects.equals(_name, other.getName())) {
				return false;
			}
			if (getClass() == obj.getClass()) {
				// Simple case: we are comparing against self
				KeyPairImpl otherImpl = (KeyPairImpl) obj;
				if (!Objects.equals(augmentation, otherImpl.augmentation)) {
					return false;
				}
			} else {
				// Hard case: compare our augments with presence there...
				for (Map.Entry<Class<? extends Augmentation<KeyPair>>, Augmentation<KeyPair>> e : augmentation
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
			final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("KeyPair");
			CodeHelpers.appendValue(helper, "_key", _key);
			CodeHelpers.appendValue(helper, "_name", _name);
			CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
			return helper.toString();
		}
	}

}
