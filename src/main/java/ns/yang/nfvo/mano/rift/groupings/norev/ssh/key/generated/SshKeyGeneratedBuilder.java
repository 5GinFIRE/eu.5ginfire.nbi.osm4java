package ns.yang.nfvo.mano.rift.groupings.norev.ssh.key.generated;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;

import ns.yang.nfvo.mano.rift.groupings.norev.$YangModuleInfoImpl;

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
 * Class that builds {@link SshKeyGenerated} instances.
 * 
 * @see SshKeyGenerated
 *
 */
public class SshKeyGeneratedBuilder implements Builder<SshKeyGenerated> {

    private String _privateKeyFile;
    private String _publicKey;

    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ssh-key-generated");

    Map<Class<? extends Augmentation<SshKeyGenerated>>, Augmentation<SshKeyGenerated>> augmentation = Collections.emptyMap();

    public SshKeyGeneratedBuilder() {
    }

    public SshKeyGeneratedBuilder(SshKeyGenerated base) {
        this._privateKeyFile = base.getPrivateKeyFile();
        this._publicKey = base.getPublicKey();
        if (base instanceof SshKeyGeneratedImpl) {
            SshKeyGeneratedImpl impl = (SshKeyGeneratedImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<SshKeyGenerated> casted =(AugmentationHolder<SshKeyGenerated>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public String getPrivateKeyFile() {
        return _privateKeyFile;
    }
    
    public String getPublicKey() {
        return _publicKey;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<SshKeyGenerated>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public SshKeyGeneratedBuilder setPrivateKeyFile(final String value) {
        this._privateKeyFile = value;
        return this;
    }
    
    public SshKeyGeneratedBuilder setPublicKey(final String value) {
        this._publicKey = value;
        return this;
    }
    
    public SshKeyGeneratedBuilder addAugmentation(Class<? extends Augmentation<SshKeyGenerated>> augmentationType, Augmentation<SshKeyGenerated> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public SshKeyGeneratedBuilder removeAugmentation(Class<? extends Augmentation<SshKeyGenerated>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public SshKeyGenerated build() {
        return new SshKeyGeneratedImpl(this);
    }

    private static final class SshKeyGeneratedImpl implements SshKeyGenerated {

        @Override
        public Class<SshKeyGenerated> getImplementedInterface() {
            return SshKeyGenerated.class;
        }

        private final String _privateKeyFile;
        private final String _publicKey;

        private Map<Class<? extends Augmentation<SshKeyGenerated>>, Augmentation<SshKeyGenerated>> augmentation = Collections.emptyMap();

        private SshKeyGeneratedImpl(SshKeyGeneratedBuilder base) {
            this._privateKeyFile = base.getPrivateKeyFile();
            this._publicKey = base.getPublicKey();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public String getPrivateKeyFile() {
            return _privateKeyFile;
        }
        
        @Override
        public String getPublicKey() {
            return _publicKey;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<SshKeyGenerated>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_privateKeyFile);
            result = prime * result + Objects.hashCode(_publicKey);
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
            if (!SshKeyGenerated.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            SshKeyGenerated other = (SshKeyGenerated)obj;
            if (!Objects.equals(_privateKeyFile, other.getPrivateKeyFile())) {
                return false;
            }
            if (!Objects.equals(_publicKey, other.getPublicKey())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SshKeyGeneratedImpl otherImpl = (SshKeyGeneratedImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<SshKeyGenerated>>, Augmentation<SshKeyGenerated>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("SshKeyGenerated");
            CodeHelpers.appendValue(helper, "_privateKeyFile", _privateKeyFile);
            CodeHelpers.appendValue(helper, "_publicKey", _publicKey);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
