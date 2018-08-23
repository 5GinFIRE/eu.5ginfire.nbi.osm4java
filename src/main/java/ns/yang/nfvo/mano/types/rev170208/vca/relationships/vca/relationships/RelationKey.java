package ns.yang.nfvo.mano.types.rev170208.vca.relationships.vca.relationships;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class RelationKey
 implements Identifier<Relation> {
    private static final long serialVersionUID = 1055691159706191884L;
    private final String _requires;
    private final String _provides;


    public RelationKey(String _provides, String _requires) {
    
    
        this._requires = _requires;
        this._provides = _provides;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public RelationKey(RelationKey source) {
        this._requires = source._requires;
        this._provides = source._provides;
    }


    public String getRequires() {
        return _requires;
    }
    
    public String getProvides() {
        return _provides;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_requires);
        result = prime * result + Objects.hashCode(_provides);
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
        RelationKey other = (RelationKey) obj;
        if (!Objects.equals(_requires, other._requires)) {
            return false;
        }
        if (!Objects.equals(_provides, other._provides)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(RelationKey.class);
        CodeHelpers.appendValue(helper, "_requires", _requires);
        CodeHelpers.appendValue(helper, "_provides", _provides);
        return helper.toString();
    }
}

