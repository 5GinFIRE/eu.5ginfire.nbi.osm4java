package ns.yang.ietf.network.topology.rev150608;
import com.google.common.base.MoreObjects;

import ns.yang.ietf.network.topology.rev150608.network.Link;

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
 * Class that builds {@link Network1} instances.
 * 
 * @see Network1
 *
 */
public class Network1Builder implements Builder<Network1> {

    private List<Link> _link;



    public Network1Builder() {
    }

    public Network1Builder(Network1 base) {
        this._link = base.getLink();
    }


    public List<Link> getLink() {
        return _link;
    }

    public Network1Builder setLink(final List<Link> values) {
        this._link = values;
        return this;
    }
    
    

    @Override
    public Network1 build() {
        return new Network1Impl(this);
    }

    private static final class Network1Impl implements Network1 {

        @Override
        public Class<Network1> getImplementedInterface() {
            return Network1.class;
        }

        private final List<Link> _link;


        private Network1Impl(Network1Builder base) {
            this._link = base.getLink();
        }

        @Override
        public List<Link> getLink() {
            return _link;
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
            result = prime * result + Objects.hashCode(_link);
        
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
            if (!Network1.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Network1 other = (Network1)obj;
            if (!Objects.equals(_link, other.getLink())) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Network1");
            CodeHelpers.appendValue(helper, "_link", _link);
            return helper.toString();
        }
    }

}
