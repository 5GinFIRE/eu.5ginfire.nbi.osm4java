package ns.yang.nfvo.nsr.rev170208.vnffgr.vnffgr;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.ietf.yang.types.rev130715.Uuid;
import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.nsr.rev170208.vnffgr.Vnffgr;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list classifier {
 *   key id;
 *   leaf id {
 *     type yang:uuid;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   leaf-list classifier-id {
 *     type yang:uuid;
 *   }
 *   leaf rsp-id-ref {
 *     type leafref {
 *       path ../../rsp/id;
 *     }
 *   }
 *   leaf rsp-name {
 *     type string;
 *   }
 *   leaf vnfr-id-ref {
 *     type string;
 *   }
 *   leaf vnfr-name-ref {
 *     type string;
 *   }
 *   leaf vnfr-connection-point-ref {
 *     type leafref {
 *       path "../../../../../vnfr:vnfr-catalog/vnfr:vnfr[vnfr:id = current()/../vnfr-id-ref]/vnfr:connection-point/vnfr:name";
 *     }
 *   }
 *   leaf port-id {
 *     type string;
 *   }
 *   leaf vm-id {
 *     type string;
 *   }
 *   leaf ip-address {
 *     type string;
 *   }
 *   leaf sff-name {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/vnffgr/vnffgr/classifier</i>
 * 
 * <p>To create instances of this class use {@link ClassifierBuilder}.
 * @see ClassifierBuilder
 * @see ClassifierKey
 *
 */
public interface Classifier
    extends
    ChildOf<Vnffgr>,
    Augmentable<Classifier>,
    Identifiable<ClassifierKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("classifier");

    /**
     * Identifier for the classifier rule.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable
    Uuid getId();
    
    /**
     * Name of the classifier.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * Returned Identifier for the classifier rule.
     *
     *
     *
     * @return <code>java.util.List</code> <code>classifierId</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Uuid> getClassifierId();
    
    /**
     * A reference to the RSP.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>rspIdRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Uuid getRspIdRef();
    
    /**
     * Name for the RSP
     *
     *
     *
     * @return <code>java.lang.String</code> <code>rspName</code>, or <code>null</code> if not present
     */
    @Nullable
    String getRspName();
    
    /**
     * A reference to a vnfr id
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfrIdRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVnfrIdRef();
    
    /**
     * A reference to a vnfr name
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfrNameRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVnfrNameRef();
    
    /**
     * A reference to a vnfr connection point.
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfrConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getVnfrConnectionPointRef();
    
    /**
     * @return <code>java.lang.String</code> <code>portId</code>, or <code>null</code> if not present
     */
    @Nullable
    String getPortId();
    
    /**
     * @return <code>java.lang.String</code> <code>vmId</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVmId();
    
    /**
     * @return <code>java.lang.String</code> <code>ipAddress</code>, or <code>null</code> if not present
     */
    @Nullable
    String getIpAddress();
    
    /**
     * @return <code>java.lang.String</code> <code>sffName</code>, or <code>null</code> if not present
     */
    @Nullable
    String getSffName();
    
    @Override
    ClassifierKey key();

}

