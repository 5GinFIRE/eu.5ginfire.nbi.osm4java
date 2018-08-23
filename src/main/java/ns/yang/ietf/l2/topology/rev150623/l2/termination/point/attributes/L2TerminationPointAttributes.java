package ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;

import ns.yang.ietf.l2.topology.rev150623.$YangModuleInfoImpl;
import ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.L2TerminationPointType;

import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Enumeration;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Containing L2 TP attributes
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-l2-topology</b>
 * <pre>
 * container l2-termination-point-attributes {
 *   leaf description {
 *     type string;
 *   }
 *   leaf maximum-frame-size {
 *     type uint32;
 *   }
 *   choice l2-termination-point-type {
 *     case ethernet {
 *       leaf mac-address {
 *         type yang:mac-address;
 *       }
 *       leaf eth-encapsulation {
 *         type identityref {
 *           base eth-encapsulation-type;
 *         }
 *       }
 *       leaf port-vlan-id {
 *         if-feature VLAN;
 *         type vlan;
 *       }
 *       list vlan-id-name {
 *         if-feature VLAN;
 *         key vlan-id;
 *         leaf vlan-id {
 *           type vlan;
 *         }
 *         leaf vlan-name {
 *           type string;
 *         }
 *       }
 *     }
 *     case legacy {
 *       leaf encapsulation {
 *         type identityref {
 *           base encapsulation-type;
 *         }
 *       }
 *     }
 *   }
 *   leaf tp-state {
 *     type enumeration {
 *       enum in-use {
 *         value 0;
 *       }
 *       enum blocking {
 *         value 1;
 *       }
 *       enum down {
 *         value 2;
 *       }
 *       enum others {
 *         value 3;
 *       }
 *     }
 *     config false;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>ietf-l2-topology/l2-termination-point-attributes/l2-termination-point-attributes</i>
 * 
 * <p>To create instances of this class use {@link L2TerminationPointAttributesBuilder}.
 * @see L2TerminationPointAttributesBuilder
 *
 */
public interface L2TerminationPointAttributes
    extends
    ChildOf<ns.yang.ietf.l2.topology.rev150623.L2TerminationPointAttributes>,
    Augmentable<L2TerminationPointAttributes>
{


    public enum TpState implements Enumeration {
        /**
         * the termination point is in forwarding state
         *
         */
        InUse(0, "in-use"),
        
        /**
         * the termination point is in blocking state
         *
         */
        Blocking(1, "blocking"),
        
        /**
         * the termination point is in down state
         *
         */
        Down(2, "down"),
        
        /**
         * the termination point is in other state
         *
         */
        Others(3, "others")
        ;
    
        private static final Map<String, TpState> NAME_MAP;
        private static final Map<Integer, TpState> VALUE_MAP;
    
        static {
            final Builder<String, TpState> nb = ImmutableMap.builder();
            final Builder<Integer, TpState> vb = ImmutableMap.builder();
            for (TpState enumItem : TpState.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private TpState(int value, String name) {
            this.value = value;
            this.name = name;
        }
    
        @Override
        public String getName() {
            return name;
        }
    
        @Override
        public int getIntValue() {
            return value;
        }
    
        /**
         * Return the enumeration member whose {@link #getName()} matches specified value.
         *
         * @param name YANG assigned name
         * @return corresponding TpState item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<TpState> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding TpState item, or null if no such item exists
         */
        public static TpState forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("l2-termination-point-attributes");

    /**
     * Port description
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    @Nullable
    String getDescription();
    
    /**
     * Maximum frame size
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>maximumFrameSize</code>, or <code>null</code> if not present
     */
    @Nullable
    Long getMaximumFrameSize();
    
    /**
     * Indicates termination-point typespecific attributes
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.l2.termination.point.attributes.L2TerminationPointType</code> <code>l2TerminationPointType</code>, or <code>null</code> if not present
     */
    @Nullable
    L2TerminationPointType getL2TerminationPointType();
    
    /**
     * State of the termination point
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.l2.topology.rev150623.l2.termination.point.attributes.L2TerminationPointAttributes.TpState</code> <code>tpState</code>, or <code>null</code> if not present
     */
    @Nullable
    TpState getTpState();

}

