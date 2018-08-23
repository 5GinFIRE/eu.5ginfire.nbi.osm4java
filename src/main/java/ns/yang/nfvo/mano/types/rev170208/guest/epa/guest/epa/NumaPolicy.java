package ns.yang.nfvo.mano.types.rev170208.guest.epa.guest.epa;
import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.guest.epa.GuestEpa;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * choice numa-policy {
 *   case numa-unaware {
 *     leaf numa-unaware {
 *       type empty;
 *     }
 *   }
 *   case numa-aware {
 *     container numa-node-policy {
 *       leaf node-cnt {
 *         type uint16;
 *       }
 *       leaf mem-policy {
 *         type enumeration {
 *           enum STRICT;
 *           enum PREFERRED;
 *         }
 *       }
 *       list node {
 *         key id;
 *         leaf id {
 *           type uint64;
 *         }
 *         list vcpu {
 *           key id;
 *           leaf id {
 *             type uint64;
 *           }
 *         }
 *         leaf memory-mb {
 *           type uint64;
 *         }
 *         choice om-numa-type {
 *           case cores {
 *             leaf num-cores {
 *               type uint8;
 *             }
 *           }
 *           case paired-threads {
 *             container paired-threads {
 *               leaf num-paired-threads {
 *                 type uint8;
 *               }
 *               list paired-thread-ids {
 *                 max-elements 16;
 *                 key thread-a;
 *                 leaf thread-a {
 *                   type uint8;
 *                 }
 *                 leaf thread-b {
 *                   type uint8;
 *                 }
 *               }
 *             }
 *           }
 *           case threads {
 *             leaf num-threads {
 *               type uint8;
 *             }
 *           }
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/guest-epa/guest-epa/numa-policy</i>
 *
 */
public interface NumaPolicy
    extends
    ChoiceIn<GuestEpa>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("numa-policy");


}

