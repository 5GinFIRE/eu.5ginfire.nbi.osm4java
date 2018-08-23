package ns.topology.node.attributes;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.topology.$YangModuleInfoImpl;
import ns.topology.NodeId;
import ns.topology.TopologyId;

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
 * Class that builds {@link SupportingNode} instances.
 * 
 * @see SupportingNode
 *
 */
public class SupportingNodeBuilder implements Builder<SupportingNode> {

	private NodeId _nodeRef;
	private TopologyId _topologyRef;
	private SupportingNodeKey key;

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("supporting-node");

	Map<Class<? extends Augmentation<SupportingNode>>, Augmentation<SupportingNode>> augmentation = Collections
			.emptyMap();

	public SupportingNodeBuilder() {
	}

	public SupportingNodeBuilder(SupportingNode base) {
		if (base.key() == null) {
			this.key = new SupportingNodeKey(base.getNodeRef(), base.getTopologyRef());
			this._nodeRef = base.getNodeRef();
			this._topologyRef = base.getTopologyRef();
		} else {
			this.key = base.key();
			this._nodeRef = key.getNodeRef();
			this._topologyRef = key.getTopologyRef();
		}
		if (base instanceof SupportingNodeImpl) {
			SupportingNodeImpl impl = (SupportingNodeImpl) base;
			if (!impl.augmentation.isEmpty()) {
				this.augmentation = new HashMap<>(impl.augmentation);
			}
		} else if (base instanceof AugmentationHolder) {
			@SuppressWarnings("unchecked")
			AugmentationHolder<SupportingNode> casted = (AugmentationHolder<SupportingNode>) base;
			if (!casted.augmentations().isEmpty()) {
				this.augmentation = new HashMap<>(casted.augmentations());
			}
		}
	}

	public SupportingNodeKey key() {
		return key;
	}

	public NodeId getNodeRef() {
		return _nodeRef;
	}

	public TopologyId getTopologyRef() {
		return _topologyRef;
	}

	@SuppressWarnings("unchecked")
	public <E extends Augmentation<SupportingNode>> E augmentation(Class<E> augmentationType) {
		return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
	}

	public SupportingNodeBuilder withKey(final SupportingNodeKey key) {
		this.key = key;
		return this;
	}

	public SupportingNodeBuilder setNodeRef(final NodeId value) {
		this._nodeRef = value;
		return this;
	}

	public SupportingNodeBuilder setTopologyRef(final TopologyId value) {
		this._topologyRef = value;
		return this;
	}

	public SupportingNodeBuilder addAugmentation(Class<? extends Augmentation<SupportingNode>> augmentationType,
			Augmentation<SupportingNode> augmentationValue) {
		if (augmentationValue == null) {
			return removeAugmentation(augmentationType);
		}

		if (!(this.augmentation instanceof HashMap)) {
			this.augmentation = new HashMap<>();
		}

		this.augmentation.put(augmentationType, augmentationValue);
		return this;
	}

	public SupportingNodeBuilder removeAugmentation(Class<? extends Augmentation<SupportingNode>> augmentationType) {
		if (this.augmentation instanceof HashMap) {
			this.augmentation.remove(augmentationType);
		}
		return this;
	}

	@Override
	public SupportingNode build() {
		return new SupportingNodeImpl(this);
	}

	private static final class SupportingNodeImpl implements SupportingNode {

		@Override
		public Class<SupportingNode> getImplementedInterface() {
			return SupportingNode.class;
		}

		private final NodeId _nodeRef;
		private final TopologyId _topologyRef;
		private final SupportingNodeKey key;

		private Map<Class<? extends Augmentation<SupportingNode>>, Augmentation<SupportingNode>> augmentation = Collections
				.emptyMap();

		private SupportingNodeImpl(SupportingNodeBuilder base) {
			if (base.key() == null) {
				this.key = new SupportingNodeKey(base.getNodeRef(), base.getTopologyRef());
				this._nodeRef = base.getNodeRef();
				this._topologyRef = base.getTopologyRef();
			} else {
				this.key = base.key();
				this._nodeRef = key.getNodeRef();
				this._topologyRef = key.getTopologyRef();
			}
			this.augmentation = ImmutableMap.copyOf(base.augmentation);
		}

		@Override
		public SupportingNodeKey key() {
			return key;
		}

		@Override
		public NodeId getNodeRef() {
			return _nodeRef;
		}

		@Override
		public TopologyId getTopologyRef() {
			return _topologyRef;
		}

		@SuppressWarnings("unchecked")
		@Override
		public <E extends Augmentation<SupportingNode>> E augmentation(Class<E> augmentationType) {
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
			result = prime * result + Objects.hashCode(_nodeRef);
			result = prime * result + Objects.hashCode(_topologyRef);
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
			if (!SupportingNode.class.equals(((DataObject) obj).getImplementedInterface())) {
				return false;
			}
			SupportingNode other = (SupportingNode) obj;
			if (!Objects.equals(_nodeRef, other.getNodeRef())) {
				return false;
			}
			if (!Objects.equals(_topologyRef, other.getTopologyRef())) {
				return false;
			}
			if (getClass() == obj.getClass()) {
				// Simple case: we are comparing against self
				SupportingNodeImpl otherImpl = (SupportingNodeImpl) obj;
				if (!Objects.equals(augmentation, otherImpl.augmentation)) {
					return false;
				}
			} else {
				// Hard case: compare our augments with presence there...
				for (Map.Entry<Class<? extends Augmentation<SupportingNode>>, Augmentation<SupportingNode>> e : augmentation
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
			final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("SupportingNode");
			CodeHelpers.appendValue(helper, "_nodeRef", _nodeRef);
			CodeHelpers.appendValue(helper, "_topologyRef", _topologyRef);
			CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
			return helper.toString();
		}
	}

}
