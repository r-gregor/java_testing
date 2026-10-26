// filename Padec2.java
import java.util.*;

public class Padec2 {
	
	double start_p;
	double end_p;
	double distance;
	
	/** default non-parameterized constructor */
	Padec2 () {
	}
	
	/** parameterized constructor */
	Padec2 (double start_p, double end_p, double distance) {
		this.start_p = start_p;
		this.end_p = end_p;
		this.distance = distance;
	}


	// FUNCTIONS ---------------------------------------------------------------------------------------------
	/** function padec returns naklon */
	public double padec() {
		double v_dist = this.end_p - this.start_p;
		double naklon = v_dist / this.distance;
		return naklon;
	}
	
	/** function padec_pr returns String padec that represents naklon in percentage */
	public String padec_pr(double naklon) {
		double padec_ratio = naklon * 100;
		// 
		String padec_pr = String.format("%.3f", padec_ratio);
		return padec_pr;
	}
	
	/** function to get parameters from user */
	public static String[] padec_ask() {
		String[] params = new String[3];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter start point, end point and distance: ");
		params[0] = input.next();
		params[1] = input.next();
		params[2] = input.next();
		
		return params;
	}
	// FUNCTIONS ---------------------------------------------------------------------------------------------


} // end class
