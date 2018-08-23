package yang.rw.project.rev150910;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Configuration and state for individual projects. RIFT.wareapplications and
 * projects are expected to augment this list inorder to add configuration for
 * projects that is specific to theproduct or application. As such, this list
 * contains minimaldata defined in this yang module.When augmenting this
 * element, other yang modules should prefer todefine containers with the same
 * name as the augmenting module.(Augmenting RIFT.ware modules should prefer to
 * augment withoutthe rw prefix [for new features], or should prefer to augment
 * theaugmented container of an existing augment, to ease futureadoption and/or
 * standardization.)
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module
 * <b>rw-project</b>
 * 
 * <pre>
 * list project {
 *   key name;
 *   leaf name {
 *     type string {
 *       length 1..255;
 *     }
 *   }
 *   leaf description {
 *     type string;
 *   }
 * }
 * </pre>
 * 
 * The schema path to identify an instance is <i>rw-project/project</i>
 * 
 * <p>
 * To create instances of this class use {@link ProjectBuilder}.
 * 
 * @see ProjectBuilder
 * @see ProjectKey
 *
 */
public interface Project extends ChildOf<RwProjectData>, Augmentable<Project>, Identifiable<ProjectKey> {

	public static final QName QNAME = $YangModuleInfoImpl.qnameOf("project");

	/**
	 * Name of the project.
	 *
	 *
	 *
	 * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code>
	 *         if not present
	 */
	@Nullable
	String getName();

	/**
	 * Information about project
	 *
	 *
	 *
	 * @return <code>java.lang.String</code> <code>description</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	String getDescription();

	@Override
	ProjectKey key();

}
