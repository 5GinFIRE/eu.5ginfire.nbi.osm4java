package yang.vnfd.vnfd.descriptor.vdu.cloud.init.input;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

import yang.vnfd.$YangModuleInfoImpl;
import yang.vnfd.vnfd.descriptor.vdu.CloudInitInput;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * case inline {
 *   leaf cloud-init {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/vdu/cloud-init-input/inline</i>
 *
 */
public interface Inline
    extends
    DataObject,
    Augmentable<Inline>,
    CloudInitInput
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("inline");

    /**
     * Contents of cloud-init script, provided inline, in cloud-config format
     *
     *
     *
     * @return <code>java.lang.String</code> <code>cloudInit</code>, or <code>null</code> if not present
     */
    @Nullable
    String getCloudInit();

}

