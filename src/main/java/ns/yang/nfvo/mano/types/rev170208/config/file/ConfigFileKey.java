package ns.yang.nfvo.mano.types.rev170208.config.file;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class ConfigFileKey
 implements Identifier<ConfigFile> {
    private static final long serialVersionUID = 238596725262371840L;
    private final String _source;


    public ConfigFileKey(String _source) {
    
    
        this._source = _source;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ConfigFileKey(ConfigFileKey source) {
        this._source = source._source;
    }


    public String getSource() {
        return _source;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_source);
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
        ConfigFileKey other = (ConfigFileKey) obj;
        if (!Objects.equals(_source, other._source)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(ConfigFileKey.class);
        CodeHelpers.appendValue(helper, "_source", _source);
        return helper.toString();
    }
}

