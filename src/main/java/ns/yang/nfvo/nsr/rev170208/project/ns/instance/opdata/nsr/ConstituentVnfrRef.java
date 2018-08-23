package ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.nsr;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.nsr.rev170208.project.ns.instance.opdata.Nsr;

/**
 * List of VNFRs that are part of thisnetwork service.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list constituent-vnfr-ref {
 *   key vnfr-id;
 *   leaf vnfr-id {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:ietf:params:xml:ns:yang:nfvo:nsr?revision=2017-02-08)ns-instance-opdata/nsr/constituent-vnfr-ref</i>
 * 
 * <p>To create instances of this class use {@link ConstituentVnfrRefBuilder}.
 * @see ConstituentVnfrRefBuilder
 * @see ConstituentVnfrRefKey
 *
 */
public interface ConstituentVnfrRef
    extends
    ChildOf<Nsr>,
    Augmentable<ConstituentVnfrRef>,
    Identifiable<ConstituentVnfrRefKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("constituent-vnfr-ref");

    /**
     * Reference to the VNFR idThis should be a leafref to 
     * /vnfr:vnfr-catalog/vnfr:vnfr/vnfr:idBut due to confd bug (RIFT-9451), changing 
     * to string.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>vnfrId</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVnfrId();
    
    @Override
    ConstituentVnfrRefKey key();

}

