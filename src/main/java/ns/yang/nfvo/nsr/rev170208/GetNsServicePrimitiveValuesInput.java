package ns.yang.nfvo.nsr.rev170208;
import java.lang.String;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.RpcInput;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * input {
 *   leaf name {
 *     type string;
 *   }
 *   uses rpc-common;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/get-ns-service-primitive-values/input</i>
 * 
 * <p>To create instances of this class use {@link GetNsServicePrimitiveValuesInputBuilder}.
 * @see GetNsServicePrimitiveValuesInputBuilder
 *
 */
public interface GetNsServicePrimitiveValuesInput
    extends
    RpcCommon,
    RpcInput,
    Augmentable<GetNsServicePrimitiveValuesInput>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("input");

    /**
     * Name of the NS service primitive group
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();

}

