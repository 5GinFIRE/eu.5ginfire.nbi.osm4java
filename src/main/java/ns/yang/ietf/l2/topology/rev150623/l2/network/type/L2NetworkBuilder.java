package ns.yang.ietf.l2.topology.rev150623.l2.network.type;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.l2.topology.rev150623.$YangModuleInfoImpl;

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
 * Class that builds {@link L2Network} instances.
 * 
 * @see L2Network
 *
 */
public class L2NetworkBuilder implements Builder<L2Network> {

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("l2-network");

	Map<Class<? extends Augmentation<L2Network>>, Augmentation<L2Network>> augmentation = Collections.emptyMap();

	public L2NetworkBuilder() {
	}

	public L2NetworkBuilder(L2Network base) {
		if (base instanceof L2NetworkImpl) {
			L2NetworkImpl impl = (L2NetworkImpl) base;
			if (!impl.augmentation.isEmpty()) {
				this.augmentation = new HashMap<>(impl.augmentation);
			}
		} else if (base instanceof AugmentationHolder) {
			@SuppressWarnings("unchecked")
			AugmentationHolder<L2Network> casted = (AugmentationHolder<L2Network>) base;
			if (!casted.augmentations().isEmpty()) {
				this.augmentation = new HashMap<>(casted.augmentations());
			}
		}
	}

	@SuppressWarnings("unchecked")
	public <E extends Augmentation<L2Network>> E augmentation(Class<E> augmentationType) {
		return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
	}

	public L2NetworkBuilder addAugmentation(Class<? extends Augmentation<L2Network>> augmentationType,
			Augmentation<L2Network> augmentationValue) {
		if (augmentationValue == null) {
			return removeAugmentation(augmentationType);
		}

		if (!(this.augmentation instanceof HashMap)) {
			this.augmentation = new HashMap<>();
		}

		this.augmentation.put(augmentationType, augmentationValue);
		return this;
	}

	public L2NetworkBuilder removeAugmentation(Class<? extends Augmentation<L2Network>> augmentationType) {
		if (this.augmentation instanceof HashMap) {
			this.augmentation.remove(augmentationType);
		}
		return this;
	}

	@Override
	public L2Network build() {
		return new L2NetworkImpl(this);
	}

	private static final class L2NetworkImpl implements L2Network {

		@Override
		public Class<L2Network> getImplementedInterface() {
			return L2Network.class;
		}

		private Map<Class<? extends Augmentation<L2Network>>, Augmentation<L2Network>> augmentation = Collections
				.emptyMap();

		private L2NetworkImpl(L2NetworkBuilder base) {
			this.augmentation = ImmutableMap.copyOf(base.augmentation);
		}

		@SuppressWarnings("unchecked")
		@Override
		public <E extends Augmentation<L2Network>> E augmentation(Class<E> augmentationType) {
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
			if (!L2Network.class.equals(((DataObject) obj).getImplementedInterface())) {
				return false;
			}
			L2Network other = (L2Network) obj;
			if (getClass() == obj.getClass()) {
				// Simple case: we are comparing against self
				L2NetworkImpl otherImpl = (L2NetworkImpl) obj;
				if (!Objects.equals(augmentation, otherImpl.augmentation)) {
					return false;
				}
			} else {
				// Hard case: compare our augments with presence there...
				for (Map.Entry<Class<? extends Augmentation<L2Network>>, Augmentation<L2Network>> e : augmentation
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
			final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("L2Network");
			CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
			return helper.toString();
		}
	}

}
