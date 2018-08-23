package ns.yang.ietf.yang.types.rev130715;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;

public class MacAddress
 implements Serializable {
    private static final long serialVersionUID = -8041141443619966138L;
    public static final List<String> PATTERN_CONSTANTS = ImmutableList.of("^(?:[0-9a-fA-F]{2}(:[0-9a-fA-F]{2}){5})$");
    private static final Pattern patterns = Pattern.compile(PATTERN_CONSTANTS.get(0));
    private static final String regexes = "[0-9a-fA-F]{2}(:[0-9a-fA-F]{2}){5}";
    private final String _value;

    private static void check_valueLength(final String value) {
    }

    @ConstructorProperties("value")
    public MacAddress(String _value) {
        if (_value != null) {
            check_valueLength(_value);
        }
    
        Objects.requireNonNull(_value, "Supplied value may not be null");
        CodeHelpers.checkPattern(_value, patterns, regexes);
    
        this._value = _value;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public MacAddress(MacAddress source) {
        this._value = source._value;
    }

    public static MacAddress getDefaultInstance(String defaultValue) {
        return new MacAddress(defaultValue);
    }

    public String getValue() {
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
        MacAddress other = (MacAddress) obj;
        if (!Objects.equals(_value, other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(MacAddress.class);
        CodeHelpers.appendValue(helper, "_value", _value);
        return helper.toString();
    }
}

