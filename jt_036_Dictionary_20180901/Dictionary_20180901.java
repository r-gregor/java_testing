import java.util.*;

public class Dictionary_20180901 {

	// draw "-" N times in a row
	public static void crtice(int N) {
		for (int i = 0; i < N; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

	// function
	// Add L and H integers to tem list which will be the value to a key in Map
	public static void ListAdd(ArrayList<Integer> list, int L, int H) {
		int[] cena = {L, H};
		for (Integer N : cena) {
			list.add(N);
		}
	}

	public static void main(String[] args) {
		Map<String, ArrayList<Integer>> myMap = new HashMap<String, ArrayList<Integer>>();

		// declare lists for a value in Map
		ArrayList<Integer> parcela = new ArrayList<Integer>();
		ArrayList<Integer> odrasli = new ArrayList<Integer>();
		ArrayList<Integer> otroci = new ArrayList<Integer>();
		ArrayList<Integer> avto = new ArrayList<Integer>();
		ArrayList<Integer> elektrika = new ArrayList<Integer>();

		// insert L, H values in lists
		ListAdd(parcela, 70, 80);
		ListAdd(odrasli, 40, 50);
		ListAdd(otroci, 20, 25);
		ListAdd(avto, 20, 20);
		ListAdd(elektrika, 20, 20);

		// assign list as value to a key in Map
		myMap.put("Parcela", new ArrayList<Integer>(parcela));
		myMap.put("Odrasli", new ArrayList<Integer>(odrasli));
		myMap.put("Otroci", new ArrayList<Integer>(otroci));
		myMap.put("Avto", new ArrayList<Integer>(avto));
		myMap.put("Elektrika", new ArrayList<Integer>(elektrika));


		// test print Map
		// System.out.println(myMap);

		// list of keys
		String[] camp = {"Parcela", "Odrasli", "Otroci", "Avto", "Elektrika"};

		// print out data from Map
		System.out.println();
		System.out.printf("%-18s%10s%10s\n", "Camp - cena [HRK]", "Low", "High");
		crtice(38); // ---------------------------------------------------

		for (String K : camp) { 				// for each string in list "kat" as key to "myMap"
			Integer nsez = myMap.get(K).get(0); // get the "L" value
			Integer vsez = myMap.get(K).get(1);	// get the "H" value

			// formated print
			System.out.printf("%-18s%10s%10s\n", K, nsez.toString(), vsez.toString());
		}
	}

}
