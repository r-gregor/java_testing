package app_name.pkg_name_2;

import app_name.common.func_list_en.Funcl;

// App_2.java

public class App_2 {
	public static void nl() {
		System.out.println();
	}
	
	public static void get_App_2_data() {
		String name = "App_2";
		String cr_date = "06.09.2018";
		String author = "RogerG";
		
		System.out.printf("%-16s%s\n", "App name:", name);
		System.out.printf("%-16s%s\n", "Creation date:", cr_date);
		System.out.printf("%-16s%s\n", "Author:", author);
	}
	
	public static String test_info(String a_name, int a_age, String a_date) {

		String a_sector = "Plannig and Design division / Construction Audit and Counceling";
		
		String output = String.format("Name: %s\nAge: %d\nDate: %s\nSector/Division: %s.", a_name, a_age, a_date, a_sector);
		return output;
	}
	
	// MAIN
	public static void main(String[] args) {
		
		// cls
		Funcl.cls();
		
		// START
		Funcl.start_info();
		
		nl();

	}
}
