package ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.inet.types.rev100924.IpAddress;
import ns.yang.ietf.inet.types.rev100924.PortNumber;
import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;

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
 * Class that builds {@link ServiceFunctionForwarder} instances.
 * 
 * @see ServiceFunctionForwarder
 *
 */
public class ServiceFunctionForwarderBuilder implements Builder<ServiceFunctionForwarder> {

	private IpAddress _ipAddress;
	private String _name;
	private PortNumber _port;

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("service-function-forwarder");

	Map<Class<? extends Augmentation<ServiceFunctionForwarder>>, Augmentation<ServiceFunctionForwarder>> augmentation = Collections
			.emptyMap();

	public ServiceFunctionForwarderBuilder() {
	}

	public ServiceFunctionForwarderBuilder(ServiceFunctionForwarder base) {
		this._ipAddress = base.getIpAddress();
		this._name = base.getName();
		this._port = base.getPort();
		if (base instanceof ServiceFunctionForwarderImpl) {
			ServiceFunctionForwarderImpl impl = (ServiceFunctionForwarderImpl) base;
			if (!impl.augmentation.isEmpty()) {
				this.augmentation = new HashMap<>(impl.augmentation);
			}
		} else if (base instanceof AugmentationHolder) {
			@SuppressWarnings("unchecked")
			AugmentationHolder<ServiceFunctionForwarder> casted = (AugmentationHolder<ServiceFunctionForwarder>) base;
			if (!casted.augmentations().isEmpty()) {
				this.augmentation = new HashMap<>(casted.augmentations());
			}
		}
	}

	public IpAddress getIpAddress() {
		return _ipAddress;
	}

	public String getName() {
		return _name;
	}

	public PortNumber getPort() {
		return _port;
	}

	@SuppressWarnings("unchecked")
	public <E extends Augmentation<ServiceFunctionForwarder>> E augmentation(Class<E> augmentationType) {
		return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
	}

	public ServiceFunctionForwarderBuilder setIpAddress(final IpAddress value) {
		this._ipAddress = value;
		return this;
	}

	public ServiceFunctionForwarderBuilder setName(final String value) {
		this._name = value;
		return this;
	}

	public ServiceFunctionForwarderBuilder setPort(final PortNumber value) {
		this._port = value;
		return this;
	}

	public ServiceFunctionForwarderBuilder addAugmentation(
			Class<? extends Augmentation<ServiceFunctionForwarder>> augmentationType,
			Augmentation<ServiceFunctionForwarder> augmentationValue) {
		if (augmentationValue == null) {
			return removeAugmentation(augmentationType);
		}

		if (!(this.augmentation instanceof HashMap)) {
			this.augmentation = new HashMap<>();
		}

		this.augmentation.put(augmentationType, augmentationValue);
		return this;
	}

	public ServiceFunctionForwarderBuilder removeAugmentation(
			Class<? extends Augmentation<ServiceFunctionForwarder>> augmentationType) {
		if (this.augmentation instanceof HashMap) {
			this.augmentation.remove(augmentationType);
		}
		return this;
	}

	@Override
	public ServiceFunctionForwarder build() {
		return new ServiceFunctionForwarderImpl(this);
	}

	private static final class ServiceFunctionForwarderImpl implements ServiceFunctionForwarder {

		@Override
		public Class<ServiceFunctionForwarder> getImplementedInterface() {
			return ServiceFunctionForwarder.class;
		}

		private final IpAddress _ipAddress;
		private final String _name;
		private final PortNumber _port;

		private Map<Class<? extends Augmentation<ServiceFunctionForwarder>>, Augmentation<ServiceFunctionForwarder>> augmentation = Collections
				.emptyMap();

		private ServiceFunctionForwarderImpl(ServiceFunctionForwarderBuilder base) {
			this._ipAddress = base.getIpAddress();
			this._name = base.getName();
			this._port = base.getPort();
			this.augmentation = ImmutableMap.copyOf(base.augmentation);
		}

		@Override
		public IpAddress getIpAddress() {
			return _ipAddress;
		}

		@Override
		public String getName() {
			return _name;
		}

		@Override
		public PortNumber getPort() {
			return _port;
		}

		@SuppressWarnings("unchecked")
		@Override
		public <E extends Augmentation<ServiceFunctionForwarder>> E augmentation(Class<E> augmentationType) {
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
			result = prime * result + Objects.hashCode(_name);
			result = prime * result + Objects.hashCode(_port);
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
			if (!ServiceFunctionForwarder.class.equals(((DataObject) obj).getImplementedInterface())) {
				return false;
			}
			ServiceFunctionForwarder other = (ServiceFunctionForwarder) obj;
			if (!Objects.equals(_ipAddress, other.getIpAddress())) {
				return false;
			}
			if (!Objects.equals(_name, other.getName())) {
				return false;
			}
			if (!Objects.equals(_port, other.getPort())) {
				return false;
			}
			if (getClass() == obj.getClass()) {
				// Simple case: we are comparing against self
				ServiceFunctionForwarderImpl otherImpl = (ServiceFunctionForwarderImpl) obj;
				if (!Objects.equals(augmentation, otherImpl.augmentation)) {
					return false;
				}
			} else {
				// Hard case: compare our augments with presence there...
				for (Map.Entry<Class<? extends Augmentation<ServiceFunctionForwarder>>, Augmentation<ServiceFunctionForwarder>> e : augmentation
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
			final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ServiceFunctionForwarder");
			CodeHelpers.appendValue(helper, "_ipAddress", _ipAddress);
			CodeHelpers.appendValue(helper, "_name", _name);
			CodeHelpers.appendValue(helper, "_port", _port);
			CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
			return helper.toString();
		}
	}

}
