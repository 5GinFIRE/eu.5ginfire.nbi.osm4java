package ns.yang.nfvo.nsr.rev170208;

import org.opendaylight.yangtools.yang.binding.ResourceYangModuleInfo;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.YangModuleInfo;
import java.util.Set;
import java.util.HashSet;
import com.google.common.collect.ImmutableSet;

public final class $YangModuleInfoImpl extends ResourceYangModuleInfo {
    private static final QName NAME = QName.create("urn:ietf:params:xml:ns:yang:nfvo:nsr", "2017-02-08", "nsr").intern();
    private static final YangModuleInfo INSTANCE = new $YangModuleInfoImpl();

    private final Set<YangModuleInfo> importedModules;

    public static YangModuleInfo getInstance() {
        return INSTANCE;
    }

    public static QName qnameOf(final java.lang.String localName) {
        return QName.create(NAME, localName).intern();
    }

    private $YangModuleInfoImpl() {
        Set<YangModuleInfo> set = new HashSet<>();
        set.add(yang.rw.project.rev150910.$YangModuleInfoImpl.getInstance());
        set.add(ns.yang.ietf.inet.types.rev100924.$YangModuleInfoImpl.getInstance());
        set.add(ns.yang.nfvo.vlr.rev170208.$YangModuleInfoImpl.getInstance());
        set.add(yang.project.nsd.rev170228.$YangModuleInfoImpl.getInstance());
        set.add(yang.project.vnfd.rev170228.$YangModuleInfoImpl.getInstance());
        set.add(ns.yang.ietf.yang.types.rev130715.$YangModuleInfoImpl.getInstance());
        set.add(ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl.getInstance());
        set.add(ns.yang.nfvo.vnfr.rev170228.$YangModuleInfoImpl.getInstance());
        set.add(yang.base.$YangModuleInfoImpl.getInstance());
        importedModules = ImmutableSet.copyOf(set);
    }
    
    @java.lang.Override
    public QName getName() {
        return NAME;
    }
    
    @java.lang.Override
    protected java.lang.String resourceName() {
        return "/META-INF/yang/nsr@2017-02-08.yang";
    }
    
    @java.lang.Override
    public Set<YangModuleInfo> getImportedModules() {
        return importedModules;
    }
    
    
}
