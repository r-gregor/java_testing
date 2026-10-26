public class Country {
	String countryName;
	String capitalName;
	String countryCode;
	String continentName;

	public Country(String countryName, String capitalName, String countryCode,  String continentName) {
        this.countryName = countryName;
        this.capitalName = capitalName;
        this.countryCode = countryCode;
        this.continentName = continentName;
    }
    
    public String getCountry() {
        return this.countryName;
    }

    public String getCapital() {
        return this.capitalName;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getContinent() {
        return this.continentName;
    }
 
}
