package ns.yang.nfvo.mano.types.rev170208.volume.info.volume.source;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;

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
 * Class that builds {@link Image} instances.
 * 
 * @see Image
 *
 */
public class ImageBuilder implements Builder<Image> {

	private String _image;
	private String _imageChecksum;

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("image");

	Map<Class<? extends Augmentation<Image>>, Augmentation<Image>> augmentation = Collections.emptyMap();

	public ImageBuilder() {
	}

	public ImageBuilder(
			ns.yang.nfvo.mano.types.rev170208.ImageProperties arg) {
		this._image = arg.getImage();
		this._imageChecksum = arg.getImageChecksum();
	}

	public ImageBuilder(Image base) {
		this._image = base.getImage();
		this._imageChecksum = base.getImageChecksum();
		if (base instanceof ImageImpl) {
			ImageImpl impl = (ImageImpl) base;
			if (!impl.augmentation.isEmpty()) {
				this.augmentation = new HashMap<>(impl.augmentation);
			}
		} else if (base instanceof AugmentationHolder) {
			@SuppressWarnings("unchecked")
			AugmentationHolder<Image> casted = (AugmentationHolder<Image>) base;
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

	public String getImage() {
		return _image;
	}

	public String getImageChecksum() {
		return _imageChecksum;
	}

	@SuppressWarnings("unchecked")
	public <E extends Augmentation<Image>> E augmentation(Class<E> augmentationType) {
		return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
	}

	public ImageBuilder setImage(final String value) {
		this._image = value;
		return this;
	}

	public ImageBuilder setImageChecksum(final String value) {
		this._imageChecksum = value;
		return this;
	}

	public ImageBuilder addAugmentation(Class<? extends Augmentation<Image>> augmentationType,
			Augmentation<Image> augmentationValue) {
		if (augmentationValue == null) {
			return removeAugmentation(augmentationType);
		}

		if (!(this.augmentation instanceof HashMap)) {
			this.augmentation = new HashMap<>();
		}

		this.augmentation.put(augmentationType, augmentationValue);
		return this;
	}

	public ImageBuilder removeAugmentation(Class<? extends Augmentation<Image>> augmentationType) {
		if (this.augmentation instanceof HashMap) {
			this.augmentation.remove(augmentationType);
		}
		return this;
	}

	@Override
	public Image build() {
		return new ImageImpl(this);
	}

	private static final class ImageImpl implements Image {

		@Override
		public Class<Image> getImplementedInterface() {
			return Image.class;
		}

		private final String _image;
		private final String _imageChecksum;

		private Map<Class<? extends Augmentation<Image>>, Augmentation<Image>> augmentation = Collections.emptyMap();

		private ImageImpl(ImageBuilder base) {
			this._image = base.getImage();
			this._imageChecksum = base.getImageChecksum();
			this.augmentation = ImmutableMap.copyOf(base.augmentation);
		}

		@Override
		public String getImage() {
			return _image;
		}

		@Override
		public String getImageChecksum() {
			return _imageChecksum;
		}

		@SuppressWarnings("unchecked")
		@Override
		public <E extends Augmentation<Image>> E augmentation(Class<E> augmentationType) {
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
			if (!Image.class.equals(((DataObject) obj).getImplementedInterface())) {
				return false;
			}
			Image other = (Image) obj;
			if (!Objects.equals(_image, other.getImage())) {
				return false;
			}
			if (!Objects.equals(_imageChecksum, other.getImageChecksum())) {
				return false;
			}
			if (getClass() == obj.getClass()) {
				// Simple case: we are comparing against self
				ImageImpl otherImpl = (ImageImpl) obj;
				if (!Objects.equals(augmentation, otherImpl.augmentation)) {
					return false;
				}
			} else {
				// Hard case: compare our augments with presence there...
				for (Map.Entry<Class<? extends Augmentation<Image>>, Augmentation<Image>> e : augmentation.entrySet()) {
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
			final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Image");
			CodeHelpers.appendValue(helper, "_image", _image);
			CodeHelpers.appendValue(helper, "_imageChecksum", _imageChecksum);
			CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
			return helper.toString();
		}
	}

}
