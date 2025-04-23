// CountriesCapitals.java
// v1.0.0   20200404/01/d/
// v1.0.1   20200405/02/d/
//          - map of countries in separate class Countries
//          - 
//
// v1.0.2   20200405/03/d/
//          - FileReader reader = new FileReader("country-capitals.json") changet to InputStream so the json file
//            can be read from inside of jar file
//
// v1.0.3   20200408/04/en/
//          - multiple (varargs)
//          - new Usage message
//


import java.io.FileNotFoundException;
// import java.io.FileReader;
import java.io.IOException;
import java.util.*;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;


public class CountriesCapitals {

    // @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        String usage =  " +--------------------------------------------------------------------+\n" +
                        " | Usage:                                                             |\n" +
                        " | java -jar CountriesCapitals.jar [ country name part ] or  [ full ] |\n" +
                        " |     country name ... displays countries with part in name          |\n" +
                        " |     full         ... displays ALL countries (full list)            |\n" +
                        " +--------------------------------------------------------------------+\n" +
                        "\n";


        Map<String, Country> cntrsm = new HashMap<String, Country>();

        JSONParser jsonParser = new JSONParser();
        Countries countriesMap = new Countries();
        
        try { 
            String jsonFileName = "country-capitals.json";
            InputStream inputStreamObject = CountriesCapitals.class.getResourceAsStream(jsonFileName);
            BufferedReader streamReader = new BufferedReader(new InputStreamReader(inputStreamObject, "UTF-8"));
            StringBuilder responseStrBuilder = new StringBuilder();

            String inputStr;
            while ((inputStr = streamReader.readLine()) != null) {
                responseStrBuilder.append(inputStr);
            }

            String jsonString = responseStrBuilder.toString();

            // Read JSON file
            Object obj = jsonParser.parse(jsonString);

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

        if (args.length < 1) {
            System.out.println(usage);
            System.exit(1);
        } else if (args.length == 1 && args[0].toUpperCase().equals("FULL")) {
            countriesMap.displayAllCountries();
        } else {
            System.out.println("------------------------------");
            for (String patt : args) {
                countriesMap.displaySingle(patt);
            } // end for
        } // end if

    } // end main

} // end class
