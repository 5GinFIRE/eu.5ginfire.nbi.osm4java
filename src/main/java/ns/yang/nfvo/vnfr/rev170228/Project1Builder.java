package ns.yang.nfvo.vnfr.rev170228;
import com.google.common.base.MoreObjects;

import ns.yang.nfvo.vnfr.rev170228.project.VnfrCatalog;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
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

    private VnfrCatalog _vnfrCatalog;



    public Project1Builder() {
    }

    public Project1Builder(Project1 base) {
        this._vnfrCatalog = base.getVnfrCatalog();
    }


    public VnfrCatalog getVnfrCatalog() {
        return _vnfrCatalog;
    }

    
    public Project1Builder setVnfrCatalog(final VnfrCatalog value) {
        this._vnfrCatalog = value;
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

        private final VnfrCatalog _vnfrCatalog;


        private Project1Impl(Project1Builder base) {
            this._vnfrCatalog = base.getVnfrCatalog();
        }

        @Override
        public VnfrCatalog getVnfrCatalog() {
            return _vnfrCatalog;
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
            result = prime * result + Objects.hashCode(_vnfrCatalog);
        
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
            if (!Objects.equals(_vnfrCatalog, other.getVnfrCatalog())) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Project1");
            CodeHelpers.appendValue(helper, "_vnfrCatalog", _vnfrCatalog);
            return helper.toString();
        }
    }

}
