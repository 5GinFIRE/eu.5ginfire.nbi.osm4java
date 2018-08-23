package ns.yang.nfvo.mano.types.rev170208;
import java.util.List;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Grouping for files needed to be mounted into an additional drive
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping config-file {
 *   list config-file {
 *     key source;
 *     leaf source {
 *       type string;
 *     }
 *     leaf dest {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/config-file</i>
 *
 */
public interface ConfigFile
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("config-file");

    /**
     * List of configuration files to be written on an additional drive
     *
     *
     *
     * @return <code>java.util.List</code> <code>configFile</code>, or <code>null</code> if not present
     */
    @Nullable
    List<ns.yang.nfvo.mano.types.rev170208.config.file.ConfigFile> getConfigFile();

}

