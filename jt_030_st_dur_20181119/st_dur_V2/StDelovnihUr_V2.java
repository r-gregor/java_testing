// 20181014:	V1;
// 20181017:	V2:	Starting to add entities for Python version ...
//					String[] teden, HashMap<String, Integer> dni_v_mescu, ArrayList<String> mesci
//				...
//



import java.util.*;

public class StDelovnihUr_V2 {

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
		StDelovnihUr_V2 obj = new StDelovnihUr_V2();
		GetDateAsString dts = new GetDateAsString();
		String crdtm = dts.getDateTimeAsString();
		String usage = obj.getUsageString();

		System.out.printf("%n%s%n%s", crdtm, usage);

		
		
		// array day in a week (SLO) -- V2
		String[] teden = {"PO", "TO", "SR", "CE", "PE", "SO", "NE"};
		
		
		// map of month and days in a month (SLO) -- V2
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
		
		
		//ArrayList of months in a year from map dni_v_mescu -- V2
		ArrayList<String> mesci = new ArrayList<String>();
		for (Map.Entry<String, Integer> entry : dni_v_mescu.entrySet()) {
				String key = (String) entry.getKey();
				mesci.add(key);
		}
		
		
		// parameterized -- 1 
		mesec m1 = new mesec("Februar", 2);
		m1.display();
		
		// default
		mesec m2 = new mesec();
		m2.display();
		
		// parameterized -- 2 
		mesec m3 = new mesec("Avgust");
		m3.display();
	
		
	} //END MAIN

} //END CLASS


// NEW CLASS -- V2 -------------------------------------------------------
class mesec {
	
	String mesec;
	Integer zacetek;
	
	// parameterized constructor -- 1 month + start day
	public mesec(String m, Integer z) {
		this.mesec = m;
		this.zacetek = z;
	}
	
	// parameterized constructor 2 -- month only
	public mesec(String m) {
		this.mesec = m;
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

} // END class
