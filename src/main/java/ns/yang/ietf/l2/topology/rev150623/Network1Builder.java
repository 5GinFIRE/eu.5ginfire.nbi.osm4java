package ns.yang.ietf.l2.topology.rev150623;
import com.google.common.base.MoreObjects;

import ns.yang.ietf.l2.topology.rev150623.l2.network.attributes.L2NetworkAttributes;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
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

    private L2NetworkAttributes _l2NetworkAttributes;



    public Network1Builder() {
    }
    public Network1Builder(ns.yang.ietf.l2.topology.rev150623.L2NetworkAttributes arg) {
        this._l2NetworkAttributes = arg.getL2NetworkAttributes();
    }

    public Network1Builder(Network1 base) {
        this._l2NetworkAttributes = base.getL2NetworkAttributes();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NetworkAttributes</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ns.yang.ietf.l2.topology.rev150623.L2NetworkAttributes) {
            this._l2NetworkAttributes = ((ns.yang.ietf.l2.topology.rev150623.L2NetworkAttributes)arg).getL2NetworkAttributes();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2NetworkAttributes]");
    }

    public L2NetworkAttributes getL2NetworkAttributes() {
        return _l2NetworkAttributes;
    }

    
    public Network1Builder setL2NetworkAttributes(final L2NetworkAttributes value) {
        this._l2NetworkAttributes = value;
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

        private final L2NetworkAttributes _l2NetworkAttributes;


        private Network1Impl(Network1Builder base) {
            this._l2NetworkAttributes = base.getL2NetworkAttributes();
        }

        @Override
        public L2NetworkAttributes getL2NetworkAttributes() {
            return _l2NetworkAttributes;
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
            result = prime * result + Objects.hashCode(_l2NetworkAttributes);
        
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
            if (!Objects.equals(_l2NetworkAttributes, other.getL2NetworkAttributes())) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Network1");
            CodeHelpers.appendValue(helper, "_l2NetworkAttributes", _l2NetworkAttributes);
            return helper.toString();
        }
    }

}
