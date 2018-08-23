package ns.yang.nfvo.mano.types.rev170208;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping host-epa {
 *   container host-epa {
 *     leaf cpu-model {
 *       type enumeration {
 *         enum PREFER_WESTMERE;
 *         enum REQUIRE_WESTMERE;
 *         enum PREFER_SANDYBRIDGE;
 *         enum REQUIRE_SANDYBRIDGE;
 *         enum PREFER_IVYBRIDGE;
 *         enum REQUIRE_IVYBRIDGE;
 *         enum PREFER_HASWELL;
 *         enum REQUIRE_HASWELL;
 *         enum PREFER_BROADWELL;
 *         enum REQUIRE_BROADWELL;
 *         enum PREFER_NEHALEM;
 *         enum REQUIRE_NEHALEM;
 *         enum PREFER_PENRYN;
 *         enum REQUIRE_PENRYN;
 *         enum PREFER_CONROE;
 *         enum REQUIRE_CONROE;
 *         enum PREFER_CORE2DUO;
 *         enum REQUIRE_CORE2DUO;
 *       }
 *     }
 *     leaf cpu-arch {
 *       type enumeration {
 *         enum PREFER_X86;
 *         enum REQUIRE_X86;
 *         enum PREFER_X86_64;
 *         enum REQUIRE_X86_64;
 *         enum PREFER_I686;
 *         enum REQUIRE_I686;
 *         enum PREFER_IA64;
 *         enum REQUIRE_IA64;
 *         enum PREFER_ARMV7;
 *         enum REQUIRE_ARMV7;
 *         enum PREFER_ARMV8;
 *         enum REQUIRE_ARMV8;
 *       }
 *     }
 *     leaf cpu-vendor {
 *       type enumeration {
 *         enum PREFER_INTEL;
 *         enum REQUIRE_INTEL;
 *         enum PREFER_AMD;
 *         enum REQUIRE_AMD;
 *       }
 *     }
 *     leaf cpu-socket-count {
 *       type uint64;
 *     }
 *     leaf cpu-core-count {
 *       type uint64;
 *     }
 *     leaf cpu-core-thread-count {
 *       type uint64;
 *     }
 *     list cpu-feature {
 *       key feature;
 *       leaf feature {
 *         type cpu-feature-type;
 *       }
 *     }
 *     leaf om-cpu-model-string {
 *       type string;
 *     }
 *     list om-cpu-feature {
 *       key feature;
 *       leaf feature {
 *         type string;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/host-epa</i>
 *
 */
public interface HostEpa
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("host-epa");

    /**
     * Specifies the host level EPA attributes.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa</code> <code>hostEpa</code>, or <code>null</code> if not present
     */
    @Nullable
    ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa getHostEpa();

}

