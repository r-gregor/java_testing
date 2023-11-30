import func_list_en.*;
import java.util.*;

public class disp_syst_props {

	public static void main(String[] args) {
		
		System.out.println();
		String class_name = System.getProperty("sun.java.command");
		System.out.printf("Class name: %s.\n", class_name);
		
		
		System.out.println();
		String[] names = {"java.class.path", "java.home", "java.vendor", "java.vendor.url", "java.version", "os.arch", "os.name", "os.version"};
		for (int i = 0; i < names.length; i++) {
			System.out.printf("%-18s %s\n", names[i] + ":", System.getProperty(names[i]));
		}
		
		System.out.println();
		System.getProperties().list(System.out);

	}

}