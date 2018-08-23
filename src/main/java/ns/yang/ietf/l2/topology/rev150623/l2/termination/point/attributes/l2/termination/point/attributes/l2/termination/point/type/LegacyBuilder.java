package ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.l2.termination.point.type;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.l2.topology.rev150623.$YangModuleInfoImpl;
import ns.yang.ietf.l2.topology.rev150623.EncapsulationType;

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
 * Class that builds {@link Legacy} instances.
 * 
 * @see Legacy
 *
 */
public class LegacyBuilder implements Builder<Legacy> {

	private Class<? extends EncapsulationType> _encapsulation;

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("legacy");

	Map<Class<? extends Augmentation<Legacy>>, Augmentation<Legacy>> augmentation = Collections.emptyMap();

	public LegacyBuilder() {
	}

	public LegacyBuilder(Legacy base) {
		this._encapsulation = base.getEncapsulation();
		if (base instanceof LegacyImpl) {
			LegacyImpl impl = (LegacyImpl) base;
			if (!impl.augmentation.isEmpty()) {
				this.augmentation = new HashMap<>(impl.augmentation);
			}
		} else if (base instanceof AugmentationHolder) {
			@SuppressWarnings("unchecked")
			AugmentationHolder<Legacy> casted = (AugmentationHolder<Legacy>) base;
			if (!casted.augmentations().isEmpty()) {
				this.augmentation = new HashMap<>(casted.augmentations());
			}
		}
	}

	public Class<? extends EncapsulationType> getEncapsulation() {
		return _encapsulation;
	}

	@SuppressWarnings("unchecked")
	public <E extends Augmentation<Legacy>> E augmentation(Class<E> augmentationType) {
		return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
	}

	public LegacyBuilder setEncapsulation(final Class<? extends EncapsulationType> value) {
		this._encapsulation = value;
		return this;
	}

	public LegacyBuilder addAugmentation(Class<? extends Augmentation<Legacy>> augmentationType,
			Augmentation<Legacy> augmentationValue) {
		if (augmentationValue == null) {
			return removeAugmentation(augmentationType);
		}

		if (!(this.augmentation instanceof HashMap)) {
			this.augmentation = new HashMap<>();
		}

		this.augmentation.put(augmentationType, augmentationValue);
		return this;
	}

	public LegacyBuilder removeAugmentation(Class<? extends Augmentation<Legacy>> augmentationType) {
		if (this.augmentation instanceof HashMap) {
			this.augmentation.remove(augmentationType);
		}
		return this;
	}

	@Override
	public Legacy build() {
		return new LegacyImpl(this);
	}

	private static final class LegacyImpl implements Legacy {

		@Override
		public Class<Legacy> getImplementedInterface() {
			return Legacy.class;
		}

		private final Class<? extends EncapsulationType> _encapsulation;

		private Map<Class<? extends Augmentation<Legacy>>, Augmentation<Legacy>> augmentation = Collections.emptyMap();

		private LegacyImpl(LegacyBuilder base) {
			this._encapsulation = base.getEncapsulation();
			this.augmentation = ImmutableMap.copyOf(base.augmentation);
		}

		@Override
		public Class<? extends EncapsulationType> getEncapsulation() {
			return _encapsulation;
		}

		@SuppressWarnings("unchecked")
		@Override
		public <E extends Augmentation<Legacy>> E augmentation(Class<E> augmentationType) {
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
			result = prime * result + Objects.hashCode(_encapsulation);
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
			if (!Legacy.class.equals(((DataObject) obj).getImplementedInterface())) {
				return false;
			}
			Legacy other = (Legacy) obj;
			if (!Objects.equals(_encapsulation, other.getEncapsulation())) {
				return false;
			}
			if (getClass() == obj.getClass()) {
				// Simple case: we are comparing against self
				LegacyImpl otherImpl = (LegacyImpl) obj;
				if (!Objects.equals(augmentation, otherImpl.augmentation)) {
					return false;
				}
			} else {
				// Hard case: compare our augments with presence there...
				for (Map.Entry<Class<? extends Augmentation<Legacy>>, Augmentation<Legacy>> e : augmentation
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
			final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Legacy");
			CodeHelpers.appendValue(helper, "_encapsulation", _encapsulation);
			CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
			return helper.toString();
		}
	}

}
