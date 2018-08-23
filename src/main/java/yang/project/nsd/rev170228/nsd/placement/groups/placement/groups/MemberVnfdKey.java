package yang.project.nsd.rev170228.nsd.placement.groups.placement.groups;

import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class MemberVnfdKey implements Identifier<MemberVnfd> {
	private static final long serialVersionUID = 519011361002322048L;
	private final String _memberVnfIndexRef;

	public MemberVnfdKey(String _memberVnfIndexRef) {

		this._memberVnfIndexRef = _memberVnfIndexRef;
	}

	/**
	 * Creates a copy from Source Object.
	 *
	 * @param source Source object
	 */
	public MemberVnfdKey(MemberVnfdKey source) {
		this._memberVnfIndexRef = source._memberVnfIndexRef;
	}

	public String getMemberVnfIndexRef() {
		return _memberVnfIndexRef;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Objects.hashCode(_memberVnfIndexRef);
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
		MemberVnfdKey other = (MemberVnfdKey) obj;
		if (!Objects.equals(_memberVnfIndexRef, other._memberVnfIndexRef)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(MemberVnfdKey.class);
		CodeHelpers.appendValue(helper, "_memberVnfIndexRef", _memberVnfIndexRef);
		return helper.toString();
	}
}
