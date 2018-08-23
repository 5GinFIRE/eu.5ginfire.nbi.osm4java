package yang.base.nsd.descriptor.common.connection.point.connection;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import yang.base.$YangModuleInfoImpl;
import yang.base.nsd.descriptor.common.connection.point.Connection;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * case vld-ref {
 *   leaf vld-id-ref {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/connection-point/connection/vld-ref</i>
 *
 */
public interface VldRef
    extends
    DataObject,
    Augmentable<VldRef>,
    Connection
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vld-ref");

    /**
     * ID reference to a VLD in the NS
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vldIdRef</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVldIdRef();

}

