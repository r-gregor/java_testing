import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.*;

public class Countries3{
    public static Map<String, Country> countriesMap = new HashMap<String, Country>();
    public static ArrayList<String> countriesNames = new ArrayList<String>();

    public Countries3() {
        pullCountriesInfoFromJason();
    }

    public static void pullCountriesInfoFromJason() {
        JSONParser jsonParser = new JSONParser();
                
        try {
            String jsonFileName = "country-capitals.json";
            InputStream inputStreamObject = Countries3.class.getResourceAsStream(jsonFileName);
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
                
                Country country = new Country(countryName, capitalName, countryCode, continentName);
                countriesMap.put(country.getCountryName(), country);
                countriesNames.add(country.getCountryName());

            } // end for

            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Collections.sort(countriesNames);
    }

    public ArrayList<String> getCountriesNamesList() {
        Collections.sort(countriesNames);
        return countriesNames;
    }

    public Country getCountry(String search) {
        return countriesMap.get(search);
    }

    public void printAllCountryiesNames() {
        for (String countryNM : countriesNames) {
            System.out.println(countryNM);
        }
    }

} // end class