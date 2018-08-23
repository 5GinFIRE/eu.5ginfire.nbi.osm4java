package ns.yang.ietf.network.rev150608;
import java.util.List;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataRoot;

/**
 * This module defines a common base model for a collectionof nodes in a network. 
 * Node definitions s are further usedin network topologies and inventories.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>ietf-network</b>
 * <pre>
 * module ietf-network {
 *   yang-version 1;
 *   namespace urn:ietf:params:xml:ns:yang:ietf-network;
 *   prefix nd;
 *   import ietf-inet-types {
 *     prefix inet;
 *   }
 *   revision 2015-06-08 {
 *   }
 *   typedef node-id {
 *     type inet:uri;
 *   }
 *   typedef network-id {
 *     type inet:uri;
 *   }
 *   grouping network-ref {
 *     leaf network-ref {
 *       type leafref {
 *         path /network/network-id;
 *       }
 *     }
 *   }
 *   grouping node-ref {
 *     leaf node-ref {
 *       type leafref {
 *         path /network[network-id=current()/../network-ref]/node/node-id;
 *       }
 *     }
 *     uses network-ref;
 *   }
 *   list network {
 *     config false;
 *     key network-id;
 *     container network-types {
 *     }
 *     leaf network-id {
 *       type network-id;
 *     }
 *     leaf server-provided {
 *       type boolean;
 *       config false;
 *     }
 *     list supporting-network {
 *       key network-ref;
 *       leaf network-ref {
 *         type leafref {
 *           path /network/network-id;
 *         }
 *       }
 *     }
 *     list node {
 *       key node-id;
 *       leaf node-id {
 *         type node-id;
 *       }
 *       list supporting-node {
 *         key "network-ref node-ref";
 *         leaf network-ref {
 *           type leafref {
 *             path ../../../supporting-network/network-ref;
 *           }
 *         }
 *         leaf node-ref {
 *           type leafref {
 *             path /network/node/node-id;
 *           }
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>
 *
 */
public interface IetfNetworkData
    extends
    DataRoot
{




    /**
     * Describes a network.A network typically contains an inventory of 
     * nodes,topological information (augmented throughnetwork-topology model), as well
     * as layeringinformation.
     *
     *
     *
     * @return <code>java.util.List</code> <code>network</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Network> getNetwork();

}

