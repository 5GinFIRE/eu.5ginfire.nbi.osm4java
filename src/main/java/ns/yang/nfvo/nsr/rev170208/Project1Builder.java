package ns.yang.nfvo.nsr.rev170208;
import com.google.common.base.MoreObjects;

import ns.yang.nfvo.nsr.rev170208.project.KeyPair;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link Project1} instances.
 * 
 * @see Project1
 *
 */
public class Project1Builder implements Builder<Project1> {

    private List<KeyPair> _keyPair;



    public Project1Builder() {
    }

    public Project1Builder(Project1 base) {
        this._keyPair = base.getKeyPair();
    }


    public List<KeyPair> getKeyPair() {
        return _keyPair;
    }

    public Project1Builder setKeyPair(final List<KeyPair> values) {
        this._keyPair = values;
        return this;
    }
    
    

    @Override
    public Project1 build() {
        return new Project1Impl(this);
    }

    private static final class Project1Impl implements Project1 {

        @Override
        public Class<Project1> getImplementedInterface() {
            return Project1.class;
        }

        private final List<KeyPair> _keyPair;


        private Project1Impl(Project1Builder base) {
            this._keyPair = base.getKeyPair();
        }

        @Override
        public List<KeyPair> getKeyPair() {
            return _keyPair;
        }

        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hashCode(_keyPair);
        
            hash = result;
            hashValid = true;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!Project1.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Project1 other = (Project1)obj;
            if (!Objects.equals(_keyPair, other.getKeyPair())) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Project1");
            CodeHelpers.appendValue(helper, "_keyPair", _keyPair);
            return helper.toString();
        }
    }

}
