package ns.topology;
import java.util.List;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * The data objects needed to define a termination point.(This only includes a 
 * single leaf at this point, usedto identify the termination point.)Provided in a 
 * grouping so that in addition to the datastore,the data can also be included in 
 * notifications.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-network-topology</b>
 * <pre>
 * grouping tp-attributes {
 *   leaf tp-id {
 *     type tp-id;
 *   }
 *   leaf-list tp-ref {
 *     type tp-ref;
 *     config false;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-network-topology/tp-attributes</i>
 *
 */
public interface TpAttributes
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("tp-attributes");

    /**
     * @return <code>model.urn.tbd.params.xml.ns.yang.network.topology.rev131021.TpId</code> <code>tpId</code>, or <code>null</code> if not present
     */
    @Nullable
    TpId getTpId();
    
    /**
     * The leaf list identifies any termination points that thetermination point is 
     * dependent on, or maps onto.Those termination points will themselves be 
     * containedin a supporting node.This dependency information can be inferred 
     * fromthe dependencies between links. For this reason,this item is not separately 
     * configurable. Hence nocorresponding constraint needs to be articulated.The 
     * corresponding information is simply provided by theimplementing system.
     *
     *
     *
     * @return <code>java.util.List</code> <code>tpRef</code>, or <code>null</code> if not present
     */
    @Nullable
    List<TpId> getTpRef();

}

