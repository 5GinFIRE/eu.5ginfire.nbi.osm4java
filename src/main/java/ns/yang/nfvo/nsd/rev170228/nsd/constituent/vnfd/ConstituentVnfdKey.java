package ns.yang.nfvo.nsd.rev170228.nsd.constituent.vnfd;

import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class ConstituentVnfdKey implements Identifier<ConstituentVnfd> {
	private static final long serialVersionUID = 5403978362043531679L;
	private final String _memberVnfIndex;

	public ConstituentVnfdKey(String _memberVnfIndex) {

		this._memberVnfIndex = _memberVnfIndex;
	}

	/**
	 * Creates a copy from Source Object.
	 *
	 * @param source Source object
	 */
	public ConstituentVnfdKey(ConstituentVnfdKey source) {
		this._memberVnfIndex = source._memberVnfIndex;
	}

	public String getMemberVnfIndex() {
		return _memberVnfIndex;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Objects.hashCode(_memberVnfIndex);
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
		ConstituentVnfdKey other = (ConstituentVnfdKey) obj;
		if (!Objects.equals(_memberVnfIndex, other._memberVnfIndex)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(ConstituentVnfdKey.class);
		CodeHelpers.appendValue(helper, "_memberVnfIndex", _memberVnfIndex);
		return helper.toString();
	}
}
