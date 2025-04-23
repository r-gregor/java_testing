package app_name.pkg_name_1;

import java.util.*;
import java.util.Date;
import app_name.common.func_list_en.Funcl;

// App_1.java

public class App_1 {
	
	public static void nl() {
		System.out.println();
	}
	
	public static void response(String[] nms) {
		for (int i=0; i < nms.length; i++) {
			String item = nms[i];
			System.out.printf("This is argument nr.: %s: %s.\n", i, item);
		}
	}
	
	public static void get_App_1_data() {
		String name = "App_1";
		String cr_date = "06.09.2018";
		
		System.out.printf("%-16s%s\n", "App name:", name);
		System.out.printf("%-16s%s\n", "Creation date:", cr_date);
		
	}
	
	// MAIN
	public static void main(String[] args) {
		
		// cls
		Funcl.cls();
		
		// START
		Funcl.start_info();
		
		nl();
		System.out.println("Running response() function with some args ...");
		String[] my_args = new String[]{"Gregor", "Redelonghi", "Valvasorjeva ulica 5", "1000 Ljubljana"};
		response(my_args);
		
		nl();
	}
}
