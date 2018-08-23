package ns.yang.nfvo.mano.types.rev170208;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * EPA attributes for the guest
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping guest-epa {
 *   container guest-epa {
 *     leaf trusted-execution {
 *       type boolean;
 *     }
 *     leaf mempage-size {
 *       type enumeration {
 *         enum LARGE;
 *         enum SMALL;
 *         enum SIZE_2MB;
 *         enum SIZE_1GB;
 *         enum PREFER_LARGE;
 *       }
 *     }
 *     leaf cpu-pinning-policy {
 *       type enumeration {
 *         enum DEDICATED;
 *         enum SHARED;
 *         enum ANY;
 *       }
 *       default ANY;
 *     }
 *     leaf cpu-thread-pinning-policy {
 *       type enumeration {
 *         enum AVOID;
 *         enum SEPARATE;
 *         enum ISOLATE;
 *         enum PREFER;
 *       }
 *     }
 *     list pcie-device {
 *       key device-id;
 *       leaf device-id {
 *         type string;
 *       }
 *       leaf count {
 *         type uint64;
 *       }
 *     }
 *     choice numa-policy {
 *       case numa-unaware {
 *         leaf numa-unaware {
 *           type empty;
 *         }
 *       }
 *       case numa-aware {
 *         container numa-node-policy {
 *           leaf node-cnt {
 *             type uint16;
 *           }
 *           leaf mem-policy {
 *             type enumeration {
 *               enum STRICT;
 *               enum PREFERRED;
 *             }
 *           }
 *           list node {
 *             key id;
 *             leaf id {
 *               type uint64;
 *             }
 *             list vcpu {
 *               key id;
 *               leaf id {
 *                 type uint64;
 *               }
 *             }
 *             leaf memory-mb {
 *               type uint64;
 *             }
 *             choice om-numa-type {
 *               case cores {
 *                 leaf num-cores {
 *                   type uint8;
 *                 }
 *               }
 *               case paired-threads {
 *                 container paired-threads {
 *                   leaf num-paired-threads {
 *                     type uint8;
 *                   }
 *                   list paired-thread-ids {
 *                     max-elements 16;
 *                     key thread-a;
 *                     leaf thread-a {
 *                       type uint8;
 *                     }
 *                     leaf thread-b {
 *                       type uint8;
 *                     }
 *                   }
 *                 }
 *               }
 *               case threads {
 *                 leaf num-threads {
 *                   type uint8;
 *                 }
 *               }
 *             }
 *           }
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/guest-epa</i>
 *
 */
public interface GuestEpa
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("guest-epa");

    /**
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa</code> <code>guestEpa</code>, or <code>null</code> if not present
     */
    @Nullable
    ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa getGuestEpa();

}

