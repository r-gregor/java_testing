// 20181014:    V1;
// 20181017:    V2: Starting to add entities for Python version ...
//                  String[] teden, HashMap<String, Integer> dni_v_mescu, ArrayList<String> mesci
// ---
// 20181018:    V3: String m --> m.toLowerCase() (class mesec, m = parameter to cionstructor)
//                  move String[] teden and HashMap<String, Integer> dni_v_mescu in class mesec
// ---
// 20181018:    V4: like final version only not yet user arguments supplied --> SIMULATION
// 20181119:    V5: Corrected start day as input {1 ... 7} -1 for correct index number (0 ... 6)
//                  public void displayMesec(String mesec) {} --> public void displayMesec() {}
//                  ... gets String mesec from this.mesec!
// ---
// 20240131     V6: get user input,
//                  add +1 day if leap year
// ---

import java.util.*;

public class StDelovnihUr_V6 {
	String myProgramName = this.getClass().getName();
	int curryr = Tms.get_curryr(); // V6

	private String getUsageString() {
		String usage1;
		String usage2;

		// V6
		usage1 = String.format("USAGE:\t%s [month name] [day in a week]", myProgramName);
		usage2 = "\n "+
		"\t- month name in SLO: januar, februar, marec, ..., December (any Case)\n" +
		"\t- day in a week must be a number:\n" +
		"\t  1 - Monday\n" +
		"\t  2 - Tuesday\n" +
		"\t  ...\n" +
		"\t  7 - Sunday\n" +
		"\n" +
		"\tIf no argument supplied:\n" +
		"\t- month = januar\n" +
		"\t- day in a week = 1 (Monday)\n\n";

		String usage = usage1 + usage2;
		return usage;
	}


	//MAIN -----------------------------------
	public static void main(String[] args) {

		StDelovnihUr_V6 obj = new StDelovnihUr_V6();
		GetDateAsString dts = new GetDateAsString();

		// V6
		String my_month = "";
		int my_startDay = 0;

		// V6
		if(args.length != 2) {
			System.out.printf("%n%s", obj.getUsageString());
			mesec m6 = new mesec("januar", 1);
			m6.displayUreNaMesecAll();
			System.exit(0);
		} else {
			my_month = args[0];
			my_startDay = Integer.valueOf(args[1]);
		}
		
		mesec m6 = new mesec(my_month, my_startDay);
		m6.displayUreNaMesecAll();
		
	} //END MAIN
} //END CLASS


// NEW CLASS
class mesec {
	
	String mesec;
	Integer zacetek;
	
	// array day in a week (SLO) -- V2
	String[] teden = {"PO", "TO", "SR", "CE", "PE", "SO", "NE"};
		
	private void crt(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("-");
		}
		System.out.print("\n");
	}
	
	// map of month and days in a month (SLO) -- V2
	private Map<String, Integer> getDniVMescu() {
		Map<String, Integer> dni_v_mescu = new HashMap<String, Integer>();
		dni_v_mescu.put("januar", 31);
		dni_v_mescu.put("februar", 28);
		dni_v_mescu.put("marec", 31);
		dni_v_mescu.put("april", 30);
		dni_v_mescu.put("maj", 31);
		dni_v_mescu.put("junij", 30);
		dni_v_mescu.put("julij", 31);
		dni_v_mescu.put("avgust", 31);
		dni_v_mescu.put("september", 30);
		dni_v_mescu.put("oktober", 31);
		dni_v_mescu.put("november", 30);
		dni_v_mescu.put("december", 31);
		return dni_v_mescu;
	}
	
		
	//ArrayList of months in a year from map dni_v_mescu -- V2
	private ArrayList<String> getMesci() {
		ArrayList<String> mesci = new ArrayList<String>();
		for (Map.Entry<String, Integer> entry : this.getDniVMescu().entrySet()) {
			String key = (String) entry.getKey();
			mesci.add(key);
		}
		return mesci;
	}
	
	// parameterized constructor -- 1 month + start day
	public mesec(String m, Integer z) {
		this.mesec = m.toLowerCase();
		this.zacetek = z - 1;
	}
	
	/*
	// parameterized constructor 2 -- month only
	public mesec(String m) {
		this.mesec = m.toLowerCase();
		this.zacetek = 0;
	}
		
	// default constructor -- (no args)
	public mesec() {
		this.mesec = "Januar";
		this.zacetek = 0;
	}
	*/
	
	// new methods -- V3
	public void setZacetek(int sd){
		this.zacetek = sd - 1;
	}
	
		
	public int getStDni() {
		int curryr = Tms.get_curryr();
		final boolean isLeapYear = ((curryr % 4 == 0) && (curryr % 100 != 0) || (curryr % 400 == 0));
		int dni = this.getDniVMescu().get(this.mesec);

		if (this.mesec.toLowerCase().equals("februar") && isLeapYear) {
			dni += 1;
		}
		return dni;
	}
	

	public int getUreNaMesec() {
		int start = this.zacetek;
		int k = 1;
		int DD = 0;
		int dni = getStDni();
		// while (k < dni) {
		while (k <= dni) {                       // V6: <= --> correct num of days
			if (start > teden.length - 1) {
				start = 0;
			}
			
			if (teden[start] != "SO" && teden[start] != "NE") {
				DD +=1;
			}
			
			start += 1;
			k +=1;
		}
		int st_ur = DD * 8;
		return st_ur;
	}


		/*
		 * print month, days per month, start day of the week and number of work hours per month given the start day
		 */
	public void displayUreNaMesecAll() {
		System.out.printf("Mesec: %s, Stevilo dni: %d, ", this.mesec, this.getStDni());
		System.out.printf("Prvi dan: %s, Stevilo delovnih ur: %d%n%n", teden[this.zacetek], this.getUreNaMesec());
	}


		/*
		 * print start day of the week and number of work hours per month given the start day
		 */
	public void displayUreNaMesec() {
		System.out.printf("Prvi dan: %s, Stevilo delovnih ur: %d%n", teden[this.zacetek], this.getUreNaMesec());
	}


/* 	public void displayMesec(String mesec) {
		//
		// print month and days per month on one line and
		// start day of the week and number of work hours per month given the start day for each start day
		//
		String mymesec = mesec.toLowerCase();
		crt(80);
		System.out.printf("Mesec: %s, dni na mesec: %d%n", mymesec, this.getStDni());
		
		for (int dan = 1; dan < 8; dan ++) {
			this.setZacetek(dan);
			this.displayUreNaMesec();
		}
		crt(80);
	}
*/

	public void displayMesec() {
		//
		// print month and days per month on one line and
		// start day of the week and number of work hours per month given the start day for each start day
		//
		// String mymesec = mesec.toLowerCase();
		crt(80);
		System.out.printf("Mesec: %s, dni na mesec: %d%n", this.mesec, this.getStDni());
		
		for (int dan = 1; dan < 8; dan ++) {
			this.setZacetek(dan);
			this.displayUreNaMesec();
		}
		crt(80);
	}	


	public void displayAll() {
		/*
		print month and days per month on one line and
		start day of the week and number of work hours per month given the start day for each start day
		for all months in a year*/
		ArrayList<String> mymesci = this.getMesci();
		for (String item : mymesci) {
			this.mesec = item;
			System.out.printf("Mesec: %s, dni na mesec: %d%n", item, this.getDniVMescu().get(item));
			
			for (int dan = 1; dan < 8; dan ++) {
					this.setZacetek(dan);
					this.displayUreNaMesec();
				}
			
			crt(80);
		}

	}

} // END class

