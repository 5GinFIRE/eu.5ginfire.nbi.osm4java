package OSM4Util.OSM4NSReq;

import java.util.Formatter;
import java.util.List;

import ns.yang.nfvo.nsd.rev170228.nsd.catalog.Nsd;

public class OSM4NSRequirements {
    public Nsd nsDescriptor;

    public boolean unknownFields = false;
    public int memoryMB = 0;
    public int storageGB = 0;
    public int vcpuCount = 0;
    public int vmCount = 0;

    public OSM4NSRequirements(Nsd nsDescriptor) {
        this.nsDescriptor = nsDescriptor;

        this.memoryMB = 0;
        this.storageGB = 0;
        this.vcpuCount = 0;
        this.vmCount = 0;


    }

    public String toHTML() {
        StringBuilder stringBuilder = new StringBuilder();
        Formatter fmt = new Formatter(stringBuilder);
        fmt.format("<h3>%s</h3><br>", this.nsDescriptor.getName() );
        fmt.format("<b>%s: </b>%s<br>", "Vendor", nsDescriptor.getVendor());
        fmt.format("<b>%s: </b>%s<br>", "Version", nsDescriptor.getVersion());
        fmt.format("<b>%s: </b>%s<br>", "Description", nsDescriptor.getDescription());
        if ( nsDescriptor.getConstituentVnfd() != null ) {
        	fmt.format("<b>%s: </b>%d<br>", "VNF Count", nsDescriptor.getConstituentVnfd().size());
        }
        
        fmt.format("<b>%s: </b>%d<br>", "VM Count", vmCount);
        fmt.format("<b>%s: </b>%d<br>", "vCPU Count", vcpuCount);
        fmt.format("<b>%s: </b>%d MB<br>", "Memory", memoryMB);
        fmt.format("<b>%s: </b>%d GB<br>", "Storage", storageGB);

        fmt.format("<h2>%s</h2><br>", "ConstituentVnfds" );
        if ( nsDescriptor.getConstituentVnfd() != null ) {
            List<ns.yang.nfvo.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd> vl = nsDescriptor.getConstituentVnfd();
            for (ns.yang.nfvo.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd constituentVnfd : vl) {
                fmt.format("<b>%s: </b>%s<br>", "VnfdId", constituentVnfd.getVnfdIdRef() );
            	
    		}        	
        }
        
        
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "NSRequirements{" +
                "nsName=" + nsDescriptor.getName() +
                ", memoryMB=" + memoryMB +
                ", storageGB=" + storageGB +
                ", vcpuCount=" + vcpuCount +
                ", vmCount=" + vmCount +
                '}';
    }
}
