package yang.vnfd.vnfd.descriptor.vdu;

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
 * Class that builds {@link AlternativeImages} instances.
 * 
 * @see AlternativeImages
 *
 */
public class AlternativeImagesBuilder implements Builder<AlternativeImages> {

	private String _image;
	private String _imageChecksum;
	private String _vimType;
	private AlternativeImagesKey key;

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("alternative-images");

	Map<Class<? extends Augmentation<AlternativeImages>>, Augmentation<AlternativeImages>> augmentation = Collections
			.emptyMap();

	public AlternativeImagesBuilder() {
	}

	public AlternativeImagesBuilder(
			ns.yang.nfvo.mano.types.rev170208.ImageProperties arg) {
		this._image = arg.getImage();
		this._imageChecksum = arg.getImageChecksum();
	}

	public AlternativeImagesBuilder(AlternativeImages base) {
		if (base.key() == null) {
			this.key = new AlternativeImagesKey(base.getVimType());
			this._vimType = base.getVimType();
		} else {
			this.key = base.key();
			this._vimType = key.getVimType();
		}
		this._image = base.getImage();
		this._imageChecksum = base.getImageChecksum();
		if (base instanceof AlternativeImagesImpl) {
			AlternativeImagesImpl impl = (AlternativeImagesImpl) base;
			if (!impl.augmentation.isEmpty()) {
				this.augmentation = new HashMap<>(impl.augmentation);
			}
		} else if (base instanceof AugmentationHolder) {
			@SuppressWarnings("unchecked")
			AugmentationHolder<AlternativeImages> casted = (AugmentationHolder<AlternativeImages>) base;
			if (!casted.augmentations().isEmpty()) {
				this.augmentation = new HashMap<>(casted.augmentations());
			}
		}
	}

	/**
	 * Set fields from given grouping argument. Valid argument is instance of one of
	 * following types:
	 * <ul>
	 * <li>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ImageProperties</li>
	 * </ul>
	 *
	 * @param arg grouping object
	 * @throws IllegalArgumentException if given argument is none of valid types
	 */
	public void fieldsFrom(DataObject arg) {
		boolean isValidArg = false;
		if (arg instanceof ns.yang.nfvo.mano.types.rev170208.ImageProperties) {
			this._image = ((ns.yang.nfvo.mano.types.rev170208.ImageProperties) arg)
					.getImage();
			this._imageChecksum = ((ns.yang.nfvo.mano.types.rev170208.ImageProperties) arg)
					.getImageChecksum();
			isValidArg = true;
		}
		CodeHelpers.validValue(isValidArg, arg,
				"[model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ImageProperties]");
	}

	public AlternativeImagesKey key() {
		return key;
	}

	public String getImage() {
		return _image;
	}

	public String getImageChecksum() {
		return _imageChecksum;
	}

	public String getVimType() {
		return _vimType;
	}

	@SuppressWarnings("unchecked")
	public <E extends Augmentation<AlternativeImages>> E augmentation(Class<E> augmentationType) {
		return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
	}

	public AlternativeImagesBuilder withKey(final AlternativeImagesKey key) {
		this.key = key;
		return this;
	}

	public AlternativeImagesBuilder setImage(final String value) {
		this._image = value;
		return this;
	}

	public AlternativeImagesBuilder setImageChecksum(final String value) {
		this._imageChecksum = value;
		return this;
	}

	public AlternativeImagesBuilder setVimType(final String value) {
		this._vimType = value;
		return this;
	}

	public AlternativeImagesBuilder addAugmentation(Class<? extends Augmentation<AlternativeImages>> augmentationType,
			Augmentation<AlternativeImages> augmentationValue) {
		if (augmentationValue == null) {
			return removeAugmentation(augmentationType);
		}

		if (!(this.augmentation instanceof HashMap)) {
			this.augmentation = new HashMap<>();
		}

		this.augmentation.put(augmentationType, augmentationValue);
		return this;
	}

	public AlternativeImagesBuilder removeAugmentation(
			Class<? extends Augmentation<AlternativeImages>> augmentationType) {
		if (this.augmentation instanceof HashMap) {
			this.augmentation.remove(augmentationType);
		}
		return this;
	}

	@Override
	public AlternativeImages build() {
		return new AlternativeImagesImpl(this);
	}

	private static final class AlternativeImagesImpl implements AlternativeImages {

		@Override
		public Class<AlternativeImages> getImplementedInterface() {
			return AlternativeImages.class;
		}

		private final String _image;
		private final String _imageChecksum;
		private final String _vimType;
		private final AlternativeImagesKey key;

		private Map<Class<? extends Augmentation<AlternativeImages>>, Augmentation<AlternativeImages>> augmentation = Collections
				.emptyMap();

		private AlternativeImagesImpl(AlternativeImagesBuilder base) {
			if (base.key() == null) {
				this.key = new AlternativeImagesKey(base.getVimType());
				this._vimType = base.getVimType();
			} else {
				this.key = base.key();
				this._vimType = key.getVimType();
			}
			this._image = base.getImage();
			this._imageChecksum = base.getImageChecksum();
			this.augmentation = ImmutableMap.copyOf(base.augmentation);
		}

		@Override
		public AlternativeImagesKey key() {
			return key;
		}

		@Override
		public String getImage() {
			return _image;
		}

		@Override
		public String getImageChecksum() {
			return _imageChecksum;
		}

		@Override
		public String getVimType() {
			return _vimType;
		}

		@SuppressWarnings("unchecked")
		@Override
		public <E extends Augmentation<AlternativeImages>> E augmentation(Class<E> augmentationType) {
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
			result = prime * result + Objects.hashCode(_image);
			result = prime * result + Objects.hashCode(_imageChecksum);
			result = prime * result + Objects.hashCode(_vimType);
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
			if (!AlternativeImages.class.equals(((DataObject) obj).getImplementedInterface())) {
				return false;
			}
			AlternativeImages other = (AlternativeImages) obj;
			if (!Objects.equals(_image, other.getImage())) {
				return false;
			}
			if (!Objects.equals(_imageChecksum, other.getImageChecksum())) {
				return false;
			}
			if (!Objects.equals(_vimType, other.getVimType())) {
				return false;
			}
			if (getClass() == obj.getClass()) {
				// Simple case: we are comparing against self
				AlternativeImagesImpl otherImpl = (AlternativeImagesImpl) obj;
				if (!Objects.equals(augmentation, otherImpl.augmentation)) {
					return false;
				}
			} else {
				// Hard case: compare our augments with presence there...
				for (Map.Entry<Class<? extends Augmentation<AlternativeImages>>, Augmentation<AlternativeImages>> e : augmentation
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
			final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("AlternativeImages");
			CodeHelpers.appendValue(helper, "_image", _image);
			CodeHelpers.appendValue(helper, "_imageChecksum", _imageChecksum);
			CodeHelpers.appendValue(helper, "_vimType", _vimType);
			CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
			return helper.toString();
		}
	}

}
