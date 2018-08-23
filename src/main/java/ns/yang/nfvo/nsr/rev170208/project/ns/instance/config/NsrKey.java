package ns.yang.nfvo.nsr.rev170208.project.ns.instance.config;

import com.google.common.base.MoreObjects;

import ns.yang.ietf.yang.types.rev130715.Uuid;

import java.lang.Override;
import java.lang.String;
import java.util.Objects;

import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class NsrKey implements Identifier<Nsr> {
	private static final long serialVersionUID = -8261859079577359710L;
	private final Uuid _id;

	public NsrKey(Uuid _id) {

		this._id = _id;
	}

	/**
	 * Creates a copy from Source Object.
	 *
	 * @param source Source object
	 */
	public NsrKey(NsrKey source) {
		this._id = source._id;
	}

	public Uuid getId() {
		return _id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Objects.hashCode(_id);
		return result;
	}

	@Override
	public boolean equals(java.lang.Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		NsrKey other = (NsrKey) obj;
		if (!Objects.equals(_id, other._id)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(NsrKey.class);
		CodeHelpers.appendValue(helper, "_id", _id);
		return helper.toString();
	}
}
