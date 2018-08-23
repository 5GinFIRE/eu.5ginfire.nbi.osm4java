package yang.project.nsd.rev170228.project;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import yang.project.nsd.rev170228.$YangModuleInfoImpl;
import yang.project.nsd.rev170228.project.nsd.catalog.Nsd;

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
 * Class that builds {@link NsdCatalog} instances.
 * 
 * @see NsdCatalog
 *
 */
public class NsdCatalogBuilder implements Builder<NsdCatalog> {

	private List<Nsd> _nsd;

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("nsd-catalog");

	Map<Class<? extends Augmentation<NsdCatalog>>, Augmentation<NsdCatalog>> augmentation = Collections.emptyMap();

	public NsdCatalogBuilder() {
	}

	public NsdCatalogBuilder(NsdCatalog base) {
		this._nsd = base.getNsd();
		if (base instanceof NsdCatalogImpl) {
			NsdCatalogImpl impl = (NsdCatalogImpl) base;
			if (!impl.augmentation.isEmpty()) {
				this.augmentation = new HashMap<>(impl.augmentation);
			}
		} else if (base instanceof AugmentationHolder) {
			@SuppressWarnings("unchecked")
			AugmentationHolder<NsdCatalog> casted = (AugmentationHolder<NsdCatalog>) base;
			if (!casted.augmentations().isEmpty()) {
				this.augmentation = new HashMap<>(casted.augmentations());
			}
		}
	}

	public List<Nsd> getNsd() {
		return _nsd;
	}

	@SuppressWarnings("unchecked")
	public <E extends Augmentation<NsdCatalog>> E augmentation(Class<E> augmentationType) {
		return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
	}

	public NsdCatalogBuilder setNsd(final List<Nsd> values) {
		this._nsd = values;
		return this;
	}

	public NsdCatalogBuilder addAugmentation(Class<? extends Augmentation<NsdCatalog>> augmentationType,
			Augmentation<NsdCatalog> augmentationValue) {
		if (augmentationValue == null) {
			return removeAugmentation(augmentationType);
		}

		if (!(this.augmentation instanceof HashMap)) {
			this.augmentation = new HashMap<>();
		}

		this.augmentation.put(augmentationType, augmentationValue);
		return this;
	}

	public NsdCatalogBuilder removeAugmentation(Class<? extends Augmentation<NsdCatalog>> augmentationType) {
		if (this.augmentation instanceof HashMap) {
			this.augmentation.remove(augmentationType);
		}
		return this;
	}

	@Override
	public NsdCatalog build() {
		return new NsdCatalogImpl(this);
	}

	private static final class NsdCatalogImpl implements NsdCatalog {

		@Override
		public Class<NsdCatalog> getImplementedInterface() {
			return NsdCatalog.class;
		}

		private final List<Nsd> _nsd;

		private Map<Class<? extends Augmentation<NsdCatalog>>, Augmentation<NsdCatalog>> augmentation = Collections
				.emptyMap();

		private NsdCatalogImpl(NsdCatalogBuilder base) {
			this._nsd = base.getNsd();
			this.augmentation = ImmutableMap.copyOf(base.augmentation);
		}

		@Override
		public List<Nsd> getNsd() {
			return _nsd;
		}

		@SuppressWarnings("unchecked")
		@Override
		public <E extends Augmentation<NsdCatalog>> E augmentation(Class<E> augmentationType) {
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
			result = prime * result + Objects.hashCode(_nsd);
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
			if (!NsdCatalog.class.equals(((DataObject) obj).getImplementedInterface())) {
				return false;
			}
			NsdCatalog other = (NsdCatalog) obj;
			if (!Objects.equals(_nsd, other.getNsd())) {
				return false;
			}
			if (getClass() == obj.getClass()) {
				// Simple case: we are comparing against self
				NsdCatalogImpl otherImpl = (NsdCatalogImpl) obj;
				if (!Objects.equals(augmentation, otherImpl.augmentation)) {
					return false;
				}
			} else {
				// Hard case: compare our augments with presence there...
				for (Map.Entry<Class<? extends Augmentation<NsdCatalog>>, Augmentation<NsdCatalog>> e : augmentation
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
			final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("NsdCatalog");
			CodeHelpers.appendValue(helper, "_nsd", _nsd);
			CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
			return helper.toString();
		}
	}

}
