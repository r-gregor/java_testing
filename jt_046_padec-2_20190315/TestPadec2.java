// filename: TestPadec2.java
import java.util.*;

public class TestPadec2 {
	// MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN
	/** main method */
	public static void main(String[] args) {
		System.out.println("[ Padec2] -- izracun padca");
		double param1;
		double param2;
		double param3;
		
		// if parameters to command supplied
		if (args.length == 3) {
			param1 = Double.parseDouble(args[0]);
			param2 = Double.parseDouble(args[1]);
			param3 = Double.parseDouble(args[2]);

		// else ask for them --> function: padec_ask
		} else {
			String[] my_params = Padec2.padec_ask();
			param1 = Double.parseDouble(my_params[0]);
			param2 = Double.parseDouble(my_params[1]);
			param3 = Double.parseDouble(my_params[2]);
		}
		
		Padec2 pdc1 = new Padec2(param1, param2, param3);
		double my_padec = pdc1.padec();
		String my_naklon = pdc1.padec_pr(my_padec);
			
		System.out.printf("Padec = %.6f%n", my_padec);
		System.out.printf("Padec = %s %%%n", my_naklon);
		
	} // end main
	// MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN
	
	
} // end class

