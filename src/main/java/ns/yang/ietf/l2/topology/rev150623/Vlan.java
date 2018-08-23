package ns.yang.ietf.l2.topology.rev150623;
import com.google.common.base.MoreObjects;
import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;

public class Vlan
 implements Serializable {
    private static final long serialVersionUID = -5068964126458796746L;
    private final Integer _value;

    private static void check_valueRange(final int value) {
        if (value >= 0 && value <= 4095) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4095]]", value);
    }

    @ConstructorProperties("value")
    public Vlan(Integer _value) {
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
    public Vlan(Vlan source) {
        this._value = source._value;
    }

    public static Vlan getDefaultInstance(String defaultValue) {
        return new Vlan(Integer.valueOf(defaultValue));
    }

    public Integer getValue() {
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
        Vlan other = (Vlan) obj;
        if (!Objects.equals(_value, other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(Vlan.class);
        CodeHelpers.appendValue(helper, "_value", _value);
        return helper.toString();
    }
}

