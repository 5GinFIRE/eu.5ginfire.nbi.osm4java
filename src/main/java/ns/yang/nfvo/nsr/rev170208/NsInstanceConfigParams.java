package ns.yang.nfvo.nsr.rev170208;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.nsr.rev170208.ns.instance.config.params.VnfdPlacementGroupMaps;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * grouping ns-instance-config-params {
 *   uses ns-instance-config-params-common;
 *   list vnfd-placement-group-maps {
 *     key "placement-group-ref vnfd-id-ref";
 *     leaf vnfd-id-ref {
 *       type yang:uuid;
 *     }
 *     leaf placement-group-ref {
 *       type leafref {
 *         path "../../../../project-vnfd:vnfd-catalog/project-vnfd:vnfd[project-vnfd:id = current()/../vnfd-id-ref]/project-vnfd:placement-groups/project-vnfd:name";
 *       }
 *     }
 *     uses manotypes:placement-group-input;
 *   }
 *   uses cloud-config;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/ns-instance-config-params</i>
 *
 */
public interface NsInstanceConfigParams
    extends
    DataObject,
    NsInstanceConfigParamsCommon,
    CloudConfig
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ns-instance-config-params");

    /**
     * Mapping from mano-placement groups construct from VNFD to cloud platform 
     * placement group construct
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfdPlacementGroupMaps</code>, or <code>null</code> if not present
     */
    @Nullable
    List<VnfdPlacementGroupMaps> getVnfdPlacementGroupMaps();

}

