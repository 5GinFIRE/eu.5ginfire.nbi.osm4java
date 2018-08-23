package ns.yang.nfvo.nsr.rev170208.vnffgr;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.yang.types.rev130715.Uuid;
import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.nsr.rev170208.VnffgrOperationalStatus;
import ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Classifier;
import ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr.Rsp;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;

import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Class that builds {@link Vnffgr} instances.
 * 
 * @see Vnffgr
 *
 */
public class VnffgrBuilder implements Builder<Vnffgr> {

	private List<Classifier> _classifier;
	private String _cloudAccount;
	private Uuid _id;
	private VnffgrOperationalStatus _operationalStatus;
	private List<Rsp> _rsp;
	private String _sdnAccount;
	private Object _vnffgdIdRef;
	private Object _vnffgdNameRef;
	private VnffgrKey key;

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnffgr");
	private static final Pattern patterns_id = Pattern
			.compile("^(?:[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12})$");
	private static final String regexes_id = "[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}";

	Map<Class<? extends Augmentation<Vnffgr>>, Augmentation<Vnffgr>> augmentation = Collections.emptyMap();

	public VnffgrBuilder() {
	}

	public VnffgrBuilder(Vnffgr base) {
		if (base.key() == null) {
			this.key = new VnffgrKey(base.getId());
			this._id = base.getId();
		} else {
			this.key = base.key();
			this._id = key.getId();
		}
		this._classifier = base.getClassifier();
		this._cloudAccount = base.getCloudAccount();
		this._operationalStatus = base.getOperationalStatus();
		this._rsp = base.getRsp();
		this._sdnAccount = base.getSdnAccount();
		this._vnffgdIdRef = base.getVnffgdIdRef();
		this._vnffgdNameRef = base.getVnffgdNameRef();
		if (base instanceof VnffgrImpl) {
			VnffgrImpl impl = (VnffgrImpl) base;
			if (!impl.augmentation.isEmpty()) {
				this.augmentation = new HashMap<>(impl.augmentation);
			}
		} else if (base instanceof AugmentationHolder) {
			@SuppressWarnings("unchecked")
			AugmentationHolder<Vnffgr> casted = (AugmentationHolder<Vnffgr>) base;
			if (!casted.augmentations().isEmpty()) {
				this.augmentation = new HashMap<>(casted.augmentations());
			}
		}
	}

	public VnffgrKey key() {
		return key;
	}

	public List<Classifier> getClassifier() {
		return _classifier;
	}

	public String getCloudAccount() {
		return _cloudAccount;
	}

	public Uuid getId() {
		return _id;
	}

	public VnffgrOperationalStatus getOperationalStatus() {
		return _operationalStatus;
	}

	public List<Rsp> getRsp() {
		return _rsp;
	}

	public String getSdnAccount() {
		return _sdnAccount;
	}

	public Object getVnffgdIdRef() {
		return _vnffgdIdRef;
	}

	public Object getVnffgdNameRef() {
		return _vnffgdNameRef;
	}

	@SuppressWarnings("unchecked")
	public <E extends Augmentation<Vnffgr>> E augmentation(Class<E> augmentationType) {
		return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
	}

	public VnffgrBuilder withKey(final VnffgrKey key) {
		this.key = key;
		return this;
	}

	public VnffgrBuilder setClassifier(final List<Classifier> values) {
		this._classifier = values;
		return this;
	}

	public VnffgrBuilder setCloudAccount(final String value) {
		this._cloudAccount = value;
		return this;
	}

	public VnffgrBuilder setId(final Uuid value) {
		this._id = value;
		return this;
	}

	public VnffgrBuilder setOperationalStatus(final VnffgrOperationalStatus value) {
		this._operationalStatus = value;
		return this;
	}

	public VnffgrBuilder setRsp(final List<Rsp> values) {
		this._rsp = values;
		return this;
	}

	public VnffgrBuilder setSdnAccount(final String value) {
		this._sdnAccount = value;
		return this;
	}

	public VnffgrBuilder setVnffgdIdRef(final Object value) {
		this._vnffgdIdRef = value;
		return this;
	}

	public VnffgrBuilder setVnffgdNameRef(final Object value) {
		this._vnffgdNameRef = value;
		return this;
	}

	public VnffgrBuilder addAugmentation(Class<? extends Augmentation<Vnffgr>> augmentationType,
			Augmentation<Vnffgr> augmentationValue) {
		if (augmentationValue == null) {
			return removeAugmentation(augmentationType);
		}

		if (!(this.augmentation instanceof HashMap)) {
			this.augmentation = new HashMap<>();
		}

		this.augmentation.put(augmentationType, augmentationValue);
		return this;
	}

	public VnffgrBuilder removeAugmentation(Class<? extends Augmentation<Vnffgr>> augmentationType) {
		if (this.augmentation instanceof HashMap) {
			this.augmentation.remove(augmentationType);
		}
		return this;
	}

	@Override
	public Vnffgr build() {
		return new VnffgrImpl(this);
	}

	private static final class VnffgrImpl implements Vnffgr {

		@Override
		public Class<Vnffgr> getImplementedInterface() {
			return Vnffgr.class;
		}

		private final List<Classifier> _classifier;
		private final String _cloudAccount;
		private final Uuid _id;
		private final VnffgrOperationalStatus _operationalStatus;
		private final List<Rsp> _rsp;
		private final String _sdnAccount;
		private final Object _vnffgdIdRef;
		private final Object _vnffgdNameRef;
		private final VnffgrKey key;

		private Map<Class<? extends Augmentation<Vnffgr>>, Augmentation<Vnffgr>> augmentation = Collections.emptyMap();

		private VnffgrImpl(VnffgrBuilder base) {
			if (base.key() == null) {
				this.key = new VnffgrKey(base.getId());
				this._id = base.getId();
			} else {
				this.key = base.key();
				this._id = key.getId();
			}
			this._classifier = base.getClassifier();
			this._cloudAccount = base.getCloudAccount();
			this._operationalStatus = base.getOperationalStatus();
			this._rsp = base.getRsp();
			this._sdnAccount = base.getSdnAccount();
			this._vnffgdIdRef = base.getVnffgdIdRef();
			this._vnffgdNameRef = base.getVnffgdNameRef();
			this.augmentation = ImmutableMap.copyOf(base.augmentation);
		}

		@Override
		public VnffgrKey key() {
			return key;
		}

		@Override
		public List<Classifier> getClassifier() {
			return _classifier;
		}

		@Override
		public String getCloudAccount() {
			return _cloudAccount;
		}

		@Override
		public Uuid getId() {
			return _id;
		}

		@Override
		public VnffgrOperationalStatus getOperationalStatus() {
			return _operationalStatus;
		}

		@Override
		public List<Rsp> getRsp() {
			return _rsp;
		}

		@Override
		public String getSdnAccount() {
			return _sdnAccount;
		}

		@Override
		public Object getVnffgdIdRef() {
			return _vnffgdIdRef;
		}

		@Override
		public Object getVnffgdNameRef() {
			return _vnffgdNameRef;
		}

		@SuppressWarnings("unchecked")
		@Override
		public <E extends Augmentation<Vnffgr>> E augmentation(Class<E> augmentationType) {
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
			result = prime * result + Objects.hashCode(_classifier);
			result = prime * result + Objects.hashCode(_cloudAccount);
			result = prime * result + Objects.hashCode(_id);
			result = prime * result + Objects.hashCode(_operationalStatus);
			result = prime * result + Objects.hashCode(_rsp);
			result = prime * result + Objects.hashCode(_sdnAccount);
			result = prime * result + Objects.hashCode(_vnffgdIdRef);
			result = prime * result + Objects.hashCode(_vnffgdNameRef);
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
			if (!Vnffgr.class.equals(((DataObject) obj).getImplementedInterface())) {
				return false;
			}
			Vnffgr other = (Vnffgr) obj;
			if (!Objects.equals(_classifier, other.getClassifier())) {
				return false;
			}
			if (!Objects.equals(_cloudAccount, other.getCloudAccount())) {
				return false;
			}
			if (!Objects.equals(_id, other.getId())) {
				return false;
			}
			if (!Objects.equals(_operationalStatus, other.getOperationalStatus())) {
				return false;
			}
			if (!Objects.equals(_rsp, other.getRsp())) {
				return false;
			}
			if (!Objects.equals(_sdnAccount, other.getSdnAccount())) {
				return false;
			}
			if (!Objects.equals(_vnffgdIdRef, other.getVnffgdIdRef())) {
				return false;
			}
			if (!Objects.equals(_vnffgdNameRef, other.getVnffgdNameRef())) {
				return false;
			}
			if (getClass() == obj.getClass()) {
				// Simple case: we are comparing against self
				VnffgrImpl otherImpl = (VnffgrImpl) obj;
				if (!Objects.equals(augmentation, otherImpl.augmentation)) {
					return false;
				}
			} else {
				// Hard case: compare our augments with presence there...
				for (Map.Entry<Class<? extends Augmentation<Vnffgr>>, Augmentation<Vnffgr>> e : augmentation
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
			final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Vnffgr");
			CodeHelpers.appendValue(helper, "_classifier", _classifier);
			CodeHelpers.appendValue(helper, "_cloudAccount", _cloudAccount);
			CodeHelpers.appendValue(helper, "_id", _id);
			CodeHelpers.appendValue(helper, "_operationalStatus", _operationalStatus);
			CodeHelpers.appendValue(helper, "_rsp", _rsp);
			CodeHelpers.appendValue(helper, "_sdnAccount", _sdnAccount);
			CodeHelpers.appendValue(helper, "_vnffgdIdRef", _vnffgdIdRef);
			CodeHelpers.appendValue(helper, "_vnffgdNameRef", _vnffgdNameRef);
			CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
			return helper.toString();
		}
	}

}
