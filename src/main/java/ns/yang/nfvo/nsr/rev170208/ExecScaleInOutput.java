package ns.yang.nfvo.nsr.rev170208;
import java.math.BigInteger;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.RpcOutput;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * output {
 *   leaf instance-id {
 *     type uint64;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/exec-scale-in/output</i>
 * 
 * <p>To create instances of this class use {@link ExecScaleInOutputBuilder}.
 * @see ExecScaleInOutputBuilder
 *
 */
public interface ExecScaleInOutput
    extends
    RpcOutput,
    Augmentable<ExecScaleInOutput>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("output");

    /**
     * id of the scaling group
     *
     *
     *
     * @return <code>java.math.BigInteger</code> <code>instanceId</code>, or <code>null</code> if not present
     */
    @Nullable
    BigInteger getInstanceId();

}

