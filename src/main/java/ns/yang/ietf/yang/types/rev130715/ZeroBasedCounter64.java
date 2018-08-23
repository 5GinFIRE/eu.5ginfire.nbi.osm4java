package ns.yang.ietf.yang.types.rev130715;
import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Objects;

public class ZeroBasedCounter64 extends Counter64
 implements Serializable {
    private static final long serialVersionUID = -4163687090528367476L;


    @ConstructorProperties("value")
    public ZeroBasedCounter64(BigInteger _value) {
        super(_value);
    
        Objects.requireNonNull(_value, "Supplied value may not be null");
    
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ZeroBasedCounter64(ZeroBasedCounter64 source) {
        super(source);
    }
    /**
     * Creates a new instance from Counter64
     *
     * @param source Source object
     */
    public ZeroBasedCounter64(Counter64 source) {
        super(source);
    }

    public static ZeroBasedCounter64 getDefaultInstance(String defaultValue) {
        return new ZeroBasedCounter64(new BigInteger(defaultValue));
    }





}

