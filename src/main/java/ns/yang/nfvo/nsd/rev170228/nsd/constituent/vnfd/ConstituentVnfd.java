package ns.yang.nfvo.nsd.rev170228.nsd.constituent.vnfd;

import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import ns.yang.nfvo.nsd.rev170228.$YangModuleInfoImpl;
import ns.yang.nfvo.nsd.rev170228.NsdConstituentVnfd;
import ns.yang.nfvo.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfdBuilder.ConstituentVnfdImpl;
/**
 * List of VNFDs that are part of thisnetwork service.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module
 * <b>nsd</b>
 * 
 * <pre>
 * list constituent-vnfd {
 *   key member-vnf-index;
 *   leaf member-vnf-index {
 *     type string;
 *   }
 *   leaf vnfd-id-ref {
 *     type leafref {
 *       path /vnfd:vnfd-catalog/vnfd:vnfd/vnfd:id;
 *     }
 *   }
 *   leaf start-by-default {
 *     type boolean;
 *     default true;
 *   }
 * }
 * </pre>
 * 
 * The schema path to identify an instance is
 * <i>nsd/nsd-constituent-vnfd/constituent-vnfd</i>
 * 
 * <p>
 * To create instances of this class use {@link ConstituentVnfdBuilder}.
 * 
 * @see ConstituentVnfdBuilder
 * @see ConstituentVnfdKey
 *
 */
@JsonDeserialize(as = ConstituentVnfdImpl.class)
public interface ConstituentVnfd
		extends ChildOf<NsdConstituentVnfd>, Augmentable<ConstituentVnfd>, Identifiable<ConstituentVnfdKey> {

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("constituent-vnfd");

	/**
	 * Identifier/index for the VNFD. This separate idis required to ensure that
	 * multiple VNFs can bepart of single NS
	 *
	 *
	 *
	 * @return <code>java.lang.String</code> <code>memberVnfIndex</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	String getMemberVnfIndex();

	/**
	 * Identifier for the VNFD.
	 *
	 *
	 *
	 * @return <code>java.lang.String</code> <code>vnfdIdRef</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	String getVnfdIdRef();

	/**
	 * VNFD is started as part of the NS instantiation
	 *
	 *
	 *
	 * @return <code>java.lang.Boolean</code> <code>startByDefault</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	Boolean isStartByDefault();

	@Override
	ConstituentVnfdKey key();

}
