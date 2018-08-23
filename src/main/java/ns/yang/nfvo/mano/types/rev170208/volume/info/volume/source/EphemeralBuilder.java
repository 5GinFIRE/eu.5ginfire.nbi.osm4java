package ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;

import java.lang.Boolean;
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
 * Class that builds {@link Ephemeral} instances.
 * 
 * @see Ephemeral
 *
 */
public class EphemeralBuilder implements Builder<Ephemeral> {

	private Boolean _ephemeral;

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ephemeral");

	Map<Class<? extends Augmentation<Ephemeral>>, Augmentation<Ephemeral>> augmentation = Collections.emptyMap();

	public EphemeralBuilder() {
	}

	public EphemeralBuilder(Ephemeral base) {
		this._ephemeral = base.isEphemeral();
		if (base instanceof EphemeralImpl) {
			EphemeralImpl impl = (EphemeralImpl) base;
			if (!impl.augmentation.isEmpty()) {
				this.augmentation = new HashMap<>(impl.augmentation);
			}
		} else if (base instanceof AugmentationHolder) {
			@SuppressWarnings("unchecked")
			AugmentationHolder<Ephemeral> casted = (AugmentationHolder<Ephemeral>) base;
			if (!casted.augmentations().isEmpty()) {
				this.augmentation = new HashMap<>(casted.augmentations());
			}
		}
	}

	public Boolean isEphemeral() {
		return _ephemeral;
	}

	@SuppressWarnings("unchecked")
	public <E extends Augmentation<Ephemeral>> E augmentation(Class<E> augmentationType) {
		return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
	}

	public EphemeralBuilder setEphemeral(final Boolean value) {
		this._ephemeral = value;
		return this;
	}

	public EphemeralBuilder addAugmentation(Class<? extends Augmentation<Ephemeral>> augmentationType,
			Augmentation<Ephemeral> augmentationValue) {
		if (augmentationValue == null) {
			return removeAugmentation(augmentationType);
		}

		if (!(this.augmentation instanceof HashMap)) {
			this.augmentation = new HashMap<>();
		}

		this.augmentation.put(augmentationType, augmentationValue);
		return this;
	}

	public EphemeralBuilder removeAugmentation(Class<? extends Augmentation<Ephemeral>> augmentationType) {
		if (this.augmentation instanceof HashMap) {
			this.augmentation.remove(augmentationType);
		}
		return this;
	}

	@Override
	public Ephemeral build() {
		return new EphemeralImpl(this);
	}

	private static final class EphemeralImpl implements Ephemeral {

		@Override
		public Class<Ephemeral> getImplementedInterface() {
			return Ephemeral.class;
		}

		private final Boolean _ephemeral;

		private Map<Class<? extends Augmentation<Ephemeral>>, Augmentation<Ephemeral>> augmentation = Collections
				.emptyMap();

		private EphemeralImpl(EphemeralBuilder base) {
			this._ephemeral = base.isEphemeral();
			this.augmentation = ImmutableMap.copyOf(base.augmentation);
		}

		@Override
		public Boolean isEphemeral() {
			return _ephemeral;
		}

		@SuppressWarnings("unchecked")
		@Override
		public <E extends Augmentation<Ephemeral>> E augmentation(Class<E> augmentationType) {
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
			result = prime * result + Objects.hashCode(_ephemeral);
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
			if (!Ephemeral.class.equals(((DataObject) obj).getImplementedInterface())) {
				return false;
			}
			Ephemeral other = (Ephemeral) obj;
			if (!Objects.equals(_ephemeral, other.isEphemeral())) {
				return false;
			}
			if (getClass() == obj.getClass()) {
				// Simple case: we are comparing against self
				EphemeralImpl otherImpl = (EphemeralImpl) obj;
				if (!Objects.equals(augmentation, otherImpl.augmentation)) {
					return false;
				}
			} else {
				// Hard case: compare our augments with presence there...
				for (Map.Entry<Class<? extends Augmentation<Ephemeral>>, Augmentation<Ephemeral>> e : augmentation
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
			final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Ephemeral");
			CodeHelpers.appendValue(helper, "_ephemeral", _ephemeral);
			CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
			return helper.toString();
		}
	}

}
