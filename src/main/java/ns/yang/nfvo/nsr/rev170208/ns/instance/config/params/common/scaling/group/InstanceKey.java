package ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common.scaling.group;

import com.google.common.base.MoreObjects;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class InstanceKey implements Identifier<Instance> {
	private static final long serialVersionUID = 4078509346566946712L;
	private final Integer _id;

	public InstanceKey(Integer _id) {

		this._id = _id;
	}

	/**
	 * Creates a copy from Source Object.
	 *
	 * @param source Source object
	 */
	public InstanceKey(InstanceKey source) {
		this._id = source._id;
	}

	public Integer getId() {
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
		InstanceKey other = (InstanceKey) obj;
		if (!Objects.equals(_id, other._id)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(InstanceKey.class);
		CodeHelpers.appendValue(helper, "_id", _id);
		return helper.toString();
	}
}
