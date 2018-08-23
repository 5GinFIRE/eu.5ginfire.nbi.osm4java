package ns.yang.nfvo.mano.types.rev170208.host.epa.host.epa;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import ns.yang.nfvo.mano.types.rev170208.host.epa.HostEpa;

/**
 * List of OpenMANO CPU features
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list om-cpu-feature {
 *   key feature;
 *   leaf feature {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/host-epa/host-epa/om-cpu-feature</i>
 * 
 * <p>To create instances of this class use {@link OmCpuFeatureBuilder}.
 * @see OmCpuFeatureBuilder
 * @see OmCpuFeatureKey
 *
 */
public interface OmCpuFeature
    extends
    ChildOf<HostEpa>,
    Augmentable<OmCpuFeature>,
    Identifiable<OmCpuFeatureKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("om-cpu-feature");

    /**
     * CPU feature
     *
     *
     *
     * @return <code>java.lang.String</code> <code>feature</code>, or <code>null</code> if not present
     */
    @Nullable
    String getFeature();
    
    @Override
    OmCpuFeatureKey key();

}

