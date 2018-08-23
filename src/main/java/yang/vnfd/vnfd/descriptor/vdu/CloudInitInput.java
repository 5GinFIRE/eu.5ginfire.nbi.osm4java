package yang.vnfd.vnfd.descriptor.vdu;
import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

import yang.vnfd.$YangModuleInfoImpl;
import yang.vnfd.vnfd.descriptor.Vdu;

/**
 * Indicates how the contents of cloud-init script are provided.There are 2 
 * - inline or in a file
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * choice cloud-init-input {
 *   case inline {
 *     leaf cloud-init {
 *       type string;
 *     }
 *   }
 *   case filename {
 *     leaf cloud-init-file {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/vdu/cloud-init-input</i>
 *
 */
public interface CloudInitInput
    extends
    ChoiceIn<Vdu>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("cloud-init-input");


}

