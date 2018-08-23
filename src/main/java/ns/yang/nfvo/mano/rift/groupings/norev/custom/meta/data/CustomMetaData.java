package ns.yang.nfvo.mano.rift.groupings.norev.custom.meta.data;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;

import ns.yang.nfvo.mano.rift.groupings.norev.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.MetaDataType;

import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Enumeration;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of meta-data to be associated with the instance
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-rift-groupings</b>
 * <pre>
 * list custom-meta-data {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   leaf data-type {
 *     type manotypes:meta-data-type;
 *     default STRING;
 *   }
 *   leaf value {
 *     type string;
 *   }
 *   leaf destination {
 *     type enumeration {
 *       enum CLOUD_INIT;
 *       enum CLOUD_METADATA;
 *     }
 *     default CLOUD_METADATA;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-rift-groupings/custom-meta-data/custom-meta-data</i>
 * 
 * <p>To create instances of this class use {@link CustomMetaDataBuilder}.
 * @see CustomMetaDataBuilder
 * @see CustomMetaDataKey
 *
 */
public interface CustomMetaData
    extends
    ChildOf<ns.yang.nfvo.mano.rift.groupings.norev.CustomMetaData>,
    Augmentable<CustomMetaData>,
    Identifiable<CustomMetaDataKey>
{


    public enum Destination implements Enumeration {
        CLOUDINIT(0, "CLOUD_INIT"),
        
        CLOUDMETADATA(1, "CLOUD_METADATA")
        ;
    
        private static final Map<String, Destination> NAME_MAP;
        private static final Map<Integer, Destination> VALUE_MAP;
    
        static {
            final Builder<String, Destination> nb = ImmutableMap.builder();
            final Builder<Integer, Destination> vb = ImmutableMap.builder();
            for (Destination enumItem : Destination.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private Destination(int value, String name) {
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
         * @return corresponding Destination item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<Destination> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding Destination item, or null if no such item exists
         */
        public static Destination forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("custom-meta-data");

    /**
     * Name of the meta-data parameter
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * Data-type the meta-data parameter
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.MetaDataType</code> <code>dataType</code>, or <code>null</code> if not present
     */
    @Nullable
    MetaDataType getDataType();
    
    /**
     * Value of the meta-data parameter
     *
     *
     *
     * @return <code>java.lang.String</code> <code>value</code>, or <code>null</code> if not present
     */
    @Nullable
    String getValue();
    
    /**
     * Type of input parameter
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.rift.groupings.norev.custom.meta.data.CustomMetaData.Destination</code> <code>destination</code>, or <code>null</code> if not present
     */
    @Nullable
    Destination getDestination();
    
    @Override
    CustomMetaDataKey key();

}

