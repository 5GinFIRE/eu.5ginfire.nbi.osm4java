package yang.vnfd.vnfd.descriptor.scaling.group.descriptor;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.ScalingTrigger;
import yang.vnfd.$YangModuleInfoImpl;

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
 * Class that builds {@link ScalingConfigAction} instances.
 * 
 * @see ScalingConfigAction
 *
 */
public class ScalingConfigActionBuilder implements Builder<ScalingConfigAction> {

	private ScalingTrigger _trigger;
	private String _vnfConfigPrimitiveNameRef;
	private ScalingConfigActionKey key;

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("scaling-config-action");

	Map<Class<? extends Augmentation<ScalingConfigAction>>, Augmentation<ScalingConfigAction>> augmentation = Collections
			.emptyMap();

	public ScalingConfigActionBuilder() {
	}

	public ScalingConfigActionBuilder(ScalingConfigAction base) {
		if (base.key() == null) {
			this.key = new ScalingConfigActionKey(base.getTrigger());
			this._trigger = base.getTrigger();
		} else {
			this.key = base.key();
			this._trigger = key.getTrigger();
		}
		this._vnfConfigPrimitiveNameRef = base.getVnfConfigPrimitiveNameRef();
		if (base instanceof ScalingConfigActionImpl) {
			ScalingConfigActionImpl impl = (ScalingConfigActionImpl) base;
			if (!impl.augmentation.isEmpty()) {
				this.augmentation = new HashMap<>(impl.augmentation);
			}
		} else if (base instanceof AugmentationHolder) {
			@SuppressWarnings("unchecked")
			AugmentationHolder<ScalingConfigAction> casted = (AugmentationHolder<ScalingConfigAction>) base;
			if (!casted.augmentations().isEmpty()) {
				this.augmentation = new HashMap<>(casted.augmentations());
			}
		}
	}

	public ScalingConfigActionKey key() {
		return key;
	}

	public ScalingTrigger getTrigger() {
		return _trigger;
	}

	public String getVnfConfigPrimitiveNameRef() {
		return _vnfConfigPrimitiveNameRef;
	}

	@SuppressWarnings("unchecked")
	public <E extends Augmentation<ScalingConfigAction>> E augmentation(Class<E> augmentationType) {
		return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
	}

	public ScalingConfigActionBuilder withKey(final ScalingConfigActionKey key) {
		this.key = key;
		return this;
	}

	public ScalingConfigActionBuilder setTrigger(final ScalingTrigger value) {
		this._trigger = value;
		return this;
	}

	public ScalingConfigActionBuilder setVnfConfigPrimitiveNameRef(final String value) {
		this._vnfConfigPrimitiveNameRef = value;
		return this;
	}

	public ScalingConfigActionBuilder addAugmentation(
			Class<? extends Augmentation<ScalingConfigAction>> augmentationType,
			Augmentation<ScalingConfigAction> augmentationValue) {
		if (augmentationValue == null) {
			return removeAugmentation(augmentationType);
		}

		if (!(this.augmentation instanceof HashMap)) {
			this.augmentation = new HashMap<>();
		}

		this.augmentation.put(augmentationType, augmentationValue);
		return this;
	}

	public ScalingConfigActionBuilder removeAugmentation(
			Class<? extends Augmentation<ScalingConfigAction>> augmentationType) {
		if (this.augmentation instanceof HashMap) {
			this.augmentation.remove(augmentationType);
		}
		return this;
	}

	@Override
	public ScalingConfigAction build() {
		return new ScalingConfigActionImpl(this);
	}

	private static final class ScalingConfigActionImpl implements ScalingConfigAction {

		@Override
		public Class<ScalingConfigAction> getImplementedInterface() {
			return ScalingConfigAction.class;
		}

		private final ScalingTrigger _trigger;
		private final String _vnfConfigPrimitiveNameRef;
		private final ScalingConfigActionKey key;

		private Map<Class<? extends Augmentation<ScalingConfigAction>>, Augmentation<ScalingConfigAction>> augmentation = Collections
				.emptyMap();

		private ScalingConfigActionImpl(ScalingConfigActionBuilder base) {
			if (base.key() == null) {
				this.key = new ScalingConfigActionKey(base.getTrigger());
				this._trigger = base.getTrigger();
			} else {
				this.key = base.key();
				this._trigger = key.getTrigger();
			}
			this._vnfConfigPrimitiveNameRef = base.getVnfConfigPrimitiveNameRef();
			this.augmentation = ImmutableMap.copyOf(base.augmentation);
		}

		@Override
		public ScalingConfigActionKey key() {
			return key;
		}

		@Override
		public ScalingTrigger getTrigger() {
			return _trigger;
		}

		@Override
		public String getVnfConfigPrimitiveNameRef() {
			return _vnfConfigPrimitiveNameRef;
		}

		@SuppressWarnings("unchecked")
		@Override
		public <E extends Augmentation<ScalingConfigAction>> E augmentation(Class<E> augmentationType) {
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
			result = prime * result + Objects.hashCode(_trigger);
			result = prime * result + Objects.hashCode(_vnfConfigPrimitiveNameRef);
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
			if (!ScalingConfigAction.class.equals(((DataObject) obj).getImplementedInterface())) {
				return false;
			}
			ScalingConfigAction other = (ScalingConfigAction) obj;
			if (!Objects.equals(_trigger, other.getTrigger())) {
				return false;
			}
			if (!Objects.equals(_vnfConfigPrimitiveNameRef, other.getVnfConfigPrimitiveNameRef())) {
				return false;
			}
			if (getClass() == obj.getClass()) {
				// Simple case: we are comparing against self
				ScalingConfigActionImpl otherImpl = (ScalingConfigActionImpl) obj;
				if (!Objects.equals(augmentation, otherImpl.augmentation)) {
					return false;
				}
			} else {
				// Hard case: compare our augments with presence there...
				for (Map.Entry<Class<? extends Augmentation<ScalingConfigAction>>, Augmentation<ScalingConfigAction>> e : augmentation
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
			final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ScalingConfigAction");
			CodeHelpers.appendValue(helper, "_trigger", _trigger);
			CodeHelpers.appendValue(helper, "_vnfConfigPrimitiveNameRef", _vnfConfigPrimitiveNameRef);
			CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
			return helper.toString();
		}
	}

}
