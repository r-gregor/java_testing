public class Country {
	String CountryName;
	String CapitalName;
	String CountryCode;
	String ContinentName;

	public Country(String CountryName, String CapitalName, String ContinentName) {
        this.CountryName = CountryName;
        this.CapitalName = CapitalName;
        this.ContinentName = ContinentName;
    }
    
    private String getCountryName() {
        return this.CountryName;
    }

    private String getCapitalName() {
        return this.CapitalName;
    }
 
}
