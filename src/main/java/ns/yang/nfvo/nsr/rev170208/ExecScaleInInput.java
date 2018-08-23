package ns.yang.nfvo.nsr.rev170208;

import java.lang.Object;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.RpcInput;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module
 * <b>nsr</b>
 * 
 * <pre>
 * input {
 *   uses rpc-common;
 *   leaf scaling-group-name-ref {
 *     type leafref {
 *       path /rw-project:project[rw-project:name=current()/../nsr:project-name]/nsr:ns-instance-config/nsr:nsr[nsr:id=current()/../nsr:nsr_id_ref]/nsr:nsd/nsr:scaling-group-descriptor/nsr:name;
 *     }
 *   }
 *   leaf instance-id {
 *     type leafref {
 *       path /rw-project:project[rw-project:name=current()/../nsr:project-name]/nsr:ns-instance-config/nsr:nsr[nsr:id=current()/../nsr:nsr_id_ref]/nsr:scaling-group[nsr:scaling-group-name-ref=current()/../nsr:scaling-group-name-ref]/nsr:instance/nsr:id;
 *     }
 *   }
 * }
 * </pre>
 * 
 * The schema path to identify an instance is <i>nsr/exec-scale-in/input</i>
 * 
 * <p>
 * To create instances of this class use {@link ExecScaleInInputBuilder}.
 * 
 * @see ExecScaleInInputBuilder
 *
 */
public interface ExecScaleInInput extends RpcCommon, RpcInput, Augmentable<ExecScaleInInput> {

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("input");

	/**
	 * name of the scaling group
	 *
	 *
	 *
	 * @return <code>java.lang.Object</code> <code>scalingGroupNameRef</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	Object getScalingGroupNameRef();

	/**
	 * id of the scaling group
	 *
	 *
	 *
	 * @return <code>java.lang.Object</code> <code>instanceId</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	Object getInstanceId();

}
