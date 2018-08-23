package ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input;
import java.lang.Override;
import java.math.BigInteger;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.ietf.yang.types.rev130715.Uuid;
import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.nsr.rev170208.ExecNsServicePrimitiveInput;
import ns.yang.nfvo.nsr.rev170208.exec.ns.service.primitive.input.vnf.list.VnfPrimitive;

/**
 * List of VNFs whose primitives are being set.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list vnf-list {
 *   key member_vnf_index_ref;
 *   leaf member_vnf_index_ref {
 *     type uint64;
 *   }
 *   leaf vnfr-id-ref {
 *     type yang:uuid;
 *   }
 *   list vnf-primitive {
 *     key index;
 *     leaf index {
 *       type uint32;
 *     }
 *     leaf name {
 *       type string;
 *     }
 *     uses manotypes:primitive-parameter-value;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/exec-ns-service-primitive/input/vnf-list</i>
 * 
 * <p>To create instances of this class use {@link VnfListBuilder}.
 * @see VnfListBuilder
 * @see VnfListKey
 *
 */
public interface VnfList
    extends
    ChildOf<ExecNsServicePrimitiveInput>,
    Augmentable<VnfList>,
    Identifiable<VnfListKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnf-list");

    /**
     * Member VNF index
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>memberVnfIndexRef</code>, or <code>null</code> if not present
     */
    @Nullable
    BigInteger getMemberVnfIndexRef();
    
    /**
     * A reference to a vnfr. This is aleafref to path
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>vnfrIdRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Uuid getVnfrIdRef();
    
    /**
     * List of service primitives supported by theconfiguration agent for this VNF.
     *
     *
     *
     * @return <code>java.util.List</code> <code>vnfPrimitive</code>, or <code>null</code> if not present
     */
    @Nullable
    List<VnfPrimitive> getVnfPrimitive();
    
    @Override
    VnfListKey key();

}

