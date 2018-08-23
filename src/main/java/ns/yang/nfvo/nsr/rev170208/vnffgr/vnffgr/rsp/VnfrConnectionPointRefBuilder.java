package ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ConnectionPointParams;
import ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.rsp.vnfr.connection.point.ref.ServiceFunctionForwarder;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.Short;
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
 * Class that builds {@link VnfrConnectionPointRef} instances.
 * 
 * @see VnfrConnectionPointRef
 *
 */
public class VnfrConnectionPointRefBuilder implements Builder<VnfrConnectionPointRef> {

	private ConnectionPointParams _connectionPointParams;
	private Short _hopNumber;
	private String _memberVnfIndexRef;
	private ServiceFunctionForwarder _serviceFunctionForwarder;
	private String _serviceFunctionType;
	private Short _serviceIndex;
	private String _vnfdIdRef;
	private Object _vnfrConnectionPointRef;
	private String _vnfrIdRef;
	private String _vnfrNameRef;
	private VnfrConnectionPointRefKey key;

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnfr-connection-point-ref");

	Map<Class<? extends Augmentation<VnfrConnectionPointRef>>, Augmentation<VnfrConnectionPointRef>> augmentation = Collections
			.emptyMap();

	public VnfrConnectionPointRefBuilder() {
	}

	public VnfrConnectionPointRefBuilder(VnfrConnectionPointRef base) {
		if (base.key() == null) {
			this.key = new VnfrConnectionPointRefKey(base.getHopNumber());
			this._hopNumber = base.getHopNumber();
		} else {
			this.key = base.key();
			this._hopNumber = key.getHopNumber();
		}
		this._connectionPointParams = base.getConnectionPointParams();
		this._memberVnfIndexRef = base.getMemberVnfIndexRef();
		this._serviceFunctionForwarder = base.getServiceFunctionForwarder();
		this._serviceFunctionType = base.getServiceFunctionType();
		this._serviceIndex = base.getServiceIndex();
		this._vnfdIdRef = base.getVnfdIdRef();
		this._vnfrConnectionPointRef = base.getVnfrConnectionPointRef();
		this._vnfrIdRef = base.getVnfrIdRef();
		this._vnfrNameRef = base.getVnfrNameRef();
		if (base instanceof VnfrConnectionPointRefImpl) {
			VnfrConnectionPointRefImpl impl = (VnfrConnectionPointRefImpl) base;
			if (!impl.augmentation.isEmpty()) {
				this.augmentation = new HashMap<>(impl.augmentation);
			}
		} else if (base instanceof AugmentationHolder) {
			@SuppressWarnings("unchecked")
			AugmentationHolder<VnfrConnectionPointRef> casted = (AugmentationHolder<VnfrConnectionPointRef>) base;
			if (!casted.augmentations().isEmpty()) {
				this.augmentation = new HashMap<>(casted.augmentations());
			}
		}
	}

	public VnfrConnectionPointRefKey key() {
		return key;
	}

	public ConnectionPointParams getConnectionPointParams() {
		return _connectionPointParams;
	}

	public Short getHopNumber() {
		return _hopNumber;
	}

	public String getMemberVnfIndexRef() {
		return _memberVnfIndexRef;
	}

	public ServiceFunctionForwarder getServiceFunctionForwarder() {
		return _serviceFunctionForwarder;
	}

	public String getServiceFunctionType() {
		return _serviceFunctionType;
	}

	public Short getServiceIndex() {
		return _serviceIndex;
	}

	public String getVnfdIdRef() {
		return _vnfdIdRef;
	}

	public Object getVnfrConnectionPointRef() {
		return _vnfrConnectionPointRef;
	}

	public String getVnfrIdRef() {
		return _vnfrIdRef;
	}

	public String getVnfrNameRef() {
		return _vnfrNameRef;
	}

	@SuppressWarnings("unchecked")
	public <E extends Augmentation<VnfrConnectionPointRef>> E augmentation(Class<E> augmentationType) {
		return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
	}

	public VnfrConnectionPointRefBuilder withKey(final VnfrConnectionPointRefKey key) {
		this.key = key;
		return this;
	}

	public VnfrConnectionPointRefBuilder setConnectionPointParams(final ConnectionPointParams value) {
		this._connectionPointParams = value;
		return this;
	}

	private static void checkHopNumberRange(final short value) {
		if (value >= (short) 0 && value <= (short) 255) {
			return;
		}
		CodeHelpers.throwInvalidRange("[[0..255]]", value);
	}

	public VnfrConnectionPointRefBuilder setHopNumber(final Short value) {
		if (value != null) {
			checkHopNumberRange(value);

		}
		this._hopNumber = value;
		return this;
	}

	public VnfrConnectionPointRefBuilder setMemberVnfIndexRef(final String value) {
		this._memberVnfIndexRef = value;
		return this;
	}

	public VnfrConnectionPointRefBuilder setServiceFunctionForwarder(final ServiceFunctionForwarder value) {
		this._serviceFunctionForwarder = value;
		return this;
	}

	public VnfrConnectionPointRefBuilder setServiceFunctionType(final String value) {
		this._serviceFunctionType = value;
		return this;
	}

	private static void checkServiceIndexRange(final short value) {
		if (value >= (short) 0 && value <= (short) 255) {
			return;
		}
		CodeHelpers.throwInvalidRange("[[0..255]]", value);
	}

	public VnfrConnectionPointRefBuilder setServiceIndex(final Short value) {
		if (value != null) {
			checkServiceIndexRange(value);

		}
		this._serviceIndex = value;
		return this;
	}

	public VnfrConnectionPointRefBuilder setVnfdIdRef(final String value) {
		this._vnfdIdRef = value;
		return this;
	}

	public VnfrConnectionPointRefBuilder setVnfrConnectionPointRef(final Object value) {
		this._vnfrConnectionPointRef = value;
		return this;
	}

	public VnfrConnectionPointRefBuilder setVnfrIdRef(final String value) {
		this._vnfrIdRef = value;
		return this;
	}

	public VnfrConnectionPointRefBuilder setVnfrNameRef(final String value) {
		this._vnfrNameRef = value;
		return this;
	}

	public VnfrConnectionPointRefBuilder addAugmentation(
			Class<? extends Augmentation<VnfrConnectionPointRef>> augmentationType,
			Augmentation<VnfrConnectionPointRef> augmentationValue) {
		if (augmentationValue == null) {
			return removeAugmentation(augmentationType);
		}

		if (!(this.augmentation instanceof HashMap)) {
			this.augmentation = new HashMap<>();
		}

		this.augmentation.put(augmentationType, augmentationValue);
		return this;
	}

	public VnfrConnectionPointRefBuilder removeAugmentation(
			Class<? extends Augmentation<VnfrConnectionPointRef>> augmentationType) {
		if (this.augmentation instanceof HashMap) {
			this.augmentation.remove(augmentationType);
		}
		return this;
	}

	@Override
	public VnfrConnectionPointRef build() {
		return new VnfrConnectionPointRefImpl(this);
	}

	private static final class VnfrConnectionPointRefImpl implements VnfrConnectionPointRef {

		@Override
		public Class<VnfrConnectionPointRef> getImplementedInterface() {
			return VnfrConnectionPointRef.class;
		}

		private final ConnectionPointParams _connectionPointParams;
		private final Short _hopNumber;
		private final String _memberVnfIndexRef;
		private final ServiceFunctionForwarder _serviceFunctionForwarder;
		private final String _serviceFunctionType;
		private final Short _serviceIndex;
		private final String _vnfdIdRef;
		private final Object _vnfrConnectionPointRef;
		private final String _vnfrIdRef;
		private final String _vnfrNameRef;
		private final VnfrConnectionPointRefKey key;

		private Map<Class<? extends Augmentation<VnfrConnectionPointRef>>, Augmentation<VnfrConnectionPointRef>> augmentation = Collections
				.emptyMap();

		private VnfrConnectionPointRefImpl(VnfrConnectionPointRefBuilder base) {
			if (base.key() == null) {
				this.key = new VnfrConnectionPointRefKey(base.getHopNumber());
				this._hopNumber = base.getHopNumber();
			} else {
				this.key = base.key();
				this._hopNumber = key.getHopNumber();
			}
			this._connectionPointParams = base.getConnectionPointParams();
			this._memberVnfIndexRef = base.getMemberVnfIndexRef();
			this._serviceFunctionForwarder = base.getServiceFunctionForwarder();
			this._serviceFunctionType = base.getServiceFunctionType();
			this._serviceIndex = base.getServiceIndex();
			this._vnfdIdRef = base.getVnfdIdRef();
			this._vnfrConnectionPointRef = base.getVnfrConnectionPointRef();
			this._vnfrIdRef = base.getVnfrIdRef();
			this._vnfrNameRef = base.getVnfrNameRef();
			this.augmentation = ImmutableMap.copyOf(base.augmentation);
		}

		@Override
		public VnfrConnectionPointRefKey key() {
			return key;
		}

		@Override
		public ConnectionPointParams getConnectionPointParams() {
			return _connectionPointParams;
		}

		@Override
		public Short getHopNumber() {
			return _hopNumber;
		}

		@Override
		public String getMemberVnfIndexRef() {
			return _memberVnfIndexRef;
		}

		@Override
		public ServiceFunctionForwarder getServiceFunctionForwarder() {
			return _serviceFunctionForwarder;
		}

		@Override
		public String getServiceFunctionType() {
			return _serviceFunctionType;
		}

		@Override
		public Short getServiceIndex() {
			return _serviceIndex;
		}

		@Override
		public String getVnfdIdRef() {
			return _vnfdIdRef;
		}

		@Override
		public Object getVnfrConnectionPointRef() {
			return _vnfrConnectionPointRef;
		}

		@Override
		public String getVnfrIdRef() {
			return _vnfrIdRef;
		}

		@Override
		public String getVnfrNameRef() {
			return _vnfrNameRef;
		}

		@SuppressWarnings("unchecked")
		@Override
		public <E extends Augmentation<VnfrConnectionPointRef>> E augmentation(Class<E> augmentationType) {
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
			result = prime * result + Objects.hashCode(_connectionPointParams);
			result = prime * result + Objects.hashCode(_hopNumber);
			result = prime * result + Objects.hashCode(_memberVnfIndexRef);
			result = prime * result + Objects.hashCode(_serviceFunctionForwarder);
			result = prime * result + Objects.hashCode(_serviceFunctionType);
			result = prime * result + Objects.hashCode(_serviceIndex);
			result = prime * result + Objects.hashCode(_vnfdIdRef);
			result = prime * result + Objects.hashCode(_vnfrConnectionPointRef);
			result = prime * result + Objects.hashCode(_vnfrIdRef);
			result = prime * result + Objects.hashCode(_vnfrNameRef);
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
			if (!VnfrConnectionPointRef.class.equals(((DataObject) obj).getImplementedInterface())) {
				return false;
			}
			VnfrConnectionPointRef other = (VnfrConnectionPointRef) obj;
			if (!Objects.equals(_connectionPointParams, other.getConnectionPointParams())) {
				return false;
			}
			if (!Objects.equals(_hopNumber, other.getHopNumber())) {
				return false;
			}
			if (!Objects.equals(_memberVnfIndexRef, other.getMemberVnfIndexRef())) {
				return false;
			}
			if (!Objects.equals(_serviceFunctionForwarder, other.getServiceFunctionForwarder())) {
				return false;
			}
			if (!Objects.equals(_serviceFunctionType, other.getServiceFunctionType())) {
				return false;
			}
			if (!Objects.equals(_serviceIndex, other.getServiceIndex())) {
				return false;
			}
			if (!Objects.equals(_vnfdIdRef, other.getVnfdIdRef())) {
				return false;
			}
			if (!Objects.equals(_vnfrConnectionPointRef, other.getVnfrConnectionPointRef())) {
				return false;
			}
			if (!Objects.equals(_vnfrIdRef, other.getVnfrIdRef())) {
				return false;
			}
			if (!Objects.equals(_vnfrNameRef, other.getVnfrNameRef())) {
				return false;
			}
			if (getClass() == obj.getClass()) {
				// Simple case: we are comparing against self
				VnfrConnectionPointRefImpl otherImpl = (VnfrConnectionPointRefImpl) obj;
				if (!Objects.equals(augmentation, otherImpl.augmentation)) {
					return false;
				}
			} else {
				// Hard case: compare our augments with presence there...
				for (Map.Entry<Class<? extends Augmentation<VnfrConnectionPointRef>>, Augmentation<VnfrConnectionPointRef>> e : augmentation
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
			final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VnfrConnectionPointRef");
			CodeHelpers.appendValue(helper, "_connectionPointParams", _connectionPointParams);
			CodeHelpers.appendValue(helper, "_hopNumber", _hopNumber);
			CodeHelpers.appendValue(helper, "_memberVnfIndexRef", _memberVnfIndexRef);
			CodeHelpers.appendValue(helper, "_serviceFunctionForwarder", _serviceFunctionForwarder);
			CodeHelpers.appendValue(helper, "_serviceFunctionType", _serviceFunctionType);
			CodeHelpers.appendValue(helper, "_serviceIndex", _serviceIndex);
			CodeHelpers.appendValue(helper, "_vnfdIdRef", _vnfdIdRef);
			CodeHelpers.appendValue(helper, "_vnfrConnectionPointRef", _vnfrConnectionPointRef);
			CodeHelpers.appendValue(helper, "_vnfrIdRef", _vnfrIdRef);
			CodeHelpers.appendValue(helper, "_vnfrNameRef", _vnfrNameRef);
			CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
			return helper.toString();
		}
	}

}
