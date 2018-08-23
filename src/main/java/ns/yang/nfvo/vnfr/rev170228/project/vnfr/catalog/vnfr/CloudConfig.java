package ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.vnfr.rev170228.$YangModuleInfoImpl;
import ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * container cloud-config {
 *   uses manotypes:cloud-config;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/project/(urn:ietf:params:xml:ns:yang:nfvo:vnfr?revision=2017-02-28)vnfr-catalog/vnfr/cloud-config</i>
 * 
 * <p>To create instances of this class use {@link CloudConfigBuilder}.
 * @see CloudConfigBuilder
 *
 */
public interface CloudConfig
    extends
    ChildOf<Vnfr>,
    Augmentable<CloudConfig>,
    ns.yang.nfvo.mano.types.rev170208.CloudConfig
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("cloud-config");


}

