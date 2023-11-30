// CountriesCapitals.java
// v1.0.0.  20200404/01/d/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.*;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class CountriesCapitals {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        Map<String, Country> cntrsm = new HashMap<String, Country>();

        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("country-capitals.json")){

            //Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONArray countries = (JSONArray) obj;
            // System.out.println(countries);

            for (Object el : countries) {
                JSONObject line = (JSONObject) el;
                String countryName = (String) line.get("CountryName");
                String capitalName = (String) line.get("CapitalName");
                String continentName = (String) line.get("ContinentName");
                
                System.out.printf(  "Country: %s\n" +
                                    "Capital: %s\n" +
                                    "Continent: %s\n", countryName, capitalName, continentName);
                System.out.println("------------------------------");

            } // end for

            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    } // end main
  

} // end class
