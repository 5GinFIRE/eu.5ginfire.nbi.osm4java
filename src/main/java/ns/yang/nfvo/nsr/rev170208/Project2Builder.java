package ns.yang.nfvo.nsr.rev170208;
import com.google.common.base.MoreObjects;

import ns.yang.nfvo.nsr.rev170208.project.NsInstanceConfig;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link Project2} instances.
 * 
 * @see Project2
 *
 */
public class Project2Builder implements Builder<Project2> {

    private NsInstanceConfig _nsInstanceConfig;



    public Project2Builder() {
    }

    public Project2Builder(Project2 base) {
        this._nsInstanceConfig = base.getNsInstanceConfig();
    }


    public NsInstanceConfig getNsInstanceConfig() {
        return _nsInstanceConfig;
    }

    
    public Project2Builder setNsInstanceConfig(final NsInstanceConfig value) {
        this._nsInstanceConfig = value;
        return this;
    }
    

    @Override
    public Project2 build() {
        return new Project2Impl(this);
    }

    private static final class Project2Impl implements Project2 {

        @Override
        public Class<Project2> getImplementedInterface() {
            return Project2.class;
        }

        private final NsInstanceConfig _nsInstanceConfig;


        private Project2Impl(Project2Builder base) {
            this._nsInstanceConfig = base.getNsInstanceConfig();
        }

        @Override
        public NsInstanceConfig getNsInstanceConfig() {
            return _nsInstanceConfig;
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
            result = prime * result + Objects.hashCode(_nsInstanceConfig);
        
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
            if (!Project2.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Project2 other = (Project2)obj;
            if (!Objects.equals(_nsInstanceConfig, other.getNsInstanceConfig())) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Project2");
            CodeHelpers.appendValue(helper, "_nsInstanceConfig", _nsInstanceConfig);
            return helper.toString();
        }
    }

}
