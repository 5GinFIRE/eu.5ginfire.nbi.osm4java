package yang.rw.project.rev150910;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Class that builds {@link Project} instances.
 * 
 * @see Project
 *
 */
public class ProjectBuilder implements Builder<Project> {

    private String _description;
    private String _name;
    private ProjectKey key;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("project");

    Map<Class<? extends Augmentation<Project>>, Augmentation<Project>> augmentation = Collections.emptyMap();

    public ProjectBuilder() {
    }

    public ProjectBuilder(Project base) {
        if (base.key() == null) {
            this.key = new ProjectKey(
                base.getName()
            );
            this._name = base.getName();
        } else {
            this.key = base.key();
            this._name = key.getName();
        }
        this._description = base.getDescription();
        if (base instanceof ProjectImpl) {
            ProjectImpl impl = (ProjectImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<Project> casted =(AugmentationHolder<Project>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public ProjectKey key() {
        return key;
    }
    
    public String getDescription() {
        return _description;
    }
    
    public String getName() {
        return _name;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Project>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public ProjectBuilder withKey(final ProjectKey key) {
        this.key = key;
        return this;
    }
    
    public ProjectBuilder setDescription(final String value) {
        this._description = value;
        return this;
    }
    private static void check_nameLength(final String value) {
        final int length = value.length();
        if (length >= 1 && length <= 255) {
            return;
        }
        CodeHelpers.throwInvalidLength("[[1..255]]", value);
    }
    
    public ProjectBuilder setName(final String value) {
    if (value != null) {
        check_nameLength(value);
        
    }
        this._name = value;
        return this;
    }
    
    public ProjectBuilder addAugmentation(Class<? extends Augmentation<Project>> augmentationType, Augmentation<Project> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ProjectBuilder removeAugmentation(Class<? extends Augmentation<Project>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Project build() {
        return new ProjectImpl(this);
    }

    private static final class ProjectImpl implements Project {

        @Override
        public Class<Project> getImplementedInterface() {
            return Project.class;
        }

        private final String _description;
        private final String _name;
        private final ProjectKey key;

        private Map<Class<? extends Augmentation<Project>>, Augmentation<Project>> augmentation = Collections.emptyMap();

        private ProjectImpl(ProjectBuilder base) {
            if (base.key() == null) {
                this.key = new ProjectKey(
                    base.getName()
                );
                this._name = base.getName();
            } else {
                this.key = base.key();
                this._name = key.getName();
            }
            this._description = base.getDescription();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public ProjectKey key() {
            return key;
        }
        
        @Override
        public String getDescription() {
            return _description;
        }
        
        @Override
        public String getName() {
            return _name;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Project>> E augmentation(Class<E> augmentationType) {
            return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
        }

        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(augmentation);
        
            hash = result;
            hashValid = true;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!Project.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Project other = (Project)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ProjectImpl otherImpl = (ProjectImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Project>>, Augmentation<Project>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.augmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Project");
            CodeHelpers.appendValue(helper, "_description", _description);
            CodeHelpers.appendValue(helper, "_name", _name);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
