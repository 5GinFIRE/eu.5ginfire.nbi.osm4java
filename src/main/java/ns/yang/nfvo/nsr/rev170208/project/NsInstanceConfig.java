package ns.yang.nfvo.nsr.rev170208.project;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.nsr.rev170208.Project2;
import ns.yang.nfvo.nsr.rev170208.project.ns.instance.config.Nsr;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * container ns-instance-config {
 *   list nsr {
 *     key id;
 *     unique name;
 *     leaf schema-version {
 *       type string;
 *       default v3.0;
 *     }
 *     leaf id {
 *       type yang:uuid;
 *     }
 *     leaf name {
 *       type string;
 *     }
 *     leaf short-name {
 *       type string;
 *     }
 *     leaf description {
 *       type string;
 *     }
 *     leaf admin-status {
 *       type enumeration {
 *         enum ENABLED;
 *         enum DISABLED;
 *       }
 *     }
 *     container nsd {
 *       uses nsd-base:nsd-descriptor-common;
 *       uses project-nsd:nsr-nsd-vld;
 *       uses project-nsd:nsr-nsd-constituent-vnfd;
 *       uses project-nsd:nsr-nsd-placement-groups;
 *       uses project-nsd:nsr-nsd-vnf-dependency;
 *       uses project-nsd:nsr-nsd-monitoring-param;
 *       uses project-nsd:nsr-nsd-service-primitive;
 *     }
 *     uses ns-instance-config-params;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:ietf:params:xml:ns:yang:nfvo:nsr?revision=2017-02-08)ns-instance-config</i>
 * 
 * <p>To create instances of this class use {@link NsInstanceConfigBuilder}.
 * @see NsInstanceConfigBuilder
 *
 */
public interface NsInstanceConfig
    extends
    ChildOf<Project2>,
    Augmentable<NsInstanceConfig>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ns-instance-config");

    /**
     * @return <code>java.util.List</code> <code>nsr</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Nsr> getNsr();

}

