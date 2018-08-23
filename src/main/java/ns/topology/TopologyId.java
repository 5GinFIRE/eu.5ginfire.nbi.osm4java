package ns.topology;
import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.lang.String;
import java.util.Objects;

import ns.yang.ietf.inet.types.rev100924.Uri;

public class TopologyId extends Uri
 implements Serializable {
    private static final long serialVersionUID = -358850802232777219L;


    @ConstructorProperties("value")
    public TopologyId(String _value) {
        super(_value);
    
        Objects.requireNonNull(_value, "Supplied value may not be null");
    
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public TopologyId(TopologyId source) {
        super(source);
    }
    /**
     * Creates a new instance from Uri
     *
     * @param source Source object
     */
    public TopologyId(Uri source) {
        super(source);
    }

    public static TopologyId getDefaultInstance(String defaultValue) {
        return new TopologyId(defaultValue);
    }





}

