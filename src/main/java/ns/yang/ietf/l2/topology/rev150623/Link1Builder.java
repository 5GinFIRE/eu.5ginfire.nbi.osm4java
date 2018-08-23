package ns.yang.ietf.l2.topology.rev150623;
import com.google.common.base.MoreObjects;

import ns.yang.ietf.l2.topology.rev150623.l2.link.attributes.L2LinkAttributes;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link Link1} instances.
 * 
 * @see Link1
 *
 */
public class Link1Builder implements Builder<Link1> {

    private L2LinkAttributes _l2LinkAttributes;



    public Link1Builder() {
    }
    public Link1Builder(ns.yang.ietf.l2.topology.rev150623.L2LinkAttributes arg) {
        this._l2LinkAttributes = arg.getL2LinkAttributes();
    }

    public Link1Builder(Link1 base) {
        this._l2LinkAttributes = base.getL2LinkAttributes();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkAttributes</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ns.yang.ietf.l2.topology.rev150623.L2LinkAttributes) {
            this._l2LinkAttributes = ((ns.yang.ietf.l2.topology.rev150623.L2LinkAttributes)arg).getL2LinkAttributes();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2LinkAttributes]");
    }

    public L2LinkAttributes getL2LinkAttributes() {
        return _l2LinkAttributes;
    }

    
    public Link1Builder setL2LinkAttributes(final L2LinkAttributes value) {
        this._l2LinkAttributes = value;
        return this;
    }
    

    @Override
    public Link1 build() {
        return new Link1Impl(this);
    }

    private static final class Link1Impl implements Link1 {

        @Override
        public Class<Link1> getImplementedInterface() {
            return Link1.class;
        }

        private final L2LinkAttributes _l2LinkAttributes;


        private Link1Impl(Link1Builder base) {
            this._l2LinkAttributes = base.getL2LinkAttributes();
        }

        @Override
        public L2LinkAttributes getL2LinkAttributes() {
            return _l2LinkAttributes;
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
            result = prime * result + Objects.hashCode(_l2LinkAttributes);
        
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
            if (!Link1.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Link1 other = (Link1)obj;
            if (!Objects.equals(_l2LinkAttributes, other.getL2LinkAttributes())) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Link1");
            CodeHelpers.appendValue(helper, "_l2LinkAttributes", _l2LinkAttributes);
            return helper.toString();
        }
    }

}
