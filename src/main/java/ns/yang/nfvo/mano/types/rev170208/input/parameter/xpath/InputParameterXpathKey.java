package ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class InputParameterXpathKey
 implements Identifier<InputParameterXpath> {
    private static final long serialVersionUID = 1747200157883501749L;
    private final String _xpath;


    public InputParameterXpathKey(String _xpath) {
    
    
        this._xpath = _xpath;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public InputParameterXpathKey(InputParameterXpathKey source) {
        this._xpath = source._xpath;
    }


    public String getXpath() {
        return _xpath;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_xpath);
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
        InputParameterXpathKey other = (InputParameterXpathKey) obj;
        if (!Objects.equals(_xpath, other._xpath)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(InputParameterXpathKey.class);
        CodeHelpers.appendValue(helper, "_xpath", _xpath);
        return helper.toString();
    }
}

