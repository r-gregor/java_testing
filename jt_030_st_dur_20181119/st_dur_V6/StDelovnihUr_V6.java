// 20181014:	V1;
// 20181017:	V2:	Starting to add entities for Python version ...
//					String[] teden, HashMap<String, Integer> dni_v_mescu, ArrayList<String> mesci
//				...
//
// 20181018:	V3: String m --> m.toLowerCase() (class mesec, m = parameter to cionstructor)
//					move String[] teden and HashMap<String, Integer> dni_v_mescu in class mesec
// 
// 20181018:	V4:	like final version only not yet user arguments supplied --> SIMULATION
// 20181119:	V5: Corrected start day as input {1 ... 7} -1 for correct index number (0 ... 6)
//					public void displayMesec(String mesec) {} --> public void displayMesec() {}
//					... gets String mesec from this.mesec!
// 20240131		V6: get user input
//

import java.util.*;

public class StDelovnihUr_V6 {
	String myProgramName = this.getClass().getName();

	private String getUsageString() {
		String usage1;
		String usage2;

		// V6
		// usage1 = "USAGE:\tprogramm-name [month name] [day in a week]";
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

		// V6
		// System.out.printf("%s -- Starting ...\n", Tms.tms());
		StDelovnihUr_V6 obj = new StDelovnihUr_V6();
		GetDateAsString dts = new GetDateAsString();
		//
		// V6
		// String crdtm = "[ " + dts.getDateTimeAsString() + " ]";
		String usage = obj.getUsageString();

		// V6
		String my_month = "";
		int my_startDay = 0;

		// V6
		if(args.length != 2) {
			System.out.printf("%n%s", usage);
			mesec m6 = new mesec("januar", 1);
			m6.displayUreNaMesecAll();
			// System.out.printf("Both arguments suplied: month (%s) and start day (%d):%n", my_month, my_startDay);
			System.exit(0);
		} else {
			my_month = args[0];
			my_startDay = Integer.valueOf(args[1]);
		}
		
		// System.out.printf("%s --\n", Tms.tms());
		System.out.printf("Both arguments suplied: month (%s) and start day (%d):%n", my_month, my_startDay);
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
	
	// new methods -- V3
	public void setZacetek(int sd){
		this.zacetek = sd - 1;
	}
	
		
	public int getStDni() {
		int dni = this.getDniVMescu().get(this.mesec);
		return dni;
	}
	

	public int getUreNaMesec() {
		int start = this.zacetek;
		int k = 1;
		int DD = 0;
		int dni = getStDni();
		while (k < dni) {
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

	
	public void displayUreNaMesecAll() {
		/*
		 * print month, days per month, start day of the week and number of work hours per month given the start day
		 */
		System.out.printf("Mesec: %s, Stevilo dni: %d, ", this.mesec, this.getStDni());
		// print("Mesec: {}, Stevilo dni: {}".format(self.mesec, dni_v_mescu[self.mesec],), end = ", ");
		
		System.out.printf("Prvi dan: %s, Stevilo delovnih ur: %d%n%n", teden[this.zacetek], this.getUreNaMesec());
		// print("Prvi dan: {}, Stevilo delovnih ur: {}".format(teden[self.zacetek], self.getUreNaMesec()));
	}

	public void displayUreNaMesec() {
		/*
		 * print start day of the week and number of work hours per month given the start day
		 */
		
		System.out.printf("Prvi dan: %s, Stevilo delovnih ur: %d%n", teden[this.zacetek], this.getUreNaMesec());
		// print("Prvi dan: {}, Stevilo delovnih ur: {}".format(teden[self.zacetek], self.getUreNaMesec()))
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
			// System.out.printf("Mesec: %s%n", item);
			System.out.printf("Mesec: %s, dni na mesec: %d%n", item, this.getDniVMescu().get(item));
			
			
			for (int dan = 1; dan < 8; dan ++) {
					this.setZacetek(dan);
					this.displayUreNaMesec();
				}
			
			crt(80);
		}

	}

	// #######################################################################################################

	// new methods -- V3

} // END class
