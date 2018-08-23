package yang.base.nsd.descriptor.common;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Range;

import ns.yang.nfvo.mano.types.rev170208.event.config.Parameter;
import yang.base.$YangModuleInfoImpl;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.reflect.Array;
import java.math.BigInteger;
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
 * Class that builds {@link TerminateServicePrimitive} instances.
 * 
 * @see TerminateServicePrimitive
 *
 */
public class TerminateServicePrimitiveBuilder implements Builder<TerminateServicePrimitive> {

	private String _name;
	private List<Parameter> _parameter;
	private BigInteger _seq;
	private String _userDefinedScript;
	private TerminateServicePrimitiveKey key;

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("terminate-service-primitive");

	Map<Class<? extends Augmentation<TerminateServicePrimitive>>, Augmentation<TerminateServicePrimitive>> augmentation = Collections
			.emptyMap();

	public TerminateServicePrimitiveBuilder() {
	}

	public TerminateServicePrimitiveBuilder(
			ns.yang.nfvo.mano.types.rev170208.EventConfig arg) {
		this._seq = arg.getSeq();
		this._name = arg.getName();
		this._userDefinedScript = arg.getUserDefinedScript();
		this._parameter = arg.getParameter();
	}

	public TerminateServicePrimitiveBuilder(TerminateServicePrimitive base) {
		if (base.key() == null) {
			this.key = new TerminateServicePrimitiveKey(base.getSeq());
			this._seq = base.getSeq();
		} else {
			this.key = base.key();
			this._seq = key.getSeq();
		}
		this._name = base.getName();
		this._parameter = base.getParameter();
		this._userDefinedScript = base.getUserDefinedScript();
		if (base instanceof TerminateServicePrimitiveImpl) {
			TerminateServicePrimitiveImpl impl = (TerminateServicePrimitiveImpl) base;
			if (!impl.augmentation.isEmpty()) {
				this.augmentation = new HashMap<>(impl.augmentation);
			}
		} else if (base instanceof AugmentationHolder) {
			@SuppressWarnings("unchecked")
			AugmentationHolder<TerminateServicePrimitive> casted = (AugmentationHolder<TerminateServicePrimitive>) base;
			if (!casted.augmentations().isEmpty()) {
				this.augmentation = new HashMap<>(casted.augmentations());
			}
		}
	}

	/**
	 * Set fields from given grouping argument. Valid argument is instance of one of
	 * following types:
	 * <ul>
	 * <li>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.EventConfig</li>
	 * </ul>
	 *
	 * @param arg grouping object
	 * @throws IllegalArgumentException if given argument is none of valid types
	 */
	public void fieldsFrom(DataObject arg) {
		boolean isValidArg = false;
		if (arg instanceof ns.yang.nfvo.mano.types.rev170208.EventConfig) {
			this._seq = ((ns.yang.nfvo.mano.types.rev170208.EventConfig) arg)
					.getSeq();
			this._name = ((ns.yang.nfvo.mano.types.rev170208.EventConfig) arg)
					.getName();
			this._userDefinedScript = ((ns.yang.nfvo.mano.types.rev170208.EventConfig) arg)
					.getUserDefinedScript();
			this._parameter = ((ns.yang.nfvo.mano.types.rev170208.EventConfig) arg)
					.getParameter();
			isValidArg = true;
		}
		CodeHelpers.validValue(isValidArg, arg,
				"[model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.EventConfig]");
	}

	public TerminateServicePrimitiveKey key() {
		return key;
	}

	public String getName() {
		return _name;
	}

	public List<Parameter> getParameter() {
		return _parameter;
	}

	public BigInteger getSeq() {
		return _seq;
	}

	public String getUserDefinedScript() {
		return _userDefinedScript;
	}

	@SuppressWarnings("unchecked")
	public <E extends Augmentation<TerminateServicePrimitive>> E augmentation(Class<E> augmentationType) {
		return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
	}

	public TerminateServicePrimitiveBuilder withKey(final TerminateServicePrimitiveKey key) {
		this.key = key;
		return this;
	}

	public TerminateServicePrimitiveBuilder setName(final String value) {
		this._name = value;
		return this;
	}

	public TerminateServicePrimitiveBuilder setParameter(final List<Parameter> values) {
		this._parameter = values;
		return this;
	}

	private static final Range<java.math.BigInteger>[] CHECKSEQRANGE_RANGES;
	static {
		@SuppressWarnings("unchecked")
		final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
		a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
		CHECKSEQRANGE_RANGES = a;
	}

	private static void checkSeqRange(final java.math.BigInteger value) {
		for (Range<java.math.BigInteger> r : CHECKSEQRANGE_RANGES) {
			if (r.contains(value)) {
				return;
			}
		}
		CodeHelpers.throwInvalidRange(CHECKSEQRANGE_RANGES, value);
	}

	public TerminateServicePrimitiveBuilder setSeq(final BigInteger value) {
		if (value != null) {
			checkSeqRange(value);

		}
		this._seq = value;
		return this;
	}

	public TerminateServicePrimitiveBuilder setUserDefinedScript(final String value) {
		this._userDefinedScript = value;
		return this;
	}

	public TerminateServicePrimitiveBuilder addAugmentation(
			Class<? extends Augmentation<TerminateServicePrimitive>> augmentationType,
			Augmentation<TerminateServicePrimitive> augmentationValue) {
		if (augmentationValue == null) {
			return removeAugmentation(augmentationType);
		}

		if (!(this.augmentation instanceof HashMap)) {
			this.augmentation = new HashMap<>();
		}

		this.augmentation.put(augmentationType, augmentationValue);
		return this;
	}

	public TerminateServicePrimitiveBuilder removeAugmentation(
			Class<? extends Augmentation<TerminateServicePrimitive>> augmentationType) {
		if (this.augmentation instanceof HashMap) {
			this.augmentation.remove(augmentationType);
		}
		return this;
	}

	@Override
	public TerminateServicePrimitive build() {
		return new TerminateServicePrimitiveImpl(this);
	}

	private static final class TerminateServicePrimitiveImpl implements TerminateServicePrimitive {

		@Override
		public Class<TerminateServicePrimitive> getImplementedInterface() {
			return TerminateServicePrimitive.class;
		}

		private final String _name;
		private final List<Parameter> _parameter;
		private final BigInteger _seq;
		private final String _userDefinedScript;
		private final TerminateServicePrimitiveKey key;

		private Map<Class<? extends Augmentation<TerminateServicePrimitive>>, Augmentation<TerminateServicePrimitive>> augmentation = Collections
				.emptyMap();

		private TerminateServicePrimitiveImpl(TerminateServicePrimitiveBuilder base) {
			if (base.key() == null) {
				this.key = new TerminateServicePrimitiveKey(base.getSeq());
				this._seq = base.getSeq();
			} else {
				this.key = base.key();
				this._seq = key.getSeq();
			}
			this._name = base.getName();
			this._parameter = base.getParameter();
			this._userDefinedScript = base.getUserDefinedScript();
			this.augmentation = ImmutableMap.copyOf(base.augmentation);
		}

		@Override
		public TerminateServicePrimitiveKey key() {
			return key;
		}

		@Override
		public String getName() {
			return _name;
		}

		@Override
		public List<Parameter> getParameter() {
			return _parameter;
		}

		@Override
		public BigInteger getSeq() {
			return _seq;
		}

		@Override
		public String getUserDefinedScript() {
			return _userDefinedScript;
		}

		@SuppressWarnings("unchecked")
		@Override
		public <E extends Augmentation<TerminateServicePrimitive>> E augmentation(Class<E> augmentationType) {
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
			result = prime * result + Objects.hashCode(_name);
			result = prime * result + Objects.hashCode(_parameter);
			result = prime * result + Objects.hashCode(_seq);
			result = prime * result + Objects.hashCode(_userDefinedScript);
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
			if (!TerminateServicePrimitive.class.equals(((DataObject) obj).getImplementedInterface())) {
				return false;
			}
			TerminateServicePrimitive other = (TerminateServicePrimitive) obj;
			if (!Objects.equals(_name, other.getName())) {
				return false;
			}
			if (!Objects.equals(_parameter, other.getParameter())) {
				return false;
			}
			if (!Objects.equals(_seq, other.getSeq())) {
				return false;
			}
			if (!Objects.equals(_userDefinedScript, other.getUserDefinedScript())) {
				return false;
			}
			if (getClass() == obj.getClass()) {
				// Simple case: we are comparing against self
				TerminateServicePrimitiveImpl otherImpl = (TerminateServicePrimitiveImpl) obj;
				if (!Objects.equals(augmentation, otherImpl.augmentation)) {
					return false;
				}
			} else {
				// Hard case: compare our augments with presence there...
				for (Map.Entry<Class<? extends Augmentation<TerminateServicePrimitive>>, Augmentation<TerminateServicePrimitive>> e : augmentation
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
			final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("TerminateServicePrimitive");
			CodeHelpers.appendValue(helper, "_name", _name);
			CodeHelpers.appendValue(helper, "_parameter", _parameter);
			CodeHelpers.appendValue(helper, "_seq", _seq);
			CodeHelpers.appendValue(helper, "_userDefinedScript", _userDefinedScript);
			CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
			return helper.toString();
		}
	}

}
