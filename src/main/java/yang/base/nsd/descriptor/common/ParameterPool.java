package yang.base.nsd.descriptor.common;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import yang.base.$YangModuleInfoImpl;
import yang.base.NsdDescriptorCommon;
import yang.base.nsd.descriptor.common.parameter.pool.Range;

/**
 * Pool of parameter values which must bepulled from during configuration
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list parameter-pool {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   container range {
 *     leaf start-value {
 *       type uint32;
 *     }
 *     leaf end-value {
 *       type uint32;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/parameter-pool</i>
 * 
 * <p>To create instances of this class use {@link ParameterPoolBuilder}.
 * @see ParameterPoolBuilder
 * @see ParameterPoolKey
 *
 */
public interface ParameterPool
    extends
    ChildOf<NsdDescriptorCommon>,
    Augmentable<ParameterPool>,
    Identifiable<ParameterPoolKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("parameter-pool");

    /**
     * Name of the configuration value pool
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * Create a range of values to populate the pool with
     *
     *
     *
     * @return <code>model.http.riftio.com.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.parameter.pool.Range</code> <code>range</code>, or <code>null</code> if not present
     */
    @Nullable
    Range getRange();
    
    @Override
    ParameterPoolKey key();

}

