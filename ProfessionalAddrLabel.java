public class ProfessionalAddrLabel extends AddrLabel {
    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;
    
    private String professional_suffix;
    private String suite;
    
    public ProfessionalAddrLabel(String name, String street, String city,
                                 String state, String zip, 
                                 String professional_suffix,
                                 String suite) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        
        this.professional_suffix = professional_suffix;
        this.suite = suite;
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

    public String getProfessionalSuffix()
    { return professional_suffix; }

    public String getSuite()
    { return suite; }
   
}