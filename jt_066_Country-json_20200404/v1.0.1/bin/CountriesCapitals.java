// CountriesCapitals.java
// v1.0.0.  20200404/01/d/
// v1.0.1.  20200405/05/d/
//          - map of countries in separate class Countries
//          - 

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class CountriesCapitals {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        String usage =  "Usage:\n" +
                        " java -cp json-simple-1.1.jar:. CountriesCapitals [ country name part ] or  [ full ]\n" +
                        "\tcountry name ... displays countries with part in name\n" +
                        "\tfull         ... displays ALL countries (full list)\n" +
                        "\n";


        Map<String, Country> cntrsm = new HashMap<String, Country>();

        JSONParser jsonParser = new JSONParser();
        Countries countriesMap = new Countries();

        try (FileReader reader = new FileReader("country-capitals.json")){

            // Read JSON file
            Object obj = jsonParser.parse(reader);

            // Read JSON file
            JSONArray countries = (JSONArray) obj;

            for (Object el : countries) {
                JSONObject line = (JSONObject) el;
                String countryName = (String) line.get("CountryName");
                String capitalName = (String) line.get("CapitalName");
                String countryCode = (String) line.get("CountryCode");
                String continentName = (String) line.get("ContinentName");
                
                Country cntr = new Country(countryName, capitalName, countryCode, continentName);
                countriesMap.addCountry(cntr);

            } // end for

            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        if (args.length != 1) {
            System.out.println(usage); 
        } else if (args[0].toUpperCase().equals("full".toUpperCase())) {
            countriesMap.printAll();
        } else {
            countriesMap.printCountry(args[0]);
        }

    } // end main
  

} // end class
