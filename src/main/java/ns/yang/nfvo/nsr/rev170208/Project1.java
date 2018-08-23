package ns.yang.nfvo.nsr.rev170208;

import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.DataObject;

import ns.yang.nfvo.nsr.rev170208.project.KeyPair;
import yang.rw.project.rev150910.Project;

public interface Project1 extends DataObject, Augmentation<Project> {

	/**
	 * Used to configure the list of public keys to be injected as partof ns
	 * instantiation
	 *
	 *
	 *
	 * @return <code>java.util.List</code> <code>keyPair</code>, or
	 *         <code>null</code> if not present
	 */
	@Nullable
	List<KeyPair> getKeyPair();

}
