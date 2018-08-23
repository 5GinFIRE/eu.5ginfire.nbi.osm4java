package ns.yang.nfvo.mano.types.rev170208.control.param;
import java.lang.Override;
import java.lang.String;
import java.math.BigInteger;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.ietf.inet.types.rev100924.Uri;
import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.HttpMethod;
import ns.yang.nfvo.mano.types.rev170208.WidgetType;

/**
 * List of control parameters to manage andupdate the running configuration of the 
 * VNF
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list control-param {
 *   key id;
 *   leaf id {
 *     type string;
 *   }
 *   leaf name {
 *     type string;
 *   }
 *   leaf description {
 *     type string;
 *   }
 *   leaf group-tag {
 *     type string;
 *   }
 *   leaf min-value {
 *     type uint64;
 *   }
 *   leaf max-value {
 *     type uint64;
 *   }
 *   leaf current-value {
 *     type uint64;
 *   }
 *   leaf step-value {
 *     type uint64;
 *   }
 *   leaf units {
 *     type string;
 *   }
 *   leaf widget-type {
 *     type manotypes:widget-type;
 *   }
 *   leaf url {
 *     type inet:uri;
 *   }
 *   leaf method {
 *     type manotypes:http-method;
 *     default POST;
 *   }
 *   leaf payload {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/control-param/control-param</i>
 * 
 * <p>To create instances of this class use {@link ControlParamBuilder}.
 * @see ControlParamBuilder
 * @see ControlParamKey
 *
 */
public interface ControlParam
    extends
    ChildOf<ns.yang.nfvo.mano.types.rev170208.ControlParam>,
    Augmentable<ControlParam>,
    Identifiable<ControlParamKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("control-param");

    /**
     * Identifier for control parameter
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable
    String getId();
    
    /**
     * Name of a control parameter
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * A description of the control parameter
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    @Nullable
    String getDescription();
    
    /**
     * A tag to group control parameters
     *
     *
     *
     * @return <code>java.lang.String</code> <code>groupTag</code>, or <code>null</code> if not present
     */
    @Nullable
    String getGroupTag();
    
    /**
     * Minimum value for the parameter
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>minValue</code>, or <code>null</code> if not present
     */
    @Nullable
    BigInteger getMinValue();
    
    /**
     * Maximum value for the parameter
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>maxValue</code>, or <code>null</code> if not present
     */
    @Nullable
    BigInteger getMaxValue();
    
    /**
     * Current value for the parameter
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>currentValue</code>, or <code>null</code> if not present
     */
    @Nullable
    BigInteger getCurrentValue();
    
    /**
     * Step value for the parameter
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>stepValue</code>, or <code>null</code> if not present
     */
    @Nullable
    BigInteger getStepValue();
    
    /**
     * @return <code>java.lang.String</code> <code>units</code>, or <code>null</code> if not present
     */
    @Nullable
    String getUnits();
    
    /**
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.WidgetType</code> <code>widgetType</code>, or <code>null</code> if not present
     */
    @Nullable
    WidgetType getWidgetType();
    
    /**
     * This is the URL where the operation should be performed.
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev100924.Uri</code> <code>url</code>, or <code>null</code> if not present
     */
    @Nullable
    Uri getUrl();
    
    /**
     * Method that the URI should perform.Default Action is POST
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.HttpMethod</code> <code>method</code>, or <code>null</code> if not present
     */
    @Nullable
    HttpMethod getMethod();
    
    /**
     * This is the operation payload or payload template as stringifiedJSON. This field
     * provides the data to be sent for this operationcall
     *
     *
     *
     * @return <code>java.lang.String</code> <code>payload</code>, or <code>null</code> if not present
     */
    @Nullable
    String getPayload();
    
    @Override
    ControlParamKey key();

}

