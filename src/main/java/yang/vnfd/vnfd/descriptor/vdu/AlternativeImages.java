package yang.vnfd.vnfd.descriptor.vdu;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.ImageProperties;
import yang.vnfd.$YangModuleInfoImpl;
import yang.vnfd.vnfd.descriptor.Vdu;

/**
 * List of alternative images per VIM type.Different images can be used for
 * specific types of VIMs insteadof the default image. This allows deployments
 * in sites where theimage identifier in the VIM is given by the VIM provider
 * andcannot be modified.If an alternative image is specified for a VIM type, it
 * will prevailover the default image
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module
 * <b>vnfd-base</b>
 * 
 * <pre>
 * list alternative-images {
 *   key vim-type;
 *   leaf vim-type {
 *     type string;
 *   }
 *   uses manotypes:image-properties;
 * }
 * </pre>
 * 
 * The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/vdu/alternative-images</i>
 * 
 * <p>
 * To create instances of this class use {@link AlternativeImagesBuilder}.
 * 
 * @see AlternativeImagesBuilder
 * @see AlternativeImagesKey
 *
 */
public interface AlternativeImages
		extends ChildOf<Vdu>, Augmentable<AlternativeImages>, ImageProperties, Identifiable<AlternativeImagesKey> {

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("alternative-images");

	/**
	 * VIM type: openvim, openstack, vmware, aws, etc.
	 *
	 *
	 *
	 * @return <code>java.lang.String</code> <code>vimType</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	String getVimType();

	@Override
	AlternativeImagesKey key();

}
