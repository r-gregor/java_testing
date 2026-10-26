import java.util.*;
import java.util.List;
import java.util.Arrays.*;
import java.io.*;

public class MapExport_V2_d {

	public static void main(String[] args) throws IOException {
		Map<String, List<Integer>> camp = new HashMap<String, List<Integer>>();
		camp.put("parcela", Arrays.asList(70, 80));
		camp.put("odrasli", Arrays.asList(40, 50));
		camp.put("otroci", Arrays.asList(20, 25));
		camp.put("avto", Arrays.asList(20, 20));
		camp.put("elektrika", Arrays.asList(20, 20));

		// TEST PRINT 1
		System.out.println();
		System.out.println("Test print 1: HashMap entries to be exported to TXT file:");
		for (Map.Entry<String, List<Integer>> entry : camp.entrySet()) {
		    System.out.println(entry.getKey() + "," + entry.getValue().get(0) + "," + entry.getValue().get(1));
		}

		// EXPORT CONTENTS OF MAP TO TXT FILE
		String fname_out = "camp_out.txt";
		PrintWriter pw = new PrintWriter(new FileWriter(fname_out));
		for (Map.Entry<String, List<Integer>> entry : camp.entrySet()) {
			pw.printf("%s,%d,%d\n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
    	}
    	pw.close();

		System.out.println();
		System.out.printf("\"camp\" successfuly exported to \"%s\"!", fname_out);

		System.out.println();
		System.out.println("Done!");

	}

}
