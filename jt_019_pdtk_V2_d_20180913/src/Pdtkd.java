
class Pdtkd {

	public static String my_Header = "Ime,Priimek,RD,EMSO,DS,PL,PL_do,ZZZS";

	public static String my_Data =
	"Ime,Priimek,RD,EMSO,DS,PL,PL_do,ZZZS\n" +
	"Spela,Redelonghi,2008-02-11,1102008505293,51275317,PB0491825,2016-04-07,048275498\n" +
	"Mark,Redelonghi,1999-04-17,1704999500073,24626180,PB0898323,2019-04-08,044752609\n" +
	"Zala,Redelonghi,1996-05-07,0705996505255,86319515,PB0572195,2017-03-22,043182009\n" +
	"Tadeja,Mali Redelonghi,1970-01-19,1901970505327,43936954,PB0572172,2022-03-22,035718997\n" +
	"Gregor,Redelonghi,1968-02-22,2202968500812,78402069,PB0572199,2022-03-22,035178605\n";

	public static String[] my_Data_array = my_Data.split("\n");
	public static int my_Data_rows_num = my_Data_array.length;
	public static int my_Data_flds_num = my_Data_array[0].split(",").length;
	public static String[] header = my_Header.split(",");
	public static int go = 0;

	// also in func_list class in local classpath!
	public static String capitalize(String word) {
		return Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
	}

	public static void print_header() {
		System.out.printf("%-12s%-20s%-12s%-17s%-10s%-11s%-12s%-11s\n", header[0], header[1], header[2], header[3], header[4], header[5], header[6], header[7]);
	}

	// check if name in my_Data_array --> return boolean
	public static boolean check_name(String name) {
		boolean go = false;
		for (String line : my_Data_array) {
			String[] row = line.split(",");
			if (row[0].equals(name)) {
				go = true;
				break;
			}
		}
		return go;
	} // END check_name

	// print out data od person in two columns --> field:  data
	public static void print_person(String name) {
		for (String line : my_Data_array) {
			String[] row = line.split(",");
			if (row[0].equals(name)) {
				System.out.printf("%-12s%s\n", header[0] + ":", row[0]);
				for (int i=1; i < row.length; i++) {
					System.out.printf("%-12s%s\n", header[i] + ":", row[i]);
				}
			}
		} //END for
	} // END print_person

	// print ALL data in tabular format
	public static void print_ALL() {
		for (int i=1; i < my_Data_array.length; i++) {
			String[] row = my_Data_array[i].split(",");
			System.out.printf("%-12s%-20s%-12s%-17s%-10s%-11s%-12s%-11s\n", row[0], row[1], row[2], row[3], row[4], row[5], row[6], row[7]);
			go++;
		}
	} // END print_ALL

	// MAIN
	public static void main(String[] args) {

		String name = null;

		if (args.length == 0) {
			name = "NONE";
		} else if (args.length > 1) {
			name = "NONE";
		} else {
			name = capitalize(args[0]);
		}

		System.out.println();
		// if name == ALL --> print all
		if (name.toUpperCase().equals("ALL")) {
			print_header();
			print_ALL();
		// if name of person in my_Data_array --> print person data
		} else if (check_name(name) != false) {
			print_person(name);
		} else {
			System.out.println("Something went wrong!");
			System.out.println("You have to supply a SINGLE name or all/ALL as parameter.");
		}

	} // END main

} // END class
