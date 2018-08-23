package yang.base.nsd.descriptor.common;

import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import yang.base.$YangModuleInfoImpl;
import yang.base.NsdDescriptorCommon;
import yang.base.nsd.descriptor.common.vnffgd.Classifier;
import yang.base.nsd.descriptor.common.vnffgd.Rsp;

/**
 * List of VNF Forwarding Graph Descriptors (VNFFGD).
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module
 * <b>nsd-base</b>
 * 
 * <pre>
 * list vnffgd {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   leaf short-name {
 *     type string;
 *   }
 *   leaf vendor {
 *     type string;
 *   }
 *   leaf description {
 *     type string;
 *   }
 *   leaf version {
 *     type string;
 *   }
 *   list rsp {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     leaf name {
 *       type string;
 *     }
 *     list vnfd-connection-point-ref {
 *       key member-vnf-index-ref;
 *       leaf member-vnf-index-ref {
 *         type string;
 *       }
 *       leaf order {
 *         type uint8;
 *       }
 *       leaf vnfd-id-ref {
 *         type leafref {
 *           path "../../../../constituent-vnfd[member-vnf-index = current()/../member-vnf-index-ref]/vnfd-id-ref";
 *         }
 *       }
 *       leaf vnfd-connection-point-ref {
 *         type string;
 *       }
 *     }
 *   }
 *   list classifier {
 *     key id;
 *     leaf id {
 *       type string;
 *     }
 *     leaf name {
 *       type string;
 *     }
 *     leaf rsp-id-ref {
 *       type leafref {
 *         path ../../rsp/id;
 *       }
 *     }
 *     leaf member-vnf-index-ref {
 *       type string;
 *     }
 *     leaf vnfd-id-ref {
 *       type leafref {
 *         path "../../../constituent-vnfd[member-vnf-index = current()/../member-vnf-index-ref]/vnfd-id-ref";
 *       }
 *     }
 *     leaf vnfd-connection-point-ref {
 *       type string;
 *     }
 *     list match-attributes {
 *       key id;
 *       leaf id {
 *         type string;
 *       }
 *       leaf ip-proto {
 *         type uint8;
 *       }
 *       leaf source-ip-address {
 *         type inet:ip-address;
 *       }
 *       leaf destination-ip-address {
 *         type inet:ip-address;
 *       }
 *       leaf source-port {
 *         type inet:port-number;
 *       }
 *       leaf destination-port {
 *         type inet:port-number;
 *       }
 *     }
 *   }
 * }
 * </pre>
 * 
 * The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/vnffgd</i>
 * 
 * <p>
 * To create instances of this class use {@link VnffgdBuilder}.
 * 
 * @see VnffgdBuilder
 * @see VnffgdKey
 *
 */
public interface Vnffgd extends ChildOf<NsdDescriptorCommon>, Augmentable<Vnffgd>, Identifiable<VnffgdKey> {

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnffgd");

	/**
	 * Identifier for the VNFFGD.
	 *
	 *
	 *
	 * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code>
	 *         if not present
	 */
	@Nullable
	String getId();

	/**
	 * VNFFGD name.
	 *
	 *
	 *
	 * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code>
	 *         if not present
	 */
	@Nullable
	String getName();

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
	 * Provider of the VNFFGD.
	 *
	 *
	 *
	 * @return <code>java.lang.String</code> <code>vendor</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	String getVendor();

	/**
	 * Description of the VNFFGD.
	 *
	 *
	 *
	 * @return <code>java.lang.String</code> <code>description</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	String getDescription();

	/**
	 * Version of the VNFFGD
	 *
	 *
	 *
	 * @return <code>java.lang.String</code> <code>version</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	String getVersion();

	/**
	 * List of Rendered Service Paths (RSP).
	 *
	 *
	 *
	 * @return <code>java.util.List</code> <code>rsp</code>, or <code>null</code> if
	 *         not present
	 */
	@Nullable
	List<Rsp> getRsp();

	/**
	 * List of classifier rules.
	 *
	 *
	 *
	 * @return <code>java.util.List</code> <code>classifier</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	List<Classifier> getClassifier();

	@Override
	VnffgdKey key();

}
