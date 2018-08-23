package ns.yang.ietf.network.topology.rev150608;
import com.google.common.base.MoreObjects;

import ns.yang.ietf.network.topology.rev150608.network.node.TerminationPoint;

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
 * Class that builds {@link Node1} instances.
 * 
 * @see Node1
 *
 */
public class Node1Builder implements Builder<Node1> {

    private List<TerminationPoint> _terminationPoint;



    public Node1Builder() {
    }

    public Node1Builder(Node1 base) {
        this._terminationPoint = base.getTerminationPoint();
    }


    public List<TerminationPoint> getTerminationPoint() {
        return _terminationPoint;
    }

    public Node1Builder setTerminationPoint(final List<TerminationPoint> values) {
        this._terminationPoint = values;
        return this;
    }
    
    

    @Override
    public Node1 build() {
        return new Node1Impl(this);
    }

    private static final class Node1Impl implements Node1 {

        @Override
        public Class<Node1> getImplementedInterface() {
            return Node1.class;
        }

        private final List<TerminationPoint> _terminationPoint;


        private Node1Impl(Node1Builder base) {
            this._terminationPoint = base.getTerminationPoint();
        }

        @Override
        public List<TerminationPoint> getTerminationPoint() {
            return _terminationPoint;
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
            result = prime * result + Objects.hashCode(_terminationPoint);
        
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
            if (!Node1.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Node1 other = (Node1)obj;
            if (!Objects.equals(_terminationPoint, other.getTerminationPoint())) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Node1");
            CodeHelpers.appendValue(helper, "_terminationPoint", _terminationPoint);
            return helper.toString();
        }
    }

}
