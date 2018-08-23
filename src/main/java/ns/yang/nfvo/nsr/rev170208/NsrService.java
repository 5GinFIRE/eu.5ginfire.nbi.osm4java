package ns.yang.nfvo.nsr.rev170208;

import com.google.common.util.concurrent.ListenableFuture;
import javax.annotation.CheckReturnValue;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;

/**
 * Interface for implementing the following YANG RPCs defined in module
 * <b>nsr</b>
 * 
 * <pre>
 * rpc start-network-service {
 *   input {
 *     leaf name {
 *       type string;
 *     }
 *     uses manotypes:rpc-project-name;
 *     leaf nsd_id_ref {
 *       type leafref {
 *         path /rw-project:project[rw-project:name=current()/../project-name]/project-nsd:nsd-catalog/project-nsd:nsd/project-nsd:id;
 *       }
 *     }
 *     uses ns-instance-config-params-common;
 *     list vnfd-placement-group-maps {
 *       key "placement-group-ref vnfd-id-ref";
 *       leaf vnfd-id-ref {
 *         type yang:uuid;
 *       }
 *       leaf placement-group-ref {
 *         type leafref {
 *           path "/rw-project:project[rw-project:name=current()/../../project-name]/project-vnfd:vnfd-catalog/project-vnfd:vnfd[project-vnfd:id = current()/../vnfd-id-ref]/project-vnfd:placement-groups/project-vnfd:name";
 *         }
 *       }
 *       uses manotypes:placement-group-input;
 *       list ssh-authorized-key {
 *         key key-pair-ref;
 *         leaf key-pair-ref {
 *           type leafref {
 *             path /rw-project:project[rw-project:name=current()/../../../project-name]/key-pair/name;
 *           }
 *         }
 *       }
 *       list user {
 *         key name;
 *         leaf name {
 *           type string;
 *         }
 *         leaf user-info {
 *           type string;
 *         }
 *         list ssh-authorized-key {
 *           key key-pair-ref;
 *           leaf key-pair-ref {
 *             type leafref {
 *               path /rw-project:project[rw-project:name=current()/../../../../project-name]/key-pair/name;
 *             }
 *           }
 *         }
 *       }
 *     }
 *   }
 *   output {
 *     leaf nsr-id {
 *       type yang:uuid;
 *     }
 *   }
 * }
 * rpc exec-scale-out {
 *   input {
 *     uses rpc-common;
 *     leaf scaling-group-name-ref {
 *       type leafref {
 *         path /rw-project:project[rw-project:name=current()/../nsr:project-name]/nsr:ns-instance-config/nsr:nsr[nsr:id=current()/../nsr:nsr_id_ref]/nsr:nsd/nsr:scaling-group-descriptor/nsr:name;
 *       }
 *     }
 *     leaf instance-id {
 *       type uint64;
 *     }
 *   }
 *   output {
 *     leaf instance-id {
 *       type uint64;
 *     }
 *   }
 * }
 * rpc get-ns-service-primitive-values {
 *   input {
 *     leaf name {
 *       type string;
 *     }
 *     uses rpc-common;
 *   }
 *   output {
 *     list ns-parameter {
 *       key name;
 *       leaf name {
 *         type string;
 *       }
 *       leaf value {
 *         type string;
 *       }
 *     }
 *     list ns-parameter-group {
 *       key name;
 *       leaf name {
 *         type string;
 *       }
 *       list parameter {
 *         key name;
 *         leaf name {
 *           type string;
 *         }
 *         leaf value {
 *           type string;
 *         }
 *       }
 *     }
 *     list vnf-primitive-group {
 *       key member-vnf-index-ref;
 *       leaf member-vnf-index-ref {
 *         type string;
 *       }
 *       leaf vnfd-id-ref {
 *         type string;
 *       }
 *       list primitive {
 *         key index;
 *         leaf index {
 *           type uint32;
 *         }
 *         leaf name {
 *           type string;
 *         }
 *         list parameter {
 *           key name;
 *           leaf name {
 *             type string;
 *           }
 *           leaf value {
 *             type string;
 *           }
 *         }
 *       }
 *     }
 *   }
 * }
 * rpc exec-scale-in {
 *   input {
 *     uses rpc-common;
 *     leaf scaling-group-name-ref {
 *       type leafref {
 *         path /rw-project:project[rw-project:name=current()/../nsr:project-name]/nsr:ns-instance-config/nsr:nsr[nsr:id=current()/../nsr:nsr_id_ref]/nsr:nsd/nsr:scaling-group-descriptor/nsr:name;
 *       }
 *     }
 *     leaf instance-id {
 *       type leafref {
 *         path /rw-project:project[rw-project:name=current()/../nsr:project-name]/nsr:ns-instance-config/nsr:nsr[nsr:id=current()/../nsr:nsr_id_ref]/nsr:scaling-group[nsr:scaling-group-name-ref=current()/../nsr:scaling-group-name-ref]/nsr:instance/nsr:id;
 *       }
 *     }
 *   }
 *   output {
 *     leaf instance-id {
 *       type uint64;
 *     }
 *   }
 * }
 * rpc exec-ns-service-primitive {
 *   input {
 *     leaf name {
 *       type string;
 *     }
 *     uses rpc-common;
 *     leaf triggered-by {
 *       type trigger-type;
 *       default ns-primitive;
 *     }
 *     uses manotypes:primitive-parameter-value;
 *     list parameter-group {
 *       key name;
 *       leaf name {
 *         type string;
 *       }
 *       uses manotypes:primitive-parameter-value;
 *     }
 *     list vnf-list {
 *       key member_vnf_index_ref;
 *       leaf member_vnf_index_ref {
 *         type uint64;
 *       }
 *       leaf vnfr-id-ref {
 *         type yang:uuid;
 *       }
 *       list vnf-primitive {
 *         key index;
 *         leaf index {
 *           type uint32;
 *         }
 *         leaf name {
 *           type string;
 *         }
 *         uses manotypes:primitive-parameter-value;
 *       }
 *     }
 *     leaf user-defined-script {
 *       type string;
 *     }
 *   }
 *   output {
 *     leaf job-id {
 *       type uint64;
 *     }
 *     leaf name {
 *       type string;
 *     }
 *     uses rpc-common;
 *     leaf triggered-by {
 *       type trigger-type;
 *     }
 *     leaf create-time {
 *       type uint32;
 *     }
 *     leaf job-status-details {
 *       type string;
 *     }
 *     uses manotypes:primitive-parameter-value;
 *     list parameter-group {
 *       key name;
 *       leaf name {
 *         type string;
 *       }
 *       uses manotypes:primitive-parameter-value;
 *     }
 *     list vnf-out-list {
 *       key member_vnf_index_ref;
 *       leaf member_vnf_index_ref {
 *         type uint64;
 *       }
 *       leaf vnfr-id-ref {
 *         type yang:uuid;
 *       }
 *       list vnf-out-primitive {
 *         key index;
 *         leaf index {
 *           type uint32;
 *         }
 *         leaf name {
 *           type string;
 *         }
 *         uses manotypes:primitive-parameter-value;
 *         leaf execution-id {
 *           type string;
 *         }
 *         leaf execution-status {
 *           type string;
 *         }
 *         leaf execution-error-details {
 *           type string;
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>
 *
 */
public interface NsrService extends RpcService {

	/**
	 * Start the network service
	 *
	 */
	@CheckReturnValue
	ListenableFuture<RpcResult<StartNetworkServiceOutput>> startNetworkService(StartNetworkServiceInput input);

	/**
	 * Executes scale out request
	 *
	 */
	@CheckReturnValue
	ListenableFuture<RpcResult<ExecScaleOutOutput>> execScaleOut(ExecScaleOutInput input);

	/**
	 * Get the service primitive parameter values
	 *
	 *
	 *
	 * @return <code>com.google.common.util.concurrent.ListenableFuture</code>
	 *         <code>nsServicePrimitiveValues</code>, or <code>null</code> if not
	 *         present
	 */
	@CheckReturnValue
	ListenableFuture<RpcResult<GetNsServicePrimitiveValuesOutput>> getNsServicePrimitiveValues(
			GetNsServicePrimitiveValuesInput input);

	/**
	 * Executes scale out request
	 *
	 */
	@CheckReturnValue
	ListenableFuture<RpcResult<ExecScaleInOutput>> execScaleIn(ExecScaleInInput input);

	/**
	 * Executes a NS service primitive or script
	 *
	 */
	@CheckReturnValue
	ListenableFuture<RpcResult<ExecNsServicePrimitiveOutput>> execNsServicePrimitive(ExecNsServicePrimitiveInput input);

}
