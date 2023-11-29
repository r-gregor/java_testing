import java.util.*;
import java.io.*;

public class MapToProps {
	
	// function to store contents of a String[] array into properties object
	public static void make_props(Map<String, String> my_map, Properties prop) {
			for (Map.Entry<String, String> entry : my_map.entrySet() ) {
				prop.setProperty(entry.getKey(), entry.getValue());
				// test print
				// System.out.println(entry.getKey() + " ==> " + entry.getValue());
			}
		}
	
	public static void main(String[] args) throws IOException {
		
		// declare a map
		Map<String, String> my_info = new HashMap<String, String>();
		my_info.put("Movie 1", "Back to the Future");
		my_info.put("Movie 2", "Conan - the barbarian");
		my_info.put("Movie 3", "STAR WARS, part VI");
		my_info.put("Movie 4", "START TREK: Into The Void");
		
		// declare properties objects
		Properties props3 = new Properties();

		// declare output files
		OutputStream output3 = null;
		output3 = new FileOutputStream("movies.properties");
		
		// store contents of a map into properties object
		make_props(my_info, props3);
		
		// Output properties --XML-- to external file
		props3.storeToXML(output3, "Movie database");
		
	} // END main
} // END class
