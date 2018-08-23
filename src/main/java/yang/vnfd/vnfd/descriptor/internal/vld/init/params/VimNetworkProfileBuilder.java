package yang.vnfd.vnfd.descriptor.internal.vld.init.params;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

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
 * Class that builds {@link VimNetworkProfile} instances.
 * 
 * @see VimNetworkProfile
 *
 */
public class VimNetworkProfileBuilder implements Builder<VimNetworkProfile> {

	private String _ipProfileRef;

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vim-network-profile");

	Map<Class<? extends Augmentation<VimNetworkProfile>>, Augmentation<VimNetworkProfile>> augmentation = Collections
			.emptyMap();

	public VimNetworkProfileBuilder() {
	}

	public VimNetworkProfileBuilder(VimNetworkProfile base) {
		this._ipProfileRef = base.getIpProfileRef();
		if (base instanceof VimNetworkProfileImpl) {
			VimNetworkProfileImpl impl = (VimNetworkProfileImpl) base;
			if (!impl.augmentation.isEmpty()) {
				this.augmentation = new HashMap<>(impl.augmentation);
			}
		} else if (base instanceof AugmentationHolder) {
			@SuppressWarnings("unchecked")
			AugmentationHolder<VimNetworkProfile> casted = (AugmentationHolder<VimNetworkProfile>) base;
			if (!casted.augmentations().isEmpty()) {
				this.augmentation = new HashMap<>(casted.augmentations());
			}
		}
	}

	public String getIpProfileRef() {
		return _ipProfileRef;
	}

	@SuppressWarnings("unchecked")
	public <E extends Augmentation<VimNetworkProfile>> E augmentation(Class<E> augmentationType) {
		return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
	}

	public VimNetworkProfileBuilder setIpProfileRef(final String value) {
		this._ipProfileRef = value;
		return this;
	}

	public VimNetworkProfileBuilder addAugmentation(Class<? extends Augmentation<VimNetworkProfile>> augmentationType,
			Augmentation<VimNetworkProfile> augmentationValue) {
		if (augmentationValue == null) {
			return removeAugmentation(augmentationType);
		}

		if (!(this.augmentation instanceof HashMap)) {
			this.augmentation = new HashMap<>();
		}

		this.augmentation.put(augmentationType, augmentationValue);
		return this;
	}

	public VimNetworkProfileBuilder removeAugmentation(
			Class<? extends Augmentation<VimNetworkProfile>> augmentationType) {
		if (this.augmentation instanceof HashMap) {
			this.augmentation.remove(augmentationType);
		}
		return this;
	}

	@Override
	public VimNetworkProfile build() {
		return new VimNetworkProfileImpl(this);
	}

	private static final class VimNetworkProfileImpl implements VimNetworkProfile {

		@Override
		public Class<VimNetworkProfile> getImplementedInterface() {
			return VimNetworkProfile.class;
		}

		private final String _ipProfileRef;

		private Map<Class<? extends Augmentation<VimNetworkProfile>>, Augmentation<VimNetworkProfile>> augmentation = Collections
				.emptyMap();

		private VimNetworkProfileImpl(VimNetworkProfileBuilder base) {
			this._ipProfileRef = base.getIpProfileRef();
			this.augmentation = ImmutableMap.copyOf(base.augmentation);
		}

		@Override
		public String getIpProfileRef() {
			return _ipProfileRef;
		}

		@SuppressWarnings("unchecked")
		@Override
		public <E extends Augmentation<VimNetworkProfile>> E augmentation(Class<E> augmentationType) {
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
			result = prime * result + Objects.hashCode(_ipProfileRef);
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
			if (!VimNetworkProfile.class.equals(((DataObject) obj).getImplementedInterface())) {
				return false;
			}
			VimNetworkProfile other = (VimNetworkProfile) obj;
			if (!Objects.equals(_ipProfileRef, other.getIpProfileRef())) {
				return false;
			}
			if (getClass() == obj.getClass()) {
				// Simple case: we are comparing against self
				VimNetworkProfileImpl otherImpl = (VimNetworkProfileImpl) obj;
				if (!Objects.equals(augmentation, otherImpl.augmentation)) {
					return false;
				}
			} else {
				// Hard case: compare our augments with presence there...
				for (Map.Entry<Class<? extends Augmentation<VimNetworkProfile>>, Augmentation<VimNetworkProfile>> e : augmentation
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
			final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VimNetworkProfile");
			CodeHelpers.appendValue(helper, "_ipProfileRef", _ipProfileRef);
			CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
			return helper.toString();
		}
	}

}
