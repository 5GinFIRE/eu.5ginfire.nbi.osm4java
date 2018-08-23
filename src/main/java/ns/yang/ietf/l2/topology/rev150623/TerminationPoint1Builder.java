package ns.yang.ietf.l2.topology.rev150623;
import com.google.common.base.MoreObjects;

import ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes;

import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link TerminationPoint1} instances.
 * 
 * @see TerminationPoint1
 *
 */
public class TerminationPoint1Builder implements Builder<TerminationPoint1> {

    private L2TerminationPointAttributes _l2TerminationPointAttributes;



    public TerminationPoint1Builder() {
    }
    public TerminationPoint1Builder(ns.yang.ietf.l2.topology.rev150623.L2TerminationPointAttributes arg) {
        this._l2TerminationPointAttributes = arg.getL2TerminationPointAttributes();
    }

    public TerminationPoint1Builder(TerminationPoint1 base) {
        this._l2TerminationPointAttributes = base.getL2TerminationPointAttributes();
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointAttributes</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof ns.yang.ietf.l2.topology.rev150623.L2TerminationPointAttributes) {
            this._l2TerminationPointAttributes = ((ns.yang.ietf.l2.topology.rev150623.L2TerminationPointAttributes)arg).getL2TerminationPointAttributes();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.L2TerminationPointAttributes]");
    }

    public L2TerminationPointAttributes getL2TerminationPointAttributes() {
        return _l2TerminationPointAttributes;
    }

    
    public TerminationPoint1Builder setL2TerminationPointAttributes(final L2TerminationPointAttributes value) {
        this._l2TerminationPointAttributes = value;
        return this;
    }
    

    @Override
    public TerminationPoint1 build() {
        return new TerminationPoint1Impl(this);
    }

    private static final class TerminationPoint1Impl implements TerminationPoint1 {

        @Override
        public Class<TerminationPoint1> getImplementedInterface() {
            return TerminationPoint1.class;
        }

        private final L2TerminationPointAttributes _l2TerminationPointAttributes;


        private TerminationPoint1Impl(TerminationPoint1Builder base) {
            this._l2TerminationPointAttributes = base.getL2TerminationPointAttributes();
        }

        @Override
        public L2TerminationPointAttributes getL2TerminationPointAttributes() {
            return _l2TerminationPointAttributes;
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
            result = prime * result + Objects.hashCode(_l2TerminationPointAttributes);
        
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
            if (!TerminationPoint1.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            TerminationPoint1 other = (TerminationPoint1)obj;
            if (!Objects.equals(_l2TerminationPointAttributes, other.getL2TerminationPointAttributes())) {
                return false;
            }
            return true;
        }

        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("TerminationPoint1");
            CodeHelpers.appendValue(helper, "_l2TerminationPointAttributes", _l2TerminationPointAttributes);
            return helper.toString();
        }
    }

}
