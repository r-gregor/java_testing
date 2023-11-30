import java.util.*;
import java.io.*;

public class Props {
	
	// function to store contents of a String[] array into properties object
	public static void make_props(String[] array, Properties prop) {
			for (int i = 0; i < array.length; i++) {
				prop.setProperty(String.valueOf(i), array[i]);
			}
		}
	
	public static void main(String[] args) throws IOException {
		String[] names = {"Gregor", "Tadeja", "Zala", "Mark", "Špela"};
		String[] emails = {"gredelonghi@gmail.com", "gregor.redelonghi@energetika.si", "gredelonghi@yahoo.com"};
		
		// declare properties objects
		Properties props1 = new Properties();
		Properties props2 = new Properties();
		
		// declare output files
		OutputStream output1 = null;
		OutputStream output2 = null;
		
		output1 = new FileOutputStream("sklop1.properties");
		output2 = new FileOutputStream("sklop2.properties");
		
		
		// store contents of a String[] array into properties object
		make_props(names, props1);
		make_props(emails, props2);
		
		/* TEST display
		* // Output properties --normal-- to STDOUT:
		* System.out.println("#Output properties --normal--  to STDOUT:");
		* props1.store(System.out, "Family names");
		* 
		* // Output properties --XML-- to STDOUT:
		* System.out.print("\n");
		* props1.storeToXML(System.out, "Family names");
		*/
		
		// Output properties --XML-- to external file
		props1.storeToXML(output1, "Family names");
		props2.storeToXML(output2, "Gregor's emails");
		
		System.out.println("\"Family names\" and \"Gregor's emails\" successfuly exported to .properties files.");

	}
}
