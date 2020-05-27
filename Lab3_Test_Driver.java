public class Lab3_Test_Driver {

    public static void main(String[] args) {
        
        // set label information
        
        AddrLabel[] labels = new AddrLabel[3];
        
        labels[0] = new FriendAddrLabel("John Smith", 
                                        "123 Main St.",
                                        "Bel Air", "MD", "21015");
        
        labels[1] = new FriendAddrLabel("Mary Jones", 
                                        "456 Main St.",
                                        "Abingdon", "MD", "21009");
        
        labels[2] = new CompanyAddrLabel("ABC Company", 
                                         "1000 Industrial Way",
                                         "Essex", "MD", "22005",
                                         "Susan Powers", // attn line
                                         "101"); // suite num
        
        // generator printable labels
        LabelGenerator addr_gen = new LabelGenerator(labels);
        String[] printable_labels = addr_gen.getLabelLines();
        
        // display labels
        for(String printable_label : printable_labels)
        {
            System.out.print(printable_label + "\n\n");
        }
    }
    
}