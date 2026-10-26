import java.util.*;
import java.util.List;
import java.util.Arrays.*;
import java.io.*;

public class MapExport_V1_d {

	public static File savedHashMaps = new File("baza1_export_02.txt");

	public static void saveMaps(Map map) {
	    try {
	        ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream(savedHashMaps));
	        oos.writeObject(map);
	        oos.close();
			System.out.printf("Serialized HashMap data is saved in baza1_export_02.txt");
	    } catch (Exception e) {
	        // Catch exceptions
	    }
	}


	public static void main(String[] args) {
		Map<String, List<Integer>> baza1 = new HashMap<String, List<Integer>>();
		baza1.put("enota_1", Arrays.asList(12, 20));
		baza1.put("enota_2", Arrays.asList(40, 50));
		baza1.put("enota_3", Arrays.asList(70, 80));

		// TEST
		// System.out.println(baza1);
		// System.out.println(baza1.size());
		//System.out.printf("enota_2: nsez=%d, vsez=%d\n", baza1.get("enota_2").get(0), baza1.get("enota_2").get(1));


		// print ALL
		System.out.println();
		System.out.println("Test print 1: HashMap entries to be exported to TXT file:");
		for (int i = 1; i < baza1.size() + 1; i++) {
			System.out.printf("enota_%d: nsez=%d, vsez=%d\n", i, baza1.get("enota_" + i).get(0), baza1.get("enota_" + i).get(1));
		}
		
		/*
		 * // PRINT TO FILE:
		 * saveMaps(baza1);
		 */

		// TEST print
		System.out.println();
		System.out.println("Test print 2: HashMap entries to be exported to TXT file:");
		for (Map.Entry<String, List<Integer>> entry : baza1.entrySet()) {
		    System.out.println(entry.getKey() + "," + entry.getValue().get(0) + "," + entry.getValue().get(1));
		}

		/* TODO:
		 * for each as before to construct a line to bi outupt into an external TXT file
		 *
		 */



	}



}
