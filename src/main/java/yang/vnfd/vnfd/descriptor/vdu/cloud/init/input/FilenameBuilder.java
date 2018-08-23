package yang.vnfd.vnfd.descriptor.vdu.cloud.init.input;

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
 * Class that builds {@link Filename} instances.
 * 
 * @see Filename
 *
 */
public class FilenameBuilder implements Builder<Filename> {

	private String _cloudInitFile;

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("filename");

	Map<Class<? extends Augmentation<Filename>>, Augmentation<Filename>> augmentation = Collections.emptyMap();

	public FilenameBuilder() {
	}

	public FilenameBuilder(Filename base) {
		this._cloudInitFile = base.getCloudInitFile();
		if (base instanceof FilenameImpl) {
			FilenameImpl impl = (FilenameImpl) base;
			if (!impl.augmentation.isEmpty()) {
				this.augmentation = new HashMap<>(impl.augmentation);
			}
		} else if (base instanceof AugmentationHolder) {
			@SuppressWarnings("unchecked")
			AugmentationHolder<Filename> casted = (AugmentationHolder<Filename>) base;
			if (!casted.augmentations().isEmpty()) {
				this.augmentation = new HashMap<>(casted.augmentations());
			}
		}
	}

	public String getCloudInitFile() {
		return _cloudInitFile;
	}

	@SuppressWarnings("unchecked")
	public <E extends Augmentation<Filename>> E augmentation(Class<E> augmentationType) {
		return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
	}

	public FilenameBuilder setCloudInitFile(final String value) {
		this._cloudInitFile = value;
		return this;
	}

	public FilenameBuilder addAugmentation(Class<? extends Augmentation<Filename>> augmentationType,
			Augmentation<Filename> augmentationValue) {
		if (augmentationValue == null) {
			return removeAugmentation(augmentationType);
		}

		if (!(this.augmentation instanceof HashMap)) {
			this.augmentation = new HashMap<>();
		}

		this.augmentation.put(augmentationType, augmentationValue);
		return this;
	}

	public FilenameBuilder removeAugmentation(Class<? extends Augmentation<Filename>> augmentationType) {
		if (this.augmentation instanceof HashMap) {
			this.augmentation.remove(augmentationType);
		}
		return this;
	}

	@Override
	public Filename build() {
		return new FilenameImpl(this);
	}

	private static final class FilenameImpl implements Filename {

		@Override
		public Class<Filename> getImplementedInterface() {
			return Filename.class;
		}

		private final String _cloudInitFile;

		private Map<Class<? extends Augmentation<Filename>>, Augmentation<Filename>> augmentation = Collections
				.emptyMap();

		private FilenameImpl(FilenameBuilder base) {
			this._cloudInitFile = base.getCloudInitFile();
			this.augmentation = ImmutableMap.copyOf(base.augmentation);
		}

		@Override
		public String getCloudInitFile() {
			return _cloudInitFile;
		}

		@SuppressWarnings("unchecked")
		@Override
		public <E extends Augmentation<Filename>> E augmentation(Class<E> augmentationType) {
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
			result = prime * result + Objects.hashCode(_cloudInitFile);
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
			if (!Filename.class.equals(((DataObject) obj).getImplementedInterface())) {
				return false;
			}
			Filename other = (Filename) obj;
			if (!Objects.equals(_cloudInitFile, other.getCloudInitFile())) {
				return false;
			}
			if (getClass() == obj.getClass()) {
				// Simple case: we are comparing against self
				FilenameImpl otherImpl = (FilenameImpl) obj;
				if (!Objects.equals(augmentation, otherImpl.augmentation)) {
					return false;
				}
			} else {
				// Hard case: compare our augments with presence there...
				for (Map.Entry<Class<? extends Augmentation<Filename>>, Augmentation<Filename>> e : augmentation
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
			final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Filename");
			CodeHelpers.appendValue(helper, "_cloudInitFile", _cloudInitFile);
			CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
			return helper.toString();
		}
	}

}
