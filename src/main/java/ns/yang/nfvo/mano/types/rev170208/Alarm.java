package ns.yang.nfvo.mano.types.rev170208;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.math.BigDecimal;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.alarm.Actions;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping alarm {
 *   leaf alarm-id {
 *     type string;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   leaf description {
 *     type string;
 *   }
 *   leaf vdur-id {
 *     type string;
 *   }
 *   container actions {
 *     list ok {
 *       key url;
 *       leaf url {
 *         type string;
 *       }
 *     }
 *     list insufficient-data {
 *       key url;
 *       leaf url {
 *         type string;
 *       }
 *     }
 *     list alarm {
 *       key url;
 *       leaf url {
 *         type string;
 *       }
 *     }
 *   }
 *   leaf repeat {
 *     type boolean;
 *     default true;
 *   }
 *   leaf enabled {
 *     type boolean;
 *     default true;
 *   }
 *   leaf severity {
 *     type alarm-severity-type;
 *   }
 *   leaf metric {
 *     type alarm-metric-type;
 *   }
 *   leaf statistic {
 *     type alarm-statistic-type;
 *   }
 *   leaf operation {
 *     type relational-operation-type;
 *   }
 *   leaf value {
 *     type decimal64 {
 *       fraction-digits 4;
 *     }
 *   }
 *   leaf period {
 *     type uint32;
 *   }
 *   leaf evaluations {
 *     type uint32;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/alarm</i>
 *
 */
public interface Alarm
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("alarm");

    /**
     * This field is reserved for the identifier assigned by the VIM provider
     *
     *
     *
     * @return <code>java.lang.String</code> <code>alarmId</code>, or <code>null</code> if not present
     */
    @Nullable
    String getAlarmId();
    
    /**
     * A human readable string to identify the alarm
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * A description of this alarm
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    @Nullable
    String getDescription();
    
    /**
     * The identifier of the VDUR that the alarm is associated with
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vdurId</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVdurId();
    
    /**
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.alarm.Actions</code> <code>actions</code>, or <code>null</code> if not present
     */
    @Nullable
    Actions getActions();
    
    /**
     * This flag indicates whether the alarm should be repeatedly emittedwhile the 
     * associated threshold has been crossed.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>repeat</code>, or <code>null</code> if not present
     */
    @Nullable
    Boolean isRepeat();
    
    /**
     * This flag indicates whether the alarm has been enabled ordisabled.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>enabled</code>, or <code>null</code> if not present
     */
    @Nullable
    Boolean isEnabled();
    
    /**
     * A measure of the importance or urgency of the alarm
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.AlarmSeverityType</code> <code>severity</code>, or <code>null</code> if not present
     */
    @Nullable
    AlarmSeverityType getSeverity();
    
    /**
     * The metric to be tracked by this alarm.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.AlarmMetricType</code> <code>metric</code>, or <code>null</code> if not present
     */
    @Nullable
    AlarmMetricType getMetric();
    
    /**
     * The type of metric statistic that is tracked by this alarm
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.AlarmStatisticType</code> <code>statistic</code>, or <code>null</code> if not present
     */
    @Nullable
    AlarmStatisticType getStatistic();
    
    /**
     * The relational operator used to define whether an alarm should betriggered in 
     * certain scenarios, such as if the metric statisticgoes above or below a 
     * specified value.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.RelationalOperationType</code> <code>operation</code>, or <code>null</code> if not present
     */
    @Nullable
    RelationalOperationType getOperation();
    
    /**
     * This value defines the threshold that, if crossed, will triggerthe alarm.
     *
     *
     *
     * @return <code>java.math.BigDecimal</code> <code>value</code>, or <code>null</code> if not present
     */
    @Nullable
    BigDecimal getValue();
    
    /**
     * The period defines the length of time (seconds) that the metricdata are 
     * collected over in oreder to evaluate the chosenstatistic.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>period</code>, or <code>null</code> if not present
     */
    @Nullable
    Long getPeriod();
    
    /**
     * Defines the length of time (seconds) in which metric data arecollected in order 
     * to evaluate the chosen statistic.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>evaluations</code>, or <code>null</code> if not present
     */
    @Nullable
    Long getEvaluations();

}

