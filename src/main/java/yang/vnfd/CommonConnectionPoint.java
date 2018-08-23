package yang.vnfd;

import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.ConnectionPointType;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module
 * <b>vnfd-base</b>
 * 
 * <pre>
 * grouping common-connection-point {
 *   leaf name {
 *     type string;
 *   }
 *   leaf id {
 *     type string;
 *   }
 *   leaf short-name {
 *     type string;
 *   }
 *   leaf type {
 *     type manotypes:connection-point-type;
 *   }
 *   leaf port-security-enabled {
 *     type boolean;
 *     default true;
 *   }
 * }
 * </pre>
 * 
 * The schema path to identify an instance is
 * <i>vnfd-base/common-connection-point</i>
 *
 */
public interface CommonConnectionPoint extends DataObject {

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("common-connection-point");

	/**
	 * Name of the connection point
	 *
	 *
	 *
	 * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code>
	 *         if not present
	 */
	@Nullable
	String getName();

	/**
	 * Identifier for the internal connection points
	 *
	 *
	 *
	 * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code>
	 *         if not present
	 */
	@Nullable
	String getId();

	/**
	 * Short name to appear as label in the UI
	 *
	 *
	 *
	 * @return <code>java.lang.String</code> <code>shortName</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	String getShortName();

	/**
	 * Type of the connection point.
	 *
	 *
	 *
	 * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.ConnectionPointType</code>
	 *         <code>type</code>, or <code>null</code> if not present
	 */
	@Nullable
	ConnectionPointType getType();

	/**
	 * Enables the port security for the port.
	 *
	 *
	 *
	 * @return <code>java.lang.Boolean</code> <code>portSecurityEnabled</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	Boolean isPortSecurityEnabled();

}
