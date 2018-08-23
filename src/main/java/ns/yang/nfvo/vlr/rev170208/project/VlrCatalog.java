package ns.yang.nfvo.vlr.rev170208.project;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.vlr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.vlr.rev170208.Project1;
import ns.yang.nfvo.vlr.rev170208.project.vlr.catalog.Vlr;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vlr</b>
 * <pre>
 * container vlr-catalog {
 *   leaf schema-version {
 *     type string;
 *     default v3.0;
 *   }
 *   config false;
 *   list vlr {
 *     key id;
 *     unique name;
 *     leaf id {
 *       type yang:uuid;
 *     }
 *     leaf name {
 *       type string;
 *     }
 *     leaf nsr-id-ref {
 *       type yang:uuid;
 *     }
 *     leaf vld-ref {
 *       type string;
 *     }
 *     leaf res-id {
 *       type yang:uuid;
 *     }
 *     leaf short-name {
 *       type string;
 *     }
 *     leaf vendor {
 *       type string;
 *     }
 *     leaf description {
 *       type string;
 *     }
 *     leaf version {
 *       type string;
 *     }
 *     leaf type {
 *       type manotypes:virtual-link-type;
 *     }
 *     leaf root-bandwidth {
 *       type uint64;
 *     }
 *     leaf leaf-bandwidth {
 *       type uint64;
 *     }
 *     leaf create-time {
 *       type uint32;
 *     }
 *     leaf uptime {
 *       type uint32;
 *     }
 *     leaf network-id {
 *       type string;
 *     }
 *     leaf vim-network-name {
 *       type string;
 *     }
 *     uses manotypes:provider-network;
 *     uses manotypes:ip-profile-info;
 *     leaf status {
 *       type enumeration {
 *         enum LINK_UP;
 *         enum DEGRADED;
 *         enum LINK_DOWN;
 *       }
 *     }
 *     leaf operational-status {
 *       type enumeration {
 *         enum init;
 *         enum vl-alloc-pending;
 *         enum running;
 *         enum vl-terminate-pending;
 *         enum terminated;
 *         enum failed;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vlr/project/(urn:ietf:params:xml:ns:yang:nfvo:vlr?revision=2017-02-08)vlr-catalog</i>
 * 
 * <p>To create instances of this class use {@link VlrCatalogBuilder}.
 * @see VlrCatalogBuilder
 *
 */
public interface VlrCatalog
    extends
    ChildOf<Project1>,
    Augmentable<VlrCatalog>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vlr-catalog");

    /**
     * Schema version for the VLR. If unspecified, it assumes v3.0
     *
     *
     *
     * @return <code>java.lang.String</code> <code>schemaVersion</code>, or <code>null</code> if not present
     */
    @Nullable
    String getSchemaVersion();
    
    /**
     * @return <code>java.util.List</code> <code>vlr</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Vlr> getVlr();

}

