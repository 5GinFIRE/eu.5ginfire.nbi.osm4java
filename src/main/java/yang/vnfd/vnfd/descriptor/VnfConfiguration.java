package yang.vnfd.vnfd.descriptor;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import ns.yang.nfvo.mano.types.rev170208.VcaConfiguration;
import yang.vnfd.$YangModuleInfoImpl;
import yang.vnfd.VnfdDescriptor;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module
 * <b>vnfd-base</b>
 * 
 * <pre>
 * container vnf-configuration {
 *   uses manotypes:vca-configuration;
 * }
 * </pre>
 * 
 * The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/vnf-configuration</i>
 * 
 * <p>
 * To create instances of this class use {@link VnfConfigurationBuilder}.
 * 
 * @see VnfConfigurationBuilder
 *
 */
public interface VnfConfiguration extends ChildOf<VnfdDescriptor>, Augmentable<VnfConfiguration>, VcaConfiguration {

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnf-configuration");

}
