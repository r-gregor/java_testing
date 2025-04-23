package app_name;

import app_name.pkg_name_1.App_1;
import app_name.pkg_name_2.App_2;
import app_name.common.func_list_en.Funcl;

//app_name.App_name

public class App_name {
	public static void main(String[] args) {
		
		Funcl.cls();
		Funcl.start_info();
		
		App_1 app1 = new App_1();
		app1.get_App_1_data();
		
		App_2 app2 = new App_2();
		app2.get_App_2_data();
		
		Funcl.crtc(80);
		String tech_line = app2.test_info("RgegoR 2", 50, "22.02.2019");
		System.out.println(tech_line);
	}
}
