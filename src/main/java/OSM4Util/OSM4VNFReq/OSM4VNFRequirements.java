package OSM4Util.OSM4VNFReq;

import java.util.Formatter;

import ns.yang.nfvo.vnfd.rev170228.vnfd.catalog.Vnfd;
import yang.vnfd.vnfd.descriptor.Vdu;

public class OSM4VNFRequirements {
    public Vnfd descriptor;

    public boolean unknownFields = false;
    public int memoryMB = 0;
    public int storageGB = 0;
    public int vcpuCount = 0;
    public int vmCount = 0;
    
    public OSM4VNFRequirements()
    {}
    
    public OSM4VNFRequirements(Vnfd descriptor) {
        this.descriptor = descriptor;

        this.memoryMB = 0;
        this.storageGB = 0;
        this.vcpuCount = 0;
        this.vmCount = 0;

        for(Vdu vdu : descriptor.getVdu() ) {        	        
            this.memoryMB +=  vdu.getCount().intValue()  * vdu.getVmFlavor().getMemoryMb().intValue();
            this.storageGB += vdu.getCount().intValue() * vdu.getVmFlavor().getStorageGb().intValue();
            this.vcpuCount += vdu.getCount().intValue() * 1;//vdu.getVmFlavor().getVcpuCount().intValue();
            this.vmCount += vdu.getCount().intValue();
        }
    }

    public String toHTML() {
        StringBuilder stringBuilder = new StringBuilder();
        Formatter fmt = new Formatter(stringBuilder);
        fmt.format("<h3>%s</h3><br>", descriptor.getName());
        fmt.format("<b>%s: </b>%s<br>", "Vendor", descriptor.getVendor() );
        fmt.format("<b>%s: </b>%s<br>", "Version", descriptor.getVersion() );
        fmt.format("<b>%s: </b>%s<br>", "Description", descriptor.getDescription());
        fmt.format("<b>%s: </b>%d<br>", "VM Count", vmCount);
        fmt.format("<b>%s: </b>%d<br>", "vCPU Count", vcpuCount);
        fmt.format("<b>%s: </b>%d MB<br>", "Memory", memoryMB);
        fmt.format("<b>%s: </b>%d GB<br>", "Storage", storageGB);

        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "VNFRequirements{" +
                "vnfName=" + descriptor.getName() +
                ", memoryMB=" + memoryMB +
                ", storageGB=" + storageGB +
                ", vcpuCount=" + vcpuCount +
                ", vmCount=" + vmCount +
                '}';
    }
}
