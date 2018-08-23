package ns.yang.ietf.yang.types.rev130715;
import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.lang.Long;
import java.util.Objects;

public class Timestamp extends Timeticks
 implements Serializable {
    private static final long serialVersionUID = -1618618198504997448L;


    @ConstructorProperties("value")
    public Timestamp(Long _value) {
        super(_value);
    
        Objects.requireNonNull(_value, "Supplied value may not be null");
    
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public Timestamp(Timestamp source) {
        super(source);
    }
    /**
     * Creates a new instance from Timeticks
     *
     * @param source Source object
     */
    public Timestamp(Timeticks source) {
        super(source);
    }

    public static Timestamp getDefaultInstance(String defaultValue) {
        return new Timestamp(Long.valueOf(defaultValue));
    }





}

