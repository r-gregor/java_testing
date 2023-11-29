package pdtk;

public class Pdtk {
	
	public static String Head = "Ime,Priimek,Rojstvo,EMSO,DS,PL,PL-do,ZZZS";
	
	public static String All = 	"Spela,Redelonghi,2008-02-11,1102008505293,51275317,PB0491825,2016-04-07,048275498\n" +
								"Mark,Redelonghi,1999-04-17,1704999500073,24626180,PB0898323,2019-04-08,044752609\n" +
								"Zala,Redelonghi,1996-05-07,0705996505255,86319515,PB0572195,2017-03-22,043182009\n" +
								"Tadeja,Mali Redelonghi,1970-01-19,1901970505327,43936954,PB0572172,2022-03-22,035718997\n" +
								"Gregor,Redelonghi,1968-02-22,2202968500812,78402069,PB0572199,2022-03-22,035178605";
	

	
	public void print_items(String line) {
		String[] items = line.split(",");
		System.out.printf("%-8s%-17s%-12s%-15s%-10s%-12s%-11s\n",items[0],items[1],items[2],items[3],items[4],items[5],items[6],items[7]);
	}
	
	// public void getMemberInfo(String name, String field) {
	public String[] getMemberInfo(String name, String field) {
		String[] fields = Head.split(",");
		String[] members = All.split("\n");
		String nm = null;
		String fld = null;
		int fld_pos = 0;

		
		for (String line : members) {
			if (line.contains(name)) {
				nm = name;
			}
		}
		
		for (int i=0; i < fields.length; i++) {
			if (fields[i].equals(field)) {
				fld = fields[i];
				fld_pos = i;
			}
		}
		
		String fpos = Integer.toString(fld_pos);
	
		String[] data = {nm, fld, fpos};
	
		return data;
	}

	// MAIN
	public static void main(String[] args) {
		Pdtk pk = new Pdtk();
		String[] lines = All.split("\n");
			
		System.out.println();
		String my_name;
		String what;
		int fpos;
		
		
		if (args.length == 0 || args.length > 2) {
			my_name = "None";
			what = "None";
		} else if (args.length == 1) {
			my_name = args[0];
			what = "None";
		} else {
			my_name = args[0];
			what = args[1];
		}
		
				
		if (my_name != "None") {
			if (my_name.contains("All")) {
				// print all
				System.out.println();
				pk.print_items(Head);
				for (int i=0; i < lines.length; i++) {
					pk.print_items(lines[i]);
				}
			} else {
				System.out.println();
				pk.print_items(Head);
				int count = 0;
				for (String line : lines) {
					if (line.startsWith(my_name)) {
						pk.print_items(line);
						count++;
						break;
					}
				}
				if (count == 0) {
					System.out.printf("No member with name \"%s\" in database!\n", my_name);
				}
			}

		} else {
			System.out.printf("No member with name \"%s\" in database!\n", my_name);
		}
		
		String[] my_data = pk.getMemberInfo(my_name, what);
		String who = my_data[0];
		String field = my_data[1];
		String where = my_data[2];
		String[] fields = Head.split(",");
		int field_pos = Integer.parseInt(where);
		
		String a_field = fields[field_pos];
		String a_name = who;
		
		System.out.println();
		System.out.printf("Name: %s\n", a_name);
		System.out.printf("Field: %s\n", a_field);
		System.out.printf("Field position: %d\n", field_pos);
		
		
		System.out.println();
		System.out.printf("%-8s%-17s\n", "Ime", a_field);
		for (String line : lines) {
			if (line.startsWith(a_name)) {
				String[] items = line.split(",");
				System.out.printf("%-8s%-17s\n", a_name, items[field_pos]);
			}
		}



		
		
		

	
	} // END main
	

} // END class