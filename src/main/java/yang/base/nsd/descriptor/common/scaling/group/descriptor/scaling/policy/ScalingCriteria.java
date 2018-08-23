package yang.base.nsd.descriptor.common.scaling.group.descriptor.scaling.policy;
import java.lang.Override;
import java.lang.String;
import java.math.BigInteger;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.RelationalOperationType;
import yang.base.$YangModuleInfoImpl;
import yang.base.nsd.descriptor.common.scaling.group.descriptor.ScalingPolicy;

/**
 * list of conditions to be met for generating scaling requests
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list scaling-criteria {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   leaf scale-in-threshold {
 *     type uint64;
 *   }
 *   leaf scale-in-relational-operation {
 *     type manotypes:relational-operation-type;
 *     default LE;
 *   }
 *   leaf scale-out-threshold {
 *     type uint64;
 *   }
 *   leaf scale-out-relational-operation {
 *     type manotypes:relational-operation-type;
 *     default GE;
 *   }
 *   leaf ns-monitoring-param-ref {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/scaling-group-descriptor/scaling-policy/scaling-criteria</i>
 * 
 * <p>To create instances of this class use {@link ScalingCriteriaBuilder}.
 * @see ScalingCriteriaBuilder
 * @see ScalingCriteriaKey
 *
 */
public interface ScalingCriteria
    extends
    ChildOf<ScalingPolicy>,
    Augmentable<ScalingCriteria>,
    Identifiable<ScalingCriteriaKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("scaling-criteria");

    /**
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * Value below which scale-in requests are generated
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>scaleInThreshold</code>, or <code>null</code> if not present
     */
    @Nullable
    BigInteger getScaleInThreshold();
    
    /**
     * The relational operator used to compare the monitoring paramagainst the 
     * scale-in-threshold.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.RelationalOperationType</code> <code>scaleInRelationalOperation</code>, or <code>null</code> if not present
     */
    @Nullable
    RelationalOperationType getScaleInRelationalOperation();
    
    /**
     * Value above which scale-out requests are generated
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>scaleOutThreshold</code>, or <code>null</code> if not present
     */
    @Nullable
    BigInteger getScaleOutThreshold();
    
    /**
     * The relational operator used to compare the monitoring paramagainst the 
     * scale-out-threshold.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.RelationalOperationType</code> <code>scaleOutRelationalOperation</code>, or <code>null</code> if not present
     */
    @Nullable
    RelationalOperationType getScaleOutRelationalOperation();
    
    /**
     * Reference to the NS level monitoring parameterthat is aggregated
     *
     *
     *
     * @return <code>java.lang.String</code> <code>nsMonitoringParamRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getNsMonitoringParamRef();
    
    @Override
    ScalingCriteriaKey key();

}

