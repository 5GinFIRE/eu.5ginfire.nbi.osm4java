package yang.base.nsd.descriptor.common.vnffgd;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import yang.base.$YangModuleInfoImpl;
import yang.base.nsd.descriptor.common.Vnffgd;
import yang.base.nsd.descriptor.common.vnffgd.classifier.MatchAttributes;

/**
 * List of classifier rules.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list classifier {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   leaf rsp-id-ref {
 *     type leafref {
 *       path ../../rsp/id;
 *     }
 *   }
 *   leaf member-vnf-index-ref {
 *     type string;
 *   }
 *   leaf vnfd-id-ref {
 *     type leafref {
 *       path "../../../constituent-vnfd[member-vnf-index = current()/../member-vnf-index-ref]/vnfd-id-ref";
 *     }
 *   }
 *   leaf vnfd-connection-point-ref {
 *     type string;
 *   }
 *   list match-attributes {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     leaf ip-proto {
 *       type uint8;
 *     }
 *     leaf source-ip-address {
 *       type inet:ip-address;
 *     }
 *     leaf destination-ip-address {
 *       type inet:ip-address;
 *     }
 *     leaf source-port {
 *       type inet:port-number;
 *     }
 *     leaf destination-port {
 *       type inet:port-number;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/vnffgd/classifier</i>
 * 
 * <p>To create instances of this class use {@link ClassifierBuilder}.
 * @see ClassifierBuilder
 * @see ClassifierKey
 *
 */
public interface Classifier
    extends
    ChildOf<Vnffgd>,
    Augmentable<Classifier>,
    Identifiable<ClassifierKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("classifier");

    /**
     * Identifier for the classifier rule.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable
    String getId();
    
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
     * A reference to the RSP.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>rspIdRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getRspIdRef();
    
    /**
     * Reference to member-vnf within constituent-vnfds
     *
     *
     *
     * @return <code>java.lang.String</code> <code>memberVnfIndexRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getMemberVnfIndexRef();
    
    /**
     * A reference to a vnfd. This is a leafref to path: ../../../nsd:constituent-vnfd 
     * + [nsd:id = current()/../nsd:id-ref] + /nsd:vnfd-id-ref
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>vnfdIdRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getVnfdIdRef();
    
    /**
     * A reference to a connection point name in a vnfd. This is a leafref to path: 
     * /vnfd:vnfd-catalog/vnfd:vnfd + [vnfd:id = current()/../nsd:vnfd-id-ref] + 
     * /vnfd:connection-point/vnfd:name NOTE: An issue with confd is preventing the use
     * of xpath. Seems to be an issue with leafref to leafref, whose target is in a 
     * different module. Once that is resolved this will switched to use leafref
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfdConnectionPointRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVnfdConnectionPointRef();
    
    /**
     * List of match attributes.
     *
     *
     *
     * @return <code>java.util.List</code> <code>matchAttributes</code>, or <code>null</code> if not present
     */
    @Nullable
    List<MatchAttributes> getMatchAttributes();
    
    @Override
    ClassifierKey key();

}

