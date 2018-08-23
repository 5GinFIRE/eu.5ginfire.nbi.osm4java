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

public class YangIdentifier
 implements Serializable {
    private static final long serialVersionUID = 7734916821492871556L;
    public static final List<String> PATTERN_CONSTANTS = ImmutableList.of("^(?:.|..|[^xX].*|.[^mM].*|..[^lL].*)$", "^(?:[a-zA-Z_][a-zA-Z0-9\\-_.]*)$");
    private static final Pattern[] patterns = CodeHelpers.compilePatterns(PATTERN_CONSTANTS);
    private static final String[] regexes = { ".|..|[^xX].*|.[^mM].*|..[^lL].*", "[a-zA-Z_][a-zA-Z0-9\\-_.]*" };
    private final String _value;

    private static void check_valueLength(final String value) {
        final int length = value.length();
        if (length >= 1) {
            return;
        }
        CodeHelpers.throwInvalidLength("[[1..2147483647]]", value);
    }

    @ConstructorProperties("value")
    public YangIdentifier(String _value) {
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
    public YangIdentifier(YangIdentifier source) {
        this._value = source._value;
    }

    public static YangIdentifier getDefaultInstance(String defaultValue) {
        return new YangIdentifier(defaultValue);
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
        YangIdentifier other = (YangIdentifier) obj;
        if (!Objects.equals(_value, other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(YangIdentifier.class);
        CodeHelpers.appendValue(helper, "_value", _value);
        return helper.toString();
    }
}

