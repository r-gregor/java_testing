public class Main2 {

	// MAIN
	public static void main(String[] args) {

		Object[] mem_list = new Object[3];
		mem_list[0] = new Mem2("Tadeja", "Mali Redelonghi", 48);
		String ime = (String)mem_list[0].getName();

		System.out.printf("Name: %s%n", new Mem2("Tadeja", "Mali Redelonghi", 48).getName());
	} // END MAIN

} // END class
