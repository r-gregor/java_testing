import java.util.*;
import java.util.List;
import java.util.Arrays.*;
import java.io.*;

public class MapImport_V2_d {

	// crtice: draw "-" N times in a row ---------------------------------------
	public static void crtice(int N) {
		for (int i = 0; i < N; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

	public static void main(String[] args) throws IOException {

		String fname_in = "camp_in.txt";
		BufferedReader in = new BufferedReader(new FileReader(fname_in));
		String s;

		Map<String, List<Integer>> camp = new HashMap<String, List<Integer>>();

		while((s = in.readLine()) != null) {
			String[] var = s.split(",");
			String kategorija = var[0];
			Integer nsez = new Integer(var[1]);
			Integer vsez = new Integer(var[2]);
			camp.put(kategorija, Arrays.asList(nsez, vsez));
		}

		System.out.println(camp);

		// print out data from Map
		System.out.println();
		System.out.printf("%-18s%10s%10s\n", "Camp - cena [HRK]", "Low", "High");
		crtice(38); // ---------------------------------------------------
		for (Map.Entry<String, List<Integer>> entry : camp.entrySet()) {
			System.out.printf("%-18s%10d%10d\n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
		}

	}

}
