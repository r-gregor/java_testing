import java.util.ArrayList;

public class Seznami {


	public static void main(String[] args) {
		ArrayList<String> slo_mesta = new ArrayList<>();
		slo_mesta.add("Ljubljana");
		slo_mesta.add("Kranj");
		slo_mesta.add("Maribor");
		slo_mesta.add("Celje");
		slo_mesta.add("Ptuj");
		slo_mesta.add("Murska Sobota");
		slo_mesta.add("Nova Gorica");
		slo_mesta.add("Tolmin");

		// System.out.printf("Number of Cities in the list: %d.%n", slo_mesta.size());
		// System.out.printf("The Cities in the list: %s.%n", slo_mesta.toString());
		print_list(slo_mesta);

		System.out.println("Adding a city \"Novo Mesto\" to the list.");
		slo_mesta.add("Novo Mesto");
		print_list(slo_mesta);

		//TEST print
		System.out.println("\nTest:");
		System.out.printf("The Cities in the list: %s.%n", slo_mesta.toString());
		System.out.println();
	} // end main

	public static void print_list(ArrayList my_list) {
		int cn = my_list.size();
		System.out.printf("Number of Cities in the list: %d.%n", cn);

		System.out.println("The Cities in the list:");
		for (int i = 0; i < cn; i++) {
			if ((i + 1) % 4 == 0) {
				System.out.printf("%s,\n", my_list.get(i));
			} else {
				System.out.printf("%s, ", my_list.get(i));
			} // end if
		} // end for
		System.out.print("\n");
	} // end print_list


} // end class
