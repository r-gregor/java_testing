public class Main3 {

	// MAIN
	public static void main(String[] args) {
		
		Mem3[] mem_list = new Mem3[5];
		mem_list[0] = new Mem3("Tadeja", "Mali Redelonghi", 48);
		mem_list[1] = new Mem3("Gregor", "Redelonghi", 50);
		mem_list[2] = new Mem3("Spela", "Redelonghi", 10);
		
		for (int i = 0; i < mem_list.length; i++) {
			if (mem_list[i] != null) {
				Mem3 m = mem_list[i];
				System.out.printf("Name: %s%n", m.getName());
			}
		}
		
		System.out.printf("------------------------%n");
		for(Mem3 m : mem_list) {
			if (m != null) {
				System.out.printf(	"%-10s%s\n%-10s%s\n%-10s%d\n------------------------%n", 
									"Name:", m.getName(), 
									"Surname:", m.getSname(),
									"Age:", m.getAge());
			}
		}

	} // END MAIN

} // END class
