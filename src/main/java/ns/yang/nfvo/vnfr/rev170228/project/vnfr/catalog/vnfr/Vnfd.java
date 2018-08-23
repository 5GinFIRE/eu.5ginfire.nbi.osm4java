package ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.vnfr.rev170228.$YangModuleInfoImpl;
import ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.Vnfr;
import yang.vnfd.VnfdDescriptor;

/**
 * VNF descriptor used to instantiate this VNF
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * container vnfd {
 *   uses vnfd-base:vnfd-descriptor;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/project/(urn:ietf:params:xml:ns:yang:nfvo:vnfr?revision=2017-02-28)vnfr-catalog/vnfr/vnfd</i>
 * 
 * <p>To create instances of this class use {@link VnfdBuilder}.
 * @see VnfdBuilder
 *
 */
public interface Vnfd
    extends
    ChildOf<Vnfr>,
    Augmentable<Vnfd>,
    VnfdDescriptor
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnfd");


}

