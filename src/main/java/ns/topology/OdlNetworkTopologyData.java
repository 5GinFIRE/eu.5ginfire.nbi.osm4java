package ns.topology;

import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataRoot;

/**
 * This module defines a model for the topology of a network.Key design
 * decisions are as follows:A topology consists of a set of nodes and
 * links.Links are point-to-point and unidirectional.Bidirectional connections
 * need to be represented throughtwo separate links.Multipoint connections,
 * broadcast domains etc can be representedthrough a hierarchy of nodes, then
 * connecting nodes atupper layers of the hierarchy.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module
 * <b>odl-network-topology</b>
 * 
 * <pre>
 * module odl-network-topology {
 *   yang-version 1;
 *   namespace urn:TBD:params:xml:ns:yang:network-topology;
 *   prefix nt;
 *   import ietf-inet-types {
 *     prefix inet;
 *   }
 *   revision 2013-10-21 {
 *   }
 *   typedef topology-id {
 *     type inet:uri;
 *   }
 *   typedef node-id {
 *     type inet:uri;
 *   }
 *   typedef link-id {
 *     type inet:uri;
 *   }
 *   typedef tp-id {
 *     type inet:uri;
 *   }
 *   typedef tp-ref {
 *     type leafref {
 *       path /network-topology/topology/node/termination-point/tp-id;
 *     }
 *   }
 *   typedef topology-ref {
 *     type leafref {
 *       path /network-topology/topology/topology-id;
 *     }
 *   }
 *   typedef node-ref {
 *     type leafref {
 *       path /network-topology/topology/node/node-id;
 *     }
 *   }
 *   typedef link-ref {
 *     type leafref {
 *       path /network-topology/topology/link/link-id;
 *     }
 *   }
 *   grouping tp-attributes {
 *     leaf tp-id {
 *       type tp-id;
 *     }
 *     leaf-list tp-ref {
 *       type tp-ref;
 *       config false;
 *     }
 *   }
 *   grouping node-attributes {
 *     leaf node-id {
 *       type node-id;
 *     }
 *     list supporting-node {
 *       key "topology-ref node-ref";
 *       leaf topology-ref {
 *         type topology-ref;
 *       }
 *       leaf node-ref {
 *         type node-ref;
 *       }
 *     }
 *   }
 *   grouping link-attributes {
 *     leaf link-id {
 *       type link-id;
 *     }
 *     container source {
 *       leaf source-node {
 *         type node-ref;
 *       }
 *       leaf source-tp {
 *         type tp-ref;
 *       }
 *     }
 *     container destination {
 *       leaf dest-node {
 *         type node-ref;
 *       }
 *       leaf dest-tp {
 *         type tp-ref;
 *       }
 *     }
 *     list supporting-link {
 *       key link-ref;
 *       leaf link-ref {
 *         type link-ref;
 *       }
 *     }
 *   }
 *   container network-topology {
 *     list topology {
 *       key topology-id;
 *       leaf topology-id {
 *         type topology-id;
 *       }
 *       leaf server-provided {
 *         type boolean;
 *         config false;
 *       }
 *       container topology-types {
 *       }
 *       list underlay-topology {
 *         key topology-ref;
 *         leaf topology-ref {
 *           type topology-ref;
 *         }
 *       }
 *       list node {
 *         key node-id;
 *         uses node-attributes;
 *         must boolean(../underlay-topology[*]/node[./supporting-nodes/node-ref]);
 *         list termination-point {
 *           key tp-id;
 *           uses tp-attributes;
 *         }
 *       }
 *       list link {
 *         key link-id;
 *         uses link-attributes;
 *         must boolean(../underlay-topology/link[./supporting-link]);
 *         must boolean(../node[./source/source-node]);
 *         must boolean(../node[./destination/dest-node]);
 *         must boolean(../node/termination-point[./source/source-tp]);
 *         must boolean(../node/termination-point[./destination/dest-tp]);
 *       }
 *     }
 *   }
 * }
 * </pre>
 *
 */
public interface OdlNetworkTopologyData extends DataRoot {

	/**
	 * @return <code>model.urn.tbd.params.xml.ns.yang.network.topology.rev131021.NetworkTopology</code>
	 *         <code>networkTopology</code>, or <code>null</code> if not present
	 */
	@Nullable
	NetworkTopology getNetworkTopology();

}
