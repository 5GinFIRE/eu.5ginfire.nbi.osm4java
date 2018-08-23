package ns.yang.ietf.network.topology.rev150608.network.link;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.ietf.network.rev150608.NodeId;
import ns.yang.ietf.network.topology.rev150608.$YangModuleInfoImpl;

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
 * Class that builds {@link Source} instances.
 * 
 * @see Source
 *
 */
public class SourceBuilder implements Builder<Source> {

	private NodeId _sourceNode;
	private Object _sourceTp;

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("source");

	Map<Class<? extends Augmentation<Source>>, Augmentation<Source>> augmentation = Collections.emptyMap();

	public SourceBuilder() {
	}

	public SourceBuilder(Source base) {
		this._sourceNode = base.getSourceNode();
		this._sourceTp = base.getSourceTp();
		if (base instanceof SourceImpl) {
			SourceImpl impl = (SourceImpl) base;
			if (!impl.augmentation.isEmpty()) {
				this.augmentation = new HashMap<>(impl.augmentation);
			}
		} else if (base instanceof AugmentationHolder) {
			@SuppressWarnings("unchecked")
			AugmentationHolder<Source> casted = (AugmentationHolder<Source>) base;
			if (!casted.augmentations().isEmpty()) {
				this.augmentation = new HashMap<>(casted.augmentations());
			}
		}
	}

	public NodeId getSourceNode() {
		return _sourceNode;
	}

	public Object getSourceTp() {
		return _sourceTp;
	}

	@SuppressWarnings("unchecked")
	public <E extends Augmentation<Source>> E augmentation(Class<E> augmentationType) {
		return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
	}

	public SourceBuilder setSourceNode(final NodeId value) {
		this._sourceNode = value;
		return this;
	}

	public SourceBuilder setSourceTp(final Object value) {
		this._sourceTp = value;
		return this;
	}

	public SourceBuilder addAugmentation(Class<? extends Augmentation<Source>> augmentationType,
			Augmentation<Source> augmentationValue) {
		if (augmentationValue == null) {
			return removeAugmentation(augmentationType);
		}

		if (!(this.augmentation instanceof HashMap)) {
			this.augmentation = new HashMap<>();
		}

		this.augmentation.put(augmentationType, augmentationValue);
		return this;
	}

	public SourceBuilder removeAugmentation(Class<? extends Augmentation<Source>> augmentationType) {
		if (this.augmentation instanceof HashMap) {
			this.augmentation.remove(augmentationType);
		}
		return this;
	}

	@Override
	public Source build() {
		return new SourceImpl(this);
	}

	private static final class SourceImpl implements Source {

		@Override
		public Class<Source> getImplementedInterface() {
			return Source.class;
		}

		private final NodeId _sourceNode;
		private final Object _sourceTp;

		private Map<Class<? extends Augmentation<Source>>, Augmentation<Source>> augmentation = Collections.emptyMap();

		private SourceImpl(SourceBuilder base) {
			this._sourceNode = base.getSourceNode();
			this._sourceTp = base.getSourceTp();
			this.augmentation = ImmutableMap.copyOf(base.augmentation);
		}

		@Override
		public NodeId getSourceNode() {
			return _sourceNode;
		}

		@Override
		public Object getSourceTp() {
			return _sourceTp;
		}

		@SuppressWarnings("unchecked")
		@Override
		public <E extends Augmentation<Source>> E augmentation(Class<E> augmentationType) {
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
			result = prime * result + Objects.hashCode(_sourceNode);
			result = prime * result + Objects.hashCode(_sourceTp);
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
			if (!Source.class.equals(((DataObject) obj).getImplementedInterface())) {
				return false;
			}
			Source other = (Source) obj;
			if (!Objects.equals(_sourceNode, other.getSourceNode())) {
				return false;
			}
			if (!Objects.equals(_sourceTp, other.getSourceTp())) {
				return false;
			}
			if (getClass() == obj.getClass()) {
				// Simple case: we are comparing against self
				SourceImpl otherImpl = (SourceImpl) obj;
				if (!Objects.equals(augmentation, otherImpl.augmentation)) {
					return false;
				}
			} else {
				// Hard case: compare our augments with presence there...
				for (Map.Entry<Class<? extends Augmentation<Source>>, Augmentation<Source>> e : augmentation
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
			final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Source");
			CodeHelpers.appendValue(helper, "_sourceNode", _sourceNode);
			CodeHelpers.appendValue(helper, "_sourceTp", _sourceTp);
			CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
			return helper.toString();
		}
	}

}
