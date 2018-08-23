package ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.common;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class ScalingGroupKey
 implements Identifier<ScalingGroup> {
    private static final long serialVersionUID = -853169683027735152L;
    private final String _scalingGroupNameRef;


    public ScalingGroupKey(String _scalingGroupNameRef) {
    
    
        this._scalingGroupNameRef = _scalingGroupNameRef;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ScalingGroupKey(ScalingGroupKey source) {
        this._scalingGroupNameRef = source._scalingGroupNameRef;
    }


    public String getScalingGroupNameRef() {
        return _scalingGroupNameRef;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_scalingGroupNameRef);
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
        ScalingGroupKey other = (ScalingGroupKey) obj;
        if (!Objects.equals(_scalingGroupNameRef, other._scalingGroupNameRef)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(ScalingGroupKey.class);
        CodeHelpers.appendValue(helper, "_scalingGroupNameRef", _scalingGroupNameRef);
        return helper.toString();
    }
}

