package ns.yang.nfvo.nsr.rev170208;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.RpcOutput;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.ietf.yang.types.rev130715.Uuid;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * output {
 *   leaf nsr-id {
 *     type yang:uuid;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/start-network-service/output</i>
 * 
 * <p>To create instances of this class use {@link StartNetworkServiceOutputBuilder}.
 * @see StartNetworkServiceOutputBuilder
 *
 */
public interface StartNetworkServiceOutput
    extends
    RpcOutput,
    Augmentable<StartNetworkServiceOutput>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("output");

    /**
     * Automatically generated parameter
     *
     *
     *
     * @return <code>model.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>nsrId</code>, or <code>null</code> if not present
     */
    @Nullable
    Uuid getNsrId();

}

