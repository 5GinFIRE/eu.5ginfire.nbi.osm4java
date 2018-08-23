package yang.vnfd.vnfd.descriptor.vdu;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class AlarmKey
 implements Identifier<Alarm> {
    private static final long serialVersionUID = 6949511475175144069L;
    private final String _alarmId;


    public AlarmKey(String _alarmId) {
    
    
        this._alarmId = _alarmId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public AlarmKey(AlarmKey source) {
        this._alarmId = source._alarmId;
    }


    public String getAlarmId() {
        return _alarmId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_alarmId);
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
        AlarmKey other = (AlarmKey) obj;
        if (!Objects.equals(_alarmId, other._alarmId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(AlarmKey.class);
        CodeHelpers.appendValue(helper, "_alarmId", _alarmId);
        return helper.toString();
    }
}

