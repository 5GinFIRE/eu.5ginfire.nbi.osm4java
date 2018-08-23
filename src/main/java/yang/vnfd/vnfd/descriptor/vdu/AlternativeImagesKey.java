package yang.vnfd.vnfd.descriptor.vdu;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class AlternativeImagesKey
 implements Identifier<AlternativeImages> {
    private static final long serialVersionUID = -7720309248404653911L;
    private final String _vimType;


    public AlternativeImagesKey(String _vimType) {
    
    
        this._vimType = _vimType;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public AlternativeImagesKey(AlternativeImagesKey source) {
        this._vimType = source._vimType;
    }


    public String getVimType() {
        return _vimType;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_vimType);
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
        AlternativeImagesKey other = (AlternativeImagesKey) obj;
        if (!Objects.equals(_vimType, other._vimType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(AlternativeImagesKey.class);
        CodeHelpers.appendValue(helper, "_vimType", _vimType);
        return helper.toString();
    }
}

