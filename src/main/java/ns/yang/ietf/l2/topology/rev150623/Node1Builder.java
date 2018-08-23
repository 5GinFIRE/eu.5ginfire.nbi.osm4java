package ns.yang.ietf.l2.topology.rev150623;
import com.google.common.base.MoreObjects;

import ns.yang.ietf.l2.topology.rev150623.l2.node.attributes.L2NodeAttributes;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
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

    private L2NodeAttributes _l2NodeAttributes;



    public Node1Builder() {
    }
    public Node1Builder(ns.yang.ietf.l2.topology.rev150623.L2NodeAttributes arg) {
        this._l2NodeAttributes = arg.getL2NodeAttributes();
    }

    public Node1Builder(Node1 base) {
        this._l2NodeAttributes = base.getL2NodeAttributes();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NodeAttributes</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ns.yang.ietf.l2.topology.rev150623.L2NodeAttributes) {
            this._l2NodeAttributes = ((ns.yang.ietf.l2.topology.rev150623.L2NodeAttributes)arg).getL2NodeAttributes();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NodeAttributes]");
    }

    public L2NodeAttributes getL2NodeAttributes() {
        return _l2NodeAttributes;
    }

    
    public Node1Builder setL2NodeAttributes(final L2NodeAttributes value) {
        this._l2NodeAttributes = value;
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

        private final L2NodeAttributes _l2NodeAttributes;


        private Node1Impl(Node1Builder base) {
            this._l2NodeAttributes = base.getL2NodeAttributes();
        }

        @Override
        public L2NodeAttributes getL2NodeAttributes() {
            return _l2NodeAttributes;
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
            result = prime * result + Objects.hashCode(_l2NodeAttributes);
        
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
            if (!Objects.equals(_l2NodeAttributes, other.getL2NodeAttributes())) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Node1");
            CodeHelpers.appendValue(helper, "_l2NodeAttributes", _l2NodeAttributes);
            return helper.toString();
        }
    }

}
