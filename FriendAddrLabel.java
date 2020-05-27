public class FriendAddrLabel extends AddrLabel { 
    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;
    
    public FriendAddrLabel(String name, String street, String city,
                           String state, String zip) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
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