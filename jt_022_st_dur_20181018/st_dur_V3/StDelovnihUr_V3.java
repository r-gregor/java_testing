// 20181014:	V1;
// 20181017:	V2:	Starting to add entities for Python version ...
//					String[] teden, HashMap<String, Integer> dni_v_mescu, ArrayList<String> mesci
//				...
//
// 20181018:	v3: String m --> m.toLowerCase() (class mesec, m = parameter to cionstructor)
//					move String[] teden and HashMap<String, Integer> dni_v_mescu in class mesec



import java.util.*;

public class StDelovnihUr_V3 {

	private String getUsageString() {
		String usage1;
		String usage2;

		usage1 = "USAGE:\tprogramm-name [month name] [day in a week]";
		usage2 = "\n "+
		"\t- month name in SLO: januar, februar, marec, ..., December (any Case)\n" +
		"\t- day in a week must be a number:\n" +
		"\t	1 - Monday\n" +
		"\t	2 - Tuesday\n" +
		"\t	...\n" +
		"\t	7 - Sunday\n" +
		"\n" +
		"\tIf no argument supplied:\n" +
		"\t- month = januar\n" +
		"\t- day in a week = 1 (Monday)\n";

		String usage = usage1 + usage2;
		return usage;
	}


	//MAIN -----------------------------------
	public static void main(String[] args) {

		// TEST for usage -- V1
		System.out.printf("%s -- Starting ...\n", Tms.tms());
		StDelovnihUr_V3 obj = new StDelovnihUr_V3();
		GetDateAsString dts = new GetDateAsString();
		String crdtm = dts.getDateTimeAsString();
		String usage = obj.getUsageString();

		System.out.printf("%n%s%n%s", crdtm, usage);
		
		// parameterized -- 1 
		mesec m1 = new mesec("Februar", 2);
		m1.display();
		
		// default
		mesec m2 = new mesec();
		m2.display();
		
		// parameterized -- 2 
		mesec m3 = new mesec("Avgust");
		m3.display();
		
		System.out.println("\n" + "Real STUF: " + "\n");
		// simulation
		String my_month = "Avgust";
		int my_startDay = 5;
		
		System.out.println("\n" + "Both arguments suplied: month and start day:");
		mesec m4 = new mesec(my_month); m4.setZacetek(3); m4.displayUreNaMesecAll();
		mesec m5 = new mesec(my_month, my_startDay); m5.displayUreNaMesecAll();
		
		System.out.println("\n" + "Only month argument suplied:");
		mesec m6 = new mesec(my_month, 0); m6.displayUreNaMesec(); m6.displayMesec(my_month);
		
		System.out.println("\n" + "Else (display All):");
		// mesec m7 = new mesec(); m7.displayUreNaMesecAll(); //m6.displayAll();
		mesec m7 = new mesec(); m7.displayAll();
	
		
	} //END MAIN

} //END CLASS


// NEW CLASS -- V3 -------------------------------------------------------
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
		this.zacetek = z;
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
	
	public void display() {
		System.out.printf("Mesec: %s, in dan v tednu je:  = %d%n", this.mesec, this.zacetek);
	}

	
	// new methods -- V3
	public void setZacetek(int start){
		this.zacetek = start;
	}


	public String getMesec() {
		return this.mesec;
	}


	public int getZacetek() {
		return this.zacetek;
	}
		
		
	public int getStDni() {
		int dni = this.getDniVMescu().get(this.getMesec());
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
		
	
	// #######################################################################################################
	
	public void displayUreNaMesecAll() {
		/*
		function to print number of work hours per month given the
		start day
		*/
		System.out.printf("Mesec: %s, Stevilo dni: %d, ", this.getMesec(), this.getStDni());
		// print("Mesec: {}, Stevilo dni: {}".format(self.mesec, dni_v_mescu[self.mesec],), end = ", ")
		
		System.out.printf("Prvi dan: %s, Stevilo delovnih ur: %d%n", teden[this.getZacetek()], this.getUreNaMesec());
		// print("Prvi dan: {}, Stevilo delovnih ur: {}".format(teden[self.getZacetek()], self.getUreNaMesec()))
	}

	
	public void displayUreNaMesec() {
		/*
		function to print number of work hours per month given the
		start day
		*/
		
		System.out.printf("Prvi dan: %s, Stevilo delovnih ur: %d%n", teden[this.getZacetek()], this.getUreNaMesec());
		// print("Prvi dan: {}, Stevilo delovnih ur: {}".format(teden[self.getZacetek()], self.getUreNaMesec()))
	}
		


	public void displayMesec(String mesec) {
		this.mesec = mesec.toLowerCase();
		crt(80);
		System.out.printf("Mesec: %s, dni na mesec: %d%n", this.getMesec(), this.getStDni());
		
		for (int dan = 0; dan < 7; dan ++) {
			this.setZacetek(dan);
			this.displayUreNaMesec();
		}
		crt(80);
	}
		

	
	ArrayList<String> mymesci = this.getMesci();
	public void displayAll() {
		for (String item : mymesci) {
			// System.out.printf("Mesec: %s%n", item);
			System.out.printf("Mesec: %s, dni na mesec: %d%n", item, this.getDniVMescu().get(item));
			for (int dan = 0; dan < 7; dan ++) {
					this.setZacetek(dan);
					this.displayUreNaMesecAll();
				}
			crt(80);
		}

	}
	
		/*
		public void displayAll() {
			for (String item : this.getMesci()) {
				this.mesec = item.toLowerCase();
				System.out.printf("Mesec: s%", this.mesec);
				// System.out.printf("Mesec: %s, dni na mesec: %d", item, this.getStDni());
				System.out.printf("Mesec: %s, dni na mesec: %d", item, this.getStDni());

				for (int dan = 0; dan < 7; dan ++) {
					this.setZacetek(dan);
					this.displayUreNaMesecAll();
				}
				
			crt(80);
			
			}
		}
		*/
		

	
			
	// #######################################################################################################
		
		
	// new methods -- V3

} // END class
