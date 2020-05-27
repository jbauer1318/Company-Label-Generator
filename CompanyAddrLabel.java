public class CompanyAddrLabel extends AddrLabel {
    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;
   
    private String attn_name;
    private String suite_num;
    
    public CompanyAddrLabel(String name, String street, String city,
                           String state, String zip, String attn_name,
                           String suite_num) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        
        this.attn_name = attn_name;
        this.suite_num = suite_num;
    }
    
    public String getName()
    { return empty_string; }

    public String getStreet()
    { return empty_string; }

    public String getCity()
    { return empty_string; }

    public String getState()
    { return empty_string; }

    public String getZipCode()
    { return empty_string; }
}