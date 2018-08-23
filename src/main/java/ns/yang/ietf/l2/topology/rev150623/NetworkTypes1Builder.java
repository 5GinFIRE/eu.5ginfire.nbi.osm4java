package ns.yang.ietf.l2.topology.rev150623;

import com.google.common.base.MoreObjects;

import ns.yang.ietf.l2.topology.rev150623.l2.network.type.L2Network;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link NetworkTypes1} instances.
 * 
 * @see NetworkTypes1
 *
 */
public class NetworkTypes1Builder implements Builder<NetworkTypes1> {

	private L2Network _l2Network;

	public NetworkTypes1Builder() {
	}

	public NetworkTypes1Builder(
			ns.yang.ietf.l2.topology.rev150623.L2NetworkType arg) {
		this._l2Network = arg.getL2Network();
	}

	public NetworkTypes1Builder(NetworkTypes1 base) {
		this._l2Network = base.getL2Network();
	}

	/**
	 * Set fields from given grouping argument. Valid argument is instance of one of
	 * following types:
	 * <ul>
	 * <li>model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NetworkType</li>
	 * </ul>
	 *
	 * @param arg grouping object
	 * @throws IllegalArgumentException if given argument is none of valid types
	 */
	public void fieldsFrom(DataObject arg) {
		boolean isValidArg = false;
		if (arg instanceof ns.yang.ietf.l2.topology.rev150623.L2NetworkType) {
			this._l2Network = ((ns.yang.ietf.l2.topology.rev150623.L2NetworkType) arg)
					.getL2Network();
			isValidArg = true;
		}
		CodeHelpers.validValue(isValidArg, arg,
				"[model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NetworkType]");
	}

	public L2Network getL2Network() {
		return _l2Network;
	}

	public NetworkTypes1Builder setL2Network(final L2Network value) {
		this._l2Network = value;
		return this;
	}

	@Override
	public NetworkTypes1 build() {
		return new NetworkTypes1Impl(this);
	}

	private static final class NetworkTypes1Impl implements NetworkTypes1 {

		@Override
		public Class<NetworkTypes1> getImplementedInterface() {
			return NetworkTypes1.class;
		}

		private final L2Network _l2Network;

		private NetworkTypes1Impl(NetworkTypes1Builder base) {
			this._l2Network = base.getL2Network();
		}

		@Override
		public L2Network getL2Network() {
			return _l2Network;
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
			result = prime * result + Objects.hashCode(_l2Network);

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
			if (!NetworkTypes1.class.equals(((DataObject) obj).getImplementedInterface())) {
				return false;
			}
			NetworkTypes1 other = (NetworkTypes1) obj;
			if (!Objects.equals(_l2Network, other.getL2Network())) {
				return false;
			}
			return true;
		}

		@Override
		public String toString() {
			final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("NetworkTypes1");
			CodeHelpers.appendValue(helper, "_l2Network", _l2Network);
			return helper.toString();
		}
	}

}
