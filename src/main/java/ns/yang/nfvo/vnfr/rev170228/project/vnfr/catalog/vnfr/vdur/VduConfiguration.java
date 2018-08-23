package ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.VcaConfiguration;
import ns.yang.nfvo.vnfr.rev170228.$YangModuleInfoImpl;
import ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * container vdu-configuration {
 *   uses manotypes:vca-configuration;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/project/(urn:ietf:params:xml:ns:yang:nfvo:vnfr?revision=2017-02-28)vnfr-catalog/vnfr/vdur/vdu-configuration</i>
 * 
 * <p>To create instances of this class use {@link VduConfigurationBuilder}.
 * @see VduConfigurationBuilder
 *
 */
public interface VduConfiguration
    extends
    ChildOf<Vdur>,
    Augmentable<VduConfiguration>,
    VcaConfiguration
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vdu-configuration");


}

