package yang.vnfd.vnfd.descriptor.mgmt._interface.endpoint.type;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.inet.types.rev100924.IpAddress;
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
 * Class that builds {@link Ip} instances.
 * 
 * @see Ip
 *
 */
public class IpBuilder implements Builder<Ip> {

	private IpAddress _ipAddress;

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ip");

	Map<Class<? extends Augmentation<Ip>>, Augmentation<Ip>> augmentation = Collections.emptyMap();

	public IpBuilder() {
	}

	public IpBuilder(Ip base) {
		this._ipAddress = base.getIpAddress();
		if (base instanceof IpImpl) {
			IpImpl impl = (IpImpl) base;
			if (!impl.augmentation.isEmpty()) {
				this.augmentation = new HashMap<>(impl.augmentation);
			}
		} else if (base instanceof AugmentationHolder) {
			@SuppressWarnings("unchecked")
			AugmentationHolder<Ip> casted = (AugmentationHolder<Ip>) base;
			if (!casted.augmentations().isEmpty()) {
				this.augmentation = new HashMap<>(casted.augmentations());
			}
		}
	}

	public IpAddress getIpAddress() {
		return _ipAddress;
	}

	@SuppressWarnings("unchecked")
	public <E extends Augmentation<Ip>> E augmentation(Class<E> augmentationType) {
		return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
	}

	public IpBuilder setIpAddress(final IpAddress value) {
		this._ipAddress = value;
		return this;
	}

	public IpBuilder addAugmentation(Class<? extends Augmentation<Ip>> augmentationType,
			Augmentation<Ip> augmentationValue) {
		if (augmentationValue == null) {
			return removeAugmentation(augmentationType);
		}

		if (!(this.augmentation instanceof HashMap)) {
			this.augmentation = new HashMap<>();
		}

		this.augmentation.put(augmentationType, augmentationValue);
		return this;
	}

	public IpBuilder removeAugmentation(Class<? extends Augmentation<Ip>> augmentationType) {
		if (this.augmentation instanceof HashMap) {
			this.augmentation.remove(augmentationType);
		}
		return this;
	}

	@Override
	public Ip build() {
		return new IpImpl(this);
	}

	private static final class IpImpl implements Ip {

		@Override
		public Class<Ip> getImplementedInterface() {
			return Ip.class;
		}

		private final IpAddress _ipAddress;

		private Map<Class<? extends Augmentation<Ip>>, Augmentation<Ip>> augmentation = Collections.emptyMap();

		private IpImpl(IpBuilder base) {
			this._ipAddress = base.getIpAddress();
			this.augmentation = ImmutableMap.copyOf(base.augmentation);
		}

		@Override
		public IpAddress getIpAddress() {
			return _ipAddress;
		}

		@SuppressWarnings("unchecked")
		@Override
		public <E extends Augmentation<Ip>> E augmentation(Class<E> augmentationType) {
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
			result = prime * result + Objects.hashCode(_ipAddress);
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
			if (!Ip.class.equals(((DataObject) obj).getImplementedInterface())) {
				return false;
			}
			Ip other = (Ip) obj;
			if (!Objects.equals(_ipAddress, other.getIpAddress())) {
				return false;
			}
			if (getClass() == obj.getClass()) {
				// Simple case: we are comparing against self
				IpImpl otherImpl = (IpImpl) obj;
				if (!Objects.equals(augmentation, otherImpl.augmentation)) {
					return false;
				}
			} else {
				// Hard case: compare our augments with presence there...
				for (Map.Entry<Class<? extends Augmentation<Ip>>, Augmentation<Ip>> e : augmentation.entrySet()) {
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
			final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Ip");
			CodeHelpers.appendValue(helper, "_ipAddress", _ipAddress);
			CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
			return helper.toString();
		}
	}

}
