public abstract class AddrLabel implements AddrLabelInterface {
    public final static String empty_string = "";
    
    // default empty string methods
    public String getAttnName()
    { return empty_string; }

    public String getTitle()
    { return empty_string; }

    public String getNameSuffix()
    { return empty_string; }

    public String getProfessionalSuffix()
    { return empty_string; }

    public String getSuiteNum()
    { return empty_string; }
}