package ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.vdur;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.VolumeInfo;
import ns.yang.nfvo.vnfr.rev170228.$YangModuleInfoImpl;
import ns.yang.nfvo.vnfr.rev170228.project.vnfr.catalog.vnfr.Vdur;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * list volumes {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   leaf volume-id {
 *     type string;
 *   }
 *   uses manotypes:volume-info;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/project/(urn:ietf:params:xml:ns:yang:nfvo:vnfr?revision=2017-02-28)vnfr-catalog/vnfr/vdur/volumes</i>
 * 
 * <p>To create instances of this class use {@link VolumesBuilder}.
 * @see VolumesBuilder
 * @see VolumesKey
 *
 */
public interface Volumes
    extends
    ChildOf<Vdur>,
    Augmentable<Volumes>,
    VolumeInfo,
    Identifiable<VolumesKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("volumes");

    /**
     * Name of the disk-volumes, e.g. vda, vdb etc
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * VIM assigned volume id
     *
     *
     *
     * @return <code>java.lang.String</code> <code>volumeId</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVolumeId();
    
    @Override
    VolumesKey key();

}

