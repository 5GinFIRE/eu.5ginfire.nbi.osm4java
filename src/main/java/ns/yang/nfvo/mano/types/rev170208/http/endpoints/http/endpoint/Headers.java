package ns.yang.nfvo.mano.types.rev170208.http.endpoints.http.endpoint;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.http.endpoints.HttpEndpoint;

/**
 * Custom HTTP headers to put on HTTP request
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list headers {
 *   key key;
 *   leaf key {
 *     type string;
 *   }
 *   leaf value {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/http-endpoints/http-endpoint/headers</i>
 * 
 * <p>To create instances of this class use {@link HeadersBuilder}.
 * @see HeadersBuilder
 * @see HeadersKey
 *
 */
public interface Headers
    extends
    ChildOf<HttpEndpoint>,
    Augmentable<Headers>,
    Identifiable<HeadersKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("headers");

    /**
     * HTTP header key
     *
     *
     *
     * @return <code>java.lang.String</code> <code>key</code>, or <code>null</code> if not present
     */
    @Nullable
    String getKey();
    
    /**
     * HTTP header value
     *
     *
     *
     * @return <code>java.lang.String</code> <code>value</code>, or <code>null</code> if not present
     */
    @Nullable
    String getValue();
    
    @Override
    HeadersKey key();

}

