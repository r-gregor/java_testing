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
    
    public String getCountryName() {
        return this.countryName;
    }

    public String getCapitalName() {
        return this.capitalName;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getContinentName() {
        return this.continentName;
    }

    @Override
    public String toString() {
        String printOut = String.format(  "Country: %s%n" +
                        "Capital: %s%n" +
                        "Country code: %s%n" +
                        "Continent: %s%n" +
                        "--------------------------------------", this.countryName, this.capitalName, this.countryCode, this.continentName);
        return printOut;
    }
 
}
