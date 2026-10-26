import java.util.Locale;

public class Loops {
	
	public static void crtc(int n) {
		n = 5 + 13 + 10 + 7 + 10;
		for (int i = 1; i < n + 1; i++) {
			System.out.print("-");
		} // end for
		System.out.println();
	} // end crtc
		
	// MAIN
	public static void main(String[] args) {
		
		// TESTS ---------------------------------------------------------------------------------------------
		// for displaying dot "." as decimal separator ...
		// Locale.setDefault(new Locale("en", "US"));
		
		// TEST 1 
		System.out.println("Locale test:");
		System.out.printf("%.2f: Default locale\n", 3.1415926535);
        System.out.printf(Locale.GERMANY, "%.2f: Germany locale\n", 3.1415926535);
        System.out.printf(Locale.US, "%.2f: US locale\n", 3.1415926535);
		System.out.println();
		
		// TEST 2
		Locale currentLocale = Locale.getDefault();
 
		System.out.println("currentLocale.getDisplayLanguage(): " + currentLocale.getDisplayLanguage());
		System.out.println("currentLocale.getDisplayCountry(): " + currentLocale.getDisplayCountry());
 
		System.out.println("currentLocale.getLanguage(): " + currentLocale.getLanguage());
		System.out.println("currentLocale.getCountry(): " + currentLocale.getCountry());
		
		System.out.println("System.getProperty(\"user.country\"): " + System.getProperty("user.country"));
		System.out.println("System.getProperty(\"user.language\")" + System.getProperty("user.language"));
		System.out.println();
		
		String mynum = "1532,478";
		System.out.println("String: " + mynum);
		Double dnum = Double.parseDouble(mynum.replace(",", "."));
		System.out.print("Double: " + dnum + "\n");
		// System.out.print(dnum);		
		System.out.println();
		
		// END TESTS -----------------------------------------------------------------------------------------
		
		
		System.out.println(
		"################################################################################################\n" +
		"From \"Introduction to JAVA programming\",\n" +
		"Page 192, Chapter 5: Loops, Programming Excersizes: 5.5\n"
		);
		
		int Nc = 4 + 11 + 11 + 11 + 13;
		System.out.printf("%-13s%7s  |  %-10s%10s%n", "Kilograms", "Pounds", "Pounds", "Kilograms");
		// System.out.println("--------------------------");
		crtc(Nc);
		float pnd2 = 20F;
		float kg1 = 1F;
		for (int kgs = 1; kgs < 201; kgs += 2) {
			float pnd1 = 2.2F * kg1;
			float kg2 = (1F/2.2F) * pnd2;
			
			if (kgs == 15) System.out.println("\n...\n");
			
			if (kgs < 15 || kgs > 180) {
				System.out.printf("%-13.0f%7.2f  |  %-10.2f%10.2f%n", kg1, pnd1, pnd2, kg2);
			}
			kg1 += 2;
			pnd2 += 5;
			
		} //end for
	} //end main
	
} // end class