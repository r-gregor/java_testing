import java.util.*;

public class Countries {
    private Country country;
    private Map<String, Country> cmap = new HashMap<String, Country>();

    public void addCountry(Country country) {
        cmap.put(country.getCountry(), country);
    }

    public void printAll() {
        for (Map.Entry<String, Country> entry : cmap.entrySet()) {
            String country = entry.getValue().getCountry();
            String capital = entry.getValue().getCapital();
            String code = entry.getValue().getCountryCode();
            String continent = entry.getValue().getContinent();
            
            System.out.printf(  "Country: %s\n" +
            "Capital: %s\n" +
            "Country code: %s\n" +
            "Continent: %s\n", country, capital, code, continent);
            System.out.println("------------------------------");
        } // end for
    }

    public void printCountry(String search) {
        for (Map.Entry<String, Country> entry : cmap.entrySet()) {
            String country = entry.getKey();
            if (country.toUpperCase().contains(search.toUpperCase())) {
                String capital = cmap.get(country).getCapital();
                String code = cmap.get(country).getCountryCode();
                String continent = cmap.get(country).getContinent();

                System.out.printf(  "Country: %s\n" +
                "Capital: %s\n" +
                "Country code: %s\n" +
                "Continent: %s\n", country, capital, code, continent);
                System.out.println("------------------------------");

            } else {
                continue;
            } // end if
        } // end for

    }

} // end class