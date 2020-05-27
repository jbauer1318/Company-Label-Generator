public class LabelGenerator {
    
    private AddrLabel[] labels;
    
    public LabelGenerator(AddrLabel[] labels){
        this.labels = labels;
    }
    
    public String[] getLabelLines(){   
    	String[] printable_labels = new String[labels.length];
        int i = 0;
        for(AddrLabel label : labels){
        	
            printable_labels[i] = genPrintableLabel(label);
            i++;
        }
        return printable_labels;
    }
    
    private String genPrintableLabel(AddrLabel label){
    	
        String s = AddrLabel.EMPTY_STR;
        String space = " ";
        
        if(!label.getAttnName().equals(AddrLabel.EMPTY_STR)) 
            s = s + "ATTN: " + label.getAttnName() + "\n";
        
        s = s + label.getTitle() + label.getName() + label.getNameSuffix() + 
                label.getProfessionalSuffix() + "\n";
        
        s = s + label.getStreet() + "\n";
        
        if(!label.getSuiteNum().equals(AddrLabel.EMPTY_STR)) 
        s = s + "Suite " + label.getSuiteNum() + "\n";
        
        s = s + label.getCity() + ", " + label.getState() + space + 
                label.getZipCode();
        
        return s;
    }
}