package ns.yang.ietf.inet.types.rev100924;
import com.google.common.base.MoreObjects;
import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;

public class Ipv6FlowLabel
 implements Serializable {
    private static final long serialVersionUID = -7589288865525379836L;
    private final Long _value;

    private static void check_valueRange(final long value) {
        if (value >= 0L && value <= 1048575L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..1048575]]", value);
    }

    @ConstructorProperties("value")
    public Ipv6FlowLabel(Long _value) {
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
    public Ipv6FlowLabel(Ipv6FlowLabel source) {
        this._value = source._value;
    }

    public static Ipv6FlowLabel getDefaultInstance(String defaultValue) {
        return new Ipv6FlowLabel(Long.valueOf(defaultValue));
    }

    public Long getValue() {
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
        Ipv6FlowLabel other = (Ipv6FlowLabel) obj;
        if (!Objects.equals(_value, other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(Ipv6FlowLabel.class);
        CodeHelpers.appendValue(helper, "_value", _value);
        return helper.toString();
    }
}

