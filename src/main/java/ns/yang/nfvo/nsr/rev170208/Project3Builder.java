package ns.yang.nfvo.nsr.rev170208;
import com.google.common.base.MoreObjects;

import ns.yang.nfvo.nsr.rev170208.project.NsInstanceOpdata;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link Project3} instances.
 * 
 * @see Project3
 *
 */
public class Project3Builder implements Builder<Project3> {

    private NsInstanceOpdata _nsInstanceOpdata;



    public Project3Builder() {
    }

    public Project3Builder(Project3 base) {
        this._nsInstanceOpdata = base.getNsInstanceOpdata();
    }


    public NsInstanceOpdata getNsInstanceOpdata() {
        return _nsInstanceOpdata;
    }

    
    public Project3Builder setNsInstanceOpdata(final NsInstanceOpdata value) {
        this._nsInstanceOpdata = value;
        return this;
    }
    

    @Override
    public Project3 build() {
        return new Project3Impl(this);
    }

    private static final class Project3Impl implements Project3 {

        @Override
        public Class<Project3> getImplementedInterface() {
            return Project3.class;
        }

        private final NsInstanceOpdata _nsInstanceOpdata;


        private Project3Impl(Project3Builder base) {
            this._nsInstanceOpdata = base.getNsInstanceOpdata();
        }

        @Override
        public NsInstanceOpdata getNsInstanceOpdata() {
            return _nsInstanceOpdata;
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
            result = prime * result + Objects.hashCode(_nsInstanceOpdata);
        
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
            if (!Project3.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Project3 other = (Project3)obj;
            if (!Objects.equals(_nsInstanceOpdata, other.getNsInstanceOpdata())) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Project3");
            CodeHelpers.appendValue(helper, "_nsInstanceOpdata", _nsInstanceOpdata);
            return helper.toString();
        }
    }

}
