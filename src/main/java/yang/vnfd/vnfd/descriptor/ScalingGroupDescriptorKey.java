package yang.vnfd.vnfd.descriptor;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class ScalingGroupDescriptorKey
 implements Identifier<ScalingGroupDescriptor> {
    private static final long serialVersionUID = 1071512605706250128L;
    private final String _name;


    public ScalingGroupDescriptorKey(String _name) {
    
    
        this._name = _name;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ScalingGroupDescriptorKey(ScalingGroupDescriptorKey source) {
        this._name = source._name;
    }


    public String getName() {
        return _name;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_name);
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
        ScalingGroupDescriptorKey other = (ScalingGroupDescriptorKey) obj;
        if (!Objects.equals(_name, other._name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(ScalingGroupDescriptorKey.class);
        CodeHelpers.appendValue(helper, "_name", _name);
        return helper.toString();
    }
}

