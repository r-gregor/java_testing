import func_list_en.*;
import java.util.*;

public class funcs_V3 {

	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("Using funcl trough an object instastiation ...");
		
		funcl jf = new funcl();
		String self_name = funcl.self_name;
		
		jf.crtc(80);
		System.out.printf("%s -- Starting %s ...\n", jf.tms(), self_name);
		jf.crtc(80);
		
		System.out.println();
		System.out.println("Printing start info from function funcl.start_info():");
		funcl.crtc(80);
		funcl.start_info();
		funcl.crtc(80);		
		
		System.out.println();
		System.out.println("Using funcl funcs directly by class_name.func_name ...");
		funcl.crtc(80);
		System.out.printf("%s -- Starting %s ...\n", jf.tms(), self_name);
		funcl.crtc(80);
		
		System.out.println();
		String[] names = {"java.class.path", "java.home", "java.vendor", "java.vendor.url", "java.version", "os.arch", "os.name", "os.version"};
		for (int i = 0; i < names.length; i++) {
			System.out.printf("%-18s %s\n", names[i] + ":", System.getProperty(names[i]));
		}
		
		System.out.println();
		System.getProperties().list(System.out);
		
		String crt = funcl.crtcs(80);
		funcl.prnts(crt);
		
	}

}
