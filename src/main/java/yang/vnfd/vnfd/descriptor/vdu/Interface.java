package yang.vnfd.vnfd.descriptor.vdu;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import yang.vnfd.$YangModuleInfoImpl;
import yang.vnfd.InterfaceType;
import yang.vnfd.VirtualInterface;
import yang.vnfd.vnfd.descriptor.Vdu;
import yang.vnfd.vnfd.descriptor.vdu.InterfaceBuilder.InterfaceImpl;
import yang.vnfd.vnfd.descriptor.vdu._interface.ConnectionPointType;

/**
 * List of Interfaces (external and internal) for the VNF
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * list interface {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   leaf position {
 *     type uint32;
 *   }
 *   leaf mgmt-interface {
 *     type boolean;
 *     default false;
 *   }
 *   leaf type {
 *     type interface-type;
 *     default EXTERNAL;
 *   }
 *   leaf mac-address {
 *     type string;
 *   }
 *   choice connection-point-type {
 *     case internal {
 *       leaf internal-connection-point-ref {
 *         type leafref {
 *           path ../../../../internal-connection-point/id;
 *         }
 *       }
 *     }
 *     case external {
 *       leaf external-connection-point-ref {
 *         type leafref {
 *           path ../../../../../connection-point/name;
 *         }
 *       }
 *     }
 *   }
 *   uses virtual-interface;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/vdu/interface</i>
 * 
 * <p>To create instances of this class use {@link InterfaceBuilder}.
 * @see InterfaceBuilder
 * @see InterfaceKey
 *
 */
@JsonDeserialize(as = InterfaceImpl.class)
//@JsonIgnoreProperties( {"external-connection-point-ref"} )
@JsonIgnoreProperties(ignoreUnknown = true)
public interface Interface
    extends
    ChildOf<Vdu>,
    Augmentable<Interface>,
    VirtualInterface,
    Identifiable<InterfaceKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("interface");

    /**
     * Name of the interface. Note that thisname has only local significance to the 
     * VDU.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * Explicit Position of the interface within the list
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>position</code>, or <code>null</code> if not present
     */
    @Nullable
    Long getPosition();
    
    /**
     * Flag to indicate that this is the mgmt interfaceto be used for VDU configuration
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>mgmtInterface</code>, or <code>null</code> if not present
     */
    @Nullable
    Boolean isMgmtInterface();
    
    /**
     * Type of the Interface
     *
     *
     *
     * @return <code>model.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.InterfaceType</code> <code>type</code>, or <code>null</code> if not present
     */
    @Nullable
    InterfaceType getType();
    
    /**
     * MAC address of the interface.Some VNFs require a specific MAC address to be 
     * configuredin the interface. While this is not recommended at all inNFV 
     * environments, this parameter exists to allow thosescenarios.This parameter will 
     * be likely deprecated in the future.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>macAddress</code>, or <code>null</code> if not present
     */
    @Nullable
    String getMacAddress();
    
    /**
     * @return <code>model.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.vdu._interface.ConnectionPointType</code> <code>connectionPointType</code>, or <code>null</code> if not present
     */
    @Nullable
    ConnectionPointType getConnectionPointType();
    
    @Override
    InterfaceKey key();

}

