package yang.vnfd.vnfd.descriptor.scaling.group.descriptor;

import com.google.common.base.MoreObjects;

import ns.yang.nfvo.mano.types.rev170208.ScalingTrigger;

import java.lang.Override;
import java.lang.String;
import java.util.Objects;

import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class ScalingConfigActionKey implements Identifier<ScalingConfigAction> {
	private static final long serialVersionUID = -656924485068871764L;
	private final ScalingTrigger _trigger;

	public ScalingConfigActionKey(ScalingTrigger _trigger) {

		this._trigger = _trigger;
	}

	/**
	 * Creates a copy from Source Object.
	 *
	 * @param source Source object
	 */
	public ScalingConfigActionKey(ScalingConfigActionKey source) {
		this._trigger = source._trigger;
	}

	public ScalingTrigger getTrigger() {
		return _trigger;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Objects.hashCode(_trigger);
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
		ScalingConfigActionKey other = (ScalingConfigActionKey) obj;
		if (!Objects.equals(_trigger, other._trigger)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(ScalingConfigActionKey.class);
		CodeHelpers.appendValue(helper, "_trigger", _trigger);
		return helper.toString();
	}
}
