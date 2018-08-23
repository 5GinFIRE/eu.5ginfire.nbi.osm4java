package yang.base.nsd.descriptor.common.scaling.group.descriptor;

import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class VnfdMemberKey implements Identifier<VnfdMember> {
	private static final long serialVersionUID = -3252525076835844968L;
	private final String _memberVnfIndexRef;

	public VnfdMemberKey(String _memberVnfIndexRef) {

		this._memberVnfIndexRef = _memberVnfIndexRef;
	}

	/**
	 * Creates a copy from Source Object.
	 *
	 * @param source Source object
	 */
	public VnfdMemberKey(VnfdMemberKey source) {
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
		VnfdMemberKey other = (VnfdMemberKey) obj;
		if (!Objects.equals(_memberVnfIndexRef, other._memberVnfIndexRef)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(VnfdMemberKey.class);
		CodeHelpers.appendValue(helper, "_memberVnfIndexRef", _memberVnfIndexRef);
		return helper.toString();
	}
}
