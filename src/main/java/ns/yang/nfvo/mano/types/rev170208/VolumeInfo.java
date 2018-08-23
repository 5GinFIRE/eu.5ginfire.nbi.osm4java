package ns.yang.nfvo.mano.types.rev170208;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;

import ns.yang.nfvo.mano.types.rev170208.volume.info.VolumeSource;

import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.math.BigInteger;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Enumeration;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Grouping for Volume-info
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping volume-info {
 *   leaf description {
 *     type string;
 *   }
 *   leaf size {
 *     type uint64;
 *   }
 *   choice volume-source {
 *     case ephemeral {
 *       leaf ephemeral {
 *         type empty;
 *       }
 *     }
 *     case image {
 *       uses image-properties;
 *     }
 *   }
 *   leaf device-bus {
 *     type enumeration {
 *       enum ide;
 *       enum usb;
 *       enum virtio;
 *       enum scsi;
 *     }
 *   }
 *   leaf device-type {
 *     type enumeration {
 *       enum disk;
 *       enum cdrom;
 *       enum floppy;
 *       enum lun;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/volume-info</i>
 *
 */
public interface VolumeInfo
    extends
    DataObject
{


    public enum DeviceBus implements Enumeration {
        Ide(0, "ide"),
        
        Usb(1, "usb"),
        
        Virtio(2, "virtio"),
        
        Scsi(3, "scsi")
        ;
    
        private static final Map<String, DeviceBus> NAME_MAP;
        private static final Map<Integer, DeviceBus> VALUE_MAP;
    
        static {
            final Builder<String, DeviceBus> nb = ImmutableMap.builder();
            final Builder<Integer, DeviceBus> vb = ImmutableMap.builder();
            for (DeviceBus enumItem : DeviceBus.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private DeviceBus(int value, String name) {
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
         * @return corresponding DeviceBus item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<DeviceBus> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding DeviceBus item, or null if no such item exists
         */
        public static DeviceBus forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }
    
    public enum DeviceType implements Enumeration {
        Disk(0, "disk"),
        
        Cdrom(1, "cdrom"),
        
        Floppy(2, "floppy"),
        
        Lun(3, "lun")
        ;
    
        private static final Map<String, DeviceType> NAME_MAP;
        private static final Map<Integer, DeviceType> VALUE_MAP;
    
        static {
            final Builder<String, DeviceType> nb = ImmutableMap.builder();
            final Builder<Integer, DeviceType> vb = ImmutableMap.builder();
            for (DeviceType enumItem : DeviceType.values()) {
                vb.put(enumItem.value, enumItem);
                nb.put(enumItem.name, enumItem);
            }
    
            NAME_MAP = nb.build();
            VALUE_MAP = vb.build();
        }
    
        private final String name;
        private final int value;
    
        private DeviceType(int value, String name) {
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
         * @return corresponding DeviceType item, if present
         * @throws NullPointerException if name is null
         */
        public static Optional<DeviceType> forName(String name) {
            return Optional.ofNullable(NAME_MAP.get(Objects.requireNonNull(name)));
        }
    
        /**
         * Return the enumeration member whose {@link #getIntValue()} matches specified value.
         *
         * @param intValue integer value
         * @return corresponding DeviceType item, or null if no such item exists
         */
        public static DeviceType forValue(int intValue) {
            return VALUE_MAP.get(intValue);
        }
    }

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("volume-info");

    /**
     * Description for Volume
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    @Nullable
    String getDescription();
    
    /**
     * Size of disk in GB
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>size</code>, or <code>null</code> if not present
     */
    @Nullable
    BigInteger getSize();
    
    /**
     * Defines the source of the volume. Possible options are1. Ephemeral -- Empty 
     * disk2. Image -- Refer to image to be used for volume3. Volume -- Reference of 
     * pre-existing volume to be used
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.volume.info.VolumeSource</code> <code>volumeSource</code>, or <code>null</code> if not present
     */
    @Nullable
    VolumeSource getVolumeSource();
    
    /**
     * Type of disk-bus on which this disk is exposed to guest
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VolumeInfo.DeviceBus</code> <code>deviceBus</code>, or <code>null</code> if not present
     */
    @Nullable
    DeviceBus getDeviceBus();
    
    /**
     * The type of device as exposed to guest
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VolumeInfo.DeviceType</code> <code>deviceType</code>, or <code>null</code> if not present
     */
    @Nullable
    DeviceType getDeviceType();

}

