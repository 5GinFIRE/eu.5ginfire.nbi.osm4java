package ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.vnf.list;

import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.PrimitiveParameterValue;
import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.VnfList;

/**
 * List of service primitives supported by theconfiguration agent for this VNF.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module
 * <b>nsr</b>
 * 
 * <pre>
 * list vnf-primitive {
 *   key index;
 *   leaf index {
 *     type uint32;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   uses manotypes:primitive-parameter-value;
 * }
 * </pre>
 * 
 * The schema path to identify an instance is
 * <i>nsr/exec-ns-service-primitive/input/vnf-list/vnf-primitive</i>
 * 
 * <p>
 * To create instances of this class use {@link VnfPrimitiveBuilder}.
 * 
 * @see VnfPrimitiveBuilder
 * @see VnfPrimitiveKey
 *
 */
public interface VnfPrimitive
		extends ChildOf<VnfList>, Augmentable<VnfPrimitive>, PrimitiveParameterValue, Identifiable<VnfPrimitiveKey> {

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnf-primitive");

	/**
	 * index of the service primitive.
	 *
	 *
	 *
	 * @return <code>java.lang.Long</code> <code>index</code>, or <code>null</code>
	 *         if not present
	 */
	@Nullable
	Long getIndex();

	/**
	 * Name of the service primitive.
	 *
	 *
	 *
	 * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code>
	 *         if not present
	 */
	@Nullable
	String getName();

	@Override
	VnfPrimitiveKey key();

}
