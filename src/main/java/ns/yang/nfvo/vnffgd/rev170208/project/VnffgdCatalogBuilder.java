package ns.yang.nfvo.vnffgd.rev170208.project;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.vnffgd.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.vnffgd.rev170208.project.vnffgd.catalog.Vnffgd;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Class that builds {@link VnffgdCatalog} instances.
 * 
 * @see VnffgdCatalog
 *
 */
public class VnffgdCatalogBuilder implements Builder<VnffgdCatalog> {

	private List<Vnffgd> _vnffgd;

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnffgd-catalog");

	Map<Class<? extends Augmentation<VnffgdCatalog>>, Augmentation<VnffgdCatalog>> augmentation = Collections
			.emptyMap();

	public VnffgdCatalogBuilder() {
	}

	public VnffgdCatalogBuilder(VnffgdCatalog base) {
		this._vnffgd = base.getVnffgd();
		if (base instanceof VnffgdCatalogImpl) {
			VnffgdCatalogImpl impl = (VnffgdCatalogImpl) base;
			if (!impl.augmentation.isEmpty()) {
				this.augmentation = new HashMap<>(impl.augmentation);
			}
		} else if (base instanceof AugmentationHolder) {
			@SuppressWarnings("unchecked")
			AugmentationHolder<VnffgdCatalog> casted = (AugmentationHolder<VnffgdCatalog>) base;
			if (!casted.augmentations().isEmpty()) {
				this.augmentation = new HashMap<>(casted.augmentations());
			}
		}
	}

	public List<Vnffgd> getVnffgd() {
		return _vnffgd;
	}

	@SuppressWarnings("unchecked")
	public <E extends Augmentation<VnffgdCatalog>> E augmentation(Class<E> augmentationType) {
		return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
	}

	public VnffgdCatalogBuilder setVnffgd(final List<Vnffgd> values) {
		this._vnffgd = values;
		return this;
	}

	public VnffgdCatalogBuilder addAugmentation(Class<? extends Augmentation<VnffgdCatalog>> augmentationType,
			Augmentation<VnffgdCatalog> augmentationValue) {
		if (augmentationValue == null) {
			return removeAugmentation(augmentationType);
		}

		if (!(this.augmentation instanceof HashMap)) {
			this.augmentation = new HashMap<>();
		}

		this.augmentation.put(augmentationType, augmentationValue);
		return this;
	}

	public VnffgdCatalogBuilder removeAugmentation(Class<? extends Augmentation<VnffgdCatalog>> augmentationType) {
		if (this.augmentation instanceof HashMap) {
			this.augmentation.remove(augmentationType);
		}
		return this;
	}

	@Override
	public VnffgdCatalog build() {
		return new VnffgdCatalogImpl(this);
	}

	private static final class VnffgdCatalogImpl implements VnffgdCatalog {

		@Override
		public Class<VnffgdCatalog> getImplementedInterface() {
			return VnffgdCatalog.class;
		}

		private final List<Vnffgd> _vnffgd;

		private Map<Class<? extends Augmentation<VnffgdCatalog>>, Augmentation<VnffgdCatalog>> augmentation = Collections
				.emptyMap();

		private VnffgdCatalogImpl(VnffgdCatalogBuilder base) {
			this._vnffgd = base.getVnffgd();
			this.augmentation = ImmutableMap.copyOf(base.augmentation);
		}

		@Override
		public List<Vnffgd> getVnffgd() {
			return _vnffgd;
		}

		@SuppressWarnings("unchecked")
		@Override
		public <E extends Augmentation<VnffgdCatalog>> E augmentation(Class<E> augmentationType) {
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
			result = prime * result + Objects.hashCode(_vnffgd);
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
			if (!VnffgdCatalog.class.equals(((DataObject) obj).getImplementedInterface())) {
				return false;
			}
			VnffgdCatalog other = (VnffgdCatalog) obj;
			if (!Objects.equals(_vnffgd, other.getVnffgd())) {
				return false;
			}
			if (getClass() == obj.getClass()) {
				// Simple case: we are comparing against self
				VnffgdCatalogImpl otherImpl = (VnffgdCatalogImpl) obj;
				if (!Objects.equals(augmentation, otherImpl.augmentation)) {
					return false;
				}
			} else {
				// Hard case: compare our augments with presence there...
				for (Map.Entry<Class<? extends Augmentation<VnffgdCatalog>>, Augmentation<VnffgdCatalog>> e : augmentation
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
			final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("VnffgdCatalog");
			CodeHelpers.appendValue(helper, "_vnffgd", _vnffgd);
			CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
			return helper.toString();
		}
	}

}
