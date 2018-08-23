package ns.yang.ietf.inet.types.rev100924;
import com.google.common.base.MoreObjects;
import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.lang.Override;
import java.lang.Short;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;

public class Dscp
 implements Serializable {
    private static final long serialVersionUID = -6062481917342980428L;
    private final Short _value;

    private static void check_valueRange(final short value) {
        if (value >= (short)0 && value <= (short)63) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..63]]", value);
    }

    @ConstructorProperties("value")
    public Dscp(Short _value) {
        if (_value != null) {
            check_valueRange(_value);
        }
    
        Objects.requireNonNull(_value, "Supplied value may not be null");
    
        this._value = _value;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public Dscp(Dscp source) {
        this._value = source._value;
    }

    public static Dscp getDefaultInstance(String defaultValue) {
        return new Dscp(Short.valueOf(defaultValue));
    }

    public Short getValue() {
        return _value;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_value);
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
        Dscp other = (Dscp) obj;
        if (!Objects.equals(_value, other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(Dscp.class);
        CodeHelpers.appendValue(helper, "_value", _value);
        return helper.toString();
    }
}

