package ns.yang.ietf.yang.types.rev130715;
import com.google.common.base.MoreObjects;
import com.google.common.collect.Range;
import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.lang.Override;
import java.lang.String;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;

public class Gauge64
 implements Serializable {
    private static final long serialVersionUID = 5150183143609367620L;
    private final BigInteger _value;

    private static final Range<java.math.BigInteger>[] CHECK_VALUERANGE_RANGES;
    static {
        @SuppressWarnings("unchecked")
        final Range<java.math.BigInteger>[] a = (Range<java.math.BigInteger>[]) Array.newInstance(Range.class, 1);
        a[0] = Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
        CHECK_VALUERANGE_RANGES = a;
    }
    private static void check_valueRange(final java.math.BigInteger value) {
        for (Range<java.math.BigInteger> r : CHECK_VALUERANGE_RANGES) {
            if (r.contains(value)) {
                return;
            }
        }
        CodeHelpers.throwInvalidRange(CHECK_VALUERANGE_RANGES, value);
    }

    @ConstructorProperties("value")
    public Gauge64(BigInteger _value) {
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
    public Gauge64(Gauge64 source) {
        this._value = source._value;
    }

    public static Gauge64 getDefaultInstance(String defaultValue) {
        return new Gauge64(new BigInteger(defaultValue));
    }

    public BigInteger getValue() {
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
        Gauge64 other = (Gauge64) obj;
        if (!Objects.equals(_value, other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(Gauge64.class);
        CodeHelpers.appendValue(helper, "_value", _value);
        return helper.toString();
    }
}

